package mddp.configurator.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BinaryOperators;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.ConfiguratorPackageFactory;
import ConfiguratorPackage.Expression;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.TypeEnum;
import ConfiguratorPackage.UnaryConstraint;
import ConfiguratorPackage.UnaryOperators;
import ConfiguratorPackage.Value;
import ConfiguratorPackage.impl.ConfiguratorPackageFactoryImpl;


public class ParameterHolder {
	
	private static List<Parameter> parameters;
	private static List<Expression> expressions;
	
	public static List<Parameter> getParameters() {
		if(parameters != null)
			return parameters;
			
		if(expressions == null)
			expressions = getExpressions();
		
		
		parameters = new ArrayList<Parameter>();
		
		ConfiguratorPackageFactory factory = ConfiguratorPackageFactoryImpl.init();
		Parameter p;
		p = factory.createParameter();
		p.setName("x");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("y");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		
		return parameters;
	}
	
	public static List<Expression> getExpressions() {
		if(expressions == null)
			expressions = getExpressions();
		
		ConfiguratorPackageFactory factory = ConfiguratorPackageFactoryImpl.init();
		Map<String, Value> values = new HashMap<String, Value>();
		
		parameters = new ArrayList<Parameter>();
		
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
		
		//HashMap<Expression, Expression> constraintMap = new HashMap<Expression, Expression>();
		
		HashMap<String, Expression> constraintMap = new HashMap<String, Expression>();
		
		BinaryConstraint bc;
		bc = factory.createBinaryConstraint();
		bc.setName("lessTest");
		bc.setOperator(BinaryOperators.LESS);
		bc.setRoot(false);
		
		//bc.setLeft(EXPRESSION)
		//bc.setRight(EXPRESSION)
		
		
		//constraintMap.put(bc, ConfiguratorPackage.impl.BinaryConstraintImpl@4a65c92 (name: lessTest) (operator: less, root: false));
		constraintMap.put("lessTest", bc);
		
		expressions.add(bc);
		
		UnaryConstraint uc;
		uc = factory.createUnaryConstraint();
		uc.setName("notTrue");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);
		
		//uc.setExpression(expression)
		
		//unsetConstraints.put(uc, ConfiguratorPackage.impl.UnaryConstraintImpl@726b7b48 (name: notTrue) (Operator: not, root: false));
		constraintMap.put("notTrue", uc);
		
		expressions.add(uc);
		
		
		
		for (Map.Entry<String, Expression> entry : constraintMap.entrySet())
		{
			Expression e = entry.getValue();
			if(e instanceof BinaryConstraint){
				BinaryConstraint localbc = (BinaryConstraint) e;
				
				localbc.setLeft(constraintMap.get(localbc.getLeft().getName()));
				localbc.setRight(constraintMap.get(localbc.getRight().getName()));
			} else {
				UnaryConstraint localuc = (UnaryConstraint) e;
				
				localuc.setExpression(constraintMap.get(localuc.getExpression().getName()));
			}
		}
		
		/*
		
		BinaryConstraint bc;
		bc = factory.createBinaryConstraint();
		bc.setName("lessTest");
		bc.setOperator(less);
		bc.setRoot(false);
		
		bc.setLeft(EXPRESSION)
		bc.setLeft(RIGHT)
		
		
		unsetConstraints.put(bc, ConfiguratorPackage.impl.BinaryConstraintImpl@4a65c92 (name: lessTest) (operator: less, root: false));
		
		
		expressions.add(bc);
		*/
		return expressions;
	}
}
