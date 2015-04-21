package org.xtext.cfgdsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.cfgdsl.services.CfgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfgDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'true'", "'false'", "'int'", "'boolean'", "'string'", "'less'", "'greater'", "'equal'", "'multiplication'", "'addition'", "'subset'", "'and'", "'or'", "'cfg'", "','", "'assign'", "'to'", "'param'", "'='", "'-'", "'bc'", "'set'", "'['", "']'", "'uc'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCfgDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCfgDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCfgDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g"; }


     
     	private CfgDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CfgDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRoot"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:61:1: ( ruleRoot EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:76:1: ( rule__Root__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0_in_ruleRoot94);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:89:1: ( ruleExpression EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression121);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:97:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:101:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:102:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:102:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:103:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:104:1: ( rule__Expression__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:104:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression154);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConfiguration"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:118:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:119:1: ( ruleConfiguration EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:120:1: ruleConfiguration EOF
            {
             before(grammarAccess.getConfigurationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_entryRuleConfiguration183);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getConfigurationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguration190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:127:1: ruleConfiguration : ( ( rule__Configuration__Group__0 ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:131:2: ( ( ( rule__Configuration__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:132:1: ( ( rule__Configuration__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:132:1: ( ( rule__Configuration__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:133:1: ( rule__Configuration__Group__0 )
            {
             before(grammarAccess.getConfigurationAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:134:1: ( rule__Configuration__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:134:2: rule__Configuration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration216);
            rule__Configuration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:146:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:147:1: ( ruleAssignment EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:148:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment243);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:155:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:159:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:160:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:160:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:161:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:162:1: ( rule__Assignment__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:162:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0_in_ruleAssignment276);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:174:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:175:1: ( ruleParameter EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:176:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter303);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:183:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:187:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:188:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:188:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:189:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:190:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:190:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0_in_ruleParameter336);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:202:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:203:1: ( ruleEString EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:204:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString363);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:211:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:215:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:216:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:216:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:217:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:218:1: ( rule__EString__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:218:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString396);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:230:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:231:1: ( ruleStringValue EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:232:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue423);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:239:1: ruleStringValue : ( ( rule__StringValue__Group__0 ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:243:2: ( ( ( rule__StringValue__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:244:1: ( ( rule__StringValue__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:244:1: ( ( rule__StringValue__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:245:1: ( rule__StringValue__Group__0 )
            {
             before(grammarAccess.getStringValueAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:246:1: ( rule__StringValue__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:246:2: rule__StringValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__0_in_ruleStringValue456);
            rule__StringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:258:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:259:1: ( ruleIntegerValue EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:260:1: ruleIntegerValue EOF
            {
             before(grammarAccess.getIntegerValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue483);
            ruleIntegerValue();

            state._fsp--;

             after(grammarAccess.getIntegerValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerValue490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:267:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:271:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:272:1: ( ( rule__IntegerValue__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:272:1: ( ( rule__IntegerValue__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:273:1: ( rule__IntegerValue__Group__0 )
            {
             before(grammarAccess.getIntegerValueAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:274:1: ( rule__IntegerValue__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:274:2: rule__IntegerValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue516);
            rule__IntegerValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:286:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:287:1: ( ruleBooleanValue EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:288:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue543);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:295:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:299:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:300:1: ( ( rule__BooleanValue__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:300:1: ( ( rule__BooleanValue__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:301:1: ( rule__BooleanValue__Group__0 )
            {
             before(grammarAccess.getBooleanValueAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:302:1: ( rule__BooleanValue__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:302:2: rule__BooleanValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue576);
            rule__BooleanValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:314:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:315:1: ( ruleEInt EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:316:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt603);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:323:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:327:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:328:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:328:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:329:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:330:1: ( rule__EInt__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:330:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt636);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:342:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:343:1: ( ruleEBoolean EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:344:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean663);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:351:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:355:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:356:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:356:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:357:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:358:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:358:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean696);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleBinaryConstraint"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:370:1: entryRuleBinaryConstraint : ruleBinaryConstraint EOF ;
    public final void entryRuleBinaryConstraint() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:371:1: ( ruleBinaryConstraint EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:372:1: ruleBinaryConstraint EOF
            {
             before(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint723);
            ruleBinaryConstraint();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryConstraint"


    // $ANTLR start "ruleBinaryConstraint"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:379:1: ruleBinaryConstraint : ( ( rule__BinaryConstraint__Alternatives ) ) ;
    public final void ruleBinaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:383:2: ( ( ( rule__BinaryConstraint__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:384:1: ( ( rule__BinaryConstraint__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:384:1: ( ( rule__BinaryConstraint__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:385:1: ( rule__BinaryConstraint__Alternatives )
            {
             before(grammarAccess.getBinaryConstraintAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:1: ( rule__BinaryConstraint__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:2: rule__BinaryConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Alternatives_in_ruleBinaryConstraint756);
            rule__BinaryConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryConstraint"


    // $ANTLR start "entryRuleSet"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:398:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:399:1: ( ruleSet EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:400:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSet_in_entryRuleSet783);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSet790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:407:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:411:2: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:412:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:412:1: ( ( rule__Set__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:413:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:414:1: ( rule__Set__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:414:2: rule__Set__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0_in_ruleSet816);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleUnaryConstraint"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:426:1: entryRuleUnaryConstraint : ruleUnaryConstraint EOF ;
    public final void entryRuleUnaryConstraint() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:427:1: ( ruleUnaryConstraint EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:428:1: ruleUnaryConstraint EOF
            {
             before(grammarAccess.getUnaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint843);
            ruleUnaryConstraint();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryConstraint850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryConstraint"


    // $ANTLR start "ruleUnaryConstraint"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:435:1: ruleUnaryConstraint : ( ( rule__UnaryConstraint__Group__0 ) ) ;
    public final void ruleUnaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:439:2: ( ( ( rule__UnaryConstraint__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:440:1: ( ( rule__UnaryConstraint__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:440:1: ( ( rule__UnaryConstraint__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:441:1: ( rule__UnaryConstraint__Group__0 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:1: ( rule__UnaryConstraint__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:2: rule__UnaryConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__0_in_ruleUnaryConstraint876);
            rule__UnaryConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryConstraint"


    // $ANTLR start "ruleTypeEnum"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:455:1: ruleTypeEnum : ( ( rule__TypeEnum__Alternatives ) ) ;
    public final void ruleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:459:1: ( ( ( rule__TypeEnum__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:460:1: ( ( rule__TypeEnum__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:460:1: ( ( rule__TypeEnum__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:461:1: ( rule__TypeEnum__Alternatives )
            {
             before(grammarAccess.getTypeEnumAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:462:1: ( rule__TypeEnum__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:462:2: rule__TypeEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum913);
            rule__TypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleBinaryOperators"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:474:1: ruleBinaryOperators : ( ( rule__BinaryOperators__Alternatives ) ) ;
    public final void ruleBinaryOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:478:1: ( ( ( rule__BinaryOperators__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:479:1: ( ( rule__BinaryOperators__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:479:1: ( ( rule__BinaryOperators__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:480:1: ( rule__BinaryOperators__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorsAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:481:1: ( rule__BinaryOperators__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:481:2: rule__BinaryOperators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperators__Alternatives_in_ruleBinaryOperators949);
            rule__BinaryOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperators"


    // $ANTLR start "ruleUnaryOperators"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:493:1: ruleUnaryOperators : ( ( 'not' ) ) ;
    public final void ruleUnaryOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:497:1: ( ( ( 'not' ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:498:1: ( ( 'not' ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:498:1: ( ( 'not' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:499:1: ( 'not' )
            {
             before(grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:1: ( 'not' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:3: 'not'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleUnaryOperators986); 

            }

             after(grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperators"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:512:1: rule__Expression__Alternatives : ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:516:1: ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:517:1: ( ruleBinaryConstraint )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:517:1: ( ruleBinaryConstraint )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:518:1: ruleBinaryConstraint
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryConstraintParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_rule__Expression__Alternatives1023);
                    ruleBinaryConstraint();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:523:6: ( ruleParameter )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:523:6: ( ruleParameter )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:524:1: ruleParameter
                    {
                     before(grammarAccess.getExpressionAccess().getParameterParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Expression__Alternatives1040);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:529:6: ( ruleSet )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:529:6: ( ruleSet )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:530:1: ruleSet
                    {
                     before(grammarAccess.getExpressionAccess().getSetParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSet_in_rule__Expression__Alternatives1057);
                    ruleSet();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:535:6: ( ruleStringValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:535:6: ( ruleStringValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:536:1: ruleStringValue
                    {
                     before(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_rule__Expression__Alternatives1074);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:541:6: ( ruleIntegerValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:541:6: ( ruleIntegerValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:542:1: ruleIntegerValue
                    {
                     before(grammarAccess.getExpressionAccess().getIntegerValueParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_rule__Expression__Alternatives1091);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntegerValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:547:6: ( ruleBooleanValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:547:6: ( ruleBooleanValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:548:1: ruleBooleanValue
                    {
                     before(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__Expression__Alternatives1108);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:553:6: ( ruleUnaryConstraint )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:553:6: ( ruleUnaryConstraint )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:554:1: ruleUnaryConstraint
                    {
                     before(grammarAccess.getExpressionAccess().getUnaryConstraintParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_rule__Expression__Alternatives1125);
                    ruleUnaryConstraint();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUnaryConstraintParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:565:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:569:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:570:1: ( RULE_STRING )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:570:1: ( RULE_STRING )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:571:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1158); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:576:6: ( RULE_ID )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:576:6: ( RULE_ID )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:577:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1175); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:587:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:591:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:592:1: ( 'true' )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:592:1: ( 'true' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:593:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1208); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:600:6: ( 'false' )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:600:6: ( 'false' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:601:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives1228); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__BinaryConstraint__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:613:1: rule__BinaryConstraint__Alternatives : ( ( ( rule__BinaryConstraint__Group_0__0 ) ) | ( ( rule__BinaryConstraint__Group_1__0 ) ) );
    public final void rule__BinaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:617:1: ( ( ( rule__BinaryConstraint__Group_0__0 ) ) | ( ( rule__BinaryConstraint__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=12 && LA4_1<=13)) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_ID)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:618:1: ( ( rule__BinaryConstraint__Group_0__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:618:1: ( ( rule__BinaryConstraint__Group_0__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:619:1: ( rule__BinaryConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getBinaryConstraintAccess().getGroup_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:1: ( rule__BinaryConstraint__Group_0__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:2: rule__BinaryConstraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__0_in_rule__BinaryConstraint__Alternatives1262);
                    rule__BinaryConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:624:6: ( ( rule__BinaryConstraint__Group_1__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:624:6: ( ( rule__BinaryConstraint__Group_1__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:625:1: ( rule__BinaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getBinaryConstraintAccess().getGroup_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:626:1: ( rule__BinaryConstraint__Group_1__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:626:2: rule__BinaryConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__0_in_rule__BinaryConstraint__Alternatives1280);
                    rule__BinaryConstraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConstraintAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Alternatives"


    // $ANTLR start "rule__TypeEnum__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:635:1: rule__TypeEnum__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:639:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:640:1: ( ( 'int' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:640:1: ( ( 'int' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:641:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:1: ( 'int' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives1314); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:647:6: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:647:6: ( ( 'boolean' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:649:1: ( 'boolean' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:649:3: 'boolean'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives1335); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:654:6: ( ( 'string' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:654:6: ( ( 'string' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:655:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:656:1: ( 'string' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:656:3: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives1356); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeEnum__Alternatives"


    // $ANTLR start "rule__BinaryOperators__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:666:1: rule__BinaryOperators__Alternatives : ( ( ( 'less' ) ) | ( ( 'greater' ) ) | ( ( 'equal' ) ) | ( ( 'multiplication' ) ) | ( ( 'addition' ) ) | ( ( 'subset' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:670:1: ( ( ( 'less' ) ) | ( ( 'greater' ) ) | ( ( 'equal' ) ) | ( ( 'multiplication' ) ) | ( ( 'addition' ) ) | ( ( 'subset' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 24:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:1: ( ( 'less' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:1: ( ( 'less' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:672:1: ( 'less' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:673:1: ( 'less' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:673:3: 'less'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperators__Alternatives1392); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:6: ( ( 'greater' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:6: ( ( 'greater' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:679:1: ( 'greater' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:680:1: ( 'greater' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:680:3: 'greater'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperators__Alternatives1413); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:685:6: ( ( 'equal' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:685:6: ( ( 'equal' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:686:1: ( 'equal' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:687:1: ( 'equal' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:687:3: 'equal'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperators__Alternatives1434); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:692:6: ( ( 'multiplication' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:692:6: ( ( 'multiplication' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:693:1: ( 'multiplication' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:694:1: ( 'multiplication' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:694:3: 'multiplication'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperators__Alternatives1455); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:699:6: ( ( 'addition' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:699:6: ( ( 'addition' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:700:1: ( 'addition' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:701:1: ( 'addition' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:701:3: 'addition'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperators__Alternatives1476); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:706:6: ( ( 'subset' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:706:6: ( ( 'subset' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:707:1: ( 'subset' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:708:1: ( 'subset' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:708:3: 'subset'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__BinaryOperators__Alternatives1497); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:713:6: ( ( 'and' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:713:6: ( ( 'and' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:714:1: ( 'and' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:715:1: ( 'and' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:715:3: 'and'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__BinaryOperators__Alternatives1518); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:720:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:720:6: ( ( 'or' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:721:1: ( 'or' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:722:1: ( 'or' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:722:3: 'or'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__BinaryOperators__Alternatives1539); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperators__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:734:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:738:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:739:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01572);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01575);
            rule__Root__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:746:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:750:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:751:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:751:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:752:1: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:753:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:755:1: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:765:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:769:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:770:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11633);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11636);
            rule__Root__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:777:1: rule__Root__Group__1__Impl : ( ( rule__Root__ConfiguratorsAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:781:1: ( ( ( rule__Root__ConfiguratorsAssignment_1 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:782:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:782:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:783:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getConfiguratorsAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:784:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:784:2: rule__Root__ConfiguratorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1663);
            	    rule__Root__ConfiguratorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getConfiguratorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:794:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:798:1: ( rule__Root__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:799:2: rule__Root__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21694);
            rule__Root__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:805:1: rule__Root__Group__2__Impl : ( ( rule__Root__ExpressionsAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:809:1: ( ( ( rule__Root__ExpressionsAssignment_2 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:810:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:810:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:811:1: ( rule__Root__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getExpressionsAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:812:1: ( rule__Root__ExpressionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=14 && LA8_0<=16)||LA8_0==29||(LA8_0>=32 && LA8_0<=33)||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:812:2: rule__Root__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1721);
            	    rule__Root__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:828:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:832:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:833:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01758);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01761);
            rule__Configuration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0"


    // $ANTLR start "rule__Configuration__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:840:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:844:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:845:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:845:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:846:1: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:847:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:849:1: 
            {
            }

             after(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__0__Impl"


    // $ANTLR start "rule__Configuration__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:859:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:863:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:864:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11819);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11822);
            rule__Configuration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1"


    // $ANTLR start "rule__Configuration__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:871:1: rule__Configuration__Group__1__Impl : ( 'cfg' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:875:1: ( ( 'cfg' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:876:1: ( 'cfg' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:876:1: ( 'cfg' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:877:1: 'cfg'
            {
             before(grammarAccess.getConfigurationAccess().getCfgKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Configuration__Group__1__Impl1850); 
             after(grammarAccess.getConfigurationAccess().getCfgKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__1__Impl"


    // $ANTLR start "rule__Configuration__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:890:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:894:1: ( rule__Configuration__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:895:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21881);
            rule__Configuration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2"


    // $ANTLR start "rule__Configuration__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:901:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Group_2__0 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:905:1: ( ( ( rule__Configuration__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:906:1: ( ( rule__Configuration__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:906:1: ( ( rule__Configuration__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:907:1: ( rule__Configuration__Group_2__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:908:1: ( rule__Configuration__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:908:2: rule__Configuration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1908);
                    rule__Configuration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigurationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group__2__Impl"


    // $ANTLR start "rule__Configuration__Group_2__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:924:1: rule__Configuration__Group_2__0 : rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 ;
    public final void rule__Configuration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:928:1: ( rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:929:2: rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01945);
            rule__Configuration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01948);
            rule__Configuration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__0"


    // $ANTLR start "rule__Configuration__Group_2__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:936:1: rule__Configuration__Group_2__0__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__Configuration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:940:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:941:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:941:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:942:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:943:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:943:2: rule__Configuration__AssignmentsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl1975);
            rule__Configuration__AssignmentsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:953:1: rule__Configuration__Group_2__1 : rule__Configuration__Group_2__1__Impl ;
    public final void rule__Configuration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:957:1: ( rule__Configuration__Group_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:958:2: rule__Configuration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12005);
            rule__Configuration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__1"


    // $ANTLR start "rule__Configuration__Group_2__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:964:1: rule__Configuration__Group_2__1__Impl : ( ( rule__Configuration__Group_2_1__0 )* ) ;
    public final void rule__Configuration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:968:1: ( ( ( rule__Configuration__Group_2_1__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:969:1: ( ( rule__Configuration__Group_2_1__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:969:1: ( ( rule__Configuration__Group_2_1__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:970:1: ( rule__Configuration__Group_2_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:971:1: ( rule__Configuration__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:971:2: rule__Configuration__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2032);
            	    rule__Configuration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConfigurationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2__1__Impl"


    // $ANTLR start "rule__Configuration__Group_2_1__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:985:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:989:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:990:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02067);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02070);
            rule__Configuration__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__0"


    // $ANTLR start "rule__Configuration__Group_2_1__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:997:1: rule__Configuration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1001:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1002:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1002:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1003:1: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2098); 
             after(grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__0__Impl"


    // $ANTLR start "rule__Configuration__Group_2_1__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1016:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1020:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1021:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12129);
            rule__Configuration__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__1"


    // $ANTLR start "rule__Configuration__Group_2_1__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1027:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1031:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1032:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1032:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1033:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1034:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1034:2: rule__Configuration__AssignmentsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2156);
            rule__Configuration__AssignmentsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__Group_2_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1048:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1052:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1053:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02190);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02193);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1060:1: rule__Assignment__Group__0__Impl : ( 'assign' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1064:1: ( ( 'assign' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1065:1: ( 'assign' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1065:1: ( 'assign' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1066:1: 'assign'
            {
             before(grammarAccess.getAssignmentAccess().getAssignKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Assignment__Group__0__Impl2221); 
             after(grammarAccess.getAssignmentAccess().getAssignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1079:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1083:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1084:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12252);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12255);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1091:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ParameterAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1095:1: ( ( ( rule__Assignment__ParameterAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1096:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1096:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1097:1: ( rule__Assignment__ParameterAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getParameterAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1098:1: ( rule__Assignment__ParameterAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1098:2: rule__Assignment__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2282);
            rule__Assignment__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1108:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1112:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1113:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22312);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22315);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1120:1: rule__Assignment__Group__2__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1124:1: ( ( 'to' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1125:1: ( 'to' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1125:1: ( 'to' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1126:1: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Assignment__Group__2__Impl2343); 
             after(grammarAccess.getAssignmentAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1139:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1143:1: ( rule__Assignment__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1144:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32374);
            rule__Assignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1150:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1154:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1155:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1155:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1156:1: ( rule__Assignment__ValueAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1157:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1157:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2401);
            rule__Assignment__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1175:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1179:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1180:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02439);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02442);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1187:1: rule__Parameter__Group__0__Impl : ( 'param' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1191:1: ( ( 'param' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1192:1: ( 'param' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1192:1: ( 'param' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1193:1: 'param'
            {
             before(grammarAccess.getParameterAccess().getParamKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter__Group__0__Impl2470); 
             after(grammarAccess.getParameterAccess().getParamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1206:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1210:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1211:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12501);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12504);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1218:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1222:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1223:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1223:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1224:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1225:1: ( rule__Parameter__TypeAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1225:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl2531);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1235:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1239:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1240:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22561);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1246:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1250:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1251:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1251:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1252:1: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1253:1: ( rule__Parameter__NameAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1253:2: rule__Parameter__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl2588);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1269:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1273:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1274:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02624);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02627);
            rule__StringValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0"


    // $ANTLR start "rule__StringValue__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1281:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__TypeAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1285:1: ( ( ( rule__StringValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1286:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1286:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1287:1: ( rule__StringValue__TypeAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1288:1: ( rule__StringValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1288:2: rule__StringValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2654);
            rule__StringValue__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__0__Impl"


    // $ANTLR start "rule__StringValue__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1298:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1302:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1303:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12684);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12687);
            rule__StringValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1"


    // $ANTLR start "rule__StringValue__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1310:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__NameAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1314:1: ( ( ( rule__StringValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1315:1: ( ( rule__StringValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1315:1: ( ( rule__StringValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1316:1: ( rule__StringValue__NameAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1317:1: ( rule__StringValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1317:2: rule__StringValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2714);
            rule__StringValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__1__Impl"


    // $ANTLR start "rule__StringValue__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1327:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1331:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1332:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22744);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22747);
            rule__StringValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2"


    // $ANTLR start "rule__StringValue__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1339:1: rule__StringValue__Group__2__Impl : ( '=' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1343:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1344:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1344:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1345:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__StringValue__Group__2__Impl2775); 
             after(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__2__Impl"


    // $ANTLR start "rule__StringValue__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1358:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1362:1: ( rule__StringValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1363:2: rule__StringValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32806);
            rule__StringValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3"


    // $ANTLR start "rule__StringValue__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1369:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__ValueAssignment_3 ) ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1373:1: ( ( ( rule__StringValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1374:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1374:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1375:1: ( rule__StringValue__ValueAssignment_3 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1376:1: ( rule__StringValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1376:2: rule__StringValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2833);
            rule__StringValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__Group__3__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1394:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1398:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1399:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02871);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02874);
            rule__IntegerValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0"


    // $ANTLR start "rule__IntegerValue__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1406:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__TypeAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1410:1: ( ( ( rule__IntegerValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1411:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1411:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1412:1: ( rule__IntegerValue__TypeAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1413:1: ( rule__IntegerValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1413:2: rule__IntegerValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2901);
            rule__IntegerValue__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1423:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1427:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1428:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12931);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12934);
            rule__IntegerValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1"


    // $ANTLR start "rule__IntegerValue__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1435:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__NameAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1439:1: ( ( ( rule__IntegerValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1440:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1440:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1441:1: ( rule__IntegerValue__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1442:1: ( rule__IntegerValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1442:2: rule__IntegerValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2961);
            rule__IntegerValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1__Impl"


    // $ANTLR start "rule__IntegerValue__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1452:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1456:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1457:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22991);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22994);
            rule__IntegerValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2"


    // $ANTLR start "rule__IntegerValue__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1464:1: rule__IntegerValue__Group__2__Impl : ( '=' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1468:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1469:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1469:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1470:1: '='
            {
             before(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__IntegerValue__Group__2__Impl3022); 
             after(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__2__Impl"


    // $ANTLR start "rule__IntegerValue__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1483:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1487:1: ( rule__IntegerValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1488:2: rule__IntegerValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33053);
            rule__IntegerValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3"


    // $ANTLR start "rule__IntegerValue__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1494:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__ValueAssignment_3 ) ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1498:1: ( ( ( rule__IntegerValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1499:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1499:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1500:1: ( rule__IntegerValue__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1501:1: ( rule__IntegerValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1501:2: rule__IntegerValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3080);
            rule__IntegerValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__3__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1519:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1523:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1524:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03118);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03121);
            rule__BooleanValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0"


    // $ANTLR start "rule__BooleanValue__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1531:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TypeAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1535:1: ( ( ( rule__BooleanValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1536:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1536:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1537:1: ( rule__BooleanValue__TypeAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1538:1: ( rule__BooleanValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1538:2: rule__BooleanValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3148);
            rule__BooleanValue__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1548:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1552:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1553:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13178);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13181);
            rule__BooleanValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1"


    // $ANTLR start "rule__BooleanValue__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1560:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__NameAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1564:1: ( ( ( rule__BooleanValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1565:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1565:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1566:1: ( rule__BooleanValue__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1567:1: ( rule__BooleanValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1567:2: rule__BooleanValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3208);
            rule__BooleanValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1577:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1581:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1582:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23238);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23241);
            rule__BooleanValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2"


    // $ANTLR start "rule__BooleanValue__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1589:1: rule__BooleanValue__Group__2__Impl : ( '=' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1593:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1594:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1594:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1595:1: '='
            {
             before(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3269); 
             after(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__2__Impl"


    // $ANTLR start "rule__BooleanValue__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1608:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1612:1: ( rule__BooleanValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1613:2: rule__BooleanValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33300);
            rule__BooleanValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__3"


    // $ANTLR start "rule__BooleanValue__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1619:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__ValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1623:1: ( ( ( rule__BooleanValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1624:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1624:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1625:1: ( rule__BooleanValue__ValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1626:1: ( rule__BooleanValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1626:2: rule__BooleanValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3327);
            rule__BooleanValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1644:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1648:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1649:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03365);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03368);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1656:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1660:1: ( ( ( '-' )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1661:1: ( ( '-' )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1661:1: ( ( '-' )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1662:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1663:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1664:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl3397); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1675:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1679:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1680:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13430);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1686:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1690:1: ( ( RULE_INT ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1691:1: ( RULE_INT )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1691:1: ( RULE_INT )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1692:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3457); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_0__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1707:1: rule__BinaryConstraint__Group_0__0 : rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 ;
    public final void rule__BinaryConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1711:1: ( rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1712:2: rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03490);
            rule__BinaryConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03493);
            rule__BinaryConstraint__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__0"


    // $ANTLR start "rule__BinaryConstraint__Group_0__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1719:1: rule__BinaryConstraint__Group_0__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1723:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1724:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1724:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1725:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryConstraint__Group_0__0__Impl3521); 
             after(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__0__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_0__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1738:1: rule__BinaryConstraint__Group_0__1 : rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 ;
    public final void rule__BinaryConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1742:1: ( rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1743:2: rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13552);
            rule__BinaryConstraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13555);
            rule__BinaryConstraint__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__1"


    // $ANTLR start "rule__BinaryConstraint__Group_0__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1750:1: rule__BinaryConstraint__Group_0__1__Impl : ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) ;
    public final void rule__BinaryConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1754:1: ( ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1755:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1755:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1756:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_0_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1757:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1757:2: rule__BinaryConstraint__NameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3582);
            rule__BinaryConstraint__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__1__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_0__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1767:1: rule__BinaryConstraint__Group_0__2 : rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 ;
    public final void rule__BinaryConstraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1771:1: ( rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1772:2: rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23612);
            rule__BinaryConstraint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23615);
            rule__BinaryConstraint__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__2"


    // $ANTLR start "rule__BinaryConstraint__Group_0__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1779:1: rule__BinaryConstraint__Group_0__2__Impl : ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) ;
    public final void rule__BinaryConstraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1783:1: ( ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1784:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1784:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1785:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_0_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1786:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1786:2: rule__BinaryConstraint__LeftAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3642);
            rule__BinaryConstraint__LeftAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__2__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_0__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1796:1: rule__BinaryConstraint__Group_0__3 : rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 ;
    public final void rule__BinaryConstraint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1800:1: ( rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1801:2: rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33672);
            rule__BinaryConstraint__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33675);
            rule__BinaryConstraint__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__3"


    // $ANTLR start "rule__BinaryConstraint__Group_0__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1808:1: rule__BinaryConstraint__Group_0__3__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) ;
    public final void rule__BinaryConstraint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1812:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1813:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1813:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1814:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_0_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1815:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1815:2: rule__BinaryConstraint__OperatorAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3702);
            rule__BinaryConstraint__OperatorAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__3__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_0__4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1825:1: rule__BinaryConstraint__Group_0__4 : rule__BinaryConstraint__Group_0__4__Impl ;
    public final void rule__BinaryConstraint__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1829:1: ( rule__BinaryConstraint__Group_0__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1830:2: rule__BinaryConstraint__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43732);
            rule__BinaryConstraint__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__4"


    // $ANTLR start "rule__BinaryConstraint__Group_0__4__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1836:1: rule__BinaryConstraint__Group_0__4__Impl : ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) ;
    public final void rule__BinaryConstraint__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1840:1: ( ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1841:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1841:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1842:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_0_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1843:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1843:2: rule__BinaryConstraint__RightAssignment_0_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3759);
            rule__BinaryConstraint__RightAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getRightAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_0__4__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1863:1: rule__BinaryConstraint__Group_1__0 : rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 ;
    public final void rule__BinaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1867:1: ( rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1868:2: rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03799);
            rule__BinaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03802);
            rule__BinaryConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__0"


    // $ANTLR start "rule__BinaryConstraint__Group_1__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1875:1: rule__BinaryConstraint__Group_1__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1879:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1880:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1880:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1881:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryConstraint__Group_1__0__Impl3830); 
             after(grammarAccess.getBinaryConstraintAccess().getBcKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1894:1: rule__BinaryConstraint__Group_1__1 : rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 ;
    public final void rule__BinaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1898:1: ( rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1899:2: rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13861);
            rule__BinaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13864);
            rule__BinaryConstraint__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__1"


    // $ANTLR start "rule__BinaryConstraint__Group_1__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1906:1: rule__BinaryConstraint__Group_1__1__Impl : ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) ;
    public final void rule__BinaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1910:1: ( ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1911:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1911:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1912:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootAssignment_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1913:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1913:2: rule__BinaryConstraint__RootAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3891);
            rule__BinaryConstraint__RootAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getRootAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1923:1: rule__BinaryConstraint__Group_1__2 : rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 ;
    public final void rule__BinaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1927:1: ( rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1928:2: rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23921);
            rule__BinaryConstraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23924);
            rule__BinaryConstraint__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__2"


    // $ANTLR start "rule__BinaryConstraint__Group_1__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1935:1: rule__BinaryConstraint__Group_1__2__Impl : ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) ;
    public final void rule__BinaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1939:1: ( ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1940:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1940:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1941:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1942:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1942:2: rule__BinaryConstraint__NameAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3951);
            rule__BinaryConstraint__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1952:1: rule__BinaryConstraint__Group_1__3 : rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 ;
    public final void rule__BinaryConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1956:1: ( rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1957:2: rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33981);
            rule__BinaryConstraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33984);
            rule__BinaryConstraint__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__3"


    // $ANTLR start "rule__BinaryConstraint__Group_1__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1964:1: rule__BinaryConstraint__Group_1__3__Impl : ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) ;
    public final void rule__BinaryConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1968:1: ( ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1969:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1969:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1970:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_1_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1971:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1971:2: rule__BinaryConstraint__LeftAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl4011);
            rule__BinaryConstraint__LeftAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__3__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1981:1: rule__BinaryConstraint__Group_1__4 : rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 ;
    public final void rule__BinaryConstraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1985:1: ( rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1986:2: rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44041);
            rule__BinaryConstraint__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44044);
            rule__BinaryConstraint__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__4"


    // $ANTLR start "rule__BinaryConstraint__Group_1__4__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1993:1: rule__BinaryConstraint__Group_1__4__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) ;
    public final void rule__BinaryConstraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1997:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1998:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1998:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1999:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_1_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2000:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2000:2: rule__BinaryConstraint__OperatorAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4071);
            rule__BinaryConstraint__OperatorAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__4__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group_1__5"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2010:1: rule__BinaryConstraint__Group_1__5 : rule__BinaryConstraint__Group_1__5__Impl ;
    public final void rule__BinaryConstraint__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2014:1: ( rule__BinaryConstraint__Group_1__5__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2015:2: rule__BinaryConstraint__Group_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54101);
            rule__BinaryConstraint__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__5"


    // $ANTLR start "rule__BinaryConstraint__Group_1__5__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2021:1: rule__BinaryConstraint__Group_1__5__Impl : ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) ;
    public final void rule__BinaryConstraint__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2025:1: ( ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2026:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2026:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2027:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_1_5()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2028:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2028:2: rule__BinaryConstraint__RightAssignment_1_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4128);
            rule__BinaryConstraint__RightAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getRightAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__Group_1__5__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2050:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2054:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2055:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04170);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04173);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2062:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2066:1: ( ( 'set' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2067:1: ( 'set' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2067:1: ( 'set' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2068:1: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Set__Group__0__Impl4201); 
             after(grammarAccess.getSetAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2081:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2085:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2086:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14232);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14235);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2093:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2097:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2098:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2098:1: ( ( rule__Set__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2099:1: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2100:1: ( rule__Set__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2100:2: rule__Set__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4262);
            rule__Set__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2110:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2114:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2115:2: rule__Set__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24292);
            rule__Set__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2121:1: rule__Set__Group__2__Impl : ( ( rule__Set__Group_2__0 )? ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2125:1: ( ( ( rule__Set__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2126:1: ( ( rule__Set__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2126:1: ( ( rule__Set__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2127:1: ( rule__Set__Group_2__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2128:1: ( rule__Set__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2128:2: rule__Set__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl4319);
                    rule__Set__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group_2__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2144:1: rule__Set__Group_2__0 : rule__Set__Group_2__0__Impl rule__Set__Group_2__1 ;
    public final void rule__Set__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( rule__Set__Group_2__0__Impl rule__Set__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2149:2: rule__Set__Group_2__0__Impl rule__Set__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__04356);
            rule__Set__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__04359);
            rule__Set__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0"


    // $ANTLR start "rule__Set__Group_2__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2156:1: rule__Set__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2160:1: ( ( '[' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2161:1: ( '[' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2161:1: ( '[' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2162:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Set__Group_2__0__Impl4387); 
             after(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__0__Impl"


    // $ANTLR start "rule__Set__Group_2__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2175:1: rule__Set__Group_2__1 : rule__Set__Group_2__1__Impl rule__Set__Group_2__2 ;
    public final void rule__Set__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2179:1: ( rule__Set__Group_2__1__Impl rule__Set__Group_2__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2180:2: rule__Set__Group_2__1__Impl rule__Set__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__14418);
            rule__Set__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__14421);
            rule__Set__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1"


    // $ANTLR start "rule__Set__Group_2__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2187:1: rule__Set__Group_2__1__Impl : ( ( rule__Set__HasAssignment_2_1 ) ) ;
    public final void rule__Set__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2191:1: ( ( ( rule__Set__HasAssignment_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2192:1: ( ( rule__Set__HasAssignment_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2192:1: ( ( rule__Set__HasAssignment_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2193:1: ( rule__Set__HasAssignment_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2194:1: ( rule__Set__HasAssignment_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2194:2: rule__Set__HasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4448);
            rule__Set__HasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getHasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__1__Impl"


    // $ANTLR start "rule__Set__Group_2__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2204:1: rule__Set__Group_2__2 : rule__Set__Group_2__2__Impl rule__Set__Group_2__3 ;
    public final void rule__Set__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2208:1: ( rule__Set__Group_2__2__Impl rule__Set__Group_2__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2209:2: rule__Set__Group_2__2__Impl rule__Set__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24478);
            rule__Set__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24481);
            rule__Set__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__2"


    // $ANTLR start "rule__Set__Group_2__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2216:1: rule__Set__Group_2__2__Impl : ( ( rule__Set__Group_2_2__0 )* ) ;
    public final void rule__Set__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2220:1: ( ( ( rule__Set__Group_2_2__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2221:1: ( ( rule__Set__Group_2_2__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2221:1: ( ( rule__Set__Group_2_2__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2222:1: ( rule__Set__Group_2_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_2_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2223:1: ( rule__Set__Group_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2223:2: rule__Set__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4508);
            	    rule__Set__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__2__Impl"


    // $ANTLR start "rule__Set__Group_2__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2233:1: rule__Set__Group_2__3 : rule__Set__Group_2__3__Impl ;
    public final void rule__Set__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2237:1: ( rule__Set__Group_2__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2238:2: rule__Set__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34539);
            rule__Set__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__3"


    // $ANTLR start "rule__Set__Group_2__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2244:1: rule__Set__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Set__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2248:1: ( ( ']' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2249:1: ( ']' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2249:1: ( ']' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2250:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Set__Group_2__3__Impl4567); 
             after(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2__3__Impl"


    // $ANTLR start "rule__Set__Group_2_2__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2271:1: rule__Set__Group_2_2__0 : rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 ;
    public final void rule__Set__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2275:1: ( rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2276:2: rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04606);
            rule__Set__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04609);
            rule__Set__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__0"


    // $ANTLR start "rule__Set__Group_2_2__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2283:1: rule__Set__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2287:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2288:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2288:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2289:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4637); 
             after(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__0__Impl"


    // $ANTLR start "rule__Set__Group_2_2__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2302:1: rule__Set__Group_2_2__1 : rule__Set__Group_2_2__1__Impl ;
    public final void rule__Set__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2306:1: ( rule__Set__Group_2_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2307:2: rule__Set__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14668);
            rule__Set__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__1"


    // $ANTLR start "rule__Set__Group_2_2__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2313:1: rule__Set__Group_2_2__1__Impl : ( ( rule__Set__HasAssignment_2_2_1 ) ) ;
    public final void rule__Set__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2317:1: ( ( ( rule__Set__HasAssignment_2_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2318:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2318:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2319:1: ( rule__Set__HasAssignment_2_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2320:1: ( rule__Set__HasAssignment_2_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2320:2: rule__Set__HasAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4695);
            rule__Set__HasAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getHasAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_2_2__1__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2334:1: rule__UnaryConstraint__Group__0 : rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 ;
    public final void rule__UnaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2338:1: ( rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2339:2: rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04729);
            rule__UnaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04732);
            rule__UnaryConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__0"


    // $ANTLR start "rule__UnaryConstraint__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2346:1: rule__UnaryConstraint__Group__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2350:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2351:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2351:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2352:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4760); 
             after(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__0__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2365:1: rule__UnaryConstraint__Group__1 : rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 ;
    public final void rule__UnaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2369:1: ( rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2370:2: rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14791);
            rule__UnaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14794);
            rule__UnaryConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__1"


    // $ANTLR start "rule__UnaryConstraint__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2377:1: rule__UnaryConstraint__Group__1__Impl : ( ( rule__UnaryConstraint__NameAssignment_1 ) ) ;
    public final void rule__UnaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2381:1: ( ( ( rule__UnaryConstraint__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2382:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2382:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2383:1: ( rule__UnaryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2384:1: ( rule__UnaryConstraint__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2384:2: rule__UnaryConstraint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4821);
            rule__UnaryConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__1__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2394:1: rule__UnaryConstraint__Group__2 : rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 ;
    public final void rule__UnaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2398:1: ( rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2399:2: rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24851);
            rule__UnaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24854);
            rule__UnaryConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__2"


    // $ANTLR start "rule__UnaryConstraint__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:1: rule__UnaryConstraint__Group__2__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) ;
    public final void rule__UnaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2410:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2411:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2411:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2412:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2413:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2413:2: rule__UnaryConstraint__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4881);
            rule__UnaryConstraint__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__2__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2423:1: rule__UnaryConstraint__Group__3 : rule__UnaryConstraint__Group__3__Impl ;
    public final void rule__UnaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2427:1: ( rule__UnaryConstraint__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2428:2: rule__UnaryConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34911);
            rule__UnaryConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__3"


    // $ANTLR start "rule__UnaryConstraint__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2434:1: rule__UnaryConstraint__Group__3__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) ;
    public final void rule__UnaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2438:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2439:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2439:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2440:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2441:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2441:2: rule__UnaryConstraint__ExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4938);
            rule__UnaryConstraint__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group__3__Impl"


    // $ANTLR start "rule__Root__ConfiguratorsAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2460:1: rule__Root__ConfiguratorsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Root__ConfiguratorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2464:1: ( ( ruleConfiguration ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:1: ( ruleConfiguration )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:1: ( ruleConfiguration )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2466:1: ruleConfiguration
            {
             before(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14981);
            ruleConfiguration();

            state._fsp--;

             after(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ConfiguratorsAssignment_1"


    // $ANTLR start "rule__Root__ExpressionsAssignment_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2475:1: rule__Root__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Root__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2479:1: ( ( ruleExpression ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2480:1: ( ruleExpression )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2480:1: ( ruleExpression )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2481:1: ruleExpression
            {
             before(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25012);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ExpressionsAssignment_2"


    // $ANTLR start "rule__Configuration__AssignmentsAssignment_2_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2490:1: rule__Configuration__AssignmentsAssignment_2_0 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2494:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2495:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2495:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2496:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05043);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__AssignmentsAssignment_2_0"


    // $ANTLR start "rule__Configuration__AssignmentsAssignment_2_1_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2505:1: rule__Configuration__AssignmentsAssignment_2_1_1 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2509:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2510:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2510:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2511:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15074);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration__AssignmentsAssignment_2_1_1"


    // $ANTLR start "rule__Assignment__ParameterAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2520:1: rule__Assignment__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2524:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2525:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2525:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2526:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2527:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2528:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15109);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ParameterAssignment_1"


    // $ANTLR start "rule__Assignment__ValueAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2539:1: rule__Assignment__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2543:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2544:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2544:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2545:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2546:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2547:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35148);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_3"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2558:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeEnum ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2562:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2563:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2563:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2564:1: ruleTypeEnum
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_15183);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2573:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2577:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2578:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2578:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2579:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_25214);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__StringValue__TypeAssignment_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2588:1: rule__StringValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__StringValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2592:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2593:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2593:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2594:1: ruleTypeEnum
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05245);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__TypeAssignment_0"


    // $ANTLR start "rule__StringValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2603:1: rule__StringValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2607:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2608:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2608:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2609:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15276);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__NameAssignment_1"


    // $ANTLR start "rule__StringValue__ValueAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2618:1: rule__StringValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2622:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2623:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2623:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2624:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35307);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment_3"


    // $ANTLR start "rule__IntegerValue__TypeAssignment_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2633:1: rule__IntegerValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__IntegerValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2637:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2638:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2638:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2639:1: ruleTypeEnum
            {
             before(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05338);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__TypeAssignment_0"


    // $ANTLR start "rule__IntegerValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2648:1: rule__IntegerValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2652:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2653:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2653:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2654:1: ruleEString
            {
             before(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15369);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__NameAssignment_1"


    // $ANTLR start "rule__IntegerValue__ValueAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2663:1: rule__IntegerValue__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2667:1: ( ( ruleEInt ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2668:1: ( ruleEInt )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2668:1: ( ruleEInt )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2669:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35400);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__ValueAssignment_3"


    // $ANTLR start "rule__BooleanValue__TypeAssignment_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2678:1: rule__BooleanValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__BooleanValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2682:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2683:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2683:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2684:1: ruleTypeEnum
            {
             before(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05431);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__TypeAssignment_0"


    // $ANTLR start "rule__BooleanValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2693:1: rule__BooleanValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2697:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2698:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2698:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2699:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15462);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__NameAssignment_1"


    // $ANTLR start "rule__BooleanValue__ValueAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2708:1: rule__BooleanValue__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2712:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2713:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2713:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2714:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35493);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment_3"


    // $ANTLR start "rule__BinaryConstraint__NameAssignment_0_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2723:1: rule__BinaryConstraint__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2727:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2728:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2728:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2729:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15524);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__NameAssignment_0_1"


    // $ANTLR start "rule__BinaryConstraint__LeftAssignment_0_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2738:1: rule__BinaryConstraint__LeftAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2742:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2743:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2743:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2744:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_0_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2745:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2746:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25559);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__LeftAssignment_0_2"


    // $ANTLR start "rule__BinaryConstraint__OperatorAssignment_0_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2757:1: rule__BinaryConstraint__OperatorAssignment_0_3 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2761:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2762:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2762:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2763:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_0_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35594);
            ruleBinaryOperators();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__OperatorAssignment_0_3"


    // $ANTLR start "rule__BinaryConstraint__RightAssignment_0_4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2772:1: rule__BinaryConstraint__RightAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2776:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2777:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2777:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2778:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_0_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2779:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2780:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_0_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45629);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__RightAssignment_0_4"


    // $ANTLR start "rule__BinaryConstraint__RootAssignment_1_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2791:1: rule__BinaryConstraint__RootAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__BinaryConstraint__RootAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2795:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2796:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2796:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2797:1: ruleEBoolean
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_15664);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__RootAssignment_1_1"


    // $ANTLR start "rule__BinaryConstraint__NameAssignment_1_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2806:1: rule__BinaryConstraint__NameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2810:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2811:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2811:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2812:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_25695);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__NameAssignment_1_2"


    // $ANTLR start "rule__BinaryConstraint__LeftAssignment_1_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2821:1: rule__BinaryConstraint__LeftAssignment_1_3 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2825:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2826:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2826:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2827:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_1_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2828:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2829:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_1_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_35730);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__LeftAssignment_1_3"


    // $ANTLR start "rule__BinaryConstraint__OperatorAssignment_1_4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2840:1: rule__BinaryConstraint__OperatorAssignment_1_4 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2844:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2845:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2845:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2846:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_45765);
            ruleBinaryOperators();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__OperatorAssignment_1_4"


    // $ANTLR start "rule__BinaryConstraint__RightAssignment_1_5"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2855:1: rule__BinaryConstraint__RightAssignment_1_5 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2859:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2860:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2860:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2861:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_1_5_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2862:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2863:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_1_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_55800);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_1_5_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryConstraint__RightAssignment_1_5"


    // $ANTLR start "rule__Set__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2874:1: rule__Set__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2878:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2879:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2879:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2880:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__NameAssignment_15835);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__NameAssignment_1"


    // $ANTLR start "rule__Set__HasAssignment_2_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2889:1: rule__Set__HasAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2893:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2894:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2894:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2895:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2896:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2897:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15870);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getHasValueCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__HasAssignment_2_1"


    // $ANTLR start "rule__Set__HasAssignment_2_2_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2908:1: rule__Set__HasAssignment_2_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2912:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2913:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2913:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2914:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2915:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2916:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15909);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getHasValueCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__HasAssignment_2_2_1"


    // $ANTLR start "rule__UnaryConstraint__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2927:1: rule__UnaryConstraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2931:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2932:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2932:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2933:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15944);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__NameAssignment_1"


    // $ANTLR start "rule__UnaryConstraint__OperatorAssignment_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2942:1: rule__UnaryConstraint__OperatorAssignment_2 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2946:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2947:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2947:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2948:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25975);
            ruleUnaryOperators();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__OperatorAssignment_2"


    // $ANTLR start "rule__UnaryConstraint__ExpressionAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2957:1: rule__UnaryConstraint__ExpressionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2961:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2962:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2962:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2963:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2964:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2965:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_36010);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__ExpressionAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\16\3\uffff\3\4\1\uffff\2\36\1\4\3\uffff";
    static final String DFA1_maxS =
        "\1\44\3\uffff\3\5\1\uffff\2\36\1\37\3\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\3\uffff\1\6\1\5\1\4";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\5\1\6\14\uffff\1\2\2\uffff\1\1\1\3\2\uffff\1\7",
            "",
            "",
            "",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            "\1\12",
            "\1\12",
            "\2\15\1\14\5\uffff\2\13\21\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "512:1: rule__Expression__Alternatives : ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__0_in_ruleConfiguration216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__0_in_ruleStringValue456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0_in_ruleIntegerValue516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0_in_ruleBooleanValue576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Alternatives_in_ruleBinaryConstraint756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_entryRuleSet783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSet790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleSet816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryConstraint850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__0_in_ruleUnaryConstraint876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperators__Alternatives_in_ruleBinaryOperators949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleUnaryOperators986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_rule__Expression__Alternatives1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Expression__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_rule__Expression__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_rule__Expression__Alternatives1074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Expression__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Expression__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_rule__Expression__Alternatives1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__0_in_rule__BinaryConstraint__Alternatives1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__0_in_rule__BinaryConstraint__Alternatives1280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperators__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperators__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperators__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperators__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperators__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BinaryOperators__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BinaryOperators__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BinaryOperators__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01572 = new BitSet(new long[]{0x000000132201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11633 = new BitSet(new long[]{0x000000132201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1663 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1721 = new BitSet(new long[]{0x000000132001C002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01758 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11819 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Configuration__Group__1__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01945 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2032 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02067 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Assignment__Group__0__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12252 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22312 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Assignment__Group__2__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02439 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter__Group__0__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12684 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__StringValue__Group__2__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02871 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12931 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22991 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__IntegerValue__Group__2__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03118 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13178 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23238 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03365 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl3397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03490 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryConstraint__Group_0__0__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13552 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23612 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33672 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03799 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryConstraint__Group_1__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13861 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23921 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33981 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44041 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Set__Group__0__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14232 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__04356 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__04359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Set__Group_2__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__14418 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__14421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24478 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4508 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Set__Group_2__3__Impl4567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04606 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04729 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14791 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24851 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_15183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_25214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_15664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_25695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_35730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_45765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_55800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__NameAssignment_15835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_36010 = new BitSet(new long[]{0x0000000000000002L});
    }


}