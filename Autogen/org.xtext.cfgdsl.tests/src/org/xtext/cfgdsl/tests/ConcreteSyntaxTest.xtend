package org.xtext.cfgdsl.tests

import ConfiguratorPackage.BinaryConstraint
import ConfiguratorPackage.BinaryOperators
import ConfiguratorPackage.ConfiguratorPackagePackage
import ConfiguratorPackage.Root
import ConfiguratorPackage.impl.BinaryConstraintImpl
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
	def void testParsing() {
		ConfiguratorPackagePackage.eINSTANCE.eClass()
		val model = '''
		boolean b1 = true
		boolean b2 = true
		bc true e b1 == b2
		'''.parse;
		
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
}