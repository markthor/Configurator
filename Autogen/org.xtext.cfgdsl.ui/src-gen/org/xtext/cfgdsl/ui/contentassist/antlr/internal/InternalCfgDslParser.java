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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1259:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__TypeAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1263:1: ( ( ( rule__StringValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1264:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1264:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1265:1: ( rule__StringValue__TypeAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1266:1: ( rule__StringValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1266:2: rule__StringValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2603);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1276:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1280:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1281:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12633);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12636);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1288:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__NameAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1292:1: ( ( ( rule__StringValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1293:1: ( ( rule__StringValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1293:1: ( ( rule__StringValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1294:1: ( rule__StringValue__NameAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1295:1: ( rule__StringValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1295:2: rule__StringValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2663);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1305:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1309:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1310:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22693);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22696);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1317:1: rule__StringValue__Group__2__Impl : ( '=' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1321:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1322:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1322:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1323:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__StringValue__Group__2__Impl2724); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1336:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1340:1: ( rule__StringValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1341:2: rule__StringValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32755);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1347:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__ValueAssignment_3 ) ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1351:1: ( ( ( rule__StringValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1352:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1352:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1353:1: ( rule__StringValue__ValueAssignment_3 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1354:1: ( rule__StringValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1354:2: rule__StringValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2782);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1372:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1376:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1377:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02820);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02823);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1384:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__TypeAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1388:1: ( ( ( rule__IntegerValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1389:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1389:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1390:1: ( rule__IntegerValue__TypeAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1391:1: ( rule__IntegerValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1391:2: rule__IntegerValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2850);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1401:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1405:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1406:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12880);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12883);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1413:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__NameAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1417:1: ( ( ( rule__IntegerValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1418:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1418:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1419:1: ( rule__IntegerValue__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1420:1: ( rule__IntegerValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1420:2: rule__IntegerValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2910);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1430:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1434:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1435:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22940);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22943);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1442:1: rule__IntegerValue__Group__2__Impl : ( '=' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1446:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1447:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1447:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1448:1: '='
            {
             before(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__IntegerValue__Group__2__Impl2971); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1461:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1465:1: ( rule__IntegerValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1466:2: rule__IntegerValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33002);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1472:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__ValueAssignment_3 ) ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1476:1: ( ( ( rule__IntegerValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1477:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1477:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1478:1: ( rule__IntegerValue__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1479:1: ( rule__IntegerValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1479:2: rule__IntegerValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3029);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1497:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1501:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1502:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03067);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03070);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1509:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TypeAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1513:1: ( ( ( rule__BooleanValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1514:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1514:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1515:1: ( rule__BooleanValue__TypeAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1516:1: ( rule__BooleanValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1516:2: rule__BooleanValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3097);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1526:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1530:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1531:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13127);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13130);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1538:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__NameAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1542:1: ( ( ( rule__BooleanValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1543:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1543:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1544:1: ( rule__BooleanValue__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1545:1: ( rule__BooleanValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1545:2: rule__BooleanValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3157);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1555:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1559:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1560:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23187);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23190);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1567:1: rule__BooleanValue__Group__2__Impl : ( '=' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1571:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1572:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1572:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1573:1: '='
            {
             before(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3218); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1586:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1590:1: ( rule__BooleanValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1591:2: rule__BooleanValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33249);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1597:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__ValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1601:1: ( ( ( rule__BooleanValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1602:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1602:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1603:1: ( rule__BooleanValue__ValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1604:1: ( rule__BooleanValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1604:2: rule__BooleanValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3276);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1622:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1626:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1627:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03314);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03317);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1634:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1638:1: ( ( ( '-' )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1639:1: ( ( '-' )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1639:1: ( ( '-' )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1640:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1641:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1642:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl3346); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1653:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1657:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1658:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13379);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1664:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1668:1: ( ( RULE_INT ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1669:1: ( RULE_INT )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1669:1: ( RULE_INT )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1670:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3406); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1685:1: rule__BinaryConstraint__Group__0 : rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 ;
    public final void rule__BinaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1689:1: ( rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1690:2: rule__BinaryConstraint__Group__0__Impl rule__BinaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__03439);
            rule__BinaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__03442);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1697:1: rule__BinaryConstraint__Group__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1701:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1702:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1702:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1703:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl3470); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1716:1: rule__BinaryConstraint__Group__1 : rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 ;
    public final void rule__BinaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1720:1: ( rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1721:2: rule__BinaryConstraint__Group__1__Impl rule__BinaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__13501);
            rule__BinaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__13504);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1728:1: rule__BinaryConstraint__Group__1__Impl : ( ( rule__BinaryConstraint__NameAssignment_1 ) ) ;
    public final void rule__BinaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1732:1: ( ( ( rule__BinaryConstraint__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1733:1: ( ( rule__BinaryConstraint__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1733:1: ( ( rule__BinaryConstraint__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1734:1: ( rule__BinaryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1735:1: ( rule__BinaryConstraint__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1735:2: rule__BinaryConstraint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_1_in_rule__BinaryConstraint__Group__1__Impl3531);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1745:1: rule__BinaryConstraint__Group__2 : rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 ;
    public final void rule__BinaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1749:1: ( rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1750:2: rule__BinaryConstraint__Group__2__Impl rule__BinaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__23561);
            rule__BinaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__23564);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1757:1: rule__BinaryConstraint__Group__2__Impl : ( ( rule__BinaryConstraint__LeftAssignment_2 ) ) ;
    public final void rule__BinaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1761:1: ( ( ( rule__BinaryConstraint__LeftAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1762:1: ( ( rule__BinaryConstraint__LeftAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1762:1: ( ( rule__BinaryConstraint__LeftAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1763:1: ( rule__BinaryConstraint__LeftAssignment_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1764:1: ( rule__BinaryConstraint__LeftAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1764:2: rule__BinaryConstraint__LeftAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_2_in_rule__BinaryConstraint__Group__2__Impl3591);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1774:1: rule__BinaryConstraint__Group__3 : rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 ;
    public final void rule__BinaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1778:1: ( rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1779:2: rule__BinaryConstraint__Group__3__Impl rule__BinaryConstraint__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__33621);
            rule__BinaryConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__33624);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1786:1: rule__BinaryConstraint__Group__3__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_3 ) ) ;
    public final void rule__BinaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1790:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1791:1: ( ( rule__BinaryConstraint__OperatorAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1791:1: ( ( rule__BinaryConstraint__OperatorAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1792:1: ( rule__BinaryConstraint__OperatorAssignment_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1793:1: ( rule__BinaryConstraint__OperatorAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1793:2: rule__BinaryConstraint__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_3_in_rule__BinaryConstraint__Group__3__Impl3651);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1803:1: rule__BinaryConstraint__Group__4 : rule__BinaryConstraint__Group__4__Impl ;
    public final void rule__BinaryConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1807:1: ( rule__BinaryConstraint__Group__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1808:2: rule__BinaryConstraint__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__43681);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1814:1: rule__BinaryConstraint__Group__4__Impl : ( ( rule__BinaryConstraint__RightAssignment_4 ) ) ;
    public final void rule__BinaryConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1818:1: ( ( ( rule__BinaryConstraint__RightAssignment_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1819:1: ( ( rule__BinaryConstraint__RightAssignment_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1819:1: ( ( rule__BinaryConstraint__RightAssignment_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1820:1: ( rule__BinaryConstraint__RightAssignment_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1821:1: ( rule__BinaryConstraint__RightAssignment_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1821:2: rule__BinaryConstraint__RightAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_4_in_rule__BinaryConstraint__Group__4__Impl3708);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1841:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1845:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1846:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__03748);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1_in_rule__Set__Group__03751);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1853:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1857:1: ( ( 'set' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1858:1: ( 'set' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1858:1: ( 'set' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1859:1: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Set__Group__0__Impl3779); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1872:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1876:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1877:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__13810);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2_in_rule__Set__Group__13813);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1884:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1888:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1889:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1889:1: ( ( rule__Set__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1890:1: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1891:1: ( rule__Set__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1891:2: rule__Set__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl3840);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1901:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1905:1: ( rule__Set__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1906:2: rule__Set__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__23870);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1912:1: rule__Set__Group__2__Impl : ( ( rule__Set__Group_2__0 )? ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1916:1: ( ( ( rule__Set__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1917:1: ( ( rule__Set__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1917:1: ( ( rule__Set__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1918:1: ( rule__Set__Group_2__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1919:1: ( rule__Set__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1919:2: rule__Set__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl3897);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1935:1: rule__Set__Group_2__0 : rule__Set__Group_2__0__Impl rule__Set__Group_2__1 ;
    public final void rule__Set__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1939:1: ( rule__Set__Group_2__0__Impl rule__Set__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1940:2: rule__Set__Group_2__0__Impl rule__Set__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__03934);
            rule__Set__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__03937);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1947:1: rule__Set__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1951:1: ( ( '[' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1952:1: ( '[' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1952:1: ( '[' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1953:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Set__Group_2__0__Impl3965); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1966:1: rule__Set__Group_2__1 : rule__Set__Group_2__1__Impl rule__Set__Group_2__2 ;
    public final void rule__Set__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1970:1: ( rule__Set__Group_2__1__Impl rule__Set__Group_2__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1971:2: rule__Set__Group_2__1__Impl rule__Set__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__13996);
            rule__Set__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__13999);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1978:1: rule__Set__Group_2__1__Impl : ( ( rule__Set__HasAssignment_2_1 ) ) ;
    public final void rule__Set__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1982:1: ( ( ( rule__Set__HasAssignment_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1983:1: ( ( rule__Set__HasAssignment_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1983:1: ( ( rule__Set__HasAssignment_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1984:1: ( rule__Set__HasAssignment_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1985:1: ( rule__Set__HasAssignment_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1985:2: rule__Set__HasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4026);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1995:1: rule__Set__Group_2__2 : rule__Set__Group_2__2__Impl rule__Set__Group_2__3 ;
    public final void rule__Set__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1999:1: ( rule__Set__Group_2__2__Impl rule__Set__Group_2__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2000:2: rule__Set__Group_2__2__Impl rule__Set__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24056);
            rule__Set__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24059);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2007:1: rule__Set__Group_2__2__Impl : ( ( rule__Set__Group_2_2__0 )* ) ;
    public final void rule__Set__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2011:1: ( ( ( rule__Set__Group_2_2__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2012:1: ( ( rule__Set__Group_2_2__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2012:1: ( ( rule__Set__Group_2_2__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2013:1: ( rule__Set__Group_2_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_2_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2014:1: ( rule__Set__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2014:2: rule__Set__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4086);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2024:1: rule__Set__Group_2__3 : rule__Set__Group_2__3__Impl ;
    public final void rule__Set__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2028:1: ( rule__Set__Group_2__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2029:2: rule__Set__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34117);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2035:1: rule__Set__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Set__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2039:1: ( ( ']' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2040:1: ( ']' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2040:1: ( ']' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2041:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Set__Group_2__3__Impl4145); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2062:1: rule__Set__Group_2_2__0 : rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 ;
    public final void rule__Set__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2066:1: ( rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2067:2: rule__Set__Group_2_2__0__Impl rule__Set__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04184);
            rule__Set__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04187);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2074:1: rule__Set__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2078:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2079:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2079:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2080:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_2_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4215); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2093:1: rule__Set__Group_2_2__1 : rule__Set__Group_2_2__1__Impl ;
    public final void rule__Set__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2097:1: ( rule__Set__Group_2_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2098:2: rule__Set__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14246);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2104:1: rule__Set__Group_2_2__1__Impl : ( ( rule__Set__HasAssignment_2_2_1 ) ) ;
    public final void rule__Set__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2108:1: ( ( ( rule__Set__HasAssignment_2_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2109:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2109:1: ( ( rule__Set__HasAssignment_2_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2110:1: ( rule__Set__HasAssignment_2_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_2_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2111:1: ( rule__Set__HasAssignment_2_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2111:2: rule__Set__HasAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4273);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2125:1: rule__UnaryConstraint__Group__0 : rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 ;
    public final void rule__UnaryConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2129:1: ( rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2130:2: rule__UnaryConstraint__Group__0__Impl rule__UnaryConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04307);
            rule__UnaryConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04310);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2137:1: rule__UnaryConstraint__Group__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2141:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2142:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2142:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2143:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4338); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2156:1: rule__UnaryConstraint__Group__1 : rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 ;
    public final void rule__UnaryConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2160:1: ( rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2161:2: rule__UnaryConstraint__Group__1__Impl rule__UnaryConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14369);
            rule__UnaryConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14372);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2168:1: rule__UnaryConstraint__Group__1__Impl : ( ( rule__UnaryConstraint__NameAssignment_1 ) ) ;
    public final void rule__UnaryConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2172:1: ( ( ( rule__UnaryConstraint__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2173:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2173:1: ( ( rule__UnaryConstraint__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2174:1: ( rule__UnaryConstraint__NameAssignment_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2175:1: ( rule__UnaryConstraint__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2175:2: rule__UnaryConstraint__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4399);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2185:1: rule__UnaryConstraint__Group__2 : rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 ;
    public final void rule__UnaryConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2189:1: ( rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2190:2: rule__UnaryConstraint__Group__2__Impl rule__UnaryConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24429);
            rule__UnaryConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24432);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2197:1: rule__UnaryConstraint__Group__2__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) ;
    public final void rule__UnaryConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2201:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2202:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2202:1: ( ( rule__UnaryConstraint__OperatorAssignment_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2203:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2204:1: ( rule__UnaryConstraint__OperatorAssignment_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2204:2: rule__UnaryConstraint__OperatorAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4459);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2214:1: rule__UnaryConstraint__Group__3 : rule__UnaryConstraint__Group__3__Impl ;
    public final void rule__UnaryConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2218:1: ( rule__UnaryConstraint__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2219:2: rule__UnaryConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34489);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2225:1: rule__UnaryConstraint__Group__3__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) ;
    public final void rule__UnaryConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2229:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2230:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2230:1: ( ( rule__UnaryConstraint__ExpressionAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2231:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2232:1: ( rule__UnaryConstraint__ExpressionAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2232:2: rule__UnaryConstraint__ExpressionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4516);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2251:1: rule__Root__ConfiguratorsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Root__ConfiguratorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2255:1: ( ( ruleConfiguration ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2256:1: ( ruleConfiguration )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2256:1: ( ruleConfiguration )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2257:1: ruleConfiguration
            {
             before(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14559);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2266:1: rule__Root__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Root__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2270:1: ( ( ruleExpression ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2271:1: ( ruleExpression )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2271:1: ( ruleExpression )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2272:1: ruleExpression
            {
             before(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_24590);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2281:1: rule__Configuration__AssignmentsAssignment_2_0 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2285:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2286:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2286:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2287:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_04621);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2296:1: rule__Configuration__AssignmentsAssignment_2_1_1 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2300:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2301:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2301:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2302:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_14652);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2311:1: rule__Assignment__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2315:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2316:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2316:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2317:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2318:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2319:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_14687);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2330:1: rule__Assignment__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2334:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2335:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2335:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2336:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2337:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2338:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_34726);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2349:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeEnum ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2353:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2354:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2354:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2355:1: ruleTypeEnum
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_14761);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2364:1: rule__Parameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2368:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2369:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2369:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2370:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_24792);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2379:1: rule__StringValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__StringValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2383:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2384:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2384:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2385:1: ruleTypeEnum
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_04823);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2394:1: rule__StringValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2398:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2399:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2399:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2400:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_14854);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2409:1: rule__StringValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2413:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2414:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2414:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2415:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_34885);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2424:1: rule__IntegerValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__IntegerValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2428:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2429:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2429:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2430:1: ruleTypeEnum
            {
             before(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_04916);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2439:1: rule__IntegerValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2443:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2444:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2444:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2445:1: ruleEString
            {
             before(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_14947);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2454:1: rule__IntegerValue__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2458:1: ( ( ruleEInt ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2459:1: ( ruleEInt )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2459:1: ( ruleEInt )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2460:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_34978);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2469:1: rule__BooleanValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__BooleanValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2473:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2474:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2474:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2475:1: ruleTypeEnum
            {
             before(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05009);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2484:1: rule__BooleanValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2488:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2489:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2489:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2490:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15040);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2499:1: rule__BooleanValue__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2503:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2504:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2504:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2505:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35071);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2514:1: rule__BinaryConstraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2518:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2519:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2519:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2520:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_15102);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2529:1: rule__BinaryConstraint__LeftAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2533:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2534:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2534:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2535:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2536:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2537:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_25137);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2548:1: rule__BinaryConstraint__OperatorAssignment_3 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2552:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2553:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2553:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2554:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_35172);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2563:1: rule__BinaryConstraint__RightAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2567:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2568:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2568:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2569:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2570:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2571:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_45207);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2582:1: rule__Set__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2586:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2587:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2587:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2588:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__NameAssignment_15242);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2597:1: rule__Set__HasAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2601:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2602:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2602:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2603:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2604:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2605:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15277);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2616:1: rule__Set__HasAssignment_2_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2620:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2621:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2621:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2622:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_2_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2623:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2624:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_2_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15316);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2635:1: rule__UnaryConstraint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2639:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2640:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2640:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2641:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15351);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2650:1: rule__UnaryConstraint__OperatorAssignment_2 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2654:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2655:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2655:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2656:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25382);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2665:1: rule__UnaryConstraint__ExpressionAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2669:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2670:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2670:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2671:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2672:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2673:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_35417);
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
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\3\uffff\1\6\1\4\1\5";
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
            "\2\14\1\15\5\uffff\2\13\21\uffff\1\15",
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
        public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12633 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22693 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__StringValue__Group__2__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12880 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22940 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__IntegerValue__Group__2__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13127 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23187 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BooleanValue__Group__2__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03314 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__0__Impl_in_rule__BinaryConstraint__Group__03439 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1_in_rule__BinaryConstraint__Group__03442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BinaryConstraint__Group__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__1__Impl_in_rule__BinaryConstraint__Group__13501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2_in_rule__BinaryConstraint__Group__13504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_1_in_rule__BinaryConstraint__Group__1__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__2__Impl_in_rule__BinaryConstraint__Group__23561 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3_in_rule__BinaryConstraint__Group__23564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_2_in_rule__BinaryConstraint__Group__2__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__3__Impl_in_rule__BinaryConstraint__Group__33621 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4_in_rule__BinaryConstraint__Group__33624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_3_in_rule__BinaryConstraint__Group__3__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group__4__Impl_in_rule__BinaryConstraint__Group__43681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_4_in_rule__BinaryConstraint__Group__4__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__03748 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__03751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Set__Group__0__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__13810 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__13813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__23870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0_in_rule__Set__Group__2__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__0__Impl_in_rule__Set__Group_2__03934 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1_in_rule__Set__Group_2__03937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Set__Group_2__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__1__Impl_in_rule__Set__Group_2__13996 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2_in_rule__Set__Group_2__13999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_1_in_rule__Set__Group_2__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__2__Impl_in_rule__Set__Group_2__24056 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3_in_rule__Set__Group_2__24059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0_in_rule__Set__Group_2__2__Impl4086 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2__3__Impl_in_rule__Set__Group_2__34117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Set__Group_2__3__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__0__Impl_in_rule__Set__Group_2_2__04184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1_in_rule__Set__Group_2_2__04187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Set__Group_2_2__0__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_2_2__1__Impl_in_rule__Set__Group_2_2__14246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_2_2_1_in_rule__Set__Group_2_2__1__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__0__Impl_in_rule__UnaryConstraint__Group__04307 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1_in_rule__UnaryConstraint__Group__04310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__UnaryConstraint__Group__0__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__1__Impl_in_rule__UnaryConstraint__Group__14369 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2_in_rule__UnaryConstraint__Group__14372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_1_in_rule__UnaryConstraint__Group__1__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__2__Impl_in_rule__UnaryConstraint__Group__24429 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3_in_rule__UnaryConstraint__Group__24432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_2_in_rule__UnaryConstraint__Group__2__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group__3__Impl_in_rule__UnaryConstraint__Group__34489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_3_in_rule__UnaryConstraint__Group__3__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_14559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_24590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_04621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_14652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_14687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_34726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_14761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_24792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_04823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_14854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_34885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_04916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_14947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_34978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_15102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_25137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_35172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_45207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__NameAssignment_15242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_15277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_2_2_15316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_15351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_25382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_35417 = new BitSet(new long[]{0x0000000000000002L});
    }


}