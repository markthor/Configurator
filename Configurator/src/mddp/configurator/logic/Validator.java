package mddp.configurator.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ConfiguratorPackage.Assignment;
import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.ConfiguratorPackageFactory;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.Value;
import ConfiguratorPackage.impl.ConfiguratorPackageFactoryImpl;





public class Validator {
	
	public static boolean validate(List<Assignment> assignments) {
		boolean valid = true;
		Map<String, Assignment> map = new HashMap<String, Assignment>();
		
		// Check the types of the assignments are well typed
		for(Assignment a : assignments) {
			if(a.getValue() instanceof StringValue)
				valid = valid && (a.getParameter().getType().equals(((StringValue)a.getValue()).getType()));
			if(a.getValue() instanceof IntegerValue)
				valid = valid && (a.getParameter().getType().equals(((IntegerValue)a.getValue()).getType()));
			if(a.getValue() instanceof BooleanValue)
				valid = valid && (a.getParameter().getType().equals(((BooleanValue)a.getValue()).getType()));
			
			map.put(a.getParameter().getName(), a);
		}
		if(!valid)
			return false;
		
		List<Expression> expressions = ExpressionHolder.getExpressions();
		
		for (Expression e : expressions) {
			if(e instanceof BinaryConstraint){
				Expression res = validate((BinaryConstraint) e, map);
				if(res instanceof BooleanValue){
					BooleanValue bv = (BooleanValue)res;
					return bv.isValue();
				} else{
					throw new RuntimeException("");
					//return false;
				}
			} else if(e instanceof UnaryConstraint){
				Expression res = validate((UnaryConstraint) e, map);
				if(res instanceof BooleanValue){
					BooleanValue bv = (BooleanValue)res;
					return bv.isValue();
				} else{
					throw new RuntimeException("");
					//return false;
				}
			}
		}
		
		return true;
	}
	
	
	public static Expression validate(BinaryConstraint bc, Map<String, Assignment> map){
		Expression left = getExpr(bc.getLeft(), map);
		Expression right = getExpr(bc.getRight(), map);
		
		ConfiguratorPackageFactory config = ConfiguratorPackageFactoryImpl.init();
		
		BooleanValue b = config.createBooleanValue();
		switch(bc.getOperator()) {
			case EQUAL:				b.setValue(left.equals(right));
									return b;
			case LESS:				b.setValue(false);
									if(left instanceof IntegerValue && right instanceof IntegerValue)
										if(((IntegerValue)left).getValue() < ((IntegerValue)right).getValue())
											b.setValue(true);
									return b;
			case GREATER:			b.setValue(false);
									if(left instanceof IntegerValue && right instanceof IntegerValue)
										if(((IntegerValue)left).getValue() > ((IntegerValue)right).getValue())
											b.setValue(true);
									return b;
			case ADDITION:			if(bc.isRoot()) {
										b.setValue(false);
										return b;
									} else if(left instanceof IntegerValue && right instanceof IntegerValue){
										IntegerValue i = config.createIntegerValue();
										i.setValue(((IntegerValue)left).getValue() + ((IntegerValue)right).getValue());
										return i;
									} else
										b.setValue(false);
										return b;
			case MULTIPLICATION:	if(bc.isRoot()) {
										b.setValue(false);
										return b;
									}
									else if(left instanceof IntegerValue && right instanceof IntegerValue){
										IntegerValue i = config.createIntegerValue();
										i.setValue(((IntegerValue)left).getValue() * ((IntegerValue)right).getValue());
										return i;
									} else {
										b.setValue(false);
										return b;
									}
			case SUBSET:			b.setValue(false);
									if(right instanceof Set && left instanceof Value)
										if(((Set)right).getHas().contains(left))
											b.setValue(true);
									return b;
			case AND:				b.setValue(false);
									if(left instanceof BooleanValue && right instanceof BooleanValue)
										if(((BooleanValue)left).isValue() && ((BooleanValue)right).isValue())
											b.setValue(true);
									return b;
			case OR:				b.setValue(false);
									if(left instanceof BooleanValue && right instanceof BooleanValue)
										if(((BooleanValue)left).isValue() || ((BooleanValue)right).isValue())
											b.setValue(true);
									return b;
		}
		b.setValue(false);
		return b;
	}
	
	
	private static Expression getExpr(Expression expr, Map<String, Assignment> map) {
		Expression e;
		if(expr instanceof BinaryConstraint) {
			BinaryConstraint bc = (BinaryConstraint) expr;
			e = validate(bc, map);
		} else if(expr instanceof UnaryConstraint) {
			UnaryConstraint uc = (UnaryConstraint) expr;
			e = validate(uc, map);
		} else if(expr instanceof Parameter) {
			Parameter p = (Parameter) expr;
			Assignment a = map.get(p.getName());
			e = a.getValue();
		} else {
			e = expr;
		}
		return e;
	}
	
	public static BooleanValue validate(UnaryConstraint uc, Map<String, Assignment> map){
		ConfiguratorPackageFactory config = ConfiguratorPackageFactoryImpl.init();
		BooleanValue b = config.createBooleanValue();
		
		Expression expr = uc.getExpression();
		
		if(expr instanceof BinaryConstraint){
			BinaryConstraint bc = (BinaryConstraint) expr;
			BooleanValue value = (BooleanValue) validate(bc, map);
			b.setValue(!(value.isValue()));
		}
		else if(expr instanceof UnaryConstraint){
			BooleanValue value = validate((UnaryConstraint) expr, map);
			b.setValue(!(value.isValue()));
		}
		else if(expr instanceof BooleanValue){
			BooleanValue value = (BooleanValue) expr;
			b.setValue(!(value.isValue()));
		}
		return b;
	}
}
