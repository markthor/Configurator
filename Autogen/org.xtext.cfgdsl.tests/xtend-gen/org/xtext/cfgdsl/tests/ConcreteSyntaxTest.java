package org.xtext.cfgdsl.tests;

import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BinaryOperators;
import ConfiguratorPackage.ConfiguratorPackagePackage;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.Root;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.Value;
import ConfiguratorPackage.impl.BinaryConstraintImpl;
import ConfiguratorPackage.impl.IntegerValueImpl;
import ConfiguratorPackage.impl.ParameterImpl;
import ConfiguratorPackage.impl.StringValueImpl;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.cfgdsl.CfgDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(CfgDslInjectorProvider.class)
@SuppressWarnings("all")
public class ConcreteSyntaxTest {
  @Inject
  @Extension
  private ParseHelper<Root> _parseHelper;
  
  @Test
  public void testParsing1() {
    try {
      ConfiguratorPackagePackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("boolean b1 = true");
      _builder.newLine();
      _builder.append("boolean b2 = true");
      _builder.newLine();
      _builder.append("bc true e b1 == b2");
      _builder.newLine();
      final Root model = this._parseHelper.parse(_builder);
      final Root myModel = model;
      EList<Expression> _expressions = myModel.getExpressions();
      Expression _get = _expressions.get(0);
      String _name = _get.getName();
      Assert.assertEquals("b1", _name);
      EList<Expression> _expressions_1 = myModel.getExpressions();
      Expression _get_1 = _expressions_1.get(1);
      String _name_1 = _get_1.getName();
      Assert.assertEquals("b2", _name_1);
      EList<Expression> _expressions_2 = myModel.getExpressions();
      Expression _get_2 = _expressions_2.get(2);
      String _name_2 = _get_2.getName();
      Assert.assertEquals("e", _name_2);
      EList<Expression> _expressions_3 = myModel.getExpressions();
      Expression _get_3 = _expressions_3.get(2);
      Class<? extends Expression> _class = _get_3.getClass();
      Assert.assertEquals(BinaryConstraintImpl.class, _class);
      EList<Expression> _expressions_4 = myModel.getExpressions();
      Expression _get_4 = _expressions_4.get(2);
      final BinaryConstraint bc = ((BinaryConstraint) _get_4);
      Expression _left = bc.getLeft();
      String _name_3 = _left.getName();
      Assert.assertEquals("b1", _name_3);
      Expression _right = bc.getRight();
      String _name_4 = _right.getName();
      Assert.assertEquals("b2", _name_4);
      BinaryOperators _operator = bc.getOperator();
      Assert.assertEquals(BinaryOperators.EQUAL, _operator);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsing2() {
    try {
      ConfiguratorPackagePackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("int i1 = 5");
      _builder.newLine();
      _builder.append("int i2 = 7");
      _builder.newLine();
      _builder.append("int product = 35");
      _builder.newLine();
      _builder.append("bc calculatedProduct i1 * i2");
      _builder.newLine();
      _builder.append("bc true e calculatedProduct == product");
      _builder.newLine();
      final Root model = this._parseHelper.parse(_builder);
      final Root myModel = model;
      EList<Expression> _expressions = myModel.getExpressions();
      Expression _get = _expressions.get(0);
      String _name = _get.getName();
      Assert.assertEquals("i1", _name);
      EList<Expression> _expressions_1 = myModel.getExpressions();
      Expression _get_1 = _expressions_1.get(1);
      String _name_1 = _get_1.getName();
      Assert.assertEquals("i2", _name_1);
      EList<Expression> _expressions_2 = myModel.getExpressions();
      Expression _get_2 = _expressions_2.get(2);
      String _name_2 = _get_2.getName();
      Assert.assertEquals("product", _name_2);
      EList<Expression> _expressions_3 = myModel.getExpressions();
      Expression _get_3 = _expressions_3.get(0);
      Class<? extends Expression> _class = _get_3.getClass();
      Assert.assertEquals(IntegerValueImpl.class, _class);
      EList<Expression> _expressions_4 = myModel.getExpressions();
      Expression _get_4 = _expressions_4.get(3);
      final BinaryConstraint bc1 = ((BinaryConstraint) _get_4);
      Expression _left = bc1.getLeft();
      String _name_3 = _left.getName();
      Assert.assertEquals("i1", _name_3);
      Expression _right = bc1.getRight();
      String _name_4 = _right.getName();
      Assert.assertEquals("i2", _name_4);
      BinaryOperators _operator = bc1.getOperator();
      Assert.assertEquals(BinaryOperators.MULTIPLICATION, _operator);
      EList<Expression> _expressions_5 = myModel.getExpressions();
      Expression _get_5 = _expressions_5.get(4);
      final BinaryConstraint bc2 = ((BinaryConstraint) _get_5);
      Expression _left_1 = bc2.getLeft();
      String _name_5 = _left_1.getName();
      Assert.assertEquals("calculatedProduct", _name_5);
      Expression _right_1 = bc2.getRight();
      String _name_6 = _right_1.getName();
      Assert.assertEquals("product", _name_6);
      BinaryOperators _operator_1 = bc2.getOperator();
      Assert.assertEquals(BinaryOperators.EQUAL, _operator_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsing3() {
    try {
      ConfiguratorPackagePackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("string color");
      _builder.newLine();
      _builder.append("string black = \"black\"");
      _builder.newLine();
      _builder.append("string yellow = \"yellow\"");
      _builder.newLine();
      _builder.append("string green = \"green\"");
      _builder.newLine();
      _builder.append("string blue = \"blue\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("set colors = [black, yellow, green, blue]");
      _builder.newLine();
      _builder.newLine();
      _builder.append("bc true isAValidColor color subset colors");
      _builder.newLine();
      final Root model = this._parseHelper.parse(_builder);
      final Root myModel = model;
      EList<Expression> _expressions = myModel.getExpressions();
      Expression _get = _expressions.get(0);
      String _name = _get.getName();
      Assert.assertEquals("color", _name);
      EList<Expression> _expressions_1 = myModel.getExpressions();
      Expression _get_1 = _expressions_1.get(1);
      String _name_1 = _get_1.getName();
      Assert.assertEquals("black", _name_1);
      EList<Expression> _expressions_2 = myModel.getExpressions();
      Expression _get_2 = _expressions_2.get(2);
      String _name_2 = _get_2.getName();
      Assert.assertEquals("yellow", _name_2);
      EList<Expression> _expressions_3 = myModel.getExpressions();
      Expression _get_3 = _expressions_3.get(3);
      String _name_3 = _get_3.getName();
      Assert.assertEquals("green", _name_3);
      EList<Expression> _expressions_4 = myModel.getExpressions();
      Expression _get_4 = _expressions_4.get(4);
      String _name_4 = _get_4.getName();
      Assert.assertEquals("blue", _name_4);
      EList<Expression> _expressions_5 = myModel.getExpressions();
      Expression _get_5 = _expressions_5.get(5);
      String _name_5 = _get_5.getName();
      Assert.assertEquals("colors", _name_5);
      EList<Expression> _expressions_6 = myModel.getExpressions();
      Expression _get_6 = _expressions_6.get(6);
      String _name_6 = _get_6.getName();
      Assert.assertEquals("isAValidColor", _name_6);
      EList<Expression> _expressions_7 = myModel.getExpressions();
      Expression _get_7 = _expressions_7.get(0);
      Class<? extends Expression> _class = _get_7.getClass();
      Assert.assertEquals(ParameterImpl.class, _class);
      EList<Expression> _expressions_8 = myModel.getExpressions();
      Expression _get_8 = _expressions_8.get(1);
      Class<? extends Expression> _class_1 = _get_8.getClass();
      Assert.assertEquals(StringValueImpl.class, _class_1);
      EList<Expression> _expressions_9 = myModel.getExpressions();
      Expression _get_9 = _expressions_9.get(0);
      final ParameterImpl p1 = ((ParameterImpl) _get_9);
      TypeEnum _type = p1.getType();
      Assert.assertEquals(TypeEnum.STRING_TYPE, _type);
      EList<Expression> _expressions_10 = myModel.getExpressions();
      Expression _get_10 = _expressions_10.get(1);
      final StringValueImpl v1 = ((StringValueImpl) _get_10);
      TypeEnum _type_1 = v1.getType();
      Assert.assertEquals(TypeEnum.STRING_TYPE, _type_1);
      EList<Expression> _expressions_11 = myModel.getExpressions();
      Expression _get_11 = _expressions_11.get(6);
      final BinaryConstraint bc1 = ((BinaryConstraint) _get_11);
      Expression _left = bc1.getLeft();
      String _name_7 = _left.getName();
      Assert.assertEquals("color", _name_7);
      Expression _right = bc1.getRight();
      String _name_8 = _right.getName();
      Assert.assertEquals("colors", _name_8);
      BinaryOperators _operator = bc1.getOperator();
      Assert.assertEquals(BinaryOperators.SUBSET, _operator);
      EList<Expression> _expressions_12 = myModel.getExpressions();
      Expression _get_12 = _expressions_12.get(5);
      final Set set = ((Set) _get_12);
      EList<Value> _has = set.getHas();
      Value _get_13 = _has.get(0);
      String _name_9 = _get_13.getName();
      Assert.assertEquals("black", _name_9);
      EList<Value> _has_1 = set.getHas();
      Value _get_14 = _has_1.get(1);
      String _name_10 = _get_14.getName();
      Assert.assertEquals("yellow", _name_10);
      EList<Value> _has_2 = set.getHas();
      Value _get_15 = _has_2.get(2);
      String _name_11 = _get_15.getName();
      Assert.assertEquals("green", _name_11);
      EList<Value> _has_3 = set.getHas();
      Value _get_16 = _has_3.get(3);
      String _name_12 = _get_16.getName();
      Assert.assertEquals("blue", _name_12);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
