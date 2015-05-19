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
		p.setName("cassetteSpeed");
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
		i.setName("BMXMaxFrameSizePlusOne");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(50);
		expressions.add(i);
		values.put("BMXMaxFrameSizePlusOne", i);
		constraintMap.put("BMXMaxFrameSizePlusOne",i);
		i = factory.createIntegerValue();
		i.setName("frameSize48");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(48);
		expressions.add(i);
		values.put("frameSize48", i);
		constraintMap.put("frameSize48",i);
		i = factory.createIntegerValue();
		i.setName("frameSize50");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(50);
		expressions.add(i);
		values.put("frameSize50", i);
		constraintMap.put("frameSize50",i);
		i = factory.createIntegerValue();
		i.setName("frameSize52");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(52);
		expressions.add(i);
		values.put("frameSize52", i);
		constraintMap.put("frameSize52",i);
		i = factory.createIntegerValue();
		i.setName("frameSize54");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(54);
		expressions.add(i);
		values.put("frameSize54", i);
		constraintMap.put("frameSize54",i);
		i = factory.createIntegerValue();
		i.setName("frameSize55");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(55);
		expressions.add(i);
		values.put("frameSize55", i);
		constraintMap.put("frameSize55",i);
		i = factory.createIntegerValue();
		i.setName("frameSize56");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(56);
		expressions.add(i);
		values.put("frameSize56", i);
		constraintMap.put("frameSize56",i);
		i = factory.createIntegerValue();
		i.setName("frameSize58");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(58);
		expressions.add(i);
		values.put("frameSize58", i);
		constraintMap.put("frameSize58",i);
		i = factory.createIntegerValue();
		i.setName("frameSize60");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(60);
		expressions.add(i);
		values.put("frameSize60", i);
		constraintMap.put("frameSize60",i);
		i = factory.createIntegerValue();
		i.setName("frameSize62");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(62);
		expressions.add(i);
		values.put("frameSize62", i);
		constraintMap.put("frameSize62",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed1");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(1);
		expressions.add(i);
		values.put("cassetteSpeed1", i);
		constraintMap.put("cassetteSpeed1",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed6");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(6);
		expressions.add(i);
		values.put("cassetteSpeed6", i);
		constraintMap.put("cassetteSpeed6",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed7");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(7);
		expressions.add(i);
		values.put("cassetteSpeed7", i);
		constraintMap.put("cassetteSpeed7",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed8");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(8);
		expressions.add(i);
		values.put("cassetteSpeed8", i);
		constraintMap.put("cassetteSpeed8",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed9");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(9);
		expressions.add(i);
		values.put("cassetteSpeed9", i);
		constraintMap.put("cassetteSpeed9",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed10");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(10);
		expressions.add(i);
		values.put("cassetteSpeed10", i);
		constraintMap.put("cassetteSpeed10",i);
		i = factory.createIntegerValue();
		i.setName("cassetteSpeed11");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(11);
		expressions.add(i);
		values.put("cassetteSpeed11", i);
		constraintMap.put("cassetteSpeed11",i);
		
		BooleanValue b;
		
		Parameter p;
		p = factory.createParameter();
		p.setName("wheelSize");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("wheelSize",p);
		p = factory.createParameter();
		p.setName("cassetteSpeed");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("cassetteSpeed",p);
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
		set = factory.createSet();
		set.setName("cassetteSpeeds");
		set.getHas().add(values.get("cassetteSpeed1"));
		set.getHas().add(values.get("cassetteSpeed6"));
		set.getHas().add(values.get("cassetteSpeed7"));
		set.getHas().add(values.get("cassetteSpeed8"));
		set.getHas().add(values.get("cassetteSpeed9"));
		set.getHas().add(values.get("cassetteSpeed10"));
		set.getHas().add(values.get("cassetteSpeed11"));
		expressions.add(set);
		constraintMap.put("cassetteSpeeds",set);
		set = factory.createSet();
		set.setName("frameSizes");
		set.getHas().add(values.get("frameSize48"));
		set.getHas().add(values.get("frameSize50"));
		set.getHas().add(values.get("frameSize52"));
		set.getHas().add(values.get("frameSize54"));
		set.getHas().add(values.get("frameSize55"));
		set.getHas().add(values.get("frameSize56"));
		set.getHas().add(values.get("frameSize58"));
		set.getHas().add(values.get("frameSize60"));
		set.getHas().add(values.get("frameSize62"));
		expressions.add(set);
		constraintMap.put("frameSizes",set);
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("frameSizeAndCassetteSpeedValid");
		bc.setOperator(BinaryOperators.AND);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("cassetteSpeedIsValid");
		l = factory.createStringValue();
		l.setName("frameSizeIsValid");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("frameSizeAndCassetteSpeedValid", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("frameSizeIsValid");
		bc.setOperator(BinaryOperators.SUBSET);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("frameSizes");
		l = factory.createStringValue();
		l.setName("frameSize");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("frameSizeIsValid", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("cassetteSpeedIsValid");
		bc.setOperator(BinaryOperators.SUBSET);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("cassetteSpeeds");
		l = factory.createStringValue();
		l.setName("cassetteSpeed");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("cassetteSpeedIsValid", bc);
		
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
		bc.setName("isNotTTOrIsNotSingleSpeed");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("notSingleSpeed");
		l = factory.createStringValue();
		l.setName("isNotTT");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isNotTTOrIsNotSingleSpeed", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("BMXWithProperFrame");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("BMXFrame");
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
		r.setName("BMXMaxFrameSizePlusOne");
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
		bc.setName("singleSpeedTrackOrBMX");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("isNotBMXOrTrack");
		l = factory.createStringValue();
		l.setName("singleSpeedComposition");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("singleSpeedTrackOrBMX", bc);
		
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
		r.setName("cassetteSpeed1");
		l = factory.createStringValue();
		l.setName("cassetteSpeed");
		
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
		uc.setName("notSingleSpeed");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("notSingleSpeed", uc);
		
		s = factory.createStringValue();
		s.setName("singleSpeed");
		
		uc.setExpression(s);
		
		expressions.add(uc);
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
		uc = factory.createUnaryConstraint();
		uc.setName("isNotTT");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotTT", uc);
		
		s = factory.createStringValue();
		s.setName("isTT");
		
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
