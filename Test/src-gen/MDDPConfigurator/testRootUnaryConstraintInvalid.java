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
		i.setName("one");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(1);
		expressions.add(i);
		values.put("one", i);
		constraintMap.put("one",i);
		i = factory.createIntegerValue();
		i.setName("two");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(2);
		expressions.add(i);
		values.put("two", i);
		constraintMap.put("two",i);
		
		BooleanValue b;
		b = factory.createBooleanValue();
		b.setName("fail");
		b.setType(TypeEnum.get("BooleanType"));
		b.setValue(false);
		expressions.add(b);
		values.put("fail", b);
		constraintMap.put("fail",b);
		
		Parameter p;
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("bc1");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("fail");
		l = factory.createStringValue();
		l.setName("uc1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("bc1", bc);
		
		expressions.add(bc);
		
		UnaryConstraint uc;
		uc = factory.createUnaryConstraint();
		uc.setName("uc1");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("uc1", uc);
		
		s = factory.createStringValue();
		s.setName("fail");
		
		uc.setExpression(s);
		
		expressions.add(uc);


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
