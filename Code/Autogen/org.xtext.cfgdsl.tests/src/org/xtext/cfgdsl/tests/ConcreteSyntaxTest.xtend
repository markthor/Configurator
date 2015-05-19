package org.xtext.cfgdsl.tests

import ConfiguratorPackage.BinaryConstraint
import ConfiguratorPackage.BinaryOperators
import ConfiguratorPackage.ConfiguratorPackagePackage
import ConfiguratorPackage.Root
import ConfiguratorPackage.Set
import ConfiguratorPackage.TypeEnum
import ConfiguratorPackage.impl.BinaryConstraintImpl
import ConfiguratorPackage.impl.IntegerValueImpl
import ConfiguratorPackage.impl.ParameterImpl
import ConfiguratorPackage.impl.StringValueImpl
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.cfgdsl.CfgDslInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CfgDslInjectorProvider))
class ConcreteSyntaxTest {
	@Inject extension ParseHelper<Root>;
	
	@Test
	def void testParsing1() {
		ConfiguratorPackagePackage.eINSTANCE.eClass()
		val model = '''
		boolean b1 = true
		boolean b2 = true
		bc true e b1 == b2
		'''.parse;
		
		// Asserts
		val myModel = model
		Assert::assertEquals("b1", myModel.expressions.get(0).name)
		Assert::assertEquals("b2", myModel.expressions.get(1).name)
		Assert::assertEquals("e", myModel.expressions.get(2).name)
		Assert::assertEquals(BinaryConstraintImpl, myModel.expressions.get(2).class)
		val bc = myModel.expressions.get(2) as BinaryConstraint
		Assert::assertEquals("b1", bc.left.name)
		Assert::assertEquals("b2", bc.right.name)
		Assert::assertEquals(BinaryOperators.EQUAL, bc.operator)
	}
	
		@Test
	def void testParsing2() {
		ConfiguratorPackagePackage.eINSTANCE.eClass()
		val model = '''
		int i1 = 5
		int i2 = 7
		int product = 35
		bc calculatedProduct i1 * i2
		bc true e calculatedProduct == product
		'''.parse;
		
		// Asserts
		val myModel = model
		Assert::assertEquals("i1", myModel.expressions.get(0).name)
		Assert::assertEquals("i2", myModel.expressions.get(1).name)
		Assert::assertEquals("product", myModel.expressions.get(2).name)
		Assert::assertEquals(IntegerValueImpl, myModel.expressions.get(0).class)
		val bc1 = myModel.expressions.get(3) as BinaryConstraint
		Assert::assertEquals("i1", bc1.left.name)
		Assert::assertEquals("i2", bc1.right.name)
		Assert::assertEquals(BinaryOperators.MULTIPLICATION, bc1.operator)
		val bc2 = myModel.expressions.get(4) as BinaryConstraint
		Assert::assertEquals("calculatedProduct", bc2.left.name)
		Assert::assertEquals("product", bc2.right.name)
		Assert::assertEquals(BinaryOperators.EQUAL, bc2.operator)
	}
	
			@Test
	def void testParsing3() {
		ConfiguratorPackagePackage.eINSTANCE.eClass()
		val model = '''
		string color
		string black = "black"
		string yellow = "yellow"
		string green = "green"
		string blue = "blue"
		
		set colors = [black, yellow, green, blue]
		
		bc true isAValidColor color subset colors
		'''.parse;
		
		// Asserts
		val myModel = model
		Assert::assertEquals("color", myModel.expressions.get(0).name)
		Assert::assertEquals("black", myModel.expressions.get(1).name)
		Assert::assertEquals("yellow", myModel.expressions.get(2).name)
		Assert::assertEquals("green", myModel.expressions.get(3).name)
		Assert::assertEquals("blue", myModel.expressions.get(4).name)
		Assert::assertEquals("colors", myModel.expressions.get(5).name)
		Assert::assertEquals("isAValidColor", myModel.expressions.get(6).name)
		Assert::assertEquals(ParameterImpl, myModel.expressions.get(0).class)
		Assert::assertEquals(StringValueImpl, myModel.expressions.get(1).class)
		val p1 = myModel.expressions.get(0) as ParameterImpl
		Assert::assertEquals(TypeEnum.STRING_TYPE ,p1.type)
		val v1 = myModel.expressions.get(1) as StringValueImpl
		Assert::assertEquals(TypeEnum.STRING_TYPE, v1.type)
		val bc1 = myModel.expressions.get(6) as BinaryConstraint
		Assert::assertEquals("color", bc1.left.name)
		Assert::assertEquals("colors", bc1.right.name)
		Assert::assertEquals(BinaryOperators.SUBSET, bc1.operator)
		val set = myModel.expressions.get(5) as Set
		Assert::assertEquals("black", set.has.get(0).name)
		Assert::assertEquals("yellow", set.has.get(1).name)
		Assert::assertEquals("green", set.has.get(2).name)
		Assert::assertEquals("blue", set.has.get(3).name)
	}
}