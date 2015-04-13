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
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:379:1: ruleBinaryConstraint : ( ( rule__BinaryConstraint__Group__0 ) ) ;
    public final void ruleBinaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:383:2: ( ( ( rule__BinaryConstraint__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:384:1: ( ( rule__BinaryConstraint__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:384:1: ( ( rule__BinaryConstraint__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:385:1: ( rule__BinaryConstraint__Group__0 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:1: ( rule__BinaryConstraint__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:2: rule__BinaryConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__0_in_ruleBinaryConstraint756);
            rule__BinaryConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getGroup()); 

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
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            case 15:
                {
                alt1=6;
                }
                break;
            case 36:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

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


    // $ANTLR start "rule__TypeEnum__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:613:1: rule__TypeEnum__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:617:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:618:1: ( ( 'int' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:618:1: ( ( 'int' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:619:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:1: ( 'int' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives1263); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:625:6: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:625:6: ( ( 'boolean' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:626:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:627:1: ( 'boolean' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:627:3: 'boolean'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives1284); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:632:6: ( ( 'string' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:632:6: ( ( 'string' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:633:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:634:1: ( 'string' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:634:3: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives1305); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:644:1: rule__BinaryOperators__Alternatives : ( ( ( 'less' ) ) | ( ( 'greater' ) ) | ( ( 'equal' ) ) | ( ( 'multiplication' ) ) | ( ( 'addition' ) ) | ( ( 'subset' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:1: ( ( ( 'less' ) ) | ( ( 'greater' ) ) | ( ( 'equal' ) ) | ( ( 'multiplication' ) ) | ( ( 'addition' ) ) | ( ( 'subset' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:649:1: ( ( 'less' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:649:1: ( ( 'less' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:650:1: ( 'less' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:651:1: ( 'less' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:651:3: 'less'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperators__Alternatives1341); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:656:6: ( ( 'greater' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:656:6: ( ( 'greater' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:657:1: ( 'greater' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:658:1: ( 'greater' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:658:3: 'greater'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperators__Alternatives1362); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:663:6: ( ( 'equal' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:663:6: ( ( 'equal' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:664:1: ( 'equal' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:665:1: ( 'equal' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:665:3: 'equal'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperators__Alternatives1383); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:670:6: ( ( 'multiplication' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:670:6: ( ( 'multiplication' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:1: ( 'multiplication' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:672:1: ( 'multiplication' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:672:3: 'multiplication'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperators__Alternatives1404); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:677:6: ( ( 'addition' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:677:6: ( ( 'addition' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:1: ( 'addition' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:679:1: ( 'addition' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:679:3: 'addition'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperators__Alternatives1425); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:684:6: ( ( 'subset' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:684:6: ( ( 'subset' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:685:1: ( 'subset' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:686:1: ( 'subset' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:686:3: 'subset'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__BinaryOperators__Alternatives1446); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:691:6: ( ( 'and' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:691:6: ( ( 'and' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:692:1: ( 'and' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:693:1: ( 'and' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:693:3: 'and'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__BinaryOperators__Alternatives1467); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:698:6: ( ( 'or' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:698:6: ( ( 'or' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:699:1: ( 'or' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:700:1: ( 'or' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:700:3: 'or'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__BinaryOperators__Alternatives1488); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:712:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:716:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:717:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01521);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01524);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:724:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:728:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:729:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:729:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:730:1: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:731:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:733:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:743:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:747:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:748:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11582);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11585);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:755:1: rule__Root__Group__1__Impl : ( ( rule__Root__ConfiguratorsAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:759:1: ( ( ( rule__Root__ConfiguratorsAssignment_1 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:760:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:760:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:761:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getConfiguratorsAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:762:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:762:2: rule__Root__ConfiguratorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1612);
            	    rule__Root__ConfiguratorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:772:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:776:1: ( rule__Root__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:777:2: rule__Root__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21643);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:783:1: rule__Root__Group__2__Impl : ( ( rule__Root__ExpressionsAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:787:1: ( ( ( rule__Root__ExpressionsAssignment_2 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:788:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:788:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:789:1: ( rule__Root__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getExpressionsAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:790:1: ( rule__Root__ExpressionsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=16)||LA7_0==29||(LA7_0>=32 && LA7_0<=33)||LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:790:2: rule__Root__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1670);
            	    rule__Root__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:806:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:810:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:811:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01707);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01710);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:818:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:822:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:823:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:823:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:824:1: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:825:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:827:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:837:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:841:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:842:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11768);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11771);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:849:1: rule__Configuration__Group__1__Impl : ( 'cfg' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:853:1: ( ( 'cfg' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:854:1: ( 'cfg' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:854:1: ( 'cfg' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:855:1: 'cfg'
            {
             before(grammarAccess.getConfigurationAccess().getCfgKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Configuration__Group__1__Impl1799); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:868:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:872:1: ( rule__Configuration__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:873:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21830);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:879:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Group_2__0 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:883:1: ( ( ( rule__Configuration__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:884:1: ( ( rule__Configuration__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:884:1: ( ( rule__Configuration__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:885:1: ( rule__Configuration__Group_2__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:886:1: ( rule__Configuration__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:886:2: rule__Configuration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1857);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:902:1: rule__Configuration__Group_2__0 : rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 ;
    public final void rule__Configuration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:906:1: ( rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:907:2: rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01894);
            rule__Configuration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01897);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:914:1: rule__Configuration__Group_2__0__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__Configuration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:918:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:919:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:919:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:920:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:921:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:921:2: rule__Configuration__AssignmentsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl1924);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:931:1: rule__Configuration__Group_2__1 : rule__Configuration__Group_2__1__Impl ;
    public final void rule__Configuration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:935:1: ( rule__Configuration__Group_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:936:2: rule__Configuration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__11954);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:942:1: rule__Configuration__Group_2__1__Impl : ( ( rule__Configuration__Group_2_1__0 )* ) ;
    public final void rule__Configuration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:946:1: ( ( ( rule__Configuration__Group_2_1__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:947:1: ( ( rule__Configuration__Group_2_1__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:947:1: ( ( rule__Configuration__Group_2_1__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:948:1: ( rule__Configuration__Group_2_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:949:1: ( rule__Configuration__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:949:2: rule__Configuration__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl1981);
            	    rule__Configuration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:963:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:967:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:968:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02016);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02019);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:975:1: rule__Configuration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:979:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:980:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:980:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:981:1: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2047); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:994:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:998:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:999:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12078);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1005:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1009:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1010:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1010:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1011:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1012:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1012:2: rule__Configuration__AssignmentsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2105);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1026:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1030:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1031:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02139);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02142);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1038:1: rule__Assignment__Group__0__Impl : ( 'assign' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1042:1: ( ( 'assign' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1043:1: ( 'assign' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1043:1: ( 'assign' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1044:1: 'assign'
            {
             before(grammarAccess.getAssignmentAccess().getAssignKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Assignment__Group__0__Impl2170); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1057:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1061:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1062:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12201);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12204);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1069:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ParameterAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1073:1: ( ( ( rule__Assignment__ParameterAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1074:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1074:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1075:1: ( rule__Assignment__ParameterAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getParameterAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1076:1: ( rule__Assignment__ParameterAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1076:2: rule__Assignment__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2231);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1086:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1090:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1091:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22261);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22264);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1098:1: rule__Assignment__Group__2__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1102:1: ( ( 'to' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1103:1: ( 'to' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1103:1: ( 'to' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1104:1: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Assignment__Group__2__Impl2292); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1117:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1121:1: ( rule__Assignment__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1122:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32323);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1128:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1132:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1133:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1133:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1134:1: ( rule__Assignment__ValueAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1135:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1135:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2350);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1153:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1157:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1158:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02388);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02391);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1165:1: rule__Parameter__Group__0__Impl : ( 'param' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1169:1: ( ( 'param' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1170:1: ( 'param' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1170:1: ( 'param' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1171:1: 'param'
            {
             before(grammarAccess.getParameterAccess().getParamKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Parameter__Group__0__Impl2419); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1184:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1188:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1189:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12450);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12453);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1196:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1200:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1201:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1201:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1202:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1203:1: ( rule__Parameter__TypeAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1203:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl2480);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1213:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1217:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1218:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22510);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1224:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1228:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1229:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1229:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1230:1: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1231:1: ( rule__Parameter__NameAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1231:2: rule__Parameter__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl2537);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1247:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1251:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1252:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02573);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02576);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1259:1: rule__StringValue__Group__0__Impl : ( 'string' ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1263:1: ( ( 'string' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1264:1: ( 'string' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1264:1: ( 'string' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1265:1: 'string'
            {
             before(grammarAccess.getStringValueAccess().getStringKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__StringValue__Group__0__Impl2604); 
             after(grammarAccess.getStringValueAccess().getStringKeyword_0()); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1278:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1282:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1283:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12635);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12638);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1290:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__NameAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1294:1: ( ( ( rule__StringValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1295:1: ( ( rule__StringValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1295:1: ( ( rule__StringValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1296:1: ( rule__StringValue__NameAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1297:1: ( rule__StringValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1297:2: rule__StringValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2665);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1307:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1311:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1312:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22695);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22698);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1319:1: rule__StringValue__Group__2__Impl : ( '=' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1323:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1324:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1324:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1325:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__StringValue__Group__2__Impl2726); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1338:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1342:1: ( rule__StringValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1343:2: rule__StringValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32757);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1349:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__ValueAssignment_3 ) ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1353:1: ( ( ( rule__StringValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1354:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1354:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1355:1: ( rule__StringValue__ValueAssignment_3 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1356:1: ( rule__StringValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1356:2: rule__StringValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2784);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1374:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1378:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1379:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02822);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02825);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1386:1: rule__IntegerValue__Group__0__Impl : ( 'int' ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1390:1: ( ( 'int' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1391:1: ( 'int' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1391:1: ( 'int' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1392:1: 'int'
            {
             before(grammarAccess.getIntegerValueAccess().getIntKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__IntegerValue__Group__0__Impl2853); 
             after(grammarAccess.getIntegerValueAccess().getIntKeyword_0()); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1405:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1409:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1410:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12884);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12887);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1417:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__NameAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1421:1: ( ( ( rule__IntegerValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1422:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1422:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1423:1: ( rule__IntegerValue__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1424:1: ( rule__IntegerValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1424:2: rule__IntegerValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2914);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1434:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1438:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1439:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22944);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22947);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1446:1: rule__IntegerValue__Group__2__Impl : ( '=' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1450:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1451:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1451:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1452:1: '='
            {
             before(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__IntegerValue__Group__2__Impl2975); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1465:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1469:1: ( rule__IntegerValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1470:2: rule__IntegerValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33006);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1476:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__ValueAssignment_3 ) ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1480:1: ( ( ( rule__IntegerValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1481:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1481:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1482:1: ( rule__IntegerValue__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1483:1: ( rule__IntegerValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1483:2: rule__IntegerValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3033);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1501:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1505:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1506:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03071);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03074);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1513:1: rule__BooleanValue__Group__0__Impl : ( 'boolean' ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1517:1: ( ( 'boolean' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1518:1: ( 'boolean' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1518:1: ( 'boolean' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1519:1: 'boolean'
            {
             before(grammarAccess.getBooleanValueAccess().getBooleanKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__BooleanValue__Group__0__Impl3102); 
             after(grammarAccess.getBooleanValueAccess().getBooleanKeyword_0()); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1532:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1536:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1537:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13133);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13136);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1544:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__NameAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1548:1: ( ( ( rule__BooleanValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1549:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1549:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1550:1: ( rule__BooleanValue__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1551:1: ( rule__BooleanValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1551:2: rule__BooleanValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3163);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1561:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1565:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1566:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23193);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23196);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1573:1: rule__BooleanValue__Group__2__Impl : ( '=' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1577:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1578:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1578:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1579:1: '='
            {
             before(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3224); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1592:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1596:1: ( rule__BooleanValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1597:2: rule__BooleanValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33255);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1603:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__ValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1607:1: ( ( ( rule__BooleanValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1608:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1608:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1609:1: ( rule__BooleanValue__ValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1610:1: ( rule__BooleanValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1610:2: rule__BooleanValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3282);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1628:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1632:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1633:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03320);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03323);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1640:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1644:1: ( ( ( '-' )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1645:1: ( ( '-' )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1645:1: ( ( '-' )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1646:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1647:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1648:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl3352); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1659:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1663:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1664:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13385);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1670:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1674:1: ( ( RULE_INT ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1675:1: ( RULE_INT )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1675:1: ( RULE_INT )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1676:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3412); 
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


    // $ANTLR start "rule__BinaryConstraint__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1691:1: rule__BinaryConstraint__Group__0 : rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 ;
    public final void rule__BinaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1695:1: ( rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1696:2: rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__03445);
            rule__BinaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__03448);
            rule__BinaryConstraint__Group__1();

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
    // $ANTLR end "rule__BinaryConstraint__Group__0"


    // $ANTLR start "rule__BinaryConstraint__Group__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1703:1: rule__BinaryConstraint__Group__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1707:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1708:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1708:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1709:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl3476); 
             after(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__0__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1722:1: rule__BinaryConstraint__Group__1 : rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 ;
    public final void rule__BinaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1726:1: ( rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1727:2: rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__13507);
            rule__BinaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__13510);
            rule__BinaryConstraint__Group__2();

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
    // $ANTLR end "rule__BinaryConstraint__Group__1"


    // $ANTLR start "rule__BinaryConstraint__Group__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1734:1: rule__BinaryConstraint__Group__1__Impl : ( ( rule__BinaryConstraint__NameAssignment_1 ) ) ;
    public final void rule__BinaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1738:1: ( ( ( rule__BinaryConstraint__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1739:1: ( ( rule__BinaryConstraint__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1739:1: ( ( rule__BinaryConstraint__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1740:1: ( rule__BinaryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1741:1: ( rule__BinaryConstraint__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1741:2: rule__BinaryConstraint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_1_in_rule__BinaryConstraint__Group__1__Impl3537);
            rule__BinaryConstraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__1__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1751:1: rule__BinaryConstraint__Group__2 : rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 ;
    public final void rule__BinaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1755:1: ( rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1756:2: rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__23567);
            rule__BinaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__23570);
            rule__BinaryConstraint__Group__3();

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
    // $ANTLR end "rule__BinaryConstraint__Group__2"


    // $ANTLR start "rule__BinaryConstraint__Group__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1763:1: rule__BinaryConstraint__Group__2__Impl : ( ( rule__BinaryConstraint__LeftAssignment_2 ) ) ;
    public final void rule__BinaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1767:1: ( ( ( rule__BinaryConstraint__LeftAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1768:1: ( ( rule__BinaryConstraint__LeftAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1768:1: ( ( rule__BinaryConstraint__LeftAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1769:1: ( rule__BinaryConstraint__LeftAssignment_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1770:1: ( rule__BinaryConstraint__LeftAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1770:2: rule__BinaryConstraint__LeftAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_2_in_rule__BinaryConstraint__Group__2__Impl3597);
            rule__BinaryConstraint__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_2()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__2__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1780:1: rule__BinaryConstraint__Group__3 : rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 ;
    public final void rule__BinaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1784:1: ( rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1785:2: rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__33627);
            rule__BinaryConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__33630);
            rule__BinaryConstraint__Group__4();

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
    // $ANTLR end "rule__BinaryConstraint__Group__3"


    // $ANTLR start "rule__BinaryConstraint__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1792:1: rule__BinaryConstraint__Group__3__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_3 ) ) ;
    public final void rule__BinaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1796:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1797:1: ( ( rule__BinaryConstraint__OperatorAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1797:1: ( ( rule__BinaryConstraint__OperatorAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1798:1: ( rule__BinaryConstraint__OperatorAssignment_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1799:1: ( rule__BinaryConstraint__OperatorAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1799:2: rule__BinaryConstraint__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_3_in_rule__BinaryConstraint__Group__3__Impl3657);
            rule__BinaryConstraint__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_3()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__3__Impl"


    // $ANTLR start "rule__BinaryConstraint__Group__4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1809:1: rule__BinaryConstraint__Group__4 : rule__BinaryConstraint__Group__4__Impl ;
    public final void rule__BinaryConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1813:1: ( rule__BinaryConstraint__Group__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1814:2: rule__BinaryConstraint__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__43687);
            rule__BinaryConstraint__Group__4__Impl();

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
    // $ANTLR end "rule__BinaryConstraint__Group__4"


    // $ANTLR start "rule__BinaryConstraint__Group__4__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1820:1: rule__BinaryConstraint__Group__4__Impl : ( ( rule__BinaryConstraint__RightAssignment_4 ) ) ;
    public final void rule__BinaryConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1824:1: ( ( ( rule__BinaryConstraint__RightAssignment_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1825:1: ( ( rule__BinaryConstraint__RightAssignment_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1825:1: ( ( rule__BinaryConstraint__RightAssignment_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1826:1: ( rule__BinaryConstraint__RightAssignment_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1827:1: ( rule__BinaryConstraint__RightAssignment_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1827:2: rule__BinaryConstraint__RightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_4_in_rule__BinaryConstraint__Group__4__Impl3714);
            rule__BinaryConstraint__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConstraintAccess().getRightAssignment_4()); 

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
    // $ANTLR end "rule__BinaryConstraint__Group__4__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1847:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1851:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1852:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__03754);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1_in_rule__Set__Group__03757);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1859:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1863:1: ( ( 'set' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1864:1: ( 'set' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1864:1: ( 'set' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1865:1: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Set__Group__0__Impl3785); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1878:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1882:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1883:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__13816);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2_in_rule__Set__Group__13819);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1890:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1894:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1895:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1895:1: ( ( rule__Set__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1896:1: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1897:1: ( rule__Set__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1897:2: rule__Set__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl3846);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1907:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1911:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1912:2: rule__Set__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__23876);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1918:1: rule__Set__Group__2__Impl : ( ( rule__Set__Group_2__0 )? ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1922:1: ( ( ( rule__Set__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1923:1: ( ( rule__Set__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1923:1: ( ( rule__Set__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1924:1: ( rule__Set__Group_2__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1925:1: ( rule__Set__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1925:2: rule__Set__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl3903);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1941:1: rule__Set__Group_2__0 : rule__Set__Group_2__0__Impl rule__Set__Group_2__1 ;
    public final void rule__Set__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1945:1: ( rule__Set__Group_2__0__Impl rule__Set__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1946:2: rule__Set__Group_2__0__Impl rule__Set__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__03940);
            rule__Set__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__03943);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1953:1: rule__Set__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1957:1: ( ( '[' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1958:1: ( '[' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1958:1: ( '[' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1959:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Set__Group_2__0__Impl3971); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1972:1: rule__Set__Group_2__1 : rule__Set__Group_2__1__Impl rule__Set__Group_2__2 ;
    public final void rule__Set__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1976:1: ( rule__Set__Group_2__1__Impl rule__Set__Group_2__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1977:2: rule__Set__Group_2__1__Impl rule__Set__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__14002);
            rule__Set__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__14005);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1984:1: rule__Set__Group_2__1__Impl : ( ( rule__Set__HasAssignment_2_1 ) ) ;
    public final void rule__Set__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1988:1: ( ( ( rule__Set__HasAssignment_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:1: ( ( rule__Set__HasAssignment_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:1: ( ( rule__Set__HasAssignment_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1990:1: ( rule__Set__HasAssignment_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1991:1: ( rule__Set__HasAssignment_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1991:2: rule__Set__HasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4032);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2001:1: rule__Set__Group_2__2 : rule__Set__Group_2__2__Impl rule__Set__Group_2__3 ;
    public final void rule__Set__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2005:1: ( rule__Set__Group_2__2__Impl rule__Set__Group_2__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2006:2: rule__Set__Group_2__2__Impl rule__Set__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24062);
            rule__Set__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24065);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2013:1: rule__Set__Group_2__2__Impl : ( ( rule__Set__Group_2_2__0 )* ) ;
    public final void rule__Set__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2017:1: ( ( ( rule__Set__Group_2_2__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2018:1: ( ( rule__Set__Group_2_2__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2018:1: ( ( rule__Set__Group_2_2__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2019:1: ( rule__Set__Group_2_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_2_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2020:1: ( rule__Set__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2020:2: rule__Set__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4092);
            	    rule__Set__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2030:1: rule__Set__Group_2__3 : rule__Set__Group_2__3__Impl ;
    public final void rule__Set__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2034:1: ( rule__Set__Group_2__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2035:2: rule__Set__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34123);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2041:1: rule__Set__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Set__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2045:1: ( ( ']' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2046:1: ( ']' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2046:1: ( ']' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2047:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Set__Group_2__3__Impl4151); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2068:1: rule__Set__Group_2_2__0 : rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 ;
    public final void rule__Set__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2072:1: ( rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2073:2: rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04190);
            rule__Set__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04193);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2080:1: rule__Set__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2084:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2085:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2085:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2086:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4221); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2099:1: rule__Set__Group_2_2__1 : rule__Set__Group_2_2__1__Impl ;
    public final void rule__Set__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2103:1: ( rule__Set__Group_2_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2104:2: rule__Set__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14252);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2110:1: rule__Set__Group_2_2__1__Impl : ( ( rule__Set__HasAssignment_2_2_1 ) ) ;
    public final void rule__Set__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2114:1: ( ( ( rule__Set__HasAssignment_2_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2115:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2115:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2116:1: ( rule__Set__HasAssignment_2_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2117:1: ( rule__Set__HasAssignment_2_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2117:2: rule__Set__HasAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4279);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2131:1: rule__UnaryConstraint__Group__0 : rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 ;
    public final void rule__UnaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2135:1: ( rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2136:2: rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04313);
            rule__UnaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04316);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2143:1: rule__UnaryConstraint__Group__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2147:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2149:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4344); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2162:1: rule__UnaryConstraint__Group__1 : rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 ;
    public final void rule__UnaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2166:1: ( rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2167:2: rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14375);
            rule__UnaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14378);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2174:1: rule__UnaryConstraint__Group__1__Impl : ( ( rule__UnaryConstraint__NameAssignment_1 ) ) ;
    public final void rule__UnaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2178:1: ( ( ( rule__UnaryConstraint__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2179:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2179:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2180:1: ( rule__UnaryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2181:1: ( rule__UnaryConstraint__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2181:2: rule__UnaryConstraint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4405);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2191:1: rule__UnaryConstraint__Group__2 : rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 ;
    public final void rule__UnaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2195:1: ( rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2196:2: rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24435);
            rule__UnaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24438);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2203:1: rule__UnaryConstraint__Group__2__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) ;
    public final void rule__UnaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2207:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2208:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2208:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2209:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2210:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2210:2: rule__UnaryConstraint__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4465);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2220:1: rule__UnaryConstraint__Group__3 : rule__UnaryConstraint__Group__3__Impl ;
    public final void rule__UnaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2224:1: ( rule__UnaryConstraint__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2225:2: rule__UnaryConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34495);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2231:1: rule__UnaryConstraint__Group__3__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) ;
    public final void rule__UnaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2235:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2236:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2236:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2237:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2238:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2238:2: rule__UnaryConstraint__ExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4522);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2257:1: rule__Root__ConfiguratorsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Root__ConfiguratorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2261:1: ( ( ruleConfiguration ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2262:1: ( ruleConfiguration )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2262:1: ( ruleConfiguration )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2263:1: ruleConfiguration
            {
             before(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14565);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2272:1: rule__Root__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Root__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2276:1: ( ( ruleExpression ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2277:1: ( ruleExpression )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2277:1: ( ruleExpression )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2278:1: ruleExpression
            {
             before(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_24596);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2287:1: rule__Configuration__AssignmentsAssignment_2_0 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2291:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2292:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2292:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2293:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_04627);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2302:1: rule__Configuration__AssignmentsAssignment_2_1_1 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2306:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2307:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2307:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2308:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_14658);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2317:1: rule__Assignment__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2321:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2322:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2322:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2323:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2324:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2325:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_14693);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2336:1: rule__Assignment__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2340:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2341:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2341:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2342:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2343:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2344:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_34732);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2355:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeEnum ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2359:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2360:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2360:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2361:1: ruleTypeEnum
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_14767);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2370:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2374:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2375:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2375:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2376:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_24798);
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


    // $ANTLR start "rule__StringValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2385:1: rule__StringValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2389:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2390:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2390:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2391:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_14829);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2400:1: rule__StringValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2404:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2405:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2405:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_34860);
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


    // $ANTLR start "rule__IntegerValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2415:1: rule__IntegerValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2419:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2420:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2420:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2421:1: ruleEString
            {
             before(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_14891);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2430:1: rule__IntegerValue__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2434:1: ( ( ruleEInt ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:1: ( ruleEInt )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:1: ( ruleEInt )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2436:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_34922);
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


    // $ANTLR start "rule__BooleanValue__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2445:1: rule__BooleanValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2449:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2450:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2450:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2451:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_14953);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2460:1: rule__BooleanValue__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2464:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2466:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_34984);
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


    // $ANTLR start "rule__BinaryConstraint__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2475:1: rule__BinaryConstraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2479:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2480:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2480:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2481:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_15015);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__NameAssignment_1"


    // $ANTLR start "rule__BinaryConstraint__LeftAssignment_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2490:1: rule__BinaryConstraint__LeftAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2494:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2495:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2495:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2496:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2497:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2498:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_25050);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_2_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__LeftAssignment_2"


    // $ANTLR start "rule__BinaryConstraint__OperatorAssignment_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2509:1: rule__BinaryConstraint__OperatorAssignment_3 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2513:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2514:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2514:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2515:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_35085);
            ruleBinaryOperators();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__OperatorAssignment_3"


    // $ANTLR start "rule__BinaryConstraint__RightAssignment_4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2524:1: rule__BinaryConstraint__RightAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2528:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2529:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2529:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2530:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2531:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2532:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_45120);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_4_0()); 

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
    // $ANTLR end "rule__BinaryConstraint__RightAssignment_4"


    // $ANTLR start "rule__Set__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2543:1: rule__Set__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2547:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2548:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2548:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2549:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__NameAssignment_15155);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2558:1: rule__Set__HasAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2562:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2563:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2563:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2564:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2565:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2566:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15190);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2577:1: rule__Set__HasAssignment_2_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2581:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2582:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2582:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2583:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2584:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2585:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15229);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2596:1: rule__UnaryConstraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2600:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2601:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2601:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2602:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15264);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2611:1: rule__UnaryConstraint__OperatorAssignment_2 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2615:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2616:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2616:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2617:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25295);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2626:1: rule__UnaryConstraint__ExpressionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2630:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2631:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2631:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2632:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2633:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2634:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_35330);
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
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__0_in_ruleBinaryConstraint756 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperators__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperators__Alternatives1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperators__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperators__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperators__Alternatives1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BinaryOperators__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BinaryOperators__Alternatives1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BinaryOperators__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01521 = new BitSet(new long[]{0x000000132201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11582 = new BitSet(new long[]{0x000000132201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1612 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1670 = new BitSet(new long[]{0x000000132001C002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01707 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11768 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Configuration__Group__1__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01894 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__11954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl1981 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02016 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Assignment__Group__0__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12201 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22261 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Assignment__Group__2__Impl2292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02388 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Parameter__Group__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_2_in_rule__Parameter__Group__2__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__StringValue__Group__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12635 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__StringValue__Group__2__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02822 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__IntegerValue__Group__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12884 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22944 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__IntegerValue__Group__2__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BooleanValue__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13133 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23193 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03320 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__03445 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__03448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__13507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__13510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_1_in_rule__BinaryConstraint__Group__1__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__23567 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__23570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_2_in_rule__BinaryConstraint__Group__2__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__33627 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__33630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_3_in_rule__BinaryConstraint__Group__3__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__43687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_4_in_rule__BinaryConstraint__Group__4__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__03754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__03757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Set__Group__0__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__13816 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__13819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__23876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__03940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__03943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Set__Group_2__0__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__14002 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__14005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24062 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4092 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Set__Group_2__3__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04313 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14375 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24435 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_24596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_04627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_14658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_14693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_34732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_14767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_24798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_14829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_34860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_14891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_34922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_14953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_34984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_15015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_25050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_35085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_45120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__NameAssignment_15155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_35330 = new BitSet(new long[]{0x0000000000000002L});
    }


}