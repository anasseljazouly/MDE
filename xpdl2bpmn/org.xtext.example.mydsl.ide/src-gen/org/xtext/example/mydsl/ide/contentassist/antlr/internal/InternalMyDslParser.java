package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'START'", "'INTERMEDIATE'", "'END'", "'NONE'", "'MESSAGE'", "'EROR'", "'RULE'", "'TIMER'", "'XOR'", "'OR'", "'AND'", "'XpdlRoot'", "'{'", "'}'", "'diagramName'", "'pools'", "','", "'process'", "'messageflows'", "'Pool'", "'lanes'", "'name'", "'Process'", "'pool'", "'transitions'", "'activityset'", "'MessageFlow'", "'source'", "'target'", "'Lane'", "'ActivitySet'", "'activities'", "'Activity'", "'title'", "'BlockActivity'", "'Event'", "'time'", "'type'", "'Gateway'", "'rule'", "'SubFlow'", "'Transition'", "'condition'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleXpdlRoot"
    // InternalMyDsl.g:53:1: entryRuleXpdlRoot : ruleXpdlRoot EOF ;
    public final void entryRuleXpdlRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleXpdlRoot EOF )
            // InternalMyDsl.g:55:1: ruleXpdlRoot EOF
            {
             before(grammarAccess.getXpdlRootRule()); 
            pushFollow(FOLLOW_1);
            ruleXpdlRoot();

            state._fsp--;

             after(grammarAccess.getXpdlRootRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXpdlRoot"


    // $ANTLR start "ruleXpdlRoot"
    // InternalMyDsl.g:62:1: ruleXpdlRoot : ( ( rule__XpdlRoot__Group__0 ) ) ;
    public final void ruleXpdlRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__XpdlRoot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__XpdlRoot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__XpdlRoot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__XpdlRoot__Group__0 )
            {
             before(grammarAccess.getXpdlRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__XpdlRoot__Group__0 )
            // InternalMyDsl.g:69:4: rule__XpdlRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXpdlRoot"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:78:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleActivity EOF )
            // InternalMyDsl.g:80:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:87:1: ruleActivity : ( ( rule__Activity__Alternatives ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Activity__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Activity__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Activity__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Activity__Alternatives )
            {
             before(grammarAccess.getActivityAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Activity__Alternatives )
            // InternalMyDsl.g:94:4: rule__Activity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRulePool"
    // InternalMyDsl.g:103:1: entryRulePool : rulePool EOF ;
    public final void entryRulePool() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePool EOF )
            // InternalMyDsl.g:105:1: rulePool EOF
            {
             before(grammarAccess.getPoolRule()); 
            pushFollow(FOLLOW_1);
            rulePool();

            state._fsp--;

             after(grammarAccess.getPoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePool"


    // $ANTLR start "rulePool"
    // InternalMyDsl.g:112:1: rulePool : ( ( rule__Pool__Group__0 ) ) ;
    public final void rulePool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Pool__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Pool__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Pool__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Pool__Group__0 )
            {
             before(grammarAccess.getPoolAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Pool__Group__0 )
            // InternalMyDsl.g:119:4: rule__Pool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePool"


    // $ANTLR start "entryRuleProcess"
    // InternalMyDsl.g:128:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleProcess EOF )
            // InternalMyDsl.g:130:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalMyDsl.g:137:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Process__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Process__Group__0 )
            // InternalMyDsl.g:144:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleMessageFlow"
    // InternalMyDsl.g:153:1: entryRuleMessageFlow : ruleMessageFlow EOF ;
    public final void entryRuleMessageFlow() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMessageFlow EOF )
            // InternalMyDsl.g:155:1: ruleMessageFlow EOF
            {
             before(grammarAccess.getMessageFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getMessageFlowRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMessageFlow"


    // $ANTLR start "ruleMessageFlow"
    // InternalMyDsl.g:162:1: ruleMessageFlow : ( ( rule__MessageFlow__Group__0 ) ) ;
    public final void ruleMessageFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__MessageFlow__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__MessageFlow__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__MessageFlow__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__MessageFlow__Group__0 )
            {
             before(grammarAccess.getMessageFlowAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__MessageFlow__Group__0 )
            // InternalMyDsl.g:169:4: rule__MessageFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageFlow"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEString EOF )
            // InternalMyDsl.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleLane"
    // InternalMyDsl.g:203:1: entryRuleLane : ruleLane EOF ;
    public final void entryRuleLane() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleLane EOF )
            // InternalMyDsl.g:205:1: ruleLane EOF
            {
             before(grammarAccess.getLaneRule()); 
            pushFollow(FOLLOW_1);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getLaneRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLane"


    // $ANTLR start "ruleLane"
    // InternalMyDsl.g:212:1: ruleLane : ( ( rule__Lane__Group__0 ) ) ;
    public final void ruleLane() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Lane__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Lane__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Lane__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Lane__Group__0 )
            {
             before(grammarAccess.getLaneAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Lane__Group__0 )
            // InternalMyDsl.g:219:4: rule__Lane__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLane"


    // $ANTLR start "entryRuleActivitySet"
    // InternalMyDsl.g:228:1: entryRuleActivitySet : ruleActivitySet EOF ;
    public final void entryRuleActivitySet() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleActivitySet EOF )
            // InternalMyDsl.g:230:1: ruleActivitySet EOF
            {
             before(grammarAccess.getActivitySetRule()); 
            pushFollow(FOLLOW_1);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getActivitySetRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivitySet"


    // $ANTLR start "ruleActivitySet"
    // InternalMyDsl.g:237:1: ruleActivitySet : ( ( rule__ActivitySet__Group__0 ) ) ;
    public final void ruleActivitySet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ActivitySet__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ActivitySet__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ActivitySet__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ActivitySet__Group__0 )
            {
             before(grammarAccess.getActivitySetAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ActivitySet__Group__0 )
            // InternalMyDsl.g:244:4: rule__ActivitySet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivitySet"


    // $ANTLR start "entryRuleActivity_Impl"
    // InternalMyDsl.g:253:1: entryRuleActivity_Impl : ruleActivity_Impl EOF ;
    public final void entryRuleActivity_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleActivity_Impl EOF )
            // InternalMyDsl.g:255:1: ruleActivity_Impl EOF
            {
             before(grammarAccess.getActivity_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity_Impl();

            state._fsp--;

             after(grammarAccess.getActivity_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActivity_Impl"


    // $ANTLR start "ruleActivity_Impl"
    // InternalMyDsl.g:262:1: ruleActivity_Impl : ( ( rule__Activity_Impl__Group__0 ) ) ;
    public final void ruleActivity_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Activity_Impl__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Activity_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Activity_Impl__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Activity_Impl__Group__0 )
            {
             before(grammarAccess.getActivity_ImplAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Activity_Impl__Group__0 )
            // InternalMyDsl.g:269:4: rule__Activity_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity_Impl"


    // $ANTLR start "entryRuleBlockActivity"
    // InternalMyDsl.g:278:1: entryRuleBlockActivity : ruleBlockActivity EOF ;
    public final void entryRuleBlockActivity() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBlockActivity EOF )
            // InternalMyDsl.g:280:1: ruleBlockActivity EOF
            {
             before(grammarAccess.getBlockActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockActivity();

            state._fsp--;

             after(grammarAccess.getBlockActivityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlockActivity"


    // $ANTLR start "ruleBlockActivity"
    // InternalMyDsl.g:287:1: ruleBlockActivity : ( ( rule__BlockActivity__Group__0 ) ) ;
    public final void ruleBlockActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__BlockActivity__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__BlockActivity__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__BlockActivity__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__BlockActivity__Group__0 )
            {
             before(grammarAccess.getBlockActivityAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__BlockActivity__Group__0 )
            // InternalMyDsl.g:294:4: rule__BlockActivity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockActivity"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:303:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEvent EOF )
            // InternalMyDsl.g:305:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:312:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:319:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGateway"
    // InternalMyDsl.g:328:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleGateway EOF )
            // InternalMyDsl.g:330:1: ruleGateway EOF
            {
             before(grammarAccess.getGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;

             after(grammarAccess.getGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalMyDsl.g:337:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Gateway__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Gateway__Group__0 )
            {
             before(grammarAccess.getGatewayAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Gateway__Group__0 )
            // InternalMyDsl.g:344:4: rule__Gateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleSubFlow"
    // InternalMyDsl.g:353:1: entryRuleSubFlow : ruleSubFlow EOF ;
    public final void entryRuleSubFlow() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleSubFlow EOF )
            // InternalMyDsl.g:355:1: ruleSubFlow EOF
            {
             before(grammarAccess.getSubFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleSubFlow();

            state._fsp--;

             after(grammarAccess.getSubFlowRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubFlow"


    // $ANTLR start "ruleSubFlow"
    // InternalMyDsl.g:362:1: ruleSubFlow : ( ( rule__SubFlow__Group__0 ) ) ;
    public final void ruleSubFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__SubFlow__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__SubFlow__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__SubFlow__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__SubFlow__Group__0 )
            {
             before(grammarAccess.getSubFlowAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__SubFlow__Group__0 )
            // InternalMyDsl.g:369:4: rule__SubFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFlow"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:378:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleTransition EOF )
            // InternalMyDsl.g:380:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:387:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Transition__Group__0 )
            // InternalMyDsl.g:394:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleEventTime"
    // InternalMyDsl.g:403:1: ruleEventTime : ( ( rule__EventTime__Alternatives ) ) ;
    public final void ruleEventTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ( rule__EventTime__Alternatives ) ) )
            // InternalMyDsl.g:408:2: ( ( rule__EventTime__Alternatives ) )
            {
            // InternalMyDsl.g:408:2: ( ( rule__EventTime__Alternatives ) )
            // InternalMyDsl.g:409:3: ( rule__EventTime__Alternatives )
            {
             before(grammarAccess.getEventTimeAccess().getAlternatives()); 
            // InternalMyDsl.g:410:3: ( rule__EventTime__Alternatives )
            // InternalMyDsl.g:410:4: rule__EventTime__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventTime__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventTimeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventTime"


    // $ANTLR start "ruleEventType"
    // InternalMyDsl.g:419:1: ruleEventType : ( ( rule__EventType__Alternatives ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__EventType__Alternatives ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__EventType__Alternatives ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__EventType__Alternatives ) )
            // InternalMyDsl.g:425:3: ( rule__EventType__Alternatives )
            {
             before(grammarAccess.getEventTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:426:3: ( rule__EventType__Alternatives )
            // InternalMyDsl.g:426:4: rule__EventType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "ruleGateRule"
    // InternalMyDsl.g:435:1: ruleGateRule : ( ( rule__GateRule__Alternatives ) ) ;
    public final void ruleGateRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( rule__GateRule__Alternatives ) ) )
            // InternalMyDsl.g:440:2: ( ( rule__GateRule__Alternatives ) )
            {
            // InternalMyDsl.g:440:2: ( ( rule__GateRule__Alternatives ) )
            // InternalMyDsl.g:441:3: ( rule__GateRule__Alternatives )
            {
             before(grammarAccess.getGateRuleAccess().getAlternatives()); 
            // InternalMyDsl.g:442:3: ( rule__GateRule__Alternatives )
            // InternalMyDsl.g:442:4: rule__GateRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GateRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGateRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGateRule"


    // $ANTLR start "rule__Activity__Alternatives"
    // InternalMyDsl.g:450:1: rule__Activity__Alternatives : ( ( ruleActivity_Impl ) | ( ruleBlockActivity ) | ( ruleEvent ) | ( ruleGateway ) | ( ruleSubFlow ) );
    public final void rule__Activity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ruleActivity_Impl ) | ( ruleBlockActivity ) | ( ruleEvent ) | ( ruleGateway ) | ( ruleSubFlow ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 46:
                {
                alt1=3;
                }
                break;
            case 49:
                {
                alt1=4;
                }
                break;
            case 51:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:455:2: ( ruleActivity_Impl )
                    {
                    // InternalMyDsl.g:455:2: ( ruleActivity_Impl )
                    // InternalMyDsl.g:456:3: ruleActivity_Impl
                    {
                     before(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity_Impl();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getActivity_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:461:2: ( ruleBlockActivity )
                    {
                    // InternalMyDsl.g:461:2: ( ruleBlockActivity )
                    // InternalMyDsl.g:462:3: ruleBlockActivity
                    {
                     before(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockActivity();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getBlockActivityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:467:2: ( ruleEvent )
                    {
                    // InternalMyDsl.g:467:2: ( ruleEvent )
                    // InternalMyDsl.g:468:3: ruleEvent
                    {
                     before(grammarAccess.getActivityAccess().getEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getEventParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:473:2: ( ruleGateway )
                    {
                    // InternalMyDsl.g:473:2: ( ruleGateway )
                    // InternalMyDsl.g:474:3: ruleGateway
                    {
                     before(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGateway();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getGatewayParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:479:2: ( ruleSubFlow )
                    {
                    // InternalMyDsl.g:479:2: ( ruleSubFlow )
                    // InternalMyDsl.g:480:3: ruleSubFlow
                    {
                     before(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSubFlow();

                    state._fsp--;

                     after(grammarAccess.getActivityAccess().getSubFlowParserRuleCall_4()); 

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
    // $ANTLR end "rule__Activity__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:489:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:494:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:494:2: ( RULE_STRING )
                    // InternalMyDsl.g:495:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:500:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:500:2: ( RULE_ID )
                    // InternalMyDsl.g:501:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__EventTime__Alternatives"
    // InternalMyDsl.g:510:1: rule__EventTime__Alternatives : ( ( ( 'START' ) ) | ( ( 'INTERMEDIATE' ) ) | ( ( 'END' ) ) );
    public final void rule__EventTime__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( 'START' ) ) | ( ( 'INTERMEDIATE' ) ) | ( ( 'END' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:515:2: ( ( 'START' ) )
                    {
                    // InternalMyDsl.g:515:2: ( ( 'START' ) )
                    // InternalMyDsl.g:516:3: ( 'START' )
                    {
                     before(grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:517:3: ( 'START' )
                    // InternalMyDsl.g:517:4: 'START'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getSTARTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:521:2: ( ( 'INTERMEDIATE' ) )
                    {
                    // InternalMyDsl.g:521:2: ( ( 'INTERMEDIATE' ) )
                    // InternalMyDsl.g:522:3: ( 'INTERMEDIATE' )
                    {
                     before(grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:523:3: ( 'INTERMEDIATE' )
                    // InternalMyDsl.g:523:4: 'INTERMEDIATE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getINTERMEDIATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:527:2: ( ( 'END' ) )
                    {
                    // InternalMyDsl.g:527:2: ( ( 'END' ) )
                    // InternalMyDsl.g:528:3: ( 'END' )
                    {
                     before(grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:529:3: ( 'END' )
                    // InternalMyDsl.g:529:4: 'END'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTimeAccess().getENDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EventTime__Alternatives"


    // $ANTLR start "rule__EventType__Alternatives"
    // InternalMyDsl.g:537:1: rule__EventType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MESSAGE' ) ) | ( ( 'EROR' ) ) | ( ( 'RULE' ) ) | ( ( 'TIMER' ) ) );
    public final void rule__EventType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( 'NONE' ) ) | ( ( 'MESSAGE' ) ) | ( ( 'EROR' ) ) | ( ( 'RULE' ) ) | ( ( 'TIMER' ) ) )
            int alt4=5;
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
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:542:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:542:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:543:3: ( 'NONE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:544:3: ( 'NONE' )
                    // InternalMyDsl.g:544:4: 'NONE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:548:2: ( ( 'MESSAGE' ) )
                    {
                    // InternalMyDsl.g:548:2: ( ( 'MESSAGE' ) )
                    // InternalMyDsl.g:549:3: ( 'MESSAGE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:550:3: ( 'MESSAGE' )
                    // InternalMyDsl.g:550:4: 'MESSAGE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getMESSAGEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:554:2: ( ( 'EROR' ) )
                    {
                    // InternalMyDsl.g:554:2: ( ( 'EROR' ) )
                    // InternalMyDsl.g:555:3: ( 'EROR' )
                    {
                     before(grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:556:3: ( 'EROR' )
                    // InternalMyDsl.g:556:4: 'EROR'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getEROREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:560:2: ( ( 'RULE' ) )
                    {
                    // InternalMyDsl.g:560:2: ( ( 'RULE' ) )
                    // InternalMyDsl.g:561:3: ( 'RULE' )
                    {
                     before(grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:562:3: ( 'RULE' )
                    // InternalMyDsl.g:562:4: 'RULE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getRULEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:566:2: ( ( 'TIMER' ) )
                    {
                    // InternalMyDsl.g:566:2: ( ( 'TIMER' ) )
                    // InternalMyDsl.g:567:3: ( 'TIMER' )
                    {
                     before(grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:568:3: ( 'TIMER' )
                    // InternalMyDsl.g:568:4: 'TIMER'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventTypeAccess().getTIMEREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EventType__Alternatives"


    // $ANTLR start "rule__GateRule__Alternatives"
    // InternalMyDsl.g:576:1: rule__GateRule__Alternatives : ( ( ( 'XOR' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) );
    public final void rule__GateRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ( 'XOR' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:581:2: ( ( 'XOR' ) )
                    {
                    // InternalMyDsl.g:581:2: ( ( 'XOR' ) )
                    // InternalMyDsl.g:582:3: ( 'XOR' )
                    {
                     before(grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:583:3: ( 'XOR' )
                    // InternalMyDsl.g:583:4: 'XOR'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getXOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:587:2: ( ( 'OR' ) )
                    {
                    // InternalMyDsl.g:587:2: ( ( 'OR' ) )
                    // InternalMyDsl.g:588:3: ( 'OR' )
                    {
                     before(grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:589:3: ( 'OR' )
                    // InternalMyDsl.g:589:4: 'OR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:593:2: ( ( 'AND' ) )
                    {
                    // InternalMyDsl.g:593:2: ( ( 'AND' ) )
                    // InternalMyDsl.g:594:3: ( 'AND' )
                    {
                     before(grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:595:3: ( 'AND' )
                    // InternalMyDsl.g:595:4: 'AND'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getGateRuleAccess().getANDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__GateRule__Alternatives"


    // $ANTLR start "rule__XpdlRoot__Group__0"
    // InternalMyDsl.g:603:1: rule__XpdlRoot__Group__0 : rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1 ;
    public final void rule__XpdlRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1 )
            // InternalMyDsl.g:608:2: rule__XpdlRoot__Group__0__Impl rule__XpdlRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__XpdlRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__0"


    // $ANTLR start "rule__XpdlRoot__Group__0__Impl"
    // InternalMyDsl.g:615:1: rule__XpdlRoot__Group__0__Impl : ( () ) ;
    public final void rule__XpdlRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( () ) )
            // InternalMyDsl.g:620:1: ( () )
            {
            // InternalMyDsl.g:620:1: ( () )
            // InternalMyDsl.g:621:2: ()
            {
             before(grammarAccess.getXpdlRootAccess().getXpdlRootAction_0()); 
            // InternalMyDsl.g:622:2: ()
            // InternalMyDsl.g:622:3: 
            {
            }

             after(grammarAccess.getXpdlRootAccess().getXpdlRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__1"
    // InternalMyDsl.g:630:1: rule__XpdlRoot__Group__1 : rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2 ;
    public final void rule__XpdlRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2 )
            // InternalMyDsl.g:635:2: rule__XpdlRoot__Group__1__Impl rule__XpdlRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__XpdlRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__1"


    // $ANTLR start "rule__XpdlRoot__Group__1__Impl"
    // InternalMyDsl.g:642:1: rule__XpdlRoot__Group__1__Impl : ( 'XpdlRoot' ) ;
    public final void rule__XpdlRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( 'XpdlRoot' ) )
            // InternalMyDsl.g:647:1: ( 'XpdlRoot' )
            {
            // InternalMyDsl.g:647:1: ( 'XpdlRoot' )
            // InternalMyDsl.g:648:2: 'XpdlRoot'
            {
             before(grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getXpdlRootKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__2"
    // InternalMyDsl.g:657:1: rule__XpdlRoot__Group__2 : rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3 ;
    public final void rule__XpdlRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3 )
            // InternalMyDsl.g:662:2: rule__XpdlRoot__Group__2__Impl rule__XpdlRoot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__2"


    // $ANTLR start "rule__XpdlRoot__Group__2__Impl"
    // InternalMyDsl.g:669:1: rule__XpdlRoot__Group__2__Impl : ( ( rule__XpdlRoot__IdAssignment_2 ) ) ;
    public final void rule__XpdlRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( ( rule__XpdlRoot__IdAssignment_2 ) ) )
            // InternalMyDsl.g:674:1: ( ( rule__XpdlRoot__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:674:1: ( ( rule__XpdlRoot__IdAssignment_2 ) )
            // InternalMyDsl.g:675:2: ( rule__XpdlRoot__IdAssignment_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:676:2: ( rule__XpdlRoot__IdAssignment_2 )
            // InternalMyDsl.g:676:3: rule__XpdlRoot__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__3"
    // InternalMyDsl.g:684:1: rule__XpdlRoot__Group__3 : rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4 ;
    public final void rule__XpdlRoot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4 )
            // InternalMyDsl.g:689:2: rule__XpdlRoot__Group__3__Impl rule__XpdlRoot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__3"


    // $ANTLR start "rule__XpdlRoot__Group__3__Impl"
    // InternalMyDsl.g:696:1: rule__XpdlRoot__Group__3__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( '{' ) )
            // InternalMyDsl.g:701:1: ( '{' )
            {
            // InternalMyDsl.g:701:1: ( '{' )
            // InternalMyDsl.g:702:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__4"
    // InternalMyDsl.g:711:1: rule__XpdlRoot__Group__4 : rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5 ;
    public final void rule__XpdlRoot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5 )
            // InternalMyDsl.g:716:2: rule__XpdlRoot__Group__4__Impl rule__XpdlRoot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__4"


    // $ANTLR start "rule__XpdlRoot__Group__4__Impl"
    // InternalMyDsl.g:723:1: rule__XpdlRoot__Group__4__Impl : ( ( rule__XpdlRoot__Group_4__0 )? ) ;
    public final void rule__XpdlRoot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__XpdlRoot__Group_4__0 )? ) )
            // InternalMyDsl.g:728:1: ( ( rule__XpdlRoot__Group_4__0 )? )
            {
            // InternalMyDsl.g:728:1: ( ( rule__XpdlRoot__Group_4__0 )? )
            // InternalMyDsl.g:729:2: ( rule__XpdlRoot__Group_4__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_4()); 
            // InternalMyDsl.g:730:2: ( rule__XpdlRoot__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:730:3: rule__XpdlRoot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__5"
    // InternalMyDsl.g:738:1: rule__XpdlRoot__Group__5 : rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6 ;
    public final void rule__XpdlRoot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6 )
            // InternalMyDsl.g:743:2: rule__XpdlRoot__Group__5__Impl rule__XpdlRoot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__5"


    // $ANTLR start "rule__XpdlRoot__Group__5__Impl"
    // InternalMyDsl.g:750:1: rule__XpdlRoot__Group__5__Impl : ( ( rule__XpdlRoot__Group_5__0 )? ) ;
    public final void rule__XpdlRoot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__XpdlRoot__Group_5__0 )? ) )
            // InternalMyDsl.g:755:1: ( ( rule__XpdlRoot__Group_5__0 )? )
            {
            // InternalMyDsl.g:755:1: ( ( rule__XpdlRoot__Group_5__0 )? )
            // InternalMyDsl.g:756:2: ( rule__XpdlRoot__Group_5__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_5()); 
            // InternalMyDsl.g:757:2: ( rule__XpdlRoot__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:757:3: rule__XpdlRoot__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__5__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__6"
    // InternalMyDsl.g:765:1: rule__XpdlRoot__Group__6 : rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7 ;
    public final void rule__XpdlRoot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7 )
            // InternalMyDsl.g:770:2: rule__XpdlRoot__Group__6__Impl rule__XpdlRoot__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__6"


    // $ANTLR start "rule__XpdlRoot__Group__6__Impl"
    // InternalMyDsl.g:777:1: rule__XpdlRoot__Group__6__Impl : ( ( rule__XpdlRoot__Group_6__0 )? ) ;
    public final void rule__XpdlRoot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( ( rule__XpdlRoot__Group_6__0 )? ) )
            // InternalMyDsl.g:782:1: ( ( rule__XpdlRoot__Group_6__0 )? )
            {
            // InternalMyDsl.g:782:1: ( ( rule__XpdlRoot__Group_6__0 )? )
            // InternalMyDsl.g:783:2: ( rule__XpdlRoot__Group_6__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_6()); 
            // InternalMyDsl.g:784:2: ( rule__XpdlRoot__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:784:3: rule__XpdlRoot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__6__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__7"
    // InternalMyDsl.g:792:1: rule__XpdlRoot__Group__7 : rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8 ;
    public final void rule__XpdlRoot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8 )
            // InternalMyDsl.g:797:2: rule__XpdlRoot__Group__7__Impl rule__XpdlRoot__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__XpdlRoot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__7"


    // $ANTLR start "rule__XpdlRoot__Group__7__Impl"
    // InternalMyDsl.g:804:1: rule__XpdlRoot__Group__7__Impl : ( ( rule__XpdlRoot__Group_7__0 )? ) ;
    public final void rule__XpdlRoot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( ( rule__XpdlRoot__Group_7__0 )? ) )
            // InternalMyDsl.g:809:1: ( ( rule__XpdlRoot__Group_7__0 )? )
            {
            // InternalMyDsl.g:809:1: ( ( rule__XpdlRoot__Group_7__0 )? )
            // InternalMyDsl.g:810:2: ( rule__XpdlRoot__Group_7__0 )?
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_7()); 
            // InternalMyDsl.g:811:2: ( rule__XpdlRoot__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:811:3: rule__XpdlRoot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpdlRoot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpdlRootAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__7__Impl"


    // $ANTLR start "rule__XpdlRoot__Group__8"
    // InternalMyDsl.g:819:1: rule__XpdlRoot__Group__8 : rule__XpdlRoot__Group__8__Impl ;
    public final void rule__XpdlRoot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( rule__XpdlRoot__Group__8__Impl )
            // InternalMyDsl.g:824:2: rule__XpdlRoot__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__8"


    // $ANTLR start "rule__XpdlRoot__Group__8__Impl"
    // InternalMyDsl.g:830:1: rule__XpdlRoot__Group__8__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( '}' ) )
            // InternalMyDsl.g:835:1: ( '}' )
            {
            // InternalMyDsl.g:835:1: ( '}' )
            // InternalMyDsl.g:836:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group__8__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_4__0"
    // InternalMyDsl.g:846:1: rule__XpdlRoot__Group_4__0 : rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1 ;
    public final void rule__XpdlRoot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1 )
            // InternalMyDsl.g:851:2: rule__XpdlRoot__Group_4__0__Impl rule__XpdlRoot__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__XpdlRoot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__0"


    // $ANTLR start "rule__XpdlRoot__Group_4__0__Impl"
    // InternalMyDsl.g:858:1: rule__XpdlRoot__Group_4__0__Impl : ( 'diagramName' ) ;
    public final void rule__XpdlRoot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( 'diagramName' ) )
            // InternalMyDsl.g:863:1: ( 'diagramName' )
            {
            // InternalMyDsl.g:863:1: ( 'diagramName' )
            // InternalMyDsl.g:864:2: 'diagramName'
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getDiagramNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_4__1"
    // InternalMyDsl.g:873:1: rule__XpdlRoot__Group_4__1 : rule__XpdlRoot__Group_4__1__Impl ;
    public final void rule__XpdlRoot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( rule__XpdlRoot__Group_4__1__Impl )
            // InternalMyDsl.g:878:2: rule__XpdlRoot__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__1"


    // $ANTLR start "rule__XpdlRoot__Group_4__1__Impl"
    // InternalMyDsl.g:884:1: rule__XpdlRoot__Group_4__1__Impl : ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) ) ;
    public final void rule__XpdlRoot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:888:1: ( ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) ) )
            // InternalMyDsl.g:889:1: ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:889:1: ( ( rule__XpdlRoot__DiagramNameAssignment_4_1 ) )
            // InternalMyDsl.g:890:2: ( rule__XpdlRoot__DiagramNameAssignment_4_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameAssignment_4_1()); 
            // InternalMyDsl.g:891:2: ( rule__XpdlRoot__DiagramNameAssignment_4_1 )
            // InternalMyDsl.g:891:3: rule__XpdlRoot__DiagramNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__DiagramNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getDiagramNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_4__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__0"
    // InternalMyDsl.g:900:1: rule__XpdlRoot__Group_5__0 : rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1 ;
    public final void rule__XpdlRoot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1 )
            // InternalMyDsl.g:905:2: rule__XpdlRoot__Group_5__0__Impl rule__XpdlRoot__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__0"


    // $ANTLR start "rule__XpdlRoot__Group_5__0__Impl"
    // InternalMyDsl.g:912:1: rule__XpdlRoot__Group_5__0__Impl : ( 'pools' ) ;
    public final void rule__XpdlRoot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( 'pools' ) )
            // InternalMyDsl.g:917:1: ( 'pools' )
            {
            // InternalMyDsl.g:917:1: ( 'pools' )
            // InternalMyDsl.g:918:2: 'pools'
            {
             before(grammarAccess.getXpdlRootAccess().getPoolsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getPoolsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__1"
    // InternalMyDsl.g:927:1: rule__XpdlRoot__Group_5__1 : rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2 ;
    public final void rule__XpdlRoot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2 )
            // InternalMyDsl.g:932:2: rule__XpdlRoot__Group_5__1__Impl rule__XpdlRoot__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__XpdlRoot__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__1"


    // $ANTLR start "rule__XpdlRoot__Group_5__1__Impl"
    // InternalMyDsl.g:939:1: rule__XpdlRoot__Group_5__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( '{' ) )
            // InternalMyDsl.g:944:1: ( '{' )
            {
            // InternalMyDsl.g:944:1: ( '{' )
            // InternalMyDsl.g:945:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__2"
    // InternalMyDsl.g:954:1: rule__XpdlRoot__Group_5__2 : rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3 ;
    public final void rule__XpdlRoot__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3 )
            // InternalMyDsl.g:959:2: rule__XpdlRoot__Group_5__2__Impl rule__XpdlRoot__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__2"


    // $ANTLR start "rule__XpdlRoot__Group_5__2__Impl"
    // InternalMyDsl.g:966:1: rule__XpdlRoot__Group_5__2__Impl : ( ( rule__XpdlRoot__PoolsAssignment_5_2 ) ) ;
    public final void rule__XpdlRoot__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ( rule__XpdlRoot__PoolsAssignment_5_2 ) ) )
            // InternalMyDsl.g:971:1: ( ( rule__XpdlRoot__PoolsAssignment_5_2 ) )
            {
            // InternalMyDsl.g:971:1: ( ( rule__XpdlRoot__PoolsAssignment_5_2 ) )
            // InternalMyDsl.g:972:2: ( rule__XpdlRoot__PoolsAssignment_5_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getPoolsAssignment_5_2()); 
            // InternalMyDsl.g:973:2: ( rule__XpdlRoot__PoolsAssignment_5_2 )
            // InternalMyDsl.g:973:3: rule__XpdlRoot__PoolsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__PoolsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getPoolsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__3"
    // InternalMyDsl.g:981:1: rule__XpdlRoot__Group_5__3 : rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4 ;
    public final void rule__XpdlRoot__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4 )
            // InternalMyDsl.g:986:2: rule__XpdlRoot__Group_5__3__Impl rule__XpdlRoot__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__3"


    // $ANTLR start "rule__XpdlRoot__Group_5__3__Impl"
    // InternalMyDsl.g:993:1: rule__XpdlRoot__Group_5__3__Impl : ( ( rule__XpdlRoot__Group_5_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__XpdlRoot__Group_5_3__0 )* ) )
            // InternalMyDsl.g:998:1: ( ( rule__XpdlRoot__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:998:1: ( ( rule__XpdlRoot__Group_5_3__0 )* )
            // InternalMyDsl.g:999:2: ( rule__XpdlRoot__Group_5_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1000:2: ( rule__XpdlRoot__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1000:3: rule__XpdlRoot__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5__4"
    // InternalMyDsl.g:1008:1: rule__XpdlRoot__Group_5__4 : rule__XpdlRoot__Group_5__4__Impl ;
    public final void rule__XpdlRoot__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( rule__XpdlRoot__Group_5__4__Impl )
            // InternalMyDsl.g:1013:2: rule__XpdlRoot__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__4"


    // $ANTLR start "rule__XpdlRoot__Group_5__4__Impl"
    // InternalMyDsl.g:1019:1: rule__XpdlRoot__Group_5__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( ( '}' ) )
            // InternalMyDsl.g:1024:1: ( '}' )
            {
            // InternalMyDsl.g:1024:1: ( '}' )
            // InternalMyDsl.g:1025:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__0"
    // InternalMyDsl.g:1035:1: rule__XpdlRoot__Group_5_3__0 : rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1 ;
    public final void rule__XpdlRoot__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1 )
            // InternalMyDsl.g:1040:2: rule__XpdlRoot__Group_5_3__0__Impl rule__XpdlRoot__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__XpdlRoot__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__0__Impl"
    // InternalMyDsl.g:1047:1: rule__XpdlRoot__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( ',' ) )
            // InternalMyDsl.g:1052:1: ( ',' )
            {
            // InternalMyDsl.g:1052:1: ( ',' )
            // InternalMyDsl.g:1053:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__1"
    // InternalMyDsl.g:1062:1: rule__XpdlRoot__Group_5_3__1 : rule__XpdlRoot__Group_5_3__1__Impl ;
    public final void rule__XpdlRoot__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__XpdlRoot__Group_5_3__1__Impl )
            // InternalMyDsl.g:1067:2: rule__XpdlRoot__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_5_3__1__Impl"
    // InternalMyDsl.g:1073:1: rule__XpdlRoot__Group_5_3__1__Impl : ( ( rule__XpdlRoot__PoolsAssignment_5_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( ( ( rule__XpdlRoot__PoolsAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1078:1: ( ( rule__XpdlRoot__PoolsAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1078:1: ( ( rule__XpdlRoot__PoolsAssignment_5_3_1 ) )
            // InternalMyDsl.g:1079:2: ( rule__XpdlRoot__PoolsAssignment_5_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getPoolsAssignment_5_3_1()); 
            // InternalMyDsl.g:1080:2: ( rule__XpdlRoot__PoolsAssignment_5_3_1 )
            // InternalMyDsl.g:1080:3: rule__XpdlRoot__PoolsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__PoolsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getPoolsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_5_3__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__0"
    // InternalMyDsl.g:1089:1: rule__XpdlRoot__Group_6__0 : rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1 ;
    public final void rule__XpdlRoot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1 )
            // InternalMyDsl.g:1094:2: rule__XpdlRoot__Group_6__0__Impl rule__XpdlRoot__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__0"


    // $ANTLR start "rule__XpdlRoot__Group_6__0__Impl"
    // InternalMyDsl.g:1101:1: rule__XpdlRoot__Group_6__0__Impl : ( 'process' ) ;
    public final void rule__XpdlRoot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( 'process' ) )
            // InternalMyDsl.g:1106:1: ( 'process' )
            {
            // InternalMyDsl.g:1106:1: ( 'process' )
            // InternalMyDsl.g:1107:2: 'process'
            {
             before(grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getProcessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__1"
    // InternalMyDsl.g:1116:1: rule__XpdlRoot__Group_6__1 : rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2 ;
    public final void rule__XpdlRoot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2 )
            // InternalMyDsl.g:1121:2: rule__XpdlRoot__Group_6__1__Impl rule__XpdlRoot__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__XpdlRoot__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__1"


    // $ANTLR start "rule__XpdlRoot__Group_6__1__Impl"
    // InternalMyDsl.g:1128:1: rule__XpdlRoot__Group_6__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( '{' ) )
            // InternalMyDsl.g:1133:1: ( '{' )
            {
            // InternalMyDsl.g:1133:1: ( '{' )
            // InternalMyDsl.g:1134:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__2"
    // InternalMyDsl.g:1143:1: rule__XpdlRoot__Group_6__2 : rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3 ;
    public final void rule__XpdlRoot__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3 )
            // InternalMyDsl.g:1148:2: rule__XpdlRoot__Group_6__2__Impl rule__XpdlRoot__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__2"


    // $ANTLR start "rule__XpdlRoot__Group_6__2__Impl"
    // InternalMyDsl.g:1155:1: rule__XpdlRoot__Group_6__2__Impl : ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) ) ;
    public final void rule__XpdlRoot__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) ) )
            // InternalMyDsl.g:1160:1: ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1160:1: ( ( rule__XpdlRoot__ProcessAssignment_6_2 ) )
            // InternalMyDsl.g:1161:2: ( rule__XpdlRoot__ProcessAssignment_6_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_2()); 
            // InternalMyDsl.g:1162:2: ( rule__XpdlRoot__ProcessAssignment_6_2 )
            // InternalMyDsl.g:1162:3: rule__XpdlRoot__ProcessAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ProcessAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__3"
    // InternalMyDsl.g:1170:1: rule__XpdlRoot__Group_6__3 : rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4 ;
    public final void rule__XpdlRoot__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4 )
            // InternalMyDsl.g:1175:2: rule__XpdlRoot__Group_6__3__Impl rule__XpdlRoot__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__3"


    // $ANTLR start "rule__XpdlRoot__Group_6__3__Impl"
    // InternalMyDsl.g:1182:1: rule__XpdlRoot__Group_6__3__Impl : ( ( rule__XpdlRoot__Group_6_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ( rule__XpdlRoot__Group_6_3__0 )* ) )
            // InternalMyDsl.g:1187:1: ( ( rule__XpdlRoot__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:1187:1: ( ( rule__XpdlRoot__Group_6_3__0 )* )
            // InternalMyDsl.g:1188:2: ( rule__XpdlRoot__Group_6_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_6_3()); 
            // InternalMyDsl.g:1189:2: ( rule__XpdlRoot__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1189:3: rule__XpdlRoot__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6__4"
    // InternalMyDsl.g:1197:1: rule__XpdlRoot__Group_6__4 : rule__XpdlRoot__Group_6__4__Impl ;
    public final void rule__XpdlRoot__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__XpdlRoot__Group_6__4__Impl )
            // InternalMyDsl.g:1202:2: rule__XpdlRoot__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__4"


    // $ANTLR start "rule__XpdlRoot__Group_6__4__Impl"
    // InternalMyDsl.g:1208:1: rule__XpdlRoot__Group_6__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( ( '}' ) )
            // InternalMyDsl.g:1213:1: ( '}' )
            {
            // InternalMyDsl.g:1213:1: ( '}' )
            // InternalMyDsl.g:1214:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__0"
    // InternalMyDsl.g:1224:1: rule__XpdlRoot__Group_6_3__0 : rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1 ;
    public final void rule__XpdlRoot__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1 )
            // InternalMyDsl.g:1229:2: rule__XpdlRoot__Group_6_3__0__Impl rule__XpdlRoot__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__XpdlRoot__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__0__Impl"
    // InternalMyDsl.g:1236:1: rule__XpdlRoot__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( ',' ) )
            // InternalMyDsl.g:1241:1: ( ',' )
            {
            // InternalMyDsl.g:1241:1: ( ',' )
            // InternalMyDsl.g:1242:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__1"
    // InternalMyDsl.g:1251:1: rule__XpdlRoot__Group_6_3__1 : rule__XpdlRoot__Group_6_3__1__Impl ;
    public final void rule__XpdlRoot__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__XpdlRoot__Group_6_3__1__Impl )
            // InternalMyDsl.g:1256:2: rule__XpdlRoot__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_6_3__1__Impl"
    // InternalMyDsl.g:1262:1: rule__XpdlRoot__Group_6_3__1__Impl : ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:1267:1: ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:1267:1: ( ( rule__XpdlRoot__ProcessAssignment_6_3_1 ) )
            // InternalMyDsl.g:1268:2: ( rule__XpdlRoot__ProcessAssignment_6_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_3_1()); 
            // InternalMyDsl.g:1269:2: ( rule__XpdlRoot__ProcessAssignment_6_3_1 )
            // InternalMyDsl.g:1269:3: rule__XpdlRoot__ProcessAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__ProcessAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getProcessAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_6_3__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__0"
    // InternalMyDsl.g:1278:1: rule__XpdlRoot__Group_7__0 : rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1 ;
    public final void rule__XpdlRoot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1 )
            // InternalMyDsl.g:1283:2: rule__XpdlRoot__Group_7__0__Impl rule__XpdlRoot__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__XpdlRoot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__0"


    // $ANTLR start "rule__XpdlRoot__Group_7__0__Impl"
    // InternalMyDsl.g:1290:1: rule__XpdlRoot__Group_7__0__Impl : ( 'messageflows' ) ;
    public final void rule__XpdlRoot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( 'messageflows' ) )
            // InternalMyDsl.g:1295:1: ( 'messageflows' )
            {
            // InternalMyDsl.g:1295:1: ( 'messageflows' )
            // InternalMyDsl.g:1296:2: 'messageflows'
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getMessageflowsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__1"
    // InternalMyDsl.g:1305:1: rule__XpdlRoot__Group_7__1 : rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2 ;
    public final void rule__XpdlRoot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2 )
            // InternalMyDsl.g:1310:2: rule__XpdlRoot__Group_7__1__Impl rule__XpdlRoot__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__XpdlRoot__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__1"


    // $ANTLR start "rule__XpdlRoot__Group_7__1__Impl"
    // InternalMyDsl.g:1317:1: rule__XpdlRoot__Group_7__1__Impl : ( '{' ) ;
    public final void rule__XpdlRoot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( ( '{' ) )
            // InternalMyDsl.g:1322:1: ( '{' )
            {
            // InternalMyDsl.g:1322:1: ( '{' )
            // InternalMyDsl.g:1323:2: '{'
            {
             before(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__1__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__2"
    // InternalMyDsl.g:1332:1: rule__XpdlRoot__Group_7__2 : rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3 ;
    public final void rule__XpdlRoot__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3 )
            // InternalMyDsl.g:1337:2: rule__XpdlRoot__Group_7__2__Impl rule__XpdlRoot__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__2"


    // $ANTLR start "rule__XpdlRoot__Group_7__2__Impl"
    // InternalMyDsl.g:1344:1: rule__XpdlRoot__Group_7__2__Impl : ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) ) ;
    public final void rule__XpdlRoot__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) ) )
            // InternalMyDsl.g:1349:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1349:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_2 ) )
            // InternalMyDsl.g:1350:2: ( rule__XpdlRoot__MessageflowsAssignment_7_2 )
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_2()); 
            // InternalMyDsl.g:1351:2: ( rule__XpdlRoot__MessageflowsAssignment_7_2 )
            // InternalMyDsl.g:1351:3: rule__XpdlRoot__MessageflowsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__MessageflowsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__2__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__3"
    // InternalMyDsl.g:1359:1: rule__XpdlRoot__Group_7__3 : rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4 ;
    public final void rule__XpdlRoot__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4 )
            // InternalMyDsl.g:1364:2: rule__XpdlRoot__Group_7__3__Impl rule__XpdlRoot__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__XpdlRoot__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__3"


    // $ANTLR start "rule__XpdlRoot__Group_7__3__Impl"
    // InternalMyDsl.g:1371:1: rule__XpdlRoot__Group_7__3__Impl : ( ( rule__XpdlRoot__Group_7_3__0 )* ) ;
    public final void rule__XpdlRoot__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ( rule__XpdlRoot__Group_7_3__0 )* ) )
            // InternalMyDsl.g:1376:1: ( ( rule__XpdlRoot__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:1376:1: ( ( rule__XpdlRoot__Group_7_3__0 )* )
            // InternalMyDsl.g:1377:2: ( rule__XpdlRoot__Group_7_3__0 )*
            {
             before(grammarAccess.getXpdlRootAccess().getGroup_7_3()); 
            // InternalMyDsl.g:1378:2: ( rule__XpdlRoot__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1378:3: rule__XpdlRoot__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__XpdlRoot__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getXpdlRootAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__3__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7__4"
    // InternalMyDsl.g:1386:1: rule__XpdlRoot__Group_7__4 : rule__XpdlRoot__Group_7__4__Impl ;
    public final void rule__XpdlRoot__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( rule__XpdlRoot__Group_7__4__Impl )
            // InternalMyDsl.g:1391:2: rule__XpdlRoot__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__4"


    // $ANTLR start "rule__XpdlRoot__Group_7__4__Impl"
    // InternalMyDsl.g:1397:1: rule__XpdlRoot__Group_7__4__Impl : ( '}' ) ;
    public final void rule__XpdlRoot__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( '}' ) )
            // InternalMyDsl.g:1402:1: ( '}' )
            {
            // InternalMyDsl.g:1402:1: ( '}' )
            // InternalMyDsl.g:1403:2: '}'
            {
             before(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7__4__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__0"
    // InternalMyDsl.g:1413:1: rule__XpdlRoot__Group_7_3__0 : rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1 ;
    public final void rule__XpdlRoot__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1 )
            // InternalMyDsl.g:1418:2: rule__XpdlRoot__Group_7_3__0__Impl rule__XpdlRoot__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__XpdlRoot__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__0"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__0__Impl"
    // InternalMyDsl.g:1425:1: rule__XpdlRoot__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__XpdlRoot__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( ( ',' ) )
            // InternalMyDsl.g:1430:1: ( ',' )
            {
            // InternalMyDsl.g:1430:1: ( ',' )
            // InternalMyDsl.g:1431:2: ','
            {
             before(grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXpdlRootAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__0__Impl"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__1"
    // InternalMyDsl.g:1440:1: rule__XpdlRoot__Group_7_3__1 : rule__XpdlRoot__Group_7_3__1__Impl ;
    public final void rule__XpdlRoot__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( rule__XpdlRoot__Group_7_3__1__Impl )
            // InternalMyDsl.g:1445:2: rule__XpdlRoot__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__1"


    // $ANTLR start "rule__XpdlRoot__Group_7_3__1__Impl"
    // InternalMyDsl.g:1451:1: rule__XpdlRoot__Group_7_3__1__Impl : ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) ) ;
    public final void rule__XpdlRoot__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:1456:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:1456:1: ( ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 ) )
            // InternalMyDsl.g:1457:2: ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 )
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_3_1()); 
            // InternalMyDsl.g:1458:2: ( rule__XpdlRoot__MessageflowsAssignment_7_3_1 )
            // InternalMyDsl.g:1458:3: rule__XpdlRoot__MessageflowsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__XpdlRoot__MessageflowsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getXpdlRootAccess().getMessageflowsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__Group_7_3__1__Impl"


    // $ANTLR start "rule__Pool__Group__0"
    // InternalMyDsl.g:1467:1: rule__Pool__Group__0 : rule__Pool__Group__0__Impl rule__Pool__Group__1 ;
    public final void rule__Pool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( rule__Pool__Group__0__Impl rule__Pool__Group__1 )
            // InternalMyDsl.g:1472:2: rule__Pool__Group__0__Impl rule__Pool__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Pool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__0"


    // $ANTLR start "rule__Pool__Group__0__Impl"
    // InternalMyDsl.g:1479:1: rule__Pool__Group__0__Impl : ( 'Pool' ) ;
    public final void rule__Pool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( ( 'Pool' ) )
            // InternalMyDsl.g:1484:1: ( 'Pool' )
            {
            // InternalMyDsl.g:1484:1: ( 'Pool' )
            // InternalMyDsl.g:1485:2: 'Pool'
            {
             before(grammarAccess.getPoolAccess().getPoolKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getPoolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__0__Impl"


    // $ANTLR start "rule__Pool__Group__1"
    // InternalMyDsl.g:1494:1: rule__Pool__Group__1 : rule__Pool__Group__1__Impl rule__Pool__Group__2 ;
    public final void rule__Pool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( rule__Pool__Group__1__Impl rule__Pool__Group__2 )
            // InternalMyDsl.g:1499:2: rule__Pool__Group__1__Impl rule__Pool__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Pool__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__1"


    // $ANTLR start "rule__Pool__Group__1__Impl"
    // InternalMyDsl.g:1506:1: rule__Pool__Group__1__Impl : ( ( rule__Pool__IdAssignment_1 ) ) ;
    public final void rule__Pool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( ( rule__Pool__IdAssignment_1 ) ) )
            // InternalMyDsl.g:1511:1: ( ( rule__Pool__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:1511:1: ( ( rule__Pool__IdAssignment_1 ) )
            // InternalMyDsl.g:1512:2: ( rule__Pool__IdAssignment_1 )
            {
             before(grammarAccess.getPoolAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:1513:2: ( rule__Pool__IdAssignment_1 )
            // InternalMyDsl.g:1513:3: rule__Pool__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__1__Impl"


    // $ANTLR start "rule__Pool__Group__2"
    // InternalMyDsl.g:1521:1: rule__Pool__Group__2 : rule__Pool__Group__2__Impl rule__Pool__Group__3 ;
    public final void rule__Pool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( rule__Pool__Group__2__Impl rule__Pool__Group__3 )
            // InternalMyDsl.g:1526:2: rule__Pool__Group__2__Impl rule__Pool__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Pool__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__2"


    // $ANTLR start "rule__Pool__Group__2__Impl"
    // InternalMyDsl.g:1533:1: rule__Pool__Group__2__Impl : ( '{' ) ;
    public final void rule__Pool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( ( '{' ) )
            // InternalMyDsl.g:1538:1: ( '{' )
            {
            // InternalMyDsl.g:1538:1: ( '{' )
            // InternalMyDsl.g:1539:2: '{'
            {
             before(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__2__Impl"


    // $ANTLR start "rule__Pool__Group__3"
    // InternalMyDsl.g:1548:1: rule__Pool__Group__3 : rule__Pool__Group__3__Impl rule__Pool__Group__4 ;
    public final void rule__Pool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( rule__Pool__Group__3__Impl rule__Pool__Group__4 )
            // InternalMyDsl.g:1553:2: rule__Pool__Group__3__Impl rule__Pool__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Pool__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__3"


    // $ANTLR start "rule__Pool__Group__3__Impl"
    // InternalMyDsl.g:1560:1: rule__Pool__Group__3__Impl : ( ( rule__Pool__Group_3__0 )? ) ;
    public final void rule__Pool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( ( ( rule__Pool__Group_3__0 )? ) )
            // InternalMyDsl.g:1565:1: ( ( rule__Pool__Group_3__0 )? )
            {
            // InternalMyDsl.g:1565:1: ( ( rule__Pool__Group_3__0 )? )
            // InternalMyDsl.g:1566:2: ( rule__Pool__Group_3__0 )?
            {
             before(grammarAccess.getPoolAccess().getGroup_3()); 
            // InternalMyDsl.g:1567:2: ( rule__Pool__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1567:3: rule__Pool__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pool__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPoolAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__3__Impl"


    // $ANTLR start "rule__Pool__Group__4"
    // InternalMyDsl.g:1575:1: rule__Pool__Group__4 : rule__Pool__Group__4__Impl rule__Pool__Group__5 ;
    public final void rule__Pool__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( rule__Pool__Group__4__Impl rule__Pool__Group__5 )
            // InternalMyDsl.g:1580:2: rule__Pool__Group__4__Impl rule__Pool__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Pool__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__4"


    // $ANTLR start "rule__Pool__Group__4__Impl"
    // InternalMyDsl.g:1587:1: rule__Pool__Group__4__Impl : ( 'lanes' ) ;
    public final void rule__Pool__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( ( 'lanes' ) )
            // InternalMyDsl.g:1592:1: ( 'lanes' )
            {
            // InternalMyDsl.g:1592:1: ( 'lanes' )
            // InternalMyDsl.g:1593:2: 'lanes'
            {
             before(grammarAccess.getPoolAccess().getLanesKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLanesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__4__Impl"


    // $ANTLR start "rule__Pool__Group__5"
    // InternalMyDsl.g:1602:1: rule__Pool__Group__5 : rule__Pool__Group__5__Impl rule__Pool__Group__6 ;
    public final void rule__Pool__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( rule__Pool__Group__5__Impl rule__Pool__Group__6 )
            // InternalMyDsl.g:1607:2: rule__Pool__Group__5__Impl rule__Pool__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Pool__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__5"


    // $ANTLR start "rule__Pool__Group__5__Impl"
    // InternalMyDsl.g:1614:1: rule__Pool__Group__5__Impl : ( '{' ) ;
    public final void rule__Pool__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( ( '{' ) )
            // InternalMyDsl.g:1619:1: ( '{' )
            {
            // InternalMyDsl.g:1619:1: ( '{' )
            // InternalMyDsl.g:1620:2: '{'
            {
             before(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__5__Impl"


    // $ANTLR start "rule__Pool__Group__6"
    // InternalMyDsl.g:1629:1: rule__Pool__Group__6 : rule__Pool__Group__6__Impl rule__Pool__Group__7 ;
    public final void rule__Pool__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__Pool__Group__6__Impl rule__Pool__Group__7 )
            // InternalMyDsl.g:1634:2: rule__Pool__Group__6__Impl rule__Pool__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Pool__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__6"


    // $ANTLR start "rule__Pool__Group__6__Impl"
    // InternalMyDsl.g:1641:1: rule__Pool__Group__6__Impl : ( ( rule__Pool__LanesAssignment_6 ) ) ;
    public final void rule__Pool__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( ( rule__Pool__LanesAssignment_6 ) ) )
            // InternalMyDsl.g:1646:1: ( ( rule__Pool__LanesAssignment_6 ) )
            {
            // InternalMyDsl.g:1646:1: ( ( rule__Pool__LanesAssignment_6 ) )
            // InternalMyDsl.g:1647:2: ( rule__Pool__LanesAssignment_6 )
            {
             before(grammarAccess.getPoolAccess().getLanesAssignment_6()); 
            // InternalMyDsl.g:1648:2: ( rule__Pool__LanesAssignment_6 )
            // InternalMyDsl.g:1648:3: rule__Pool__LanesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pool__LanesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getLanesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__6__Impl"


    // $ANTLR start "rule__Pool__Group__7"
    // InternalMyDsl.g:1656:1: rule__Pool__Group__7 : rule__Pool__Group__7__Impl rule__Pool__Group__8 ;
    public final void rule__Pool__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__Pool__Group__7__Impl rule__Pool__Group__8 )
            // InternalMyDsl.g:1661:2: rule__Pool__Group__7__Impl rule__Pool__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Pool__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__7"


    // $ANTLR start "rule__Pool__Group__7__Impl"
    // InternalMyDsl.g:1668:1: rule__Pool__Group__7__Impl : ( ( rule__Pool__Group_7__0 )* ) ;
    public final void rule__Pool__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ( rule__Pool__Group_7__0 )* ) )
            // InternalMyDsl.g:1673:1: ( ( rule__Pool__Group_7__0 )* )
            {
            // InternalMyDsl.g:1673:1: ( ( rule__Pool__Group_7__0 )* )
            // InternalMyDsl.g:1674:2: ( rule__Pool__Group_7__0 )*
            {
             before(grammarAccess.getPoolAccess().getGroup_7()); 
            // InternalMyDsl.g:1675:2: ( rule__Pool__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1675:3: rule__Pool__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Pool__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPoolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__7__Impl"


    // $ANTLR start "rule__Pool__Group__8"
    // InternalMyDsl.g:1683:1: rule__Pool__Group__8 : rule__Pool__Group__8__Impl rule__Pool__Group__9 ;
    public final void rule__Pool__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__Pool__Group__8__Impl rule__Pool__Group__9 )
            // InternalMyDsl.g:1688:2: rule__Pool__Group__8__Impl rule__Pool__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Pool__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__8"


    // $ANTLR start "rule__Pool__Group__8__Impl"
    // InternalMyDsl.g:1695:1: rule__Pool__Group__8__Impl : ( '}' ) ;
    public final void rule__Pool__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( ( '}' ) )
            // InternalMyDsl.g:1700:1: ( '}' )
            {
            // InternalMyDsl.g:1700:1: ( '}' )
            // InternalMyDsl.g:1701:2: '}'
            {
             before(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__8__Impl"


    // $ANTLR start "rule__Pool__Group__9"
    // InternalMyDsl.g:1710:1: rule__Pool__Group__9 : rule__Pool__Group__9__Impl ;
    public final void rule__Pool__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__Pool__Group__9__Impl )
            // InternalMyDsl.g:1715:2: rule__Pool__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__9"


    // $ANTLR start "rule__Pool__Group__9__Impl"
    // InternalMyDsl.g:1721:1: rule__Pool__Group__9__Impl : ( '}' ) ;
    public final void rule__Pool__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( ( '}' ) )
            // InternalMyDsl.g:1726:1: ( '}' )
            {
            // InternalMyDsl.g:1726:1: ( '}' )
            // InternalMyDsl.g:1727:2: '}'
            {
             before(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group__9__Impl"


    // $ANTLR start "rule__Pool__Group_3__0"
    // InternalMyDsl.g:1737:1: rule__Pool__Group_3__0 : rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1 ;
    public final void rule__Pool__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1 )
            // InternalMyDsl.g:1742:2: rule__Pool__Group_3__0__Impl rule__Pool__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Pool__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__0"


    // $ANTLR start "rule__Pool__Group_3__0__Impl"
    // InternalMyDsl.g:1749:1: rule__Pool__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Pool__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( 'name' ) )
            // InternalMyDsl.g:1754:1: ( 'name' )
            {
            // InternalMyDsl.g:1754:1: ( 'name' )
            // InternalMyDsl.g:1755:2: 'name'
            {
             before(grammarAccess.getPoolAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__0__Impl"


    // $ANTLR start "rule__Pool__Group_3__1"
    // InternalMyDsl.g:1764:1: rule__Pool__Group_3__1 : rule__Pool__Group_3__1__Impl ;
    public final void rule__Pool__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__Pool__Group_3__1__Impl )
            // InternalMyDsl.g:1769:2: rule__Pool__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__1"


    // $ANTLR start "rule__Pool__Group_3__1__Impl"
    // InternalMyDsl.g:1775:1: rule__Pool__Group_3__1__Impl : ( ( rule__Pool__NameAssignment_3_1 ) ) ;
    public final void rule__Pool__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( ( ( rule__Pool__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1780:1: ( ( rule__Pool__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1780:1: ( ( rule__Pool__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1781:2: ( rule__Pool__NameAssignment_3_1 )
            {
             before(grammarAccess.getPoolAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1782:2: ( rule__Pool__NameAssignment_3_1 )
            // InternalMyDsl.g:1782:3: rule__Pool__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_3__1__Impl"


    // $ANTLR start "rule__Pool__Group_7__0"
    // InternalMyDsl.g:1791:1: rule__Pool__Group_7__0 : rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1 ;
    public final void rule__Pool__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1 )
            // InternalMyDsl.g:1796:2: rule__Pool__Group_7__0__Impl rule__Pool__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Pool__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pool__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__0"


    // $ANTLR start "rule__Pool__Group_7__0__Impl"
    // InternalMyDsl.g:1803:1: rule__Pool__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Pool__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( ( ',' ) )
            // InternalMyDsl.g:1808:1: ( ',' )
            {
            // InternalMyDsl.g:1808:1: ( ',' )
            // InternalMyDsl.g:1809:2: ','
            {
             before(grammarAccess.getPoolAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPoolAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__0__Impl"


    // $ANTLR start "rule__Pool__Group_7__1"
    // InternalMyDsl.g:1818:1: rule__Pool__Group_7__1 : rule__Pool__Group_7__1__Impl ;
    public final void rule__Pool__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__Pool__Group_7__1__Impl )
            // InternalMyDsl.g:1823:2: rule__Pool__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pool__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__1"


    // $ANTLR start "rule__Pool__Group_7__1__Impl"
    // InternalMyDsl.g:1829:1: rule__Pool__Group_7__1__Impl : ( ( rule__Pool__LanesAssignment_7_1 ) ) ;
    public final void rule__Pool__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( ( ( rule__Pool__LanesAssignment_7_1 ) ) )
            // InternalMyDsl.g:1834:1: ( ( rule__Pool__LanesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1834:1: ( ( rule__Pool__LanesAssignment_7_1 ) )
            // InternalMyDsl.g:1835:2: ( rule__Pool__LanesAssignment_7_1 )
            {
             before(grammarAccess.getPoolAccess().getLanesAssignment_7_1()); 
            // InternalMyDsl.g:1836:2: ( rule__Pool__LanesAssignment_7_1 )
            // InternalMyDsl.g:1836:3: rule__Pool__LanesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Pool__LanesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPoolAccess().getLanesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__Group_7__1__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalMyDsl.g:1845:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalMyDsl.g:1850:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalMyDsl.g:1857:1: rule__Process__Group__0__Impl : ( 'Process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( ( 'Process' ) )
            // InternalMyDsl.g:1862:1: ( 'Process' )
            {
            // InternalMyDsl.g:1862:1: ( 'Process' )
            // InternalMyDsl.g:1863:2: 'Process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalMyDsl.g:1872:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalMyDsl.g:1877:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalMyDsl.g:1884:1: rule__Process__Group__1__Impl : ( ( rule__Process__IdAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( ( rule__Process__IdAssignment_1 ) ) )
            // InternalMyDsl.g:1889:1: ( ( rule__Process__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:1889:1: ( ( rule__Process__IdAssignment_1 ) )
            // InternalMyDsl.g:1890:2: ( rule__Process__IdAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:1891:2: ( rule__Process__IdAssignment_1 )
            // InternalMyDsl.g:1891:3: rule__Process__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalMyDsl.g:1899:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalMyDsl.g:1904:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalMyDsl.g:1911:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( '{' ) )
            // InternalMyDsl.g:1916:1: ( '{' )
            {
            // InternalMyDsl.g:1916:1: ( '{' )
            // InternalMyDsl.g:1917:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalMyDsl.g:1926:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalMyDsl.g:1931:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalMyDsl.g:1938:1: rule__Process__Group__3__Impl : ( ( rule__Process__Group_3__0 )? ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ( rule__Process__Group_3__0 )? ) )
            // InternalMyDsl.g:1943:1: ( ( rule__Process__Group_3__0 )? )
            {
            // InternalMyDsl.g:1943:1: ( ( rule__Process__Group_3__0 )? )
            // InternalMyDsl.g:1944:2: ( rule__Process__Group_3__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_3()); 
            // InternalMyDsl.g:1945:2: ( rule__Process__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1945:3: rule__Process__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalMyDsl.g:1953:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalMyDsl.g:1958:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalMyDsl.g:1965:1: rule__Process__Group__4__Impl : ( 'pool' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( 'pool' ) )
            // InternalMyDsl.g:1970:1: ( 'pool' )
            {
            // InternalMyDsl.g:1970:1: ( 'pool' )
            // InternalMyDsl.g:1971:2: 'pool'
            {
             before(grammarAccess.getProcessAccess().getPoolKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getPoolKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalMyDsl.g:1980:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalMyDsl.g:1985:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalMyDsl.g:1992:1: rule__Process__Group__5__Impl : ( ( rule__Process__PoolAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( ( rule__Process__PoolAssignment_5 ) ) )
            // InternalMyDsl.g:1997:1: ( ( rule__Process__PoolAssignment_5 ) )
            {
            // InternalMyDsl.g:1997:1: ( ( rule__Process__PoolAssignment_5 ) )
            // InternalMyDsl.g:1998:2: ( rule__Process__PoolAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getPoolAssignment_5()); 
            // InternalMyDsl.g:1999:2: ( rule__Process__PoolAssignment_5 )
            // InternalMyDsl.g:1999:3: rule__Process__PoolAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__PoolAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getPoolAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalMyDsl.g:2007:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalMyDsl.g:2012:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalMyDsl.g:2019:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )? ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( ( ( rule__Process__Group_6__0 )? ) )
            // InternalMyDsl.g:2024:1: ( ( rule__Process__Group_6__0 )? )
            {
            // InternalMyDsl.g:2024:1: ( ( rule__Process__Group_6__0 )? )
            // InternalMyDsl.g:2025:2: ( rule__Process__Group_6__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalMyDsl.g:2026:2: ( rule__Process__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2026:3: rule__Process__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalMyDsl.g:2034:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalMyDsl.g:2039:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalMyDsl.g:2046:1: rule__Process__Group__7__Impl : ( ( rule__Process__Group_7__0 )? ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( ( rule__Process__Group_7__0 )? ) )
            // InternalMyDsl.g:2051:1: ( ( rule__Process__Group_7__0 )? )
            {
            // InternalMyDsl.g:2051:1: ( ( rule__Process__Group_7__0 )? )
            // InternalMyDsl.g:2052:2: ( rule__Process__Group_7__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_7()); 
            // InternalMyDsl.g:2053:2: ( rule__Process__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2053:3: rule__Process__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalMyDsl.g:2061:1: rule__Process__Group__8 : rule__Process__Group__8__Impl ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( rule__Process__Group__8__Impl )
            // InternalMyDsl.g:2066:2: rule__Process__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalMyDsl.g:2072:1: rule__Process__Group__8__Impl : ( '}' ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( ( '}' ) )
            // InternalMyDsl.g:2077:1: ( '}' )
            {
            // InternalMyDsl.g:2077:1: ( '}' )
            // InternalMyDsl.g:2078:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group_3__0"
    // InternalMyDsl.g:2088:1: rule__Process__Group_3__0 : rule__Process__Group_3__0__Impl rule__Process__Group_3__1 ;
    public final void rule__Process__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( rule__Process__Group_3__0__Impl rule__Process__Group_3__1 )
            // InternalMyDsl.g:2093:2: rule__Process__Group_3__0__Impl rule__Process__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__0"


    // $ANTLR start "rule__Process__Group_3__0__Impl"
    // InternalMyDsl.g:2100:1: rule__Process__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Process__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( ( 'name' ) )
            // InternalMyDsl.g:2105:1: ( 'name' )
            {
            // InternalMyDsl.g:2105:1: ( 'name' )
            // InternalMyDsl.g:2106:2: 'name'
            {
             before(grammarAccess.getProcessAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__0__Impl"


    // $ANTLR start "rule__Process__Group_3__1"
    // InternalMyDsl.g:2115:1: rule__Process__Group_3__1 : rule__Process__Group_3__1__Impl ;
    public final void rule__Process__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( rule__Process__Group_3__1__Impl )
            // InternalMyDsl.g:2120:2: rule__Process__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__1"


    // $ANTLR start "rule__Process__Group_3__1__Impl"
    // InternalMyDsl.g:2126:1: rule__Process__Group_3__1__Impl : ( ( rule__Process__NameAssignment_3_1 ) ) ;
    public final void rule__Process__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2130:1: ( ( ( rule__Process__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:2131:1: ( ( rule__Process__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2131:1: ( ( rule__Process__NameAssignment_3_1 ) )
            // InternalMyDsl.g:2132:2: ( rule__Process__NameAssignment_3_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:2133:2: ( rule__Process__NameAssignment_3_1 )
            // InternalMyDsl.g:2133:3: rule__Process__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_3__1__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalMyDsl.g:2142:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalMyDsl.g:2147:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalMyDsl.g:2154:1: rule__Process__Group_6__0__Impl : ( 'transitions' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( 'transitions' ) )
            // InternalMyDsl.g:2159:1: ( 'transitions' )
            {
            // InternalMyDsl.g:2159:1: ( 'transitions' )
            // InternalMyDsl.g:2160:2: 'transitions'
            {
             before(grammarAccess.getProcessAccess().getTransitionsKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getTransitionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalMyDsl.g:2169:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl rule__Process__Group_6__2 ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( rule__Process__Group_6__1__Impl rule__Process__Group_6__2 )
            // InternalMyDsl.g:2174:2: rule__Process__Group_6__1__Impl rule__Process__Group_6__2
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalMyDsl.g:2181:1: rule__Process__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( ( '{' ) )
            // InternalMyDsl.g:2186:1: ( '{' )
            {
            // InternalMyDsl.g:2186:1: ( '{' )
            // InternalMyDsl.g:2187:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_6__2"
    // InternalMyDsl.g:2196:1: rule__Process__Group_6__2 : rule__Process__Group_6__2__Impl rule__Process__Group_6__3 ;
    public final void rule__Process__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( rule__Process__Group_6__2__Impl rule__Process__Group_6__3 )
            // InternalMyDsl.g:2201:2: rule__Process__Group_6__2__Impl rule__Process__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__2"


    // $ANTLR start "rule__Process__Group_6__2__Impl"
    // InternalMyDsl.g:2208:1: rule__Process__Group_6__2__Impl : ( ( rule__Process__TransitionsAssignment_6_2 ) ) ;
    public final void rule__Process__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( ( rule__Process__TransitionsAssignment_6_2 ) ) )
            // InternalMyDsl.g:2213:1: ( ( rule__Process__TransitionsAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2213:1: ( ( rule__Process__TransitionsAssignment_6_2 ) )
            // InternalMyDsl.g:2214:2: ( rule__Process__TransitionsAssignment_6_2 )
            {
             before(grammarAccess.getProcessAccess().getTransitionsAssignment_6_2()); 
            // InternalMyDsl.g:2215:2: ( rule__Process__TransitionsAssignment_6_2 )
            // InternalMyDsl.g:2215:3: rule__Process__TransitionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__TransitionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getTransitionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__2__Impl"


    // $ANTLR start "rule__Process__Group_6__3"
    // InternalMyDsl.g:2223:1: rule__Process__Group_6__3 : rule__Process__Group_6__3__Impl rule__Process__Group_6__4 ;
    public final void rule__Process__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( rule__Process__Group_6__3__Impl rule__Process__Group_6__4 )
            // InternalMyDsl.g:2228:2: rule__Process__Group_6__3__Impl rule__Process__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__3"


    // $ANTLR start "rule__Process__Group_6__3__Impl"
    // InternalMyDsl.g:2235:1: rule__Process__Group_6__3__Impl : ( ( rule__Process__Group_6_3__0 )* ) ;
    public final void rule__Process__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( ( ( rule__Process__Group_6_3__0 )* ) )
            // InternalMyDsl.g:2240:1: ( ( rule__Process__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:2240:1: ( ( rule__Process__Group_6_3__0 )* )
            // InternalMyDsl.g:2241:2: ( rule__Process__Group_6_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6_3()); 
            // InternalMyDsl.g:2242:2: ( rule__Process__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2242:3: rule__Process__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__3__Impl"


    // $ANTLR start "rule__Process__Group_6__4"
    // InternalMyDsl.g:2250:1: rule__Process__Group_6__4 : rule__Process__Group_6__4__Impl ;
    public final void rule__Process__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( rule__Process__Group_6__4__Impl )
            // InternalMyDsl.g:2255:2: rule__Process__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__4"


    // $ANTLR start "rule__Process__Group_6__4__Impl"
    // InternalMyDsl.g:2261:1: rule__Process__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( '}' ) )
            // InternalMyDsl.g:2266:1: ( '}' )
            {
            // InternalMyDsl.g:2266:1: ( '}' )
            // InternalMyDsl.g:2267:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6__4__Impl"


    // $ANTLR start "rule__Process__Group_6_3__0"
    // InternalMyDsl.g:2277:1: rule__Process__Group_6_3__0 : rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1 ;
    public final void rule__Process__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1 )
            // InternalMyDsl.g:2282:2: rule__Process__Group_6_3__0__Impl rule__Process__Group_6_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Process__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__0"


    // $ANTLR start "rule__Process__Group_6_3__0__Impl"
    // InternalMyDsl.g:2289:1: rule__Process__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( ( ',' ) )
            // InternalMyDsl.g:2294:1: ( ',' )
            {
            // InternalMyDsl.g:2294:1: ( ',' )
            // InternalMyDsl.g:2295:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__0__Impl"


    // $ANTLR start "rule__Process__Group_6_3__1"
    // InternalMyDsl.g:2304:1: rule__Process__Group_6_3__1 : rule__Process__Group_6_3__1__Impl ;
    public final void rule__Process__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( rule__Process__Group_6_3__1__Impl )
            // InternalMyDsl.g:2309:2: rule__Process__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__1"


    // $ANTLR start "rule__Process__Group_6_3__1__Impl"
    // InternalMyDsl.g:2315:1: rule__Process__Group_6_3__1__Impl : ( ( rule__Process__TransitionsAssignment_6_3_1 ) ) ;
    public final void rule__Process__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2319:1: ( ( ( rule__Process__TransitionsAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:2320:1: ( ( rule__Process__TransitionsAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:2320:1: ( ( rule__Process__TransitionsAssignment_6_3_1 ) )
            // InternalMyDsl.g:2321:2: ( rule__Process__TransitionsAssignment_6_3_1 )
            {
             before(grammarAccess.getProcessAccess().getTransitionsAssignment_6_3_1()); 
            // InternalMyDsl.g:2322:2: ( rule__Process__TransitionsAssignment_6_3_1 )
            // InternalMyDsl.g:2322:3: rule__Process__TransitionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__TransitionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getTransitionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_6_3__1__Impl"


    // $ANTLR start "rule__Process__Group_7__0"
    // InternalMyDsl.g:2331:1: rule__Process__Group_7__0 : rule__Process__Group_7__0__Impl rule__Process__Group_7__1 ;
    public final void rule__Process__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( rule__Process__Group_7__0__Impl rule__Process__Group_7__1 )
            // InternalMyDsl.g:2336:2: rule__Process__Group_7__0__Impl rule__Process__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__0"


    // $ANTLR start "rule__Process__Group_7__0__Impl"
    // InternalMyDsl.g:2343:1: rule__Process__Group_7__0__Impl : ( 'activityset' ) ;
    public final void rule__Process__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( 'activityset' ) )
            // InternalMyDsl.g:2348:1: ( 'activityset' )
            {
            // InternalMyDsl.g:2348:1: ( 'activityset' )
            // InternalMyDsl.g:2349:2: 'activityset'
            {
             before(grammarAccess.getProcessAccess().getActivitysetKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getActivitysetKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__0__Impl"


    // $ANTLR start "rule__Process__Group_7__1"
    // InternalMyDsl.g:2358:1: rule__Process__Group_7__1 : rule__Process__Group_7__1__Impl rule__Process__Group_7__2 ;
    public final void rule__Process__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__Process__Group_7__1__Impl rule__Process__Group_7__2 )
            // InternalMyDsl.g:2363:2: rule__Process__Group_7__1__Impl rule__Process__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__Process__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__1"


    // $ANTLR start "rule__Process__Group_7__1__Impl"
    // InternalMyDsl.g:2370:1: rule__Process__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Process__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( ( '{' ) )
            // InternalMyDsl.g:2375:1: ( '{' )
            {
            // InternalMyDsl.g:2375:1: ( '{' )
            // InternalMyDsl.g:2376:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__1__Impl"


    // $ANTLR start "rule__Process__Group_7__2"
    // InternalMyDsl.g:2385:1: rule__Process__Group_7__2 : rule__Process__Group_7__2__Impl rule__Process__Group_7__3 ;
    public final void rule__Process__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( rule__Process__Group_7__2__Impl rule__Process__Group_7__3 )
            // InternalMyDsl.g:2390:2: rule__Process__Group_7__2__Impl rule__Process__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__2"


    // $ANTLR start "rule__Process__Group_7__2__Impl"
    // InternalMyDsl.g:2397:1: rule__Process__Group_7__2__Impl : ( ( rule__Process__ActivitysetAssignment_7_2 ) ) ;
    public final void rule__Process__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( ( rule__Process__ActivitysetAssignment_7_2 ) ) )
            // InternalMyDsl.g:2402:1: ( ( rule__Process__ActivitysetAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2402:1: ( ( rule__Process__ActivitysetAssignment_7_2 ) )
            // InternalMyDsl.g:2403:2: ( rule__Process__ActivitysetAssignment_7_2 )
            {
             before(grammarAccess.getProcessAccess().getActivitysetAssignment_7_2()); 
            // InternalMyDsl.g:2404:2: ( rule__Process__ActivitysetAssignment_7_2 )
            // InternalMyDsl.g:2404:3: rule__Process__ActivitysetAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ActivitysetAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getActivitysetAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__2__Impl"


    // $ANTLR start "rule__Process__Group_7__3"
    // InternalMyDsl.g:2412:1: rule__Process__Group_7__3 : rule__Process__Group_7__3__Impl rule__Process__Group_7__4 ;
    public final void rule__Process__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( rule__Process__Group_7__3__Impl rule__Process__Group_7__4 )
            // InternalMyDsl.g:2417:2: rule__Process__Group_7__3__Impl rule__Process__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__3"


    // $ANTLR start "rule__Process__Group_7__3__Impl"
    // InternalMyDsl.g:2424:1: rule__Process__Group_7__3__Impl : ( ( rule__Process__Group_7_3__0 )* ) ;
    public final void rule__Process__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( ( ( rule__Process__Group_7_3__0 )* ) )
            // InternalMyDsl.g:2429:1: ( ( rule__Process__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:2429:1: ( ( rule__Process__Group_7_3__0 )* )
            // InternalMyDsl.g:2430:2: ( rule__Process__Group_7_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_7_3()); 
            // InternalMyDsl.g:2431:2: ( rule__Process__Group_7_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2431:3: rule__Process__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Process__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__3__Impl"


    // $ANTLR start "rule__Process__Group_7__4"
    // InternalMyDsl.g:2439:1: rule__Process__Group_7__4 : rule__Process__Group_7__4__Impl ;
    public final void rule__Process__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( rule__Process__Group_7__4__Impl )
            // InternalMyDsl.g:2444:2: rule__Process__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__4"


    // $ANTLR start "rule__Process__Group_7__4__Impl"
    // InternalMyDsl.g:2450:1: rule__Process__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Process__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2454:1: ( ( '}' ) )
            // InternalMyDsl.g:2455:1: ( '}' )
            {
            // InternalMyDsl.g:2455:1: ( '}' )
            // InternalMyDsl.g:2456:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7__4__Impl"


    // $ANTLR start "rule__Process__Group_7_3__0"
    // InternalMyDsl.g:2466:1: rule__Process__Group_7_3__0 : rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1 ;
    public final void rule__Process__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1 )
            // InternalMyDsl.g:2471:2: rule__Process__Group_7_3__0__Impl rule__Process__Group_7_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Process__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__0"


    // $ANTLR start "rule__Process__Group_7_3__0__Impl"
    // InternalMyDsl.g:2478:1: rule__Process__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( ',' ) )
            // InternalMyDsl.g:2483:1: ( ',' )
            {
            // InternalMyDsl.g:2483:1: ( ',' )
            // InternalMyDsl.g:2484:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__0__Impl"


    // $ANTLR start "rule__Process__Group_7_3__1"
    // InternalMyDsl.g:2493:1: rule__Process__Group_7_3__1 : rule__Process__Group_7_3__1__Impl ;
    public final void rule__Process__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( rule__Process__Group_7_3__1__Impl )
            // InternalMyDsl.g:2498:2: rule__Process__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__1"


    // $ANTLR start "rule__Process__Group_7_3__1__Impl"
    // InternalMyDsl.g:2504:1: rule__Process__Group_7_3__1__Impl : ( ( rule__Process__ActivitysetAssignment_7_3_1 ) ) ;
    public final void rule__Process__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ( rule__Process__ActivitysetAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:2509:1: ( ( rule__Process__ActivitysetAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:2509:1: ( ( rule__Process__ActivitysetAssignment_7_3_1 ) )
            // InternalMyDsl.g:2510:2: ( rule__Process__ActivitysetAssignment_7_3_1 )
            {
             before(grammarAccess.getProcessAccess().getActivitysetAssignment_7_3_1()); 
            // InternalMyDsl.g:2511:2: ( rule__Process__ActivitysetAssignment_7_3_1 )
            // InternalMyDsl.g:2511:3: rule__Process__ActivitysetAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ActivitysetAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getActivitysetAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_7_3__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group__0"
    // InternalMyDsl.g:2520:1: rule__MessageFlow__Group__0 : rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1 ;
    public final void rule__MessageFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1 )
            // InternalMyDsl.g:2525:2: rule__MessageFlow__Group__0__Impl rule__MessageFlow__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MessageFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__0"


    // $ANTLR start "rule__MessageFlow__Group__0__Impl"
    // InternalMyDsl.g:2532:1: rule__MessageFlow__Group__0__Impl : ( () ) ;
    public final void rule__MessageFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( () ) )
            // InternalMyDsl.g:2537:1: ( () )
            {
            // InternalMyDsl.g:2537:1: ( () )
            // InternalMyDsl.g:2538:2: ()
            {
             before(grammarAccess.getMessageFlowAccess().getMessageFlowAction_0()); 
            // InternalMyDsl.g:2539:2: ()
            // InternalMyDsl.g:2539:3: 
            {
            }

             after(grammarAccess.getMessageFlowAccess().getMessageFlowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group__1"
    // InternalMyDsl.g:2547:1: rule__MessageFlow__Group__1 : rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2 ;
    public final void rule__MessageFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2 )
            // InternalMyDsl.g:2552:2: rule__MessageFlow__Group__1__Impl rule__MessageFlow__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MessageFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__1"


    // $ANTLR start "rule__MessageFlow__Group__1__Impl"
    // InternalMyDsl.g:2559:1: rule__MessageFlow__Group__1__Impl : ( 'MessageFlow' ) ;
    public final void rule__MessageFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( 'MessageFlow' ) )
            // InternalMyDsl.g:2564:1: ( 'MessageFlow' )
            {
            // InternalMyDsl.g:2564:1: ( 'MessageFlow' )
            // InternalMyDsl.g:2565:2: 'MessageFlow'
            {
             before(grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getMessageFlowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group__2"
    // InternalMyDsl.g:2574:1: rule__MessageFlow__Group__2 : rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3 ;
    public final void rule__MessageFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3 )
            // InternalMyDsl.g:2579:2: rule__MessageFlow__Group__2__Impl rule__MessageFlow__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__MessageFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__2"


    // $ANTLR start "rule__MessageFlow__Group__2__Impl"
    // InternalMyDsl.g:2586:1: rule__MessageFlow__Group__2__Impl : ( '{' ) ;
    public final void rule__MessageFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( ( '{' ) )
            // InternalMyDsl.g:2591:1: ( '{' )
            {
            // InternalMyDsl.g:2591:1: ( '{' )
            // InternalMyDsl.g:2592:2: '{'
            {
             before(grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__2__Impl"


    // $ANTLR start "rule__MessageFlow__Group__3"
    // InternalMyDsl.g:2601:1: rule__MessageFlow__Group__3 : rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4 ;
    public final void rule__MessageFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4 )
            // InternalMyDsl.g:2606:2: rule__MessageFlow__Group__3__Impl rule__MessageFlow__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__MessageFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__3"


    // $ANTLR start "rule__MessageFlow__Group__3__Impl"
    // InternalMyDsl.g:2613:1: rule__MessageFlow__Group__3__Impl : ( ( rule__MessageFlow__Group_3__0 )? ) ;
    public final void rule__MessageFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( ( rule__MessageFlow__Group_3__0 )? ) )
            // InternalMyDsl.g:2618:1: ( ( rule__MessageFlow__Group_3__0 )? )
            {
            // InternalMyDsl.g:2618:1: ( ( rule__MessageFlow__Group_3__0 )? )
            // InternalMyDsl.g:2619:2: ( rule__MessageFlow__Group_3__0 )?
            {
             before(grammarAccess.getMessageFlowAccess().getGroup_3()); 
            // InternalMyDsl.g:2620:2: ( rule__MessageFlow__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2620:3: rule__MessageFlow__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageFlow__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageFlowAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__3__Impl"


    // $ANTLR start "rule__MessageFlow__Group__4"
    // InternalMyDsl.g:2628:1: rule__MessageFlow__Group__4 : rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5 ;
    public final void rule__MessageFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5 )
            // InternalMyDsl.g:2633:2: rule__MessageFlow__Group__4__Impl rule__MessageFlow__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__MessageFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__4"


    // $ANTLR start "rule__MessageFlow__Group__4__Impl"
    // InternalMyDsl.g:2640:1: rule__MessageFlow__Group__4__Impl : ( ( rule__MessageFlow__Group_4__0 )? ) ;
    public final void rule__MessageFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( ( rule__MessageFlow__Group_4__0 )? ) )
            // InternalMyDsl.g:2645:1: ( ( rule__MessageFlow__Group_4__0 )? )
            {
            // InternalMyDsl.g:2645:1: ( ( rule__MessageFlow__Group_4__0 )? )
            // InternalMyDsl.g:2646:2: ( rule__MessageFlow__Group_4__0 )?
            {
             before(grammarAccess.getMessageFlowAccess().getGroup_4()); 
            // InternalMyDsl.g:2647:2: ( rule__MessageFlow__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2647:3: rule__MessageFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MessageFlow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageFlowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__4__Impl"


    // $ANTLR start "rule__MessageFlow__Group__5"
    // InternalMyDsl.g:2655:1: rule__MessageFlow__Group__5 : rule__MessageFlow__Group__5__Impl ;
    public final void rule__MessageFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( rule__MessageFlow__Group__5__Impl )
            // InternalMyDsl.g:2660:2: rule__MessageFlow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__5"


    // $ANTLR start "rule__MessageFlow__Group__5__Impl"
    // InternalMyDsl.g:2666:1: rule__MessageFlow__Group__5__Impl : ( '}' ) ;
    public final void rule__MessageFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( ( '}' ) )
            // InternalMyDsl.g:2671:1: ( '}' )
            {
            // InternalMyDsl.g:2671:1: ( '}' )
            // InternalMyDsl.g:2672:2: '}'
            {
             before(grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group__5__Impl"


    // $ANTLR start "rule__MessageFlow__Group_3__0"
    // InternalMyDsl.g:2682:1: rule__MessageFlow__Group_3__0 : rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1 ;
    public final void rule__MessageFlow__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1 )
            // InternalMyDsl.g:2687:2: rule__MessageFlow__Group_3__0__Impl rule__MessageFlow__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MessageFlow__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__0"


    // $ANTLR start "rule__MessageFlow__Group_3__0__Impl"
    // InternalMyDsl.g:2694:1: rule__MessageFlow__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__MessageFlow__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( 'source' ) )
            // InternalMyDsl.g:2699:1: ( 'source' )
            {
            // InternalMyDsl.g:2699:1: ( 'source' )
            // InternalMyDsl.g:2700:2: 'source'
            {
             before(grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getSourceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group_3__1"
    // InternalMyDsl.g:2709:1: rule__MessageFlow__Group_3__1 : rule__MessageFlow__Group_3__1__Impl ;
    public final void rule__MessageFlow__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( rule__MessageFlow__Group_3__1__Impl )
            // InternalMyDsl.g:2714:2: rule__MessageFlow__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__1"


    // $ANTLR start "rule__MessageFlow__Group_3__1__Impl"
    // InternalMyDsl.g:2720:1: rule__MessageFlow__Group_3__1__Impl : ( ( rule__MessageFlow__SourceAssignment_3_1 ) ) ;
    public final void rule__MessageFlow__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( ( ( rule__MessageFlow__SourceAssignment_3_1 ) ) )
            // InternalMyDsl.g:2725:1: ( ( rule__MessageFlow__SourceAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2725:1: ( ( rule__MessageFlow__SourceAssignment_3_1 ) )
            // InternalMyDsl.g:2726:2: ( rule__MessageFlow__SourceAssignment_3_1 )
            {
             before(grammarAccess.getMessageFlowAccess().getSourceAssignment_3_1()); 
            // InternalMyDsl.g:2727:2: ( rule__MessageFlow__SourceAssignment_3_1 )
            // InternalMyDsl.g:2727:3: rule__MessageFlow__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getSourceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_3__1__Impl"


    // $ANTLR start "rule__MessageFlow__Group_4__0"
    // InternalMyDsl.g:2736:1: rule__MessageFlow__Group_4__0 : rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1 ;
    public final void rule__MessageFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1 )
            // InternalMyDsl.g:2741:2: rule__MessageFlow__Group_4__0__Impl rule__MessageFlow__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__MessageFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__0"


    // $ANTLR start "rule__MessageFlow__Group_4__0__Impl"
    // InternalMyDsl.g:2748:1: rule__MessageFlow__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__MessageFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( ( 'target' ) )
            // InternalMyDsl.g:2753:1: ( 'target' )
            {
            // InternalMyDsl.g:2753:1: ( 'target' )
            // InternalMyDsl.g:2754:2: 'target'
            {
             before(grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMessageFlowAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__0__Impl"


    // $ANTLR start "rule__MessageFlow__Group_4__1"
    // InternalMyDsl.g:2763:1: rule__MessageFlow__Group_4__1 : rule__MessageFlow__Group_4__1__Impl ;
    public final void rule__MessageFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( rule__MessageFlow__Group_4__1__Impl )
            // InternalMyDsl.g:2768:2: rule__MessageFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__1"


    // $ANTLR start "rule__MessageFlow__Group_4__1__Impl"
    // InternalMyDsl.g:2774:1: rule__MessageFlow__Group_4__1__Impl : ( ( rule__MessageFlow__TargetAssignment_4_1 ) ) ;
    public final void rule__MessageFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( ( ( rule__MessageFlow__TargetAssignment_4_1 ) ) )
            // InternalMyDsl.g:2779:1: ( ( rule__MessageFlow__TargetAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2779:1: ( ( rule__MessageFlow__TargetAssignment_4_1 ) )
            // InternalMyDsl.g:2780:2: ( rule__MessageFlow__TargetAssignment_4_1 )
            {
             before(grammarAccess.getMessageFlowAccess().getTargetAssignment_4_1()); 
            // InternalMyDsl.g:2781:2: ( rule__MessageFlow__TargetAssignment_4_1 )
            // InternalMyDsl.g:2781:3: rule__MessageFlow__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MessageFlow__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageFlowAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__Group_4__1__Impl"


    // $ANTLR start "rule__Lane__Group__0"
    // InternalMyDsl.g:2790:1: rule__Lane__Group__0 : rule__Lane__Group__0__Impl rule__Lane__Group__1 ;
    public final void rule__Lane__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( rule__Lane__Group__0__Impl rule__Lane__Group__1 )
            // InternalMyDsl.g:2795:2: rule__Lane__Group__0__Impl rule__Lane__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Lane__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__0"


    // $ANTLR start "rule__Lane__Group__0__Impl"
    // InternalMyDsl.g:2802:1: rule__Lane__Group__0__Impl : ( () ) ;
    public final void rule__Lane__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( () ) )
            // InternalMyDsl.g:2807:1: ( () )
            {
            // InternalMyDsl.g:2807:1: ( () )
            // InternalMyDsl.g:2808:2: ()
            {
             before(grammarAccess.getLaneAccess().getLaneAction_0()); 
            // InternalMyDsl.g:2809:2: ()
            // InternalMyDsl.g:2809:3: 
            {
            }

             after(grammarAccess.getLaneAccess().getLaneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__0__Impl"


    // $ANTLR start "rule__Lane__Group__1"
    // InternalMyDsl.g:2817:1: rule__Lane__Group__1 : rule__Lane__Group__1__Impl rule__Lane__Group__2 ;
    public final void rule__Lane__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( rule__Lane__Group__1__Impl rule__Lane__Group__2 )
            // InternalMyDsl.g:2822:2: rule__Lane__Group__1__Impl rule__Lane__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lane__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__1"


    // $ANTLR start "rule__Lane__Group__1__Impl"
    // InternalMyDsl.g:2829:1: rule__Lane__Group__1__Impl : ( 'Lane' ) ;
    public final void rule__Lane__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( 'Lane' ) )
            // InternalMyDsl.g:2834:1: ( 'Lane' )
            {
            // InternalMyDsl.g:2834:1: ( 'Lane' )
            // InternalMyDsl.g:2835:2: 'Lane'
            {
             before(grammarAccess.getLaneAccess().getLaneKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getLaneKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__1__Impl"


    // $ANTLR start "rule__Lane__Group__2"
    // InternalMyDsl.g:2844:1: rule__Lane__Group__2 : rule__Lane__Group__2__Impl rule__Lane__Group__3 ;
    public final void rule__Lane__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( rule__Lane__Group__2__Impl rule__Lane__Group__3 )
            // InternalMyDsl.g:2849:2: rule__Lane__Group__2__Impl rule__Lane__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Lane__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__2"


    // $ANTLR start "rule__Lane__Group__2__Impl"
    // InternalMyDsl.g:2856:1: rule__Lane__Group__2__Impl : ( ( rule__Lane__IdAssignment_2 ) ) ;
    public final void rule__Lane__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( ( rule__Lane__IdAssignment_2 ) ) )
            // InternalMyDsl.g:2861:1: ( ( rule__Lane__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:2861:1: ( ( rule__Lane__IdAssignment_2 ) )
            // InternalMyDsl.g:2862:2: ( rule__Lane__IdAssignment_2 )
            {
             before(grammarAccess.getLaneAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:2863:2: ( rule__Lane__IdAssignment_2 )
            // InternalMyDsl.g:2863:3: rule__Lane__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lane__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__2__Impl"


    // $ANTLR start "rule__Lane__Group__3"
    // InternalMyDsl.g:2871:1: rule__Lane__Group__3 : rule__Lane__Group__3__Impl rule__Lane__Group__4 ;
    public final void rule__Lane__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( rule__Lane__Group__3__Impl rule__Lane__Group__4 )
            // InternalMyDsl.g:2876:2: rule__Lane__Group__3__Impl rule__Lane__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Lane__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__3"


    // $ANTLR start "rule__Lane__Group__3__Impl"
    // InternalMyDsl.g:2883:1: rule__Lane__Group__3__Impl : ( '{' ) ;
    public final void rule__Lane__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( ( '{' ) )
            // InternalMyDsl.g:2888:1: ( '{' )
            {
            // InternalMyDsl.g:2888:1: ( '{' )
            // InternalMyDsl.g:2889:2: '{'
            {
             before(grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__3__Impl"


    // $ANTLR start "rule__Lane__Group__4"
    // InternalMyDsl.g:2898:1: rule__Lane__Group__4 : rule__Lane__Group__4__Impl rule__Lane__Group__5 ;
    public final void rule__Lane__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( rule__Lane__Group__4__Impl rule__Lane__Group__5 )
            // InternalMyDsl.g:2903:2: rule__Lane__Group__4__Impl rule__Lane__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Lane__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__4"


    // $ANTLR start "rule__Lane__Group__4__Impl"
    // InternalMyDsl.g:2910:1: rule__Lane__Group__4__Impl : ( ( rule__Lane__Group_4__0 )? ) ;
    public final void rule__Lane__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( ( rule__Lane__Group_4__0 )? ) )
            // InternalMyDsl.g:2915:1: ( ( rule__Lane__Group_4__0 )? )
            {
            // InternalMyDsl.g:2915:1: ( ( rule__Lane__Group_4__0 )? )
            // InternalMyDsl.g:2916:2: ( rule__Lane__Group_4__0 )?
            {
             before(grammarAccess.getLaneAccess().getGroup_4()); 
            // InternalMyDsl.g:2917:2: ( rule__Lane__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2917:3: rule__Lane__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lane__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLaneAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__4__Impl"


    // $ANTLR start "rule__Lane__Group__5"
    // InternalMyDsl.g:2925:1: rule__Lane__Group__5 : rule__Lane__Group__5__Impl rule__Lane__Group__6 ;
    public final void rule__Lane__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( rule__Lane__Group__5__Impl rule__Lane__Group__6 )
            // InternalMyDsl.g:2930:2: rule__Lane__Group__5__Impl rule__Lane__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Lane__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__5"


    // $ANTLR start "rule__Lane__Group__5__Impl"
    // InternalMyDsl.g:2937:1: rule__Lane__Group__5__Impl : ( ( rule__Lane__Group_5__0 )? ) ;
    public final void rule__Lane__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( ( ( rule__Lane__Group_5__0 )? ) )
            // InternalMyDsl.g:2942:1: ( ( rule__Lane__Group_5__0 )? )
            {
            // InternalMyDsl.g:2942:1: ( ( rule__Lane__Group_5__0 )? )
            // InternalMyDsl.g:2943:2: ( rule__Lane__Group_5__0 )?
            {
             before(grammarAccess.getLaneAccess().getGroup_5()); 
            // InternalMyDsl.g:2944:2: ( rule__Lane__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2944:3: rule__Lane__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lane__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLaneAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__5__Impl"


    // $ANTLR start "rule__Lane__Group__6"
    // InternalMyDsl.g:2952:1: rule__Lane__Group__6 : rule__Lane__Group__6__Impl ;
    public final void rule__Lane__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( rule__Lane__Group__6__Impl )
            // InternalMyDsl.g:2957:2: rule__Lane__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__6"


    // $ANTLR start "rule__Lane__Group__6__Impl"
    // InternalMyDsl.g:2963:1: rule__Lane__Group__6__Impl : ( '}' ) ;
    public final void rule__Lane__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( ( '}' ) )
            // InternalMyDsl.g:2968:1: ( '}' )
            {
            // InternalMyDsl.g:2968:1: ( '}' )
            // InternalMyDsl.g:2969:2: '}'
            {
             before(grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group__6__Impl"


    // $ANTLR start "rule__Lane__Group_4__0"
    // InternalMyDsl.g:2979:1: rule__Lane__Group_4__0 : rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1 ;
    public final void rule__Lane__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1 )
            // InternalMyDsl.g:2984:2: rule__Lane__Group_4__0__Impl rule__Lane__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Lane__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__0"


    // $ANTLR start "rule__Lane__Group_4__0__Impl"
    // InternalMyDsl.g:2991:1: rule__Lane__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Lane__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( 'name' ) )
            // InternalMyDsl.g:2996:1: ( 'name' )
            {
            // InternalMyDsl.g:2996:1: ( 'name' )
            // InternalMyDsl.g:2997:2: 'name'
            {
             before(grammarAccess.getLaneAccess().getNameKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__0__Impl"


    // $ANTLR start "rule__Lane__Group_4__1"
    // InternalMyDsl.g:3006:1: rule__Lane__Group_4__1 : rule__Lane__Group_4__1__Impl ;
    public final void rule__Lane__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( rule__Lane__Group_4__1__Impl )
            // InternalMyDsl.g:3011:2: rule__Lane__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__1"


    // $ANTLR start "rule__Lane__Group_4__1__Impl"
    // InternalMyDsl.g:3017:1: rule__Lane__Group_4__1__Impl : ( ( rule__Lane__NameAssignment_4_1 ) ) ;
    public final void rule__Lane__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3021:1: ( ( ( rule__Lane__NameAssignment_4_1 ) ) )
            // InternalMyDsl.g:3022:1: ( ( rule__Lane__NameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3022:1: ( ( rule__Lane__NameAssignment_4_1 ) )
            // InternalMyDsl.g:3023:2: ( rule__Lane__NameAssignment_4_1 )
            {
             before(grammarAccess.getLaneAccess().getNameAssignment_4_1()); 
            // InternalMyDsl.g:3024:2: ( rule__Lane__NameAssignment_4_1 )
            // InternalMyDsl.g:3024:3: rule__Lane__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Lane__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_4__1__Impl"


    // $ANTLR start "rule__Lane__Group_5__0"
    // InternalMyDsl.g:3033:1: rule__Lane__Group_5__0 : rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1 ;
    public final void rule__Lane__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1 )
            // InternalMyDsl.g:3038:2: rule__Lane__Group_5__0__Impl rule__Lane__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Lane__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lane__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__0"


    // $ANTLR start "rule__Lane__Group_5__0__Impl"
    // InternalMyDsl.g:3045:1: rule__Lane__Group_5__0__Impl : ( 'activityset' ) ;
    public final void rule__Lane__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( ( 'activityset' ) )
            // InternalMyDsl.g:3050:1: ( 'activityset' )
            {
            // InternalMyDsl.g:3050:1: ( 'activityset' )
            // InternalMyDsl.g:3051:2: 'activityset'
            {
             before(grammarAccess.getLaneAccess().getActivitysetKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLaneAccess().getActivitysetKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__0__Impl"


    // $ANTLR start "rule__Lane__Group_5__1"
    // InternalMyDsl.g:3060:1: rule__Lane__Group_5__1 : rule__Lane__Group_5__1__Impl ;
    public final void rule__Lane__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3064:1: ( rule__Lane__Group_5__1__Impl )
            // InternalMyDsl.g:3065:2: rule__Lane__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lane__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__1"


    // $ANTLR start "rule__Lane__Group_5__1__Impl"
    // InternalMyDsl.g:3071:1: rule__Lane__Group_5__1__Impl : ( ( rule__Lane__ActivitysetAssignment_5_1 ) ) ;
    public final void rule__Lane__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ( rule__Lane__ActivitysetAssignment_5_1 ) ) )
            // InternalMyDsl.g:3076:1: ( ( rule__Lane__ActivitysetAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3076:1: ( ( rule__Lane__ActivitysetAssignment_5_1 ) )
            // InternalMyDsl.g:3077:2: ( rule__Lane__ActivitysetAssignment_5_1 )
            {
             before(grammarAccess.getLaneAccess().getActivitysetAssignment_5_1()); 
            // InternalMyDsl.g:3078:2: ( rule__Lane__ActivitysetAssignment_5_1 )
            // InternalMyDsl.g:3078:3: rule__Lane__ActivitysetAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Lane__ActivitysetAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLaneAccess().getActivitysetAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__Group_5__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group__0"
    // InternalMyDsl.g:3087:1: rule__ActivitySet__Group__0 : rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1 ;
    public final void rule__ActivitySet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1 )
            // InternalMyDsl.g:3092:2: rule__ActivitySet__Group__0__Impl rule__ActivitySet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivitySet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__0"


    // $ANTLR start "rule__ActivitySet__Group__0__Impl"
    // InternalMyDsl.g:3099:1: rule__ActivitySet__Group__0__Impl : ( 'ActivitySet' ) ;
    public final void rule__ActivitySet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( ( 'ActivitySet' ) )
            // InternalMyDsl.g:3104:1: ( 'ActivitySet' )
            {
            // InternalMyDsl.g:3104:1: ( 'ActivitySet' )
            // InternalMyDsl.g:3105:2: 'ActivitySet'
            {
             before(grammarAccess.getActivitySetAccess().getActivitySetKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getActivitySetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group__1"
    // InternalMyDsl.g:3114:1: rule__ActivitySet__Group__1 : rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2 ;
    public final void rule__ActivitySet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2 )
            // InternalMyDsl.g:3119:2: rule__ActivitySet__Group__1__Impl rule__ActivitySet__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ActivitySet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__1"


    // $ANTLR start "rule__ActivitySet__Group__1__Impl"
    // InternalMyDsl.g:3126:1: rule__ActivitySet__Group__1__Impl : ( ( rule__ActivitySet__IdAssignment_1 ) ) ;
    public final void rule__ActivitySet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( ( rule__ActivitySet__IdAssignment_1 ) ) )
            // InternalMyDsl.g:3131:1: ( ( rule__ActivitySet__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:3131:1: ( ( rule__ActivitySet__IdAssignment_1 ) )
            // InternalMyDsl.g:3132:2: ( rule__ActivitySet__IdAssignment_1 )
            {
             before(grammarAccess.getActivitySetAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:3133:2: ( rule__ActivitySet__IdAssignment_1 )
            // InternalMyDsl.g:3133:3: rule__ActivitySet__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group__2"
    // InternalMyDsl.g:3141:1: rule__ActivitySet__Group__2 : rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3 ;
    public final void rule__ActivitySet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3 )
            // InternalMyDsl.g:3146:2: rule__ActivitySet__Group__2__Impl rule__ActivitySet__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ActivitySet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__2"


    // $ANTLR start "rule__ActivitySet__Group__2__Impl"
    // InternalMyDsl.g:3153:1: rule__ActivitySet__Group__2__Impl : ( '{' ) ;
    public final void rule__ActivitySet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( '{' ) )
            // InternalMyDsl.g:3158:1: ( '{' )
            {
            // InternalMyDsl.g:3158:1: ( '{' )
            // InternalMyDsl.g:3159:2: '{'
            {
             before(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__2__Impl"


    // $ANTLR start "rule__ActivitySet__Group__3"
    // InternalMyDsl.g:3168:1: rule__ActivitySet__Group__3 : rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4 ;
    public final void rule__ActivitySet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4 )
            // InternalMyDsl.g:3173:2: rule__ActivitySet__Group__3__Impl rule__ActivitySet__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ActivitySet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__3"


    // $ANTLR start "rule__ActivitySet__Group__3__Impl"
    // InternalMyDsl.g:3180:1: rule__ActivitySet__Group__3__Impl : ( ( rule__ActivitySet__Group_3__0 )? ) ;
    public final void rule__ActivitySet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ( rule__ActivitySet__Group_3__0 )? ) )
            // InternalMyDsl.g:3185:1: ( ( rule__ActivitySet__Group_3__0 )? )
            {
            // InternalMyDsl.g:3185:1: ( ( rule__ActivitySet__Group_3__0 )? )
            // InternalMyDsl.g:3186:2: ( rule__ActivitySet__Group_3__0 )?
            {
             before(grammarAccess.getActivitySetAccess().getGroup_3()); 
            // InternalMyDsl.g:3187:2: ( rule__ActivitySet__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3187:3: rule__ActivitySet__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivitySet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivitySetAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__3__Impl"


    // $ANTLR start "rule__ActivitySet__Group__4"
    // InternalMyDsl.g:3195:1: rule__ActivitySet__Group__4 : rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5 ;
    public final void rule__ActivitySet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5 )
            // InternalMyDsl.g:3200:2: rule__ActivitySet__Group__4__Impl rule__ActivitySet__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ActivitySet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__4"


    // $ANTLR start "rule__ActivitySet__Group__4__Impl"
    // InternalMyDsl.g:3207:1: rule__ActivitySet__Group__4__Impl : ( 'activities' ) ;
    public final void rule__ActivitySet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( 'activities' ) )
            // InternalMyDsl.g:3212:1: ( 'activities' )
            {
            // InternalMyDsl.g:3212:1: ( 'activities' )
            // InternalMyDsl.g:3213:2: 'activities'
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getActivitiesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__4__Impl"


    // $ANTLR start "rule__ActivitySet__Group__5"
    // InternalMyDsl.g:3222:1: rule__ActivitySet__Group__5 : rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6 ;
    public final void rule__ActivitySet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6 )
            // InternalMyDsl.g:3227:2: rule__ActivitySet__Group__5__Impl rule__ActivitySet__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ActivitySet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__5"


    // $ANTLR start "rule__ActivitySet__Group__5__Impl"
    // InternalMyDsl.g:3234:1: rule__ActivitySet__Group__5__Impl : ( '{' ) ;
    public final void rule__ActivitySet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( ( '{' ) )
            // InternalMyDsl.g:3239:1: ( '{' )
            {
            // InternalMyDsl.g:3239:1: ( '{' )
            // InternalMyDsl.g:3240:2: '{'
            {
             before(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__5__Impl"


    // $ANTLR start "rule__ActivitySet__Group__6"
    // InternalMyDsl.g:3249:1: rule__ActivitySet__Group__6 : rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7 ;
    public final void rule__ActivitySet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7 )
            // InternalMyDsl.g:3254:2: rule__ActivitySet__Group__6__Impl rule__ActivitySet__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ActivitySet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__6"


    // $ANTLR start "rule__ActivitySet__Group__6__Impl"
    // InternalMyDsl.g:3261:1: rule__ActivitySet__Group__6__Impl : ( ( rule__ActivitySet__ActivitiesAssignment_6 ) ) ;
    public final void rule__ActivitySet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( ( ( rule__ActivitySet__ActivitiesAssignment_6 ) ) )
            // InternalMyDsl.g:3266:1: ( ( rule__ActivitySet__ActivitiesAssignment_6 ) )
            {
            // InternalMyDsl.g:3266:1: ( ( rule__ActivitySet__ActivitiesAssignment_6 ) )
            // InternalMyDsl.g:3267:2: ( rule__ActivitySet__ActivitiesAssignment_6 )
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesAssignment_6()); 
            // InternalMyDsl.g:3268:2: ( rule__ActivitySet__ActivitiesAssignment_6 )
            // InternalMyDsl.g:3268:3: rule__ActivitySet__ActivitiesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__ActivitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getActivitiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__6__Impl"


    // $ANTLR start "rule__ActivitySet__Group__7"
    // InternalMyDsl.g:3276:1: rule__ActivitySet__Group__7 : rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8 ;
    public final void rule__ActivitySet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8 )
            // InternalMyDsl.g:3281:2: rule__ActivitySet__Group__7__Impl rule__ActivitySet__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__ActivitySet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__7"


    // $ANTLR start "rule__ActivitySet__Group__7__Impl"
    // InternalMyDsl.g:3288:1: rule__ActivitySet__Group__7__Impl : ( ( rule__ActivitySet__Group_7__0 )* ) ;
    public final void rule__ActivitySet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( ( rule__ActivitySet__Group_7__0 )* ) )
            // InternalMyDsl.g:3293:1: ( ( rule__ActivitySet__Group_7__0 )* )
            {
            // InternalMyDsl.g:3293:1: ( ( rule__ActivitySet__Group_7__0 )* )
            // InternalMyDsl.g:3294:2: ( rule__ActivitySet__Group_7__0 )*
            {
             before(grammarAccess.getActivitySetAccess().getGroup_7()); 
            // InternalMyDsl.g:3295:2: ( rule__ActivitySet__Group_7__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3295:3: rule__ActivitySet__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ActivitySet__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActivitySetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__7__Impl"


    // $ANTLR start "rule__ActivitySet__Group__8"
    // InternalMyDsl.g:3303:1: rule__ActivitySet__Group__8 : rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9 ;
    public final void rule__ActivitySet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9 )
            // InternalMyDsl.g:3308:2: rule__ActivitySet__Group__8__Impl rule__ActivitySet__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__ActivitySet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__8"


    // $ANTLR start "rule__ActivitySet__Group__8__Impl"
    // InternalMyDsl.g:3315:1: rule__ActivitySet__Group__8__Impl : ( '}' ) ;
    public final void rule__ActivitySet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( '}' ) )
            // InternalMyDsl.g:3320:1: ( '}' )
            {
            // InternalMyDsl.g:3320:1: ( '}' )
            // InternalMyDsl.g:3321:2: '}'
            {
             before(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__8__Impl"


    // $ANTLR start "rule__ActivitySet__Group__9"
    // InternalMyDsl.g:3330:1: rule__ActivitySet__Group__9 : rule__ActivitySet__Group__9__Impl ;
    public final void rule__ActivitySet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( rule__ActivitySet__Group__9__Impl )
            // InternalMyDsl.g:3335:2: rule__ActivitySet__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__9"


    // $ANTLR start "rule__ActivitySet__Group__9__Impl"
    // InternalMyDsl.g:3341:1: rule__ActivitySet__Group__9__Impl : ( '}' ) ;
    public final void rule__ActivitySet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3345:1: ( ( '}' ) )
            // InternalMyDsl.g:3346:1: ( '}' )
            {
            // InternalMyDsl.g:3346:1: ( '}' )
            // InternalMyDsl.g:3347:2: '}'
            {
             before(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group__9__Impl"


    // $ANTLR start "rule__ActivitySet__Group_3__0"
    // InternalMyDsl.g:3357:1: rule__ActivitySet__Group_3__0 : rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1 ;
    public final void rule__ActivitySet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1 )
            // InternalMyDsl.g:3362:2: rule__ActivitySet__Group_3__0__Impl rule__ActivitySet__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivitySet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__0"


    // $ANTLR start "rule__ActivitySet__Group_3__0__Impl"
    // InternalMyDsl.g:3369:1: rule__ActivitySet__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__ActivitySet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( ( 'name' ) )
            // InternalMyDsl.g:3374:1: ( 'name' )
            {
            // InternalMyDsl.g:3374:1: ( 'name' )
            // InternalMyDsl.g:3375:2: 'name'
            {
             before(grammarAccess.getActivitySetAccess().getNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group_3__1"
    // InternalMyDsl.g:3384:1: rule__ActivitySet__Group_3__1 : rule__ActivitySet__Group_3__1__Impl ;
    public final void rule__ActivitySet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( rule__ActivitySet__Group_3__1__Impl )
            // InternalMyDsl.g:3389:2: rule__ActivitySet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__1"


    // $ANTLR start "rule__ActivitySet__Group_3__1__Impl"
    // InternalMyDsl.g:3395:1: rule__ActivitySet__Group_3__1__Impl : ( ( rule__ActivitySet__NameAssignment_3_1 ) ) ;
    public final void rule__ActivitySet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( ( ( rule__ActivitySet__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:3400:1: ( ( rule__ActivitySet__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3400:1: ( ( rule__ActivitySet__NameAssignment_3_1 ) )
            // InternalMyDsl.g:3401:2: ( rule__ActivitySet__NameAssignment_3_1 )
            {
             before(grammarAccess.getActivitySetAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:3402:2: ( rule__ActivitySet__NameAssignment_3_1 )
            // InternalMyDsl.g:3402:3: rule__ActivitySet__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_3__1__Impl"


    // $ANTLR start "rule__ActivitySet__Group_7__0"
    // InternalMyDsl.g:3411:1: rule__ActivitySet__Group_7__0 : rule__ActivitySet__Group_7__0__Impl rule__ActivitySet__Group_7__1 ;
    public final void rule__ActivitySet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( rule__ActivitySet__Group_7__0__Impl rule__ActivitySet__Group_7__1 )
            // InternalMyDsl.g:3416:2: rule__ActivitySet__Group_7__0__Impl rule__ActivitySet__Group_7__1
            {
            pushFollow(FOLLOW_22);
            rule__ActivitySet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_7__0"


    // $ANTLR start "rule__ActivitySet__Group_7__0__Impl"
    // InternalMyDsl.g:3423:1: rule__ActivitySet__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ActivitySet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( ( ',' ) )
            // InternalMyDsl.g:3428:1: ( ',' )
            {
            // InternalMyDsl.g:3428:1: ( ',' )
            // InternalMyDsl.g:3429:2: ','
            {
             before(grammarAccess.getActivitySetAccess().getCommaKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActivitySetAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_7__0__Impl"


    // $ANTLR start "rule__ActivitySet__Group_7__1"
    // InternalMyDsl.g:3438:1: rule__ActivitySet__Group_7__1 : rule__ActivitySet__Group_7__1__Impl ;
    public final void rule__ActivitySet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( rule__ActivitySet__Group_7__1__Impl )
            // InternalMyDsl.g:3443:2: rule__ActivitySet__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_7__1"


    // $ANTLR start "rule__ActivitySet__Group_7__1__Impl"
    // InternalMyDsl.g:3449:1: rule__ActivitySet__Group_7__1__Impl : ( ( rule__ActivitySet__ActivitiesAssignment_7_1 ) ) ;
    public final void rule__ActivitySet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( ( ( rule__ActivitySet__ActivitiesAssignment_7_1 ) ) )
            // InternalMyDsl.g:3454:1: ( ( rule__ActivitySet__ActivitiesAssignment_7_1 ) )
            {
            // InternalMyDsl.g:3454:1: ( ( rule__ActivitySet__ActivitiesAssignment_7_1 ) )
            // InternalMyDsl.g:3455:2: ( rule__ActivitySet__ActivitiesAssignment_7_1 )
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesAssignment_7_1()); 
            // InternalMyDsl.g:3456:2: ( rule__ActivitySet__ActivitiesAssignment_7_1 )
            // InternalMyDsl.g:3456:3: rule__ActivitySet__ActivitiesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivitySet__ActivitiesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getActivitySetAccess().getActivitiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__Group_7__1__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__0"
    // InternalMyDsl.g:3465:1: rule__Activity_Impl__Group__0 : rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1 ;
    public final void rule__Activity_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3469:1: ( rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1 )
            // InternalMyDsl.g:3470:2: rule__Activity_Impl__Group__0__Impl rule__Activity_Impl__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Activity_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__0"


    // $ANTLR start "rule__Activity_Impl__Group__0__Impl"
    // InternalMyDsl.g:3477:1: rule__Activity_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Activity_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( ( () ) )
            // InternalMyDsl.g:3482:1: ( () )
            {
            // InternalMyDsl.g:3482:1: ( () )
            // InternalMyDsl.g:3483:2: ()
            {
             before(grammarAccess.getActivity_ImplAccess().getActivityAction_0()); 
            // InternalMyDsl.g:3484:2: ()
            // InternalMyDsl.g:3484:3: 
            {
            }

             after(grammarAccess.getActivity_ImplAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__0__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__1"
    // InternalMyDsl.g:3492:1: rule__Activity_Impl__Group__1 : rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2 ;
    public final void rule__Activity_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2 )
            // InternalMyDsl.g:3497:2: rule__Activity_Impl__Group__1__Impl rule__Activity_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Activity_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__1"


    // $ANTLR start "rule__Activity_Impl__Group__1__Impl"
    // InternalMyDsl.g:3504:1: rule__Activity_Impl__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( ( 'Activity' ) )
            // InternalMyDsl.g:3509:1: ( 'Activity' )
            {
            // InternalMyDsl.g:3509:1: ( 'Activity' )
            // InternalMyDsl.g:3510:2: 'Activity'
            {
             before(grammarAccess.getActivity_ImplAccess().getActivityKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__1__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__2"
    // InternalMyDsl.g:3519:1: rule__Activity_Impl__Group__2 : rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3 ;
    public final void rule__Activity_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3 )
            // InternalMyDsl.g:3524:2: rule__Activity_Impl__Group__2__Impl rule__Activity_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Activity_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__2"


    // $ANTLR start "rule__Activity_Impl__Group__2__Impl"
    // InternalMyDsl.g:3531:1: rule__Activity_Impl__Group__2__Impl : ( ( rule__Activity_Impl__IdAssignment_2 ) ) ;
    public final void rule__Activity_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ( rule__Activity_Impl__IdAssignment_2 ) ) )
            // InternalMyDsl.g:3536:1: ( ( rule__Activity_Impl__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:3536:1: ( ( rule__Activity_Impl__IdAssignment_2 ) )
            // InternalMyDsl.g:3537:2: ( rule__Activity_Impl__IdAssignment_2 )
            {
             before(grammarAccess.getActivity_ImplAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:3538:2: ( rule__Activity_Impl__IdAssignment_2 )
            // InternalMyDsl.g:3538:3: rule__Activity_Impl__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__2__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__3"
    // InternalMyDsl.g:3546:1: rule__Activity_Impl__Group__3 : rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4 ;
    public final void rule__Activity_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4 )
            // InternalMyDsl.g:3551:2: rule__Activity_Impl__Group__3__Impl rule__Activity_Impl__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Activity_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__3"


    // $ANTLR start "rule__Activity_Impl__Group__3__Impl"
    // InternalMyDsl.g:3558:1: rule__Activity_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( ( '{' ) )
            // InternalMyDsl.g:3563:1: ( '{' )
            {
            // InternalMyDsl.g:3563:1: ( '{' )
            // InternalMyDsl.g:3564:2: '{'
            {
             before(grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__3__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__4"
    // InternalMyDsl.g:3573:1: rule__Activity_Impl__Group__4 : rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5 ;
    public final void rule__Activity_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3577:1: ( rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5 )
            // InternalMyDsl.g:3578:2: rule__Activity_Impl__Group__4__Impl rule__Activity_Impl__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Activity_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__4"


    // $ANTLR start "rule__Activity_Impl__Group__4__Impl"
    // InternalMyDsl.g:3585:1: rule__Activity_Impl__Group__4__Impl : ( ( rule__Activity_Impl__Group_4__0 )? ) ;
    public final void rule__Activity_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( ( rule__Activity_Impl__Group_4__0 )? ) )
            // InternalMyDsl.g:3590:1: ( ( rule__Activity_Impl__Group_4__0 )? )
            {
            // InternalMyDsl.g:3590:1: ( ( rule__Activity_Impl__Group_4__0 )? )
            // InternalMyDsl.g:3591:2: ( rule__Activity_Impl__Group_4__0 )?
            {
             before(grammarAccess.getActivity_ImplAccess().getGroup_4()); 
            // InternalMyDsl.g:3592:2: ( rule__Activity_Impl__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3592:3: rule__Activity_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivity_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__4__Impl"


    // $ANTLR start "rule__Activity_Impl__Group__5"
    // InternalMyDsl.g:3600:1: rule__Activity_Impl__Group__5 : rule__Activity_Impl__Group__5__Impl ;
    public final void rule__Activity_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( rule__Activity_Impl__Group__5__Impl )
            // InternalMyDsl.g:3605:2: rule__Activity_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__5"


    // $ANTLR start "rule__Activity_Impl__Group__5__Impl"
    // InternalMyDsl.g:3611:1: rule__Activity_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3615:1: ( ( '}' ) )
            // InternalMyDsl.g:3616:1: ( '}' )
            {
            // InternalMyDsl.g:3616:1: ( '}' )
            // InternalMyDsl.g:3617:2: '}'
            {
             before(grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group__5__Impl"


    // $ANTLR start "rule__Activity_Impl__Group_4__0"
    // InternalMyDsl.g:3627:1: rule__Activity_Impl__Group_4__0 : rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1 ;
    public final void rule__Activity_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1 )
            // InternalMyDsl.g:3632:2: rule__Activity_Impl__Group_4__0__Impl rule__Activity_Impl__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Activity_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__0"


    // $ANTLR start "rule__Activity_Impl__Group_4__0__Impl"
    // InternalMyDsl.g:3639:1: rule__Activity_Impl__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Activity_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( ( 'title' ) )
            // InternalMyDsl.g:3644:1: ( 'title' )
            {
            // InternalMyDsl.g:3644:1: ( 'title' )
            // InternalMyDsl.g:3645:2: 'title'
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getActivity_ImplAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Activity_Impl__Group_4__1"
    // InternalMyDsl.g:3654:1: rule__Activity_Impl__Group_4__1 : rule__Activity_Impl__Group_4__1__Impl ;
    public final void rule__Activity_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( rule__Activity_Impl__Group_4__1__Impl )
            // InternalMyDsl.g:3659:2: rule__Activity_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__1"


    // $ANTLR start "rule__Activity_Impl__Group_4__1__Impl"
    // InternalMyDsl.g:3665:1: rule__Activity_Impl__Group_4__1__Impl : ( ( rule__Activity_Impl__TitleAssignment_4_1 ) ) ;
    public final void rule__Activity_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3669:1: ( ( ( rule__Activity_Impl__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:3670:1: ( ( rule__Activity_Impl__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3670:1: ( ( rule__Activity_Impl__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:3671:2: ( rule__Activity_Impl__TitleAssignment_4_1 )
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:3672:2: ( rule__Activity_Impl__TitleAssignment_4_1 )
            // InternalMyDsl.g:3672:3: rule__Activity_Impl__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity_Impl__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivity_ImplAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__BlockActivity__Group__0"
    // InternalMyDsl.g:3681:1: rule__BlockActivity__Group__0 : rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1 ;
    public final void rule__BlockActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1 )
            // InternalMyDsl.g:3686:2: rule__BlockActivity__Group__0__Impl rule__BlockActivity__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BlockActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__0"


    // $ANTLR start "rule__BlockActivity__Group__0__Impl"
    // InternalMyDsl.g:3693:1: rule__BlockActivity__Group__0__Impl : ( () ) ;
    public final void rule__BlockActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( ( () ) )
            // InternalMyDsl.g:3698:1: ( () )
            {
            // InternalMyDsl.g:3698:1: ( () )
            // InternalMyDsl.g:3699:2: ()
            {
             before(grammarAccess.getBlockActivityAccess().getBlockActivityAction_0()); 
            // InternalMyDsl.g:3700:2: ()
            // InternalMyDsl.g:3700:3: 
            {
            }

             after(grammarAccess.getBlockActivityAccess().getBlockActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__0__Impl"


    // $ANTLR start "rule__BlockActivity__Group__1"
    // InternalMyDsl.g:3708:1: rule__BlockActivity__Group__1 : rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2 ;
    public final void rule__BlockActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3712:1: ( rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2 )
            // InternalMyDsl.g:3713:2: rule__BlockActivity__Group__1__Impl rule__BlockActivity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BlockActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__1"


    // $ANTLR start "rule__BlockActivity__Group__1__Impl"
    // InternalMyDsl.g:3720:1: rule__BlockActivity__Group__1__Impl : ( 'BlockActivity' ) ;
    public final void rule__BlockActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( ( 'BlockActivity' ) )
            // InternalMyDsl.g:3725:1: ( 'BlockActivity' )
            {
            // InternalMyDsl.g:3725:1: ( 'BlockActivity' )
            // InternalMyDsl.g:3726:2: 'BlockActivity'
            {
             before(grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getBlockActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__1__Impl"


    // $ANTLR start "rule__BlockActivity__Group__2"
    // InternalMyDsl.g:3735:1: rule__BlockActivity__Group__2 : rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3 ;
    public final void rule__BlockActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3 )
            // InternalMyDsl.g:3740:2: rule__BlockActivity__Group__2__Impl rule__BlockActivity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BlockActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__2"


    // $ANTLR start "rule__BlockActivity__Group__2__Impl"
    // InternalMyDsl.g:3747:1: rule__BlockActivity__Group__2__Impl : ( ( rule__BlockActivity__IdAssignment_2 ) ) ;
    public final void rule__BlockActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( ( ( rule__BlockActivity__IdAssignment_2 ) ) )
            // InternalMyDsl.g:3752:1: ( ( rule__BlockActivity__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:3752:1: ( ( rule__BlockActivity__IdAssignment_2 ) )
            // InternalMyDsl.g:3753:2: ( rule__BlockActivity__IdAssignment_2 )
            {
             before(grammarAccess.getBlockActivityAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:3754:2: ( rule__BlockActivity__IdAssignment_2 )
            // InternalMyDsl.g:3754:3: rule__BlockActivity__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__2__Impl"


    // $ANTLR start "rule__BlockActivity__Group__3"
    // InternalMyDsl.g:3762:1: rule__BlockActivity__Group__3 : rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4 ;
    public final void rule__BlockActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4 )
            // InternalMyDsl.g:3767:2: rule__BlockActivity__Group__3__Impl rule__BlockActivity__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__BlockActivity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__3"


    // $ANTLR start "rule__BlockActivity__Group__3__Impl"
    // InternalMyDsl.g:3774:1: rule__BlockActivity__Group__3__Impl : ( '{' ) ;
    public final void rule__BlockActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( ( '{' ) )
            // InternalMyDsl.g:3779:1: ( '{' )
            {
            // InternalMyDsl.g:3779:1: ( '{' )
            // InternalMyDsl.g:3780:2: '{'
            {
             before(grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__3__Impl"


    // $ANTLR start "rule__BlockActivity__Group__4"
    // InternalMyDsl.g:3789:1: rule__BlockActivity__Group__4 : rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5 ;
    public final void rule__BlockActivity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5 )
            // InternalMyDsl.g:3794:2: rule__BlockActivity__Group__4__Impl rule__BlockActivity__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__BlockActivity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__4"


    // $ANTLR start "rule__BlockActivity__Group__4__Impl"
    // InternalMyDsl.g:3801:1: rule__BlockActivity__Group__4__Impl : ( ( rule__BlockActivity__Group_4__0 )? ) ;
    public final void rule__BlockActivity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( ( ( rule__BlockActivity__Group_4__0 )? ) )
            // InternalMyDsl.g:3806:1: ( ( rule__BlockActivity__Group_4__0 )? )
            {
            // InternalMyDsl.g:3806:1: ( ( rule__BlockActivity__Group_4__0 )? )
            // InternalMyDsl.g:3807:2: ( rule__BlockActivity__Group_4__0 )?
            {
             before(grammarAccess.getBlockActivityAccess().getGroup_4()); 
            // InternalMyDsl.g:3808:2: ( rule__BlockActivity__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3808:3: rule__BlockActivity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BlockActivity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockActivityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__4__Impl"


    // $ANTLR start "rule__BlockActivity__Group__5"
    // InternalMyDsl.g:3816:1: rule__BlockActivity__Group__5 : rule__BlockActivity__Group__5__Impl ;
    public final void rule__BlockActivity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( rule__BlockActivity__Group__5__Impl )
            // InternalMyDsl.g:3821:2: rule__BlockActivity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__5"


    // $ANTLR start "rule__BlockActivity__Group__5__Impl"
    // InternalMyDsl.g:3827:1: rule__BlockActivity__Group__5__Impl : ( '}' ) ;
    public final void rule__BlockActivity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3831:1: ( ( '}' ) )
            // InternalMyDsl.g:3832:1: ( '}' )
            {
            // InternalMyDsl.g:3832:1: ( '}' )
            // InternalMyDsl.g:3833:2: '}'
            {
             before(grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group__5__Impl"


    // $ANTLR start "rule__BlockActivity__Group_4__0"
    // InternalMyDsl.g:3843:1: rule__BlockActivity__Group_4__0 : rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1 ;
    public final void rule__BlockActivity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1 )
            // InternalMyDsl.g:3848:2: rule__BlockActivity__Group_4__0__Impl rule__BlockActivity__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__BlockActivity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__0"


    // $ANTLR start "rule__BlockActivity__Group_4__0__Impl"
    // InternalMyDsl.g:3855:1: rule__BlockActivity__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__BlockActivity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( ( 'title' ) )
            // InternalMyDsl.g:3860:1: ( 'title' )
            {
            // InternalMyDsl.g:3860:1: ( 'title' )
            // InternalMyDsl.g:3861:2: 'title'
            {
             before(grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBlockActivityAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__0__Impl"


    // $ANTLR start "rule__BlockActivity__Group_4__1"
    // InternalMyDsl.g:3870:1: rule__BlockActivity__Group_4__1 : rule__BlockActivity__Group_4__1__Impl ;
    public final void rule__BlockActivity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( rule__BlockActivity__Group_4__1__Impl )
            // InternalMyDsl.g:3875:2: rule__BlockActivity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__1"


    // $ANTLR start "rule__BlockActivity__Group_4__1__Impl"
    // InternalMyDsl.g:3881:1: rule__BlockActivity__Group_4__1__Impl : ( ( rule__BlockActivity__TitleAssignment_4_1 ) ) ;
    public final void rule__BlockActivity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( ( ( rule__BlockActivity__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:3886:1: ( ( rule__BlockActivity__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3886:1: ( ( rule__BlockActivity__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:3887:2: ( rule__BlockActivity__TitleAssignment_4_1 )
            {
             before(grammarAccess.getBlockActivityAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:3888:2: ( rule__BlockActivity__TitleAssignment_4_1 )
            // InternalMyDsl.g:3888:3: rule__BlockActivity__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BlockActivity__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockActivityAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalMyDsl.g:3897:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:3902:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalMyDsl.g:3909:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3913:1: ( ( () ) )
            // InternalMyDsl.g:3914:1: ( () )
            {
            // InternalMyDsl.g:3914:1: ( () )
            // InternalMyDsl.g:3915:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:3916:2: ()
            // InternalMyDsl.g:3916:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalMyDsl.g:3924:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:3929:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalMyDsl.g:3936:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( 'Event' ) )
            // InternalMyDsl.g:3941:1: ( 'Event' )
            {
            // InternalMyDsl.g:3941:1: ( 'Event' )
            // InternalMyDsl.g:3942:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalMyDsl.g:3951:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:3956:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalMyDsl.g:3963:1: rule__Event__Group__2__Impl : ( ( rule__Event__IdAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( ( ( rule__Event__IdAssignment_2 ) ) )
            // InternalMyDsl.g:3968:1: ( ( rule__Event__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:3968:1: ( ( rule__Event__IdAssignment_2 ) )
            // InternalMyDsl.g:3969:2: ( rule__Event__IdAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:3970:2: ( rule__Event__IdAssignment_2 )
            // InternalMyDsl.g:3970:3: rule__Event__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalMyDsl.g:3978:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:3983:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalMyDsl.g:3990:1: rule__Event__Group__3__Impl : ( '{' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3994:1: ( ( '{' ) )
            // InternalMyDsl.g:3995:1: ( '{' )
            {
            // InternalMyDsl.g:3995:1: ( '{' )
            // InternalMyDsl.g:3996:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalMyDsl.g:4005:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4009:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalMyDsl.g:4010:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalMyDsl.g:4017:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:4022:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:4022:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:4023:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:4024:2: ( rule__Event__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4024:3: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalMyDsl.g:4032:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalMyDsl.g:4037:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalMyDsl.g:4044:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // InternalMyDsl.g:4049:1: ( ( rule__Event__Group_5__0 )? )
            {
            // InternalMyDsl.g:4049:1: ( ( rule__Event__Group_5__0 )? )
            // InternalMyDsl.g:4050:2: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // InternalMyDsl.g:4051:2: ( rule__Event__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4051:3: rule__Event__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // InternalMyDsl.g:4059:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // InternalMyDsl.g:4064:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // InternalMyDsl.g:4071:1: rule__Event__Group__6__Impl : ( ( rule__Event__Group_6__0 )? ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( ( ( rule__Event__Group_6__0 )? ) )
            // InternalMyDsl.g:4076:1: ( ( rule__Event__Group_6__0 )? )
            {
            // InternalMyDsl.g:4076:1: ( ( rule__Event__Group_6__0 )? )
            // InternalMyDsl.g:4077:2: ( rule__Event__Group_6__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_6()); 
            // InternalMyDsl.g:4078:2: ( rule__Event__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4078:3: rule__Event__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // InternalMyDsl.g:4086:1: rule__Event__Group__7 : rule__Event__Group__7__Impl ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( rule__Event__Group__7__Impl )
            // InternalMyDsl.g:4091:2: rule__Event__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // InternalMyDsl.g:4097:1: rule__Event__Group__7__Impl : ( '}' ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4101:1: ( ( '}' ) )
            // InternalMyDsl.g:4102:1: ( '}' )
            {
            // InternalMyDsl.g:4102:1: ( '}' )
            // InternalMyDsl.g:4103:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalMyDsl.g:4113:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:4118:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalMyDsl.g:4125:1: rule__Event__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( ( 'title' ) )
            // InternalMyDsl.g:4130:1: ( 'title' )
            {
            // InternalMyDsl.g:4130:1: ( 'title' )
            // InternalMyDsl.g:4131:2: 'title'
            {
             before(grammarAccess.getEventAccess().getTitleKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalMyDsl.g:4140:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( rule__Event__Group_4__1__Impl )
            // InternalMyDsl.g:4145:2: rule__Event__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalMyDsl.g:4151:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__TitleAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4155:1: ( ( ( rule__Event__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4156:1: ( ( rule__Event__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4156:1: ( ( rule__Event__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4157:2: ( rule__Event__TitleAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4158:2: ( rule__Event__TitleAssignment_4_1 )
            // InternalMyDsl.g:4158:3: rule__Event__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group_5__0"
    // InternalMyDsl.g:4167:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // InternalMyDsl.g:4172:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0"


    // $ANTLR start "rule__Event__Group_5__0__Impl"
    // InternalMyDsl.g:4179:1: rule__Event__Group_5__0__Impl : ( 'time' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( ( 'time' ) )
            // InternalMyDsl.g:4184:1: ( 'time' )
            {
            // InternalMyDsl.g:4184:1: ( 'time' )
            // InternalMyDsl.g:4185:2: 'time'
            {
             before(grammarAccess.getEventAccess().getTimeKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTimeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0__Impl"


    // $ANTLR start "rule__Event__Group_5__1"
    // InternalMyDsl.g:4194:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4198:1: ( rule__Event__Group_5__1__Impl )
            // InternalMyDsl.g:4199:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1"


    // $ANTLR start "rule__Event__Group_5__1__Impl"
    // InternalMyDsl.g:4205:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__TimeAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4209:1: ( ( ( rule__Event__TimeAssignment_5_1 ) ) )
            // InternalMyDsl.g:4210:1: ( ( rule__Event__TimeAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4210:1: ( ( rule__Event__TimeAssignment_5_1 ) )
            // InternalMyDsl.g:4211:2: ( rule__Event__TimeAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getTimeAssignment_5_1()); 
            // InternalMyDsl.g:4212:2: ( rule__Event__TimeAssignment_5_1 )
            // InternalMyDsl.g:4212:3: rule__Event__TimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTimeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1__Impl"


    // $ANTLR start "rule__Event__Group_6__0"
    // InternalMyDsl.g:4221:1: rule__Event__Group_6__0 : rule__Event__Group_6__0__Impl rule__Event__Group_6__1 ;
    public final void rule__Event__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( rule__Event__Group_6__0__Impl rule__Event__Group_6__1 )
            // InternalMyDsl.g:4226:2: rule__Event__Group_6__0__Impl rule__Event__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__Event__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0"


    // $ANTLR start "rule__Event__Group_6__0__Impl"
    // InternalMyDsl.g:4233:1: rule__Event__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Event__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( ( 'type' ) )
            // InternalMyDsl.g:4238:1: ( 'type' )
            {
            // InternalMyDsl.g:4238:1: ( 'type' )
            // InternalMyDsl.g:4239:2: 'type'
            {
             before(grammarAccess.getEventAccess().getTypeKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__0__Impl"


    // $ANTLR start "rule__Event__Group_6__1"
    // InternalMyDsl.g:4248:1: rule__Event__Group_6__1 : rule__Event__Group_6__1__Impl ;
    public final void rule__Event__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4252:1: ( rule__Event__Group_6__1__Impl )
            // InternalMyDsl.g:4253:2: rule__Event__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1"


    // $ANTLR start "rule__Event__Group_6__1__Impl"
    // InternalMyDsl.g:4259:1: rule__Event__Group_6__1__Impl : ( ( rule__Event__TypeAssignment_6_1 ) ) ;
    public final void rule__Event__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4263:1: ( ( ( rule__Event__TypeAssignment_6_1 ) ) )
            // InternalMyDsl.g:4264:1: ( ( rule__Event__TypeAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4264:1: ( ( rule__Event__TypeAssignment_6_1 ) )
            // InternalMyDsl.g:4265:2: ( rule__Event__TypeAssignment_6_1 )
            {
             before(grammarAccess.getEventAccess().getTypeAssignment_6_1()); 
            // InternalMyDsl.g:4266:2: ( rule__Event__TypeAssignment_6_1 )
            // InternalMyDsl.g:4266:3: rule__Event__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_6__1__Impl"


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalMyDsl.g:4275:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalMyDsl.g:4280:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Gateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0"


    // $ANTLR start "rule__Gateway__Group__0__Impl"
    // InternalMyDsl.g:4287:1: rule__Gateway__Group__0__Impl : ( () ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( ( () ) )
            // InternalMyDsl.g:4292:1: ( () )
            {
            // InternalMyDsl.g:4292:1: ( () )
            // InternalMyDsl.g:4293:2: ()
            {
             before(grammarAccess.getGatewayAccess().getGatewayAction_0()); 
            // InternalMyDsl.g:4294:2: ()
            // InternalMyDsl.g:4294:3: 
            {
            }

             after(grammarAccess.getGatewayAccess().getGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0__Impl"


    // $ANTLR start "rule__Gateway__Group__1"
    // InternalMyDsl.g:4302:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalMyDsl.g:4307:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Gateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1"


    // $ANTLR start "rule__Gateway__Group__1__Impl"
    // InternalMyDsl.g:4314:1: rule__Gateway__Group__1__Impl : ( 'Gateway' ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( ( 'Gateway' ) )
            // InternalMyDsl.g:4319:1: ( 'Gateway' )
            {
            // InternalMyDsl.g:4319:1: ( 'Gateway' )
            // InternalMyDsl.g:4320:2: 'Gateway'
            {
             before(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__1__Impl"


    // $ANTLR start "rule__Gateway__Group__2"
    // InternalMyDsl.g:4329:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl rule__Gateway__Group__3 ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( rule__Gateway__Group__2__Impl rule__Gateway__Group__3 )
            // InternalMyDsl.g:4334:2: rule__Gateway__Group__2__Impl rule__Gateway__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Gateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2"


    // $ANTLR start "rule__Gateway__Group__2__Impl"
    // InternalMyDsl.g:4341:1: rule__Gateway__Group__2__Impl : ( ( rule__Gateway__IdAssignment_2 ) ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( ( ( rule__Gateway__IdAssignment_2 ) ) )
            // InternalMyDsl.g:4346:1: ( ( rule__Gateway__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:4346:1: ( ( rule__Gateway__IdAssignment_2 ) )
            // InternalMyDsl.g:4347:2: ( rule__Gateway__IdAssignment_2 )
            {
             before(grammarAccess.getGatewayAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:4348:2: ( rule__Gateway__IdAssignment_2 )
            // InternalMyDsl.g:4348:3: rule__Gateway__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__2__Impl"


    // $ANTLR start "rule__Gateway__Group__3"
    // InternalMyDsl.g:4356:1: rule__Gateway__Group__3 : rule__Gateway__Group__3__Impl rule__Gateway__Group__4 ;
    public final void rule__Gateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4360:1: ( rule__Gateway__Group__3__Impl rule__Gateway__Group__4 )
            // InternalMyDsl.g:4361:2: rule__Gateway__Group__3__Impl rule__Gateway__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Gateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3"


    // $ANTLR start "rule__Gateway__Group__3__Impl"
    // InternalMyDsl.g:4368:1: rule__Gateway__Group__3__Impl : ( '{' ) ;
    public final void rule__Gateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( ( '{' ) )
            // InternalMyDsl.g:4373:1: ( '{' )
            {
            // InternalMyDsl.g:4373:1: ( '{' )
            // InternalMyDsl.g:4374:2: '{'
            {
             before(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__3__Impl"


    // $ANTLR start "rule__Gateway__Group__4"
    // InternalMyDsl.g:4383:1: rule__Gateway__Group__4 : rule__Gateway__Group__4__Impl rule__Gateway__Group__5 ;
    public final void rule__Gateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4387:1: ( rule__Gateway__Group__4__Impl rule__Gateway__Group__5 )
            // InternalMyDsl.g:4388:2: rule__Gateway__Group__4__Impl rule__Gateway__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Gateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4"


    // $ANTLR start "rule__Gateway__Group__4__Impl"
    // InternalMyDsl.g:4395:1: rule__Gateway__Group__4__Impl : ( ( rule__Gateway__Group_4__0 )? ) ;
    public final void rule__Gateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( ( ( rule__Gateway__Group_4__0 )? ) )
            // InternalMyDsl.g:4400:1: ( ( rule__Gateway__Group_4__0 )? )
            {
            // InternalMyDsl.g:4400:1: ( ( rule__Gateway__Group_4__0 )? )
            // InternalMyDsl.g:4401:2: ( rule__Gateway__Group_4__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_4()); 
            // InternalMyDsl.g:4402:2: ( rule__Gateway__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:4402:3: rule__Gateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__4__Impl"


    // $ANTLR start "rule__Gateway__Group__5"
    // InternalMyDsl.g:4410:1: rule__Gateway__Group__5 : rule__Gateway__Group__5__Impl rule__Gateway__Group__6 ;
    public final void rule__Gateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4414:1: ( rule__Gateway__Group__5__Impl rule__Gateway__Group__6 )
            // InternalMyDsl.g:4415:2: rule__Gateway__Group__5__Impl rule__Gateway__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Gateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5"


    // $ANTLR start "rule__Gateway__Group__5__Impl"
    // InternalMyDsl.g:4422:1: rule__Gateway__Group__5__Impl : ( ( rule__Gateway__Group_5__0 )? ) ;
    public final void rule__Gateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( ( ( rule__Gateway__Group_5__0 )? ) )
            // InternalMyDsl.g:4427:1: ( ( rule__Gateway__Group_5__0 )? )
            {
            // InternalMyDsl.g:4427:1: ( ( rule__Gateway__Group_5__0 )? )
            // InternalMyDsl.g:4428:2: ( rule__Gateway__Group_5__0 )?
            {
             before(grammarAccess.getGatewayAccess().getGroup_5()); 
            // InternalMyDsl.g:4429:2: ( rule__Gateway__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4429:3: rule__Gateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__5__Impl"


    // $ANTLR start "rule__Gateway__Group__6"
    // InternalMyDsl.g:4437:1: rule__Gateway__Group__6 : rule__Gateway__Group__6__Impl ;
    public final void rule__Gateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4441:1: ( rule__Gateway__Group__6__Impl )
            // InternalMyDsl.g:4442:2: rule__Gateway__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6"


    // $ANTLR start "rule__Gateway__Group__6__Impl"
    // InternalMyDsl.g:4448:1: rule__Gateway__Group__6__Impl : ( '}' ) ;
    public final void rule__Gateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4452:1: ( ( '}' ) )
            // InternalMyDsl.g:4453:1: ( '}' )
            {
            // InternalMyDsl.g:4453:1: ( '}' )
            // InternalMyDsl.g:4454:2: '}'
            {
             before(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__6__Impl"


    // $ANTLR start "rule__Gateway__Group_4__0"
    // InternalMyDsl.g:4464:1: rule__Gateway__Group_4__0 : rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1 ;
    public final void rule__Gateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1 )
            // InternalMyDsl.g:4469:2: rule__Gateway__Group_4__0__Impl rule__Gateway__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Gateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__0"


    // $ANTLR start "rule__Gateway__Group_4__0__Impl"
    // InternalMyDsl.g:4476:1: rule__Gateway__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__Gateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( ( 'title' ) )
            // InternalMyDsl.g:4481:1: ( 'title' )
            {
            // InternalMyDsl.g:4481:1: ( 'title' )
            // InternalMyDsl.g:4482:2: 'title'
            {
             before(grammarAccess.getGatewayAccess().getTitleKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__0__Impl"


    // $ANTLR start "rule__Gateway__Group_4__1"
    // InternalMyDsl.g:4491:1: rule__Gateway__Group_4__1 : rule__Gateway__Group_4__1__Impl ;
    public final void rule__Gateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( rule__Gateway__Group_4__1__Impl )
            // InternalMyDsl.g:4496:2: rule__Gateway__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__1"


    // $ANTLR start "rule__Gateway__Group_4__1__Impl"
    // InternalMyDsl.g:4502:1: rule__Gateway__Group_4__1__Impl : ( ( rule__Gateway__TitleAssignment_4_1 ) ) ;
    public final void rule__Gateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4506:1: ( ( ( rule__Gateway__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4507:1: ( ( rule__Gateway__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4507:1: ( ( rule__Gateway__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4508:2: ( rule__Gateway__TitleAssignment_4_1 )
            {
             before(grammarAccess.getGatewayAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4509:2: ( rule__Gateway__TitleAssignment_4_1 )
            // InternalMyDsl.g:4509:3: rule__Gateway__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_4__1__Impl"


    // $ANTLR start "rule__Gateway__Group_5__0"
    // InternalMyDsl.g:4518:1: rule__Gateway__Group_5__0 : rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 ;
    public final void rule__Gateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1 )
            // InternalMyDsl.g:4523:2: rule__Gateway__Group_5__0__Impl rule__Gateway__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__Gateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0"


    // $ANTLR start "rule__Gateway__Group_5__0__Impl"
    // InternalMyDsl.g:4530:1: rule__Gateway__Group_5__0__Impl : ( 'rule' ) ;
    public final void rule__Gateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4534:1: ( ( 'rule' ) )
            // InternalMyDsl.g:4535:1: ( 'rule' )
            {
            // InternalMyDsl.g:4535:1: ( 'rule' )
            // InternalMyDsl.g:4536:2: 'rule'
            {
             before(grammarAccess.getGatewayAccess().getRuleKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getGatewayAccess().getRuleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__0__Impl"


    // $ANTLR start "rule__Gateway__Group_5__1"
    // InternalMyDsl.g:4545:1: rule__Gateway__Group_5__1 : rule__Gateway__Group_5__1__Impl ;
    public final void rule__Gateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( rule__Gateway__Group_5__1__Impl )
            // InternalMyDsl.g:4550:2: rule__Gateway__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1"


    // $ANTLR start "rule__Gateway__Group_5__1__Impl"
    // InternalMyDsl.g:4556:1: rule__Gateway__Group_5__1__Impl : ( ( rule__Gateway__RuleAssignment_5_1 ) ) ;
    public final void rule__Gateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4560:1: ( ( ( rule__Gateway__RuleAssignment_5_1 ) ) )
            // InternalMyDsl.g:4561:1: ( ( rule__Gateway__RuleAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4561:1: ( ( rule__Gateway__RuleAssignment_5_1 ) )
            // InternalMyDsl.g:4562:2: ( rule__Gateway__RuleAssignment_5_1 )
            {
             before(grammarAccess.getGatewayAccess().getRuleAssignment_5_1()); 
            // InternalMyDsl.g:4563:2: ( rule__Gateway__RuleAssignment_5_1 )
            // InternalMyDsl.g:4563:3: rule__Gateway__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__RuleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGatewayAccess().getRuleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group_5__1__Impl"


    // $ANTLR start "rule__SubFlow__Group__0"
    // InternalMyDsl.g:4572:1: rule__SubFlow__Group__0 : rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1 ;
    public final void rule__SubFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1 )
            // InternalMyDsl.g:4577:2: rule__SubFlow__Group__0__Impl rule__SubFlow__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SubFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__0"


    // $ANTLR start "rule__SubFlow__Group__0__Impl"
    // InternalMyDsl.g:4584:1: rule__SubFlow__Group__0__Impl : ( () ) ;
    public final void rule__SubFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( () ) )
            // InternalMyDsl.g:4589:1: ( () )
            {
            // InternalMyDsl.g:4589:1: ( () )
            // InternalMyDsl.g:4590:2: ()
            {
             before(grammarAccess.getSubFlowAccess().getSubFlowAction_0()); 
            // InternalMyDsl.g:4591:2: ()
            // InternalMyDsl.g:4591:3: 
            {
            }

             after(grammarAccess.getSubFlowAccess().getSubFlowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__0__Impl"


    // $ANTLR start "rule__SubFlow__Group__1"
    // InternalMyDsl.g:4599:1: rule__SubFlow__Group__1 : rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2 ;
    public final void rule__SubFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2 )
            // InternalMyDsl.g:4604:2: rule__SubFlow__Group__1__Impl rule__SubFlow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SubFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__1"


    // $ANTLR start "rule__SubFlow__Group__1__Impl"
    // InternalMyDsl.g:4611:1: rule__SubFlow__Group__1__Impl : ( 'SubFlow' ) ;
    public final void rule__SubFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4615:1: ( ( 'SubFlow' ) )
            // InternalMyDsl.g:4616:1: ( 'SubFlow' )
            {
            // InternalMyDsl.g:4616:1: ( 'SubFlow' )
            // InternalMyDsl.g:4617:2: 'SubFlow'
            {
             before(grammarAccess.getSubFlowAccess().getSubFlowKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getSubFlowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__1__Impl"


    // $ANTLR start "rule__SubFlow__Group__2"
    // InternalMyDsl.g:4626:1: rule__SubFlow__Group__2 : rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3 ;
    public final void rule__SubFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3 )
            // InternalMyDsl.g:4631:2: rule__SubFlow__Group__2__Impl rule__SubFlow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__2"


    // $ANTLR start "rule__SubFlow__Group__2__Impl"
    // InternalMyDsl.g:4638:1: rule__SubFlow__Group__2__Impl : ( ( rule__SubFlow__IdAssignment_2 ) ) ;
    public final void rule__SubFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4642:1: ( ( ( rule__SubFlow__IdAssignment_2 ) ) )
            // InternalMyDsl.g:4643:1: ( ( rule__SubFlow__IdAssignment_2 ) )
            {
            // InternalMyDsl.g:4643:1: ( ( rule__SubFlow__IdAssignment_2 ) )
            // InternalMyDsl.g:4644:2: ( rule__SubFlow__IdAssignment_2 )
            {
             before(grammarAccess.getSubFlowAccess().getIdAssignment_2()); 
            // InternalMyDsl.g:4645:2: ( rule__SubFlow__IdAssignment_2 )
            // InternalMyDsl.g:4645:3: rule__SubFlow__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__2__Impl"


    // $ANTLR start "rule__SubFlow__Group__3"
    // InternalMyDsl.g:4653:1: rule__SubFlow__Group__3 : rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4 ;
    public final void rule__SubFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4657:1: ( rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4 )
            // InternalMyDsl.g:4658:2: rule__SubFlow__Group__3__Impl rule__SubFlow__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__SubFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__3"


    // $ANTLR start "rule__SubFlow__Group__3__Impl"
    // InternalMyDsl.g:4665:1: rule__SubFlow__Group__3__Impl : ( '{' ) ;
    public final void rule__SubFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4669:1: ( ( '{' ) )
            // InternalMyDsl.g:4670:1: ( '{' )
            {
            // InternalMyDsl.g:4670:1: ( '{' )
            // InternalMyDsl.g:4671:2: '{'
            {
             before(grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__3__Impl"


    // $ANTLR start "rule__SubFlow__Group__4"
    // InternalMyDsl.g:4680:1: rule__SubFlow__Group__4 : rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5 ;
    public final void rule__SubFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5 )
            // InternalMyDsl.g:4685:2: rule__SubFlow__Group__4__Impl rule__SubFlow__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__SubFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__4"


    // $ANTLR start "rule__SubFlow__Group__4__Impl"
    // InternalMyDsl.g:4692:1: rule__SubFlow__Group__4__Impl : ( ( rule__SubFlow__Group_4__0 )? ) ;
    public final void rule__SubFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( ( ( rule__SubFlow__Group_4__0 )? ) )
            // InternalMyDsl.g:4697:1: ( ( rule__SubFlow__Group_4__0 )? )
            {
            // InternalMyDsl.g:4697:1: ( ( rule__SubFlow__Group_4__0 )? )
            // InternalMyDsl.g:4698:2: ( rule__SubFlow__Group_4__0 )?
            {
             before(grammarAccess.getSubFlowAccess().getGroup_4()); 
            // InternalMyDsl.g:4699:2: ( rule__SubFlow__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4699:3: rule__SubFlow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFlow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFlowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__4__Impl"


    // $ANTLR start "rule__SubFlow__Group__5"
    // InternalMyDsl.g:4707:1: rule__SubFlow__Group__5 : rule__SubFlow__Group__5__Impl ;
    public final void rule__SubFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4711:1: ( rule__SubFlow__Group__5__Impl )
            // InternalMyDsl.g:4712:2: rule__SubFlow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__5"


    // $ANTLR start "rule__SubFlow__Group__5__Impl"
    // InternalMyDsl.g:4718:1: rule__SubFlow__Group__5__Impl : ( '}' ) ;
    public final void rule__SubFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4722:1: ( ( '}' ) )
            // InternalMyDsl.g:4723:1: ( '}' )
            {
            // InternalMyDsl.g:4723:1: ( '}' )
            // InternalMyDsl.g:4724:2: '}'
            {
             before(grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group__5__Impl"


    // $ANTLR start "rule__SubFlow__Group_4__0"
    // InternalMyDsl.g:4734:1: rule__SubFlow__Group_4__0 : rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1 ;
    public final void rule__SubFlow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1 )
            // InternalMyDsl.g:4739:2: rule__SubFlow__Group_4__0__Impl rule__SubFlow__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SubFlow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFlow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__0"


    // $ANTLR start "rule__SubFlow__Group_4__0__Impl"
    // InternalMyDsl.g:4746:1: rule__SubFlow__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__SubFlow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( 'title' ) )
            // InternalMyDsl.g:4751:1: ( 'title' )
            {
            // InternalMyDsl.g:4751:1: ( 'title' )
            // InternalMyDsl.g:4752:2: 'title'
            {
             before(grammarAccess.getSubFlowAccess().getTitleKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSubFlowAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__0__Impl"


    // $ANTLR start "rule__SubFlow__Group_4__1"
    // InternalMyDsl.g:4761:1: rule__SubFlow__Group_4__1 : rule__SubFlow__Group_4__1__Impl ;
    public final void rule__SubFlow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( rule__SubFlow__Group_4__1__Impl )
            // InternalMyDsl.g:4766:2: rule__SubFlow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__1"


    // $ANTLR start "rule__SubFlow__Group_4__1__Impl"
    // InternalMyDsl.g:4772:1: rule__SubFlow__Group_4__1__Impl : ( ( rule__SubFlow__TitleAssignment_4_1 ) ) ;
    public final void rule__SubFlow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4776:1: ( ( ( rule__SubFlow__TitleAssignment_4_1 ) ) )
            // InternalMyDsl.g:4777:1: ( ( rule__SubFlow__TitleAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4777:1: ( ( rule__SubFlow__TitleAssignment_4_1 ) )
            // InternalMyDsl.g:4778:2: ( rule__SubFlow__TitleAssignment_4_1 )
            {
             before(grammarAccess.getSubFlowAccess().getTitleAssignment_4_1()); 
            // InternalMyDsl.g:4779:2: ( rule__SubFlow__TitleAssignment_4_1 )
            // InternalMyDsl.g:4779:3: rule__SubFlow__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SubFlow__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFlowAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__Group_4__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyDsl.g:4788:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyDsl.g:4793:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyDsl.g:4800:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4804:1: ( ( 'Transition' ) )
            // InternalMyDsl.g:4805:1: ( 'Transition' )
            {
            // InternalMyDsl.g:4805:1: ( 'Transition' )
            // InternalMyDsl.g:4806:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyDsl.g:4815:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyDsl.g:4820:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyDsl.g:4827:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4831:1: ( ( '{' ) )
            // InternalMyDsl.g:4832:1: ( '{' )
            {
            // InternalMyDsl.g:4832:1: ( '{' )
            // InternalMyDsl.g:4833:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyDsl.g:4842:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4846:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMyDsl.g:4847:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyDsl.g:4854:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMyDsl.g:4859:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMyDsl.g:4859:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMyDsl.g:4860:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMyDsl.g:4861:2: ( rule__Transition__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4861:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMyDsl.g:4869:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMyDsl.g:4874:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMyDsl.g:4881:1: rule__Transition__Group__3__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( ( 'source' ) )
            // InternalMyDsl.g:4886:1: ( 'source' )
            {
            // InternalMyDsl.g:4886:1: ( 'source' )
            // InternalMyDsl.g:4887:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMyDsl.g:4896:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalMyDsl.g:4901:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMyDsl.g:4908:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__SourceAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4912:1: ( ( ( rule__Transition__SourceAssignment_4 ) ) )
            // InternalMyDsl.g:4913:1: ( ( rule__Transition__SourceAssignment_4 ) )
            {
            // InternalMyDsl.g:4913:1: ( ( rule__Transition__SourceAssignment_4 ) )
            // InternalMyDsl.g:4914:2: ( rule__Transition__SourceAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_4()); 
            // InternalMyDsl.g:4915:2: ( rule__Transition__SourceAssignment_4 )
            // InternalMyDsl.g:4915:3: rule__Transition__SourceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalMyDsl.g:4923:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4927:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalMyDsl.g:4928:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalMyDsl.g:4935:1: rule__Transition__Group__5__Impl : ( 'target' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4939:1: ( ( 'target' ) )
            // InternalMyDsl.g:4940:1: ( 'target' )
            {
            // InternalMyDsl.g:4940:1: ( 'target' )
            // InternalMyDsl.g:4941:2: 'target'
            {
             before(grammarAccess.getTransitionAccess().getTargetKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalMyDsl.g:4950:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4954:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalMyDsl.g:4955:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalMyDsl.g:4962:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__TargetAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( ( ( rule__Transition__TargetAssignment_6 ) ) )
            // InternalMyDsl.g:4967:1: ( ( rule__Transition__TargetAssignment_6 ) )
            {
            // InternalMyDsl.g:4967:1: ( ( rule__Transition__TargetAssignment_6 ) )
            // InternalMyDsl.g:4968:2: ( rule__Transition__TargetAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_6()); 
            // InternalMyDsl.g:4969:2: ( rule__Transition__TargetAssignment_6 )
            // InternalMyDsl.g:4969:3: rule__Transition__TargetAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalMyDsl.g:4977:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( rule__Transition__Group__7__Impl )
            // InternalMyDsl.g:4982:2: rule__Transition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalMyDsl.g:4988:1: rule__Transition__Group__7__Impl : ( '}' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4992:1: ( ( '}' ) )
            // InternalMyDsl.g:4993:1: ( '}' )
            {
            // InternalMyDsl.g:4993:1: ( '}' )
            // InternalMyDsl.g:4994:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalMyDsl.g:5004:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMyDsl.g:5009:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalMyDsl.g:5016:1: rule__Transition__Group_2__0__Impl : ( 'condition' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( ( 'condition' ) )
            // InternalMyDsl.g:5021:1: ( 'condition' )
            {
            // InternalMyDsl.g:5021:1: ( 'condition' )
            // InternalMyDsl.g:5022:2: 'condition'
            {
             before(grammarAccess.getTransitionAccess().getConditionKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getConditionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalMyDsl.g:5031:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5035:1: ( rule__Transition__Group_2__1__Impl )
            // InternalMyDsl.g:5036:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalMyDsl.g:5042:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ConditionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( ( ( rule__Transition__ConditionAssignment_2_1 ) ) )
            // InternalMyDsl.g:5047:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            {
            // InternalMyDsl.g:5047:1: ( ( rule__Transition__ConditionAssignment_2_1 ) )
            // InternalMyDsl.g:5048:2: ( rule__Transition__ConditionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 
            // InternalMyDsl.g:5049:2: ( rule__Transition__ConditionAssignment_2_1 )
            // InternalMyDsl.g:5049:3: rule__Transition__ConditionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__XpdlRoot__IdAssignment_2"
    // InternalMyDsl.g:5058:1: rule__XpdlRoot__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__XpdlRoot__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5062:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5063:2: ( ruleEString )
            {
            // InternalMyDsl.g:5063:2: ( ruleEString )
            // InternalMyDsl.g:5064:3: ruleEString
            {
             before(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__IdAssignment_2"


    // $ANTLR start "rule__XpdlRoot__DiagramNameAssignment_4_1"
    // InternalMyDsl.g:5073:1: rule__XpdlRoot__DiagramNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__XpdlRoot__DiagramNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5077:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5078:2: ( ruleEString )
            {
            // InternalMyDsl.g:5078:2: ( ruleEString )
            // InternalMyDsl.g:5079:3: ruleEString
            {
             before(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getDiagramNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__DiagramNameAssignment_4_1"


    // $ANTLR start "rule__XpdlRoot__PoolsAssignment_5_2"
    // InternalMyDsl.g:5088:1: rule__XpdlRoot__PoolsAssignment_5_2 : ( rulePool ) ;
    public final void rule__XpdlRoot__PoolsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5092:1: ( ( rulePool ) )
            // InternalMyDsl.g:5093:2: ( rulePool )
            {
            // InternalMyDsl.g:5093:2: ( rulePool )
            // InternalMyDsl.g:5094:3: rulePool
            {
             before(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePool();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__PoolsAssignment_5_2"


    // $ANTLR start "rule__XpdlRoot__PoolsAssignment_5_3_1"
    // InternalMyDsl.g:5103:1: rule__XpdlRoot__PoolsAssignment_5_3_1 : ( rulePool ) ;
    public final void rule__XpdlRoot__PoolsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5107:1: ( ( rulePool ) )
            // InternalMyDsl.g:5108:2: ( rulePool )
            {
            // InternalMyDsl.g:5108:2: ( rulePool )
            // InternalMyDsl.g:5109:3: rulePool
            {
             before(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePool();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getPoolsPoolParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__PoolsAssignment_5_3_1"


    // $ANTLR start "rule__XpdlRoot__ProcessAssignment_6_2"
    // InternalMyDsl.g:5118:1: rule__XpdlRoot__ProcessAssignment_6_2 : ( ruleProcess ) ;
    public final void rule__XpdlRoot__ProcessAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5122:1: ( ( ruleProcess ) )
            // InternalMyDsl.g:5123:2: ( ruleProcess )
            {
            // InternalMyDsl.g:5123:2: ( ruleProcess )
            // InternalMyDsl.g:5124:3: ruleProcess
            {
             before(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ProcessAssignment_6_2"


    // $ANTLR start "rule__XpdlRoot__ProcessAssignment_6_3_1"
    // InternalMyDsl.g:5133:1: rule__XpdlRoot__ProcessAssignment_6_3_1 : ( ruleProcess ) ;
    public final void rule__XpdlRoot__ProcessAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5137:1: ( ( ruleProcess ) )
            // InternalMyDsl.g:5138:2: ( ruleProcess )
            {
            // InternalMyDsl.g:5138:2: ( ruleProcess )
            // InternalMyDsl.g:5139:3: ruleProcess
            {
             before(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getProcessProcessParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__ProcessAssignment_6_3_1"


    // $ANTLR start "rule__XpdlRoot__MessageflowsAssignment_7_2"
    // InternalMyDsl.g:5148:1: rule__XpdlRoot__MessageflowsAssignment_7_2 : ( ruleMessageFlow ) ;
    public final void rule__XpdlRoot__MessageflowsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5152:1: ( ( ruleMessageFlow ) )
            // InternalMyDsl.g:5153:2: ( ruleMessageFlow )
            {
            // InternalMyDsl.g:5153:2: ( ruleMessageFlow )
            // InternalMyDsl.g:5154:3: ruleMessageFlow
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__MessageflowsAssignment_7_2"


    // $ANTLR start "rule__XpdlRoot__MessageflowsAssignment_7_3_1"
    // InternalMyDsl.g:5163:1: rule__XpdlRoot__MessageflowsAssignment_7_3_1 : ( ruleMessageFlow ) ;
    public final void rule__XpdlRoot__MessageflowsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( ( ruleMessageFlow ) )
            // InternalMyDsl.g:5168:2: ( ruleMessageFlow )
            {
            // InternalMyDsl.g:5168:2: ( ruleMessageFlow )
            // InternalMyDsl.g:5169:3: ruleMessageFlow
            {
             before(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageFlow();

            state._fsp--;

             after(grammarAccess.getXpdlRootAccess().getMessageflowsMessageFlowParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpdlRoot__MessageflowsAssignment_7_3_1"


    // $ANTLR start "rule__Pool__IdAssignment_1"
    // InternalMyDsl.g:5178:1: rule__Pool__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Pool__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5182:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5183:2: ( ruleEString )
            {
            // InternalMyDsl.g:5183:2: ( ruleEString )
            // InternalMyDsl.g:5184:3: ruleEString
            {
             before(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__IdAssignment_1"


    // $ANTLR start "rule__Pool__NameAssignment_3_1"
    // InternalMyDsl.g:5193:1: rule__Pool__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Pool__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5197:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5198:2: ( ruleEString )
            {
            // InternalMyDsl.g:5198:2: ( ruleEString )
            // InternalMyDsl.g:5199:3: ruleEString
            {
             before(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__NameAssignment_3_1"


    // $ANTLR start "rule__Pool__LanesAssignment_6"
    // InternalMyDsl.g:5208:1: rule__Pool__LanesAssignment_6 : ( ruleLane ) ;
    public final void rule__Pool__LanesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5212:1: ( ( ruleLane ) )
            // InternalMyDsl.g:5213:2: ( ruleLane )
            {
            // InternalMyDsl.g:5213:2: ( ruleLane )
            // InternalMyDsl.g:5214:3: ruleLane
            {
             before(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__LanesAssignment_6"


    // $ANTLR start "rule__Pool__LanesAssignment_7_1"
    // InternalMyDsl.g:5223:1: rule__Pool__LanesAssignment_7_1 : ( ruleLane ) ;
    public final void rule__Pool__LanesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5227:1: ( ( ruleLane ) )
            // InternalMyDsl.g:5228:2: ( ruleLane )
            {
            // InternalMyDsl.g:5228:2: ( ruleLane )
            // InternalMyDsl.g:5229:3: ruleLane
            {
             before(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLane();

            state._fsp--;

             after(grammarAccess.getPoolAccess().getLanesLaneParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pool__LanesAssignment_7_1"


    // $ANTLR start "rule__Process__IdAssignment_1"
    // InternalMyDsl.g:5238:1: rule__Process__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5242:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5243:2: ( ruleEString )
            {
            // InternalMyDsl.g:5243:2: ( ruleEString )
            // InternalMyDsl.g:5244:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__IdAssignment_1"


    // $ANTLR start "rule__Process__NameAssignment_3_1"
    // InternalMyDsl.g:5253:1: rule__Process__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5257:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5258:2: ( ruleEString )
            {
            // InternalMyDsl.g:5258:2: ( ruleEString )
            // InternalMyDsl.g:5259:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_3_1"


    // $ANTLR start "rule__Process__PoolAssignment_5"
    // InternalMyDsl.g:5268:1: rule__Process__PoolAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Process__PoolAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5272:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5273:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5273:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5274:3: ( ruleEString )
            {
             before(grammarAccess.getProcessAccess().getPoolPoolCrossReference_5_0()); 
            // InternalMyDsl.g:5275:3: ( ruleEString )
            // InternalMyDsl.g:5276:4: ruleEString
            {
             before(grammarAccess.getProcessAccess().getPoolPoolEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getPoolPoolEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getPoolPoolCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__PoolAssignment_5"


    // $ANTLR start "rule__Process__TransitionsAssignment_6_2"
    // InternalMyDsl.g:5287:1: rule__Process__TransitionsAssignment_6_2 : ( ruleTransition ) ;
    public final void rule__Process__TransitionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5291:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:5292:2: ( ruleTransition )
            {
            // InternalMyDsl.g:5292:2: ( ruleTransition )
            // InternalMyDsl.g:5293:3: ruleTransition
            {
             before(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TransitionsAssignment_6_2"


    // $ANTLR start "rule__Process__TransitionsAssignment_6_3_1"
    // InternalMyDsl.g:5302:1: rule__Process__TransitionsAssignment_6_3_1 : ( ruleTransition ) ;
    public final void rule__Process__TransitionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5306:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:5307:2: ( ruleTransition )
            {
            // InternalMyDsl.g:5307:2: ( ruleTransition )
            // InternalMyDsl.g:5308:3: ruleTransition
            {
             before(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getTransitionsTransitionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__TransitionsAssignment_6_3_1"


    // $ANTLR start "rule__Process__ActivitysetAssignment_7_2"
    // InternalMyDsl.g:5317:1: rule__Process__ActivitysetAssignment_7_2 : ( ruleActivitySet ) ;
    public final void rule__Process__ActivitysetAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:5322:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:5322:2: ( ruleActivitySet )
            // InternalMyDsl.g:5323:3: ruleActivitySet
            {
             before(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ActivitysetAssignment_7_2"


    // $ANTLR start "rule__Process__ActivitysetAssignment_7_3_1"
    // InternalMyDsl.g:5332:1: rule__Process__ActivitysetAssignment_7_3_1 : ( ruleActivitySet ) ;
    public final void rule__Process__ActivitysetAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5336:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:5337:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:5337:2: ( ruleActivitySet )
            // InternalMyDsl.g:5338:3: ruleActivitySet
            {
             before(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getActivitysetActivitySetParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ActivitysetAssignment_7_3_1"


    // $ANTLR start "rule__MessageFlow__SourceAssignment_3_1"
    // InternalMyDsl.g:5347:1: rule__MessageFlow__SourceAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__MessageFlow__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5351:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5352:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5352:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5353:3: ( ruleEString )
            {
             before(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0()); 
            // InternalMyDsl.g:5354:3: ( ruleEString )
            // InternalMyDsl.g:5355:4: ruleEString
            {
             before(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMessageFlowAccess().getSourceMessageFlowValidCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__SourceAssignment_3_1"


    // $ANTLR start "rule__MessageFlow__TargetAssignment_4_1"
    // InternalMyDsl.g:5366:1: rule__MessageFlow__TargetAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__MessageFlow__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5370:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5371:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5371:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5372:3: ( ruleEString )
            {
             before(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0()); 
            // InternalMyDsl.g:5373:3: ( ruleEString )
            // InternalMyDsl.g:5374:4: ruleEString
            {
             before(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMessageFlowAccess().getTargetMessageFlowValidCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFlow__TargetAssignment_4_1"


    // $ANTLR start "rule__Lane__IdAssignment_2"
    // InternalMyDsl.g:5385:1: rule__Lane__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Lane__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5389:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5390:2: ( ruleEString )
            {
            // InternalMyDsl.g:5390:2: ( ruleEString )
            // InternalMyDsl.g:5391:3: ruleEString
            {
             before(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__IdAssignment_2"


    // $ANTLR start "rule__Lane__NameAssignment_4_1"
    // InternalMyDsl.g:5400:1: rule__Lane__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Lane__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5404:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5405:2: ( ruleEString )
            {
            // InternalMyDsl.g:5405:2: ( ruleEString )
            // InternalMyDsl.g:5406:3: ruleEString
            {
             before(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__NameAssignment_4_1"


    // $ANTLR start "rule__Lane__ActivitysetAssignment_5_1"
    // InternalMyDsl.g:5415:1: rule__Lane__ActivitysetAssignment_5_1 : ( ruleActivitySet ) ;
    public final void rule__Lane__ActivitysetAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5419:1: ( ( ruleActivitySet ) )
            // InternalMyDsl.g:5420:2: ( ruleActivitySet )
            {
            // InternalMyDsl.g:5420:2: ( ruleActivitySet )
            // InternalMyDsl.g:5421:3: ruleActivitySet
            {
             before(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivitySet();

            state._fsp--;

             after(grammarAccess.getLaneAccess().getActivitysetActivitySetParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lane__ActivitysetAssignment_5_1"


    // $ANTLR start "rule__ActivitySet__IdAssignment_1"
    // InternalMyDsl.g:5430:1: rule__ActivitySet__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__ActivitySet__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5434:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5435:2: ( ruleEString )
            {
            // InternalMyDsl.g:5435:2: ( ruleEString )
            // InternalMyDsl.g:5436:3: ruleEString
            {
             before(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__IdAssignment_1"


    // $ANTLR start "rule__ActivitySet__NameAssignment_3_1"
    // InternalMyDsl.g:5445:1: rule__ActivitySet__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ActivitySet__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5449:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5450:2: ( ruleEString )
            {
            // InternalMyDsl.g:5450:2: ( ruleEString )
            // InternalMyDsl.g:5451:3: ruleEString
            {
             before(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__NameAssignment_3_1"


    // $ANTLR start "rule__ActivitySet__ActivitiesAssignment_6"
    // InternalMyDsl.g:5460:1: rule__ActivitySet__ActivitiesAssignment_6 : ( ruleActivity ) ;
    public final void rule__ActivitySet__ActivitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5464:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:5465:2: ( ruleActivity )
            {
            // InternalMyDsl.g:5465:2: ( ruleActivity )
            // InternalMyDsl.g:5466:3: ruleActivity
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__ActivitiesAssignment_6"


    // $ANTLR start "rule__ActivitySet__ActivitiesAssignment_7_1"
    // InternalMyDsl.g:5475:1: rule__ActivitySet__ActivitiesAssignment_7_1 : ( ruleActivity ) ;
    public final void rule__ActivitySet__ActivitiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5479:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:5480:2: ( ruleActivity )
            {
            // InternalMyDsl.g:5480:2: ( ruleActivity )
            // InternalMyDsl.g:5481:3: ruleActivity
            {
             before(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivitySetAccess().getActivitiesActivityParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivitySet__ActivitiesAssignment_7_1"


    // $ANTLR start "rule__Activity_Impl__IdAssignment_2"
    // InternalMyDsl.g:5490:1: rule__Activity_Impl__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Activity_Impl__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5494:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5495:2: ( ruleEString )
            {
            // InternalMyDsl.g:5495:2: ( ruleEString )
            // InternalMyDsl.g:5496:3: ruleEString
            {
             before(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivity_ImplAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__IdAssignment_2"


    // $ANTLR start "rule__Activity_Impl__TitleAssignment_4_1"
    // InternalMyDsl.g:5505:1: rule__Activity_Impl__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Activity_Impl__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5509:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5510:2: ( ruleEString )
            {
            // InternalMyDsl.g:5510:2: ( ruleEString )
            // InternalMyDsl.g:5511:3: ruleEString
            {
             before(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivity_ImplAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity_Impl__TitleAssignment_4_1"


    // $ANTLR start "rule__BlockActivity__IdAssignment_2"
    // InternalMyDsl.g:5520:1: rule__BlockActivity__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__BlockActivity__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5524:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5525:2: ( ruleEString )
            {
            // InternalMyDsl.g:5525:2: ( ruleEString )
            // InternalMyDsl.g:5526:3: ruleEString
            {
             before(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBlockActivityAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__IdAssignment_2"


    // $ANTLR start "rule__BlockActivity__TitleAssignment_4_1"
    // InternalMyDsl.g:5535:1: rule__BlockActivity__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BlockActivity__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5539:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5540:2: ( ruleEString )
            {
            // InternalMyDsl.g:5540:2: ( ruleEString )
            // InternalMyDsl.g:5541:3: ruleEString
            {
             before(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBlockActivityAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockActivity__TitleAssignment_4_1"


    // $ANTLR start "rule__Event__IdAssignment_2"
    // InternalMyDsl.g:5550:1: rule__Event__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5554:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5555:2: ( ruleEString )
            {
            // InternalMyDsl.g:5555:2: ( ruleEString )
            // InternalMyDsl.g:5556:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__IdAssignment_2"


    // $ANTLR start "rule__Event__TitleAssignment_4_1"
    // InternalMyDsl.g:5565:1: rule__Event__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Event__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5569:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5570:2: ( ruleEString )
            {
            // InternalMyDsl.g:5570:2: ( ruleEString )
            // InternalMyDsl.g:5571:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TitleAssignment_4_1"


    // $ANTLR start "rule__Event__TimeAssignment_5_1"
    // InternalMyDsl.g:5580:1: rule__Event__TimeAssignment_5_1 : ( ruleEventTime ) ;
    public final void rule__Event__TimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5584:1: ( ( ruleEventTime ) )
            // InternalMyDsl.g:5585:2: ( ruleEventTime )
            {
            // InternalMyDsl.g:5585:2: ( ruleEventTime )
            // InternalMyDsl.g:5586:3: ruleEventTime
            {
             before(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventTime();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTimeEventTimeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TimeAssignment_5_1"


    // $ANTLR start "rule__Event__TypeAssignment_6_1"
    // InternalMyDsl.g:5595:1: rule__Event__TypeAssignment_6_1 : ( ruleEventType ) ;
    public final void rule__Event__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5599:1: ( ( ruleEventType ) )
            // InternalMyDsl.g:5600:2: ( ruleEventType )
            {
            // InternalMyDsl.g:5600:2: ( ruleEventType )
            // InternalMyDsl.g:5601:3: ruleEventType
            {
             before(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTypeEventTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TypeAssignment_6_1"


    // $ANTLR start "rule__Gateway__IdAssignment_2"
    // InternalMyDsl.g:5610:1: rule__Gateway__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__Gateway__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5614:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5615:2: ( ruleEString )
            {
            // InternalMyDsl.g:5615:2: ( ruleEString )
            // InternalMyDsl.g:5616:3: ruleEString
            {
             before(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__IdAssignment_2"


    // $ANTLR start "rule__Gateway__TitleAssignment_4_1"
    // InternalMyDsl.g:5625:1: rule__Gateway__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Gateway__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5629:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5630:2: ( ruleEString )
            {
            // InternalMyDsl.g:5630:2: ( ruleEString )
            // InternalMyDsl.g:5631:3: ruleEString
            {
             before(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__TitleAssignment_4_1"


    // $ANTLR start "rule__Gateway__RuleAssignment_5_1"
    // InternalMyDsl.g:5640:1: rule__Gateway__RuleAssignment_5_1 : ( ruleGateRule ) ;
    public final void rule__Gateway__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5644:1: ( ( ruleGateRule ) )
            // InternalMyDsl.g:5645:2: ( ruleGateRule )
            {
            // InternalMyDsl.g:5645:2: ( ruleGateRule )
            // InternalMyDsl.g:5646:3: ruleGateRule
            {
             before(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGateRule();

            state._fsp--;

             after(grammarAccess.getGatewayAccess().getRuleGateRuleEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__RuleAssignment_5_1"


    // $ANTLR start "rule__SubFlow__IdAssignment_2"
    // InternalMyDsl.g:5655:1: rule__SubFlow__IdAssignment_2 : ( ruleEString ) ;
    public final void rule__SubFlow__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5659:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5660:2: ( ruleEString )
            {
            // InternalMyDsl.g:5660:2: ( ruleEString )
            // InternalMyDsl.g:5661:3: ruleEString
            {
             before(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubFlowAccess().getIdEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__IdAssignment_2"


    // $ANTLR start "rule__SubFlow__TitleAssignment_4_1"
    // InternalMyDsl.g:5670:1: rule__SubFlow__TitleAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SubFlow__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5674:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5675:2: ( ruleEString )
            {
            // InternalMyDsl.g:5675:2: ( ruleEString )
            // InternalMyDsl.g:5676:3: ruleEString
            {
             before(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubFlowAccess().getTitleEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFlow__TitleAssignment_4_1"


    // $ANTLR start "rule__Transition__ConditionAssignment_2_1"
    // InternalMyDsl.g:5685:1: rule__Transition__ConditionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Transition__ConditionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5689:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5690:2: ( ruleEString )
            {
            // InternalMyDsl.g:5690:2: ( ruleEString )
            // InternalMyDsl.g:5691:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionAssignment_2_1"


    // $ANTLR start "rule__Transition__SourceAssignment_4"
    // InternalMyDsl.g:5700:1: rule__Transition__SourceAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5704:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5705:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5705:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5706:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0()); 
            // InternalMyDsl.g:5707:3: ( ruleEString )
            // InternalMyDsl.g:5708:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceTransitionValidEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceTransitionValidEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceTransitionValidCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_4"


    // $ANTLR start "rule__Transition__TargetAssignment_6"
    // InternalMyDsl.g:5719:1: rule__Transition__TargetAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5723:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5724:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5724:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5725:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0()); 
            // InternalMyDsl.g:5726:3: ( ruleEString )
            // InternalMyDsl.g:5727:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetTransitionValidEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetTransitionValidEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetTransitionValidCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000037000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001801000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000C001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001101000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000A680000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001900001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004100001000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});

}