package cfgdsl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import ConfiguratorPackage.Assignment;
import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.ConfiguratorPackageFactory;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.Value;
import ConfiguratorPackage.impl.ConfiguratorPackageFactoryImpl;

class Validator {
	
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
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.StringValueImpl@79b28caa (name: s1) (value: something, type: StringType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.StringValueImpl@79b28caa (name: s1) (value: something, type: StringType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.StringValueImpl@6e761f90 (name: s2) (value: somethingElse, type: StringType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.StringValueImpl@6e761f90 (name: s2) (value: somethingElse, type: StringType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.IntegerValueImpl@8a4cada (name: i1) (value: 1, type: IntegerType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.IntegerValueImpl@8a4cada (name: i1) (value: 1, type: IntegerType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.IntegerValueImpl@7c292792 (name: i2) (value: 2, type: IntegerType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.IntegerValueImpl@7c292792 (name: i2) (value: 2, type: IntegerType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.BooleanValueImpl@11133361 (name: b1) (value: false, type: BooleanType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.BooleanValueImpl@11133361 (name: b1) (value: false, type: BooleanType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.SetImpl@4fc7244c (name: set1);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.SetImpl@4fc7244c (name: set1);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.ParameterImpl@611bc574 (name: x) (type: IntegerType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.ParameterImpl@611bc574 (name: x) (type: IntegerType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.ParameterImpl@54bb6b72 (name: y) (type: IntegerType);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.ParameterImpl@54bb6b72 (name: y) (type: IntegerType);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(true){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.BinaryConstraintImpl@5cbbc2bf (name: lessTest) (operator: less, root: false);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(false){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.BinaryConstraintImpl@5cbbc2bf (name: lessTest) (operator: less, root: false);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		if(false){
			BinaryConstraint bc = (BinaryConstraint) ConfiguratorPackage.impl.UnaryConstraintImpl@2a286820 (name: notTrue) (Operator: not, root: false);
			if(bc.getRoot()){
				if(!validate(bc, map)) {
					return false;
				}
			}
		}
		if(true){
			UnaryConstraint uc = (UnaryConstraint) ConfiguratorPackage.impl.UnaryConstraintImpl@2a286820 (name: notTrue) (Operator: not, root: false);
			if(uc.getRoot()){
				if(!validate(uc, map)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static List<Expression> something() {
		ConfiguratorPackageFactory factory = ConfiguratorPackageFactoryImpl.init();
		List<Expression> expressions = new ArrayList<Expression>();
		Map<String, Value> values = new HashMap<String, Value>();
		
		StringValue s;
		s = factory.createStringValue();
		s.setName("s1");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("something");
		expressions.add(s);
		values.put("s1", s);
		s = factory.createStringValue();
		s.setName("s2");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("somethingElse");
		expressions.add(s);
		values.put("s2", s);
		
		IntegerValue i;
		i = factory.createIntegerValue();
		i.setName("i1");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(1);
		expressions.add(i);
		values.put("i1", i);
		i = factory.createIntegerValue();
		i.setName("i2");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(2);
		expressions.add(i);
		values.put("i2", i);
		
		BooleanValue b;
		b = factory.createBooleanValue();
		b.setName("b1");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(false);
		expressions.add(b);
		values.put("b1", b);
		
		Parameter p;
		p = factory.createParameter();
		p.setName("x");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		p = factory.createParameter();
		p.setName("y");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		
		Set set;
		set = factory.createSet();
		set.setName("set1");
								
		set.getHas().add(values.get("s1"));
		set.getHas().add(values.get("s2"));
		expressions.add(set);
		
		Parameter p = factory.createParameter();
		p.setName("x");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		Parameter p = factory.createParameter();
		p.setName("y");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		
		return expressions;
	}

	public Expression validate(BinaryConstraint bc, Map<String, Assignment> map){
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
	
	
	private Expression getExpr(Expression expr, Map<String, Assignment> map) {
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
	
	public BooleanValue validate(UnaryConstraint uc, Map<String, Assignment> map){
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
