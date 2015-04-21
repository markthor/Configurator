package org.xtext.cfgdsl.serializer;

import ConfiguratorPackage.Assignment;
import ConfiguratorPackage.BinaryConstraint;
import ConfiguratorPackage.BooleanValue;
import ConfiguratorPackage.Configuration;
import ConfiguratorPackage.ConfiguratorPackagePackage;
import ConfiguratorPackage.IntegerValue;
import ConfiguratorPackage.Parameter;
import ConfiguratorPackage.Root;
import ConfiguratorPackage.Set;
import ConfiguratorPackage.StringValue;
import ConfiguratorPackage.UnaryConstraint;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.cfgdsl.services.CfgDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractCfgDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CfgDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfiguratorPackagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfiguratorPackagePackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.BINARY_CONSTRAINT:
				if(context == grammarAccess.getBinaryConstraintRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BinaryConstraint(context, (BinaryConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.CONFIGURATION:
				if(context == grammarAccess.getConfigurationRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.INTEGER_VALUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntegerValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntegerValue(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.PARAMETER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.ROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.SET:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSetRule()) {
					sequence_Set(context, (Set) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.STRING_VALUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorPackagePackage.UNARY_CONSTRAINT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getUnaryConstraintRule()) {
					sequence_UnaryConstraint(context, (UnaryConstraint) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (parameter=[Parameter|EString] value=[Value|EString])
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.ASSIGNMENT__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.ASSIGNMENT__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=EString left=[Expression|EString] operator=BinaryOperators right=[Expression|EString]) | 
	 *         (root=EBoolean name=EString left=[Expression|EString] operator=BinaryOperators right=[Expression|EString])
	 *     )
	 */
	protected void sequence_BinaryConstraint(EObject context, BinaryConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeEnum name=EString value=EBoolean)
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.BOOLEAN_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.BOOLEAN_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.BOOLEAN_VALUE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((assignments+=Assignment assignments+=Assignment*)?)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeEnum name=EString value=EInt)
	 */
	protected void sequence_IntegerValue(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.INTEGER_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.INTEGER_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.INTEGER_VALUE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeEnum name=EString)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (configurators+=Configuration* expressions+=Expression*)
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (has+=[Value|EString] has+=[Value|EString]*)?)
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeEnum name=EString value=EString)
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.STRING_VALUE__VALUE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.STRING_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.STRING_VALUE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString Operator=UnaryOperators expression=[Expression|EString])
	 */
	protected void sequence_UnaryConstraint(EObject context, UnaryConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.UNARY_CONSTRAINT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.UNARY_CONSTRAINT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorPackagePackage.Literals.UNARY_CONSTRAINT__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorPackagePackage.Literals.UNARY_CONSTRAINT__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_3_0_1(), semanticObject.getExpression());
		feeder.finish();
	}
}
