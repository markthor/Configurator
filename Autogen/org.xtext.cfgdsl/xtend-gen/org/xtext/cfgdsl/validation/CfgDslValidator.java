/**
 * generated by Xtext
 */
package org.xtext.cfgdsl.validation;

import ConfiguratorPackage.Assignment;
import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BinaryOperators;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.Configuration;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Root;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.Value;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.cfgdsl.validation.AbstractCfgDslValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class CfgDslValidator extends AbstractCfgDslValidator {
  /**
   * Fall back for all types that are not constrained
   */
  protected static boolean _constraint(final EObject it) {
    return true;
  }
  
  protected static boolean _constraint(final Root it) {
    boolean _and = false;
    boolean _constraintAssignment = CfgDslValidator.constraintAssignment(it);
    if (!_constraintAssignment) {
      _and = false;
    } else {
      boolean _constraintParams = CfgDslValidator.constraintParams(it);
      _and = _constraintParams;
    }
    return _and;
  }
  
  protected static boolean _constraint(final Configuration it) {
    return CfgDslValidator.constraintOneAssignmentPerParameter(it);
  }
  
  protected static boolean _constraint(final Set it) {
    return CfgDslValidator.constraintSet(it);
  }
  
  protected static boolean _constraint(final BinaryConstraint it) {
    boolean _and = false;
    boolean _constraintBinary = CfgDslValidator.constraintBinary(it);
    if (!_constraintBinary) {
      _and = false;
    } else {
      boolean _constraintBinaryRoot = CfgDslValidator.constraintBinaryRoot(it);
      _and = _constraintBinaryRoot;
    }
    return _and;
  }
  
  protected static boolean _constraint(final UnaryConstraint it) {
    return CfgDslValidator.constraintUnary(it);
  }
  
  protected static boolean _constraint(final Value it) {
    return CfgDslValidator.constraintValueType(it);
  }
  
  protected static boolean _constraint(final Parameter it) {
    boolean _and = false;
    boolean _and_1 = false;
    TypeEnum _type = it.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (!_notEquals) {
      _and_1 = false;
    } else {
      String _name = it.getName();
      boolean _notEquals_1 = (!Objects.equal(_name, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _name_1 = it.getName();
      boolean _isEmpty = _name_1.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    return _and;
  }
  
  /**
   * Check for unique parameters in the root element.
   * If the sizes of the params and unique params are not the same
   * we have duplicate entries
   */
  public static boolean constraintParams(final Root it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintParams");
      EList<Expression> _expressions = it.getExpressions();
      final Function1<Expression, Boolean> _function = new Function1<Expression, Boolean>() {
        public Boolean apply(final Expression e) {
          return Boolean.valueOf((e instanceof Parameter));
        }
      };
      final Iterable<Expression> params = IterableExtensions.<Expression>filter(_expressions, _function);
      HashSet<String> _hashSet = new HashSet<String>();
      final Function2<HashSet<String>, Expression, HashSet<String>> _function_1 = new Function2<HashSet<String>, Expression, HashSet<String>>() {
        public HashSet<String> apply(final HashSet<String> s, final Expression e) {
          HashSet<String> _xblockexpression = null;
          {
            String _name = e.getName();
            s.add(_name);
            _xblockexpression = s;
          }
          return _xblockexpression;
        }
      };
      final HashSet<String> uniqueParams = IterableExtensions.<Expression, HashSet<String>>fold(params, _hashSet, _function_1);
      int _size = IterableExtensions.size(params);
      int _size_1 = uniqueParams.size();
      final boolean b = (_size == _size_1);
      InputOutput.<String>println(("Done with constraintParams. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  /**
   * Check that the value of each assignment has the correct type according to the assigned type of the parameter
   */
  public static boolean constraintAssignment(final Root it) {
    boolean _xblockexpression = false;
    {
      EList<Expression> _expressions = it.getExpressions();
      final Function1<Expression, Boolean> _function = new Function1<Expression, Boolean>() {
        public Boolean apply(final Expression e) {
          return Boolean.valueOf((e instanceof Parameter));
        }
      };
      final Iterable<Expression> params = IterableExtensions.<Expression>filter(_expressions, _function);
      HashMap<String, TypeEnum> _hashMap = new HashMap<String, TypeEnum>();
      final Function2<HashMap<String, TypeEnum>, Expression, HashMap<String, TypeEnum>> _function_1 = new Function2<HashMap<String, TypeEnum>, Expression, HashMap<String, TypeEnum>>() {
        public HashMap<String, TypeEnum> apply(final HashMap<String, TypeEnum> m, final Expression e) {
          HashMap<String, TypeEnum> _xblockexpression = null;
          {
            final Parameter p = ((Parameter) e);
            String _name = p.getName();
            TypeEnum _type = p.getType();
            m.put(_name, _type);
            _xblockexpression = m;
          }
          return _xblockexpression;
        }
      };
      final HashMap<String, TypeEnum> typeMap = IterableExtensions.<Expression, HashMap<String, TypeEnum>>fold(params, _hashMap, _function_1);
      EList<Configuration> _configurators = it.getConfigurators();
      final Function1<Configuration, Boolean> _function_2 = new Function1<Configuration, Boolean>() {
        public Boolean apply(final Configuration c) {
          boolean _xblockexpression = false;
          {
            EList<Assignment> _assignments = c.getAssignments();
            final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
              public Boolean apply(final Assignment a) {
                Value _value = a.getValue();
                return Boolean.valueOf((_value instanceof StringValue));
              }
            };
            final Iterable<Assignment> strings = IterableExtensions.<Assignment>filter(_assignments, _function);
            EList<Assignment> _assignments_1 = c.getAssignments();
            final Function1<Assignment, Boolean> _function_1 = new Function1<Assignment, Boolean>() {
              public Boolean apply(final Assignment a) {
                Value _value = a.getValue();
                return Boolean.valueOf((_value instanceof IntegerValue));
              }
            };
            final Iterable<Assignment> integers = IterableExtensions.<Assignment>filter(_assignments_1, _function_1);
            EList<Assignment> _assignments_2 = c.getAssignments();
            final Function1<Assignment, Boolean> _function_2 = new Function1<Assignment, Boolean>() {
              public Boolean apply(final Assignment a) {
                Value _value = a.getValue();
                return Boolean.valueOf((_value instanceof BooleanValue));
              }
            };
            final Iterable<Assignment> booleans = IterableExtensions.<Assignment>filter(_assignments_2, _function_2);
            final Function2<Boolean, Assignment, Boolean> _function_3 = new Function2<Boolean, Assignment, Boolean>() {
              public Boolean apply(final Boolean b, final Assignment a) {
                boolean _and = false;
                if (!(b).booleanValue()) {
                  _and = false;
                } else {
                  Parameter _parameter = a.getParameter();
                  String _name = _parameter.getName();
                  TypeEnum _get = typeMap.get(_name);
                  boolean _equals = TypeEnum.STRING_TYPE.equals(_get);
                  _and = _equals;
                }
                return Boolean.valueOf(_and);
              }
            };
            final Boolean stringsSatisfied = IterableExtensions.<Assignment, Boolean>fold(strings, Boolean.valueOf(true), _function_3);
            final Function2<Boolean, Assignment, Boolean> _function_4 = new Function2<Boolean, Assignment, Boolean>() {
              public Boolean apply(final Boolean b, final Assignment a) {
                boolean _and = false;
                if (!(b).booleanValue()) {
                  _and = false;
                } else {
                  Parameter _parameter = a.getParameter();
                  String _name = _parameter.getName();
                  TypeEnum _get = typeMap.get(_name);
                  boolean _equals = TypeEnum.INTEGER_TYPE.equals(_get);
                  _and = _equals;
                }
                return Boolean.valueOf(_and);
              }
            };
            final Boolean integersSatisfied = IterableExtensions.<Assignment, Boolean>fold(integers, Boolean.valueOf(true), _function_4);
            final Function2<Boolean, Assignment, Boolean> _function_5 = new Function2<Boolean, Assignment, Boolean>() {
              public Boolean apply(final Boolean b, final Assignment a) {
                boolean _and = false;
                if (!(b).booleanValue()) {
                  _and = false;
                } else {
                  Parameter _parameter = a.getParameter();
                  String _name = _parameter.getName();
                  TypeEnum _get = typeMap.get(_name);
                  boolean _equals = TypeEnum.BOOLEAN_TYPE.equals(_get);
                  _and = _equals;
                }
                return Boolean.valueOf(_and);
              }
            };
            final Boolean booleansSatisfied = IterableExtensions.<Assignment, Boolean>fold(booleans, Boolean.valueOf(true), _function_5);
            boolean _and = false;
            if (!((stringsSatisfied).booleanValue() && (integersSatisfied).booleanValue())) {
              _and = false;
            } else {
              _and = (booleansSatisfied).booleanValue();
            }
            _xblockexpression = _and;
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      _xblockexpression = IterableExtensions.<Configuration>forall(_configurators, _function_2);
    }
    return _xblockexpression;
  }
  
  public static boolean constraintValueType(final Value it) {
    if ((it instanceof IntegerValue)) {
      final IntegerValue i = ((IntegerValue) it);
      TypeEnum _type = i.getType();
      return TypeEnum.INTEGER_TYPE.equals(_type);
    }
    if ((it instanceof StringValue)) {
      final StringValue i_1 = ((StringValue) it);
      TypeEnum _type_1 = i_1.getType();
      return TypeEnum.STRING_TYPE.equals(_type_1);
    }
    if ((it instanceof BooleanValue)) {
      final BooleanValue i_2 = ((BooleanValue) it);
      TypeEnum _type_2 = i_2.getType();
      return TypeEnum.BOOLEAN_TYPE.equals(_type_2);
    }
    return false;
  }
  
  /**
   * Check for unique parameters in a given configuration
   */
  public static boolean constraintOneAssignmentPerParameter(final Configuration it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintOneAssignmentPerParameter");
      EList<Assignment> _assignments = it.getAssignments();
      final Function1<Assignment, Boolean> _function = new Function1<Assignment, Boolean>() {
        public Boolean apply(final Assignment a) {
          boolean _or = false;
          Parameter _parameter = a.getParameter();
          boolean _equals = Objects.equal(_parameter, null);
          if (_equals) {
            _or = true;
          } else {
            Value _value = a.getValue();
            boolean _equals_1 = Objects.equal(_value, null);
            _or = _equals_1;
          }
          return Boolean.valueOf(_or);
        }
      };
      final Iterable<Assignment> list = IterableExtensions.<Assignment>filter(_assignments, _function);
      int _size = IterableExtensions.size(list);
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        return false;
      }
      EList<Assignment> _assignments_1 = it.getAssignments();
      final Function2<Boolean, Assignment, Boolean> _function_1 = new Function2<Boolean, Assignment, Boolean>() {
        public Boolean apply(final Boolean b, final Assignment a) {
          boolean _xblockexpression = false;
          {
            Parameter _parameter = a.getParameter();
            final Parameter p = ((Parameter) _parameter);
            boolean _and = false;
            if (!(b).booleanValue()) {
              _and = false;
            } else {
              boolean _constraint = CfgDslValidator.constraint(p);
              _and = _constraint;
            }
            _xblockexpression = _and;
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      Boolean _fold = IterableExtensions.<Assignment, Boolean>fold(_assignments_1, Boolean.valueOf(true), _function_1);
      boolean _not = (!(_fold).booleanValue());
      if (_not) {
        return false;
      }
      EList<Assignment> _assignments_2 = it.getAssignments();
      HashSet<String> _hashSet = new HashSet<String>();
      final Function2<HashSet<String>, Assignment, HashSet<String>> _function_2 = new Function2<HashSet<String>, Assignment, HashSet<String>>() {
        public HashSet<String> apply(final HashSet<String> s, final Assignment a) {
          HashSet<String> _xblockexpression = null;
          {
            Parameter _parameter = a.getParameter();
            String _name = _parameter.getName();
            s.add(_name);
            _xblockexpression = s;
          }
          return _xblockexpression;
        }
      };
      final HashSet<String> uniqueParams = IterableExtensions.<Assignment, HashSet<String>>fold(_assignments_2, _hashSet, _function_2);
      int _size_1 = uniqueParams.size();
      EList<Assignment> _assignments_3 = it.getAssignments();
      int _size_2 = _assignments_3.size();
      final boolean b = (_size_1 == _size_2);
      InputOutput.<String>println(("Done with constraintOneAssignmentPerParameter. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  /**
   * Check that the types of BinaryConstraints are good
   */
  public static boolean constraintBinary(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintBinary");
      boolean b = false;
      BinaryOperators _operator = it.getOperator();
      if (_operator != null) {
        switch (_operator) {
          case ADDITION:
            boolean _and = false;
            Expression _left = it.getLeft();
            TypeEnum _valueResolver = CfgDslValidator.valueResolver(_left);
            boolean _equals = _valueResolver.equals(TypeEnum.INTEGER_TYPE);
            if (!_equals) {
              _and = false;
            } else {
              Expression _right = it.getRight();
              TypeEnum _valueResolver_1 = CfgDslValidator.valueResolver(_right);
              boolean _equals_1 = _valueResolver_1.equals(TypeEnum.INTEGER_TYPE);
              _and = _equals_1;
            }
            b = _and;
            break;
          case AND:
            boolean _and_1 = false;
            Expression _left_1 = it.getLeft();
            TypeEnum _valueResolver_2 = CfgDslValidator.valueResolver(_left_1);
            boolean _equals_2 = _valueResolver_2.equals(TypeEnum.BOOLEAN_TYPE);
            if (!_equals_2) {
              _and_1 = false;
            } else {
              Expression _right_1 = it.getRight();
              TypeEnum _valueResolver_3 = CfgDslValidator.valueResolver(_right_1);
              boolean _equals_3 = _valueResolver_3.equals(TypeEnum.BOOLEAN_TYPE);
              _and_1 = _equals_3;
            }
            b = _and_1;
            break;
          case EQUAL:
            Expression _left_2 = it.getLeft();
            TypeEnum _valueResolver_4 = CfgDslValidator.valueResolver(_left_2);
            Expression _right_2 = it.getRight();
            TypeEnum _valueResolver_5 = CfgDslValidator.valueResolver(_right_2);
            boolean _equals_4 = _valueResolver_4.equals(_valueResolver_5);
            b = _equals_4;
            break;
          case GREATER:
            boolean _and_2 = false;
            Expression _left_3 = it.getLeft();
            TypeEnum _valueResolver_6 = CfgDslValidator.valueResolver(_left_3);
            boolean _equals_5 = _valueResolver_6.equals(TypeEnum.INTEGER_TYPE);
            if (!_equals_5) {
              _and_2 = false;
            } else {
              Expression _right_3 = it.getRight();
              TypeEnum _valueResolver_7 = CfgDslValidator.valueResolver(_right_3);
              boolean _equals_6 = _valueResolver_7.equals(TypeEnum.INTEGER_TYPE);
              _and_2 = _equals_6;
            }
            b = _and_2;
            break;
          case LESS:
            boolean _and_3 = false;
            Expression _left_4 = it.getLeft();
            TypeEnum _valueResolver_8 = CfgDslValidator.valueResolver(_left_4);
            boolean _equals_7 = _valueResolver_8.equals(TypeEnum.INTEGER_TYPE);
            if (!_equals_7) {
              _and_3 = false;
            } else {
              Expression _right_4 = it.getRight();
              TypeEnum _valueResolver_9 = CfgDslValidator.valueResolver(_right_4);
              boolean _equals_8 = _valueResolver_9.equals(TypeEnum.INTEGER_TYPE);
              _and_3 = _equals_8;
            }
            b = _and_3;
            break;
          case MULTIPLICATION:
            boolean _and_4 = false;
            Expression _left_5 = it.getLeft();
            TypeEnum _valueResolver_10 = CfgDslValidator.valueResolver(_left_5);
            boolean _equals_9 = _valueResolver_10.equals(TypeEnum.INTEGER_TYPE);
            if (!_equals_9) {
              _and_4 = false;
            } else {
              Expression _right_5 = it.getRight();
              TypeEnum _valueResolver_11 = CfgDslValidator.valueResolver(_right_5);
              boolean _equals_10 = _valueResolver_11.equals(TypeEnum.INTEGER_TYPE);
              _and_4 = _equals_10;
            }
            b = _and_4;
            break;
          case OR:
            boolean _and_5 = false;
            Expression _left_6 = it.getLeft();
            TypeEnum _valueResolver_12 = CfgDslValidator.valueResolver(_left_6);
            boolean _equals_11 = _valueResolver_12.equals(TypeEnum.BOOLEAN_TYPE);
            if (!_equals_11) {
              _and_5 = false;
            } else {
              Expression _right_6 = it.getRight();
              TypeEnum _valueResolver_13 = CfgDslValidator.valueResolver(_right_6);
              boolean _equals_12 = _valueResolver_13.equals(TypeEnum.BOOLEAN_TYPE);
              _and_5 = _equals_12;
            }
            b = _and_5;
            break;
          case SUBSET:
            Expression _left_7 = it.getLeft();
            TypeEnum _valueResolver_14 = CfgDslValidator.valueResolver(_left_7);
            Expression _right_7 = it.getRight();
            TypeEnum _valueResolver_15 = CfgDslValidator.valueResolver(_right_7);
            boolean _equals_13 = _valueResolver_14.equals(_valueResolver_15);
            b = _equals_13;
            break;
          default:
            break;
        }
      }
      InputOutput.<String>println(("Done with constraintBinary. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  public static boolean constraintBinaryRoot(final BinaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintBinaryRoot");
      boolean b = true;
      boolean _isRoot = it.isRoot();
      if (_isRoot) {
        boolean _and = false;
        Expression _left = it.getLeft();
        boolean _expressionResolver = CfgDslValidator.expressionResolver(_left);
        if (!_expressionResolver) {
          _and = false;
        } else {
          Expression _right = it.getRight();
          boolean _expressionResolver_1 = CfgDslValidator.expressionResolver(_right);
          _and = _expressionResolver_1;
        }
        b = _and;
      }
      InputOutput.<String>println(("Done with constraintBinaryRoot. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  public static boolean expressionResolver(final Expression it) {
    boolean _xblockexpression = false;
    {
      if ((it instanceof BinaryConstraint)) {
        final BinaryConstraint bc = ((BinaryConstraint) it);
        boolean _isRoot = bc.isRoot();
        if (_isRoot) {
          return false;
        } else {
          boolean _and = false;
          Expression _left = ((BinaryConstraint)it).getLeft();
          boolean _expressionResolver = CfgDslValidator.expressionResolver(_left);
          if (!_expressionResolver) {
            _and = false;
          } else {
            Expression _right = ((BinaryConstraint)it).getRight();
            boolean _expressionResolver_1 = CfgDslValidator.expressionResolver(_right);
            _and = _expressionResolver_1;
          }
          return _and;
        }
      } else {
        if ((it instanceof UnaryConstraint)) {
          final UnaryConstraint uc = ((UnaryConstraint) it);
          Expression _expression = uc.getExpression();
          return CfgDslValidator.expressionResolver(_expression);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  /**
   * Recursively resolve the type of an Expression
   */
  public static TypeEnum valueResolver(final Expression it) {
    TypeEnum _xblockexpression = null;
    {
      InputOutput.<String>println("Starting valueResolver");
      TypeEnum t = TypeEnum.STRING_TYPE;
      if ((it instanceof StringValue)) {
        t = TypeEnum.STRING_TYPE;
      }
      if ((it instanceof IntegerValue)) {
        t = TypeEnum.INTEGER_TYPE;
      }
      if ((it instanceof BooleanValue)) {
        t = TypeEnum.BOOLEAN_TYPE;
      }
      if ((it instanceof BinaryConstraint)) {
        BinaryOperators _operator = ((BinaryConstraint) it).getOperator();
        if (_operator != null) {
          switch (_operator) {
            case ADDITION:
              t = TypeEnum.INTEGER_TYPE;
              break;
            case AND:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            case EQUAL:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            case GREATER:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            case LESS:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            case MULTIPLICATION:
              t = TypeEnum.INTEGER_TYPE;
              break;
            case OR:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            case SUBSET:
              t = TypeEnum.BOOLEAN_TYPE;
              break;
            default:
              break;
          }
        }
      }
      if ((it instanceof Set)) {
        EList<Value> _has = ((Set) it).getHas();
        final Value element = _has.get(0);
        if ((element instanceof StringValue)) {
          t = TypeEnum.STRING_TYPE;
        }
        if ((element instanceof IntegerValue)) {
          t = TypeEnum.INTEGER_TYPE;
        }
        if ((element instanceof BooleanValue)) {
          t = TypeEnum.BOOLEAN_TYPE;
        }
      }
      if ((it instanceof UnaryConstraint)) {
        t = TypeEnum.BOOLEAN_TYPE;
      }
      InputOutput.<String>println(("Done with valueResolver. t=" + t));
      _xblockexpression = t;
    }
    return _xblockexpression;
  }
  
  /**
   * Make sure that the expression of a unary constraint is a BooleanValue
   */
  public static boolean constraintUnary(final UnaryConstraint it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintUnary");
      Expression _expression = it.getExpression();
      TypeEnum _valueResolver = CfgDslValidator.valueResolver(_expression);
      final boolean b = _valueResolver.equals(TypeEnum.BOOLEAN_TYPE);
      InputOutput.<String>println(("Done with constraintUnary. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  /**
   * Check that a set is not empty and all values have the same type
   */
  public static boolean constraintSet(final Set it) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("Starting constraintSet");
      boolean _and = false;
      EList<Value> _has = it.getHas();
      int _size = _has.size();
      boolean _greaterThan = (_size > 0);
      if (!_greaterThan) {
        _and = false;
      } else {
        EList<Value> _has_1 = it.getHas();
        final Function2<Boolean, Value, Boolean> _function = new Function2<Boolean, Value, Boolean>() {
          public Boolean apply(final Boolean b, final Value v) {
            boolean _and = false;
            if (!(b).booleanValue()) {
              _and = false;
            } else {
              Class<? extends Value> _class = v.getClass();
              EList<Value> _has = it.getHas();
              Value _get = _has.get(0);
              Class<? extends Value> _class_1 = _get.getClass();
              boolean _equals = Objects.equal(_class, _class_1);
              _and = _equals;
            }
            return Boolean.valueOf(_and);
          }
        };
        Boolean _fold = IterableExtensions.<Value, Boolean>fold(_has_1, Boolean.valueOf(true), _function);
        _and = (_fold).booleanValue();
      }
      final boolean b = _and;
      InputOutput.<String>println(("Done with constraintSet. b=" + Boolean.valueOf(b)));
      _xblockexpression = b;
    }
    return _xblockexpression;
  }
  
  public static boolean constraint(final EObject it) {
    if (it instanceof BinaryConstraint) {
      return _constraint((BinaryConstraint)it);
    } else if (it instanceof Parameter) {
      return _constraint((Parameter)it);
    } else if (it instanceof Set) {
      return _constraint((Set)it);
    } else if (it instanceof UnaryConstraint) {
      return _constraint((UnaryConstraint)it);
    } else if (it instanceof Value) {
      return _constraint((Value)it);
    } else if (it instanceof Configuration) {
      return _constraint((Configuration)it);
    } else if (it instanceof Root) {
      return _constraint((Root)it);
    } else if (it != null) {
      return _constraint(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
