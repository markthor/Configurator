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
		p.setName("wheelSize");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("wheelSpeed");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("kasseteSpeed");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("frameSize");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("bikeType");
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
		s = factory.createStringValue();
		s.setName("racer");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("racer");
		expressions.add(s);
		values.put("racer", s);
		constraintMap.put("racer",s);
		s = factory.createStringValue();
		s.setName("tt");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("tt");
		expressions.add(s);
		values.put("tt", s);
		constraintMap.put("tt",s);
		s = factory.createStringValue();
		s.setName("cx");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("cx");
		expressions.add(s);
		values.put("cx", s);
		constraintMap.put("cx",s);
		s = factory.createStringValue();
		s.setName("track");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("track");
		expressions.add(s);
		values.put("track", s);
		constraintMap.put("track",s);
		s = factory.createStringValue();
		s.setName("bmx");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("bmx");
		expressions.add(s);
		values.put("bmx", s);
		constraintMap.put("bmx",s);
		
		IntegerValue i;
		i = factory.createIntegerValue();
		i.setName("one");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(1);
		expressions.add(i);
		values.put("one", i);
		constraintMap.put("one",i);
		i = factory.createIntegerValue();
		i.setName("racerDiameter1");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(650);
		expressions.add(i);
		values.put("racerDiameter1", i);
		constraintMap.put("racerDiameter1",i);
		i = factory.createIntegerValue();
		i.setName("racerDiameter2");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(700);
		expressions.add(i);
		values.put("racerDiameter2", i);
		constraintMap.put("racerDiameter2",i);
		i = factory.createIntegerValue();
		i.setName("BMXMaxSize");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(30);
		expressions.add(i);
		values.put("BMXMaxSize", i);
		constraintMap.put("BMXMaxSize",i);
		
		BooleanValue b;
		
		Parameter p;
		p = factory.createParameter();
		p.setName("wheelSize");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("wheelSize",p);
		p = factory.createParameter();
		p.setName("wheelSpeed");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("wheelSpeed",p);
		p = factory.createParameter();
		p.setName("kasseteSpeed");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("kasseteSpeed",p);
		p = factory.createParameter();
		p.setName("frameSize");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("frameSize",p);
		p = factory.createParameter();
		p.setName("bikeType");
		p.setType(TypeEnum.get("StringType"));
		expressions.add(p);
		constraintMap.put("bikeType",p);
		
		Set set;
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("matchingSpeed");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("kasseteSpeed");
		l = factory.createStringValue();
		l.setName("wheelSpeed");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("matchingSpeed", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("masterType");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("isBMX");
		l = factory.createStringValue();
		l.setName("isRacerTTCXOrTrack");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("masterType", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("BMXWithProperFrame");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("racerDiameter");
		l = factory.createStringValue();
		l.setName("isNotBMX");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("BMXWithProperFrame", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("BMXFrame");
		bc.setOperator(BinaryOperators.LESS);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("BMXMaxSize");
		l = factory.createStringValue();
		l.setName("frameSize");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("BMXFrame", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("racerWithProperDiameter");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("racerDiameter");
		l = factory.createStringValue();
		l.setName("isNotRacer");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("racerWithProperDiameter", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("racerDiameter");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("racerDiameterBC2");
		l = factory.createStringValue();
		l.setName("racerDiameterBC1");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("racerDiameter", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("racerDiameterBC1");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("racerDiameter1");
		l = factory.createStringValue();
		l.setName("wheelSize");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("racerDiameterBC1", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("racerDiameterBC2");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("racerDiameter2");
		l = factory.createStringValue();
		l.setName("wheelSize");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("racerDiameterBC2", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("oneSpeedTrackOrBMX");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("isNotBMXOrTrack");
		l = factory.createStringValue();
		l.setName("singleSpeedComposition");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("oneSpeedTrackOrBMX", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("singleSpeedBMX");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("singleSpeed");
		l = factory.createStringValue();
		l.setName("isBMX");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("singleSpeedBMX", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("singleSpeedTrack");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("singleSpeed");
		l = factory.createStringValue();
		l.setName("isTrack");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("singleSpeedTrack", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("singleSpeedComposition");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("singleSpeedTrack");
		l = factory.createStringValue();
		l.setName("singleSpeedBMX");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("singleSpeedComposition", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("singleSpeed");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("one");
		l = factory.createStringValue();
		l.setName("wheelSpeed");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("singleSpeed", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isRacerTTCXOrTrack");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("isCXOrTrack");
		l = factory.createStringValue();
		l.setName("isRacerOrTT");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isRacerTTCXOrTrack", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isRacerOrTT");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("isTT");
		l = factory.createStringValue();
		l.setName("isRacer");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isRacerOrTT", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isCXOrTrack");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("isTrack");
		l = factory.createStringValue();
		l.setName("isCX");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isCXOrTrack", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isBMXOrTrack");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("isTrack");
		l = factory.createStringValue();
		l.setName("isBMX");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isBMXOrTrack", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isRacer");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("racer");
		l = factory.createStringValue();
		l.setName("bikeType");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isRacer", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isTT");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("tt");
		l = factory.createStringValue();
		l.setName("bikeType");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isTT", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isCX");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("cx");
		l = factory.createStringValue();
		l.setName("bikeType");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isCX", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isTrack");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("track");
		l = factory.createStringValue();
		l.setName("bikeType");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isTrack", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isBMX");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("bmx");
		l = factory.createStringValue();
		l.setName("bikeType");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isBMX", bc);
		
		expressions.add(bc);
		
		UnaryConstraint uc;
		uc = factory.createUnaryConstraint();
		uc.setName("isNotBMXOrTrack");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotBMXOrTrack", uc);
		
		s = factory.createStringValue();
		s.setName("isBMXOrTrack");
		
		uc.setExpression(s);
		
		expressions.add(uc);
		uc = factory.createUnaryConstraint();
		uc.setName("isNotRacer");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotRacer", uc);
		
		s = factory.createStringValue();
		s.setName("isRacer");
		
		uc.setExpression(s);
		
		expressions.add(uc);
		uc = factory.createUnaryConstraint();
		uc.setName("isNotBMX");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotBMX", uc);
		
		s = factory.createStringValue();
		s.setName("isBMX");
		
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
