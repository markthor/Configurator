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
		s = factory.createStringValue();
		s.setName("s1");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("asdlkj2lk323l2aasd3k");
		expressions.add(s);
		values.put("s1", s);
		constraintMap.put("s1",s);
		s = factory.createStringValue();
		s.setName("s2");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("asdlkj2lk323l2aasd3ks");
		expressions.add(s);
		values.put("s2", s);
		constraintMap.put("s2",s);
		
		IntegerValue i;
		i = factory.createIntegerValue();
		i.setName("i1");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10);
		expressions.add(i);
		values.put("i1", i);
		constraintMap.put("i1",i);
		i = factory.createIntegerValue();
		i.setName("i2");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(11);
		expressions.add(i);
		values.put("i2", i);
		constraintMap.put("i2",i);
		
		BooleanValue b;
		b = factory.createBooleanValue();
		b.setName("b1");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(true);
		expressions.add(b);
		values.put("b1", b);
		constraintMap.put("b1",b);
		b = factory.createBooleanValue();
		b.setName("b2");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(true);
		expressions.add(b);
		values.put("b2", b);
		constraintMap.put("b2",b);
		b = factory.createBooleanValue();
		b.setName("b3");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(false);
		expressions.add(b);
		values.put("b3", b);
		constraintMap.put("b3",b);
		b = factory.createBooleanValue();
		b.setName("b4");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(false);
		expressions.add(b);
		values.put("b4", b);
		constraintMap.put("b4",b);
		
		Parameter p;
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("stringEqual");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("s2");
		l = factory.createStringValue();
		l.setName("s1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("stringEqual", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("trueEqualFalse");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("b3");
		l = factory.createStringValue();
		l.setName("b1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("trueEqualFalse", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("falseEqualTrue");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("b2");
		l = factory.createStringValue();
		l.setName("b4");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("falseEqualTrue", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("tenEqualEleven");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("i2");
		l = factory.createStringValue();
		l.setName("i1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("tenEqualEleven", bc);
		
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
