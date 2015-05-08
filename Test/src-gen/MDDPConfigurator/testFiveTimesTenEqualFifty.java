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
		i.setName("five");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(5);
		expressions.add(i);
		values.put("five", i);
		constraintMap.put("five",i);
		i = factory.createIntegerValue();
		i.setName("ten");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10);
		expressions.add(i);
		values.put("ten", i);
		constraintMap.put("ten",i);
		i = factory.createIntegerValue();
		i.setName("fifty");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(50);
		expressions.add(i);
		values.put("fifty", i);
		constraintMap.put("fifty",i);
		
		BooleanValue b;
		
		Parameter p;
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("fiveTimesTen");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("ten");
		l = factory.createStringValue();
		l.setName("five");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("fiveTimesTen", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("e");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("fiveTimesTen");
		l = factory.createStringValue();
		l.setName("fifty");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("e", bc);
		
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
