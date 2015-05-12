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
		s.setName("red");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("red");
		expressions.add(s);
		values.put("red", s);
		constraintMap.put("red",s);
		s = factory.createStringValue();
		s.setName("blue");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("blue");
		expressions.add(s);
		values.put("blue", s);
		constraintMap.put("blue",s);
		s = factory.createStringValue();
		s.setName("green");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("green");
		expressions.add(s);
		values.put("green", s);
		constraintMap.put("green",s);
		s = factory.createStringValue();
		s.setName("black");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("black");
		expressions.add(s);
		values.put("black", s);
		constraintMap.put("black",s);
		
		IntegerValue i;
<<<<<<< HEAD:Test/src-gen/MDDPConfigurator/Mikkel.java
=======
		i = factory.createIntegerValue();
		i.setName("maxVolume");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10000);
		expressions.add(i);
		values.put("maxVolume", i);
		constraintMap.put("maxVolume",i);
		i = factory.createIntegerValue();
		i.setName("two");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(2);
		expressions.add(i);
		values.put("two", i);
		constraintMap.put("two",i);
>>>>>>> 436c65108b8d41259bde1d096d67c11bf47539be:Test/src-gen/MDDPConfigurator/testBinaryConstraintsCombinations.java
		
		BooleanValue b;
		
		Parameter p;
		
		Set set;
		set = factory.createSet();
		set.setName("colorful");
		set.getHas().add(values.get("red"));
		set.getHas().add(values.get("green"));
		set.getHas().add(values.get("blue"));
		expressions.add(set);
		constraintMap.put("colorful",set);
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("isColorful");
		bc.setOperator(BinaryOperators.SUBSET);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("colorful");
		l = factory.createStringValue();
		l.setName("black");
		
		bc.setRight(r);
		bc.setLeft(l);

<<<<<<< HEAD:Test/src-gen/MDDPConfigurator/Mikkel.java
		constraintMap.put("isColorful", bc);
=======
		constraintMap.put("doubleVolume", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("groundSurface");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("length");
		l = factory.createStringValue();
		l.setName("width");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("groundSurface", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("volume");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("height");
		l = factory.createStringValue();
		l.setName("groundSurface");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("volume", bc);
>>>>>>> 436c65108b8d41259bde1d096d67c11bf47539be:Test/src-gen/MDDPConfigurator/testBinaryConstraintsCombinations.java
		
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
