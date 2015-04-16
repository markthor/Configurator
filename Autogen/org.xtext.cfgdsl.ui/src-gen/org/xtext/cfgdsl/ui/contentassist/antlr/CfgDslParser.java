/*
* generated by Xtext
*/
package org.xtext.cfgdsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.cfgdsl.services.CfgDslGrammarAccess;

public class CfgDslParser extends AbstractContentAssistParser {
	
	@Inject
	private CfgDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.cfgdsl.ui.contentassist.antlr.internal.InternalCfgDslParser createParser() {
		org.xtext.cfgdsl.ui.contentassist.antlr.internal.InternalCfgDslParser result = new org.xtext.cfgdsl.ui.contentassist.antlr.internal.InternalCfgDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getTypeEnumAccess().getAlternatives(), "rule__TypeEnum__Alternatives");
					put(grammarAccess.getBinaryOperatorsAccess().getAlternatives(), "rule__BinaryOperators__Alternatives");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup_2(), "rule__Configuration__Group_2__0");
					put(grammarAccess.getConfigurationAccess().getGroup_2_1(), "rule__Configuration__Group_2_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getIntegerValueAccess().getGroup(), "rule__IntegerValue__Group__0");
					put(grammarAccess.getBooleanValueAccess().getGroup(), "rule__BooleanValue__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getBinaryConstraintAccess().getGroup(), "rule__BinaryConstraint__Group__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getSetAccess().getGroup_2(), "rule__Set__Group_2__0");
					put(grammarAccess.getSetAccess().getGroup_2_2(), "rule__Set__Group_2_2__0");
					put(grammarAccess.getUnaryConstraintAccess().getGroup(), "rule__UnaryConstraint__Group__0");
					put(grammarAccess.getRootAccess().getConfiguratorsAssignment_1(), "rule__Root__ConfiguratorsAssignment_1");
					put(grammarAccess.getRootAccess().getExpressionsAssignment_2(), "rule__Root__ExpressionsAssignment_2");
					put(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0(), "rule__Configuration__AssignmentsAssignment_2_0");
					put(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1(), "rule__Configuration__AssignmentsAssignment_2_1_1");
					put(grammarAccess.getAssignmentAccess().getParameterAssignment_1(), "rule__Assignment__ParameterAssignment_1");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_3(), "rule__Assignment__ValueAssignment_3");
					put(grammarAccess.getParameterAccess().getTypeAssignment_1(), "rule__Parameter__TypeAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getStringValueAccess().getTypeAssignment_0(), "rule__StringValue__TypeAssignment_0");
					put(grammarAccess.getStringValueAccess().getNameAssignment_1(), "rule__StringValue__NameAssignment_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment_3(), "rule__StringValue__ValueAssignment_3");
					put(grammarAccess.getIntegerValueAccess().getTypeAssignment_0(), "rule__IntegerValue__TypeAssignment_0");
					put(grammarAccess.getIntegerValueAccess().getNameAssignment_1(), "rule__IntegerValue__NameAssignment_1");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment_3(), "rule__IntegerValue__ValueAssignment_3");
					put(grammarAccess.getBooleanValueAccess().getTypeAssignment_0(), "rule__BooleanValue__TypeAssignment_0");
					put(grammarAccess.getBooleanValueAccess().getNameAssignment_1(), "rule__BooleanValue__NameAssignment_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment_3(), "rule__BooleanValue__ValueAssignment_3");
					put(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1(), "rule__BinaryConstraint__NameAssignment_1");
					put(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_2(), "rule__BinaryConstraint__LeftAssignment_2");
					put(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_3(), "rule__BinaryConstraint__OperatorAssignment_3");
					put(grammarAccess.getBinaryConstraintAccess().getRightAssignment_4(), "rule__BinaryConstraint__RightAssignment_4");
					put(grammarAccess.getSetAccess().getNameAssignment_1(), "rule__Set__NameAssignment_1");
					put(grammarAccess.getSetAccess().getHasAssignment_2_1(), "rule__Set__HasAssignment_2_1");
					put(grammarAccess.getSetAccess().getHasAssignment_2_2_1(), "rule__Set__HasAssignment_2_2_1");
					put(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1(), "rule__UnaryConstraint__NameAssignment_1");
					put(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_2(), "rule__UnaryConstraint__OperatorAssignment_2");
					put(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_3(), "rule__UnaryConstraint__ExpressionAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.cfgdsl.ui.contentassist.antlr.internal.InternalCfgDslParser typedParser = (org.xtext.cfgdsl.ui.contentassist.antlr.internal.InternalCfgDslParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CfgDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CfgDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}