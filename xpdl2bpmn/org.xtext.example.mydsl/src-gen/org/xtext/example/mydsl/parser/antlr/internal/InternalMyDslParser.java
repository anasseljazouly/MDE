package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XpdlRoot'", "'{'", "'diagramName'", "'pools'", "','", "'}'", "'process'", "'messageflows'", "'Pool'", "'name'", "'lanes'", "'Process'", "'pool'", "'transitions'", "'activityset'", "'MessageFlow'", "'source'", "'target'", "'Lane'", "'ActivitySet'", "'activities'", "'Activity'", "'title'", "'BlockActivity'", "'Event'", "'time'", "'type'", "'Gateway'", "'rule'", "'SubFlow'", "'Transition'", "'condition'", "'START'", "'INTERMEDIATE'", "'END'", "'NONE'", "'MESSAGE'", "'EROR'", "'RULE'", "'TIMER'", "'XOR'", "'OR'", "'AND'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XpdlRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXpdlRoot"
    // InternalMyDsl.g:65:1: entryRuleXpdlRoot returns [EObject current=null] : iv_ruleXpdlRoot= ruleXpdlRoot EOF ;
    public final EObject entryRuleXpdlRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXpdlRoot = null;


        try {
            // InternalMyDsl.g:65:49: (iv_ruleXpdlRoot= ruleXpdlRoot EOF )
            // InternalMyDsl.g:66:2: iv_ruleXpdlRoot= ruleXpdlRoot EOF
            {
             newCompositeNode(grammarAccess.getXpdlRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXpdlRoot=ruleXpdlRoot();

            state._fsp--;

             current =iv_ruleXpdlRoot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXpdlRoot"


    // $ANTLR start "ruleXpdlRoot"
    // InternalMyDsl.g:72:1: ruleXpdlRoot returns [EObject current=null] : ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleXpdlRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_diagramName_5_0 = null;

        EObject lv_pools_8_0 = null;

        EObject lv_pools_10_0 = null;

        EObject lv_process_14_0 = null;

        EObject lv_process_16_0 = null;

        EObject lv_messageflows_20_0 = null;

        EObject lv_messageflows_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'XpdlRoot' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )? (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )? (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )? (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXpdlRootAccess().getXpdlRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:92:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:92:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:93:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXpdlRootRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:114:3: (otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:115:4: otherlv_4= 'diagramName' ( (lv_diagramName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:119:4: ( (lv_diagramName_5_0= ruleEString ) )
                    // InternalMyDsl.g:120:5: (lv_diagramName_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:120:5: (lv_diagramName_5_0= ruleEString )
                    // InternalMyDsl.g:121:6: lv_diagramName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_diagramName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						set(
                    							current,
                    							"diagramName",
                    							lv_diagramName_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:139:3: (otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:140:4: otherlv_6= 'pools' otherlv_7= '{' ( (lv_pools_8_0= rulePool ) ) (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXpdlRootAccess().getPoolsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:148:4: ( (lv_pools_8_0= rulePool ) )
                    // InternalMyDsl.g:149:5: (lv_pools_8_0= rulePool )
                    {
                    // InternalMyDsl.g:149:5: (lv_pools_8_0= rulePool )
                    // InternalMyDsl.g:150:6: lv_pools_8_0= rulePool
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_pools_8_0=rulePool();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"pools",
                    							lv_pools_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Pool");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:167:4: (otherlv_9= ',' ( (lv_pools_10_0= rulePool ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:168:5: otherlv_9= ',' ( (lv_pools_10_0= rulePool ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:172:5: ( (lv_pools_10_0= rulePool ) )
                    	    // InternalMyDsl.g:173:6: (lv_pools_10_0= rulePool )
                    	    {
                    	    // InternalMyDsl.g:173:6: (lv_pools_10_0= rulePool )
                    	    // InternalMyDsl.g:174:7: lv_pools_10_0= rulePool
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_pools_10_0=rulePool();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pools",
                    	    								lv_pools_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Pool");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:197:3: (otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:198:4: otherlv_12= 'process' otherlv_13= '{' ( (lv_process_14_0= ruleProcess ) ) (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:206:4: ( (lv_process_14_0= ruleProcess ) )
                    // InternalMyDsl.g:207:5: (lv_process_14_0= ruleProcess )
                    {
                    // InternalMyDsl.g:207:5: (lv_process_14_0= ruleProcess )
                    // InternalMyDsl.g:208:6: lv_process_14_0= ruleProcess
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_process_14_0=ruleProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"process",
                    							lv_process_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Process");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:225:4: (otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:226:5: otherlv_15= ',' ( (lv_process_16_0= ruleProcess ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:230:5: ( (lv_process_16_0= ruleProcess ) )
                    	    // InternalMyDsl.g:231:6: (lv_process_16_0= ruleProcess )
                    	    {
                    	    // InternalMyDsl.g:231:6: (lv_process_16_0= ruleProcess )
                    	    // InternalMyDsl.g:232:7: lv_process_16_0= ruleProcess
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_process_16_0=ruleProcess();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"process",
                    	    								lv_process_16_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Process");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:255:3: (otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:256:4: otherlv_18= 'messageflows' otherlv_19= '{' ( (lv_messageflows_20_0= ruleMessageFlow ) ) (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:264:4: ( (lv_messageflows_20_0= ruleMessageFlow ) )
                    // InternalMyDsl.g:265:5: (lv_messageflows_20_0= ruleMessageFlow )
                    {
                    // InternalMyDsl.g:265:5: (lv_messageflows_20_0= ruleMessageFlow )
                    // InternalMyDsl.g:266:6: lv_messageflows_20_0= ruleMessageFlow
                    {

                    						newCompositeNode(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_messageflows_20_0=ruleMessageFlow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    						}
                    						add(
                    							current,
                    							"messageflows",
                    							lv_messageflows_20_0,
                    							"org.xtext.example.mydsl.MyDsl.MessageFlow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:283:4: (otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:284:5: otherlv_21= ',' ( (lv_messageflows_22_0= ruleMessageFlow ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:288:5: ( (lv_messageflows_22_0= ruleMessageFlow ) )
                    	    // InternalMyDsl.g:289:6: (lv_messageflows_22_0= ruleMessageFlow )
                    	    {
                    	    // InternalMyDsl.g:289:6: (lv_messageflows_22_0= ruleMessageFlow )
                    	    // InternalMyDsl.g:290:7: lv_messageflows_22_0= ruleMessageFlow
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_messageflows_22_0=ruleMessageFlow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpdlRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"messageflows",
                    	    								lv_messageflows_22_0,
                    	    								"org.xtext.example.mydsl.MyDsl.MessageFlow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleXpdlRoot"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:321:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalMyDsl.g:321:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalMyDsl.g:322:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:328:1: ruleActivity returns [EObject current=null] : (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_Impl_0 = null;

        EObject this_BlockActivity_1 = null;

        EObject this_Event_2 = null;

        EObject this_Gateway_3 = null;

        EObject this_SubFlow_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow ) )
            // InternalMyDsl.g:335:2: (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow )
            {
            // InternalMyDsl.g:335:2: (this_Activity_Impl_0= ruleActivity_Impl | this_BlockActivity_1= ruleBlockActivity | this_Event_2= ruleEvent | this_Gateway_3= ruleGateway | this_SubFlow_4= ruleSubFlow )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            case 40:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:336:3: this_Activity_Impl_0= ruleActivity_Impl
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Activity_Impl_0=ruleActivity_Impl();

                    state._fsp--;


                    			current = this_Activity_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:345:3: this_BlockActivity_1= ruleBlockActivity
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockActivity_1=ruleBlockActivity();

                    state._fsp--;


                    			current = this_BlockActivity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:354:3: this_Event_2= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_2=ruleEvent();

                    state._fsp--;


                    			current = this_Event_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:363:3: this_Gateway_3= ruleGateway
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gateway_3=ruleGateway();

                    state._fsp--;


                    			current = this_Gateway_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:372:3: this_SubFlow_4= ruleSubFlow
                    {

                    			newCompositeNode(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubFlow_4=ruleSubFlow();

                    state._fsp--;


                    			current = this_SubFlow_4;
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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRulePool"
    // InternalMyDsl.g:384:1: entryRulePool returns [EObject current=null] : iv_rulePool= rulePool EOF ;
    public final EObject entryRulePool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePool = null;


        try {
            // InternalMyDsl.g:384:45: (iv_rulePool= rulePool EOF )
            // InternalMyDsl.g:385:2: iv_rulePool= rulePool EOF
            {
             newCompositeNode(grammarAccess.getPoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePool=rulePool();

            state._fsp--;

             current =iv_rulePool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePool"


    // $ANTLR start "rulePool"
    // InternalMyDsl.g:391:1: rulePool returns [EObject current=null] : (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject rulePool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_lanes_7_0 = null;

        EObject lv_lanes_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:397:2: ( (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMyDsl.g:398:2: (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMyDsl.g:398:2: (otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMyDsl.g:399:3: otherlv_0= 'Pool' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'lanes' otherlv_6= '{' ( (lv_lanes_7_0= ruleLane ) ) (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPoolAccess().getPoolKeyword_0());
            		
            // InternalMyDsl.g:403:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:404:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:404:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:405:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoolRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:426:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:427:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPoolAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:431:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:432:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:432:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:433:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPoolRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getPoolAccess().getLanesKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:459:3: ( (lv_lanes_7_0= ruleLane ) )
            // InternalMyDsl.g:460:4: (lv_lanes_7_0= ruleLane )
            {
            // InternalMyDsl.g:460:4: (lv_lanes_7_0= ruleLane )
            // InternalMyDsl.g:461:5: lv_lanes_7_0= ruleLane
            {

            					newCompositeNode(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_lanes_7_0=ruleLane();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoolRule());
            					}
            					add(
            						current,
            						"lanes",
            						lv_lanes_7_0,
            						"org.xtext.example.mydsl.MyDsl.Lane");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:478:3: (otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:479:4: otherlv_8= ',' ( (lv_lanes_9_0= ruleLane ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPoolAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:483:4: ( (lv_lanes_9_0= ruleLane ) )
            	    // InternalMyDsl.g:484:5: (lv_lanes_9_0= ruleLane )
            	    {
            	    // InternalMyDsl.g:484:5: (lv_lanes_9_0= ruleLane )
            	    // InternalMyDsl.g:485:6: lv_lanes_9_0= ruleLane
            	    {

            	    						newCompositeNode(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_lanes_9_0=ruleLane();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPoolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lanes",
            	    							lv_lanes_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.Lane");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePool"


    // $ANTLR start "entryRuleProcess"
    // InternalMyDsl.g:515:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalMyDsl.g:515:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalMyDsl.g:516:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalMyDsl.g:522:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pool' ( ( ruleEString ) ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )? (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_transitions_9_0 = null;

        EObject lv_transitions_11_0 = null;

        EObject lv_activityset_15_0 = null;

        EObject lv_activityset_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:528:2: ( (otherlv_0= 'Process' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pool' ( ( ruleEString ) ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )? (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalMyDsl.g:529:2: (otherlv_0= 'Process' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pool' ( ( ruleEString ) ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )? (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalMyDsl.g:529:2: (otherlv_0= 'Process' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pool' ( ( ruleEString ) ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )? (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalMyDsl.g:530:3: otherlv_0= 'Process' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'pool' ( ( ruleEString ) ) (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )? (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalMyDsl.g:534:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:535:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:535:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:536:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:557:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:558:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:562:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:563:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:563:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:564:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getPoolKeyword_4());
            		
            // InternalMyDsl.g:586:3: ( ( ruleEString ) )
            // InternalMyDsl.g:587:4: ( ruleEString )
            {
            // InternalMyDsl.g:587:4: ( ruleEString )
            // InternalMyDsl.g:588:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProcessAccess().getPoolPoolCrossReference_5_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:602:3: (otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:603:4: otherlv_7= 'transitions' otherlv_8= '{' ( (lv_transitions_9_0= ruleTransition ) ) (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getTransitionsKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:611:4: ( (lv_transitions_9_0= ruleTransition ) )
                    // InternalMyDsl.g:612:5: (lv_transitions_9_0= ruleTransition )
                    {
                    // InternalMyDsl.g:612:5: (lv_transitions_9_0= ruleTransition )
                    // InternalMyDsl.g:613:6: lv_transitions_9_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_transitions_9_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_9_0,
                    							"org.xtext.example.mydsl.MyDsl.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:630:4: (otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:631:5: otherlv_10= ',' ( (lv_transitions_11_0= ruleTransition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_20); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:635:5: ( (lv_transitions_11_0= ruleTransition ) )
                    	    // InternalMyDsl.g:636:6: (lv_transitions_11_0= ruleTransition )
                    	    {
                    	    // InternalMyDsl.g:636:6: (lv_transitions_11_0= ruleTransition )
                    	    // InternalMyDsl.g:637:7: lv_transitions_11_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_transitions_11_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_11_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:660:3: (otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:661:4: otherlv_13= 'activityset' otherlv_14= '{' ( (lv_activityset_15_0= ruleActivitySet ) ) (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getProcessAccess().getActivitysetKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:669:4: ( (lv_activityset_15_0= ruleActivitySet ) )
                    // InternalMyDsl.g:670:5: (lv_activityset_15_0= ruleActivitySet )
                    {
                    // InternalMyDsl.g:670:5: (lv_activityset_15_0= ruleActivitySet )
                    // InternalMyDsl.g:671:6: lv_activityset_15_0= ruleActivitySet
                    {

                    						newCompositeNode(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_activityset_15_0=ruleActivitySet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcessRule());
                    						}
                    						add(
                    							current,
                    							"activityset",
                    							lv_activityset_15_0,
                    							"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:688:4: (otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==15) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:689:5: otherlv_16= ',' ( (lv_activityset_17_0= ruleActivitySet ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getProcessAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:693:5: ( (lv_activityset_17_0= ruleActivitySet ) )
                    	    // InternalMyDsl.g:694:6: (lv_activityset_17_0= ruleActivitySet )
                    	    {
                    	    // InternalMyDsl.g:694:6: (lv_activityset_17_0= ruleActivitySet )
                    	    // InternalMyDsl.g:695:7: lv_activityset_17_0= ruleActivitySet
                    	    {

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_activityset_17_0=ruleActivitySet();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityset",
                    	    								lv_activityset_17_0,
                    	    								"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleMessageFlow"
    // InternalMyDsl.g:726:1: entryRuleMessageFlow returns [EObject current=null] : iv_ruleMessageFlow= ruleMessageFlow EOF ;
    public final EObject entryRuleMessageFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageFlow = null;


        try {
            // InternalMyDsl.g:726:52: (iv_ruleMessageFlow= ruleMessageFlow EOF )
            // InternalMyDsl.g:727:2: iv_ruleMessageFlow= ruleMessageFlow EOF
            {
             newCompositeNode(grammarAccess.getMessageFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageFlow=ruleMessageFlow();

            state._fsp--;

             current =iv_ruleMessageFlow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageFlow"


    // $ANTLR start "ruleMessageFlow"
    // InternalMyDsl.g:733:1: ruleMessageFlow returns [EObject current=null] : ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMessageFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:739:2: ( ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:740:2: ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:740:2: ( () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:741:3: () otherlv_1= 'MessageFlow' otherlv_2= '{' (otherlv_3= 'source' ( ( ruleEString ) ) )? (otherlv_5= 'target' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:741:3: ()
            // InternalMyDsl.g:742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageFlowAccess().getMessageFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:756:3: (otherlv_3= 'source' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:757:4: otherlv_3= 'source' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0());
                    			
                    // InternalMyDsl.g:761:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:762:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:762:5: ( ruleEString )
                    // InternalMyDsl.g:763:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:778:3: (otherlv_5= 'target' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:779:4: otherlv_5= 'target' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0());
                    			
                    // InternalMyDsl.g:783:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:784:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:784:5: ( ruleEString )
                    // InternalMyDsl.g:785:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageFlowRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMessageFlow"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:808:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:808:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:809:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:815:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:821:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:822:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:822:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:823:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:831:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLane"
    // InternalMyDsl.g:842:1: entryRuleLane returns [EObject current=null] : iv_ruleLane= ruleLane EOF ;
    public final EObject entryRuleLane() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLane = null;


        try {
            // InternalMyDsl.g:842:45: (iv_ruleLane= ruleLane EOF )
            // InternalMyDsl.g:843:2: iv_ruleLane= ruleLane EOF
            {
             newCompositeNode(grammarAccess.getLaneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLane=ruleLane();

            state._fsp--;

             current =iv_ruleLane; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLane"


    // $ANTLR start "ruleLane"
    // InternalMyDsl.g:849:1: ruleLane returns [EObject current=null] : ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLane() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_activityset_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:855:2: ( ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:856:2: ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:856:2: ( () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:857:3: () otherlv_1= 'Lane' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )? (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:857:3: ()
            // InternalMyDsl.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLaneAccess().getLaneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLaneAccess().getLaneKeyword_1());
            		
            // InternalMyDsl.g:868:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:869:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:869:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:870:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaneRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:891:3: (otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:892:4: otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLaneAccess().getNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:896:4: ( (lv_name_5_0= ruleEString ) )
                    // InternalMyDsl.g:897:5: (lv_name_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:897:5: (lv_name_5_0= ruleEString )
                    // InternalMyDsl.g:898:6: lv_name_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_name_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLaneRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:916:3: (otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:917:4: otherlv_6= 'activityset' ( (lv_activityset_7_0= ruleActivitySet ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getLaneAccess().getActivitysetKeyword_5_0());
                    			
                    // InternalMyDsl.g:921:4: ( (lv_activityset_7_0= ruleActivitySet ) )
                    // InternalMyDsl.g:922:5: (lv_activityset_7_0= ruleActivitySet )
                    {
                    // InternalMyDsl.g:922:5: (lv_activityset_7_0= ruleActivitySet )
                    // InternalMyDsl.g:923:6: lv_activityset_7_0= ruleActivitySet
                    {

                    						newCompositeNode(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_activityset_7_0=ruleActivitySet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLaneRule());
                    						}
                    						set(
                    							current,
                    							"activityset",
                    							lv_activityset_7_0,
                    							"org.xtext.example.mydsl.MyDsl.ActivitySet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLane"


    // $ANTLR start "entryRuleActivitySet"
    // InternalMyDsl.g:949:1: entryRuleActivitySet returns [EObject current=null] : iv_ruleActivitySet= ruleActivitySet EOF ;
    public final EObject entryRuleActivitySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivitySet = null;


        try {
            // InternalMyDsl.g:949:52: (iv_ruleActivitySet= ruleActivitySet EOF )
            // InternalMyDsl.g:950:2: iv_ruleActivitySet= ruleActivitySet EOF
            {
             newCompositeNode(grammarAccess.getActivitySetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivitySet=ruleActivitySet();

            state._fsp--;

             current =iv_ruleActivitySet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivitySet"


    // $ANTLR start "ruleActivitySet"
    // InternalMyDsl.g:956:1: ruleActivitySet returns [EObject current=null] : (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'activities' otherlv_6= '{' ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleActivitySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_activities_7_0 = null;

        EObject lv_activities_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:962:2: ( (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'activities' otherlv_6= '{' ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalMyDsl.g:963:2: (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'activities' otherlv_6= '{' ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalMyDsl.g:963:2: (otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'activities' otherlv_6= '{' ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalMyDsl.g:964:3: otherlv_0= 'ActivitySet' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? otherlv_5= 'activities' otherlv_6= '{' ( (lv_activities_7_0= ruleActivity ) ) (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActivitySetAccess().getActivitySetKeyword_0());
            		
            // InternalMyDsl.g:968:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:969:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:969:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:970:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivitySetRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:991:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:992:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActivitySetAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:996:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:997:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:997:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:998:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivitySetRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getActivitySetAccess().getActivitiesKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1024:3: ( (lv_activities_7_0= ruleActivity ) )
            // InternalMyDsl.g:1025:4: (lv_activities_7_0= ruleActivity )
            {
            // InternalMyDsl.g:1025:4: (lv_activities_7_0= ruleActivity )
            // InternalMyDsl.g:1026:5: lv_activities_7_0= ruleActivity
            {

            					newCompositeNode(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_activities_7_0=ruleActivity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivitySetRule());
            					}
            					add(
            						current,
            						"activities",
            						lv_activities_7_0,
            						"org.xtext.example.mydsl.MyDsl.Activity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1043:3: (otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1044:4: otherlv_8= ',' ( (lv_activities_9_0= ruleActivity ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_28); 

            	    				newLeafNode(otherlv_8, grammarAccess.getActivitySetAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1048:4: ( (lv_activities_9_0= ruleActivity ) )
            	    // InternalMyDsl.g:1049:5: (lv_activities_9_0= ruleActivity )
            	    {
            	    // InternalMyDsl.g:1049:5: (lv_activities_9_0= ruleActivity )
            	    // InternalMyDsl.g:1050:6: lv_activities_9_0= ruleActivity
            	    {

            	    						newCompositeNode(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_activities_9_0=ruleActivity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActivitySetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"activities",
            	    							lv_activities_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.Activity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleActivitySet"


    // $ANTLR start "entryRuleActivity_Impl"
    // InternalMyDsl.g:1080:1: entryRuleActivity_Impl returns [EObject current=null] : iv_ruleActivity_Impl= ruleActivity_Impl EOF ;
    public final EObject entryRuleActivity_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity_Impl = null;


        try {
            // InternalMyDsl.g:1080:54: (iv_ruleActivity_Impl= ruleActivity_Impl EOF )
            // InternalMyDsl.g:1081:2: iv_ruleActivity_Impl= ruleActivity_Impl EOF
            {
             newCompositeNode(grammarAccess.getActivity_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity_Impl=ruleActivity_Impl();

            state._fsp--;

             current =iv_ruleActivity_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivity_Impl"


    // $ANTLR start "ruleActivity_Impl"
    // InternalMyDsl.g:1087:1: ruleActivity_Impl returns [EObject current=null] : ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleActivity_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1093:2: ( ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1094:2: ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1094:2: ( () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1095:3: () otherlv_1= 'Activity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1095:3: ()
            // InternalMyDsl.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivity_ImplAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivity_ImplAccess().getActivityKeyword_1());
            		
            // InternalMyDsl.g:1106:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1107:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1107:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1108:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivity_ImplRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1129:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1130:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1134:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1135:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1135:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1136:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivity_ImplRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActivity_Impl"


    // $ANTLR start "entryRuleBlockActivity"
    // InternalMyDsl.g:1162:1: entryRuleBlockActivity returns [EObject current=null] : iv_ruleBlockActivity= ruleBlockActivity EOF ;
    public final EObject entryRuleBlockActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockActivity = null;


        try {
            // InternalMyDsl.g:1162:54: (iv_ruleBlockActivity= ruleBlockActivity EOF )
            // InternalMyDsl.g:1163:2: iv_ruleBlockActivity= ruleBlockActivity EOF
            {
             newCompositeNode(grammarAccess.getBlockActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockActivity=ruleBlockActivity();

            state._fsp--;

             current =iv_ruleBlockActivity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlockActivity"


    // $ANTLR start "ruleBlockActivity"
    // InternalMyDsl.g:1169:1: ruleBlockActivity returns [EObject current=null] : ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleBlockActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1175:2: ( ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1176:2: ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1176:2: ( () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1177:3: () otherlv_1= 'BlockActivity' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1177:3: ()
            // InternalMyDsl.g:1178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockActivityAccess().getBlockActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1());
            		
            // InternalMyDsl.g:1188:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1189:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1189:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1190:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockActivityRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1211:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1212:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1216:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1217:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1217:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1218:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockActivityRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBlockActivity"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:1244:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:1244:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:1245:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:1251:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_time_7_0 = null;

        Enumerator lv_type_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1257:2: ( ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' ) )
            // InternalMyDsl.g:1258:2: ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:1258:2: ( () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}' )
            // InternalMyDsl.g:1259:3: () otherlv_1= 'Event' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )? otherlv_10= '}'
            {
            // InternalMyDsl.g:1259:3: ()
            // InternalMyDsl.g:1260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalMyDsl.g:1270:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1271:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1271:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1272:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1293:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1294:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1298:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1299:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1299:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1300:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1318:3: (otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1319:4: otherlv_6= 'time' ( (lv_time_7_0= ruleEventTime ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getTimeKeyword_5_0());
                    			
                    // InternalMyDsl.g:1323:4: ( (lv_time_7_0= ruleEventTime ) )
                    // InternalMyDsl.g:1324:5: (lv_time_7_0= ruleEventTime )
                    {
                    // InternalMyDsl.g:1324:5: (lv_time_7_0= ruleEventTime )
                    // InternalMyDsl.g:1325:6: lv_time_7_0= ruleEventTime
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_time_7_0=ruleEventTime();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EventTime");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1343:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1344:4: otherlv_8= 'type' ( (lv_type_9_0= ruleEventType ) )
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventAccess().getTypeKeyword_6_0());
                    			
                    // InternalMyDsl.g:1348:4: ( (lv_type_9_0= ruleEventType ) )
                    // InternalMyDsl.g:1349:5: (lv_type_9_0= ruleEventType )
                    {
                    // InternalMyDsl.g:1349:5: (lv_type_9_0= ruleEventType )
                    // InternalMyDsl.g:1350:6: lv_type_9_0= ruleEventType
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_9_0=ruleEventType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EventType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGateway"
    // InternalMyDsl.g:1376:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalMyDsl.g:1376:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalMyDsl.g:1377:2: iv_ruleGateway= ruleGateway EOF
            {
             newCompositeNode(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;

             current =iv_ruleGateway; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMyDsl.g:1383:1: ruleGateway returns [EObject current=null] : ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_rule_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1389:2: ( ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' ) )
            // InternalMyDsl.g:1390:2: ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:1390:2: ( () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}' )
            // InternalMyDsl.g:1391:3: () otherlv_1= 'Gateway' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )? otherlv_8= '}'
            {
            // InternalMyDsl.g:1391:3: ()
            // InternalMyDsl.g:1392:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGatewayAccess().getGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGatewayAccess().getGatewayKeyword_1());
            		
            // InternalMyDsl.g:1402:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1403:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1403:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1404:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGatewayRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1425:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1426:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGatewayAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1430:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1431:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1431:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1432:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1450:3: (otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1451:4: otherlv_6= 'rule' ( (lv_rule_7_0= ruleGateRule ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getGatewayAccess().getRuleKeyword_5_0());
                    			
                    // InternalMyDsl.g:1455:4: ( (lv_rule_7_0= ruleGateRule ) )
                    // InternalMyDsl.g:1456:5: (lv_rule_7_0= ruleGateRule )
                    {
                    // InternalMyDsl.g:1456:5: (lv_rule_7_0= ruleGateRule )
                    // InternalMyDsl.g:1457:6: lv_rule_7_0= ruleGateRule
                    {

                    						newCompositeNode(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rule_7_0=ruleGateRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGatewayRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_7_0,
                    							"org.xtext.example.mydsl.MyDsl.GateRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleSubFlow"
    // InternalMyDsl.g:1483:1: entryRuleSubFlow returns [EObject current=null] : iv_ruleSubFlow= ruleSubFlow EOF ;
    public final EObject entryRuleSubFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFlow = null;


        try {
            // InternalMyDsl.g:1483:48: (iv_ruleSubFlow= ruleSubFlow EOF )
            // InternalMyDsl.g:1484:2: iv_ruleSubFlow= ruleSubFlow EOF
            {
             newCompositeNode(grammarAccess.getSubFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubFlow=ruleSubFlow();

            state._fsp--;

             current =iv_ruleSubFlow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubFlow"


    // $ANTLR start "ruleSubFlow"
    // InternalMyDsl.g:1490:1: ruleSubFlow returns [EObject current=null] : ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSubFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_title_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1496:2: ( ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1497:2: ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1497:2: ( () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1498:3: () otherlv_1= 'SubFlow' ( (lv_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:1498:3: ()
            // InternalMyDsl.g:1499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubFlowAccess().getSubFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubFlowAccess().getSubFlowKeyword_1());
            		
            // InternalMyDsl.g:1509:3: ( (lv_id_2_0= ruleEString ) )
            // InternalMyDsl.g:1510:4: (lv_id_2_0= ruleEString )
            {
            // InternalMyDsl.g:1510:4: (lv_id_2_0= ruleEString )
            // InternalMyDsl.g:1511:5: lv_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubFlowRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:1532:3: (otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1533:4: otherlv_4= 'title' ( (lv_title_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubFlowAccess().getTitleKeyword_4_0());
                    			
                    // InternalMyDsl.g:1537:4: ( (lv_title_5_0= ruleEString ) )
                    // InternalMyDsl.g:1538:5: (lv_title_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:1538:5: (lv_title_5_0= ruleEString )
                    // InternalMyDsl.g:1539:6: lv_title_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_title_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubFlowRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSubFlow"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:1565:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:1565:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:1566:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:1572:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1578:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:1579:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:1579:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:1580:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )? otherlv_4= 'source' ( ( ruleEString ) ) otherlv_6= 'target' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1588:3: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1589:4: otherlv_2= 'condition' ( (lv_condition_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getConditionKeyword_2_0());
                    			
                    // InternalMyDsl.g:1593:4: ( (lv_condition_3_0= ruleEString ) )
                    // InternalMyDsl.g:1594:5: (lv_condition_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:1594:5: (lv_condition_3_0= ruleEString )
                    // InternalMyDsl.g:1595:6: lv_condition_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_condition_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSourceKeyword_3());
            		
            // InternalMyDsl.g:1617:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1618:4: ( ruleEString )
            {
            // InternalMyDsl.g:1618:4: ( ruleEString )
            // InternalMyDsl.g:1619:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getTargetKeyword_5());
            		
            // InternalMyDsl.g:1637:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1638:4: ( ruleEString )
            {
            // InternalMyDsl.g:1638:4: ( ruleEString )
            // InternalMyDsl.g:1639:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleEventTime"
    // InternalMyDsl.g:1661:1: ruleEventTime returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) ) ;
    public final Enumerator ruleEventTime() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1667:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) ) )
            // InternalMyDsl.g:1668:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) )
            {
            // InternalMyDsl.g:1668:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'INTERMEDIATE' ) | (enumLiteral_2= 'END' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 44:
                {
                alt32=2;
                }
                break;
            case 45:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1669:3: (enumLiteral_0= 'START' )
                    {
                    // InternalMyDsl.g:1669:3: (enumLiteral_0= 'START' )
                    // InternalMyDsl.g:1670:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1677:3: (enumLiteral_1= 'INTERMEDIATE' )
                    {
                    // InternalMyDsl.g:1677:3: (enumLiteral_1= 'INTERMEDIATE' )
                    // InternalMyDsl.g:1678:4: enumLiteral_1= 'INTERMEDIATE'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1685:3: (enumLiteral_2= 'END' )
                    {
                    // InternalMyDsl.g:1685:3: (enumLiteral_2= 'END' )
                    // InternalMyDsl.g:1686:4: enumLiteral_2= 'END'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEventTime"


    // $ANTLR start "ruleEventType"
    // InternalMyDsl.g:1696:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1702:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) ) )
            // InternalMyDsl.g:1703:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) )
            {
            // InternalMyDsl.g:1703:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MESSAGE' ) | (enumLiteral_2= 'EROR' ) | (enumLiteral_3= 'RULE' ) | (enumLiteral_4= 'TIMER' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt33=1;
                }
                break;
            case 47:
                {
                alt33=2;
                }
                break;
            case 48:
                {
                alt33=3;
                }
                break;
            case 49:
                {
                alt33=4;
                }
                break;
            case 50:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1704:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMyDsl.g:1704:3: (enumLiteral_0= 'NONE' )
                    // InternalMyDsl.g:1705:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1712:3: (enumLiteral_1= 'MESSAGE' )
                    {
                    // InternalMyDsl.g:1712:3: (enumLiteral_1= 'MESSAGE' )
                    // InternalMyDsl.g:1713:4: enumLiteral_1= 'MESSAGE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1720:3: (enumLiteral_2= 'EROR' )
                    {
                    // InternalMyDsl.g:1720:3: (enumLiteral_2= 'EROR' )
                    // InternalMyDsl.g:1721:4: enumLiteral_2= 'EROR'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1728:3: (enumLiteral_3= 'RULE' )
                    {
                    // InternalMyDsl.g:1728:3: (enumLiteral_3= 'RULE' )
                    // InternalMyDsl.g:1729:4: enumLiteral_3= 'RULE'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1736:3: (enumLiteral_4= 'TIMER' )
                    {
                    // InternalMyDsl.g:1736:3: (enumLiteral_4= 'TIMER' )
                    // InternalMyDsl.g:1737:4: enumLiteral_4= 'TIMER'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "ruleGateRule"
    // InternalMyDsl.g:1747:1: ruleGateRule returns [Enumerator current=null] : ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) ) ;
    public final Enumerator ruleGateRule() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1753:2: ( ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) ) )
            // InternalMyDsl.g:1754:2: ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) )
            {
            // InternalMyDsl.g:1754:2: ( (enumLiteral_0= 'XOR' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'AND' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt34=1;
                }
                break;
            case 52:
                {
                alt34=2;
                }
                break;
            case 53:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1755:3: (enumLiteral_0= 'XOR' )
                    {
                    // InternalMyDsl.g:1755:3: (enumLiteral_0= 'XOR' )
                    // InternalMyDsl.g:1756:4: enumLiteral_0= 'XOR'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1763:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalMyDsl.g:1763:3: (enumLiteral_1= 'OR' )
                    // InternalMyDsl.g:1764:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1771:3: (enumLiteral_2= 'AND' )
                    {
                    // InternalMyDsl.g:1771:3: (enumLiteral_2= 'AND' )
                    // InternalMyDsl.g:1772:4: enumLiteral_2= 'AND'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleGateRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000076000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002110000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000014D00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003200010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008200010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000010000000L});

}