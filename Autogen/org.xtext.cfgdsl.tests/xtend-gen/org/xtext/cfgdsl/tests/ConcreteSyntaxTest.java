package org.xtext.cfgdsl.tests;

import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BinaryOperators;
import ConfiguratorPackage.ConfiguratorPackagePackage;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.Root;
import ConfiguratorPackage.impl.BinaryConstraintImpl;
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
  public void testParsing() {
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
}
