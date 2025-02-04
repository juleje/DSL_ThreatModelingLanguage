package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.ThreatModelLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThreatModelLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'add'", "'process'", "'name'", "'dsc'", "'external'", "'entity'", "'datastore'", "'flow'", "'->'", "'boundary'", "':'", "'remove'", "'rename'", "'into'", "'change'", "'id'", "'description'", "'source'", "'destination'", "'revert'", "'merge'", "'and'", "'split'", "'flows'", "'{'", "'}'", "'countermeasure'", "'design'", "'refactoring'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int RULE_ID=4;
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


        public InternalThreatModelLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThreatModelLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThreatModelLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThreatModelLanguage.g"; }



     	private ThreatModelLanguageGrammarAccess grammarAccess;

        public InternalThreatModelLanguageParser(TokenStream input, ThreatModelLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ThreatModelLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalThreatModelLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalThreatModelLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalThreatModelLanguage.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalThreatModelLanguage.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleStatements ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:77:2: ( ( (lv_elements_0_0= ruleStatements ) )* )
            // InternalThreatModelLanguage.g:78:2: ( (lv_elements_0_0= ruleStatements ) )*
            {
            // InternalThreatModelLanguage.g:78:2: ( (lv_elements_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||LA1_0==31||LA1_0==33||(LA1_0>=37 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:79:3: (lv_elements_0_0= ruleStatements )
            	    {
            	    // InternalThreatModelLanguage.g:79:3: (lv_elements_0_0= ruleStatements )
            	    // InternalThreatModelLanguage.g:80:4: lv_elements_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"xtext.ThreatModelLanguage.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalThreatModelLanguage.g:100:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalThreatModelLanguage.g:100:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalThreatModelLanguage.g:101:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalThreatModelLanguage.g:107:1: ruleStatements returns [EObject current=null] : (this_Grouping_0= ruleGrouping | this_Operations_1= ruleOperations ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_Grouping_0 = null;

        EObject this_Operations_1 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:113:2: ( (this_Grouping_0= ruleGrouping | this_Operations_1= ruleOperations ) )
            // InternalThreatModelLanguage.g:114:2: (this_Grouping_0= ruleGrouping | this_Operations_1= ruleOperations )
            {
            // InternalThreatModelLanguage.g:114:2: (this_Grouping_0= ruleGrouping | this_Operations_1= ruleOperations )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=37 && LA2_0<=39)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11||(LA2_0>=22 && LA2_0<=23)||LA2_0==25||LA2_0==31||LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalThreatModelLanguage.g:115:3: this_Grouping_0= ruleGrouping
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getGroupingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grouping_0=ruleGrouping();

                    state._fsp--;


                    			current = this_Grouping_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:124:3: this_Operations_1= ruleOperations
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getOperationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operations_1=ruleOperations();

                    state._fsp--;


                    			current = this_Operations_1;
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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleOperations"
    // InternalThreatModelLanguage.g:136:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalThreatModelLanguage.g:136:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalThreatModelLanguage.g:137:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
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
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalThreatModelLanguage.g:143:1: ruleOperations returns [EObject current=null] : (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Modify_2= ruleModify ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Remove_1 = null;

        EObject this_Modify_2 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:149:2: ( (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Modify_2= ruleModify ) )
            // InternalThreatModelLanguage.g:150:2: (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Modify_2= ruleModify )
            {
            // InternalThreatModelLanguage.g:150:2: (this_Add_0= ruleAdd | this_Remove_1= ruleRemove | this_Modify_2= ruleModify )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
            case 25:
            case 31:
            case 33:
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
                    // InternalThreatModelLanguage.g:151:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getOperationsAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:160:3: this_Remove_1= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getOperationsAccess().getRemoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_1=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:169:3: this_Modify_2= ruleModify
                    {

                    			newCompositeNode(grammarAccess.getOperationsAccess().getModifyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modify_2=ruleModify();

                    state._fsp--;


                    			current = this_Modify_2;
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
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleAdd"
    // InternalThreatModelLanguage.g:181:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalThreatModelLanguage.g:181:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalThreatModelLanguage.g:182:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalThreatModelLanguage.g:188:1: ruleAdd returns [EObject current=null] : (this_AddEntity_0= ruleAddEntity | this_AddFlow_1= ruleAddFlow | this_AddBoundary_2= ruleAddBoundary ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        EObject this_AddEntity_0 = null;

        EObject this_AddFlow_1 = null;

        EObject this_AddBoundary_2 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:194:2: ( (this_AddEntity_0= ruleAddEntity | this_AddFlow_1= ruleAddFlow | this_AddBoundary_2= ruleAddBoundary ) )
            // InternalThreatModelLanguage.g:195:2: (this_AddEntity_0= ruleAddEntity | this_AddFlow_1= ruleAddFlow | this_AddBoundary_2= ruleAddBoundary )
            {
            // InternalThreatModelLanguage.g:195:2: (this_AddEntity_0= ruleAddEntity | this_AddFlow_1= ruleAddFlow | this_AddBoundary_2= ruleAddBoundary )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                switch ( input.LA(2) ) {
                case 12:
                case 15:
                case 17:
                    {
                    alt4=1;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                default:
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
                    // InternalThreatModelLanguage.g:196:3: this_AddEntity_0= ruleAddEntity
                    {

                    			newCompositeNode(grammarAccess.getAddAccess().getAddEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEntity_0=ruleAddEntity();

                    state._fsp--;


                    			current = this_AddEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:205:3: this_AddFlow_1= ruleAddFlow
                    {

                    			newCompositeNode(grammarAccess.getAddAccess().getAddFlowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddFlow_1=ruleAddFlow();

                    state._fsp--;


                    			current = this_AddFlow_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:214:3: this_AddBoundary_2= ruleAddBoundary
                    {

                    			newCompositeNode(grammarAccess.getAddAccess().getAddBoundaryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddBoundary_2=ruleAddBoundary();

                    state._fsp--;


                    			current = this_AddBoundary_2;
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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddEntity"
    // InternalThreatModelLanguage.g:226:1: entryRuleAddEntity returns [EObject current=null] : iv_ruleAddEntity= ruleAddEntity EOF ;
    public final EObject entryRuleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEntity = null;


        try {
            // InternalThreatModelLanguage.g:226:50: (iv_ruleAddEntity= ruleAddEntity EOF )
            // InternalThreatModelLanguage.g:227:2: iv_ruleAddEntity= ruleAddEntity EOF
            {
             newCompositeNode(grammarAccess.getAddEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddEntity=ruleAddEntity();

            state._fsp--;

             current =iv_ruleAddEntity; 
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
    // $ANTLR end "entryRuleAddEntity"


    // $ANTLR start "ruleAddEntity"
    // InternalThreatModelLanguage.g:233:1: ruleAddEntity returns [EObject current=null] : (this_AddProcess_0= ruleAddProcess | this_AddExternal_1= ruleAddExternal | this_AddDatastore_2= ruleAddDatastore ) ;
    public final EObject ruleAddEntity() throws RecognitionException {
        EObject current = null;

        EObject this_AddProcess_0 = null;

        EObject this_AddExternal_1 = null;

        EObject this_AddDatastore_2 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:239:2: ( (this_AddProcess_0= ruleAddProcess | this_AddExternal_1= ruleAddExternal | this_AddDatastore_2= ruleAddDatastore ) )
            // InternalThreatModelLanguage.g:240:2: (this_AddProcess_0= ruleAddProcess | this_AddExternal_1= ruleAddExternal | this_AddDatastore_2= ruleAddDatastore )
            {
            // InternalThreatModelLanguage.g:240:2: (this_AddProcess_0= ruleAddProcess | this_AddExternal_1= ruleAddExternal | this_AddDatastore_2= ruleAddDatastore )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    alt5=1;
                    }
                    break;
                case 17:
                    {
                    alt5=3;
                    }
                    break;
                case 15:
                    {
                    alt5=2;
                    }
                    break;
                default:
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
                    // InternalThreatModelLanguage.g:241:3: this_AddProcess_0= ruleAddProcess
                    {

                    			newCompositeNode(grammarAccess.getAddEntityAccess().getAddProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddProcess_0=ruleAddProcess();

                    state._fsp--;


                    			current = this_AddProcess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:250:3: this_AddExternal_1= ruleAddExternal
                    {

                    			newCompositeNode(grammarAccess.getAddEntityAccess().getAddExternalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddExternal_1=ruleAddExternal();

                    state._fsp--;


                    			current = this_AddExternal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:259:3: this_AddDatastore_2= ruleAddDatastore
                    {

                    			newCompositeNode(grammarAccess.getAddEntityAccess().getAddDatastoreParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddDatastore_2=ruleAddDatastore();

                    state._fsp--;


                    			current = this_AddDatastore_2;
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
    // $ANTLR end "ruleAddEntity"


    // $ANTLR start "entryRuleAddProcess"
    // InternalThreatModelLanguage.g:271:1: entryRuleAddProcess returns [EObject current=null] : iv_ruleAddProcess= ruleAddProcess EOF ;
    public final EObject entryRuleAddProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddProcess = null;


        try {
            // InternalThreatModelLanguage.g:271:51: (iv_ruleAddProcess= ruleAddProcess EOF )
            // InternalThreatModelLanguage.g:272:2: iv_ruleAddProcess= ruleAddProcess EOF
            {
             newCompositeNode(grammarAccess.getAddProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddProcess=ruleAddProcess();

            state._fsp--;

             current =iv_ruleAddProcess; 
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
    // $ANTLR end "entryRuleAddProcess"


    // $ANTLR start "ruleAddProcess"
    // InternalThreatModelLanguage.g:278:1: ruleAddProcess returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'process' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? ) ;
    public final EObject ruleAddProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token lv_documentation_7_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:284:2: ( (otherlv_0= 'add' otherlv_1= 'process' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:285:2: (otherlv_0= 'add' otherlv_1= 'process' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:285:2: (otherlv_0= 'add' otherlv_1= 'process' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:286:3: otherlv_0= 'add' otherlv_1= 'process' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddProcessAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddProcessAccess().getProcessKeyword_1());
            		
            // InternalThreatModelLanguage.g:294:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:295:4: (lv_id_2_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:295:4: (lv_id_2_0= RULE_ID )
            // InternalThreatModelLanguage.g:296:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_2_0, grammarAccess.getAddProcessAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:312:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalThreatModelLanguage.g:313:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddProcessAccess().getNameKeyword_3_0());
                    			
                    // InternalThreatModelLanguage.g:317:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:318:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:318:5: (lv_name_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:319:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getAddProcessAccess().getNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:336:3: (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalThreatModelLanguage.g:337:4: otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddProcessAccess().getDscKeyword_4_0());
                    			
                    // InternalThreatModelLanguage.g:341:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:342:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:342:5: (lv_description_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:343:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getAddProcessAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:360:3: ( (lv_documentation_7_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalThreatModelLanguage.g:361:4: (lv_documentation_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:361:4: (lv_documentation_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:362:5: lv_documentation_7_0= RULE_STRING
                    {
                    lv_documentation_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_7_0, grammarAccess.getAddProcessAccess().getDocumentationSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleAddProcess"


    // $ANTLR start "entryRuleAddExternal"
    // InternalThreatModelLanguage.g:382:1: entryRuleAddExternal returns [EObject current=null] : iv_ruleAddExternal= ruleAddExternal EOF ;
    public final EObject entryRuleAddExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExternal = null;


        try {
            // InternalThreatModelLanguage.g:382:52: (iv_ruleAddExternal= ruleAddExternal EOF )
            // InternalThreatModelLanguage.g:383:2: iv_ruleAddExternal= ruleAddExternal EOF
            {
             newCompositeNode(grammarAccess.getAddExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExternal=ruleAddExternal();

            state._fsp--;

             current =iv_ruleAddExternal; 
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
    // $ANTLR end "entryRuleAddExternal"


    // $ANTLR start "ruleAddExternal"
    // InternalThreatModelLanguage.g:389:1: ruleAddExternal returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'external' otherlv_2= 'entity' ( (lv_id_3_0= RULE_ID ) ) (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )? ( (lv_documentation_8_0= RULE_STRING ) )? ) ;
    public final EObject ruleAddExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token lv_documentation_8_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:395:2: ( (otherlv_0= 'add' otherlv_1= 'external' otherlv_2= 'entity' ( (lv_id_3_0= RULE_ID ) ) (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )? ( (lv_documentation_8_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:396:2: (otherlv_0= 'add' otherlv_1= 'external' otherlv_2= 'entity' ( (lv_id_3_0= RULE_ID ) ) (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )? ( (lv_documentation_8_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:396:2: (otherlv_0= 'add' otherlv_1= 'external' otherlv_2= 'entity' ( (lv_id_3_0= RULE_ID ) ) (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )? ( (lv_documentation_8_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:397:3: otherlv_0= 'add' otherlv_1= 'external' otherlv_2= 'entity' ( (lv_id_3_0= RULE_ID ) ) (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )? (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )? ( (lv_documentation_8_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAddExternalAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAddExternalAccess().getExternalKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAddExternalAccess().getEntityKeyword_2());
            		
            // InternalThreatModelLanguage.g:409:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:410:4: (lv_id_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:410:4: (lv_id_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:411:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_3_0, grammarAccess.getAddExternalAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:427:3: (otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalThreatModelLanguage.g:428:4: otherlv_4= 'name' ( (lv_name_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAddExternalAccess().getNameKeyword_4_0());
                    			
                    // InternalThreatModelLanguage.g:432:4: ( (lv_name_5_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:433:5: (lv_name_5_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:433:5: (lv_name_5_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:434:6: lv_name_5_0= RULE_STRING
                    {
                    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getAddExternalAccess().getNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:451:3: (otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalThreatModelLanguage.g:452:4: otherlv_6= 'dsc' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddExternalAccess().getDscKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:456:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:457:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:457:5: (lv_description_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:458:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getAddExternalAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:475:3: ( (lv_documentation_8_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalThreatModelLanguage.g:476:4: (lv_documentation_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:476:4: (lv_documentation_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:477:5: lv_documentation_8_0= RULE_STRING
                    {
                    lv_documentation_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_8_0, grammarAccess.getAddExternalAccess().getDocumentationSTRINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddExternalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_8_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleAddExternal"


    // $ANTLR start "entryRuleAddDatastore"
    // InternalThreatModelLanguage.g:497:1: entryRuleAddDatastore returns [EObject current=null] : iv_ruleAddDatastore= ruleAddDatastore EOF ;
    public final EObject entryRuleAddDatastore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddDatastore = null;


        try {
            // InternalThreatModelLanguage.g:497:53: (iv_ruleAddDatastore= ruleAddDatastore EOF )
            // InternalThreatModelLanguage.g:498:2: iv_ruleAddDatastore= ruleAddDatastore EOF
            {
             newCompositeNode(grammarAccess.getAddDatastoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddDatastore=ruleAddDatastore();

            state._fsp--;

             current =iv_ruleAddDatastore; 
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
    // $ANTLR end "entryRuleAddDatastore"


    // $ANTLR start "ruleAddDatastore"
    // InternalThreatModelLanguage.g:504:1: ruleAddDatastore returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'datastore' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? ) ;
    public final EObject ruleAddDatastore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token lv_documentation_7_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:510:2: ( (otherlv_0= 'add' otherlv_1= 'datastore' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:511:2: (otherlv_0= 'add' otherlv_1= 'datastore' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:511:2: (otherlv_0= 'add' otherlv_1= 'datastore' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:512:3: otherlv_0= 'add' otherlv_1= 'datastore' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_documentation_7_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAddDatastoreAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddDatastoreAccess().getDatastoreKeyword_1());
            		
            // InternalThreatModelLanguage.g:520:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:521:4: (lv_id_2_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:521:4: (lv_id_2_0= RULE_ID )
            // InternalThreatModelLanguage.g:522:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_2_0, grammarAccess.getAddDatastoreAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:538:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalThreatModelLanguage.g:539:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddDatastoreAccess().getNameKeyword_3_0());
                    			
                    // InternalThreatModelLanguage.g:543:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:544:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:544:5: (lv_name_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:545:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getAddDatastoreAccess().getNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:562:3: (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalThreatModelLanguage.g:563:4: otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddDatastoreAccess().getDscKeyword_4_0());
                    			
                    // InternalThreatModelLanguage.g:567:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:568:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:568:5: (lv_description_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:569:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getAddDatastoreAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:586:3: ( (lv_documentation_7_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalThreatModelLanguage.g:587:4: (lv_documentation_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:587:4: (lv_documentation_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:588:5: lv_documentation_7_0= RULE_STRING
                    {
                    lv_documentation_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_7_0, grammarAccess.getAddDatastoreAccess().getDocumentationSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddDatastoreRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_7_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleAddDatastore"


    // $ANTLR start "entryRuleAddFlow"
    // InternalThreatModelLanguage.g:608:1: entryRuleAddFlow returns [EObject current=null] : iv_ruleAddFlow= ruleAddFlow EOF ;
    public final EObject entryRuleAddFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddFlow = null;


        try {
            // InternalThreatModelLanguage.g:608:48: (iv_ruleAddFlow= ruleAddFlow EOF )
            // InternalThreatModelLanguage.g:609:2: iv_ruleAddFlow= ruleAddFlow EOF
            {
             newCompositeNode(grammarAccess.getAddFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddFlow=ruleAddFlow();

            state._fsp--;

             current =iv_ruleAddFlow; 
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
    // $ANTLR end "entryRuleAddFlow"


    // $ANTLR start "ruleAddFlow"
    // InternalThreatModelLanguage.g:615:1: ruleAddFlow returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'flow' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_sourceId_7_0= RULE_ID ) ) otherlv_8= '->' ( (lv_destinationId_9_0= RULE_ID ) ) ( (lv_documentation_10_0= RULE_STRING ) )? ) ;
    public final EObject ruleAddFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token lv_sourceId_7_0=null;
        Token otherlv_8=null;
        Token lv_destinationId_9_0=null;
        Token lv_documentation_10_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:621:2: ( (otherlv_0= 'add' otherlv_1= 'flow' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_sourceId_7_0= RULE_ID ) ) otherlv_8= '->' ( (lv_destinationId_9_0= RULE_ID ) ) ( (lv_documentation_10_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:622:2: (otherlv_0= 'add' otherlv_1= 'flow' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_sourceId_7_0= RULE_ID ) ) otherlv_8= '->' ( (lv_destinationId_9_0= RULE_ID ) ) ( (lv_documentation_10_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:622:2: (otherlv_0= 'add' otherlv_1= 'flow' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_sourceId_7_0= RULE_ID ) ) otherlv_8= '->' ( (lv_destinationId_9_0= RULE_ID ) ) ( (lv_documentation_10_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:623:3: otherlv_0= 'add' otherlv_1= 'flow' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? ( (lv_sourceId_7_0= RULE_ID ) ) otherlv_8= '->' ( (lv_destinationId_9_0= RULE_ID ) ) ( (lv_documentation_10_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAddFlowAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddFlowAccess().getFlowKeyword_1());
            		
            // InternalThreatModelLanguage.g:631:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:632:4: (lv_id_2_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:632:4: (lv_id_2_0= RULE_ID )
            // InternalThreatModelLanguage.g:633:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_id_2_0, grammarAccess.getAddFlowAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:649:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThreatModelLanguage.g:650:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddFlowAccess().getNameKeyword_3_0());
                    			
                    // InternalThreatModelLanguage.g:654:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:655:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:655:5: (lv_name_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:656:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getAddFlowAccess().getNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddFlowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:673:3: (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalThreatModelLanguage.g:674:4: otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddFlowAccess().getDscKeyword_4_0());
                    			
                    // InternalThreatModelLanguage.g:678:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:679:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:679:5: (lv_description_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:680:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getAddFlowAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddFlowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:697:3: ( (lv_sourceId_7_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:698:4: (lv_sourceId_7_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:698:4: (lv_sourceId_7_0= RULE_ID )
            // InternalThreatModelLanguage.g:699:5: lv_sourceId_7_0= RULE_ID
            {
            lv_sourceId_7_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_sourceId_7_0, grammarAccess.getAddFlowAccess().getSourceIdIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sourceId",
            						lv_sourceId_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getAddFlowAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalThreatModelLanguage.g:719:3: ( (lv_destinationId_9_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:720:4: (lv_destinationId_9_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:720:4: (lv_destinationId_9_0= RULE_ID )
            // InternalThreatModelLanguage.g:721:5: lv_destinationId_9_0= RULE_ID
            {
            lv_destinationId_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_destinationId_9_0, grammarAccess.getAddFlowAccess().getDestinationIdIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destinationId",
            						lv_destinationId_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:737:3: ( (lv_documentation_10_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalThreatModelLanguage.g:738:4: (lv_documentation_10_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:738:4: (lv_documentation_10_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:739:5: lv_documentation_10_0= RULE_STRING
                    {
                    lv_documentation_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_10_0, grammarAccess.getAddFlowAccess().getDocumentationSTRINGTerminalRuleCall_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddFlowRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_10_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleAddFlow"


    // $ANTLR start "entryRuleAddBoundary"
    // InternalThreatModelLanguage.g:759:1: entryRuleAddBoundary returns [EObject current=null] : iv_ruleAddBoundary= ruleAddBoundary EOF ;
    public final EObject entryRuleAddBoundary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddBoundary = null;


        try {
            // InternalThreatModelLanguage.g:759:52: (iv_ruleAddBoundary= ruleAddBoundary EOF )
            // InternalThreatModelLanguage.g:760:2: iv_ruleAddBoundary= ruleAddBoundary EOF
            {
             newCompositeNode(grammarAccess.getAddBoundaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddBoundary=ruleAddBoundary();

            state._fsp--;

             current =iv_ruleAddBoundary; 
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
    // $ANTLR end "entryRuleAddBoundary"


    // $ANTLR start "ruleAddBoundary"
    // InternalThreatModelLanguage.g:766:1: ruleAddBoundary returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'boundary' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= ':' ( (lv_entities_8_0= RULE_ID ) )* ( (lv_documentation_9_0= RULE_STRING ) )? ) ;
    public final EObject ruleAddBoundary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_entities_8_0=null;
        Token lv_documentation_9_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:772:2: ( (otherlv_0= 'add' otherlv_1= 'boundary' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= ':' ( (lv_entities_8_0= RULE_ID ) )* ( (lv_documentation_9_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:773:2: (otherlv_0= 'add' otherlv_1= 'boundary' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= ':' ( (lv_entities_8_0= RULE_ID ) )* ( (lv_documentation_9_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:773:2: (otherlv_0= 'add' otherlv_1= 'boundary' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= ':' ( (lv_entities_8_0= RULE_ID ) )* ( (lv_documentation_9_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:774:3: otherlv_0= 'add' otherlv_1= 'boundary' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )? otherlv_7= ':' ( (lv_entities_8_0= RULE_ID ) )* ( (lv_documentation_9_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddBoundaryAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddBoundaryAccess().getBoundaryKeyword_1());
            		
            // InternalThreatModelLanguage.g:782:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:783:4: (lv_id_2_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:783:4: (lv_id_2_0= RULE_ID )
            // InternalThreatModelLanguage.g:784:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_id_2_0, grammarAccess.getAddBoundaryAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddBoundaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:800:3: (otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThreatModelLanguage.g:801:4: otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddBoundaryAccess().getNameKeyword_3_0());
                    			
                    // InternalThreatModelLanguage.g:805:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:806:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:806:5: (lv_name_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:807:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getAddBoundaryAccess().getNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddBoundaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:824:3: (otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThreatModelLanguage.g:825:4: otherlv_5= 'dsc' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddBoundaryAccess().getDscKeyword_4_0());
                    			
                    // InternalThreatModelLanguage.g:829:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:830:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:830:5: (lv_description_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:831:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getAddBoundaryAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddBoundaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getAddBoundaryAccess().getColonKeyword_5());
            		
            // InternalThreatModelLanguage.g:852:3: ( (lv_entities_8_0= RULE_ID ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:853:4: (lv_entities_8_0= RULE_ID )
            	    {
            	    // InternalThreatModelLanguage.g:853:4: (lv_entities_8_0= RULE_ID )
            	    // InternalThreatModelLanguage.g:854:5: lv_entities_8_0= RULE_ID
            	    {
            	    lv_entities_8_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    					newLeafNode(lv_entities_8_0, grammarAccess.getAddBoundaryAccess().getEntitiesIDTerminalRuleCall_6_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAddBoundaryRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"entities",
            	    						lv_entities_8_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalThreatModelLanguage.g:870:3: ( (lv_documentation_9_0= RULE_STRING ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalThreatModelLanguage.g:871:4: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:871:4: (lv_documentation_9_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:872:5: lv_documentation_9_0= RULE_STRING
                    {
                    lv_documentation_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_9_0, grammarAccess.getAddBoundaryAccess().getDocumentationSTRINGTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddBoundaryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_9_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleAddBoundary"


    // $ANTLR start "entryRuleRemove"
    // InternalThreatModelLanguage.g:892:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalThreatModelLanguage.g:892:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalThreatModelLanguage.g:893:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalThreatModelLanguage.g:899:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_id_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_documentation_2_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:905:2: ( (otherlv_0= 'remove' ( (lv_id_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:906:2: (otherlv_0= 'remove' ( (lv_id_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:906:2: (otherlv_0= 'remove' ( (lv_id_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:907:3: otherlv_0= 'remove' ( (lv_id_1_0= RULE_ID ) ) ( (lv_documentation_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
            		
            // InternalThreatModelLanguage.g:911:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:912:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:912:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:913:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_id_1_0, grammarAccess.getRemoveAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:929:3: ( (lv_documentation_2_0= RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalThreatModelLanguage.g:930:4: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:930:4: (lv_documentation_2_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:931:5: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_2_0, grammarAccess.getRemoveAccess().getDocumentationSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRemoveRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleModify"
    // InternalThreatModelLanguage.g:951:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalThreatModelLanguage.g:951:47: (iv_ruleModify= ruleModify EOF )
            // InternalThreatModelLanguage.g:952:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
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
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalThreatModelLanguage.g:958:1: ruleModify returns [EObject current=null] : (this_Rename_0= ruleRename | this_ReID_1= ruleReID | this_ChangeDescription_2= ruleChangeDescription | this_FlowSource_3= ruleFlowSource | this_FlowDestination_4= ruleFlowDestination | this_BoundaryAddEntity_5= ruleBoundaryAddEntity | this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity | this_RotateFlow_7= ruleRotateFlow | this_MergeEntity_8= ruleMergeEntity | this_SplitEntity_9= ruleSplitEntity ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        EObject this_Rename_0 = null;

        EObject this_ReID_1 = null;

        EObject this_ChangeDescription_2 = null;

        EObject this_FlowSource_3 = null;

        EObject this_FlowDestination_4 = null;

        EObject this_BoundaryAddEntity_5 = null;

        EObject this_BoundaryRemoveEntity_6 = null;

        EObject this_RotateFlow_7 = null;

        EObject this_MergeEntity_8 = null;

        EObject this_SplitEntity_9 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:964:2: ( (this_Rename_0= ruleRename | this_ReID_1= ruleReID | this_ChangeDescription_2= ruleChangeDescription | this_FlowSource_3= ruleFlowSource | this_FlowDestination_4= ruleFlowDestination | this_BoundaryAddEntity_5= ruleBoundaryAddEntity | this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity | this_RotateFlow_7= ruleRotateFlow | this_MergeEntity_8= ruleMergeEntity | this_SplitEntity_9= ruleSplitEntity ) )
            // InternalThreatModelLanguage.g:965:2: (this_Rename_0= ruleRename | this_ReID_1= ruleReID | this_ChangeDescription_2= ruleChangeDescription | this_FlowSource_3= ruleFlowSource | this_FlowDestination_4= ruleFlowDestination | this_BoundaryAddEntity_5= ruleBoundaryAddEntity | this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity | this_RotateFlow_7= ruleRotateFlow | this_MergeEntity_8= ruleMergeEntity | this_SplitEntity_9= ruleSplitEntity )
            {
            // InternalThreatModelLanguage.g:965:2: (this_Rename_0= ruleRename | this_ReID_1= ruleReID | this_ChangeDescription_2= ruleChangeDescription | this_FlowSource_3= ruleFlowSource | this_FlowDestination_4= ruleFlowDestination | this_BoundaryAddEntity_5= ruleBoundaryAddEntity | this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity | this_RotateFlow_7= ruleRotateFlow | this_MergeEntity_8= ruleMergeEntity | this_SplitEntity_9= ruleSplitEntity )
            int alt23=10;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalThreatModelLanguage.g:966:3: this_Rename_0= ruleRename
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getRenameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rename_0=ruleRename();

                    state._fsp--;


                    			current = this_Rename_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:975:3: this_ReID_1= ruleReID
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getReIDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReID_1=ruleReID();

                    state._fsp--;


                    			current = this_ReID_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:984:3: this_ChangeDescription_2= ruleChangeDescription
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getChangeDescriptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeDescription_2=ruleChangeDescription();

                    state._fsp--;


                    			current = this_ChangeDescription_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalThreatModelLanguage.g:993:3: this_FlowSource_3= ruleFlowSource
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getFlowSourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlowSource_3=ruleFlowSource();

                    state._fsp--;


                    			current = this_FlowSource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalThreatModelLanguage.g:1002:3: this_FlowDestination_4= ruleFlowDestination
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getFlowDestinationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlowDestination_4=ruleFlowDestination();

                    state._fsp--;


                    			current = this_FlowDestination_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalThreatModelLanguage.g:1011:3: this_BoundaryAddEntity_5= ruleBoundaryAddEntity
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getBoundaryAddEntityParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryAddEntity_5=ruleBoundaryAddEntity();

                    state._fsp--;


                    			current = this_BoundaryAddEntity_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalThreatModelLanguage.g:1020:3: this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getBoundaryRemoveEntityParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoundaryRemoveEntity_6=ruleBoundaryRemoveEntity();

                    state._fsp--;


                    			current = this_BoundaryRemoveEntity_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalThreatModelLanguage.g:1029:3: this_RotateFlow_7= ruleRotateFlow
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getRotateFlowParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateFlow_7=ruleRotateFlow();

                    state._fsp--;


                    			current = this_RotateFlow_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalThreatModelLanguage.g:1038:3: this_MergeEntity_8= ruleMergeEntity
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getMergeEntityParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeEntity_8=ruleMergeEntity();

                    state._fsp--;


                    			current = this_MergeEntity_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalThreatModelLanguage.g:1047:3: this_SplitEntity_9= ruleSplitEntity
                    {

                    			newCompositeNode(grammarAccess.getModifyAccess().getSplitEntityParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitEntity_9=ruleSplitEntity();

                    state._fsp--;


                    			current = this_SplitEntity_9;
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
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleRename"
    // InternalThreatModelLanguage.g:1059:1: entryRuleRename returns [EObject current=null] : iv_ruleRename= ruleRename EOF ;
    public final EObject entryRuleRename() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRename = null;


        try {
            // InternalThreatModelLanguage.g:1059:47: (iv_ruleRename= ruleRename EOF )
            // InternalThreatModelLanguage.g:1060:2: iv_ruleRename= ruleRename EOF
            {
             newCompositeNode(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRename=ruleRename();

            state._fsp--;

             current =iv_ruleRename; 
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
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalThreatModelLanguage.g:1066:1: ruleRename returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' ( (lv_newName_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleRename() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_newName_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1072:2: ( (otherlv_0= 'rename' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' ( (lv_newName_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1073:2: (otherlv_0= 'rename' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' ( (lv_newName_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1073:2: (otherlv_0= 'rename' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' ( (lv_newName_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1074:3: otherlv_0= 'rename' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' ( (lv_newName_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameAccess().getRenameKeyword_0());
            		
            // InternalThreatModelLanguage.g:1078:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1079:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1079:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1080:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getRenameAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRenameAccess().getIntoKeyword_2());
            		
            // InternalThreatModelLanguage.g:1100:3: ( (lv_newName_3_0= RULE_STRING ) )
            // InternalThreatModelLanguage.g:1101:4: (lv_newName_3_0= RULE_STRING )
            {
            // InternalThreatModelLanguage.g:1101:4: (lv_newName_3_0= RULE_STRING )
            // InternalThreatModelLanguage.g:1102:5: lv_newName_3_0= RULE_STRING
            {
            lv_newName_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_newName_3_0, grammarAccess.getRenameAccess().getNewNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newName",
            						lv_newName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalThreatModelLanguage.g:1118:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalThreatModelLanguage.g:1119:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1119:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1120:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getRenameAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRenameRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleReID"
    // InternalThreatModelLanguage.g:1140:1: entryRuleReID returns [EObject current=null] : iv_ruleReID= ruleReID EOF ;
    public final EObject entryRuleReID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReID = null;


        try {
            // InternalThreatModelLanguage.g:1140:45: (iv_ruleReID= ruleReID EOF )
            // InternalThreatModelLanguage.g:1141:2: iv_ruleReID= ruleReID EOF
            {
             newCompositeNode(grammarAccess.getReIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReID=ruleReID();

            state._fsp--;

             current =iv_ruleReID; 
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
    // $ANTLR end "entryRuleReID"


    // $ANTLR start "ruleReID"
    // InternalThreatModelLanguage.g:1147:1: ruleReID returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'id' ( (lv_newId_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleReID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_newId_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1153:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'id' ( (lv_newId_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1154:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'id' ( (lv_newId_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1154:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'id' ( (lv_newId_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1155:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'id' ( (lv_newId_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReIDAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1159:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1160:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1160:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1161:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_id_1_0, grammarAccess.getReIDAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getReIDAccess().getIdKeyword_2());
            		
            // InternalThreatModelLanguage.g:1181:3: ( (lv_newId_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1182:4: (lv_newId_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1182:4: (lv_newId_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1183:5: lv_newId_3_0= RULE_ID
            {
            lv_newId_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_newId_3_0, grammarAccess.getReIDAccess().getNewIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReIDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newId",
            						lv_newId_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1199:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalThreatModelLanguage.g:1200:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1200:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1201:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getReIDAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReIDRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleReID"


    // $ANTLR start "entryRuleChangeDescription"
    // InternalThreatModelLanguage.g:1221:1: entryRuleChangeDescription returns [EObject current=null] : iv_ruleChangeDescription= ruleChangeDescription EOF ;
    public final EObject entryRuleChangeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeDescription = null;


        try {
            // InternalThreatModelLanguage.g:1221:58: (iv_ruleChangeDescription= ruleChangeDescription EOF )
            // InternalThreatModelLanguage.g:1222:2: iv_ruleChangeDescription= ruleChangeDescription EOF
            {
             newCompositeNode(grammarAccess.getChangeDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeDescription=ruleChangeDescription();

            state._fsp--;

             current =iv_ruleChangeDescription; 
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
    // $ANTLR end "entryRuleChangeDescription"


    // $ANTLR start "ruleChangeDescription"
    // InternalThreatModelLanguage.g:1228:1: ruleChangeDescription returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleChangeDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1234:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1235:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1235:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1236:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeDescriptionAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1240:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1241:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1241:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1242:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_id_1_0, grammarAccess.getChangeDescriptionAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeDescriptionAccess().getDescriptionKeyword_2());
            		
            // InternalThreatModelLanguage.g:1262:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalThreatModelLanguage.g:1263:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalThreatModelLanguage.g:1263:4: (lv_description_3_0= RULE_STRING )
            // InternalThreatModelLanguage.g:1264:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_description_3_0, grammarAccess.getChangeDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalThreatModelLanguage.g:1280:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalThreatModelLanguage.g:1281:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1281:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1282:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getChangeDescriptionAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChangeDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleChangeDescription"


    // $ANTLR start "entryRuleFlowSource"
    // InternalThreatModelLanguage.g:1302:1: entryRuleFlowSource returns [EObject current=null] : iv_ruleFlowSource= ruleFlowSource EOF ;
    public final EObject entryRuleFlowSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSource = null;


        try {
            // InternalThreatModelLanguage.g:1302:51: (iv_ruleFlowSource= ruleFlowSource EOF )
            // InternalThreatModelLanguage.g:1303:2: iv_ruleFlowSource= ruleFlowSource EOF
            {
             newCompositeNode(grammarAccess.getFlowSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowSource=ruleFlowSource();

            state._fsp--;

             current =iv_ruleFlowSource; 
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
    // $ANTLR end "entryRuleFlowSource"


    // $ANTLR start "ruleFlowSource"
    // InternalThreatModelLanguage.g:1309:1: ruleFlowSource returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'source' ( (lv_source_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleFlowSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_source_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1315:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'source' ( (lv_source_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1316:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'source' ( (lv_source_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1316:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'source' ( (lv_source_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1317:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'source' ( (lv_source_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFlowSourceAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1321:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1322:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1322:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1323:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_1_0, grammarAccess.getFlowSourceAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFlowSourceAccess().getSourceKeyword_2());
            		
            // InternalThreatModelLanguage.g:1343:3: ( (lv_source_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1344:4: (lv_source_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1344:4: (lv_source_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1345:5: lv_source_3_0= RULE_ID
            {
            lv_source_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_source_3_0, grammarAccess.getFlowSourceAccess().getSourceIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1361:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalThreatModelLanguage.g:1362:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1362:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1363:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getFlowSourceAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFlowSourceRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleFlowSource"


    // $ANTLR start "entryRuleFlowDestination"
    // InternalThreatModelLanguage.g:1383:1: entryRuleFlowDestination returns [EObject current=null] : iv_ruleFlowDestination= ruleFlowDestination EOF ;
    public final EObject entryRuleFlowDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowDestination = null;


        try {
            // InternalThreatModelLanguage.g:1383:56: (iv_ruleFlowDestination= ruleFlowDestination EOF )
            // InternalThreatModelLanguage.g:1384:2: iv_ruleFlowDestination= ruleFlowDestination EOF
            {
             newCompositeNode(grammarAccess.getFlowDestinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowDestination=ruleFlowDestination();

            state._fsp--;

             current =iv_ruleFlowDestination; 
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
    // $ANTLR end "entryRuleFlowDestination"


    // $ANTLR start "ruleFlowDestination"
    // InternalThreatModelLanguage.g:1390:1: ruleFlowDestination returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'destination' ( (lv_destination_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleFlowDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_destination_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1396:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'destination' ( (lv_destination_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1397:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'destination' ( (lv_destination_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1397:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'destination' ( (lv_destination_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1398:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'destination' ( (lv_destination_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFlowDestinationAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1402:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1403:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1403:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1404:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_id_1_0, grammarAccess.getFlowDestinationAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowDestinationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFlowDestinationAccess().getDestinationKeyword_2());
            		
            // InternalThreatModelLanguage.g:1424:3: ( (lv_destination_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1425:4: (lv_destination_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1425:4: (lv_destination_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1426:5: lv_destination_3_0= RULE_ID
            {
            lv_destination_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_destination_3_0, grammarAccess.getFlowDestinationAccess().getDestinationIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowDestinationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destination",
            						lv_destination_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1442:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalThreatModelLanguage.g:1443:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1443:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1444:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getFlowDestinationAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFlowDestinationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleFlowDestination"


    // $ANTLR start "entryRuleBoundaryAddEntity"
    // InternalThreatModelLanguage.g:1464:1: entryRuleBoundaryAddEntity returns [EObject current=null] : iv_ruleBoundaryAddEntity= ruleBoundaryAddEntity EOF ;
    public final EObject entryRuleBoundaryAddEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryAddEntity = null;


        try {
            // InternalThreatModelLanguage.g:1464:58: (iv_ruleBoundaryAddEntity= ruleBoundaryAddEntity EOF )
            // InternalThreatModelLanguage.g:1465:2: iv_ruleBoundaryAddEntity= ruleBoundaryAddEntity EOF
            {
             newCompositeNode(grammarAccess.getBoundaryAddEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryAddEntity=ruleBoundaryAddEntity();

            state._fsp--;

             current =iv_ruleBoundaryAddEntity; 
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
    // $ANTLR end "entryRuleBoundaryAddEntity"


    // $ANTLR start "ruleBoundaryAddEntity"
    // InternalThreatModelLanguage.g:1471:1: ruleBoundaryAddEntity returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'add' ( (lv_newEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleBoundaryAddEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_newEntity_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1477:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'add' ( (lv_newEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1478:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'add' ( (lv_newEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1478:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'add' ( (lv_newEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1479:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'add' ( (lv_newEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryAddEntityAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1483:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1484:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1484:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1485:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_id_1_0, grammarAccess.getBoundaryAddEntityAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundaryAddEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundaryAddEntityAccess().getAddKeyword_2());
            		
            // InternalThreatModelLanguage.g:1505:3: ( (lv_newEntity_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1506:4: (lv_newEntity_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1506:4: (lv_newEntity_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1507:5: lv_newEntity_3_0= RULE_ID
            {
            lv_newEntity_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_newEntity_3_0, grammarAccess.getBoundaryAddEntityAccess().getNewEntityIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundaryAddEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newEntity",
            						lv_newEntity_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1523:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalThreatModelLanguage.g:1524:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1524:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1525:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getBoundaryAddEntityAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoundaryAddEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleBoundaryAddEntity"


    // $ANTLR start "entryRuleBoundaryRemoveEntity"
    // InternalThreatModelLanguage.g:1545:1: entryRuleBoundaryRemoveEntity returns [EObject current=null] : iv_ruleBoundaryRemoveEntity= ruleBoundaryRemoveEntity EOF ;
    public final EObject entryRuleBoundaryRemoveEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundaryRemoveEntity = null;


        try {
            // InternalThreatModelLanguage.g:1545:61: (iv_ruleBoundaryRemoveEntity= ruleBoundaryRemoveEntity EOF )
            // InternalThreatModelLanguage.g:1546:2: iv_ruleBoundaryRemoveEntity= ruleBoundaryRemoveEntity EOF
            {
             newCompositeNode(grammarAccess.getBoundaryRemoveEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundaryRemoveEntity=ruleBoundaryRemoveEntity();

            state._fsp--;

             current =iv_ruleBoundaryRemoveEntity; 
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
    // $ANTLR end "entryRuleBoundaryRemoveEntity"


    // $ANTLR start "ruleBoundaryRemoveEntity"
    // InternalThreatModelLanguage.g:1552:1: ruleBoundaryRemoveEntity returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'remove' ( (lv_oldEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleBoundaryRemoveEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token lv_oldEntity_3_0=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1558:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'remove' ( (lv_oldEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1559:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'remove' ( (lv_oldEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1559:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'remove' ( (lv_oldEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1560:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'remove' ( (lv_oldEntity_3_0= RULE_ID ) ) ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBoundaryRemoveEntityAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1564:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1565:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1565:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1566:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_id_1_0, grammarAccess.getBoundaryRemoveEntityAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundaryRemoveEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBoundaryRemoveEntityAccess().getRemoveKeyword_2());
            		
            // InternalThreatModelLanguage.g:1586:3: ( (lv_oldEntity_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1587:4: (lv_oldEntity_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1587:4: (lv_oldEntity_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1588:5: lv_oldEntity_3_0= RULE_ID
            {
            lv_oldEntity_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_oldEntity_3_0, grammarAccess.getBoundaryRemoveEntityAccess().getOldEntityIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoundaryRemoveEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldEntity",
            						lv_oldEntity_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1604:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalThreatModelLanguage.g:1605:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1605:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1606:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getBoundaryRemoveEntityAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoundaryRemoveEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleBoundaryRemoveEntity"


    // $ANTLR start "entryRuleRotateFlow"
    // InternalThreatModelLanguage.g:1626:1: entryRuleRotateFlow returns [EObject current=null] : iv_ruleRotateFlow= ruleRotateFlow EOF ;
    public final EObject entryRuleRotateFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateFlow = null;


        try {
            // InternalThreatModelLanguage.g:1626:51: (iv_ruleRotateFlow= ruleRotateFlow EOF )
            // InternalThreatModelLanguage.g:1627:2: iv_ruleRotateFlow= ruleRotateFlow EOF
            {
             newCompositeNode(grammarAccess.getRotateFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateFlow=ruleRotateFlow();

            state._fsp--;

             current =iv_ruleRotateFlow; 
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
    // $ANTLR end "entryRuleRotateFlow"


    // $ANTLR start "ruleRotateFlow"
    // InternalThreatModelLanguage.g:1633:1: ruleRotateFlow returns [EObject current=null] : (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'revert' otherlv_3= 'flow' ( (lv_documentation_4_0= RULE_STRING ) )? ) ;
    public final EObject ruleRotateFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1639:2: ( (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'revert' otherlv_3= 'flow' ( (lv_documentation_4_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1640:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'revert' otherlv_3= 'flow' ( (lv_documentation_4_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1640:2: (otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'revert' otherlv_3= 'flow' ( (lv_documentation_4_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1641:3: otherlv_0= 'change' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'revert' otherlv_3= 'flow' ( (lv_documentation_4_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateFlowAccess().getChangeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1645:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1646:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1646:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1647:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_id_1_0, grammarAccess.getRotateFlowAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateFlowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateFlowAccess().getRevertKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateFlowAccess().getFlowKeyword_3());
            		
            // InternalThreatModelLanguage.g:1671:3: ( (lv_documentation_4_0= RULE_STRING ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalThreatModelLanguage.g:1672:4: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1672:4: (lv_documentation_4_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1673:5: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_4_0, grammarAccess.getRotateFlowAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRotateFlowRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_4_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleRotateFlow"


    // $ANTLR start "entryRuleMergeEntity"
    // InternalThreatModelLanguage.g:1693:1: entryRuleMergeEntity returns [EObject current=null] : iv_ruleMergeEntity= ruleMergeEntity EOF ;
    public final EObject entryRuleMergeEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeEntity = null;


        try {
            // InternalThreatModelLanguage.g:1693:52: (iv_ruleMergeEntity= ruleMergeEntity EOF )
            // InternalThreatModelLanguage.g:1694:2: iv_ruleMergeEntity= ruleMergeEntity EOF
            {
             newCompositeNode(grammarAccess.getMergeEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeEntity=ruleMergeEntity();

            state._fsp--;

             current =iv_ruleMergeEntity; 
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
    // $ANTLR end "entryRuleMergeEntity"


    // $ANTLR start "ruleMergeEntity"
    // InternalThreatModelLanguage.g:1700:1: ruleMergeEntity returns [EObject current=null] : (this_MergeIntoProcess_0= ruleMergeIntoProcess | this_MergeIntoExternal_1= ruleMergeIntoExternal | this_MergeIntoDatastore_2= ruleMergeIntoDatastore ) ;
    public final EObject ruleMergeEntity() throws RecognitionException {
        EObject current = null;

        EObject this_MergeIntoProcess_0 = null;

        EObject this_MergeIntoExternal_1 = null;

        EObject this_MergeIntoDatastore_2 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1706:2: ( (this_MergeIntoProcess_0= ruleMergeIntoProcess | this_MergeIntoExternal_1= ruleMergeIntoExternal | this_MergeIntoDatastore_2= ruleMergeIntoDatastore ) )
            // InternalThreatModelLanguage.g:1707:2: (this_MergeIntoProcess_0= ruleMergeIntoProcess | this_MergeIntoExternal_1= ruleMergeIntoExternal | this_MergeIntoDatastore_2= ruleMergeIntoDatastore )
            {
            // InternalThreatModelLanguage.g:1707:2: (this_MergeIntoProcess_0= ruleMergeIntoProcess | this_MergeIntoExternal_1= ruleMergeIntoExternal | this_MergeIntoDatastore_2= ruleMergeIntoDatastore )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_ID) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==32) ) {
                        int LA32_3 = input.LA(4);

                        if ( (LA32_3==RULE_ID) ) {
                            int LA32_4 = input.LA(5);

                            if ( (LA32_4==24) ) {
                                switch ( input.LA(6) ) {
                                case 12:
                                    {
                                    alt32=1;
                                    }
                                    break;
                                case 15:
                                    {
                                    alt32=2;
                                    }
                                    break;
                                case 17:
                                    {
                                    alt32=3;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 32, 5, input);

                                    throw nvae;
                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalThreatModelLanguage.g:1708:3: this_MergeIntoProcess_0= ruleMergeIntoProcess
                    {

                    			newCompositeNode(grammarAccess.getMergeEntityAccess().getMergeIntoProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeIntoProcess_0=ruleMergeIntoProcess();

                    state._fsp--;


                    			current = this_MergeIntoProcess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:1717:3: this_MergeIntoExternal_1= ruleMergeIntoExternal
                    {

                    			newCompositeNode(grammarAccess.getMergeEntityAccess().getMergeIntoExternalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeIntoExternal_1=ruleMergeIntoExternal();

                    state._fsp--;


                    			current = this_MergeIntoExternal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:1726:3: this_MergeIntoDatastore_2= ruleMergeIntoDatastore
                    {

                    			newCompositeNode(grammarAccess.getMergeEntityAccess().getMergeIntoDatastoreParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeIntoDatastore_2=ruleMergeIntoDatastore();

                    state._fsp--;


                    			current = this_MergeIntoDatastore_2;
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
    // $ANTLR end "ruleMergeEntity"


    // $ANTLR start "entryRuleMergeIntoProcess"
    // InternalThreatModelLanguage.g:1738:1: entryRuleMergeIntoProcess returns [EObject current=null] : iv_ruleMergeIntoProcess= ruleMergeIntoProcess EOF ;
    public final EObject entryRuleMergeIntoProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeIntoProcess = null;


        try {
            // InternalThreatModelLanguage.g:1738:57: (iv_ruleMergeIntoProcess= ruleMergeIntoProcess EOF )
            // InternalThreatModelLanguage.g:1739:2: iv_ruleMergeIntoProcess= ruleMergeIntoProcess EOF
            {
             newCompositeNode(grammarAccess.getMergeIntoProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeIntoProcess=ruleMergeIntoProcess();

            state._fsp--;

             current =iv_ruleMergeIntoProcess; 
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
    // $ANTLR end "entryRuleMergeIntoProcess"


    // $ANTLR start "ruleMergeIntoProcess"
    // InternalThreatModelLanguage.g:1745:1: ruleMergeIntoProcess returns [EObject current=null] : (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'process' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? ) ;
    public final EObject ruleMergeIntoProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entity1_1_0=null;
        Token otherlv_2=null;
        Token lv_entity2_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token lv_documentation_11_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1751:2: ( (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'process' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1752:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'process' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1752:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'process' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1753:3: otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'process' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeIntoProcessAccess().getMergeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1757:3: ( (lv_entity1_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1758:4: (lv_entity1_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1758:4: (lv_entity1_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1759:5: lv_entity1_1_0= RULE_ID
            {
            lv_entity1_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_entity1_1_0, grammarAccess.getMergeIntoProcessAccess().getEntity1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeIntoProcessAccess().getAndKeyword_2());
            		
            // InternalThreatModelLanguage.g:1779:3: ( (lv_entity2_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1780:4: (lv_entity2_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1780:4: (lv_entity2_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1781:5: lv_entity2_3_0= RULE_ID
            {
            lv_entity2_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_entity2_3_0, grammarAccess.getMergeIntoProcessAccess().getEntity2IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeIntoProcessAccess().getIntoKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getMergeIntoProcessAccess().getProcessKeyword_5());
            		
            // InternalThreatModelLanguage.g:1805:3: ( (lv_id_6_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1806:4: (lv_id_6_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1806:4: (lv_id_6_0= RULE_ID )
            // InternalThreatModelLanguage.g:1807:5: lv_id_6_0= RULE_ID
            {
            lv_id_6_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_6_0, grammarAccess.getMergeIntoProcessAccess().getIdIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1823:3: (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalThreatModelLanguage.g:1824:4: otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getMergeIntoProcessAccess().getNameKeyword_7_0());
                    			
                    // InternalThreatModelLanguage.g:1828:4: ( (lv_name_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:1829:5: (lv_name_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1829:5: (lv_name_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1830:6: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getMergeIntoProcessAccess().getNameSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:1847:3: (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalThreatModelLanguage.g:1848:4: otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMergeIntoProcessAccess().getDscKeyword_8_0());
                    			
                    // InternalThreatModelLanguage.g:1852:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:1853:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1853:5: (lv_description_10_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1854:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_10_0, grammarAccess.getMergeIntoProcessAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:1871:3: ( (lv_documentation_11_0= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalThreatModelLanguage.g:1872:4: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1872:4: (lv_documentation_11_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1873:5: lv_documentation_11_0= RULE_STRING
                    {
                    lv_documentation_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_11_0, grammarAccess.getMergeIntoProcessAccess().getDocumentationSTRINGTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMergeIntoProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_11_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleMergeIntoProcess"


    // $ANTLR start "entryRuleMergeIntoExternal"
    // InternalThreatModelLanguage.g:1893:1: entryRuleMergeIntoExternal returns [EObject current=null] : iv_ruleMergeIntoExternal= ruleMergeIntoExternal EOF ;
    public final EObject entryRuleMergeIntoExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeIntoExternal = null;


        try {
            // InternalThreatModelLanguage.g:1893:58: (iv_ruleMergeIntoExternal= ruleMergeIntoExternal EOF )
            // InternalThreatModelLanguage.g:1894:2: iv_ruleMergeIntoExternal= ruleMergeIntoExternal EOF
            {
             newCompositeNode(grammarAccess.getMergeIntoExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeIntoExternal=ruleMergeIntoExternal();

            state._fsp--;

             current =iv_ruleMergeIntoExternal; 
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
    // $ANTLR end "entryRuleMergeIntoExternal"


    // $ANTLR start "ruleMergeIntoExternal"
    // InternalThreatModelLanguage.g:1900:1: ruleMergeIntoExternal returns [EObject current=null] : (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'external' otherlv_6= 'entity' ( (lv_id_7_0= RULE_ID ) ) (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_documentation_12_0= RULE_STRING ) )? ) ;
    public final EObject ruleMergeIntoExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entity1_1_0=null;
        Token otherlv_2=null;
        Token lv_entity2_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token lv_documentation_12_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:1906:2: ( (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'external' otherlv_6= 'entity' ( (lv_id_7_0= RULE_ID ) ) (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_documentation_12_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:1907:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'external' otherlv_6= 'entity' ( (lv_id_7_0= RULE_ID ) ) (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_documentation_12_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:1907:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'external' otherlv_6= 'entity' ( (lv_id_7_0= RULE_ID ) ) (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_documentation_12_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:1908:3: otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'external' otherlv_6= 'entity' ( (lv_id_7_0= RULE_ID ) ) (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )? (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )? ( (lv_documentation_12_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeIntoExternalAccess().getMergeKeyword_0());
            		
            // InternalThreatModelLanguage.g:1912:3: ( (lv_entity1_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1913:4: (lv_entity1_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1913:4: (lv_entity1_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:1914:5: lv_entity1_1_0= RULE_ID
            {
            lv_entity1_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_entity1_1_0, grammarAccess.getMergeIntoExternalAccess().getEntity1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeIntoExternalAccess().getAndKeyword_2());
            		
            // InternalThreatModelLanguage.g:1934:3: ( (lv_entity2_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1935:4: (lv_entity2_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1935:4: (lv_entity2_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:1936:5: lv_entity2_3_0= RULE_ID
            {
            lv_entity2_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_entity2_3_0, grammarAccess.getMergeIntoExternalAccess().getEntity2IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeIntoExternalAccess().getIntoKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMergeIntoExternalAccess().getExternalKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getMergeIntoExternalAccess().getEntityKeyword_6());
            		
            // InternalThreatModelLanguage.g:1964:3: ( (lv_id_7_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:1965:4: (lv_id_7_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:1965:4: (lv_id_7_0= RULE_ID )
            // InternalThreatModelLanguage.g:1966:5: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_7_0, grammarAccess.getMergeIntoExternalAccess().getIdIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:1982:3: (otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==13) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalThreatModelLanguage.g:1983:4: otherlv_8= 'name' ( (lv_name_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMergeIntoExternalAccess().getNameKeyword_8_0());
                    			
                    // InternalThreatModelLanguage.g:1987:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:1988:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:1988:5: (lv_name_9_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:1989:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getMergeIntoExternalAccess().getNameSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2006:3: (otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalThreatModelLanguage.g:2007:4: otherlv_10= 'dsc' ( (lv_description_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getMergeIntoExternalAccess().getDscKeyword_9_0());
                    			
                    // InternalThreatModelLanguage.g:2011:4: ( (lv_description_11_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2012:5: (lv_description_11_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2012:5: (lv_description_11_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2013:6: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_11_0, grammarAccess.getMergeIntoExternalAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2030:3: ( (lv_documentation_12_0= RULE_STRING ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalThreatModelLanguage.g:2031:4: (lv_documentation_12_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2031:4: (lv_documentation_12_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2032:5: lv_documentation_12_0= RULE_STRING
                    {
                    lv_documentation_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_12_0, grammarAccess.getMergeIntoExternalAccess().getDocumentationSTRINGTerminalRuleCall_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMergeIntoExternalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_12_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleMergeIntoExternal"


    // $ANTLR start "entryRuleMergeIntoDatastore"
    // InternalThreatModelLanguage.g:2052:1: entryRuleMergeIntoDatastore returns [EObject current=null] : iv_ruleMergeIntoDatastore= ruleMergeIntoDatastore EOF ;
    public final EObject entryRuleMergeIntoDatastore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeIntoDatastore = null;


        try {
            // InternalThreatModelLanguage.g:2052:59: (iv_ruleMergeIntoDatastore= ruleMergeIntoDatastore EOF )
            // InternalThreatModelLanguage.g:2053:2: iv_ruleMergeIntoDatastore= ruleMergeIntoDatastore EOF
            {
             newCompositeNode(grammarAccess.getMergeIntoDatastoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeIntoDatastore=ruleMergeIntoDatastore();

            state._fsp--;

             current =iv_ruleMergeIntoDatastore; 
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
    // $ANTLR end "entryRuleMergeIntoDatastore"


    // $ANTLR start "ruleMergeIntoDatastore"
    // InternalThreatModelLanguage.g:2059:1: ruleMergeIntoDatastore returns [EObject current=null] : (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'datastore' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? ) ;
    public final EObject ruleMergeIntoDatastore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_entity1_1_0=null;
        Token otherlv_2=null;
        Token lv_entity2_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token lv_documentation_11_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2065:2: ( (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'datastore' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:2066:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'datastore' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:2066:2: (otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'datastore' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:2067:3: otherlv_0= 'merge' ( (lv_entity1_1_0= RULE_ID ) ) otherlv_2= 'and' ( (lv_entity2_3_0= RULE_ID ) ) otherlv_4= 'into' otherlv_5= 'datastore' ( (lv_id_6_0= RULE_ID ) ) (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )? ( (lv_documentation_11_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMergeIntoDatastoreAccess().getMergeKeyword_0());
            		
            // InternalThreatModelLanguage.g:2071:3: ( (lv_entity1_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2072:4: (lv_entity1_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2072:4: (lv_entity1_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:2073:5: lv_entity1_1_0= RULE_ID
            {
            lv_entity1_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_entity1_1_0, grammarAccess.getMergeIntoDatastoreAccess().getEntity1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMergeIntoDatastoreAccess().getAndKeyword_2());
            		
            // InternalThreatModelLanguage.g:2093:3: ( (lv_entity2_3_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2094:4: (lv_entity2_3_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2094:4: (lv_entity2_3_0= RULE_ID )
            // InternalThreatModelLanguage.g:2095:5: lv_entity2_3_0= RULE_ID
            {
            lv_entity2_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_entity2_3_0, grammarAccess.getMergeIntoDatastoreAccess().getEntity2IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getMergeIntoDatastoreAccess().getIntoKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getMergeIntoDatastoreAccess().getDatastoreKeyword_5());
            		
            // InternalThreatModelLanguage.g:2119:3: ( (lv_id_6_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2120:4: (lv_id_6_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2120:4: (lv_id_6_0= RULE_ID )
            // InternalThreatModelLanguage.g:2121:5: lv_id_6_0= RULE_ID
            {
            lv_id_6_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_6_0, grammarAccess.getMergeIntoDatastoreAccess().getIdIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2137:3: (otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalThreatModelLanguage.g:2138:4: otherlv_7= 'name' ( (lv_name_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getMergeIntoDatastoreAccess().getNameKeyword_7_0());
                    			
                    // InternalThreatModelLanguage.g:2142:4: ( (lv_name_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2143:5: (lv_name_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2143:5: (lv_name_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2144:6: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getMergeIntoDatastoreAccess().getNameSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2161:3: (otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalThreatModelLanguage.g:2162:4: otherlv_9= 'dsc' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMergeIntoDatastoreAccess().getDscKeyword_8_0());
                    			
                    // InternalThreatModelLanguage.g:2166:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2167:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2167:5: (lv_description_10_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2168:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_description_10_0, grammarAccess.getMergeIntoDatastoreAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2185:3: ( (lv_documentation_11_0= RULE_STRING ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalThreatModelLanguage.g:2186:4: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2186:4: (lv_documentation_11_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2187:5: lv_documentation_11_0= RULE_STRING
                    {
                    lv_documentation_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_11_0, grammarAccess.getMergeIntoDatastoreAccess().getDocumentationSTRINGTerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMergeIntoDatastoreRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_11_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleMergeIntoDatastore"


    // $ANTLR start "entryRuleSplitEntity"
    // InternalThreatModelLanguage.g:2207:1: entryRuleSplitEntity returns [EObject current=null] : iv_ruleSplitEntity= ruleSplitEntity EOF ;
    public final EObject entryRuleSplitEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitEntity = null;


        try {
            // InternalThreatModelLanguage.g:2207:52: (iv_ruleSplitEntity= ruleSplitEntity EOF )
            // InternalThreatModelLanguage.g:2208:2: iv_ruleSplitEntity= ruleSplitEntity EOF
            {
             newCompositeNode(grammarAccess.getSplitEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitEntity=ruleSplitEntity();

            state._fsp--;

             current =iv_ruleSplitEntity; 
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
    // $ANTLR end "entryRuleSplitEntity"


    // $ANTLR start "ruleSplitEntity"
    // InternalThreatModelLanguage.g:2214:1: ruleSplitEntity returns [EObject current=null] : (this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess | this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore | this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess | this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal | this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess | this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal | this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore | this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore | this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal ) ;
    public final EObject ruleSplitEntity() throws RecognitionException {
        EObject current = null;

        EObject this_SplitProcessAndProcess_0 = null;

        EObject this_SplitsProcessAndDatastore_1 = null;

        EObject this_SplitsDatastoreAndProcess_2 = null;

        EObject this_SplitProcessAndExternal_3 = null;

        EObject this_SplitExternalAndProcess_4 = null;

        EObject this_SplitDatastoreAndExternal_5 = null;

        EObject this_SplitExternalAndDatastore_6 = null;

        EObject this_SplitDatastoreAndDatastore_7 = null;

        EObject this_SplitExternalAndExternal_8 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2220:2: ( (this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess | this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore | this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess | this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal | this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess | this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal | this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore | this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore | this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal ) )
            // InternalThreatModelLanguage.g:2221:2: (this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess | this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore | this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess | this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal | this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess | this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal | this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore | this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore | this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal )
            {
            // InternalThreatModelLanguage.g:2221:2: (this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess | this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore | this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess | this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal | this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess | this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal | this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore | this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore | this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal )
            int alt42=9;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalThreatModelLanguage.g:2222:3: this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitProcessAndProcessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitProcessAndProcess_0=ruleSplitProcessAndProcess();

                    state._fsp--;


                    			current = this_SplitProcessAndProcess_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:2231:3: this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitsProcessAndDatastoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitsProcessAndDatastore_1=ruleSplitsProcessAndDatastore();

                    state._fsp--;


                    			current = this_SplitsProcessAndDatastore_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:2240:3: this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitsDatastoreAndProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitsDatastoreAndProcess_2=ruleSplitsDatastoreAndProcess();

                    state._fsp--;


                    			current = this_SplitsDatastoreAndProcess_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalThreatModelLanguage.g:2249:3: this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitProcessAndExternalParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitProcessAndExternal_3=ruleSplitProcessAndExternal();

                    state._fsp--;


                    			current = this_SplitProcessAndExternal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalThreatModelLanguage.g:2258:3: this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitExternalAndProcessParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitExternalAndProcess_4=ruleSplitExternalAndProcess();

                    state._fsp--;


                    			current = this_SplitExternalAndProcess_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalThreatModelLanguage.g:2267:3: this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitDatastoreAndExternalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitDatastoreAndExternal_5=ruleSplitDatastoreAndExternal();

                    state._fsp--;


                    			current = this_SplitDatastoreAndExternal_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalThreatModelLanguage.g:2276:3: this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitExternalAndDatastoreParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitExternalAndDatastore_6=ruleSplitExternalAndDatastore();

                    state._fsp--;


                    			current = this_SplitExternalAndDatastore_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalThreatModelLanguage.g:2285:3: this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitDatastoreAndDatastoreParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitDatastoreAndDatastore_7=ruleSplitDatastoreAndDatastore();

                    state._fsp--;


                    			current = this_SplitDatastoreAndDatastore_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalThreatModelLanguage.g:2294:3: this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal
                    {

                    			newCompositeNode(grammarAccess.getSplitEntityAccess().getSplitExternalAndExternalParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SplitExternalAndExternal_8=ruleSplitExternalAndExternal();

                    state._fsp--;


                    			current = this_SplitExternalAndExternal_8;
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
    // $ANTLR end "ruleSplitEntity"


    // $ANTLR start "entryRuleFlowFix"
    // InternalThreatModelLanguage.g:2306:1: entryRuleFlowFix returns [EObject current=null] : iv_ruleFlowFix= ruleFlowFix EOF ;
    public final EObject entryRuleFlowFix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowFix = null;


        try {
            // InternalThreatModelLanguage.g:2306:48: (iv_ruleFlowFix= ruleFlowFix EOF )
            // InternalThreatModelLanguage.g:2307:2: iv_ruleFlowFix= ruleFlowFix EOF
            {
             newCompositeNode(grammarAccess.getFlowFixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlowFix=ruleFlowFix();

            state._fsp--;

             current =iv_ruleFlowFix; 
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
    // $ANTLR end "entryRuleFlowFix"


    // $ANTLR start "ruleFlowFix"
    // InternalThreatModelLanguage.g:2313:1: ruleFlowFix returns [EObject current=null] : ( ( (lv_flowId_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entityId_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFlowFix() throws RecognitionException {
        EObject current = null;

        Token lv_flowId_0_0=null;
        Token otherlv_1=null;
        Token lv_entityId_2_0=null;


        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2319:2: ( ( ( (lv_flowId_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entityId_2_0= RULE_ID ) ) ) )
            // InternalThreatModelLanguage.g:2320:2: ( ( (lv_flowId_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entityId_2_0= RULE_ID ) ) )
            {
            // InternalThreatModelLanguage.g:2320:2: ( ( (lv_flowId_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entityId_2_0= RULE_ID ) ) )
            // InternalThreatModelLanguage.g:2321:3: ( (lv_flowId_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entityId_2_0= RULE_ID ) )
            {
            // InternalThreatModelLanguage.g:2321:3: ( (lv_flowId_0_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2322:4: (lv_flowId_0_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2322:4: (lv_flowId_0_0= RULE_ID )
            // InternalThreatModelLanguage.g:2323:5: lv_flowId_0_0= RULE_ID
            {
            lv_flowId_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_flowId_0_0, grammarAccess.getFlowFixAccess().getFlowIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowFixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flowId",
            						lv_flowId_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFlowFixAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalThreatModelLanguage.g:2343:3: ( (lv_entityId_2_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2344:4: (lv_entityId_2_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2344:4: (lv_entityId_2_0= RULE_ID )
            // InternalThreatModelLanguage.g:2345:5: lv_entityId_2_0= RULE_ID
            {
            lv_entityId_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_entityId_2_0, grammarAccess.getFlowFixAccess().getEntityIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowFixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entityId",
            						lv_entityId_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFlowFix"


    // $ANTLR start "entryRuleSplitProcessAndProcess"
    // InternalThreatModelLanguage.g:2365:1: entryRuleSplitProcessAndProcess returns [EObject current=null] : iv_ruleSplitProcessAndProcess= ruleSplitProcessAndProcess EOF ;
    public final EObject entryRuleSplitProcessAndProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitProcessAndProcess = null;


        try {
            // InternalThreatModelLanguage.g:2365:63: (iv_ruleSplitProcessAndProcess= ruleSplitProcessAndProcess EOF )
            // InternalThreatModelLanguage.g:2366:2: iv_ruleSplitProcessAndProcess= ruleSplitProcessAndProcess EOF
            {
             newCompositeNode(grammarAccess.getSplitProcessAndProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitProcessAndProcess=ruleSplitProcessAndProcess();

            state._fsp--;

             current =iv_ruleSplitProcessAndProcess; 
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
    // $ANTLR end "entryRuleSplitProcessAndProcess"


    // $ANTLR start "ruleSplitProcessAndProcess"
    // InternalThreatModelLanguage.g:2372:1: ruleSplitProcessAndProcess returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitProcessAndProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_entity2_11_0=null;
        Token otherlv_12=null;
        Token lv_entity2Name_13_0=null;
        Token otherlv_14=null;
        Token lv_entity2Description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_documentation_20_0=null;
        EObject lv_flowFix_18_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2378:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:2379:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:2379:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:2380:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitProcessAndProcessAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:2384:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2385:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2385:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:2386:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitProcessAndProcessAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitProcessAndProcessAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitProcessAndProcessAccess().getProcessKeyword_3());
            		
            // InternalThreatModelLanguage.g:2410:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2411:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2411:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:2412:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2428:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalThreatModelLanguage.g:2429:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitProcessAndProcessAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:2433:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2434:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2434:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2435:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2452:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalThreatModelLanguage.g:2453:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitProcessAndProcessAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:2457:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2458:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2458:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2459:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitProcessAndProcessAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitProcessAndProcessAccess().getProcessKeyword_8());
            		
            // InternalThreatModelLanguage.g:2484:3: ( (lv_entity2_11_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2485:4: (lv_entity2_11_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2485:4: (lv_entity2_11_0= RULE_ID )
            // InternalThreatModelLanguage.g:2486:5: lv_entity2_11_0= RULE_ID
            {
            lv_entity2_11_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_11_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity2IDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2502:3: (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalThreatModelLanguage.g:2503:4: otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSplitProcessAndProcessAccess().getNameKeyword_10_0());
                    			
                    // InternalThreatModelLanguage.g:2507:4: ( (lv_entity2Name_13_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2508:5: (lv_entity2Name_13_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2508:5: (lv_entity2Name_13_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2509:6: lv_entity2Name_13_0= RULE_STRING
                    {
                    lv_entity2Name_13_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_13_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity2NameSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2526:3: (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalThreatModelLanguage.g:2527:4: otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSplitProcessAndProcessAccess().getDscKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:2531:4: ( (lv_entity2Description_15_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2532:5: (lv_entity2Description_15_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2532:5: (lv_entity2Description_15_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2533:6: lv_entity2Description_15_0= RULE_STRING
                    {
                    lv_entity2Description_15_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_15_0, grammarAccess.getSplitProcessAndProcessAccess().getEntity2DescriptionSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getSplitProcessAndProcessAccess().getFlowsKeyword_12());
            		
            otherlv_17=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitProcessAndProcessAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalThreatModelLanguage.g:2558:3: ( (lv_flowFix_18_0= ruleFlowFix ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:2559:4: (lv_flowFix_18_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:2559:4: (lv_flowFix_18_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:2560:5: lv_flowFix_18_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitProcessAndProcessAccess().getFlowFixFlowFixParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_18_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitProcessAndProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_18_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_19=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getSplitProcessAndProcessAccess().getRightCurlyBracketKeyword_15());
            		
            // InternalThreatModelLanguage.g:2581:3: ( (lv_documentation_20_0= RULE_STRING ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalThreatModelLanguage.g:2582:4: (lv_documentation_20_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2582:4: (lv_documentation_20_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2583:5: lv_documentation_20_0= RULE_STRING
                    {
                    lv_documentation_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_20_0, grammarAccess.getSplitProcessAndProcessAccess().getDocumentationSTRINGTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitProcessAndProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_20_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitProcessAndProcess"


    // $ANTLR start "entryRuleSplitsProcessAndDatastore"
    // InternalThreatModelLanguage.g:2603:1: entryRuleSplitsProcessAndDatastore returns [EObject current=null] : iv_ruleSplitsProcessAndDatastore= ruleSplitsProcessAndDatastore EOF ;
    public final EObject entryRuleSplitsProcessAndDatastore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitsProcessAndDatastore = null;


        try {
            // InternalThreatModelLanguage.g:2603:66: (iv_ruleSplitsProcessAndDatastore= ruleSplitsProcessAndDatastore EOF )
            // InternalThreatModelLanguage.g:2604:2: iv_ruleSplitsProcessAndDatastore= ruleSplitsProcessAndDatastore EOF
            {
             newCompositeNode(grammarAccess.getSplitsProcessAndDatastoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitsProcessAndDatastore=ruleSplitsProcessAndDatastore();

            state._fsp--;

             current =iv_ruleSplitsProcessAndDatastore; 
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
    // $ANTLR end "entryRuleSplitsProcessAndDatastore"


    // $ANTLR start "ruleSplitsProcessAndDatastore"
    // InternalThreatModelLanguage.g:2610:1: ruleSplitsProcessAndDatastore returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitsProcessAndDatastore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_entity2_11_0=null;
        Token otherlv_12=null;
        Token lv_entity2Name_13_0=null;
        Token otherlv_14=null;
        Token lv_entity2Description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_documentation_20_0=null;
        EObject lv_flowFix_18_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2616:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:2617:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:2617:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:2618:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:2622:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2623:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2623:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:2624:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitsProcessAndDatastoreAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitsProcessAndDatastoreAccess().getProcessKeyword_3());
            		
            // InternalThreatModelLanguage.g:2648:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2649:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2649:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:2650:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2666:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==13) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalThreatModelLanguage.g:2667:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitsProcessAndDatastoreAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:2671:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2672:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2672:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2673:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2690:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==14) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalThreatModelLanguage.g:2691:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitsProcessAndDatastoreAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:2695:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2696:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2696:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2697:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitsProcessAndDatastoreAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitsProcessAndDatastoreAccess().getDatastoreKeyword_8());
            		
            // InternalThreatModelLanguage.g:2722:3: ( (lv_entity2_11_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2723:4: (lv_entity2_11_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2723:4: (lv_entity2_11_0= RULE_ID )
            // InternalThreatModelLanguage.g:2724:5: lv_entity2_11_0= RULE_ID
            {
            lv_entity2_11_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_11_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity2IDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2740:3: (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalThreatModelLanguage.g:2741:4: otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSplitsProcessAndDatastoreAccess().getNameKeyword_10_0());
                    			
                    // InternalThreatModelLanguage.g:2745:4: ( (lv_entity2Name_13_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2746:5: (lv_entity2Name_13_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2746:5: (lv_entity2Name_13_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2747:6: lv_entity2Name_13_0= RULE_STRING
                    {
                    lv_entity2Name_13_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_13_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity2NameSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2764:3: (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==14) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalThreatModelLanguage.g:2765:4: otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSplitsProcessAndDatastoreAccess().getDscKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:2769:4: ( (lv_entity2Description_15_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2770:5: (lv_entity2Description_15_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2770:5: (lv_entity2Description_15_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2771:6: lv_entity2Description_15_0= RULE_STRING
                    {
                    lv_entity2Description_15_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_15_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getEntity2DescriptionSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getSplitsProcessAndDatastoreAccess().getFlowsKeyword_12());
            		
            otherlv_17=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitsProcessAndDatastoreAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalThreatModelLanguage.g:2796:3: ( (lv_flowFix_18_0= ruleFlowFix ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:2797:4: (lv_flowFix_18_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:2797:4: (lv_flowFix_18_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:2798:5: lv_flowFix_18_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitsProcessAndDatastoreAccess().getFlowFixFlowFixParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_18_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitsProcessAndDatastoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_18_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_19=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getSplitsProcessAndDatastoreAccess().getRightCurlyBracketKeyword_15());
            		
            // InternalThreatModelLanguage.g:2819:3: ( (lv_documentation_20_0= RULE_STRING ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalThreatModelLanguage.g:2820:4: (lv_documentation_20_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2820:4: (lv_documentation_20_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2821:5: lv_documentation_20_0= RULE_STRING
                    {
                    lv_documentation_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_20_0, grammarAccess.getSplitsProcessAndDatastoreAccess().getDocumentationSTRINGTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitsProcessAndDatastoreRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_20_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitsProcessAndDatastore"


    // $ANTLR start "entryRuleSplitsDatastoreAndProcess"
    // InternalThreatModelLanguage.g:2841:1: entryRuleSplitsDatastoreAndProcess returns [EObject current=null] : iv_ruleSplitsDatastoreAndProcess= ruleSplitsDatastoreAndProcess EOF ;
    public final EObject entryRuleSplitsDatastoreAndProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitsDatastoreAndProcess = null;


        try {
            // InternalThreatModelLanguage.g:2841:66: (iv_ruleSplitsDatastoreAndProcess= ruleSplitsDatastoreAndProcess EOF )
            // InternalThreatModelLanguage.g:2842:2: iv_ruleSplitsDatastoreAndProcess= ruleSplitsDatastoreAndProcess EOF
            {
             newCompositeNode(grammarAccess.getSplitsDatastoreAndProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitsDatastoreAndProcess=ruleSplitsDatastoreAndProcess();

            state._fsp--;

             current =iv_ruleSplitsDatastoreAndProcess; 
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
    // $ANTLR end "entryRuleSplitsDatastoreAndProcess"


    // $ANTLR start "ruleSplitsDatastoreAndProcess"
    // InternalThreatModelLanguage.g:2848:1: ruleSplitsDatastoreAndProcess returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitsDatastoreAndProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_entity2_11_0=null;
        Token otherlv_12=null;
        Token lv_entity2Name_13_0=null;
        Token otherlv_14=null;
        Token lv_entity2Description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_documentation_20_0=null;
        EObject lv_flowFix_18_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:2854:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:2855:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:2855:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:2856:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'process' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:2860:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2861:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2861:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:2862:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitsDatastoreAndProcessAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitsDatastoreAndProcessAccess().getDatastoreKeyword_3());
            		
            // InternalThreatModelLanguage.g:2886:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2887:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2887:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:2888:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2904:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalThreatModelLanguage.g:2905:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitsDatastoreAndProcessAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:2909:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2910:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2910:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2911:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:2928:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==14) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalThreatModelLanguage.g:2929:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitsDatastoreAndProcessAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:2933:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2934:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2934:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2935:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitsDatastoreAndProcessAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitsDatastoreAndProcessAccess().getProcessKeyword_8());
            		
            // InternalThreatModelLanguage.g:2960:3: ( (lv_entity2_11_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:2961:4: (lv_entity2_11_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:2961:4: (lv_entity2_11_0= RULE_ID )
            // InternalThreatModelLanguage.g:2962:5: lv_entity2_11_0= RULE_ID
            {
            lv_entity2_11_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_11_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity2IDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:2978:3: (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==13) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalThreatModelLanguage.g:2979:4: otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSplitsDatastoreAndProcessAccess().getNameKeyword_10_0());
                    			
                    // InternalThreatModelLanguage.g:2983:4: ( (lv_entity2Name_13_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:2984:5: (lv_entity2Name_13_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:2984:5: (lv_entity2Name_13_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:2985:6: lv_entity2Name_13_0= RULE_STRING
                    {
                    lv_entity2Name_13_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_13_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity2NameSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3002:3: (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==14) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalThreatModelLanguage.g:3003:4: otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSplitsDatastoreAndProcessAccess().getDscKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:3007:4: ( (lv_entity2Description_15_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3008:5: (lv_entity2Description_15_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3008:5: (lv_entity2Description_15_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3009:6: lv_entity2Description_15_0= RULE_STRING
                    {
                    lv_entity2Description_15_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_15_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getEntity2DescriptionSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getSplitsDatastoreAndProcessAccess().getFlowsKeyword_12());
            		
            otherlv_17=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitsDatastoreAndProcessAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalThreatModelLanguage.g:3034:3: ( (lv_flowFix_18_0= ruleFlowFix ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:3035:4: (lv_flowFix_18_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:3035:4: (lv_flowFix_18_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:3036:5: lv_flowFix_18_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitsDatastoreAndProcessAccess().getFlowFixFlowFixParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_18_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitsDatastoreAndProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_18_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_19=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getSplitsDatastoreAndProcessAccess().getRightCurlyBracketKeyword_15());
            		
            // InternalThreatModelLanguage.g:3057:3: ( (lv_documentation_20_0= RULE_STRING ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalThreatModelLanguage.g:3058:4: (lv_documentation_20_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3058:4: (lv_documentation_20_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3059:5: lv_documentation_20_0= RULE_STRING
                    {
                    lv_documentation_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_20_0, grammarAccess.getSplitsDatastoreAndProcessAccess().getDocumentationSTRINGTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitsDatastoreAndProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_20_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitsDatastoreAndProcess"


    // $ANTLR start "entryRuleSplitProcessAndExternal"
    // InternalThreatModelLanguage.g:3079:1: entryRuleSplitProcessAndExternal returns [EObject current=null] : iv_ruleSplitProcessAndExternal= ruleSplitProcessAndExternal EOF ;
    public final EObject entryRuleSplitProcessAndExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitProcessAndExternal = null;


        try {
            // InternalThreatModelLanguage.g:3079:64: (iv_ruleSplitProcessAndExternal= ruleSplitProcessAndExternal EOF )
            // InternalThreatModelLanguage.g:3080:2: iv_ruleSplitProcessAndExternal= ruleSplitProcessAndExternal EOF
            {
             newCompositeNode(grammarAccess.getSplitProcessAndExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitProcessAndExternal=ruleSplitProcessAndExternal();

            state._fsp--;

             current =iv_ruleSplitProcessAndExternal; 
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
    // $ANTLR end "entryRuleSplitProcessAndExternal"


    // $ANTLR start "ruleSplitProcessAndExternal"
    // InternalThreatModelLanguage.g:3086:1: ruleSplitProcessAndExternal returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitProcessAndExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_entity2_12_0=null;
        Token otherlv_13=null;
        Token lv_entity2Name_14_0=null;
        Token otherlv_15=null;
        Token lv_entity2Description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_documentation_21_0=null;
        EObject lv_flowFix_19_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:3092:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:3093:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:3093:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:3094:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'process' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitProcessAndExternalAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:3098:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3099:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3099:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:3100:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitProcessAndExternalAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitProcessAndExternalAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitProcessAndExternalAccess().getProcessKeyword_3());
            		
            // InternalThreatModelLanguage.g:3124:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3125:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3125:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:3126:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3142:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==13) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalThreatModelLanguage.g:3143:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitProcessAndExternalAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:3147:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3148:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3148:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3149:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3166:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==14) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalThreatModelLanguage.g:3167:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitProcessAndExternalAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:3171:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3172:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3172:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3173:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitProcessAndExternalAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitProcessAndExternalAccess().getExternalKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitProcessAndExternalAccess().getEntityKeyword_9());
            		
            // InternalThreatModelLanguage.g:3202:3: ( (lv_entity2_12_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3203:4: (lv_entity2_12_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3203:4: (lv_entity2_12_0= RULE_ID )
            // InternalThreatModelLanguage.g:3204:5: lv_entity2_12_0= RULE_ID
            {
            lv_entity2_12_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_12_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity2IDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3220:3: (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==13) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalThreatModelLanguage.g:3221:4: otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getSplitProcessAndExternalAccess().getNameKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:3225:4: ( (lv_entity2Name_14_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3226:5: (lv_entity2Name_14_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3226:5: (lv_entity2Name_14_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3227:6: lv_entity2Name_14_0= RULE_STRING
                    {
                    lv_entity2Name_14_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_14_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity2NameSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3244:3: (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==14) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalThreatModelLanguage.g:3245:4: otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getSplitProcessAndExternalAccess().getDscKeyword_12_0());
                    			
                    // InternalThreatModelLanguage.g:3249:4: ( (lv_entity2Description_16_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3250:5: (lv_entity2Description_16_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3250:5: (lv_entity2Description_16_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3251:6: lv_entity2Description_16_0= RULE_STRING
                    {
                    lv_entity2Description_16_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_16_0, grammarAccess.getSplitProcessAndExternalAccess().getEntity2DescriptionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitProcessAndExternalAccess().getFlowsKeyword_13());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_18, grammarAccess.getSplitProcessAndExternalAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalThreatModelLanguage.g:3276:3: ( (lv_flowFix_19_0= ruleFlowFix ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:3277:4: (lv_flowFix_19_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:3277:4: (lv_flowFix_19_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:3278:5: lv_flowFix_19_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitProcessAndExternalAccess().getFlowFixFlowFixParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_19_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitProcessAndExternalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_19_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_20=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getSplitProcessAndExternalAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalThreatModelLanguage.g:3299:3: ( (lv_documentation_21_0= RULE_STRING ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalThreatModelLanguage.g:3300:4: (lv_documentation_21_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3300:4: (lv_documentation_21_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3301:5: lv_documentation_21_0= RULE_STRING
                    {
                    lv_documentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_21_0, grammarAccess.getSplitProcessAndExternalAccess().getDocumentationSTRINGTerminalRuleCall_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitProcessAndExternalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_21_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitProcessAndExternal"


    // $ANTLR start "entryRuleSplitExternalAndProcess"
    // InternalThreatModelLanguage.g:3321:1: entryRuleSplitExternalAndProcess returns [EObject current=null] : iv_ruleSplitExternalAndProcess= ruleSplitExternalAndProcess EOF ;
    public final EObject entryRuleSplitExternalAndProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitExternalAndProcess = null;


        try {
            // InternalThreatModelLanguage.g:3321:64: (iv_ruleSplitExternalAndProcess= ruleSplitExternalAndProcess EOF )
            // InternalThreatModelLanguage.g:3322:2: iv_ruleSplitExternalAndProcess= ruleSplitExternalAndProcess EOF
            {
             newCompositeNode(grammarAccess.getSplitExternalAndProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitExternalAndProcess=ruleSplitExternalAndProcess();

            state._fsp--;

             current =iv_ruleSplitExternalAndProcess; 
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
    // $ANTLR end "entryRuleSplitExternalAndProcess"


    // $ANTLR start "ruleSplitExternalAndProcess"
    // InternalThreatModelLanguage.g:3328:1: ruleSplitExternalAndProcess returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'process' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitExternalAndProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_entity1_5_0=null;
        Token otherlv_6=null;
        Token lv_entity1Name_7_0=null;
        Token otherlv_8=null;
        Token lv_entity1Description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_entity2_12_0=null;
        Token otherlv_13=null;
        Token lv_entity2Name_14_0=null;
        Token otherlv_15=null;
        Token lv_entity2Description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_documentation_21_0=null;
        EObject lv_flowFix_19_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:3334:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'process' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:3335:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'process' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:3335:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'process' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:3336:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'process' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitExternalAndProcessAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:3340:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3341:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3341:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:3342:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitExternalAndProcessAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitExternalAndProcessAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitExternalAndProcessAccess().getExternalKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitExternalAndProcessAccess().getEntityKeyword_4());
            		
            // InternalThreatModelLanguage.g:3370:3: ( (lv_entity1_5_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3371:4: (lv_entity1_5_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3371:4: (lv_entity1_5_0= RULE_ID )
            // InternalThreatModelLanguage.g:3372:5: lv_entity1_5_0= RULE_ID
            {
            lv_entity1_5_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_5_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity1IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3388:3: (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==13) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalThreatModelLanguage.g:3389:4: otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSplitExternalAndProcessAccess().getNameKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:3393:4: ( (lv_entity1Name_7_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3394:5: (lv_entity1Name_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3394:5: (lv_entity1Name_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3395:6: lv_entity1Name_7_0= RULE_STRING
                    {
                    lv_entity1Name_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_7_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity1NameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3412:3: (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==14) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalThreatModelLanguage.g:3413:4: otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSplitExternalAndProcessAccess().getDscKeyword_7_0());
                    			
                    // InternalThreatModelLanguage.g:3417:4: ( (lv_entity1Description_9_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3418:5: (lv_entity1Description_9_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3418:5: (lv_entity1Description_9_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3419:6: lv_entity1Description_9_0= RULE_STRING
                    {
                    lv_entity1Description_9_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_9_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity1DescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitExternalAndProcessAccess().getAndKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitExternalAndProcessAccess().getProcessKeyword_9());
            		
            // InternalThreatModelLanguage.g:3444:3: ( (lv_entity2_12_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3445:4: (lv_entity2_12_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3445:4: (lv_entity2_12_0= RULE_ID )
            // InternalThreatModelLanguage.g:3446:5: lv_entity2_12_0= RULE_ID
            {
            lv_entity2_12_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_12_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity2IDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3462:3: (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==13) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalThreatModelLanguage.g:3463:4: otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getSplitExternalAndProcessAccess().getNameKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:3467:4: ( (lv_entity2Name_14_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3468:5: (lv_entity2Name_14_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3468:5: (lv_entity2Name_14_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3469:6: lv_entity2Name_14_0= RULE_STRING
                    {
                    lv_entity2Name_14_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_14_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity2NameSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3486:3: (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==14) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalThreatModelLanguage.g:3487:4: otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getSplitExternalAndProcessAccess().getDscKeyword_12_0());
                    			
                    // InternalThreatModelLanguage.g:3491:4: ( (lv_entity2Description_16_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3492:5: (lv_entity2Description_16_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3492:5: (lv_entity2Description_16_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3493:6: lv_entity2Description_16_0= RULE_STRING
                    {
                    lv_entity2Description_16_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_16_0, grammarAccess.getSplitExternalAndProcessAccess().getEntity2DescriptionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitExternalAndProcessAccess().getFlowsKeyword_13());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_18, grammarAccess.getSplitExternalAndProcessAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalThreatModelLanguage.g:3518:3: ( (lv_flowFix_19_0= ruleFlowFix ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:3519:4: (lv_flowFix_19_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:3519:4: (lv_flowFix_19_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:3520:5: lv_flowFix_19_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitExternalAndProcessAccess().getFlowFixFlowFixParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_19_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitExternalAndProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_19_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_20=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getSplitExternalAndProcessAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalThreatModelLanguage.g:3541:3: ( (lv_documentation_21_0= RULE_STRING ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalThreatModelLanguage.g:3542:4: (lv_documentation_21_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3542:4: (lv_documentation_21_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3543:5: lv_documentation_21_0= RULE_STRING
                    {
                    lv_documentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_21_0, grammarAccess.getSplitExternalAndProcessAccess().getDocumentationSTRINGTerminalRuleCall_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitExternalAndProcessRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_21_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitExternalAndProcess"


    // $ANTLR start "entryRuleSplitDatastoreAndExternal"
    // InternalThreatModelLanguage.g:3563:1: entryRuleSplitDatastoreAndExternal returns [EObject current=null] : iv_ruleSplitDatastoreAndExternal= ruleSplitDatastoreAndExternal EOF ;
    public final EObject entryRuleSplitDatastoreAndExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitDatastoreAndExternal = null;


        try {
            // InternalThreatModelLanguage.g:3563:66: (iv_ruleSplitDatastoreAndExternal= ruleSplitDatastoreAndExternal EOF )
            // InternalThreatModelLanguage.g:3564:2: iv_ruleSplitDatastoreAndExternal= ruleSplitDatastoreAndExternal EOF
            {
             newCompositeNode(grammarAccess.getSplitDatastoreAndExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitDatastoreAndExternal=ruleSplitDatastoreAndExternal();

            state._fsp--;

             current =iv_ruleSplitDatastoreAndExternal; 
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
    // $ANTLR end "entryRuleSplitDatastoreAndExternal"


    // $ANTLR start "ruleSplitDatastoreAndExternal"
    // InternalThreatModelLanguage.g:3570:1: ruleSplitDatastoreAndExternal returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitDatastoreAndExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_entity2_12_0=null;
        Token otherlv_13=null;
        Token lv_entity2Name_14_0=null;
        Token otherlv_15=null;
        Token lv_entity2Description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_documentation_21_0=null;
        EObject lv_flowFix_19_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:3576:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:3577:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:3577:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:3578:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'external' otherlv_11= 'entity' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitDatastoreAndExternalAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:3582:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3583:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3583:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:3584:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitDatastoreAndExternalAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitDatastoreAndExternalAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitDatastoreAndExternalAccess().getDatastoreKeyword_3());
            		
            // InternalThreatModelLanguage.g:3608:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3609:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3609:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:3610:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3626:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==13) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalThreatModelLanguage.g:3627:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitDatastoreAndExternalAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:3631:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3632:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3632:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3633:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3650:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==14) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalThreatModelLanguage.g:3651:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitDatastoreAndExternalAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:3655:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3656:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3656:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3657:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitDatastoreAndExternalAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitDatastoreAndExternalAccess().getExternalKeyword_8());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitDatastoreAndExternalAccess().getEntityKeyword_9());
            		
            // InternalThreatModelLanguage.g:3686:3: ( (lv_entity2_12_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3687:4: (lv_entity2_12_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3687:4: (lv_entity2_12_0= RULE_ID )
            // InternalThreatModelLanguage.g:3688:5: lv_entity2_12_0= RULE_ID
            {
            lv_entity2_12_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_12_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity2IDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3704:3: (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==13) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalThreatModelLanguage.g:3705:4: otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getSplitDatastoreAndExternalAccess().getNameKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:3709:4: ( (lv_entity2Name_14_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3710:5: (lv_entity2Name_14_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3710:5: (lv_entity2Name_14_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3711:6: lv_entity2Name_14_0= RULE_STRING
                    {
                    lv_entity2Name_14_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_14_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity2NameSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3728:3: (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==14) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalThreatModelLanguage.g:3729:4: otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getSplitDatastoreAndExternalAccess().getDscKeyword_12_0());
                    			
                    // InternalThreatModelLanguage.g:3733:4: ( (lv_entity2Description_16_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3734:5: (lv_entity2Description_16_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3734:5: (lv_entity2Description_16_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3735:6: lv_entity2Description_16_0= RULE_STRING
                    {
                    lv_entity2Description_16_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_16_0, grammarAccess.getSplitDatastoreAndExternalAccess().getEntity2DescriptionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitDatastoreAndExternalAccess().getFlowsKeyword_13());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_18, grammarAccess.getSplitDatastoreAndExternalAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalThreatModelLanguage.g:3760:3: ( (lv_flowFix_19_0= ruleFlowFix ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_ID) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:3761:4: (lv_flowFix_19_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:3761:4: (lv_flowFix_19_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:3762:5: lv_flowFix_19_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitDatastoreAndExternalAccess().getFlowFixFlowFixParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_19_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitDatastoreAndExternalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_19_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_20=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getSplitDatastoreAndExternalAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalThreatModelLanguage.g:3783:3: ( (lv_documentation_21_0= RULE_STRING ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_STRING) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalThreatModelLanguage.g:3784:4: (lv_documentation_21_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3784:4: (lv_documentation_21_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3785:5: lv_documentation_21_0= RULE_STRING
                    {
                    lv_documentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_21_0, grammarAccess.getSplitDatastoreAndExternalAccess().getDocumentationSTRINGTerminalRuleCall_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitDatastoreAndExternalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_21_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitDatastoreAndExternal"


    // $ANTLR start "entryRuleSplitExternalAndDatastore"
    // InternalThreatModelLanguage.g:3805:1: entryRuleSplitExternalAndDatastore returns [EObject current=null] : iv_ruleSplitExternalAndDatastore= ruleSplitExternalAndDatastore EOF ;
    public final EObject entryRuleSplitExternalAndDatastore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitExternalAndDatastore = null;


        try {
            // InternalThreatModelLanguage.g:3805:66: (iv_ruleSplitExternalAndDatastore= ruleSplitExternalAndDatastore EOF )
            // InternalThreatModelLanguage.g:3806:2: iv_ruleSplitExternalAndDatastore= ruleSplitExternalAndDatastore EOF
            {
             newCompositeNode(grammarAccess.getSplitExternalAndDatastoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitExternalAndDatastore=ruleSplitExternalAndDatastore();

            state._fsp--;

             current =iv_ruleSplitExternalAndDatastore; 
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
    // $ANTLR end "entryRuleSplitExternalAndDatastore"


    // $ANTLR start "ruleSplitExternalAndDatastore"
    // InternalThreatModelLanguage.g:3812:1: ruleSplitExternalAndDatastore returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'datastore' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitExternalAndDatastore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_entity1_5_0=null;
        Token otherlv_6=null;
        Token lv_entity1Name_7_0=null;
        Token otherlv_8=null;
        Token lv_entity1Description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_entity2_12_0=null;
        Token otherlv_13=null;
        Token lv_entity2Name_14_0=null;
        Token otherlv_15=null;
        Token lv_entity2Description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_documentation_21_0=null;
        EObject lv_flowFix_19_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:3818:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'datastore' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:3819:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'datastore' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:3819:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'datastore' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:3820:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'datastore' ( (lv_entity2_12_0= RULE_ID ) ) (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )? (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )? otherlv_17= 'flows' otherlv_18= '{' ( (lv_flowFix_19_0= ruleFlowFix ) )* otherlv_20= '}' ( (lv_documentation_21_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitExternalAndDatastoreAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:3824:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3825:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3825:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:3826:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitExternalAndDatastoreAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitExternalAndDatastoreAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitExternalAndDatastoreAccess().getExternalKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitExternalAndDatastoreAccess().getEntityKeyword_4());
            		
            // InternalThreatModelLanguage.g:3854:3: ( (lv_entity1_5_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3855:4: (lv_entity1_5_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3855:4: (lv_entity1_5_0= RULE_ID )
            // InternalThreatModelLanguage.g:3856:5: lv_entity1_5_0= RULE_ID
            {
            lv_entity1_5_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_5_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity1IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3872:3: (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalThreatModelLanguage.g:3873:4: otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSplitExternalAndDatastoreAccess().getNameKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:3877:4: ( (lv_entity1Name_7_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3878:5: (lv_entity1Name_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3878:5: (lv_entity1Name_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3879:6: lv_entity1Name_7_0= RULE_STRING
                    {
                    lv_entity1Name_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_7_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity1NameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3896:3: (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==14) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalThreatModelLanguage.g:3897:4: otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSplitExternalAndDatastoreAccess().getDscKeyword_7_0());
                    			
                    // InternalThreatModelLanguage.g:3901:4: ( (lv_entity1Description_9_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3902:5: (lv_entity1Description_9_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3902:5: (lv_entity1Description_9_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3903:6: lv_entity1Description_9_0= RULE_STRING
                    {
                    lv_entity1Description_9_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_9_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity1DescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitExternalAndDatastoreAccess().getAndKeyword_8());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitExternalAndDatastoreAccess().getDatastoreKeyword_9());
            		
            // InternalThreatModelLanguage.g:3928:3: ( (lv_entity2_12_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:3929:4: (lv_entity2_12_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:3929:4: (lv_entity2_12_0= RULE_ID )
            // InternalThreatModelLanguage.g:3930:5: lv_entity2_12_0= RULE_ID
            {
            lv_entity2_12_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_12_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity2IDTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:3946:3: (otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==13) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalThreatModelLanguage.g:3947:4: otherlv_13= 'name' ( (lv_entity2Name_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getSplitExternalAndDatastoreAccess().getNameKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:3951:4: ( (lv_entity2Name_14_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3952:5: (lv_entity2Name_14_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3952:5: (lv_entity2Name_14_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3953:6: lv_entity2Name_14_0= RULE_STRING
                    {
                    lv_entity2Name_14_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_14_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity2NameSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:3970:3: (otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==14) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalThreatModelLanguage.g:3971:4: otherlv_15= 'dsc' ( (lv_entity2Description_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getSplitExternalAndDatastoreAccess().getDscKeyword_12_0());
                    			
                    // InternalThreatModelLanguage.g:3975:4: ( (lv_entity2Description_16_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:3976:5: (lv_entity2Description_16_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:3976:5: (lv_entity2Description_16_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:3977:6: lv_entity2Description_16_0= RULE_STRING
                    {
                    lv_entity2Description_16_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_16_0, grammarAccess.getSplitExternalAndDatastoreAccess().getEntity2DescriptionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitExternalAndDatastoreAccess().getFlowsKeyword_13());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_18, grammarAccess.getSplitExternalAndDatastoreAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalThreatModelLanguage.g:4002:3: ( (lv_flowFix_19_0= ruleFlowFix ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_ID) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4003:4: (lv_flowFix_19_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:4003:4: (lv_flowFix_19_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:4004:5: lv_flowFix_19_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitExternalAndDatastoreAccess().getFlowFixFlowFixParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_19_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitExternalAndDatastoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_19_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_20=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getSplitExternalAndDatastoreAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalThreatModelLanguage.g:4025:3: ( (lv_documentation_21_0= RULE_STRING ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_STRING) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalThreatModelLanguage.g:4026:4: (lv_documentation_21_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4026:4: (lv_documentation_21_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4027:5: lv_documentation_21_0= RULE_STRING
                    {
                    lv_documentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_21_0, grammarAccess.getSplitExternalAndDatastoreAccess().getDocumentationSTRINGTerminalRuleCall_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitExternalAndDatastoreRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_21_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitExternalAndDatastore"


    // $ANTLR start "entryRuleSplitDatastoreAndDatastore"
    // InternalThreatModelLanguage.g:4047:1: entryRuleSplitDatastoreAndDatastore returns [EObject current=null] : iv_ruleSplitDatastoreAndDatastore= ruleSplitDatastoreAndDatastore EOF ;
    public final EObject entryRuleSplitDatastoreAndDatastore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitDatastoreAndDatastore = null;


        try {
            // InternalThreatModelLanguage.g:4047:67: (iv_ruleSplitDatastoreAndDatastore= ruleSplitDatastoreAndDatastore EOF )
            // InternalThreatModelLanguage.g:4048:2: iv_ruleSplitDatastoreAndDatastore= ruleSplitDatastoreAndDatastore EOF
            {
             newCompositeNode(grammarAccess.getSplitDatastoreAndDatastoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitDatastoreAndDatastore=ruleSplitDatastoreAndDatastore();

            state._fsp--;

             current =iv_ruleSplitDatastoreAndDatastore; 
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
    // $ANTLR end "entryRuleSplitDatastoreAndDatastore"


    // $ANTLR start "ruleSplitDatastoreAndDatastore"
    // InternalThreatModelLanguage.g:4054:1: ruleSplitDatastoreAndDatastore returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitDatastoreAndDatastore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity1_4_0=null;
        Token otherlv_5=null;
        Token lv_entity1Name_6_0=null;
        Token otherlv_7=null;
        Token lv_entity1Description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_entity2_11_0=null;
        Token otherlv_12=null;
        Token lv_entity2Name_13_0=null;
        Token otherlv_14=null;
        Token lv_entity2Description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_documentation_20_0=null;
        EObject lv_flowFix_18_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4060:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:4061:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:4061:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:4062:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'datastore' ( (lv_entity1_4_0= RULE_ID ) ) (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )? (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )? otherlv_9= 'and' otherlv_10= 'datastore' ( (lv_entity2_11_0= RULE_ID ) ) (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )? (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )? otherlv_16= 'flows' otherlv_17= '{' ( (lv_flowFix_18_0= ruleFlowFix ) )* otherlv_19= '}' ( (lv_documentation_20_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:4066:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4067:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4067:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:4068:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitDatastoreAndDatastoreAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitDatastoreAndDatastoreAccess().getDatastoreKeyword_3());
            		
            // InternalThreatModelLanguage.g:4092:3: ( (lv_entity1_4_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4093:4: (lv_entity1_4_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4093:4: (lv_entity1_4_0= RULE_ID )
            // InternalThreatModelLanguage.g:4094:5: lv_entity1_4_0= RULE_ID
            {
            lv_entity1_4_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_4_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4110:3: (otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==13) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalThreatModelLanguage.g:4111:4: otherlv_5= 'name' ( (lv_entity1Name_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSplitDatastoreAndDatastoreAccess().getNameKeyword_5_0());
                    			
                    // InternalThreatModelLanguage.g:4115:4: ( (lv_entity1Name_6_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4116:5: (lv_entity1Name_6_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4116:5: (lv_entity1Name_6_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4117:6: lv_entity1Name_6_0= RULE_STRING
                    {
                    lv_entity1Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_6_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity1NameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:4134:3: (otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==14) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalThreatModelLanguage.g:4135:4: otherlv_7= 'dsc' ( (lv_entity1Description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getSplitDatastoreAndDatastoreAccess().getDscKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:4139:4: ( (lv_entity1Description_8_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4140:5: (lv_entity1Description_8_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4140:5: (lv_entity1Description_8_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4141:6: lv_entity1Description_8_0= RULE_STRING
                    {
                    lv_entity1Description_8_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_8_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity1DescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSplitDatastoreAndDatastoreAccess().getAndKeyword_7());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitDatastoreAndDatastoreAccess().getDatastoreKeyword_8());
            		
            // InternalThreatModelLanguage.g:4166:3: ( (lv_entity2_11_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4167:4: (lv_entity2_11_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4167:4: (lv_entity2_11_0= RULE_ID )
            // InternalThreatModelLanguage.g:4168:5: lv_entity2_11_0= RULE_ID
            {
            lv_entity2_11_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_11_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity2IDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4184:3: (otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==13) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalThreatModelLanguage.g:4185:4: otherlv_12= 'name' ( (lv_entity2Name_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSplitDatastoreAndDatastoreAccess().getNameKeyword_10_0());
                    			
                    // InternalThreatModelLanguage.g:4189:4: ( (lv_entity2Name_13_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4190:5: (lv_entity2Name_13_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4190:5: (lv_entity2Name_13_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4191:6: lv_entity2Name_13_0= RULE_STRING
                    {
                    lv_entity2Name_13_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_13_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity2NameSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:4208:3: (otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==14) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalThreatModelLanguage.g:4209:4: otherlv_14= 'dsc' ( (lv_entity2Description_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSplitDatastoreAndDatastoreAccess().getDscKeyword_11_0());
                    			
                    // InternalThreatModelLanguage.g:4213:4: ( (lv_entity2Description_15_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4214:5: (lv_entity2Description_15_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4214:5: (lv_entity2Description_15_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4215:6: lv_entity2Description_15_0= RULE_STRING
                    {
                    lv_entity2Description_15_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_15_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getEntity2DescriptionSTRINGTerminalRuleCall_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_16, grammarAccess.getSplitDatastoreAndDatastoreAccess().getFlowsKeyword_12());
            		
            otherlv_17=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_17, grammarAccess.getSplitDatastoreAndDatastoreAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalThreatModelLanguage.g:4240:3: ( (lv_flowFix_18_0= ruleFlowFix ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==RULE_ID) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4241:4: (lv_flowFix_18_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:4241:4: (lv_flowFix_18_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:4242:5: lv_flowFix_18_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitDatastoreAndDatastoreAccess().getFlowFixFlowFixParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_18_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitDatastoreAndDatastoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_18_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_19=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getSplitDatastoreAndDatastoreAccess().getRightCurlyBracketKeyword_15());
            		
            // InternalThreatModelLanguage.g:4263:3: ( (lv_documentation_20_0= RULE_STRING ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_STRING) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalThreatModelLanguage.g:4264:4: (lv_documentation_20_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4264:4: (lv_documentation_20_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4265:5: lv_documentation_20_0= RULE_STRING
                    {
                    lv_documentation_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_20_0, grammarAccess.getSplitDatastoreAndDatastoreAccess().getDocumentationSTRINGTerminalRuleCall_16_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitDatastoreAndDatastoreRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_20_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitDatastoreAndDatastore"


    // $ANTLR start "entryRuleSplitExternalAndExternal"
    // InternalThreatModelLanguage.g:4285:1: entryRuleSplitExternalAndExternal returns [EObject current=null] : iv_ruleSplitExternalAndExternal= ruleSplitExternalAndExternal EOF ;
    public final EObject entryRuleSplitExternalAndExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitExternalAndExternal = null;


        try {
            // InternalThreatModelLanguage.g:4285:65: (iv_ruleSplitExternalAndExternal= ruleSplitExternalAndExternal EOF )
            // InternalThreatModelLanguage.g:4286:2: iv_ruleSplitExternalAndExternal= ruleSplitExternalAndExternal EOF
            {
             newCompositeNode(grammarAccess.getSplitExternalAndExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSplitExternalAndExternal=ruleSplitExternalAndExternal();

            state._fsp--;

             current =iv_ruleSplitExternalAndExternal; 
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
    // $ANTLR end "entryRuleSplitExternalAndExternal"


    // $ANTLR start "ruleSplitExternalAndExternal"
    // InternalThreatModelLanguage.g:4292:1: ruleSplitExternalAndExternal returns [EObject current=null] : (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'external' otherlv_12= 'entity' ( (lv_entity2_13_0= RULE_ID ) ) (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )? (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )? otherlv_18= 'flows' otherlv_19= '{' ( (lv_flowFix_20_0= ruleFlowFix ) )* otherlv_21= '}' ( (lv_documentation_22_0= RULE_STRING ) )? ) ;
    public final EObject ruleSplitExternalAndExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_entity1_5_0=null;
        Token otherlv_6=null;
        Token lv_entity1Name_7_0=null;
        Token otherlv_8=null;
        Token lv_entity1Description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_entity2_13_0=null;
        Token otherlv_14=null;
        Token lv_entity2Name_15_0=null;
        Token otherlv_16=null;
        Token lv_entity2Description_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token lv_documentation_22_0=null;
        EObject lv_flowFix_20_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4298:2: ( (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'external' otherlv_12= 'entity' ( (lv_entity2_13_0= RULE_ID ) ) (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )? (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )? otherlv_18= 'flows' otherlv_19= '{' ( (lv_flowFix_20_0= ruleFlowFix ) )* otherlv_21= '}' ( (lv_documentation_22_0= RULE_STRING ) )? ) )
            // InternalThreatModelLanguage.g:4299:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'external' otherlv_12= 'entity' ( (lv_entity2_13_0= RULE_ID ) ) (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )? (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )? otherlv_18= 'flows' otherlv_19= '{' ( (lv_flowFix_20_0= ruleFlowFix ) )* otherlv_21= '}' ( (lv_documentation_22_0= RULE_STRING ) )? )
            {
            // InternalThreatModelLanguage.g:4299:2: (otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'external' otherlv_12= 'entity' ( (lv_entity2_13_0= RULE_ID ) ) (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )? (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )? otherlv_18= 'flows' otherlv_19= '{' ( (lv_flowFix_20_0= ruleFlowFix ) )* otherlv_21= '}' ( (lv_documentation_22_0= RULE_STRING ) )? )
            // InternalThreatModelLanguage.g:4300:3: otherlv_0= 'split' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= 'into' otherlv_3= 'external' otherlv_4= 'entity' ( (lv_entity1_5_0= RULE_ID ) ) (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )? (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )? otherlv_10= 'and' otherlv_11= 'external' otherlv_12= 'entity' ( (lv_entity2_13_0= RULE_ID ) ) (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )? (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )? otherlv_18= 'flows' otherlv_19= '{' ( (lv_flowFix_20_0= ruleFlowFix ) )* otherlv_21= '}' ( (lv_documentation_22_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSplitExternalAndExternalAccess().getSplitKeyword_0());
            		
            // InternalThreatModelLanguage.g:4304:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4305:4: (lv_id_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4305:4: (lv_id_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:4306:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_id_1_0, grammarAccess.getSplitExternalAndExternalAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getSplitExternalAndExternalAccess().getIntoKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSplitExternalAndExternalAccess().getExternalKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSplitExternalAndExternalAccess().getEntityKeyword_4());
            		
            // InternalThreatModelLanguage.g:4334:3: ( (lv_entity1_5_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4335:4: (lv_entity1_5_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4335:4: (lv_entity1_5_0= RULE_ID )
            // InternalThreatModelLanguage.g:4336:5: lv_entity1_5_0= RULE_ID
            {
            lv_entity1_5_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_entity1_5_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity1IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity1",
            						lv_entity1_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4352:3: (otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==13) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalThreatModelLanguage.g:4353:4: otherlv_6= 'name' ( (lv_entity1Name_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getSplitExternalAndExternalAccess().getNameKeyword_6_0());
                    			
                    // InternalThreatModelLanguage.g:4357:4: ( (lv_entity1Name_7_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4358:5: (lv_entity1Name_7_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4358:5: (lv_entity1Name_7_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4359:6: lv_entity1Name_7_0= RULE_STRING
                    {
                    lv_entity1Name_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_entity1Name_7_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity1NameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Name",
                    							lv_entity1Name_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:4376:3: (otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==14) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalThreatModelLanguage.g:4377:4: otherlv_8= 'dsc' ( (lv_entity1Description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSplitExternalAndExternalAccess().getDscKeyword_7_0());
                    			
                    // InternalThreatModelLanguage.g:4381:4: ( (lv_entity1Description_9_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4382:5: (lv_entity1Description_9_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4382:5: (lv_entity1Description_9_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4383:6: lv_entity1Description_9_0= RULE_STRING
                    {
                    lv_entity1Description_9_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_entity1Description_9_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity1DescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity1Description",
                    							lv_entity1Description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getSplitExternalAndExternalAccess().getAndKeyword_8());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getSplitExternalAndExternalAccess().getExternalKeyword_9());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getSplitExternalAndExternalAccess().getEntityKeyword_10());
            		
            // InternalThreatModelLanguage.g:4412:3: ( (lv_entity2_13_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4413:4: (lv_entity2_13_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4413:4: (lv_entity2_13_0= RULE_ID )
            // InternalThreatModelLanguage.g:4414:5: lv_entity2_13_0= RULE_ID
            {
            lv_entity2_13_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_entity2_13_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"entity2",
            						lv_entity2_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4430:3: (otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==13) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalThreatModelLanguage.g:4431:4: otherlv_14= 'name' ( (lv_entity2Name_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSplitExternalAndExternalAccess().getNameKeyword_12_0());
                    			
                    // InternalThreatModelLanguage.g:4435:4: ( (lv_entity2Name_15_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4436:5: (lv_entity2Name_15_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4436:5: (lv_entity2Name_15_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4437:6: lv_entity2Name_15_0= RULE_STRING
                    {
                    lv_entity2Name_15_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_entity2Name_15_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity2NameSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Name",
                    							lv_entity2Name_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalThreatModelLanguage.g:4454:3: (otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==14) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalThreatModelLanguage.g:4455:4: otherlv_16= 'dsc' ( (lv_entity2Description_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getSplitExternalAndExternalAccess().getDscKeyword_13_0());
                    			
                    // InternalThreatModelLanguage.g:4459:4: ( (lv_entity2Description_17_0= RULE_STRING ) )
                    // InternalThreatModelLanguage.g:4460:5: (lv_entity2Description_17_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4460:5: (lv_entity2Description_17_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4461:6: lv_entity2Description_17_0= RULE_STRING
                    {
                    lv_entity2Description_17_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_entity2Description_17_0, grammarAccess.getSplitExternalAndExternalAccess().getEntity2DescriptionSTRINGTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entity2Description",
                    							lv_entity2Description_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,34,FOLLOW_36); 

            			newLeafNode(otherlv_18, grammarAccess.getSplitExternalAndExternalAccess().getFlowsKeyword_14());
            		
            otherlv_19=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_19, grammarAccess.getSplitExternalAndExternalAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalThreatModelLanguage.g:4486:3: ( (lv_flowFix_20_0= ruleFlowFix ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==RULE_ID) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4487:4: (lv_flowFix_20_0= ruleFlowFix )
            	    {
            	    // InternalThreatModelLanguage.g:4487:4: (lv_flowFix_20_0= ruleFlowFix )
            	    // InternalThreatModelLanguage.g:4488:5: lv_flowFix_20_0= ruleFlowFix
            	    {

            	    					newCompositeNode(grammarAccess.getSplitExternalAndExternalAccess().getFlowFixFlowFixParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_flowFix_20_0=ruleFlowFix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSplitExternalAndExternalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"flowFix",
            	    						lv_flowFix_20_0,
            	    						"xtext.ThreatModelLanguage.FlowFix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_21=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_21, grammarAccess.getSplitExternalAndExternalAccess().getRightCurlyBracketKeyword_17());
            		
            // InternalThreatModelLanguage.g:4509:3: ( (lv_documentation_22_0= RULE_STRING ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_STRING) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalThreatModelLanguage.g:4510:4: (lv_documentation_22_0= RULE_STRING )
                    {
                    // InternalThreatModelLanguage.g:4510:4: (lv_documentation_22_0= RULE_STRING )
                    // InternalThreatModelLanguage.g:4511:5: lv_documentation_22_0= RULE_STRING
                    {
                    lv_documentation_22_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_22_0, grammarAccess.getSplitExternalAndExternalAccess().getDocumentationSTRINGTerminalRuleCall_18_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSplitExternalAndExternalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_22_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


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
    // $ANTLR end "ruleSplitExternalAndExternal"


    // $ANTLR start "entryRuleGrouping"
    // InternalThreatModelLanguage.g:4531:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // InternalThreatModelLanguage.g:4531:49: (iv_ruleGrouping= ruleGrouping EOF )
            // InternalThreatModelLanguage.g:4532:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
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
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // InternalThreatModelLanguage.g:4538:1: ruleGrouping returns [EObject current=null] : (this_Countermeasure_0= ruleCountermeasure | this_Design_1= ruleDesign | this_Refactoring_2= ruleRefactoring ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        EObject this_Countermeasure_0 = null;

        EObject this_Design_1 = null;

        EObject this_Refactoring_2 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4544:2: ( (this_Countermeasure_0= ruleCountermeasure | this_Design_1= ruleDesign | this_Refactoring_2= ruleRefactoring ) )
            // InternalThreatModelLanguage.g:4545:2: (this_Countermeasure_0= ruleCountermeasure | this_Design_1= ruleDesign | this_Refactoring_2= ruleRefactoring )
            {
            // InternalThreatModelLanguage.g:4545:2: (this_Countermeasure_0= ruleCountermeasure | this_Design_1= ruleDesign | this_Refactoring_2= ruleRefactoring )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt97=1;
                }
                break;
            case 38:
                {
                alt97=2;
                }
                break;
            case 39:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalThreatModelLanguage.g:4546:3: this_Countermeasure_0= ruleCountermeasure
                    {

                    			newCompositeNode(grammarAccess.getGroupingAccess().getCountermeasureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Countermeasure_0=ruleCountermeasure();

                    state._fsp--;


                    			current = this_Countermeasure_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalThreatModelLanguage.g:4555:3: this_Design_1= ruleDesign
                    {

                    			newCompositeNode(grammarAccess.getGroupingAccess().getDesignParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Design_1=ruleDesign();

                    state._fsp--;


                    			current = this_Design_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalThreatModelLanguage.g:4564:3: this_Refactoring_2= ruleRefactoring
                    {

                    			newCompositeNode(grammarAccess.getGroupingAccess().getRefactoringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Refactoring_2=ruleRefactoring();

                    state._fsp--;


                    			current = this_Refactoring_2;
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
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleCountermeasure"
    // InternalThreatModelLanguage.g:4576:1: entryRuleCountermeasure returns [EObject current=null] : iv_ruleCountermeasure= ruleCountermeasure EOF ;
    public final EObject entryRuleCountermeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountermeasure = null;


        try {
            // InternalThreatModelLanguage.g:4576:55: (iv_ruleCountermeasure= ruleCountermeasure EOF )
            // InternalThreatModelLanguage.g:4577:2: iv_ruleCountermeasure= ruleCountermeasure EOF
            {
             newCompositeNode(grammarAccess.getCountermeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountermeasure=ruleCountermeasure();

            state._fsp--;

             current =iv_ruleCountermeasure; 
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
    // $ANTLR end "entryRuleCountermeasure"


    // $ANTLR start "ruleCountermeasure"
    // InternalThreatModelLanguage.g:4583:1: ruleCountermeasure returns [EObject current=null] : (otherlv_0= 'countermeasure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) ;
    public final EObject ruleCountermeasure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operatoins_4_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4589:2: ( (otherlv_0= 'countermeasure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) )
            // InternalThreatModelLanguage.g:4590:2: (otherlv_0= 'countermeasure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            {
            // InternalThreatModelLanguage.g:4590:2: (otherlv_0= 'countermeasure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            // InternalThreatModelLanguage.g:4591:3: otherlv_0= 'countermeasure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCountermeasureAccess().getCountermeasureKeyword_0());
            		
            // InternalThreatModelLanguage.g:4595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4596:4: (lv_name_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:4597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCountermeasureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountermeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4613:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalThreatModelLanguage.g:4614:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalThreatModelLanguage.g:4614:4: (lv_description_2_0= RULE_STRING )
            // InternalThreatModelLanguage.g:4615:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_description_2_0, grammarAccess.getCountermeasureAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountermeasureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getCountermeasureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalThreatModelLanguage.g:4635:3: ( (lv_operatoins_4_0= ruleOperations ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==11||(LA98_0>=22 && LA98_0<=23)||LA98_0==25||LA98_0==31||LA98_0==33) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4636:4: (lv_operatoins_4_0= ruleOperations )
            	    {
            	    // InternalThreatModelLanguage.g:4636:4: (lv_operatoins_4_0= ruleOperations )
            	    // InternalThreatModelLanguage.g:4637:5: lv_operatoins_4_0= ruleOperations
            	    {

            	    					newCompositeNode(grammarAccess.getCountermeasureAccess().getOperatoinsOperationsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_operatoins_4_0=ruleOperations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCountermeasureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operatoins",
            	    						lv_operatoins_4_0,
            	    						"xtext.ThreatModelLanguage.Operations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCountermeasureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCountermeasure"


    // $ANTLR start "entryRuleDesign"
    // InternalThreatModelLanguage.g:4662:1: entryRuleDesign returns [EObject current=null] : iv_ruleDesign= ruleDesign EOF ;
    public final EObject entryRuleDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesign = null;


        try {
            // InternalThreatModelLanguage.g:4662:47: (iv_ruleDesign= ruleDesign EOF )
            // InternalThreatModelLanguage.g:4663:2: iv_ruleDesign= ruleDesign EOF
            {
             newCompositeNode(grammarAccess.getDesignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesign=ruleDesign();

            state._fsp--;

             current =iv_ruleDesign; 
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
    // $ANTLR end "entryRuleDesign"


    // $ANTLR start "ruleDesign"
    // InternalThreatModelLanguage.g:4669:1: ruleDesign returns [EObject current=null] : (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) ;
    public final EObject ruleDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operatoins_4_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4675:2: ( (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) )
            // InternalThreatModelLanguage.g:4676:2: (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            {
            // InternalThreatModelLanguage.g:4676:2: (otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            // InternalThreatModelLanguage.g:4677:3: otherlv_0= 'design' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDesignAccess().getDesignKeyword_0());
            		
            // InternalThreatModelLanguage.g:4681:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4682:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4682:4: (lv_name_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:4683:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDesignAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4699:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalThreatModelLanguage.g:4700:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalThreatModelLanguage.g:4700:4: (lv_description_2_0= RULE_STRING )
            // InternalThreatModelLanguage.g:4701:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_description_2_0, grammarAccess.getDesignAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalThreatModelLanguage.g:4721:3: ( (lv_operatoins_4_0= ruleOperations ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==11||(LA99_0>=22 && LA99_0<=23)||LA99_0==25||LA99_0==31||LA99_0==33) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4722:4: (lv_operatoins_4_0= ruleOperations )
            	    {
            	    // InternalThreatModelLanguage.g:4722:4: (lv_operatoins_4_0= ruleOperations )
            	    // InternalThreatModelLanguage.g:4723:5: lv_operatoins_4_0= ruleOperations
            	    {

            	    					newCompositeNode(grammarAccess.getDesignAccess().getOperatoinsOperationsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_operatoins_4_0=ruleOperations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDesignRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operatoins",
            	    						lv_operatoins_4_0,
            	    						"xtext.ThreatModelLanguage.Operations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDesignAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDesign"


    // $ANTLR start "entryRuleRefactoring"
    // InternalThreatModelLanguage.g:4748:1: entryRuleRefactoring returns [EObject current=null] : iv_ruleRefactoring= ruleRefactoring EOF ;
    public final EObject entryRuleRefactoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefactoring = null;


        try {
            // InternalThreatModelLanguage.g:4748:52: (iv_ruleRefactoring= ruleRefactoring EOF )
            // InternalThreatModelLanguage.g:4749:2: iv_ruleRefactoring= ruleRefactoring EOF
            {
             newCompositeNode(grammarAccess.getRefactoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefactoring=ruleRefactoring();

            state._fsp--;

             current =iv_ruleRefactoring; 
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
    // $ANTLR end "entryRuleRefactoring"


    // $ANTLR start "ruleRefactoring"
    // InternalThreatModelLanguage.g:4755:1: ruleRefactoring returns [EObject current=null] : (otherlv_0= 'refactoring' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) ;
    public final EObject ruleRefactoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operatoins_4_0 = null;



        	enterRule();

        try {
            // InternalThreatModelLanguage.g:4761:2: ( (otherlv_0= 'refactoring' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' ) )
            // InternalThreatModelLanguage.g:4762:2: (otherlv_0= 'refactoring' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            {
            // InternalThreatModelLanguage.g:4762:2: (otherlv_0= 'refactoring' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}' )
            // InternalThreatModelLanguage.g:4763:3: otherlv_0= 'refactoring' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_operatoins_4_0= ruleOperations ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRefactoringAccess().getRefactoringKeyword_0());
            		
            // InternalThreatModelLanguage.g:4767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalThreatModelLanguage.g:4768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalThreatModelLanguage.g:4768:4: (lv_name_1_0= RULE_ID )
            // InternalThreatModelLanguage.g:4769:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRefactoringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefactoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalThreatModelLanguage.g:4785:3: ( (lv_description_2_0= RULE_STRING ) )
            // InternalThreatModelLanguage.g:4786:4: (lv_description_2_0= RULE_STRING )
            {
            // InternalThreatModelLanguage.g:4786:4: (lv_description_2_0= RULE_STRING )
            // InternalThreatModelLanguage.g:4787:5: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_description_2_0, grammarAccess.getRefactoringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefactoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getRefactoringAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalThreatModelLanguage.g:4807:3: ( (lv_operatoins_4_0= ruleOperations ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==11||(LA100_0>=22 && LA100_0<=23)||LA100_0==25||LA100_0==31||LA100_0==33) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalThreatModelLanguage.g:4808:4: (lv_operatoins_4_0= ruleOperations )
            	    {
            	    // InternalThreatModelLanguage.g:4808:4: (lv_operatoins_4_0= ruleOperations )
            	    // InternalThreatModelLanguage.g:4809:5: lv_operatoins_4_0= ruleOperations
            	    {

            	    					newCompositeNode(grammarAccess.getRefactoringAccess().getOperatoinsOperationsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_operatoins_4_0=ruleOperations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRefactoringRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operatoins",
            	    						lv_operatoins_4_0,
            	    						"xtext.ThreatModelLanguage.Operations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRefactoringAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRefactoring"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\27\1\uffff\1\4\2\uffff\1\13\7\uffff";
    static final String dfa_3s = "\1\41\1\uffff\1\4\2\uffff\1\36\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\11\1\12\1\uffff\1\7\1\4\1\10\1\5\1\2\1\6\1\3";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\5\uffff\1\3\1\uffff\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\13\12\uffff\1\6\3\uffff\1\12\1\14\1\7\1\11\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "965:2: (this_Rename_0= ruleRename | this_ReID_1= ruleReID | this_ChangeDescription_2= ruleChangeDescription | this_FlowSource_3= ruleFlowSource | this_FlowDestination_4= ruleFlowDestination | this_BoundaryAddEntity_5= ruleBoundaryAddEntity | this_BoundaryRemoveEntity_6= ruleBoundaryRemoveEntity | this_RotateFlow_7= ruleRotateFlow | this_MergeEntity_8= ruleMergeEntity | this_SplitEntity_9= ruleSplitEntity )";
        }
    }
    static final String dfa_7s = "\43\uffff";
    static final String dfa_8s = "\1\41\1\4\1\30\1\14\1\4\1\20\1\4\1\15\1\4\1\15\2\5\1\14\1\15\2\5\1\14\1\16\1\40\3\uffff\2\5\1\14\1\16\1\40\3\uffff\1\16\1\40\3\uffff";
    static final String dfa_9s = "\1\41\1\4\1\30\1\21\1\4\1\20\1\4\1\40\1\4\1\40\2\5\1\21\1\40\2\5\1\21\2\40\3\uffff\2\5\1\21\2\40\3\uffff\2\40\3\uffff";
    static final String dfa_10s = "\23\uffff\1\4\1\2\1\1\5\uffff\1\6\1\3\1\10\2\uffff\1\5\1\11\1\7";
    static final String dfa_11s = "\43\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\2\uffff\1\5\1\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\13\21\uffff\1\14",
            "\1\15",
            "\1\16\1\17\21\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\25\2\uffff\1\23\1\uffff\1\24",
            "\1\26\1\27\21\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\34\2\uffff\1\33\1\uffff\1\35",
            "\1\13\21\uffff\1\14",
            "\1\14",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40\2\uffff\1\41\1\uffff\1\42",
            "\1\17\21\uffff\1\20",
            "\1\20",
            "",
            "",
            "",
            "\1\27\21\uffff\1\30",
            "\1\30",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2221:2: (this_SplitProcessAndProcess_0= ruleSplitProcessAndProcess | this_SplitsProcessAndDatastore_1= ruleSplitsProcessAndDatastore | this_SplitsDatastoreAndProcess_2= ruleSplitsDatastoreAndProcess | this_SplitProcessAndExternal_3= ruleSplitProcessAndExternal | this_SplitExternalAndProcess_4= ruleSplitExternalAndProcess | this_SplitDatastoreAndExternal_5= ruleSplitDatastoreAndExternal | this_SplitExternalAndDatastore_6= ruleSplitExternalAndDatastore | this_SplitDatastoreAndDatastore_7= ruleSplitDatastoreAndDatastore | this_SplitExternalAndExternal_8= ruleSplitExternalAndExternal )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000E282C00802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400006000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000F282C00800L});

}