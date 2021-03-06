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
		p = factory.createParameter();
		p.setName("switch");
		p.setType(TypeEnum.get("BooleanType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("number");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("text");
		p.setType(TypeEnum.get("StringType"));
		parameters.add(p);
		
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
		
		BooleanValue b;
		
		Parameter p;
		p = factory.createParameter();
		p.setName("switch");
		p.setType(TypeEnum.get("BooleanType"));
		expressions.add(p);
		constraintMap.put("switch",p);
		p = factory.createParameter();
		p.setName("number");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("number",p);
		p = factory.createParameter();
		p.setName("text");
		p.setType(TypeEnum.get("StringType"));
		expressions.add(p);
		constraintMap.put("text",p);
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		
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
