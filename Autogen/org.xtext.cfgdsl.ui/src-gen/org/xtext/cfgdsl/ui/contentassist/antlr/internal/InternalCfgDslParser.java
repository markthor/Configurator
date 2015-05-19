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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:316:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:317:1: ( ruleEInt EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:318:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt605);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt612); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:325:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:329:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:330:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:330:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:331:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:332:1: ( rule__EInt__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:332:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt638);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:344:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:345:1: ( ruleEBoolean EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:346:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean665);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean672); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:353:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:357:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:358:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:358:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:359:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:360:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:360:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean698);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:372:1: entryRuleBinaryConstraint : ruleBinaryConstraint EOF ;
    public final void entryRuleBinaryConstraint() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:373:1: ( ruleBinaryConstraint EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:374:1: ruleBinaryConstraint EOF
            {
             before(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint725);
            ruleBinaryConstraint();

            state._fsp--;

             after(grammarAccess.getBinaryConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint732); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:381:1: ruleBinaryConstraint : ( ( rule__BinaryConstraint__Alternatives ) ) ;
    public final void ruleBinaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:385:2: ( ( ( rule__BinaryConstraint__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:1: ( ( rule__BinaryConstraint__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:386:1: ( ( rule__BinaryConstraint__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:387:1: ( rule__BinaryConstraint__Alternatives )
            {
             before(grammarAccess.getBinaryConstraintAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:388:1: ( rule__BinaryConstraint__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:388:2: rule__BinaryConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Alternatives_in_ruleBinaryConstraint758);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:400:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:401:1: ( ruleSet EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:402:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSet_in_entryRuleSet785);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSet792); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:409:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:413:2: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:414:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:414:1: ( ( rule__Set__Group__0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:415:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:416:1: ( rule__Set__Group__0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:416:2: rule__Set__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0_in_ruleSet818);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:428:1: entryRuleUnaryConstraint : ruleUnaryConstraint EOF ;
    public final void entryRuleUnaryConstraint() throws RecognitionException {
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:429:1: ( ruleUnaryConstraint EOF )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:430:1: ruleUnaryConstraint EOF
            {
             before(grammarAccess.getUnaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint845);
            ruleUnaryConstraint();

            state._fsp--;

             after(grammarAccess.getUnaryConstraintRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryConstraint852); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:437:1: ruleUnaryConstraint : ( ( rule__UnaryConstraint__Alternatives ) ) ;
    public final void ruleUnaryConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:441:2: ( ( ( rule__UnaryConstraint__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:1: ( ( rule__UnaryConstraint__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:442:1: ( ( rule__UnaryConstraint__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:443:1: ( rule__UnaryConstraint__Alternatives )
            {
             before(grammarAccess.getUnaryConstraintAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:444:1: ( rule__UnaryConstraint__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:444:2: rule__UnaryConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Alternatives_in_ruleUnaryConstraint878);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:457:1: ruleTypeEnum : ( ( rule__TypeEnum__Alternatives ) ) ;
    public final void ruleTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:461:1: ( ( ( rule__TypeEnum__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:462:1: ( ( rule__TypeEnum__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:462:1: ( ( rule__TypeEnum__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:463:1: ( rule__TypeEnum__Alternatives )
            {
             before(grammarAccess.getTypeEnumAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:464:1: ( rule__TypeEnum__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:464:2: rule__TypeEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum915);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:476:1: ruleBinaryOperators : ( ( rule__BinaryOperators__Alternatives ) ) ;
    public final void ruleBinaryOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:480:1: ( ( ( rule__BinaryOperators__Alternatives ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:481:1: ( ( rule__BinaryOperators__Alternatives ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:481:1: ( ( rule__BinaryOperators__Alternatives ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:482:1: ( rule__BinaryOperators__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorsAccess().getAlternatives()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:483:1: ( rule__BinaryOperators__Alternatives )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:483:2: rule__BinaryOperators__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperators__Alternatives_in_ruleBinaryOperators951);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:495:1: ruleUnaryOperators : ( ( '!' ) ) ;
    public final void ruleUnaryOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:499:1: ( ( ( '!' ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:1: ( ( '!' ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:500:1: ( ( '!' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:501:1: ( '!' )
            {
             before(grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:502:1: ( '!' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:502:3: '!'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleUnaryOperators988); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:514:1: rule__Expression__Alternatives : ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:518:1: ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:519:1: ( ruleBinaryConstraint )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:519:1: ( ruleBinaryConstraint )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:520:1: ruleBinaryConstraint
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryConstraintParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_rule__Expression__Alternatives1025);
                    ruleBinaryConstraint();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:525:6: ( ruleParameter )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:525:6: ( ruleParameter )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:526:1: ruleParameter
                    {
                     before(grammarAccess.getExpressionAccess().getParameterParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_rule__Expression__Alternatives1042);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:531:6: ( ruleSet )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:531:6: ( ruleSet )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:532:1: ruleSet
                    {
                     before(grammarAccess.getExpressionAccess().getSetParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSet_in_rule__Expression__Alternatives1059);
                    ruleSet();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:537:6: ( ruleStringValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:537:6: ( ruleStringValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:538:1: ruleStringValue
                    {
                     before(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_rule__Expression__Alternatives1076);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:543:6: ( ruleIntegerValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:543:6: ( ruleIntegerValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:544:1: ruleIntegerValue
                    {
                     before(grammarAccess.getExpressionAccess().getIntegerValueParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_rule__Expression__Alternatives1093);
                    ruleIntegerValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIntegerValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:549:6: ( ruleBooleanValue )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:549:6: ( ruleBooleanValue )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:550:1: ruleBooleanValue
                    {
                     before(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_rule__Expression__Alternatives1110);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:555:6: ( ruleUnaryConstraint )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:555:6: ( ruleUnaryConstraint )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:556:1: ruleUnaryConstraint
                    {
                     before(grammarAccess.getExpressionAccess().getUnaryConstraintParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_rule__Expression__Alternatives1127);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:567:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:571:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:572:1: ( RULE_STRING )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:572:1: ( RULE_STRING )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:573:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1160); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:578:6: ( RULE_ID )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:578:6: ( RULE_ID )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:579:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1177); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:589:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:593:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:594:1: ( 'true' )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:594:1: ( 'true' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:595:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1210); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:602:6: ( 'false' )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:602:6: ( 'false' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:603:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives1230); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:615:1: rule__BinaryConstraint__Alternatives : ( ( ( rule__BinaryConstraint__Group_0__0 ) ) | ( ( rule__BinaryConstraint__Group_1__0 ) ) );
    public final void rule__BinaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:619:1: ( ( ( rule__BinaryConstraint__Group_0__0 ) ) | ( ( rule__BinaryConstraint__Group_1__0 ) ) )
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:1: ( ( rule__BinaryConstraint__Group_0__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:620:1: ( ( rule__BinaryConstraint__Group_0__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:621:1: ( rule__BinaryConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getBinaryConstraintAccess().getGroup_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:622:1: ( rule__BinaryConstraint__Group_0__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:622:2: rule__BinaryConstraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__0_in_rule__BinaryConstraint__Alternatives1264);
                    rule__BinaryConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:626:6: ( ( rule__BinaryConstraint__Group_1__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:626:6: ( ( rule__BinaryConstraint__Group_1__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:627:1: ( rule__BinaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getBinaryConstraintAccess().getGroup_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:628:1: ( rule__BinaryConstraint__Group_1__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:628:2: rule__BinaryConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__0_in_rule__BinaryConstraint__Alternatives1282);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:637:1: rule__UnaryConstraint__Alternatives : ( ( ( rule__UnaryConstraint__Group_0__0 ) ) | ( ( rule__UnaryConstraint__Group_1__0 ) ) );
    public final void rule__UnaryConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:641:1: ( ( ( rule__UnaryConstraint__Group_0__0 ) ) | ( ( rule__UnaryConstraint__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=RULE_STRING && LA5_1<=RULE_ID)) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=12 && LA5_1<=13)) ) {
                    alt5=2;
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:1: ( ( rule__UnaryConstraint__Group_0__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:642:1: ( ( rule__UnaryConstraint__Group_0__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:643:1: ( rule__UnaryConstraint__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryConstraintAccess().getGroup_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:644:1: ( rule__UnaryConstraint__Group_0__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:644:2: rule__UnaryConstraint__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__0_in_rule__UnaryConstraint__Alternatives1315);
                    rule__UnaryConstraint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryConstraintAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:6: ( ( rule__UnaryConstraint__Group_1__0 ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:648:6: ( ( rule__UnaryConstraint__Group_1__0 ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:649:1: ( rule__UnaryConstraint__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryConstraintAccess().getGroup_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:650:1: ( rule__UnaryConstraint__Group_1__0 )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:650:2: rule__UnaryConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__0_in_rule__UnaryConstraint__Alternatives1333);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:659:1: rule__TypeEnum__Alternatives : ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) );
    public final void rule__TypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:663:1: ( ( ( 'int' ) ) | ( ( 'boolean' ) ) | ( ( 'string' ) ) )
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:664:1: ( ( 'int' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:664:1: ( ( 'int' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:665:1: ( 'int' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:666:1: ( 'int' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:666:3: 'int'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__TypeEnum__Alternatives1367); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:6: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:671:6: ( ( 'boolean' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:672:1: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:673:1: ( 'boolean' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:673:3: 'boolean'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__TypeEnum__Alternatives1388); 

                    }

                     after(grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:6: ( ( 'string' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:678:6: ( ( 'string' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:679:1: ( 'string' )
                    {
                     before(grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:680:1: ( 'string' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:680:3: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__TypeEnum__Alternatives1409); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:690:1: rule__BinaryOperators__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '*' ) ) | ( ( '+' ) ) | ( ( 'subset' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__BinaryOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:694:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '*' ) ) | ( ( '+' ) ) | ( ( 'subset' ) ) | ( ( '&&' ) ) | ( ( '||' ) ) )
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
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:695:1: ( ( '<' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:695:1: ( ( '<' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:696:1: ( '<' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:697:1: ( '<' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:697:3: '<'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperators__Alternatives1445); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:702:6: ( ( '>' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:702:6: ( ( '>' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:703:1: ( '>' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:704:1: ( '>' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:704:3: '>'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperators__Alternatives1466); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:709:6: ( ( '==' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:709:6: ( ( '==' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:710:1: ( '==' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:711:1: ( '==' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:711:3: '=='
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperators__Alternatives1487); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:716:6: ( ( '*' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:716:6: ( ( '*' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:717:1: ( '*' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:718:1: ( '*' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:718:3: '*'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__BinaryOperators__Alternatives1508); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:723:6: ( ( '+' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:723:6: ( ( '+' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:724:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:725:1: ( '+' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:725:3: '+'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__BinaryOperators__Alternatives1529); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:730:6: ( ( 'subset' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:730:6: ( ( 'subset' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:731:1: ( 'subset' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:732:1: ( 'subset' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:732:3: 'subset'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__BinaryOperators__Alternatives1550); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:737:6: ( ( '&&' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:737:6: ( ( '&&' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:738:1: ( '&&' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:739:1: ( '&&' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:739:3: '&&'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__BinaryOperators__Alternatives1571); 

                    }

                     after(grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:744:6: ( ( '||' ) )
                    {
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:744:6: ( ( '||' ) )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:745:1: ( '||' )
                    {
                     before(grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:746:1: ( '||' )
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:746:3: '||'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__BinaryOperators__Alternatives1592); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:758:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:762:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:763:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01625);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01628);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:770:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:774:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:775:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:775:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:776:1: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:777:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:779:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:789:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:793:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:794:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11686);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11689);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:801:1: rule__Root__Group__1__Impl : ( ( rule__Root__ConfiguratorsAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:805:1: ( ( ( rule__Root__ConfiguratorsAssignment_1 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:806:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:806:1: ( ( rule__Root__ConfiguratorsAssignment_1 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:807:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getConfiguratorsAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:808:1: ( rule__Root__ConfiguratorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:808:2: rule__Root__ConfiguratorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1716);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:818:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:822:1: ( rule__Root__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:823:2: rule__Root__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21747);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:829:1: rule__Root__Group__2__Impl : ( ( rule__Root__ExpressionsAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:833:1: ( ( ( rule__Root__ExpressionsAssignment_2 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:834:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:834:1: ( ( rule__Root__ExpressionsAssignment_2 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:835:1: ( rule__Root__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getExpressionsAssignment_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:836:1: ( rule__Root__ExpressionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=14 && LA9_0<=16)||(LA9_0>=31 && LA9_0<=32)||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:836:2: rule__Root__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1774);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:852:1: rule__Configuration__Group__0 : rule__Configuration__Group__0__Impl rule__Configuration__Group__1 ;
    public final void rule__Configuration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:856:1: ( rule__Configuration__Group__0__Impl rule__Configuration__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:857:2: rule__Configuration__Group__0__Impl rule__Configuration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01811);
            rule__Configuration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01814);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:864:1: rule__Configuration__Group__0__Impl : ( () ) ;
    public final void rule__Configuration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:868:1: ( ( () ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:869:1: ( () )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:869:1: ( () )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:870:1: ()
            {
             before(grammarAccess.getConfigurationAccess().getConfigurationAction_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:871:1: ()
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:873:1: 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:883:1: rule__Configuration__Group__1 : rule__Configuration__Group__1__Impl rule__Configuration__Group__2 ;
    public final void rule__Configuration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:887:1: ( rule__Configuration__Group__1__Impl rule__Configuration__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:888:2: rule__Configuration__Group__1__Impl rule__Configuration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11872);
            rule__Configuration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11875);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:895:1: rule__Configuration__Group__1__Impl : ( 'cfg' ) ;
    public final void rule__Configuration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:899:1: ( ( 'cfg' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:900:1: ( 'cfg' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:900:1: ( 'cfg' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:901:1: 'cfg'
            {
             before(grammarAccess.getConfigurationAccess().getCfgKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Configuration__Group__1__Impl1903); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:914:1: rule__Configuration__Group__2 : rule__Configuration__Group__2__Impl ;
    public final void rule__Configuration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:918:1: ( rule__Configuration__Group__2__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:919:2: rule__Configuration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21934);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:925:1: rule__Configuration__Group__2__Impl : ( ( rule__Configuration__Group_2__0 )? ) ;
    public final void rule__Configuration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:929:1: ( ( ( rule__Configuration__Group_2__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:930:1: ( ( rule__Configuration__Group_2__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:930:1: ( ( rule__Configuration__Group_2__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:931:1: ( rule__Configuration__Group_2__0 )?
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:932:1: ( rule__Configuration__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:932:2: rule__Configuration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1961);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:948:1: rule__Configuration__Group_2__0 : rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 ;
    public final void rule__Configuration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:952:1: ( rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:953:2: rule__Configuration__Group_2__0__Impl rule__Configuration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01998);
            rule__Configuration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__02001);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:960:1: rule__Configuration__Group_2__0__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) ;
    public final void rule__Configuration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:964:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:965:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:965:1: ( ( rule__Configuration__AssignmentsAssignment_2_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:966:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:967:1: ( rule__Configuration__AssignmentsAssignment_2_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:967:2: rule__Configuration__AssignmentsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl2028);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:977:1: rule__Configuration__Group_2__1 : rule__Configuration__Group_2__1__Impl ;
    public final void rule__Configuration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:981:1: ( rule__Configuration__Group_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:982:2: rule__Configuration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12058);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:988:1: rule__Configuration__Group_2__1__Impl : ( ( rule__Configuration__Group_2_1__0 )* ) ;
    public final void rule__Configuration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:992:1: ( ( ( rule__Configuration__Group_2_1__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:993:1: ( ( rule__Configuration__Group_2_1__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:993:1: ( ( rule__Configuration__Group_2_1__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:994:1: ( rule__Configuration__Group_2_1__0 )*
            {
             before(grammarAccess.getConfigurationAccess().getGroup_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:995:1: ( rule__Configuration__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:995:2: rule__Configuration__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2085);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1009:1: rule__Configuration__Group_2_1__0 : rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 ;
    public final void rule__Configuration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1013:1: ( rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1014:2: rule__Configuration__Group_2_1__0__Impl rule__Configuration__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02120);
            rule__Configuration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02123);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1021:1: rule__Configuration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Configuration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1025:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1026:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1026:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1027:1: ','
            {
             before(grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2151); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1040:1: rule__Configuration__Group_2_1__1 : rule__Configuration__Group_2_1__1__Impl ;
    public final void rule__Configuration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1044:1: ( rule__Configuration__Group_2_1__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1045:2: rule__Configuration__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12182);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1051:1: rule__Configuration__Group_2_1__1__Impl : ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) ;
    public final void rule__Configuration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1055:1: ( ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1056:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1056:1: ( ( rule__Configuration__AssignmentsAssignment_2_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1057:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignment_2_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1058:1: ( rule__Configuration__AssignmentsAssignment_2_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1058:2: rule__Configuration__AssignmentsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2209);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1072:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1076:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1077:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02243);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02246);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1084:1: rule__Assignment__Group__0__Impl : ( 'assign' ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1088:1: ( ( 'assign' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1089:1: ( 'assign' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1089:1: ( 'assign' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1090:1: 'assign'
            {
             before(grammarAccess.getAssignmentAccess().getAssignKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Assignment__Group__0__Impl2274); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1103:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1107:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1108:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12305);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12308);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1115:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__ParameterAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1119:1: ( ( ( rule__Assignment__ParameterAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1120:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1120:1: ( ( rule__Assignment__ParameterAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1121:1: ( rule__Assignment__ParameterAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getParameterAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1122:1: ( rule__Assignment__ParameterAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1122:2: rule__Assignment__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2335);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1132:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1136:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1137:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22365);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22368);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1144:1: rule__Assignment__Group__2__Impl : ( 'to' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1148:1: ( ( 'to' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1149:1: ( 'to' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1149:1: ( 'to' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1150:1: 'to'
            {
             before(grammarAccess.getAssignmentAccess().getToKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Assignment__Group__2__Impl2396); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1163:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1167:1: ( rule__Assignment__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1168:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32427);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1174:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1178:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1179:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1179:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1180:1: ( rule__Assignment__ValueAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1181:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1181:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2454);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1199:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1203:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1204:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02492);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02495);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1211:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1215:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1216:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1216:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1217:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1218:1: ( rule__Parameter__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1218:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl2522);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1228:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1232:1: ( rule__Parameter__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1233:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12552);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1239:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1243:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1244:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1244:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1245:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1246:1: ( rule__Parameter__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1246:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2579);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1260:1: rule__StringValue__Group__0 : rule__StringValue__Group__0__Impl rule__StringValue__Group__1 ;
    public final void rule__StringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1264:1: ( rule__StringValue__Group__0__Impl rule__StringValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1265:2: rule__StringValue__Group__0__Impl rule__StringValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02613);
            rule__StringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02616);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1272:1: rule__StringValue__Group__0__Impl : ( ( rule__StringValue__TypeAssignment_0 ) ) ;
    public final void rule__StringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1276:1: ( ( ( rule__StringValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1277:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1277:1: ( ( rule__StringValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1278:1: ( rule__StringValue__TypeAssignment_0 )
            {
             before(grammarAccess.getStringValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1279:1: ( rule__StringValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1279:2: rule__StringValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2643);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1289:1: rule__StringValue__Group__1 : rule__StringValue__Group__1__Impl rule__StringValue__Group__2 ;
    public final void rule__StringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1293:1: ( rule__StringValue__Group__1__Impl rule__StringValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1294:2: rule__StringValue__Group__1__Impl rule__StringValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12673);
            rule__StringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12676);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1301:1: rule__StringValue__Group__1__Impl : ( ( rule__StringValue__NameAssignment_1 ) ) ;
    public final void rule__StringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1305:1: ( ( ( rule__StringValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1306:1: ( ( rule__StringValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1306:1: ( ( rule__StringValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1307:1: ( rule__StringValue__NameAssignment_1 )
            {
             before(grammarAccess.getStringValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1308:1: ( rule__StringValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1308:2: rule__StringValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2703);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1318:1: rule__StringValue__Group__2 : rule__StringValue__Group__2__Impl rule__StringValue__Group__3 ;
    public final void rule__StringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1322:1: ( rule__StringValue__Group__2__Impl rule__StringValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1323:2: rule__StringValue__Group__2__Impl rule__StringValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22733);
            rule__StringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22736);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1330:1: rule__StringValue__Group__2__Impl : ( '=' ) ;
    public final void rule__StringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1334:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1335:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1335:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1336:1: '='
            {
             before(grammarAccess.getStringValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__StringValue__Group__2__Impl2764); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1349:1: rule__StringValue__Group__3 : rule__StringValue__Group__3__Impl ;
    public final void rule__StringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1353:1: ( rule__StringValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1354:2: rule__StringValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32795);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1360:1: rule__StringValue__Group__3__Impl : ( ( rule__StringValue__ValueAssignment_3 ) ) ;
    public final void rule__StringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1364:1: ( ( ( rule__StringValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1365:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1365:1: ( ( rule__StringValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1366:1: ( rule__StringValue__ValueAssignment_3 )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1367:1: ( rule__StringValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1367:2: rule__StringValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2822);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1385:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1389:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1390:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02860);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02863);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1397:1: rule__IntegerValue__Group__0__Impl : ( ( rule__IntegerValue__TypeAssignment_0 ) ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1401:1: ( ( ( rule__IntegerValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1402:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1402:1: ( ( rule__IntegerValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1403:1: ( rule__IntegerValue__TypeAssignment_0 )
            {
             before(grammarAccess.getIntegerValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1404:1: ( rule__IntegerValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1404:2: rule__IntegerValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2890);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1414:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1418:1: ( rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1419:2: rule__IntegerValue__Group__1__Impl rule__IntegerValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12920);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12923);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1426:1: rule__IntegerValue__Group__1__Impl : ( ( rule__IntegerValue__NameAssignment_1 ) ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1430:1: ( ( ( rule__IntegerValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1431:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1431:1: ( ( rule__IntegerValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1432:1: ( rule__IntegerValue__NameAssignment_1 )
            {
             before(grammarAccess.getIntegerValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1433:1: ( rule__IntegerValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1433:2: rule__IntegerValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2950);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1443:1: rule__IntegerValue__Group__2 : rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 ;
    public final void rule__IntegerValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1447:1: ( rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1448:2: rule__IntegerValue__Group__2__Impl rule__IntegerValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22980);
            rule__IntegerValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22983);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1455:1: rule__IntegerValue__Group__2__Impl : ( '=' ) ;
    public final void rule__IntegerValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1459:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1460:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1460:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1461:1: '='
            {
             before(grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__IntegerValue__Group__2__Impl3011); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1474:1: rule__IntegerValue__Group__3 : rule__IntegerValue__Group__3__Impl ;
    public final void rule__IntegerValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1478:1: ( rule__IntegerValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1479:2: rule__IntegerValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33042);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1485:1: rule__IntegerValue__Group__3__Impl : ( ( rule__IntegerValue__ValueAssignment_3 ) ) ;
    public final void rule__IntegerValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1489:1: ( ( ( rule__IntegerValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1490:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1490:1: ( ( rule__IntegerValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1491:1: ( rule__IntegerValue__ValueAssignment_3 )
            {
             before(grammarAccess.getIntegerValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1492:1: ( rule__IntegerValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1492:2: rule__IntegerValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3069);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1510:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1514:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1515:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03107);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03110);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1522:1: rule__BooleanValue__Group__0__Impl : ( ( rule__BooleanValue__TypeAssignment_0 ) ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1526:1: ( ( ( rule__BooleanValue__TypeAssignment_0 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1527:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1527:1: ( ( rule__BooleanValue__TypeAssignment_0 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1528:1: ( rule__BooleanValue__TypeAssignment_0 )
            {
             before(grammarAccess.getBooleanValueAccess().getTypeAssignment_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1529:1: ( rule__BooleanValue__TypeAssignment_0 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1529:2: rule__BooleanValue__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3137);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1539:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1543:1: ( rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1544:2: rule__BooleanValue__Group__1__Impl rule__BooleanValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13167);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13170);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1551:1: rule__BooleanValue__Group__1__Impl : ( ( rule__BooleanValue__NameAssignment_1 ) ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1555:1: ( ( ( rule__BooleanValue__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1556:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1556:1: ( ( rule__BooleanValue__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1557:1: ( rule__BooleanValue__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanValueAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1558:1: ( rule__BooleanValue__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1558:2: rule__BooleanValue__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3197);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1568:1: rule__BooleanValue__Group__2 : rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 ;
    public final void rule__BooleanValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1572:1: ( rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1573:2: rule__BooleanValue__Group__2__Impl rule__BooleanValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23227);
            rule__BooleanValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23230);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1580:1: rule__BooleanValue__Group__2__Impl : ( '=' ) ;
    public final void rule__BooleanValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1584:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1585:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1585:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1586:1: '='
            {
             before(grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BooleanValue__Group__2__Impl3258); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1599:1: rule__BooleanValue__Group__3 : rule__BooleanValue__Group__3__Impl ;
    public final void rule__BooleanValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1603:1: ( rule__BooleanValue__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1604:2: rule__BooleanValue__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33289);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1610:1: rule__BooleanValue__Group__3__Impl : ( ( rule__BooleanValue__ValueAssignment_3 ) ) ;
    public final void rule__BooleanValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1614:1: ( ( ( rule__BooleanValue__ValueAssignment_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1615:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1615:1: ( ( rule__BooleanValue__ValueAssignment_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1616:1: ( rule__BooleanValue__ValueAssignment_3 )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1617:1: ( rule__BooleanValue__ValueAssignment_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1617:2: rule__BooleanValue__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3316);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1635:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1639:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1640:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03354);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03357);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1647:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1651:1: ( ( ( '-' )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1652:1: ( ( '-' )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1652:1: ( ( '-' )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1653:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1654:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1655:2: '-'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__EInt__Group__0__Impl3386); 

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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1666:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1670:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1671:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13419);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1677:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1681:1: ( ( RULE_INT ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1682:1: ( RULE_INT )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1682:1: ( RULE_INT )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1683:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3446); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1698:1: rule__BinaryConstraint__Group_0__0 : rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 ;
    public final void rule__BinaryConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1702:1: ( rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1703:2: rule__BinaryConstraint__Group_0__0__Impl rule__BinaryConstraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03479);
            rule__BinaryConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03482);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1710:1: rule__BinaryConstraint__Group_0__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1714:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1715:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1715:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1716:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BinaryConstraint__Group_0__0__Impl3510); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1729:1: rule__BinaryConstraint__Group_0__1 : rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 ;
    public final void rule__BinaryConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1733:1: ( rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1734:2: rule__BinaryConstraint__Group_0__1__Impl rule__BinaryConstraint__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13541);
            rule__BinaryConstraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13544);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1741:1: rule__BinaryConstraint__Group_0__1__Impl : ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) ;
    public final void rule__BinaryConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1745:1: ( ( ( rule__BinaryConstraint__NameAssignment_0_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1746:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1746:1: ( ( rule__BinaryConstraint__NameAssignment_0_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1747:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_0_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1748:1: ( rule__BinaryConstraint__NameAssignment_0_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1748:2: rule__BinaryConstraint__NameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3571);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1758:1: rule__BinaryConstraint__Group_0__2 : rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 ;
    public final void rule__BinaryConstraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1762:1: ( rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1763:2: rule__BinaryConstraint__Group_0__2__Impl rule__BinaryConstraint__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23601);
            rule__BinaryConstraint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23604);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1770:1: rule__BinaryConstraint__Group_0__2__Impl : ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) ;
    public final void rule__BinaryConstraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1774:1: ( ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1775:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1775:1: ( ( rule__BinaryConstraint__LeftAssignment_0_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1776:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_0_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1777:1: ( rule__BinaryConstraint__LeftAssignment_0_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1777:2: rule__BinaryConstraint__LeftAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3631);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1787:1: rule__BinaryConstraint__Group_0__3 : rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 ;
    public final void rule__BinaryConstraint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1791:1: ( rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1792:2: rule__BinaryConstraint__Group_0__3__Impl rule__BinaryConstraint__Group_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33661);
            rule__BinaryConstraint__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33664);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1799:1: rule__BinaryConstraint__Group_0__3__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) ;
    public final void rule__BinaryConstraint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1803:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1804:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1804:1: ( ( rule__BinaryConstraint__OperatorAssignment_0_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1805:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_0_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1806:1: ( rule__BinaryConstraint__OperatorAssignment_0_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1806:2: rule__BinaryConstraint__OperatorAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3691);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1816:1: rule__BinaryConstraint__Group_0__4 : rule__BinaryConstraint__Group_0__4__Impl ;
    public final void rule__BinaryConstraint__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1820:1: ( rule__BinaryConstraint__Group_0__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1821:2: rule__BinaryConstraint__Group_0__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43721);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1827:1: rule__BinaryConstraint__Group_0__4__Impl : ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) ;
    public final void rule__BinaryConstraint__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1831:1: ( ( ( rule__BinaryConstraint__RightAssignment_0_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1832:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1832:1: ( ( rule__BinaryConstraint__RightAssignment_0_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1833:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_0_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1834:1: ( rule__BinaryConstraint__RightAssignment_0_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1834:2: rule__BinaryConstraint__RightAssignment_0_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3748);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1854:1: rule__BinaryConstraint__Group_1__0 : rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 ;
    public final void rule__BinaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1858:1: ( rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1859:2: rule__BinaryConstraint__Group_1__0__Impl rule__BinaryConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03788);
            rule__BinaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03791);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1866:1: rule__BinaryConstraint__Group_1__0__Impl : ( 'bc' ) ;
    public final void rule__BinaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1870:1: ( ( 'bc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1871:1: ( 'bc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1871:1: ( 'bc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1872:1: 'bc'
            {
             before(grammarAccess.getBinaryConstraintAccess().getBcKeyword_1_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BinaryConstraint__Group_1__0__Impl3819); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1885:1: rule__BinaryConstraint__Group_1__1 : rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 ;
    public final void rule__BinaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1889:1: ( rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1890:2: rule__BinaryConstraint__Group_1__1__Impl rule__BinaryConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13850);
            rule__BinaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13853);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1897:1: rule__BinaryConstraint__Group_1__1__Impl : ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) ;
    public final void rule__BinaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1901:1: ( ( ( rule__BinaryConstraint__RootAssignment_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1902:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1902:1: ( ( rule__BinaryConstraint__RootAssignment_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1903:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootAssignment_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1904:1: ( rule__BinaryConstraint__RootAssignment_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1904:2: rule__BinaryConstraint__RootAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3880);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1914:1: rule__BinaryConstraint__Group_1__2 : rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 ;
    public final void rule__BinaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1918:1: ( rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1919:2: rule__BinaryConstraint__Group_1__2__Impl rule__BinaryConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23910);
            rule__BinaryConstraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23913);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1926:1: rule__BinaryConstraint__Group_1__2__Impl : ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) ;
    public final void rule__BinaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1930:1: ( ( ( rule__BinaryConstraint__NameAssignment_1_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1931:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1931:1: ( ( rule__BinaryConstraint__NameAssignment_1_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1932:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameAssignment_1_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1933:1: ( rule__BinaryConstraint__NameAssignment_1_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1933:2: rule__BinaryConstraint__NameAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3940);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1943:1: rule__BinaryConstraint__Group_1__3 : rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 ;
    public final void rule__BinaryConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1947:1: ( rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1948:2: rule__BinaryConstraint__Group_1__3__Impl rule__BinaryConstraint__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33970);
            rule__BinaryConstraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33973);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1955:1: rule__BinaryConstraint__Group_1__3__Impl : ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) ;
    public final void rule__BinaryConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1959:1: ( ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1960:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1960:1: ( ( rule__BinaryConstraint__LeftAssignment_1_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1961:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftAssignment_1_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1962:1: ( rule__BinaryConstraint__LeftAssignment_1_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1962:2: rule__BinaryConstraint__LeftAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl4000);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1972:1: rule__BinaryConstraint__Group_1__4 : rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 ;
    public final void rule__BinaryConstraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1976:1: ( rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1977:2: rule__BinaryConstraint__Group_1__4__Impl rule__BinaryConstraint__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44030);
            rule__BinaryConstraint__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44033);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1984:1: rule__BinaryConstraint__Group_1__4__Impl : ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) ;
    public final void rule__BinaryConstraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1988:1: ( ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1989:1: ( ( rule__BinaryConstraint__OperatorAssignment_1_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1990:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorAssignment_1_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1991:1: ( rule__BinaryConstraint__OperatorAssignment_1_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:1991:2: rule__BinaryConstraint__OperatorAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4060);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2001:1: rule__BinaryConstraint__Group_1__5 : rule__BinaryConstraint__Group_1__5__Impl ;
    public final void rule__BinaryConstraint__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2005:1: ( rule__BinaryConstraint__Group_1__5__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2006:2: rule__BinaryConstraint__Group_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54090);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2012:1: rule__BinaryConstraint__Group_1__5__Impl : ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) ;
    public final void rule__BinaryConstraint__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2016:1: ( ( ( rule__BinaryConstraint__RightAssignment_1_5 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2017:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2017:1: ( ( rule__BinaryConstraint__RightAssignment_1_5 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2018:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightAssignment_1_5()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2019:1: ( rule__BinaryConstraint__RightAssignment_1_5 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2019:2: rule__BinaryConstraint__RightAssignment_1_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4117);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2041:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2045:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2046:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04159);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04162);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2053:1: rule__Set__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2057:1: ( ( 'set' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2058:1: ( 'set' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2058:1: ( 'set' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2059:1: 'set'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Set__Group__0__Impl4190); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2072:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2076:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2077:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14221);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14224);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2084:1: rule__Set__Group__1__Impl : ( ( rule__Set__NameAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2088:1: ( ( ( rule__Set__NameAssignment_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2089:1: ( ( rule__Set__NameAssignment_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2089:1: ( ( rule__Set__NameAssignment_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2090:1: ( rule__Set__NameAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getNameAssignment_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2091:1: ( rule__Set__NameAssignment_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2091:2: rule__Set__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4251);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2101:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2105:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2106:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24281);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__3_in_rule__Set__Group__24284);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2113:1: rule__Set__Group__2__Impl : ( '=' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2117:1: ( ( '=' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2118:1: ( '=' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2118:1: ( '=' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2119:1: '='
            {
             before(grammarAccess.getSetAccess().getEqualsSignKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Set__Group__2__Impl4312); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2132:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2136:1: ( rule__Set__Group__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2137:2: rule__Set__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__34343);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2143:1: rule__Set__Group__3__Impl : ( ( rule__Set__Group_3__0 )? ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2147:1: ( ( ( rule__Set__Group_3__0 )? ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( ( rule__Set__Group_3__0 )? )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2148:1: ( ( rule__Set__Group_3__0 )? )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2149:1: ( rule__Set__Group_3__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2150:1: ( rule__Set__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2150:2: rule__Set__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl4370);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2168:1: rule__Set__Group_3__0 : rule__Set__Group_3__0__Impl rule__Set__Group_3__1 ;
    public final void rule__Set__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2172:1: ( rule__Set__Group_3__0__Impl rule__Set__Group_3__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2173:2: rule__Set__Group_3__0__Impl rule__Set__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__04409);
            rule__Set__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__04412);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2180:1: rule__Set__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Set__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2184:1: ( ( '[' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2185:1: ( '[' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2185:1: ( '[' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2186:1: '['
            {
             before(grammarAccess.getSetAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Set__Group_3__0__Impl4440); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2199:1: rule__Set__Group_3__1 : rule__Set__Group_3__1__Impl rule__Set__Group_3__2 ;
    public final void rule__Set__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2203:1: ( rule__Set__Group_3__1__Impl rule__Set__Group_3__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2204:2: rule__Set__Group_3__1__Impl rule__Set__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__14471);
            rule__Set__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__2_in_rule__Set__Group_3__14474);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2211:1: rule__Set__Group_3__1__Impl : ( ( rule__Set__HasAssignment_3_1 ) ) ;
    public final void rule__Set__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2215:1: ( ( ( rule__Set__HasAssignment_3_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2216:1: ( ( rule__Set__HasAssignment_3_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2216:1: ( ( rule__Set__HasAssignment_3_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2217:1: ( rule__Set__HasAssignment_3_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_3_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2218:1: ( rule__Set__HasAssignment_3_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2218:2: rule__Set__HasAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_3_1_in_rule__Set__Group_3__1__Impl4501);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2228:1: rule__Set__Group_3__2 : rule__Set__Group_3__2__Impl rule__Set__Group_3__3 ;
    public final void rule__Set__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2232:1: ( rule__Set__Group_3__2__Impl rule__Set__Group_3__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2233:2: rule__Set__Group_3__2__Impl rule__Set__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__2__Impl_in_rule__Set__Group_3__24531);
            rule__Set__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__3_in_rule__Set__Group_3__24534);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2240:1: rule__Set__Group_3__2__Impl : ( ( rule__Set__Group_3_2__0 )* ) ;
    public final void rule__Set__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2244:1: ( ( ( rule__Set__Group_3_2__0 )* ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2245:1: ( ( rule__Set__Group_3_2__0 )* )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2245:1: ( ( rule__Set__Group_3_2__0 )* )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2246:1: ( rule__Set__Group_3_2__0 )*
            {
             before(grammarAccess.getSetAccess().getGroup_3_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2247:1: ( rule__Set__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2247:2: rule__Set__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__0_in_rule__Set__Group_3__2__Impl4561);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2257:1: rule__Set__Group_3__3 : rule__Set__Group_3__3__Impl ;
    public final void rule__Set__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2261:1: ( rule__Set__Group_3__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2262:2: rule__Set__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3__3__Impl_in_rule__Set__Group_3__34592);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2268:1: rule__Set__Group_3__3__Impl : ( ']' ) ;
    public final void rule__Set__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2272:1: ( ( ']' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2273:1: ( ']' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2273:1: ( ']' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2274:1: ']'
            {
             before(grammarAccess.getSetAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Set__Group_3__3__Impl4620); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2295:1: rule__Set__Group_3_2__0 : rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1 ;
    public final void rule__Set__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2299:1: ( rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2300:2: rule__Set__Group_3_2__0__Impl rule__Set__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__0__Impl_in_rule__Set__Group_3_2__04659);
            rule__Set__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__1_in_rule__Set__Group_3_2__04662);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2307:1: rule__Set__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2311:1: ( ( ',' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2312:1: ( ',' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2312:1: ( ',' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2313:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Set__Group_3_2__0__Impl4690); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2326:1: rule__Set__Group_3_2__1 : rule__Set__Group_3_2__1__Impl ;
    public final void rule__Set__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2330:1: ( rule__Set__Group_3_2__1__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2331:2: rule__Set__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__Group_3_2__1__Impl_in_rule__Set__Group_3_2__14721);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2337:1: rule__Set__Group_3_2__1__Impl : ( ( rule__Set__HasAssignment_3_2_1 ) ) ;
    public final void rule__Set__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2341:1: ( ( ( rule__Set__HasAssignment_3_2_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2342:1: ( ( rule__Set__HasAssignment_3_2_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2342:1: ( ( rule__Set__HasAssignment_3_2_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2343:1: ( rule__Set__HasAssignment_3_2_1 )
            {
             before(grammarAccess.getSetAccess().getHasAssignment_3_2_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2344:1: ( rule__Set__HasAssignment_3_2_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2344:2: rule__Set__HasAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Set__HasAssignment_3_2_1_in_rule__Set__Group_3_2__1__Impl4748);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2358:1: rule__UnaryConstraint__Group_0__0 : rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1 ;
    public final void rule__UnaryConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2362:1: ( rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2363:2: rule__UnaryConstraint__Group_0__0__Impl rule__UnaryConstraint__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__0__Impl_in_rule__UnaryConstraint__Group_0__04782);
            rule__UnaryConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__1_in_rule__UnaryConstraint__Group_0__04785);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2370:1: rule__UnaryConstraint__Group_0__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2374:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2375:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2375:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2376:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_0_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__UnaryConstraint__Group_0__0__Impl4813); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2389:1: rule__UnaryConstraint__Group_0__1 : rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2 ;
    public final void rule__UnaryConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2393:1: ( rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2394:2: rule__UnaryConstraint__Group_0__1__Impl rule__UnaryConstraint__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__1__Impl_in_rule__UnaryConstraint__Group_0__14844);
            rule__UnaryConstraint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__2_in_rule__UnaryConstraint__Group_0__14847);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2401:1: rule__UnaryConstraint__Group_0__1__Impl : ( ( rule__UnaryConstraint__NameAssignment_0_1 ) ) ;
    public final void rule__UnaryConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2405:1: ( ( ( rule__UnaryConstraint__NameAssignment_0_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:1: ( ( rule__UnaryConstraint__NameAssignment_0_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2406:1: ( ( rule__UnaryConstraint__NameAssignment_0_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2407:1: ( rule__UnaryConstraint__NameAssignment_0_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_0_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2408:1: ( rule__UnaryConstraint__NameAssignment_0_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2408:2: rule__UnaryConstraint__NameAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_0_1_in_rule__UnaryConstraint__Group_0__1__Impl4874);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2418:1: rule__UnaryConstraint__Group_0__2 : rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3 ;
    public final void rule__UnaryConstraint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2422:1: ( rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2423:2: rule__UnaryConstraint__Group_0__2__Impl rule__UnaryConstraint__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__2__Impl_in_rule__UnaryConstraint__Group_0__24904);
            rule__UnaryConstraint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__3_in_rule__UnaryConstraint__Group_0__24907);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2430:1: rule__UnaryConstraint__Group_0__2__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) ) ;
    public final void rule__UnaryConstraint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2434:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:1: ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2435:1: ( ( rule__UnaryConstraint__OperatorAssignment_0_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2436:1: ( rule__UnaryConstraint__OperatorAssignment_0_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_0_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2437:1: ( rule__UnaryConstraint__OperatorAssignment_0_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2437:2: rule__UnaryConstraint__OperatorAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_0_2_in_rule__UnaryConstraint__Group_0__2__Impl4934);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2447:1: rule__UnaryConstraint__Group_0__3 : rule__UnaryConstraint__Group_0__3__Impl ;
    public final void rule__UnaryConstraint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2451:1: ( rule__UnaryConstraint__Group_0__3__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2452:2: rule__UnaryConstraint__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_0__3__Impl_in_rule__UnaryConstraint__Group_0__34964);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2458:1: rule__UnaryConstraint__Group_0__3__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) ) ;
    public final void rule__UnaryConstraint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2462:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2463:1: ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2463:1: ( ( rule__UnaryConstraint__ExpressionAssignment_0_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2464:1: ( rule__UnaryConstraint__ExpressionAssignment_0_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_0_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:1: ( rule__UnaryConstraint__ExpressionAssignment_0_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2465:2: rule__UnaryConstraint__ExpressionAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_0_3_in_rule__UnaryConstraint__Group_0__3__Impl4991);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2483:1: rule__UnaryConstraint__Group_1__0 : rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1 ;
    public final void rule__UnaryConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2487:1: ( rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2488:2: rule__UnaryConstraint__Group_1__0__Impl rule__UnaryConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__0__Impl_in_rule__UnaryConstraint__Group_1__05029);
            rule__UnaryConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__1_in_rule__UnaryConstraint__Group_1__05032);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2495:1: rule__UnaryConstraint__Group_1__0__Impl : ( 'uc' ) ;
    public final void rule__UnaryConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2499:1: ( ( 'uc' ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2500:1: ( 'uc' )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2500:1: ( 'uc' )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2501:1: 'uc'
            {
             before(grammarAccess.getUnaryConstraintAccess().getUcKeyword_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__UnaryConstraint__Group_1__0__Impl5060); 
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2514:1: rule__UnaryConstraint__Group_1__1 : rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2 ;
    public final void rule__UnaryConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2518:1: ( rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2519:2: rule__UnaryConstraint__Group_1__1__Impl rule__UnaryConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__1__Impl_in_rule__UnaryConstraint__Group_1__15091);
            rule__UnaryConstraint__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__2_in_rule__UnaryConstraint__Group_1__15094);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2526:1: rule__UnaryConstraint__Group_1__1__Impl : ( ( rule__UnaryConstraint__RootAssignment_1_1 ) ) ;
    public final void rule__UnaryConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2530:1: ( ( ( rule__UnaryConstraint__RootAssignment_1_1 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2531:1: ( ( rule__UnaryConstraint__RootAssignment_1_1 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2531:1: ( ( rule__UnaryConstraint__RootAssignment_1_1 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2532:1: ( rule__UnaryConstraint__RootAssignment_1_1 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getRootAssignment_1_1()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2533:1: ( rule__UnaryConstraint__RootAssignment_1_1 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2533:2: rule__UnaryConstraint__RootAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__RootAssignment_1_1_in_rule__UnaryConstraint__Group_1__1__Impl5121);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2543:1: rule__UnaryConstraint__Group_1__2 : rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3 ;
    public final void rule__UnaryConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2547:1: ( rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2548:2: rule__UnaryConstraint__Group_1__2__Impl rule__UnaryConstraint__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__2__Impl_in_rule__UnaryConstraint__Group_1__25151);
            rule__UnaryConstraint__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__3_in_rule__UnaryConstraint__Group_1__25154);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2555:1: rule__UnaryConstraint__Group_1__2__Impl : ( ( rule__UnaryConstraint__NameAssignment_1_2 ) ) ;
    public final void rule__UnaryConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2559:1: ( ( ( rule__UnaryConstraint__NameAssignment_1_2 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2560:1: ( ( rule__UnaryConstraint__NameAssignment_1_2 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2560:1: ( ( rule__UnaryConstraint__NameAssignment_1_2 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2561:1: ( rule__UnaryConstraint__NameAssignment_1_2 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameAssignment_1_2()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2562:1: ( rule__UnaryConstraint__NameAssignment_1_2 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2562:2: rule__UnaryConstraint__NameAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__NameAssignment_1_2_in_rule__UnaryConstraint__Group_1__2__Impl5181);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2572:1: rule__UnaryConstraint__Group_1__3 : rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4 ;
    public final void rule__UnaryConstraint__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2576:1: ( rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2577:2: rule__UnaryConstraint__Group_1__3__Impl rule__UnaryConstraint__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__3__Impl_in_rule__UnaryConstraint__Group_1__35211);
            rule__UnaryConstraint__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__4_in_rule__UnaryConstraint__Group_1__35214);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2584:1: rule__UnaryConstraint__Group_1__3__Impl : ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) ) ;
    public final void rule__UnaryConstraint__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2588:1: ( ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2589:1: ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2589:1: ( ( rule__UnaryConstraint__OperatorAssignment_1_3 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2590:1: ( rule__UnaryConstraint__OperatorAssignment_1_3 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorAssignment_1_3()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2591:1: ( rule__UnaryConstraint__OperatorAssignment_1_3 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2591:2: rule__UnaryConstraint__OperatorAssignment_1_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__OperatorAssignment_1_3_in_rule__UnaryConstraint__Group_1__3__Impl5241);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2601:1: rule__UnaryConstraint__Group_1__4 : rule__UnaryConstraint__Group_1__4__Impl ;
    public final void rule__UnaryConstraint__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2605:1: ( rule__UnaryConstraint__Group_1__4__Impl )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2606:2: rule__UnaryConstraint__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__Group_1__4__Impl_in_rule__UnaryConstraint__Group_1__45271);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2612:1: rule__UnaryConstraint__Group_1__4__Impl : ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) ) ;
    public final void rule__UnaryConstraint__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2616:1: ( ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2617:1: ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2617:1: ( ( rule__UnaryConstraint__ExpressionAssignment_1_4 ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2618:1: ( rule__UnaryConstraint__ExpressionAssignment_1_4 )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionAssignment_1_4()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2619:1: ( rule__UnaryConstraint__ExpressionAssignment_1_4 )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2619:2: rule__UnaryConstraint__ExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryConstraint__ExpressionAssignment_1_4_in_rule__UnaryConstraint__Group_1__4__Impl5298);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2640:1: rule__Root__ConfiguratorsAssignment_1 : ( ruleConfiguration ) ;
    public final void rule__Root__ConfiguratorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2644:1: ( ( ruleConfiguration ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2645:1: ( ruleConfiguration )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2645:1: ( ruleConfiguration )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2646:1: ruleConfiguration
            {
             before(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_15343);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2655:1: rule__Root__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Root__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2659:1: ( ( ruleExpression ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2660:1: ( ruleExpression )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2660:1: ( ruleExpression )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2661:1: ruleExpression
            {
             before(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25374);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2670:1: rule__Configuration__AssignmentsAssignment_2_0 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2674:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2675:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2675:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2676:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05405);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2685:1: rule__Configuration__AssignmentsAssignment_2_1_1 : ( ruleAssignment ) ;
    public final void rule__Configuration__AssignmentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2689:1: ( ( ruleAssignment ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2690:1: ( ruleAssignment )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2690:1: ( ruleAssignment )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2691:1: ruleAssignment
            {
             before(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15436);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2700:1: rule__Assignment__ParameterAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2704:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2705:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2705:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2706:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2707:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2708:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getParameterParameterEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15471);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2719:1: rule__Assignment__ValueAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2723:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2724:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2724:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2725:1: ( ruleEString )
            {
             before(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2726:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2727:1: ruleEString
            {
             before(grammarAccess.getAssignmentAccess().getValueValueEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35510);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2738:1: rule__Parameter__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2742:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2743:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2743:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2744:1: ruleTypeEnum
            {
             before(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_05545);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2753:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2757:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2758:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2758:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2759:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_15576);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2768:1: rule__StringValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__StringValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2772:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2773:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2773:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2774:1: ruleTypeEnum
            {
             before(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05607);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2783:1: rule__StringValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2787:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2788:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2788:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2789:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15638);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2798:1: rule__StringValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2802:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2803:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2803:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2804:1: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35669);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2813:1: rule__IntegerValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__IntegerValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2817:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2818:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2818:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2819:1: ruleTypeEnum
            {
             before(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05700);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2828:1: rule__IntegerValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntegerValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2832:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2833:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2833:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2834:1: ruleEString
            {
             before(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15731);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2843:1: rule__IntegerValue__ValueAssignment_3 : ( ruleEInt ) ;
    public final void rule__IntegerValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2847:1: ( ( ruleEInt ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2848:1: ( ruleEInt )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2848:1: ( ruleEInt )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2849:1: ruleEInt
            {
             before(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35762);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2858:1: rule__BooleanValue__TypeAssignment_0 : ( ruleTypeEnum ) ;
    public final void rule__BooleanValue__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2862:1: ( ( ruleTypeEnum ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2863:1: ( ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2863:1: ( ruleTypeEnum )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2864:1: ruleTypeEnum
            {
             before(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05793);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2873:1: rule__BooleanValue__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2877:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2878:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2878:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2879:1: ruleEString
            {
             before(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15824);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2888:1: rule__BooleanValue__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2892:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2893:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2893:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2894:1: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35855);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2903:1: rule__BinaryConstraint__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2907:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2908:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2908:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2909:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15886);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2918:1: rule__BinaryConstraint__LeftAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2922:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2923:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2923:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2924:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_0_2_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2925:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2926:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25921);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2937:1: rule__BinaryConstraint__OperatorAssignment_0_3 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2941:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2942:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2942:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2943:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_0_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35956);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2952:1: rule__BinaryConstraint__RightAssignment_0_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2956:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2957:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2957:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2958:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_0_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2959:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2960:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_0_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45991);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2971:1: rule__BinaryConstraint__RootAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__BinaryConstraint__RootAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2975:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2976:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2976:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2977:1: ruleEBoolean
            {
             before(grammarAccess.getBinaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_16026);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2986:1: rule__BinaryConstraint__NameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__BinaryConstraint__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2990:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2991:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2991:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:2992:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_26057);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3001:1: rule__BinaryConstraint__LeftAssignment_1_3 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__LeftAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3005:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3006:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3006:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3007:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_1_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3008:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3009:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getLeftExpressionEStringParserRuleCall_1_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_36092);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3020:1: rule__BinaryConstraint__OperatorAssignment_1_4 : ( ruleBinaryOperators ) ;
    public final void rule__BinaryConstraint__OperatorAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3024:1: ( ( ruleBinaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3025:1: ( ruleBinaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3025:1: ( ruleBinaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3026:1: ruleBinaryOperators
            {
             before(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_46127);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3035:1: rule__BinaryConstraint__RightAssignment_1_5 : ( ( ruleEString ) ) ;
    public final void rule__BinaryConstraint__RightAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3039:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3040:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3040:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3041:1: ( ruleEString )
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_1_5_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3042:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3043:1: ruleEString
            {
             before(grammarAccess.getBinaryConstraintAccess().getRightExpressionEStringParserRuleCall_1_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_56162);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3054:1: rule__Set__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Set__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3058:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3059:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3059:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3060:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__NameAssignment_16197);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3069:1: rule__Set__HasAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3073:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3074:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3074:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3075:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_3_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3076:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3077:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_16232);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3088:1: rule__Set__HasAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Set__HasAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3092:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3093:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3093:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3094:1: ( ruleEString )
            {
             before(grammarAccess.getSetAccess().getHasValueCrossReference_3_2_1_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3095:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3096:1: ruleEString
            {
             before(grammarAccess.getSetAccess().getHasValueEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_2_16271);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3107:1: rule__UnaryConstraint__NameAssignment_0_1 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3111:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3112:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3112:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3113:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_0_16306);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3122:1: rule__UnaryConstraint__OperatorAssignment_0_2 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3126:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3127:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3127:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3128:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_0_26337);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3137:1: rule__UnaryConstraint__ExpressionAssignment_0_3 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3141:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3142:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3142:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3143:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_0_3_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3144:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3145:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_0_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_0_36372);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3156:1: rule__UnaryConstraint__RootAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__UnaryConstraint__RootAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3160:1: ( ( ruleEBoolean ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3161:1: ( ruleEBoolean )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3161:1: ( ruleEBoolean )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3162:1: ruleEBoolean
            {
             before(grammarAccess.getUnaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__UnaryConstraint__RootAssignment_1_16407);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3171:1: rule__UnaryConstraint__NameAssignment_1_2 : ( ruleEString ) ;
    public final void rule__UnaryConstraint__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3175:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3176:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3176:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3177:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_1_26438);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3186:1: rule__UnaryConstraint__OperatorAssignment_1_3 : ( ruleUnaryOperators ) ;
    public final void rule__UnaryConstraint__OperatorAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3190:1: ( ( ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3191:1: ( ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3191:1: ( ruleUnaryOperators )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3192:1: ruleUnaryOperators
            {
             before(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_1_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_1_36469);
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
    // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3201:1: rule__UnaryConstraint__ExpressionAssignment_1_4 : ( ( ruleEString ) ) ;
    public final void rule__UnaryConstraint__ExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3205:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3206:1: ( ( ruleEString ) )
            {
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3206:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3207:1: ( ruleEString )
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_1_4_0()); 
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3208:1: ( ruleEString )
            // ../org.xtext.cfgdsl.ui/src-gen/org/xtext/cfgdsl/ui/contentassist/antlr/internal/InternalCfgDsl.g:3209:1: ruleEString
            {
             before(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionEStringParserRuleCall_1_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_1_46504);
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
        "\1\uffff\1\1\3\uffff\1\3\1\7\3\uffff\1\2\1\6\1\5\1\4";
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
            "\2\15\1\14\5\uffff\2\13\20\uffff\1\14",
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
            return "514:1: rule__Expression__Alternatives : ( ( ruleBinaryConstraint ) | ( ruleParameter ) | ( ruleSet ) | ( ruleStringValue ) | ( ruleIntegerValue ) | ( ruleBooleanValue ) | ( ruleUnaryConstraint ) );";
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
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Alternatives_in_ruleBinaryConstraint758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_entryRuleSet785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSet792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleSet818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryConstraint852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Alternatives_in_ruleUnaryConstraint878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TypeEnum__Alternatives_in_ruleTypeEnum915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperators__Alternatives_in_ruleBinaryOperators951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleUnaryOperators988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_rule__Expression__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_rule__Expression__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_rule__Expression__Alternatives1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_rule__Expression__Alternatives1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_rule__Expression__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_rule__Expression__Alternatives1110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_rule__Expression__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__0_in_rule__BinaryConstraint__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__0_in_rule__BinaryConstraint__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__0_in_rule__UnaryConstraint__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__0_in_rule__UnaryConstraint__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TypeEnum__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TypeEnum__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TypeEnum__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperators__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperators__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperators__Alternatives1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BinaryOperators__Alternatives1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BinaryOperators__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BinaryOperators__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__BinaryOperators__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__BinaryOperators__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01625 = new BitSet(new long[]{0x000000098201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11686 = new BitSet(new long[]{0x000000098201C000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ConfiguratorsAssignment_1_in_rule__Root__Group__1__Impl1716 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ExpressionsAssignment_2_in_rule__Root__Group__2__Impl1774 = new BitSet(new long[]{0x000000098001C002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__0__Impl_in_rule__Configuration__Group__01811 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1_in_rule__Configuration__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__1__Impl_in_rule__Configuration__Group__11872 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2_in_rule__Configuration__Group__11875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Configuration__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group__2__Impl_in_rule__Configuration__Group__21934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0_in_rule__Configuration__Group__2__Impl1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__0__Impl_in_rule__Configuration__Group_2__01998 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1_in_rule__Configuration__Group_2__02001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_0_in_rule__Configuration__Group_2__0__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2__1__Impl_in_rule__Configuration__Group_2__12058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0_in_rule__Configuration__Group_2__1__Impl2085 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__0__Impl_in_rule__Configuration__Group_2_1__02120 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1_in_rule__Configuration__Group_2_1__02123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Configuration__Group_2_1__0__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__Group_2_1__1__Impl_in_rule__Configuration__Group_2_1__12182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuration__AssignmentsAssignment_2_1_1_in_rule__Configuration__Group_2_1__1__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02243 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Assignment__Group__0__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__12305 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__12308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ParameterAssignment_1_in_rule__Assignment__Group__1__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__22365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Assignment__Group__2__Impl2396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__32427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__02492 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__02495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__12552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__0__Impl_in_rule__StringValue__Group__02613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1_in_rule__StringValue__Group__02616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__TypeAssignment_0_in_rule__StringValue__Group__0__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__1__Impl_in_rule__StringValue__Group__12673 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2_in_rule__StringValue__Group__12676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__NameAssignment_1_in_rule__StringValue__Group__1__Impl2703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__2__Impl_in_rule__StringValue__Group__22733 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3_in_rule__StringValue__Group__22736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__StringValue__Group__2__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__Group__3__Impl_in_rule__StringValue__Group__32795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_3_in_rule__StringValue__Group__3__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__0__Impl_in_rule__IntegerValue__Group__02860 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1_in_rule__IntegerValue__Group__02863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__TypeAssignment_0_in_rule__IntegerValue__Group__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__1__Impl_in_rule__IntegerValue__Group__12920 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2_in_rule__IntegerValue__Group__12923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__NameAssignment_1_in_rule__IntegerValue__Group__1__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__2__Impl_in_rule__IntegerValue__Group__22980 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3_in_rule__IntegerValue__Group__22983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__IntegerValue__Group__2__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__Group__3__Impl_in_rule__IntegerValue__Group__33042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerValue__ValueAssignment_3_in_rule__IntegerValue__Group__3__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__0__Impl_in_rule__BooleanValue__Group__03107 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1_in_rule__BooleanValue__Group__03110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__TypeAssignment_0_in_rule__BooleanValue__Group__0__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__1__Impl_in_rule__BooleanValue__Group__13167 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2_in_rule__BooleanValue__Group__13170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__NameAssignment_1_in_rule__BooleanValue__Group__1__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__2__Impl_in_rule__BooleanValue__Group__23227 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3_in_rule__BooleanValue__Group__23230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BooleanValue__Group__2__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__Group__3__Impl_in_rule__BooleanValue__Group__33289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_3_in_rule__BooleanValue__Group__3__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03354 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EInt__Group__0__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__0__Impl_in_rule__BinaryConstraint__Group_0__03479 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1_in_rule__BinaryConstraint__Group_0__03482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BinaryConstraint__Group_0__0__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__1__Impl_in_rule__BinaryConstraint__Group_0__13541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2_in_rule__BinaryConstraint__Group_0__13544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_0_1_in_rule__BinaryConstraint__Group_0__1__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__2__Impl_in_rule__BinaryConstraint__Group_0__23601 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3_in_rule__BinaryConstraint__Group_0__23604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_0_2_in_rule__BinaryConstraint__Group_0__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__3__Impl_in_rule__BinaryConstraint__Group_0__33661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4_in_rule__BinaryConstraint__Group_0__33664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_0_3_in_rule__BinaryConstraint__Group_0__3__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_0__4__Impl_in_rule__BinaryConstraint__Group_0__43721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_0_4_in_rule__BinaryConstraint__Group_0__4__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__0__Impl_in_rule__BinaryConstraint__Group_1__03788 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1_in_rule__BinaryConstraint__Group_1__03791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BinaryConstraint__Group_1__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__1__Impl_in_rule__BinaryConstraint__Group_1__13850 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2_in_rule__BinaryConstraint__Group_1__13853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RootAssignment_1_1_in_rule__BinaryConstraint__Group_1__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__2__Impl_in_rule__BinaryConstraint__Group_1__23910 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3_in_rule__BinaryConstraint__Group_1__23913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__NameAssignment_1_2_in_rule__BinaryConstraint__Group_1__2__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__3__Impl_in_rule__BinaryConstraint__Group_1__33970 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4_in_rule__BinaryConstraint__Group_1__33973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__LeftAssignment_1_3_in_rule__BinaryConstraint__Group_1__3__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__4__Impl_in_rule__BinaryConstraint__Group_1__44030 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5_in_rule__BinaryConstraint__Group_1__44033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__OperatorAssignment_1_4_in_rule__BinaryConstraint__Group_1__4__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__Group_1__5__Impl_in_rule__BinaryConstraint__Group_1__54090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryConstraint__RightAssignment_1_5_in_rule__BinaryConstraint__Group_1__5__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__04159 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__04162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Set__Group__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__14221 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__14224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__NameAssignment_1_in_rule__Set__Group__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__24281 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Set__Group__3_in_rule__Set__Group__24284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Set__Group__2__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__34343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl4370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__04409 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__04412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Set__Group_3__0__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__14471 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__Set__Group_3__2_in_rule__Set__Group_3__14474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_3_1_in_rule__Set__Group_3__1__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__2__Impl_in_rule__Set__Group_3__24531 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_rule__Set__Group_3__3_in_rule__Set__Group_3__24534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__0_in_rule__Set__Group_3__2__Impl4561 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3__3__Impl_in_rule__Set__Group_3__34592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Set__Group_3__3__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__0__Impl_in_rule__Set__Group_3_2__04659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__1_in_rule__Set__Group_3_2__04662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Set__Group_3_2__0__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__Group_3_2__1__Impl_in_rule__Set__Group_3_2__14721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Set__HasAssignment_3_2_1_in_rule__Set__Group_3_2__1__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__0__Impl_in_rule__UnaryConstraint__Group_0__04782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__1_in_rule__UnaryConstraint__Group_0__04785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__UnaryConstraint__Group_0__0__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__1__Impl_in_rule__UnaryConstraint__Group_0__14844 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__2_in_rule__UnaryConstraint__Group_0__14847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_0_1_in_rule__UnaryConstraint__Group_0__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__2__Impl_in_rule__UnaryConstraint__Group_0__24904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__3_in_rule__UnaryConstraint__Group_0__24907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_0_2_in_rule__UnaryConstraint__Group_0__2__Impl4934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_0__3__Impl_in_rule__UnaryConstraint__Group_0__34964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_0_3_in_rule__UnaryConstraint__Group_0__3__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__0__Impl_in_rule__UnaryConstraint__Group_1__05029 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__1_in_rule__UnaryConstraint__Group_1__05032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__UnaryConstraint__Group_1__0__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__1__Impl_in_rule__UnaryConstraint__Group_1__15091 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__2_in_rule__UnaryConstraint__Group_1__15094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__RootAssignment_1_1_in_rule__UnaryConstraint__Group_1__1__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__2__Impl_in_rule__UnaryConstraint__Group_1__25151 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__3_in_rule__UnaryConstraint__Group_1__25154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__NameAssignment_1_2_in_rule__UnaryConstraint__Group_1__2__Impl5181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__3__Impl_in_rule__UnaryConstraint__Group_1__35211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__4_in_rule__UnaryConstraint__Group_1__35214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__OperatorAssignment_1_3_in_rule__UnaryConstraint__Group_1__3__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__Group_1__4__Impl_in_rule__UnaryConstraint__Group_1__45271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryConstraint__ExpressionAssignment_1_4_in_rule__UnaryConstraint__Group_1__4__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_rule__Root__ConfiguratorsAssignment_15343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__Root__ExpressionsAssignment_25374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_05405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_rule__Configuration__AssignmentsAssignment_2_1_15436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ParameterAssignment_15471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Assignment__ValueAssignment_35510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__Parameter__TypeAssignment_05545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Parameter__NameAssignment_15576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__StringValue__TypeAssignment_05607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__NameAssignment_15638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringValue__ValueAssignment_35669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__IntegerValue__TypeAssignment_05700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntegerValue__NameAssignment_15731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerValue__ValueAssignment_35762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_rule__BooleanValue__TypeAssignment_05793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BooleanValue__NameAssignment_15824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BooleanValue__ValueAssignment_35855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_0_15886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_0_25921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_0_35956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_0_45991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__BinaryConstraint__RootAssignment_1_16026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__NameAssignment_1_26057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__LeftAssignment_1_36092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_rule__BinaryConstraint__OperatorAssignment_1_46127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BinaryConstraint__RightAssignment_1_56162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__NameAssignment_16197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_16232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Set__HasAssignment_3_2_16271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_0_16306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_0_26337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_0_36372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__UnaryConstraint__RootAssignment_1_16407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__NameAssignment_1_26438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_rule__UnaryConstraint__OperatorAssignment_1_36469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__UnaryConstraint__ExpressionAssignment_1_46504 = new BitSet(new long[]{0x0000000000000002L});
    }


}