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
		p.setName("width");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("height");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("length");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("name");
		p.setType(TypeEnum.get("StringType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("convex");
		p.setType(TypeEnum.get("BooleanType"));
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
		s = factory.createStringValue();
		s.setName("reservedName");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("box");
		expressions.add(s);
		values.put("reservedName", s);
		constraintMap.put("reservedName",s);
		
		IntegerValue i;
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
		
		BooleanValue b;
		
		Parameter p;
		p = factory.createParameter();
		p.setName("width");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("width",p);
		p = factory.createParameter();
		p.setName("height");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("height",p);
		p = factory.createParameter();
		p.setName("length");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("length",p);
		p = factory.createParameter();
		p.setName("name");
		p.setType(TypeEnum.get("StringType"));
		expressions.add(p);
		constraintMap.put("name",p);
		p = factory.createParameter();
		p.setName("convex");
		p.setType(TypeEnum.get("BooleanType"));
		expressions.add(p);
		constraintMap.put("convex",p);
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("nameIsReserved");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("reservedName");
		l = factory.createStringValue();
		l.setName("name");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("nameIsReserved", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("masterVolumeConstraint");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("increaseVolumeIfConvex");
		l = factory.createStringValue();
		l.setName("standardVolumeIfNotConvex");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("masterVolumeConstraint", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("standardVolumeIfNotConvex");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("volumeConstraint");
		l = factory.createStringValue();
		l.setName("notConvex");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("standardVolumeIfNotConvex", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("increaseVolumeIfConvex");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("doubleVolumeConstraint");
		l = factory.createStringValue();
		l.setName("convex");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("increaseVolumeIfConvex", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("volumeConstraint");
		bc.setOperator(BinaryOperators.LESS);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("maxVolume");
		l = factory.createStringValue();
		l.setName("volume");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("volumeConstraint", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("doubleVolumeConstraint");
		bc.setOperator(BinaryOperators.LESS);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("doubleVolume");
		l = factory.createStringValue();
		l.setName("volume");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("doubleVolumeConstraint", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("doubleVolume");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("two");
		l = factory.createStringValue();
		l.setName("maxVolume");
		
		bc.setRight(r);
		bc.setLeft(l);

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
		
		expressions.add(bc);
		
		UnaryConstraint uc;
		uc = factory.createUnaryConstraint();
		uc.setName("nameIsNotReserved");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(true);

		constraintMap.put("nameIsNotReserved", uc);
		
		s = factory.createStringValue();
		s.setName("nameIsReserved");
		
		uc.setExpression(s);
		
		expressions.add(uc);
		uc = factory.createUnaryConstraint();
		uc.setName("notConvex");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("notConvex", uc);
		
		s = factory.createStringValue();
		s.setName("convex");
		
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
