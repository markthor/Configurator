package org.xtext.cfgdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.cfgdsl.services.CfgDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfgDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cfg'", "','", "'assign'", "'to'", "'param'", "'='", "'-'", "'true'", "'false'", "'bc'", "'set'", "'['", "']'", "'uc'", "'int'", "'boolean'", "'string'", "'less'", "'greater'", "'equal'", "'multiplication'", "'addition'", "'subset'", "'and'", "'or'", "'not'"
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
    public String getGrammarFileName() { return "../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g"; }



     	private CfgDslGrammarAccess grammarAccess;
     	
        public InternalCfgDslParser(TokenStream input, CfgDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected CfgDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:70:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:77:1: ruleRoot returns [EObject current=null] : ( () ( (lv_configurators_1_0= ruleConfiguration ) )* ( (lv_expressions_2_0= ruleExpression ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_configurators_1_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:80:28: ( ( () ( (lv_configurators_1_0= ruleConfiguration ) )* ( (lv_expressions_2_0= ruleExpression ) )* ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:81:1: ( () ( (lv_configurators_1_0= ruleConfiguration ) )* ( (lv_expressions_2_0= ruleExpression ) )* )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:81:1: ( () ( (lv_configurators_1_0= ruleConfiguration ) )* ( (lv_expressions_2_0= ruleExpression ) )* )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:81:2: () ( (lv_configurators_1_0= ruleConfiguration ) )* ( (lv_expressions_2_0= ruleExpression ) )*
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:81:2: ()
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRootAccess().getRootAction_0(),
                        current);
                

            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:87:2: ( (lv_configurators_1_0= ruleConfiguration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:88:1: (lv_configurators_1_0= ruleConfiguration )
            	    {
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:88:1: (lv_configurators_1_0= ruleConfiguration )
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:89:3: lv_configurators_1_0= ruleConfiguration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getConfiguratorsConfigurationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_ruleRoot140);
            	    lv_configurators_1_0=ruleConfiguration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"configurators",
            	            		lv_configurators_1_0, 
            	            		"Configuration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:105:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||(LA2_0>=20 && LA2_0<=21)||(LA2_0>=24 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:106:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:106:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:107:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRoot162);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:131:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:132:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:133:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression199);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression209); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:140:1: ruleExpression returns [EObject current=null] : (this_BinaryConstraint_0= ruleBinaryConstraint | this_Parameter_1= ruleParameter | this_Set_2= ruleSet | this_StringValue_3= ruleStringValue | this_IntegerValue_4= ruleIntegerValue | this_BooleanValue_5= ruleBooleanValue | this_UnaryConstraint_6= ruleUnaryConstraint ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryConstraint_0 = null;

        EObject this_Parameter_1 = null;

        EObject this_Set_2 = null;

        EObject this_StringValue_3 = null;

        EObject this_IntegerValue_4 = null;

        EObject this_BooleanValue_5 = null;

        EObject this_UnaryConstraint_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:143:28: ( (this_BinaryConstraint_0= ruleBinaryConstraint | this_Parameter_1= ruleParameter | this_Set_2= ruleSet | this_StringValue_3= ruleStringValue | this_IntegerValue_4= ruleIntegerValue | this_BooleanValue_5= ruleBooleanValue | this_UnaryConstraint_6= ruleUnaryConstraint ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:144:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_Parameter_1= ruleParameter | this_Set_2= ruleSet | this_StringValue_3= ruleStringValue | this_IntegerValue_4= ruleIntegerValue | this_BooleanValue_5= ruleBooleanValue | this_UnaryConstraint_6= ruleUnaryConstraint )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:144:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_Parameter_1= ruleParameter | this_Set_2= ruleSet | this_StringValue_3= ruleStringValue | this_IntegerValue_4= ruleIntegerValue | this_BooleanValue_5= ruleBooleanValue | this_UnaryConstraint_6= ruleUnaryConstraint )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:145:5: this_BinaryConstraint_0= ruleBinaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBinaryConstraintParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_ruleExpression256);
                    this_BinaryConstraint_0=ruleBinaryConstraint();

                    state._fsp--;

                     
                            current = this_BinaryConstraint_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:155:5: this_Parameter_1= ruleParameter
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getParameterParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleExpression283);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;

                     
                            current = this_Parameter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:165:5: this_Set_2= ruleSet
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getSetParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSet_in_ruleExpression310);
                    this_Set_2=ruleSet();

                    state._fsp--;

                     
                            current = this_Set_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:175:5: this_StringValue_3= ruleStringValue
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getStringValueParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleExpression337);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;

                     
                            current = this_StringValue_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:185:5: this_IntegerValue_4= ruleIntegerValue
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIntegerValueParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_ruleExpression364);
                    this_IntegerValue_4=ruleIntegerValue();

                    state._fsp--;

                     
                            current = this_IntegerValue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:195:5: this_BooleanValue_5= ruleBooleanValue
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBooleanValueParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleExpression391);
                    this_BooleanValue_5=ruleBooleanValue();

                    state._fsp--;

                     
                            current = this_BooleanValue_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:205:5: this_UnaryConstraint_6= ruleUnaryConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getUnaryConstraintParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_ruleExpression418);
                    this_UnaryConstraint_6=ruleUnaryConstraint();

                    state._fsp--;

                     
                            current = this_UnaryConstraint_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleConfiguration"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:223:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:224:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:225:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguration_in_entryRuleConfiguration455);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguration465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:232:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'cfg' ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )? ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_assignments_2_0 = null;

        EObject lv_assignments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:235:28: ( ( () otherlv_1= 'cfg' ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )? ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:236:1: ( () otherlv_1= 'cfg' ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )? )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:236:1: ( () otherlv_1= 'cfg' ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )? )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:236:2: () otherlv_1= 'cfg' ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )?
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:236:2: ()
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:237:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfiguration511); 

                	newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getCfgKeyword_1());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:246:1: ( ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:246:2: ( (lv_assignments_2_0= ruleAssignment ) ) (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )*
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:246:2: ( (lv_assignments_2_0= ruleAssignment ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:247:1: (lv_assignments_2_0= ruleAssignment )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:247:1: (lv_assignments_2_0= ruleAssignment )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:248:3: lv_assignments_2_0= ruleAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleConfiguration533);
                    lv_assignments_2_0=ruleAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		add(
                           			current, 
                           			"assignments",
                            		lv_assignments_2_0, 
                            		"Assignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:264:2: (otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==12) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:264:4: otherlv_3= ',' ( (lv_assignments_4_0= ruleAssignment ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguration546); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:268:1: ( (lv_assignments_4_0= ruleAssignment ) )
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:269:1: (lv_assignments_4_0= ruleAssignment )
                    	    {
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:269:1: (lv_assignments_4_0= ruleAssignment )
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:270:3: lv_assignments_4_0= ruleAssignment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getAssignmentsAssignmentParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleConfiguration567);
                    	    lv_assignments_4_0=ruleAssignment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assignments",
                    	            		lv_assignments_4_0, 
                    	            		"Assignment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:294:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:295:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:296:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment607);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment617); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:303:1: ruleAssignment returns [EObject current=null] : (otherlv_0= 'assign' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:306:28: ( (otherlv_0= 'assign' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:307:1: (otherlv_0= 'assign' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:307:1: (otherlv_0= 'assign' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:307:3: otherlv_0= 'assign' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAssignment654); 

                	newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getAssignKeyword_0());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:311:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:312:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:312:1: ( ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:313:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getParameterParameterCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssignment677);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAssignment689); 

                	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getToKeyword_2());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:330:1: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:331:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:331:1: ( ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:332:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssignment712);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:353:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:354:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:355:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter748);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter758); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:362:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:365:28: ( (otherlv_0= 'param' ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:366:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:366:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:366:3: otherlv_0= 'param' ( (lv_type_1_0= ruleTypeEnum ) ) ( (lv_name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParameter795); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:370:1: ( (lv_type_1_0= ruleTypeEnum ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:371:1: (lv_type_1_0= ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:371:1: (lv_type_1_0= ruleTypeEnum )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:372:3: lv_type_1_0= ruleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeEnumEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleParameter816);
            lv_type_1_0=ruleTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"TypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:388:2: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:389:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:389:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:390:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter837);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:414:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:415:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:416:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString874);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:423:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:426:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:427:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:427:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:427:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString925); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:435:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString951); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStringValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:450:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:451:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:452:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue996);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue1006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:459:1: ruleStringValue returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:462:28: ( ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:463:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:463:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:463:2: ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:463:2: ( (lv_type_0_0= ruleTypeEnum ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:464:1: (lv_type_0_0= ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:464:1: (lv_type_0_0= ruleTypeEnum )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:465:3: lv_type_0_0= ruleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleStringValue1052);
            lv_type_0_0=ruleTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:481:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:482:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:482:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:483:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringValue1073);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStringValue1085); 

                	newLeafNode(otherlv_2, grammarAccess.getStringValueAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:503:1: ( (lv_value_3_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:504:1: (lv_value_3_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:504:1: (lv_value_3_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:505:3: lv_value_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringValue1106);
            lv_value_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntegerValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:529:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:530:2: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:531:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1142);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerValue1152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:538:1: ruleIntegerValue returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:541:28: ( ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:542:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:542:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:542:2: ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEInt ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:542:2: ( (lv_type_0_0= ruleTypeEnum ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:543:1: (lv_type_0_0= ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:543:1: (lv_type_0_0= ruleTypeEnum )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:544:3: lv_type_0_0= ruleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleIntegerValue1198);
            lv_type_0_0=ruleTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:560:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:561:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:561:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:562:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntegerValue1219);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntegerValue1231); 

                	newLeafNode(otherlv_2, grammarAccess.getIntegerValueAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:582:1: ( (lv_value_3_0= ruleEInt ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:583:1: (lv_value_3_0= ruleEInt )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:583:1: (lv_value_3_0= ruleEInt )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:584:3: lv_value_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerValue1252);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:608:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:609:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:610:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1288);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue1298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:617:1: ruleBooleanValue returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEBoolean ) ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:620:28: ( ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEBoolean ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:621:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEBoolean ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:621:1: ( ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEBoolean ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:621:2: ( (lv_type_0_0= ruleTypeEnum ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEBoolean ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:621:2: ( (lv_type_0_0= ruleTypeEnum ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:622:1: (lv_type_0_0= ruleTypeEnum )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:622:1: (lv_type_0_0= ruleTypeEnum )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:623:3: lv_type_0_0= ruleTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getTypeTypeEnumEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeEnum_in_ruleBooleanValue1344);
            lv_type_0_0=ruleTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:639:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:640:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:640:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:641:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBooleanValue1365);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBooleanValue1377); 

                	newLeafNode(otherlv_2, grammarAccess.getBooleanValueAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:661:1: ( (lv_value_3_0= ruleEBoolean ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:662:1: (lv_value_3_0= ruleEBoolean )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:662:1: (lv_value_3_0= ruleEBoolean )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:663:3: lv_value_3_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBooleanValue1398);
            lv_value_3_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:687:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:688:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:689:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1435);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1446); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:696:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:699:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:700:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:700:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:700:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:700:2: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:701:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEInt1485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1502); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:721:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:722:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:723:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1548);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:730:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:733:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:734:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:734:1: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:735:2: kw= 'true'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEBoolean1597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:742:2: kw= 'false'
                    {
                    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEBoolean1616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleBinaryConstraint"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:755:1: entryRuleBinaryConstraint returns [EObject current=null] : iv_ruleBinaryConstraint= ruleBinaryConstraint EOF ;
    public final EObject entryRuleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryConstraint = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:756:2: (iv_ruleBinaryConstraint= ruleBinaryConstraint EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:757:2: iv_ruleBinaryConstraint= ruleBinaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getBinaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint1656);
            iv_ruleBinaryConstraint=ruleBinaryConstraint();

            state._fsp--;

             current =iv_ruleBinaryConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryConstraint1666); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryConstraint"


    // $ANTLR start "ruleBinaryConstraint"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:764:1: ruleBinaryConstraint returns [EObject current=null] : ( (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) | (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) ) ;
    public final EObject ruleBinaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_root_6_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        Enumerator lv_operator_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:767:28: ( ( (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) | (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:768:1: ( (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) | (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:768:1: ( (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) | (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=18 && LA9_1<=19)) ) {
                    alt9=2;
                }
                else if ( ((LA9_1>=RULE_STRING && LA9_1<=RULE_ID)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:768:2: (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:768:2: (otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:768:4: otherlv_0= 'bc' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_3_0= ruleBinaryOperators ) ) ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBinaryConstraint1704); 

                        	newLeafNode(otherlv_0, grammarAccess.getBinaryConstraintAccess().getBcKeyword_0_0());
                        
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:772:1: ( (lv_name_1_0= ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:773:1: (lv_name_1_0= ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:773:1: (lv_name_1_0= ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:774:3: lv_name_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1725);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:790:2: ( ( ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:791:1: ( ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:791:1: ( ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:792:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1748);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:805:2: ( (lv_operator_3_0= ruleBinaryOperators ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:806:1: (lv_operator_3_0= ruleBinaryOperators )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:806:1: (lv_operator_3_0= ruleBinaryOperators )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:807:3: lv_operator_3_0= ruleBinaryOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_ruleBinaryConstraint1769);
                    lv_operator_3_0=ruleBinaryOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_3_0, 
                            		"BinaryOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:823:2: ( ( ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:824:1: ( ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:824:1: ( ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:825:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_0_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1792);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:839:6: (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:839:6: (otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:839:8: otherlv_5= 'bc' ( (lv_root_6_0= ruleEBoolean ) ) ( (lv_name_7_0= ruleEString ) ) ( ( ruleEString ) ) ( (lv_operator_9_0= ruleBinaryOperators ) ) ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBinaryConstraint1812); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryConstraintAccess().getBcKeyword_1_0());
                        
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:843:1: ( (lv_root_6_0= ruleEBoolean ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:844:1: (lv_root_6_0= ruleEBoolean )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:844:1: (lv_root_6_0= ruleEBoolean )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:845:3: lv_root_6_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRootEBooleanParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleBinaryConstraint1833);
                    lv_root_6_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"root",
                            		lv_root_6_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:861:2: ( (lv_name_7_0= ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:862:1: (lv_name_7_0= ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:862:1: (lv_name_7_0= ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:863:3: lv_name_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getNameEStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1854);
                    lv_name_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:879:2: ( ( ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:880:1: ( ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:880:1: ( ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:881:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getLeftExpressionCrossReference_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1877);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:894:2: ( (lv_operator_9_0= ruleBinaryOperators ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:895:1: (lv_operator_9_0= ruleBinaryOperators )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:895:1: (lv_operator_9_0= ruleBinaryOperators )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:896:3: lv_operator_9_0= ruleBinaryOperators
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getOperatorBinaryOperatorsEnumRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperators_in_ruleBinaryConstraint1898);
                    lv_operator_9_0=ruleBinaryOperators();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_9_0, 
                            		"BinaryOperators");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:912:2: ( ( ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:913:1: ( ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:913:1: ( ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:914:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConstraintRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBinaryConstraintAccess().getRightExpressionCrossReference_1_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBinaryConstraint1921);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryConstraint"


    // $ANTLR start "entryRuleSet"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:935:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:936:2: (iv_ruleSet= ruleSet EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:937:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSet_in_entryRuleSet1958);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSet1968); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:944:1: ruleSet returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:947:28: ( (otherlv_0= 'set' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )? ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:948:1: (otherlv_0= 'set' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )? )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:948:1: (otherlv_0= 'set' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )? )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:948:3: otherlv_0= 'set' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSet2005); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:952:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:953:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:953:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:954:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSetAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSet2026);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:970:2: (otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:970:4: otherlv_2= '[' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSet2039); 

                        	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:974:1: ( ( ruleEString ) )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:975:1: ( ruleEString )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:975:1: ( ruleEString )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:976:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getHasValueCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSet2062);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:989:2: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:989:4: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSet2075); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSetAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:993:1: ( ( ruleEString ) )
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:994:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:994:1: ( ruleEString )
                    	    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:995:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSetRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetAccess().getHasValueCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSet2098);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSet2112); 

                        	newLeafNode(otherlv_6, grammarAccess.getSetAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleUnaryConstraint"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1020:1: entryRuleUnaryConstraint returns [EObject current=null] : iv_ruleUnaryConstraint= ruleUnaryConstraint EOF ;
    public final EObject entryRuleUnaryConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryConstraint = null;


        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1021:2: (iv_ruleUnaryConstraint= ruleUnaryConstraint EOF )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1022:2: iv_ruleUnaryConstraint= ruleUnaryConstraint EOF
            {
             newCompositeNode(grammarAccess.getUnaryConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint2150);
            iv_ruleUnaryConstraint=ruleUnaryConstraint();

            state._fsp--;

             current =iv_ruleUnaryConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryConstraint2160); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryConstraint"


    // $ANTLR start "ruleUnaryConstraint"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1029:1: ruleUnaryConstraint returns [EObject current=null] : (otherlv_0= 'uc' ( (lv_name_1_0= ruleEString ) ) ( (lv_Operator_2_0= ruleUnaryOperators ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleUnaryConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_Operator_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1032:28: ( (otherlv_0= 'uc' ( (lv_name_1_0= ruleEString ) ) ( (lv_Operator_2_0= ruleUnaryOperators ) ) ( ( ruleEString ) ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1033:1: (otherlv_0= 'uc' ( (lv_name_1_0= ruleEString ) ) ( (lv_Operator_2_0= ruleUnaryOperators ) ) ( ( ruleEString ) ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1033:1: (otherlv_0= 'uc' ( (lv_name_1_0= ruleEString ) ) ( (lv_Operator_2_0= ruleUnaryOperators ) ) ( ( ruleEString ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1033:3: otherlv_0= 'uc' ( (lv_name_1_0= ruleEString ) ) ( (lv_Operator_2_0= ruleUnaryOperators ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleUnaryConstraint2197); 

                	newLeafNode(otherlv_0, grammarAccess.getUnaryConstraintAccess().getUcKeyword_0());
                
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1037:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1038:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1038:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1039:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUnaryConstraintAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUnaryConstraint2218);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1055:2: ( (lv_Operator_2_0= ruleUnaryOperators ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1056:1: (lv_Operator_2_0= ruleUnaryOperators )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1056:1: (lv_Operator_2_0= ruleUnaryOperators )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1057:3: lv_Operator_2_0= ruleUnaryOperators
            {
             
            	        newCompositeNode(grammarAccess.getUnaryConstraintAccess().getOperatorUnaryOperatorsEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperators_in_ruleUnaryConstraint2239);
            lv_Operator_2_0=ruleUnaryOperators();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"Operator",
                    		lv_Operator_2_0, 
                    		"UnaryOperators");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1073:2: ( ( ruleEString ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1074:1: ( ruleEString )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1074:1: ( ruleEString )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1075:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUnaryConstraintRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUnaryConstraintAccess().getExpressionExpressionCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUnaryConstraint2262);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryConstraint"


    // $ANTLR start "ruleTypeEnum"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1096:1: ruleTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'string' ) ) ;
    public final Enumerator ruleTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1098:28: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'string' ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1099:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'string' ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1099:1: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'boolean' ) | (enumLiteral_2= 'string' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1099:2: (enumLiteral_0= 'int' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1099:2: (enumLiteral_0= 'int' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1099:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTypeEnum2312); 

                            current = grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeEnumAccess().getIntegerTypeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1105:6: (enumLiteral_1= 'boolean' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1105:6: (enumLiteral_1= 'boolean' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1105:8: enumLiteral_1= 'boolean'
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeEnum2329); 

                            current = grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeEnumAccess().getBooleanTypeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1111:6: (enumLiteral_2= 'string' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1111:6: (enumLiteral_2= 'string' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1111:8: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTypeEnum2346); 

                            current = grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeEnumAccess().getStringTypeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeEnum"


    // $ANTLR start "ruleBinaryOperators"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1121:1: ruleBinaryOperators returns [Enumerator current=null] : ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'multiplication' ) | (enumLiteral_4= 'addition' ) | (enumLiteral_5= 'subset' ) | (enumLiteral_6= 'and' ) | (enumLiteral_7= 'or' ) ) ;
    public final Enumerator ruleBinaryOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1123:28: ( ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'multiplication' ) | (enumLiteral_4= 'addition' ) | (enumLiteral_5= 'subset' ) | (enumLiteral_6= 'and' ) | (enumLiteral_7= 'or' ) ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1124:1: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'multiplication' ) | (enumLiteral_4= 'addition' ) | (enumLiteral_5= 'subset' ) | (enumLiteral_6= 'and' ) | (enumLiteral_7= 'or' ) )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1124:1: ( (enumLiteral_0= 'less' ) | (enumLiteral_1= 'greater' ) | (enumLiteral_2= 'equal' ) | (enumLiteral_3= 'multiplication' ) | (enumLiteral_4= 'addition' ) | (enumLiteral_5= 'subset' ) | (enumLiteral_6= 'and' ) | (enumLiteral_7= 'or' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
                {
                alt13=4;
                }
                break;
            case 32:
                {
                alt13=5;
                }
                break;
            case 33:
                {
                alt13=6;
                }
                break;
            case 34:
                {
                alt13=7;
                }
                break;
            case 35:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1124:2: (enumLiteral_0= 'less' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1124:2: (enumLiteral_0= 'less' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1124:4: enumLiteral_0= 'less'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBinaryOperators2391); 

                            current = grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorsAccess().getLessEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1130:6: (enumLiteral_1= 'greater' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1130:6: (enumLiteral_1= 'greater' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1130:8: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBinaryOperators2408); 

                            current = grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorsAccess().getGreaterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1136:6: (enumLiteral_2= 'equal' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1136:6: (enumLiteral_2= 'equal' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1136:8: enumLiteral_2= 'equal'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryOperators2425); 

                            current = grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorsAccess().getEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1142:6: (enumLiteral_3= 'multiplication' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1142:6: (enumLiteral_3= 'multiplication' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1142:8: enumLiteral_3= 'multiplication'
                    {
                    enumLiteral_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryOperators2442); 

                            current = grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorsAccess().getMultiplicationEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1148:6: (enumLiteral_4= 'addition' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1148:6: (enumLiteral_4= 'addition' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1148:8: enumLiteral_4= 'addition'
                    {
                    enumLiteral_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryOperators2459); 

                            current = grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorsAccess().getAdditionEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1154:6: (enumLiteral_5= 'subset' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1154:6: (enumLiteral_5= 'subset' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1154:8: enumLiteral_5= 'subset'
                    {
                    enumLiteral_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBinaryOperators2476); 

                            current = grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorsAccess().getSubsetEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1160:6: (enumLiteral_6= 'and' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1160:6: (enumLiteral_6= 'and' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1160:8: enumLiteral_6= 'and'
                    {
                    enumLiteral_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleBinaryOperators2493); 

                            current = grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorsAccess().getAndEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1166:6: (enumLiteral_7= 'or' )
                    {
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1166:6: (enumLiteral_7= 'or' )
                    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1166:8: enumLiteral_7= 'or'
                    {
                    enumLiteral_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBinaryOperators2510); 

                            current = grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorsAccess().getOrEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperators"


    // $ANTLR start "ruleUnaryOperators"
    // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1176:1: ruleUnaryOperators returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryOperators() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1178:28: ( (enumLiteral_0= 'not' ) )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1179:1: (enumLiteral_0= 'not' )
            {
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1179:1: (enumLiteral_0= 'not' )
            // ../org.xtext.cfgdsl/src-gen/org/xtext/cfgdsl/parser/antlr/internal/InternalCfgDsl.g:1179:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUnaryOperators2554); 

                    current = grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorsAccess().getNotEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperators"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\17\3\uffff\3\4\1\uffff\2\20\1\4\3\uffff";
    static final String DFA3_maxS =
        "\1\33\3\uffff\3\5\1\uffff\2\20\1\23\3\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\3\uffff\1\4\1\5\1\6";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\4\uffff\1\1\1\3\2\uffff\1\7\1\4\1\5\1\6",
            "",
            "",
            "",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "",
            "\1\12",
            "\1\12",
            "\2\13\1\14\12\uffff\1\14\2\15",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "144:1: (this_BinaryConstraint_0= ruleBinaryConstraint | this_Parameter_1= ruleParameter | this_Set_2= ruleSet | this_StringValue_3= ruleStringValue | this_IntegerValue_4= ruleIntegerValue | this_BooleanValue_5= ruleBooleanValue | this_UnaryConstraint_6= ruleUnaryConstraint )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_ruleRoot140 = new BitSet(new long[]{0x000000000F308802L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRoot162 = new BitSet(new long[]{0x000000000F308002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_ruleExpression256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleExpression283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_ruleExpression310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleExpression337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_ruleExpression364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleExpression391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_ruleExpression418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConfiguration_in_entryRuleConfiguration455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguration465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfiguration511 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleConfiguration533 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleConfiguration546 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleConfiguration567 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleAssignment654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssignment677 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAssignment689 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssignment712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParameter795 = new BitSet(new long[]{0x000000000E000000L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleParameter816 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleStringValue1052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringValue1073 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStringValue1085 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringValue1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerValue_in_entryRuleIntegerValue1142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerValue1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleIntegerValue1198 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntegerValue1219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleIntegerValue1231 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerValue1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeEnum_in_ruleBooleanValue1344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBooleanValue1365 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBooleanValue1377 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBooleanValue1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEInt1485 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEBoolean1597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEBoolean1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryConstraint_in_entryRuleBinaryConstraint1656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryConstraint1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBinaryConstraint1704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1748 = new BitSet(new long[]{0x0000000FF0000000L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_ruleBinaryConstraint1769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleBinaryConstraint1812 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleBinaryConstraint1833 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1854 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1877 = new BitSet(new long[]{0x0000000FF0000000L});
        public static final BitSet FOLLOW_ruleBinaryOperators_in_ruleBinaryConstraint1898 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBinaryConstraint1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSet_in_entryRuleSet1958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSet1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSet2005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSet2026 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleSet2039 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSet2062 = new BitSet(new long[]{0x0000000000801000L});
        public static final BitSet FOLLOW_12_in_ruleSet2075 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSet2098 = new BitSet(new long[]{0x0000000000801000L});
        public static final BitSet FOLLOW_23_in_ruleSet2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryConstraint_in_entryRuleUnaryConstraint2150 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryConstraint2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleUnaryConstraint2197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUnaryConstraint2218 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleUnaryOperators_in_ruleUnaryConstraint2239 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUnaryConstraint2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTypeEnum2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypeEnum2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleTypeEnum2346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleBinaryOperators2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBinaryOperators2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleBinaryOperators2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleBinaryOperators2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleBinaryOperators2459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBinaryOperators2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleBinaryOperators2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBinaryOperators2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUnaryOperators2554 = new BitSet(new long[]{0x0000000000000002L});
    }


}