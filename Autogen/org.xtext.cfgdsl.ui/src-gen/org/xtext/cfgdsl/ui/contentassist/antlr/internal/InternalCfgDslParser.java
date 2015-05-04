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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'true'", "'false'", "'int'", "'boolean'", "'string'", "'<'", "'>'", "'=='", "'*'", "'+'", "'subset'", "'&&'", "'||'", "'cfg'", "','", "'assign'", "'to'", "'='", "'-'", "'bc'", "'set'", "'['", "']'", "'uc'"
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:435:1: ruleUnaryConstraint : ( ( rule__UnaryConstraint__Alternatives ) ) ;
    public final void ruleUnaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:439:2: ( ( ( rule__UnaryConstraint__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:440:1: ( ( rule__UnaryConstraint__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:440:1: ( ( rule__UnaryConstraint__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:441:1: ( rule__UnaryConstraint__Alternatives )
            {
             before(grammarAccess.getUnaryConstraintAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:1: ( rule__UnaryConstraint__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:2: rule__UnaryConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Alternatives_in_ruleUnaryConstraint876);
            rule__UnaryConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:493:1: ruleUnaryOperators : ( ( '!' ) ) ;
    public final void ruleUnaryOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:497:1: ( ( ( '!' ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:498:1: ( ( '!' ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:498:1: ( ( '!' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:499:1: ( '!' )
            {
             before(grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:1: ( '!' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:3: '!'
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

            if ( (LA4_0==31) ) {
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


    // $ANTLR start "rule__UnaryConstraint__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:635:1: rule__UnaryConstraint__Alternatives : ( ( ( rule__UnaryConstraint__Group_0__0 ) ) | ( ( rule__UnaryConstraint__Group_1__0 ) ) );
    public final void rule__UnaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:639:1: ( ( ( rule__UnaryConstraint__Group_0__0 ) ) | ( ( rule__UnaryConstraint__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=12 && LA5_1<=13)) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=RULE_STRING && LA5_1<=RULE_ID)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:640:1: ( ( rule__UnaryConstraint__Group_0__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:640:1: ( ( rule__UnaryConstraint__Group_0__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:641:1: ( rule__UnaryConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryConstraintAccess().getGroup_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:1: ( rule__UnaryConstraint__Group_0__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:2: rule__UnaryConstraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__0_in_rule__UnaryConstraint__Alternatives1313);
                    rule__UnaryConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:646:6: ( ( rule__UnaryConstraint__Group_1__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:646:6: ( ( rule__UnaryConstraint__Group_1__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:647:1: ( rule__UnaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryConstraintAccess().getGroup_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:1: ( rule__UnaryConstraint__Group_1__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:2: rule__UnaryConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__0_in_rule__UnaryConstraint__Alternatives1331);
                    rule__UnaryConstraint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryConstraintAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnaryConstraint__Alternatives"


    // $ANTLR start "rule__TypeEnum__Alternatives"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:657:1: rule__TypeEnum__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:661:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:662:1: ( ( 'int' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:662:1: ( ( 'int' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:663:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:664:1: ( 'int' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:664:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives1365); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:669:6: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:669:6: ( ( 'boolean' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:670:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:1: ( 'boolean' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:3: 'boolean'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives1386); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:676:6: ( ( 'string' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:676:6: ( ( 'string' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:677:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:1: ( 'string' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:3: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives1407); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:688:1: rule__BinaryOperators__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '*' ) ) | ( ( '+' ) ) | ( ( 'subset' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:692:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '*' ) ) | ( ( '+' ) ) | ( ( 'subset' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:693:1: ( ( '<' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:693:1: ( ( '<' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:694:1: ( '<' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:695:1: ( '<' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:695:3: '<'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperators__Alternatives1443); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:700:6: ( ( '>' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:700:6: ( ( '>' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:701:1: ( '>' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:702:1: ( '>' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:702:3: '>'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperators__Alternatives1464); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:707:6: ( ( '==' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:707:6: ( ( '==' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:708:1: ( '==' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:709:1: ( '==' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:709:3: '=='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperators__Alternatives1485); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:714:6: ( ( '*' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:714:6: ( ( '*' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:715:1: ( '*' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:716:1: ( '*' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:716:3: '*'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperators__Alternatives1506); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:721:6: ( ( '+' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:721:6: ( ( '+' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:722:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:723:1: ( '+' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:723:3: '+'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperators__Alternatives1527); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:728:6: ( ( 'subset' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:728:6: ( ( 'subset' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:729:1: ( 'subset' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:730:1: ( 'subset' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:730:3: 'subset'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__BinaryOperators__Alternatives1548); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:735:6: ( ( '&&' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:735:6: ( ( '&&' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:736:1: ( '&&' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:737:1: ( '&&' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:737:3: '&&'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__BinaryOperators__Alternatives1569); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:742:6: ( ( '||' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:742:6: ( ( '||' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:743:1: ( '||' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:744:1: ( '||' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:744:3: '||'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__BinaryOperators__Alternatives1590); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:756:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:760:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:761:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01623);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01626);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:768:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:772:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:773:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:773:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:774:1: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:775:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:777:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:787:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:791:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:792:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11684);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11687);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:799:1: rule__Root__Group__1__Impl : ( ( rule__Root__ConfiguratorsAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:803:1: ( ( ( rule__Root__ConfiguratorsAssignment_1 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:804:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:804:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:805:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getConfiguratorsAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:806:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:806:2: rule__Root__ConfiguratorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1714);
            	    rule__Root__ConfiguratorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:816:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:820:1: ( rule__Root__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:821:2: rule__Root__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21745);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:827:1: rule__Root__Group__2__Impl : ( ( rule__Root__ExpressionsAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:831:1: ( ( ( rule__Root__ExpressionsAssignment_2 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:832:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:832:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:833:1: ( rule__Root__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getExpressionsAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:834:1: ( rule__Root__ExpressionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=16)||(LA9_0>=31 && LA9_0<=32)||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:834:2: rule__Root__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1772);
            	    rule__Root__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:850:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:854:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:855:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01809);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01812);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:862:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:866:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:867:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:867:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:868:1: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:869:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:871:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:881:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:885:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:886:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11870);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11873);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:893:1: rule__Configuration__Group__1__Impl : ( 'cfg' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:897:1: ( ( 'cfg' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:898:1: ( 'cfg' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:898:1: ( 'cfg' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:899:1: 'cfg'
            {
             before(grammarAccess.getConfigurationAccess().getCfgKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Configuration__Group__1__Impl1901); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:912:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:916:1: ( rule__Configuration__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:917:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21932);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:923:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Group_2__0 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:927:1: ( ( ( rule__Configuration__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:928:1: ( ( rule__Configuration__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:928:1: ( ( rule__Configuration__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:929:1: ( rule__Configuration__Group_2__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:930:1: ( rule__Configuration__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:930:2: rule__Configuration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1959);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:946:1: rule__Configuration__Group_2__0 : rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 ;
    public final void rule__Configuration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:950:1: ( rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:951:2: rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01996);
            rule__Configuration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01999);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:958:1: rule__Configuration__Group_2__0__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__Configuration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:962:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:963:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:963:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:964:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:965:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:965:2: rule__Configuration__AssignmentsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl2026);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:975:1: rule__Configuration__Group_2__1 : rule__Configuration__Group_2__1__Impl ;
    public final void rule__Configuration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:979:1: ( rule__Configuration__Group_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:980:2: rule__Configuration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12056);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:986:1: rule__Configuration__Group_2__1__Impl : ( ( rule__Configuration__Group_2_1__0 )* ) ;
    public final void rule__Configuration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:990:1: ( ( ( rule__Configuration__Group_2_1__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:991:1: ( ( rule__Configuration__Group_2_1__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:991:1: ( ( rule__Configuration__Group_2_1__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:992:1: ( rule__Configuration__Group_2_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:993:1: ( rule__Configuration__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:993:2: rule__Configuration__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2083);
            	    rule__Configuration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1007:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1011:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1012:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02118);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02121);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1019:1: rule__Configuration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1023:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1024:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1024:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1025:1: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2149); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1038:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1042:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1043:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12180);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1049:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1053:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1054:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1054:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1055:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1056:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1056:2: rule__Configuration__AssignmentsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2207);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1070:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1074:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1075:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02241);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02244);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1082:1: rule__Assignment__Group__0__Impl : ( 'assign' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1086:1: ( ( 'assign' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1087:1: ( 'assign' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1087:1: ( 'assign' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1088:1: 'assign'
            {
             before(grammarAccess.getAssignmentAccess().getAssignKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Assignment__Group__0__Impl2272); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1101:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1105:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1106:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12303);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12306);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1113:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ParameterAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1117:1: ( ( ( rule__Assignment__ParameterAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1118:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1118:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1119:1: ( rule__Assignment__ParameterAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getParameterAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1120:1: ( rule__Assignment__ParameterAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1120:2: rule__Assignment__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2333);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1130:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1134:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1135:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22363);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22366);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1142:1: rule__Assignment__Group__2__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1146:1: ( ( 'to' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1147:1: ( 'to' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1147:1: ( 'to' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1148:1: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Assignment__Group__2__Impl2394); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1161:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1165:1: ( rule__Assignment__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1166:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32425);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1172:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1176:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1177:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1177:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1178:1: ( rule__Assignment__ValueAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1179:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1179:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2452);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1197:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1201:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1202:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02490);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02493);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1209:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1213:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1214:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1214:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1215:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1216:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1216:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl2520);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1226:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1230:1: ( rule__Parameter__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1231:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12550);
            rule__Parameter__Group__1__Impl();

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1237:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1241:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1242:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1242:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1243:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1244:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1244:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2577);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringValue__Group__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1258:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1262:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1263:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02611);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02614);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1270:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__TypeAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1274:1: ( ( ( rule__StringValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1275:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1275:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1276:1: ( rule__StringValue__TypeAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1277:1: ( rule__StringValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1277:2: rule__StringValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2641);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1287:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1291:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1292:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12671);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12674);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1299:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__NameAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1303:1: ( ( ( rule__StringValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1304:1: ( ( rule__StringValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1304:1: ( ( rule__StringValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1305:1: ( rule__StringValue__NameAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1306:1: ( rule__StringValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1306:2: rule__StringValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2701);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1316:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1320:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1321:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22731);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22734);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1328:1: rule__StringValue__Group__2__Impl : ( '=' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1332:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1333:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1333:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1334:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StringValue__Group__2__Impl2762); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1347:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1351:1: ( rule__StringValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1352:2: rule__StringValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32793);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1358:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__ValueAssignment_3 ) ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1362:1: ( ( ( rule__StringValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1363:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1363:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1364:1: ( rule__StringValue__ValueAssignment_3 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1365:1: ( rule__StringValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1365:2: rule__StringValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2820);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1383:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1387:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1388:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02858);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02861);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1395:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__TypeAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1399:1: ( ( ( rule__IntegerValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1400:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1400:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1401:1: ( rule__IntegerValue__TypeAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1402:1: ( rule__IntegerValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1402:2: rule__IntegerValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2888);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1412:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1416:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1417:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12918);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12921);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1424:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__NameAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1428:1: ( ( ( rule__IntegerValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1429:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1429:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1430:1: ( rule__IntegerValue__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1431:1: ( rule__IntegerValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1431:2: rule__IntegerValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2948);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1441:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1445:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1446:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22978);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22981);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1453:1: rule__IntegerValue__Group__2__Impl : ( '=' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1457:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1458:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1458:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1459:1: '='
            {
             before(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__IntegerValue__Group__2__Impl3009); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1472:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1476:1: ( rule__IntegerValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1477:2: rule__IntegerValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33040);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1483:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__ValueAssignment_3 ) ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1487:1: ( ( ( rule__IntegerValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1488:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1488:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1489:1: ( rule__IntegerValue__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1490:1: ( rule__IntegerValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1490:2: rule__IntegerValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3067);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1508:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1512:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1513:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03105);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03108);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1520:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TypeAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1524:1: ( ( ( rule__BooleanValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1525:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1525:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1526:1: ( rule__BooleanValue__TypeAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1527:1: ( rule__BooleanValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1527:2: rule__BooleanValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3135);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1537:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1541:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1542:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13165);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13168);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1549:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__NameAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1553:1: ( ( ( rule__BooleanValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1554:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1554:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1555:1: ( rule__BooleanValue__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1556:1: ( rule__BooleanValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1556:2: rule__BooleanValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3195);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1566:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1570:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1571:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23225);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23228);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1578:1: rule__BooleanValue__Group__2__Impl : ( '=' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1582:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1583:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1583:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1584:1: '='
            {
             before(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BooleanValue__Group__2__Impl3256); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1597:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1601:1: ( rule__BooleanValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1602:2: rule__BooleanValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33287);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1608:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__ValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1612:1: ( ( ( rule__BooleanValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1613:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1613:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1614:1: ( rule__BooleanValue__ValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1615:1: ( rule__BooleanValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1615:2: rule__BooleanValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3314);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1633:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1637:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1638:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03352);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03355);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1645:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1649:1: ( ( ( '-' )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1650:1: ( ( '-' )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1650:1: ( ( '-' )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1651:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1652:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1653:2: '-'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__EInt__Group__0__Impl3384); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1664:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1668:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1669:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13417);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1675:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1679:1: ( ( RULE_INT ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1680:1: ( RULE_INT )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1680:1: ( RULE_INT )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1681:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3444); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1696:1: rule__BinaryConstraint__Group_0__0 : rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 ;
    public final void rule__BinaryConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1700:1: ( rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1701:2: rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03477);
            rule__BinaryConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03480);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1708:1: rule__BinaryConstraint__Group_0__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1712:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1713:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1713:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1714:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BinaryConstraint__Group_0__0__Impl3508); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1727:1: rule__BinaryConstraint__Group_0__1 : rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 ;
    public final void rule__BinaryConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1731:1: ( rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1732:2: rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13539);
            rule__BinaryConstraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13542);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1739:1: rule__BinaryConstraint__Group_0__1__Impl : ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) ;
    public final void rule__BinaryConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1743:1: ( ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1744:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1744:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1745:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_0_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1746:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1746:2: rule__BinaryConstraint__NameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3569);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1756:1: rule__BinaryConstraint__Group_0__2 : rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 ;
    public final void rule__BinaryConstraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1760:1: ( rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1761:2: rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23599);
            rule__BinaryConstraint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23602);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1768:1: rule__BinaryConstraint__Group_0__2__Impl : ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) ;
    public final void rule__BinaryConstraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1772:1: ( ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1773:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1773:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1774:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_0_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1775:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1775:2: rule__BinaryConstraint__LeftAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3629);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1785:1: rule__BinaryConstraint__Group_0__3 : rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 ;
    public final void rule__BinaryConstraint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1789:1: ( rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1790:2: rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33659);
            rule__BinaryConstraint__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33662);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1797:1: rule__BinaryConstraint__Group_0__3__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) ;
    public final void rule__BinaryConstraint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1801:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1802:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1802:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1803:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_0_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1804:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1804:2: rule__BinaryConstraint__OperatorAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3689);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1814:1: rule__BinaryConstraint__Group_0__4 : rule__BinaryConstraint__Group_0__4__Impl ;
    public final void rule__BinaryConstraint__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1818:1: ( rule__BinaryConstraint__Group_0__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1819:2: rule__BinaryConstraint__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43719);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1825:1: rule__BinaryConstraint__Group_0__4__Impl : ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) ;
    public final void rule__BinaryConstraint__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1829:1: ( ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1830:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1830:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1831:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_0_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1832:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1832:2: rule__BinaryConstraint__RightAssignment_0_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3746);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1852:1: rule__BinaryConstraint__Group_1__0 : rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 ;
    public final void rule__BinaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1856:1: ( rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1857:2: rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03786);
            rule__BinaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03789);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1864:1: rule__BinaryConstraint__Group_1__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1868:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1869:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1869:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1870:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BinaryConstraint__Group_1__0__Impl3817); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1883:1: rule__BinaryConstraint__Group_1__1 : rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 ;
    public final void rule__BinaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1887:1: ( rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1888:2: rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13848);
            rule__BinaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13851);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1895:1: rule__BinaryConstraint__Group_1__1__Impl : ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) ;
    public final void rule__BinaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1899:1: ( ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1900:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1900:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1901:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootAssignment_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1902:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1902:2: rule__BinaryConstraint__RootAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3878);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1912:1: rule__BinaryConstraint__Group_1__2 : rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 ;
    public final void rule__BinaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1916:1: ( rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1917:2: rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23908);
            rule__BinaryConstraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23911);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1924:1: rule__BinaryConstraint__Group_1__2__Impl : ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) ;
    public final void rule__BinaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1928:1: ( ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1929:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1929:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1930:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1931:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1931:2: rule__BinaryConstraint__NameAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3938);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1941:1: rule__BinaryConstraint__Group_1__3 : rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 ;
    public final void rule__BinaryConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1945:1: ( rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1946:2: rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33968);
            rule__BinaryConstraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33971);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1953:1: rule__BinaryConstraint__Group_1__3__Impl : ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) ;
    public final void rule__BinaryConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1957:1: ( ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1958:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1958:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1959:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_1_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1960:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1960:2: rule__BinaryConstraint__LeftAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl3998);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1970:1: rule__BinaryConstraint__Group_1__4 : rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 ;
    public final void rule__BinaryConstraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1974:1: ( rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1975:2: rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44028);
            rule__BinaryConstraint__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44031);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1982:1: rule__BinaryConstraint__Group_1__4__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) ;
    public final void rule__BinaryConstraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1986:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1987:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1987:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1988:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_1_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:2: rule__BinaryConstraint__OperatorAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4058);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1999:1: rule__BinaryConstraint__Group_1__5 : rule__BinaryConstraint__Group_1__5__Impl ;
    public final void rule__BinaryConstraint__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2003:1: ( rule__BinaryConstraint__Group_1__5__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2004:2: rule__BinaryConstraint__Group_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54088);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2010:1: rule__BinaryConstraint__Group_1__5__Impl : ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) ;
    public final void rule__BinaryConstraint__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2014:1: ( ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2015:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2015:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2016:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_1_5()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2017:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2017:2: rule__BinaryConstraint__RightAssignment_1_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4115);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2039:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2043:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2044:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04157);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04160);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2051:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2055:1: ( ( 'set' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2056:1: ( 'set' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2056:1: ( 'set' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2057:1: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Set__Group__0__Impl4188); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2070:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2074:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2075:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14219);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14222);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2082:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2086:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2087:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2087:1: ( ( rule__Set__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2088:1: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2089:1: ( rule__Set__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2089:2: rule__Set__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4249);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2099:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2103:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2104:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24279);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__3_in_rule__Set__Group__24282);
            rule__Set__Group__3();

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2111:1: rule__Set__Group__2__Impl : ( '=' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2115:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2116:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2116:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2117:1: '='
            {
             before(grammarAccess.getSetAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Set__Group__2__Impl4310); 
             after(grammarAccess.getSetAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Set__Group__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2130:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2134:1: ( rule__Set__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2135:2: rule__Set__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__34341);
            rule__Set__Group__3__Impl();

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
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2141:1: rule__Set__Group__3__Impl : ( ( rule__Set__Group_3__0 )? ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2145:1: ( ( ( rule__Set__Group_3__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2146:1: ( ( rule__Set__Group_3__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2146:1: ( ( rule__Set__Group_3__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2147:1: ( rule__Set__Group_3__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( rule__Set__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:2: rule__Set__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl4368);
                    rule__Set__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group_3__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2166:1: rule__Set__Group_3__0 : rule__Set__Group_3__0__Impl rule__Set__Group_3__1 ;
    public final void rule__Set__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2170:1: ( rule__Set__Group_3__0__Impl rule__Set__Group_3__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2171:2: rule__Set__Group_3__0__Impl rule__Set__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__04407);
            rule__Set__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__04410);
            rule__Set__Group_3__1();

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
    // $ANTLR end "rule__Set__Group_3__0"


    // $ANTLR start "rule__Set__Group_3__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2178:1: rule__Set__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2182:1: ( ( '[' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2183:1: ( '[' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2183:1: ( '[' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2184:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Set__Group_3__0__Impl4438); 
             after(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__0__Impl"


    // $ANTLR start "rule__Set__Group_3__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2197:1: rule__Set__Group_3__1 : rule__Set__Group_3__1__Impl rule__Set__Group_3__2 ;
    public final void rule__Set__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2201:1: ( rule__Set__Group_3__1__Impl rule__Set__Group_3__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2202:2: rule__Set__Group_3__1__Impl rule__Set__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__14469);
            rule__Set__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__2_in_rule__Set__Group_3__14472);
            rule__Set__Group_3__2();

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
    // $ANTLR end "rule__Set__Group_3__1"


    // $ANTLR start "rule__Set__Group_3__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2209:1: rule__Set__Group_3__1__Impl : ( ( rule__Set__HasAssignment_3_1 ) ) ;
    public final void rule__Set__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2213:1: ( ( ( rule__Set__HasAssignment_3_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2214:1: ( ( rule__Set__HasAssignment_3_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2214:1: ( ( rule__Set__HasAssignment_3_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2215:1: ( rule__Set__HasAssignment_3_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_3_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2216:1: ( rule__Set__HasAssignment_3_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2216:2: rule__Set__HasAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_3_1_in_rule__Set__Group_3__1__Impl4499);
            rule__Set__HasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getHasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__1__Impl"


    // $ANTLR start "rule__Set__Group_3__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2226:1: rule__Set__Group_3__2 : rule__Set__Group_3__2__Impl rule__Set__Group_3__3 ;
    public final void rule__Set__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2230:1: ( rule__Set__Group_3__2__Impl rule__Set__Group_3__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2231:2: rule__Set__Group_3__2__Impl rule__Set__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__2__Impl_in_rule__Set__Group_3__24529);
            rule__Set__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__3_in_rule__Set__Group_3__24532);
            rule__Set__Group_3__3();

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
    // $ANTLR end "rule__Set__Group_3__2"


    // $ANTLR start "rule__Set__Group_3__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2238:1: rule__Set__Group_3__2__Impl : ( ( rule__Set__Group_3_2__0 )* ) ;
    public final void rule__Set__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2242:1: ( ( ( rule__Set__Group_3_2__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2243:1: ( ( rule__Set__Group_3_2__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2243:1: ( ( rule__Set__Group_3_2__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2244:1: ( rule__Set__Group_3_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_3_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2245:1: ( rule__Set__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2245:2: rule__Set__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__0_in_rule__Set__Group_3__2__Impl4559);
            	    rule__Set__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSetAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__2__Impl"


    // $ANTLR start "rule__Set__Group_3__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2255:1: rule__Set__Group_3__3 : rule__Set__Group_3__3__Impl ;
    public final void rule__Set__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2259:1: ( rule__Set__Group_3__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2260:2: rule__Set__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__3__Impl_in_rule__Set__Group_3__34590);
            rule__Set__Group_3__3__Impl();

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
    // $ANTLR end "rule__Set__Group_3__3"


    // $ANTLR start "rule__Set__Group_3__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2266:1: rule__Set__Group_3__3__Impl : ( ']' ) ;
    public final void rule__Set__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2270:1: ( ( ']' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2271:1: ( ']' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2271:1: ( ']' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2272:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Set__Group_3__3__Impl4618); 
             after(grammarAccess.getSetAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3__3__Impl"


    // $ANTLR start "rule__Set__Group_3_2__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2293:1: rule__Set__Group_3_2__0 : rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1 ;
    public final void rule__Set__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2297:1: ( rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2298:2: rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__0__Impl_in_rule__Set__Group_3_2__04657);
            rule__Set__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__1_in_rule__Set__Group_3_2__04660);
            rule__Set__Group_3_2__1();

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
    // $ANTLR end "rule__Set__Group_3_2__0"


    // $ANTLR start "rule__Set__Group_3_2__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2305:1: rule__Set__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2309:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2310:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2310:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2311:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Set__Group_3_2__0__Impl4688); 
             after(grammarAccess.getSetAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3_2__0__Impl"


    // $ANTLR start "rule__Set__Group_3_2__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2324:1: rule__Set__Group_3_2__1 : rule__Set__Group_3_2__1__Impl ;
    public final void rule__Set__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2328:1: ( rule__Set__Group_3_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2329:2: rule__Set__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__1__Impl_in_rule__Set__Group_3_2__14719);
            rule__Set__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Set__Group_3_2__1"


    // $ANTLR start "rule__Set__Group_3_2__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2335:1: rule__Set__Group_3_2__1__Impl : ( ( rule__Set__HasAssignment_3_2_1 ) ) ;
    public final void rule__Set__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2339:1: ( ( ( rule__Set__HasAssignment_3_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2340:1: ( ( rule__Set__HasAssignment_3_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2340:1: ( ( rule__Set__HasAssignment_3_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2341:1: ( rule__Set__HasAssignment_3_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_3_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2342:1: ( rule__Set__HasAssignment_3_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2342:2: rule__Set__HasAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_3_2_1_in_rule__Set__Group_3_2__1__Impl4746);
            rule__Set__HasAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getHasAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group_3_2__1__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_0__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2356:1: rule__UnaryConstraint__Group_0__0 : rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1 ;
    public final void rule__UnaryConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2360:1: ( rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2361:2: rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__0__Impl_in_rule__UnaryConstraint__Group_0__04780);
            rule__UnaryConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__1_in_rule__UnaryConstraint__Group_0__04783);
            rule__UnaryConstraint__Group_0__1();

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
    // $ANTLR end "rule__UnaryConstraint__Group_0__0"


    // $ANTLR start "rule__UnaryConstraint__Group_0__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2368:1: rule__UnaryConstraint__Group_0__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2372:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2373:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2373:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2374:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__UnaryConstraint__Group_0__0__Impl4811); 
             after(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_0__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2387:1: rule__UnaryConstraint__Group_0__1 : rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2 ;
    public final void rule__UnaryConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2391:1: ( rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2392:2: rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__1__Impl_in_rule__UnaryConstraint__Group_0__14842);
            rule__UnaryConstraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__2_in_rule__UnaryConstraint__Group_0__14845);
            rule__UnaryConstraint__Group_0__2();

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
    // $ANTLR end "rule__UnaryConstraint__Group_0__1"


    // $ANTLR start "rule__UnaryConstraint__Group_0__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2399:1: rule__UnaryConstraint__Group_0__1__Impl : ( ( rule__UnaryConstraint__NameAssignment_0_1 ) ) ;
    public final void rule__UnaryConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2403:1: ( ( ( rule__UnaryConstraint__NameAssignment_0_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2404:1: ( ( rule__UnaryConstraint__NameAssignment_0_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2404:1: ( ( rule__UnaryConstraint__NameAssignment_0_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2405:1: ( rule__UnaryConstraint__NameAssignment_0_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_0_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:1: ( rule__UnaryConstraint__NameAssignment_0_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:2: rule__UnaryConstraint__NameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_0_1_in_rule__UnaryConstraint__Group_0__1__Impl4872);
            rule__UnaryConstraint__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_0__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2416:1: rule__UnaryConstraint__Group_0__2 : rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3 ;
    public final void rule__UnaryConstraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2420:1: ( rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2421:2: rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__2__Impl_in_rule__UnaryConstraint__Group_0__24902);
            rule__UnaryConstraint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__3_in_rule__UnaryConstraint__Group_0__24905);
            rule__UnaryConstraint__Group_0__3();

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
    // $ANTLR end "rule__UnaryConstraint__Group_0__2"


    // $ANTLR start "rule__UnaryConstraint__Group_0__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2428:1: rule__UnaryConstraint__Group_0__2__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) ) ;
    public final void rule__UnaryConstraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2432:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2433:1: ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2433:1: ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2434:1: ( rule__UnaryConstraint__OperatorAssignment_0_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_0_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:1: ( rule__UnaryConstraint__OperatorAssignment_0_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:2: rule__UnaryConstraint__OperatorAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_0_2_in_rule__UnaryConstraint__Group_0__2__Impl4932);
            rule__UnaryConstraint__OperatorAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_0__2__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_0__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2445:1: rule__UnaryConstraint__Group_0__3 : rule__UnaryConstraint__Group_0__3__Impl ;
    public final void rule__UnaryConstraint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2449:1: ( rule__UnaryConstraint__Group_0__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2450:2: rule__UnaryConstraint__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__3__Impl_in_rule__UnaryConstraint__Group_0__34962);
            rule__UnaryConstraint__Group_0__3__Impl();

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
    // $ANTLR end "rule__UnaryConstraint__Group_0__3"


    // $ANTLR start "rule__UnaryConstraint__Group_0__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2456:1: rule__UnaryConstraint__Group_0__3__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) ) ;
    public final void rule__UnaryConstraint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2460:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2461:1: ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2461:1: ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2462:1: ( rule__UnaryConstraint__ExpressionAssignment_0_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_0_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2463:1: ( rule__UnaryConstraint__ExpressionAssignment_0_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2463:2: rule__UnaryConstraint__ExpressionAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_0_3_in_rule__UnaryConstraint__Group_0__3__Impl4989);
            rule__UnaryConstraint__ExpressionAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_0__3__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_1__0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2481:1: rule__UnaryConstraint__Group_1__0 : rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1 ;
    public final void rule__UnaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2485:1: ( rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2486:2: rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__0__Impl_in_rule__UnaryConstraint__Group_1__05027);
            rule__UnaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__1_in_rule__UnaryConstraint__Group_1__05030);
            rule__UnaryConstraint__Group_1__1();

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
    // $ANTLR end "rule__UnaryConstraint__Group_1__0"


    // $ANTLR start "rule__UnaryConstraint__Group_1__0__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2493:1: rule__UnaryConstraint__Group_1__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2497:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2498:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2498:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2499:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__UnaryConstraint__Group_1__0__Impl5058); 
             after(grammarAccess.getUnaryConstraintAccess().getUcKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_1__1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2512:1: rule__UnaryConstraint__Group_1__1 : rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2 ;
    public final void rule__UnaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2516:1: ( rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2517:2: rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__1__Impl_in_rule__UnaryConstraint__Group_1__15089);
            rule__UnaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__2_in_rule__UnaryConstraint__Group_1__15092);
            rule__UnaryConstraint__Group_1__2();

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
    // $ANTLR end "rule__UnaryConstraint__Group_1__1"


    // $ANTLR start "rule__UnaryConstraint__Group_1__1__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2524:1: rule__UnaryConstraint__Group_1__1__Impl : ( ( rule__UnaryConstraint__RootAssignment_1_1 ) ) ;
    public final void rule__UnaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2528:1: ( ( ( rule__UnaryConstraint__RootAssignment_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2529:1: ( ( rule__UnaryConstraint__RootAssignment_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2529:1: ( ( rule__UnaryConstraint__RootAssignment_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2530:1: ( rule__UnaryConstraint__RootAssignment_1_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getRootAssignment_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2531:1: ( rule__UnaryConstraint__RootAssignment_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2531:2: rule__UnaryConstraint__RootAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__RootAssignment_1_1_in_rule__UnaryConstraint__Group_1__1__Impl5119);
            rule__UnaryConstraint__RootAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getRootAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_1__2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2541:1: rule__UnaryConstraint__Group_1__2 : rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3 ;
    public final void rule__UnaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2545:1: ( rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2546:2: rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__2__Impl_in_rule__UnaryConstraint__Group_1__25149);
            rule__UnaryConstraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__3_in_rule__UnaryConstraint__Group_1__25152);
            rule__UnaryConstraint__Group_1__3();

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
    // $ANTLR end "rule__UnaryConstraint__Group_1__2"


    // $ANTLR start "rule__UnaryConstraint__Group_1__2__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2553:1: rule__UnaryConstraint__Group_1__2__Impl : ( ( rule__UnaryConstraint__NameAssignment_1_2 ) ) ;
    public final void rule__UnaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2557:1: ( ( ( rule__UnaryConstraint__NameAssignment_1_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2558:1: ( ( rule__UnaryConstraint__NameAssignment_1_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2558:1: ( ( rule__UnaryConstraint__NameAssignment_1_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2559:1: ( rule__UnaryConstraint__NameAssignment_1_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2560:1: ( rule__UnaryConstraint__NameAssignment_1_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2560:2: rule__UnaryConstraint__NameAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_1_2_in_rule__UnaryConstraint__Group_1__2__Impl5179);
            rule__UnaryConstraint__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_1__3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2570:1: rule__UnaryConstraint__Group_1__3 : rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4 ;
    public final void rule__UnaryConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2574:1: ( rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2575:2: rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__3__Impl_in_rule__UnaryConstraint__Group_1__35209);
            rule__UnaryConstraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__4_in_rule__UnaryConstraint__Group_1__35212);
            rule__UnaryConstraint__Group_1__4();

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
    // $ANTLR end "rule__UnaryConstraint__Group_1__3"


    // $ANTLR start "rule__UnaryConstraint__Group_1__3__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2582:1: rule__UnaryConstraint__Group_1__3__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) ) ;
    public final void rule__UnaryConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2586:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2587:1: ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2587:1: ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2588:1: ( rule__UnaryConstraint__OperatorAssignment_1_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_1_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2589:1: ( rule__UnaryConstraint__OperatorAssignment_1_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2589:2: rule__UnaryConstraint__OperatorAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_1_3_in_rule__UnaryConstraint__Group_1__3__Impl5239);
            rule__UnaryConstraint__OperatorAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_1__3__Impl"


    // $ANTLR start "rule__UnaryConstraint__Group_1__4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2599:1: rule__UnaryConstraint__Group_1__4 : rule__UnaryConstraint__Group_1__4__Impl ;
    public final void rule__UnaryConstraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2603:1: ( rule__UnaryConstraint__Group_1__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2604:2: rule__UnaryConstraint__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__4__Impl_in_rule__UnaryConstraint__Group_1__45269);
            rule__UnaryConstraint__Group_1__4__Impl();

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
    // $ANTLR end "rule__UnaryConstraint__Group_1__4"


    // $ANTLR start "rule__UnaryConstraint__Group_1__4__Impl"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2610:1: rule__UnaryConstraint__Group_1__4__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) ) ;
    public final void rule__UnaryConstraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2614:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2615:1: ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2615:1: ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2616:1: ( rule__UnaryConstraint__ExpressionAssignment_1_4 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_1_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2617:1: ( rule__UnaryConstraint__ExpressionAssignment_1_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2617:2: rule__UnaryConstraint__ExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_1_4_in_rule__UnaryConstraint__Group_1__4__Impl5296);
            rule__UnaryConstraint__ExpressionAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__Group_1__4__Impl"


    // $ANTLR start "rule__Root__ConfiguratorsAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2638:1: rule__Root__ConfiguratorsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Root__ConfiguratorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2642:1: ( ( ruleConfiguration ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2643:1: ( ruleConfiguration )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2643:1: ( ruleConfiguration )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2644:1: ruleConfiguration
            {
             before(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_15341);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2653:1: rule__Root__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Root__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2657:1: ( ( ruleExpression ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2658:1: ( ruleExpression )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2658:1: ( ruleExpression )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2659:1: ruleExpression
            {
             before(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25372);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2668:1: rule__Configuration__AssignmentsAssignment_2_0 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2672:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2673:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2673:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2674:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05403);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2683:1: rule__Configuration__AssignmentsAssignment_2_1_1 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2687:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2688:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2688:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2689:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15434);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2698:1: rule__Assignment__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2702:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2703:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2703:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2704:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2705:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2706:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15469);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2717:1: rule__Assignment__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2721:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2722:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2722:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2723:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2724:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2725:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35508);
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


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2736:1: rule__Parameter__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2740:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2741:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2741:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2742:1: ruleTypeEnum
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_05543);
            ruleTypeEnum();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2751:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2755:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2756:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2756:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2757:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_15574);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__StringValue__TypeAssignment_0"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2766:1: rule__StringValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__StringValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2770:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2771:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2771:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2772:1: ruleTypeEnum
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05605);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2781:1: rule__StringValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2785:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2786:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2786:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2787:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15636);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2796:1: rule__StringValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2800:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2801:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2801:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2802:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35667);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2811:1: rule__IntegerValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__IntegerValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2815:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2816:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2816:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2817:1: ruleTypeEnum
            {
             before(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05698);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2826:1: rule__IntegerValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2830:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2831:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2831:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2832:1: ruleEString
            {
             before(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15729);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2841:1: rule__IntegerValue__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2845:1: ( ( ruleEInt ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2846:1: ( ruleEInt )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2846:1: ( ruleEInt )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2847:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35760);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2856:1: rule__BooleanValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__BooleanValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2860:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2861:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2861:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2862:1: ruleTypeEnum
            {
             before(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05791);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2871:1: rule__BooleanValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2875:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2876:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2876:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2877:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15822);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2886:1: rule__BooleanValue__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2890:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2891:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2891:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2892:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35853);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2901:1: rule__BinaryConstraint__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2905:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2906:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2906:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2907:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15884);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2916:1: rule__BinaryConstraint__LeftAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2920:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2921:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2921:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2922:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_0_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2923:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2924:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25919);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2935:1: rule__BinaryConstraint__OperatorAssignment_0_3 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2939:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2940:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2940:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2941:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_0_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35954);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2950:1: rule__BinaryConstraint__RightAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2954:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2955:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2955:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2956:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_0_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2957:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2958:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_0_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45989);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2969:1: rule__BinaryConstraint__RootAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__BinaryConstraint__RootAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2973:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2974:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2974:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2975:1: ruleEBoolean
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_16024);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2984:1: rule__BinaryConstraint__NameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2988:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2989:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2989:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2990:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_26055);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2999:1: rule__BinaryConstraint__LeftAssignment_1_3 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3003:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3004:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3004:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3005:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_1_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3006:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3007:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_1_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_36090);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3018:1: rule__BinaryConstraint__OperatorAssignment_1_4 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3022:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3023:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3023:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3024:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_46125);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3033:1: rule__BinaryConstraint__RightAssignment_1_5 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3037:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3038:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3038:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3039:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_1_5_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3040:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3041:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_1_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_56160);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3052:1: rule__Set__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3056:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3057:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3057:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3058:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__NameAssignment_16195);
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


    // $ANTLR start "rule__Set__HasAssignment_3_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3067:1: rule__Set__HasAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3071:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3072:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3072:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3073:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_3_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3074:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3075:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_16230);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getHasValueCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__HasAssignment_3_1"


    // $ANTLR start "rule__Set__HasAssignment_3_2_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3086:1: rule__Set__HasAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3090:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3091:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3091:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3092:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_3_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3093:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3094:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_2_16269);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getSetAccess().getHasValueCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__HasAssignment_3_2_1"


    // $ANTLR start "rule__UnaryConstraint__NameAssignment_0_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3105:1: rule__UnaryConstraint__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3109:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3110:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3110:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3111:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_0_16304);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__NameAssignment_0_1"


    // $ANTLR start "rule__UnaryConstraint__OperatorAssignment_0_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3120:1: rule__UnaryConstraint__OperatorAssignment_0_2 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3124:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3125:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3125:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3126:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_0_26335);
            ruleUnaryOperators();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__OperatorAssignment_0_2"


    // $ANTLR start "rule__UnaryConstraint__ExpressionAssignment_0_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3135:1: rule__UnaryConstraint__ExpressionAssignment_0_3 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3139:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3140:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3140:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3141:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_0_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3142:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3143:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_0_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_0_36370);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__ExpressionAssignment_0_3"


    // $ANTLR start "rule__UnaryConstraint__RootAssignment_1_1"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3154:1: rule__UnaryConstraint__RootAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__UnaryConstraint__RootAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3158:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3159:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3159:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3160:1: ruleEBoolean
            {
             before(grammarAccess.getUnaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__UnaryConstraint__RootAssignment_1_16405);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__RootAssignment_1_1"


    // $ANTLR start "rule__UnaryConstraint__NameAssignment_1_2"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3169:1: rule__UnaryConstraint__NameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3173:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3174:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3174:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3175:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_1_26436);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__NameAssignment_1_2"


    // $ANTLR start "rule__UnaryConstraint__OperatorAssignment_1_3"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3184:1: rule__UnaryConstraint__OperatorAssignment_1_3 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3188:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3189:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3189:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3190:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_1_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_1_36467);
            ruleUnaryOperators();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__OperatorAssignment_1_3"


    // $ANTLR start "rule__UnaryConstraint__ExpressionAssignment_1_4"
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3199:1: rule__UnaryConstraint__ExpressionAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3203:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3204:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3204:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3205:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_1_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3206:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3207:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_1_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_1_46502);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryConstraint__ExpressionAssignment_1_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\7\uffff\2\12\5\uffff";
    static final String DFA1_minS =
        "\1\16\1\uffff\3\4\2\uffff\2\16\1\4\4\uffff";
    static final String DFA1_maxS =
        "\1\43\1\uffff\3\5\2\uffff\2\43\1\36\4\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\3\uffff\1\3\1\7\3\uffff\1\2\1\5\1\4\1\6";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\3\1\4\16\uffff\1\1\1\5\2\uffff\1\6",
            "",
            "\1\7\1\10",
            "\1\7\1\10",
            "\1\7\1\10",
            "",
            "",
            "\3\12\14\uffff\1\11\1\uffff\2\12\2\uffff\1\12",
            "\3\12\14\uffff\1\11\1\uffff\2\12\2\uffff\1\12",
            "\2\14\1\13\5\uffff\2\15\20\uffff\1\13",
            "",
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
        public static final BitSet FOLLOW_rule__UnaryConstraint__Alternatives_in_ruleUnaryConstraint876 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__0_in_rule__UnaryConstraint__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__0_in_rule__UnaryConstraint__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperators__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperators__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperators__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperators__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperators__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BinaryOperators__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BinaryOperators__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BinaryOperators__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01623 = new BitSet(new long[]{0x000000098201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11684 = new BitSet(new long[]{0x000000098201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1714 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1772 = new BitSet(new long[]{0x000000098001C002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01809 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11870 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Configuration__Group__1__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01996 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__01999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2083 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02118 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02241 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Assignment__Group__0__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12303 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22363 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Assignment__Group__2__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02490 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02611 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12671 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StringValue__Group__2__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02858 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12918 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22978 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__IntegerValue__Group__2__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03105 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13165 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23225 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BooleanValue__Group__2__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03352 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EInt__Group__0__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03477 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BinaryConstraint__Group_0__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23599 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03786 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BinaryConstraint__Group_1__0__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13848 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23908 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33968 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44028 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Set__Group__0__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14219 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24279 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Set__Group__3_in_rule__Set__Group__24282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Set__Group__2__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__34341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__04407 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__04410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Set__Group_3__0__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__14469 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__Set__Group_3__2_in_rule__Set__Group_3__14472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_3_1_in_rule__Set__Group_3__1__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__2__Impl_in_rule__Set__Group_3__24529 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__Set__Group_3__3_in_rule__Set__Group_3__24532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__0_in_rule__Set__Group_3__2__Impl4559 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__3__Impl_in_rule__Set__Group_3__34590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Set__Group_3__3__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__0__Impl_in_rule__Set__Group_3_2__04657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__1_in_rule__Set__Group_3_2__04660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Set__Group_3_2__0__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__1__Impl_in_rule__Set__Group_3_2__14719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_3_2_1_in_rule__Set__Group_3_2__1__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__0__Impl_in_rule__UnaryConstraint__Group_0__04780 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__1_in_rule__UnaryConstraint__Group_0__04783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__UnaryConstraint__Group_0__0__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__1__Impl_in_rule__UnaryConstraint__Group_0__14842 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__2_in_rule__UnaryConstraint__Group_0__14845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_0_1_in_rule__UnaryConstraint__Group_0__1__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__2__Impl_in_rule__UnaryConstraint__Group_0__24902 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__3_in_rule__UnaryConstraint__Group_0__24905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_0_2_in_rule__UnaryConstraint__Group_0__2__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__3__Impl_in_rule__UnaryConstraint__Group_0__34962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_0_3_in_rule__UnaryConstraint__Group_0__3__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__0__Impl_in_rule__UnaryConstraint__Group_1__05027 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__1_in_rule__UnaryConstraint__Group_1__05030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__UnaryConstraint__Group_1__0__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__1__Impl_in_rule__UnaryConstraint__Group_1__15089 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__2_in_rule__UnaryConstraint__Group_1__15092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__RootAssignment_1_1_in_rule__UnaryConstraint__Group_1__1__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__2__Impl_in_rule__UnaryConstraint__Group_1__25149 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__3_in_rule__UnaryConstraint__Group_1__25152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_1_2_in_rule__UnaryConstraint__Group_1__2__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__3__Impl_in_rule__UnaryConstraint__Group_1__35209 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__4_in_rule__UnaryConstraint__Group_1__35212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_1_3_in_rule__UnaryConstraint__Group_1__3__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__4__Impl_in_rule__UnaryConstraint__Group_1__45269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_1_4_in_rule__UnaryConstraint__Group_1__4__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_15341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_05543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_15574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_16024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_26055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_36090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_46125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_56160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__NameAssignment_16195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_16230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_2_16269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_0_16304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_0_26335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_0_36370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__UnaryConstraint__RootAssignment_1_16405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_1_26436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_1_36467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_1_46502 = new BitSet(new long[]{0x0000000000000002L});
    }


}