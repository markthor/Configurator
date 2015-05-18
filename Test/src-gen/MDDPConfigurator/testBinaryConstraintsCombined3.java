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
		p.setName("weight");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("length");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("height");
		p.setType(TypeEnum.get("IntegerType"));
		parameters.add(p);
		p = factory.createParameter();
		p.setName("material");
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
		s.setName("wood");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("wood");
		expressions.add(s);
		values.put("wood", s);
		constraintMap.put("wood",s);
		s = factory.createStringValue();
		s.setName("metal");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("metal");
		expressions.add(s);
		values.put("metal", s);
		constraintMap.put("metal",s);
		s = factory.createStringValue();
		s.setName("stone");
		s.setType(TypeEnum.get("StringType"));
		s.setValue("stone");
		expressions.add(s);
		values.put("stone", s);
		constraintMap.put("stone",s);
		
		IntegerValue i;
		i = factory.createIntegerValue();
		i.setName("woodDensity");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(80);
		expressions.add(i);
		values.put("woodDensity", i);
		constraintMap.put("woodDensity",i);
		i = factory.createIntegerValue();
		i.setName("metalDensity");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(500);
		expressions.add(i);
		values.put("metalDensity", i);
		constraintMap.put("metalDensity",i);
		i = factory.createIntegerValue();
		i.setName("stoneDensity");
		i.setType(TypeEnum.get("IntegerType"));
		i.setValue(350);
		expressions.add(i);
		values.put("stoneDensity", i);
		constraintMap.put("stoneDensity",i);
		
		BooleanValue b;
		
		Parameter p;
		p = factory.createParameter();
		p.setName("weight");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("weight",p);
		p = factory.createParameter();
		p.setName("length");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("length",p);
		p = factory.createParameter();
		p.setName("height");
		p.setType(TypeEnum.get("IntegerType"));
		expressions.add(p);
		constraintMap.put("height",p);
		p = factory.createParameter();
		p.setName("material");
		p.setType(TypeEnum.get("StringType"));
		expressions.add(p);
		constraintMap.put("material",p);
		
		Set set;
		set = factory.createSet();
		set.setName("materials");
		set.getHas().add(values.get("wood"));
		set.getHas().add(values.get("metal"));
		set.getHas().add(values.get("stone"));
		expressions.add(set);
		constraintMap.put("materials",set);
		
		
		BinaryConstraint bc;
		StringValue r;
		StringValue l;
		bc = factory.createBinaryConstraint();
		bc.setName("isValidMaterial");
		bc.setOperator(BinaryOperators.SUBSET);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("materials");
		l = factory.createStringValue();
		l.setName("material");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isValidMaterial", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightIfWood");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("correctWeightWood");
		l = factory.createStringValue();
		l.setName("isNotWood");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightIfWood", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightWood");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("weight");
		l = factory.createStringValue();
		l.setName("calculatedWeightWood");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightWood", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("calculatedWeightWood");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("woodDensity");
		l = factory.createStringValue();
		l.setName("area");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("calculatedWeightWood", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightIfMetal");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("correctWeightMetal");
		l = factory.createStringValue();
		l.setName("isNotMetal");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightIfMetal", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightMetal");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("weight");
		l = factory.createStringValue();
		l.setName("calculatedWeightMetal");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightMetal", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("calculatedWeightMetal");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("metalDensity");
		l = factory.createStringValue();
		l.setName("area");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("calculatedWeightMetal", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightIfStone");
		bc.setOperator(BinaryOperators.OR);
		bc.setRoot(true);
		
		r = factory.createStringValue();
		r.setName("correctWeightStone");
		l = factory.createStringValue();
		l.setName("isNotStone");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightIfStone", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("correctWeightStone");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("weight");
		l = factory.createStringValue();
		l.setName("calculatedWeightStone");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("correctWeightStone", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("calculatedWeightStone");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("stoneDensity");
		l = factory.createStringValue();
		l.setName("area");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("calculatedWeightStone", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("area");
		bc.setOperator(BinaryOperators.MULTIPLICATION);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("height");
		l = factory.createStringValue();
		l.setName("length");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("area", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isWood");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("wood");
		l = factory.createStringValue();
		l.setName("material");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isWood", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isMetal");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("metal");
		l = factory.createStringValue();
		l.setName("material");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isMetal", bc);
		
		expressions.add(bc);
		bc = factory.createBinaryConstraint();
		bc.setName("isStone");
		bc.setOperator(BinaryOperators.EQUAL);
		bc.setRoot(false);
		
		r = factory.createStringValue();
		r.setName("stone");
		l = factory.createStringValue();
		l.setName("material");
		
		bc.setRight(r);
		bc.setLeft(l);

		constraintMap.put("isStone", bc);
		
		expressions.add(bc);
		
		UnaryConstraint uc;
		uc = factory.createUnaryConstraint();
		uc.setName("isNotWood");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotWood", uc);
		
		s = factory.createStringValue();
		s.setName("isWood");
		
		uc.setExpression(s);
		
		expressions.add(uc);
		uc = factory.createUnaryConstraint();
		uc.setName("isNotMetal");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotMetal", uc);
		
		s = factory.createStringValue();
		s.setName("isMetal");
		
		uc.setExpression(s);
		
		expressions.add(uc);
		uc = factory.createUnaryConstraint();
		uc.setName("isNotStone");
		uc.setOperator(UnaryOperators.NOT);
		uc.setRoot(false);

		constraintMap.put("isNotStone", uc);
		
		s = factory.createStringValue();
		s.setName("isStone");
		
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
