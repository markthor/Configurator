/*
 * generated by Xtext
 */
package org.xtext.cfgdsl.generator

import ConfiguratorPackage.BinaryConstraint
import ConfiguratorPackage.BooleanValue
import ConfiguratorPackage.IntegerValue
import ConfiguratorPackage.Parameter
import ConfiguratorPackage.Root
import ConfiguratorPackage.Set
import ConfiguratorPackage.StringValue
import ConfiguratorPackage.UnaryConstraint
import java.nio.file.Paths
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.cfgdsl.validation.CfgDslValidator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CfgDslGenerator implements IGenerator {
	
	def static compileToJava(Root it) {
		'''
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
					«FOR expr : it.expressions.filter(typeof(Parameter))»
						p = factory.createParameter();
						p.setName("«expr.name»");
						p.setType(TypeEnum.get("«expr.type»"));
						parameters.add(p);
					«ENDFOR»
					
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
					«FOR expr : it.expressions.filter(typeof(StringValue))»
						s = factory.createStringValue();
						s.setName("«expr.name»");
						s.setType(TypeEnum.get("«expr.type»"));
						s.setValue("«expr.value»");
						expressions.add(s);
						values.put("«expr.name»", s);
						constraintMap.put("«expr.name»",s);
					«ENDFOR»
					
					IntegerValue i;
					«FOR expr : it.expressions.filter(typeof(IntegerValue))»
						i = factory.createIntegerValue();
						i.setName("«expr.name»");
						i.setType(TypeEnum.get("«expr.type»"));
						i.setValue(«expr.value»);
						expressions.add(i);
						values.put("«expr.name»", i);
						constraintMap.put("«expr.name»",i);
					«ENDFOR»
					
					BooleanValue b;
					«FOR expr : it.expressions.filter(typeof(BooleanValue))»
						b = factory.createBooleanValue();
						b.setName("«expr.name»");
						b.setType(TypeEnum.get("«expr.type»"));
						b.setValue(«expr.value»);
						expressions.add(b);
						values.put("«expr.name»", b);
						constraintMap.put("«expr.name»",b);
					«ENDFOR»
					
					Parameter p;
					«FOR expr : it.expressions.filter(typeof(Parameter))»
						p = factory.createParameter();
						p.setName("«expr.name»");
						p.setType(TypeEnum.get("«expr.type»"));
						expressions.add(p);
						constraintMap.put("«expr.name»",p);
					«ENDFOR»
					
					Set set;
					«FOR expr : it.expressions.filter(typeof(Set))»
						set = factory.createSet();
						set.setName("«expr.name»");
						«FOR value : expr.has»
							set.getHas().add(values.get("«value.name»"));
						«ENDFOR»
						expressions.add(set);
						constraintMap.put("«expr.name»",set);
					«ENDFOR»
					
					
					BinaryConstraint bc;
					StringValue r;
					StringValue l;
					«FOR expr : it.expressions.filter(typeof(BinaryConstraint))»
						bc = factory.createBinaryConstraint();
						bc.setName("«expr.name»");
						bc.setOperator(BinaryOperators.«expr.operator.toString().toUpperCase»);
						bc.setRoot(«expr.root»);
						
						r = factory.createStringValue();
						r.setName("«expr.right.name»");
						l = factory.createStringValue();
						l.setName("«expr.left.name»");
						
						bc.setRight(r);
						bc.setLeft(l);

						constraintMap.put("«expr.name»", bc);
						
						expressions.add(bc);
					«ENDFOR»
					
					UnaryConstraint uc;
					«FOR expr : it.expressions.filter(typeof(UnaryConstraint))»
						uc = factory.createUnaryConstraint();
						uc.setName("«expr.name»");
						uc.setOperator(UnaryOperators.«expr.operator.toString().toUpperCase»);
						uc.setRoot(«expr.root»);

						constraintMap.put("«expr.name»", uc);
						
						s = factory.createStringValue();
						s.setName("«expr.expression.name»");
						
						uc.setExpression(s);
						
						expressions.add(uc);
					«ENDFOR»


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
  		'''
			}
	 
	def static compileToJson(Root it) {
		JsonConverter.generate(it)
 
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (EcoreUtil.getAllProperContents(resource, false).forall [  CfgDslValidator.constraint (it)])
		   println ("All constraints are satisfied!")
		else {
		   println ("Some constraint is violated")
		   return
		}
		resource.allContents.toIterable.filter(typeof(Root)).
			forEach [ Root it | 
				// generate Java implementation
				fsa.generateFile("MDDPConfigurator/" + getNameFromResource(resource) + ".java", it.compileToJava)
				fsa.generateFile("MDDPConfigurator/" + getNameFromResource(resource) + ".json", it.compileToJson)
			]
	}
	
	def static String getNameFromResource(Resource r) {
		val purePath = r.getURI().toString().split(":").get(1)
		val path = Paths.get(purePath)
		val child = path.getName(path.getNameCount()-1)
		child.toString().replaceFirst("[.][^.]+$", "")
	}
}
