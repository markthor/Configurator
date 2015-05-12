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


public class ExpressionHolder {
	
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
		
		return parameters;
	}
	
	public static List<Expression> getExpressions() {
		if(expressions != null)
			return expressions;
		
		ConfiguratorPackageFactory factory = ConfiguratorPackageFactoryImpl.init();
		Map<String, Value> values = new HashMap<String, Value>();
		HashMap<String, Expression> constraintMap = new HashMap<String, Expression>();
		
		expressions = new ArrayList<Expression>();
		
		StringValue s;
		
		IntegerValue i;
		i = factory.createIntegerValue();
		i.setName("tenThousand");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10000);
		expressions.add(i);
		values.put("tenThousand", i);
		constraintMap.put("tenThousand",i);
		i = factory.createIntegerValue();
		i.setName("thousand");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(1000);
		expressions.add(i);
		values.put("thousand", i);
		constraintMap.put("thousand",i);
		i = factory.createIntegerValue();
		i.setName("hundred");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(100);
		expressions.add(i);
		values.put("hundred", i);
		constraintMap.put("hundred",i);
		i = factory.createIntegerValue();
		i.setName("ten");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10);
		expressions.add(i);
		values.put("ten", i);
		constraintMap.put("ten",i);
		
		BooleanValue b;
		
		Parameter p;
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("mul1");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("ten");
		l = factory.createStringValue();
		l.setName("ten");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("mul1", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("mul2");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("hundred");
		l = factory.createStringValue();
		l.setName("ten");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("mul2", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("add1");
		bc.setOperator(BinaryOperators.ADDITION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("mul2");
		l = factory.createStringValue();
		l.setName("mul1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("add1", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("testMul");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("add1");
		l = factory.createStringValue();
		l.setName("add1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("testMul", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("testGreater");
		bc.setOperator(BinaryOperators.GREATER);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("add1");
		l = factory.createStringValue();
		l.setName("tenThousand");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("testGreater", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("testLess");
		bc.setOperator(BinaryOperators.LESS);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("thousand");
		l = factory.createStringValue();
		l.setName("mul1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("testLess", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("testEqual");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("hundred");
		l = factory.createStringValue();
		l.setName("mul1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("testEqual", bc);
		
		expressions.add(bc);
		
		UnaryConstraint uc;


		for (Map.Entry<String, Expression> entry : constraintMap.entrySet())
		{
			Expression e = entry.getValue();
			if(e instanceof BinaryConstraint){
				BinaryConstraint localbc = (BinaryConstraint) e;
				
				localbc.setLeft(constraintMap.get(localbc.getLeft().getName()));
				localbc.setRight(constraintMap.get(localbc.getRight().getName()));
			} else if(e instanceof UnaryConstraint) {
				UnaryConstraint localuc = (UnaryConstraint) e;
				
				localuc.setExpression(constraintMap.get(localuc.getExpression().getName()));
			}
		}
		
		return expressions;
	}
}
