// Generated from E:/SourceTree/AAU-Notes/4-Semester/Misc/Antlr\Tactic.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tactic extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, LPAREN=2, RPAREN=3, LCURLY=4, RCURLY=5, TEAM=6, PLAYER=7, BOARD=8, 
		INTEGER=9, BOOL=10, SEPERATOR=11, IF=12, ELSEIF=13, ELSE=14, TRUE=15, 
		FLASE=16, FOR=17, WHILE=18, DOT=19, DIGIT=20, LETTER=21, WORD=22, NUMBER=23, 
		ASSIGN=24, ADDITION=25, SUBTRACTION=26, DIVISION=27, MULTIPLY=28, ENDSTNT=29, 
		BOOL_EQUAL=30, BOOL_N_EQUAL=31, BOOL_COND_AND=32, BOOL_COND_OR=33, BOOL_LESS=34, 
		BOOL_GREATER=35, BOOL_LESS_OR_EQUAL=36, BOOL_GREATER_OR_EQUAL=37, INCREMENT=38, 
		WS=39, BLOCK=40, FALSE=41;
	public static final int
		RULE_start = 0, RULE_exprs = 1, RULE_expr = 2, RULE_exprNEs = 3, RULE_integer = 4, 
		RULE_word = 5, RULE_identifier = 6, RULE_value = 7, RULE_dotStmt = 8, 
		RULE_boardDcl = 9, RULE_intDcl = 10, RULE_boolDcl = 11, RULE_arithExpr = 12, 
		RULE_addExpr = 13, RULE_subExpr = 14, RULE_divExpr = 15, RULE_mulExpr = 16, 
		RULE_buildInClass = 17, RULE_instantiation = 18, RULE_type = 19, RULE_arguments = 20, 
		RULE_condStmt = 21, RULE_block = 22, RULE_ifStmt = 23, RULE_elseifStmt = 24, 
		RULE_elseStmt = 25, RULE_loopStmt = 26, RULE_forStmt = 27, RULE_whileStmt = 28, 
		RULE_boolStmt = 29, RULE_bool = 30, RULE_boolOperaters = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "exprs", "expr", "exprNEs", "integer", "word", "identifier", 
			"value", "dotStmt", "boardDcl", "intDcl", "boolDcl", "arithExpr", "addExpr", 
			"subExpr", "divExpr", "mulExpr", "buildInClass", "instantiation", "type", 
			"arguments", "condStmt", "block", "ifStmt", "elseifStmt", "elseStmt", 
			"loopStmt", "forStmt", "whileStmt", "boolStmt", "bool", "boolOperaters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'('", "')'", "'{'", "'}'", "'Team'", "'Player'", "'Board'", 
			"'int'", "'bool'", "','", "'if'", "'elseif'", "'else'", "'true'", "'false'", 
			"'for'", "'while'", "'.'", null, null, null, null, "'='", "'+'", "'-'", 
			"'/'", "'*'", "';'", "'=='", "'!='", "'&&'", "'||'", "'<'", "'>'", "'<='", 
			"'>='", "'++'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "TEAM", "PLAYER", 
			"BOARD", "INTEGER", "BOOL", "SEPERATOR", "IF", "ELSEIF", "ELSE", "TRUE", 
			"FLASE", "FOR", "WHILE", "DOT", "DIGIT", "LETTER", "WORD", "NUMBER", 
			"ASSIGN", "ADDITION", "SUBTRACTION", "DIVISION", "MULTIPLY", "ENDSTNT", 
			"BOOL_EQUAL", "BOOL_N_EQUAL", "BOOL_COND_AND", "BOOL_COND_OR", "BOOL_LESS", 
			"BOOL_GREATER", "BOOL_LESS_OR_EQUAL", "BOOL_GREATER_OR_EQUAL", "INCREMENT", 
			"WS", "BLOCK", "FALSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tactic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tactic(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			exprs(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDSTNT() { return getToken(Tactic.ENDSTNT, 0); }
		public ExprNEsContext exprNEs() {
			return getRuleContext(ExprNEsContext.class,0);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		return exprs(0);
	}

	private ExprsContext exprs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprsContext _localctx = new ExprsContext(_ctx, _parentState);
		ExprsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exprs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEAM:
			case PLAYER:
			case BOARD:
			case INTEGER:
			case BOOL:
			case DIGIT:
			case LETTER:
			case WORD:
			case NUMBER:
				{
				setState(67);
				expr();
				setState(68);
				match(ENDSTNT);
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				{
				setState(70);
				exprNEs(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprs);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					exprs(3);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DotStmtContext dotStmt() {
			return getRuleContext(DotStmtContext.class,0);
		}
		public BoardDclContext boardDcl() {
			return getRuleContext(BoardDclContext.class,0);
		}
		public IntDclContext intDcl() {
			return getRuleContext(IntDclContext.class,0);
		}
		public BoolDclContext boolDcl() {
			return getRuleContext(BoolDclContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				arithExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				dotStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				boardDcl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				intDcl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				boolDcl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprNEsContext extends ParserRuleContext {
		public CondStmtContext condStmt() {
			return getRuleContext(CondStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public List<ExprNEsContext> exprNEs() {
			return getRuleContexts(ExprNEsContext.class);
		}
		public ExprNEsContext exprNEs(int i) {
			return getRuleContext(ExprNEsContext.class,i);
		}
		public ExprNEsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNEs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterExprNEs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitExprNEs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitExprNEs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNEsContext exprNEs() throws RecognitionException {
		return exprNEs(0);
	}

	private ExprNEsContext exprNEs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprNEsContext _localctx = new ExprNEsContext(_ctx, _parentState);
		ExprNEsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exprNEs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(90);
				condStmt();
				}
				break;
			case FOR:
			case WHILE:
				{
				setState(91);
				loopStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprNEsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprNEs);
					setState(94);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(95);
					exprNEs(4);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Tactic.NUMBER, 0); }
		public TerminalNode DIGIT() { return getToken(Tactic.DIGIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(Tactic.WORD, 0); }
		public TerminalNode LETTER() { return getToken(Tactic.LETTER, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			word();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				integer();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotStmtContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Tactic.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public BuildInClassContext buildInClass() {
			return getRuleContext(BuildInClassContext.class,0);
		}
		public TerminalNode BOARD() { return getToken(Tactic.BOARD, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public DotStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterDotStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitDotStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitDotStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotStmtContext dotStmt() throws RecognitionException {
		DotStmtContext _localctx = new DotStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dotStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEAM:
			case PLAYER:
				{
				setState(112);
				buildInClass();
				}
				break;
			case BOARD:
				{
				setState(113);
				match(BOARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			match(DOT);
			setState(117);
			match(LPAREN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==WORD) {
				{
				{
				setState(118);
				arguments(0);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoardDclContext extends ParserRuleContext {
		public TerminalNode BOARD() { return getToken(Tactic.BOARD, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public BoardDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boardDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBoardDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBoardDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBoardDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardDclContext boardDcl() throws RecognitionException {
		BoardDclContext _localctx = new BoardDclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boardDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BOARD);
			setState(127);
			match(LPAREN);
			setState(128);
			word();
			setState(129);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntDclContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Tactic.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Tactic.ASSIGN, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterIntDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitIntDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitIntDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDclContext intDcl() throws RecognitionException {
		IntDclContext _localctx = new IntDclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_intDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(INTEGER);
			setState(132);
			identifier();
			setState(133);
			match(ASSIGN);
			setState(134);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolDclContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(Tactic.BOOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Tactic.ASSIGN, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBoolDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBoolDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBoolDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDclContext boolDcl() throws RecognitionException {
		BoolDclContext _localctx = new BoolDclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(BOOL);
			setState(137);
			identifier();
			setState(138);
			match(ASSIGN);
			setState(139);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExprContext extends ParserRuleContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public SubExprContext subExpr() {
			return getRuleContext(SubExprContext.class,0);
		}
		public DivExprContext divExpr() {
			return getRuleContext(DivExprContext.class,0);
		}
		public MulExprContext mulExpr() {
			return getRuleContext(MulExprContext.class,0);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitArithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(141);
				addExpr();
				}
				break;
			case 2:
				{
				setState(142);
				subExpr();
				}
				break;
			case 3:
				{
				setState(143);
				divExpr();
				}
				break;
			case 4:
				{
				setState(144);
				mulExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(Tactic.ADDITION, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(147);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(148);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(ADDITION);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(152);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(153);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubExprContext extends ParserRuleContext {
		public TerminalNode SUBTRACTION() { return getToken(Tactic.SUBTRACTION, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public SubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExprContext subExpr() throws RecognitionException {
		SubExprContext _localctx = new SubExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(156);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(157);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			match(SUBTRACTION);
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(161);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(162);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivExprContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(Tactic.DIVISION, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public DivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivExprContext divExpr() throws RecognitionException {
		DivExprContext _localctx = new DivExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_divExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(165);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(166);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			match(DIVISION);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(170);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(171);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExprContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(Tactic.MULTIPLY, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mulExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(174);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(175);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(MULTIPLY);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(179);
				identifier();
				}
				break;
			case DIGIT:
			case NUMBER:
				{
				setState(180);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildInClassContext extends ParserRuleContext {
		public TerminalNode TEAM() { return getToken(Tactic.TEAM, 0); }
		public TerminalNode PLAYER() { return getToken(Tactic.PLAYER, 0); }
		public BuildInClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildInClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBuildInClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBuildInClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBuildInClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildInClassContext buildInClass() throws RecognitionException {
		BuildInClassContext _localctx = new BuildInClassContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_buildInClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==TEAM || _la==PLAYER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantiationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Tactic.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(Tactic.NEW, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			type();
			setState(186);
			identifier();
			setState(187);
			match(ASSIGN);
			setState(188);
			match(NEW);
			setState(189);
			type();
			setState(190);
			match(LPAREN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==WORD) {
				{
				{
				setState(191);
				arguments(0);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BuildInClassContext buildInClass() {
			return getRuleContext(BuildInClassContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			buildInClass();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public TerminalNode SEPERATOR() { return getToken(Tactic.SEPERATOR, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		return arguments(0);
	}

	private ArgumentsContext arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, _parentState);
		ArgumentsContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arguments);
					setState(204);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(205);
					match(SEPERATOR);
					setState(206);
					arguments(2);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondStmtContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public List<ElseifStmtContext> elseifStmt() {
			return getRuleContexts(ElseifStmtContext.class);
		}
		public ElseifStmtContext elseifStmt(int i) {
			return getRuleContext(ElseifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public CondStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterCondStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitCondStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitCondStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondStmtContext condStmt() throws RecognitionException {
		CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condStmt);
		try {
			int _alt;
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				ifStmt();
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						elseifStmt();
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(220);
					elseStmt();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(Tactic.LCURLY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(Tactic.RCURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(LCURLY);
				setState(226);
				exprs(0);
				setState(227);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(LCURLY);
				setState(230);
				match(RCURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Tactic.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolStmtContext boolStmt() {
			return getRuleContext(BoolStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IF);
			setState(234);
			match(LPAREN);
			{
			setState(235);
			boolStmt();
			}
			setState(236);
			match(RPAREN);
			setState(237);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifStmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(Tactic.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolStmtContext boolStmt() {
			return getRuleContext(BoolStmtContext.class,0);
		}
		public ElseifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterElseifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitElseifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitElseifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifStmtContext elseifStmt() throws RecognitionException {
		ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ELSEIF);
			setState(240);
			match(LPAREN);
			{
			setState(241);
			boolStmt();
			}
			setState(242);
			match(RPAREN);
			setState(243);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Tactic.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ELSE);
			setState(246);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopStmt);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				forStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				whileStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Tactic.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public List<TerminalNode> ENDSTNT() { return getTokens(Tactic.ENDSTNT); }
		public TerminalNode ENDSTNT(int i) {
			return getToken(Tactic.ENDSTNT, i);
		}
		public BoolStmtContext boolStmt() {
			return getRuleContext(BoolStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IntDclContext intDcl() {
			return getRuleContext(IntDclContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(Tactic.INCREMENT, 0); }
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(FOR);
			setState(253);
			match(LPAREN);
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(254);
				identifier();
				}
				break;
			case INTEGER:
				{
				setState(255);
				intDcl();
				}
				break;
			case ENDSTNT:
				break;
			default:
				break;
			}
			setState(258);
			match(ENDSTNT);
			setState(259);
			boolStmt();
			setState(260);
			match(ENDSTNT);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER || _la==WORD) {
				{
				setState(261);
				identifier();
				setState(262);
				match(INCREMENT);
				}
			}

			setState(266);
			match(RPAREN);
			setState(267);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Tactic.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Tactic.LPAREN, 0); }
		public BoolStmtContext boolStmt() {
			return getRuleContext(BoolStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Tactic.RPAREN, 0); }
		public TerminalNode BLOCK() { return getToken(Tactic.BLOCK, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(WHILE);
			setState(270);
			match(LPAREN);
			setState(271);
			boolStmt();
			setState(272);
			match(RPAREN);
			setState(273);
			match(BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolStmtContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public BoolOperatersContext boolOperaters() {
			return getRuleContext(BoolOperatersContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBoolStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBoolStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBoolStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolStmtContext boolStmt() throws RecognitionException {
		BoolStmtContext _localctx = new BoolStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_boolStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(275);
				value();
				setState(276);
				boolOperaters();
				setState(277);
				value();
				}
				break;
			case 2:
				{
				setState(279);
				bool();
				}
				break;
			case 3:
				{
				setState(280);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Tactic.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Tactic.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperatersContext extends ParserRuleContext {
		public TerminalNode BOOL_EQUAL() { return getToken(Tactic.BOOL_EQUAL, 0); }
		public TerminalNode BOOL_N_EQUAL() { return getToken(Tactic.BOOL_N_EQUAL, 0); }
		public TerminalNode BOOL_COND_AND() { return getToken(Tactic.BOOL_COND_AND, 0); }
		public TerminalNode BOOL_COND_OR() { return getToken(Tactic.BOOL_COND_OR, 0); }
		public TerminalNode BOOL_LESS() { return getToken(Tactic.BOOL_LESS, 0); }
		public TerminalNode BOOL_GREATER() { return getToken(Tactic.BOOL_GREATER, 0); }
		public TerminalNode BOOL_LESS_OR_EQUAL() { return getToken(Tactic.BOOL_LESS_OR_EQUAL, 0); }
		public TerminalNode BOOL_GREATER_OR_EQUAL() { return getToken(Tactic.BOOL_GREATER_OR_EQUAL, 0); }
		public BoolOperatersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperaters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).enterBoolOperaters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TacticListener ) ((TacticListener)listener).exitBoolOperaters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TacticVisitor ) return ((TacticVisitor<? extends T>)visitor).visitBoolOperaters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperatersContext boolOperaters() throws RecognitionException {
		BoolOperatersContext _localctx = new BoolOperatersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolOperaters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_EQUAL) | (1L << BOOL_N_EQUAL) | (1L << BOOL_COND_AND) | (1L << BOOL_COND_OR) | (1L << BOOL_LESS) | (1L << BOOL_GREATER) | (1L << BOOL_LESS_OR_EQUAL) | (1L << BOOL_GREATER_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return exprs_sempred((ExprsContext)_localctx, predIndex);
		case 3:
			return exprNEs_sempred((ExprNEsContext)_localctx, predIndex);
		case 20:
			return arguments_sempred((ArgumentsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprs_sempred(ExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprNEs_sempred(ExprNEsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arguments_sempred(ArgumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\5\5_\n\5\3\5\3\5\7"+
		"\5c\n\5\f\5\16\5f\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tq\n\t\3"+
		"\n\3\n\5\nu\n\n\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16\u0094\n\16\3\17\3\17\5\17\u0098\n\17\3\17\3\17\3\17\5\17\u009d"+
		"\n\17\3\20\3\20\5\20\u00a1\n\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3"+
		"\21\5\21\u00aa\n\21\3\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\5\22\u00b3"+
		"\n\22\3\22\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00c3\n\24\f\24\16\24\u00c6\13\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d2\n\26\f\26\16\26\u00d5\13\26"+
		"\3\27\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13\27\3\27\5\27\u00e0"+
		"\n\27\5\27\u00e2\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ea\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\5\34\u00fd\n\34\3\35\3\35\3\35\3\35\5\35\u0103\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u010b\n\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u011c\n\37\3 \3 \3"+
		"!\3!\3!\2\5\4\b*\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\7\4\2\26\26\31\31\3\2\27\30\3\2\b\t\4\2\21\21++\3\2 "+
		"\'\2\u0126\2B\3\2\2\2\4I\3\2\2\2\6Y\3\2\2\2\b^\3\2\2\2\ng\3\2\2\2\fi\3"+
		"\2\2\2\16k\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24\u0080\3\2\2\2\26\u0085\3"+
		"\2\2\2\30\u008a\3\2\2\2\32\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u00a0\3\2"+
		"\2\2 \u00a9\3\2\2\2\"\u00b2\3\2\2\2$\u00b9\3\2\2\2&\u00bb\3\2\2\2(\u00c9"+
		"\3\2\2\2*\u00cb\3\2\2\2,\u00e1\3\2\2\2.\u00e9\3\2\2\2\60\u00eb\3\2\2\2"+
		"\62\u00f1\3\2\2\2\64\u00f7\3\2\2\2\66\u00fc\3\2\2\28\u00fe\3\2\2\2:\u010f"+
		"\3\2\2\2<\u011b\3\2\2\2>\u011d\3\2\2\2@\u011f\3\2\2\2BC\5\4\3\2C\3\3\2"+
		"\2\2DE\b\3\1\2EF\5\6\4\2FG\7\37\2\2GJ\3\2\2\2HJ\5\b\5\2ID\3\2\2\2IH\3"+
		"\2\2\2JO\3\2\2\2KL\f\4\2\2LN\5\4\3\5MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2P\5\3\2\2\2QO\3\2\2\2RZ\5\32\16\2SZ\5&\24\2TZ\5\16\b\2UZ\5\22\n"+
		"\2VZ\5\24\13\2WZ\5\26\f\2XZ\5\30\r\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3"+
		"\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[\\\b\5\1\2\\_\5,\27\2"+
		"]_\5\66\34\2^[\3\2\2\2^]\3\2\2\2_d\3\2\2\2`a\f\5\2\2ac\5\b\5\6b`\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fd\3\2\2\2gh\t\2\2\2h\13\3"+
		"\2\2\2ij\t\3\2\2j\r\3\2\2\2kl\5\f\7\2l\17\3\2\2\2mq\5\16\b\2nq\5\n\6\2"+
		"oq\5> \2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\21\3\2\2\2ru\5$\23\2su\7\n\2\2"+
		"tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\25\2\2w{\7\4\2\2xz\5*\26\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\5\2\2\177"+
		"\23\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\f\7"+
		"\2\u0083\u0084\7\5\2\2\u0084\25\3\2\2\2\u0085\u0086\7\13\2\2\u0086\u0087"+
		"\5\16\b\2\u0087\u0088\7\32\2\2\u0088\u0089\5\n\6\2\u0089\27\3\2\2\2\u008a"+
		"\u008b\7\f\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\32\2\2\u008d\u008e\5"+
		"> \2\u008e\31\3\2\2\2\u008f\u0094\5\34\17\2\u0090\u0094\5\36\20\2\u0091"+
		"\u0094\5 \21\2\u0092\u0094\5\"\22\2\u0093\u008f\3\2\2\2\u0093\u0090\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\33\3\2\2\2\u0095"+
		"\u0098\5\16\b\2\u0096\u0098\5\n\6\2\u0097\u0095\3\2\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\7\33\2\2\u009a\u009d\5\16\b\2\u009b"+
		"\u009d\5\n\6\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\35\3\2\2"+
		"\2\u009e\u00a1\5\16\b\2\u009f\u00a1\5\n\6\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\7\34\2\2\u00a3\u00a6\5"+
		"\16\b\2\u00a4\u00a6\5\n\6\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\37\3\2\2\2\u00a7\u00aa\5\16\b\2\u00a8\u00aa\5\n\6\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\7\35\2\2\u00ac"+
		"\u00af\5\16\b\2\u00ad\u00af\5\n\6\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af!\3\2\2\2\u00b0\u00b3\5\16\b\2\u00b1\u00b3\5\n\6\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\7\36\2\2"+
		"\u00b5\u00b8\5\16\b\2\u00b6\u00b8\5\n\6\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\t\4\2\2\u00ba%\3\2\2\2\u00bb\u00bc"+
		"\5(\25\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\7\32\2\2\u00be\u00bf\7\3\2\2"+
		"\u00bf\u00c0\5(\25\2\u00c0\u00c4\7\4\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8\'\3\2\2\2"+
		"\u00c9\u00ca\5$\23\2\u00ca)\3\2\2\2\u00cb\u00cc\b\26\1\2\u00cc\u00cd\5"+
		"\16\b\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf\f\3\2\2\u00cf\u00d0\7\r\2\2\u00d0"+
		"\u00d2\5*\26\4\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4+\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e2"+
		"\5\60\31\2\u00d7\u00db\5\60\31\2\u00d8\u00da\5\62\32\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\64\33\2\u00df\u00de\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00d7\3\2\2\2\u00e2-\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\5\4\3\2"+
		"\u00e5\u00e6\7\7\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e8\7\6\2\2\u00e8\u00ea"+
		"\7\7\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea/\3\2\2\2\u00eb"+
		"\u00ec\7\16\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5<\37\2\u00ee\u00ef\7"+
		"\5\2\2\u00ef\u00f0\5.\30\2\u00f0\61\3\2\2\2\u00f1\u00f2\7\17\2\2\u00f2"+
		"\u00f3\7\4\2\2\u00f3\u00f4\5<\37\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\5."+
		"\30\2\u00f6\63\3\2\2\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\5.\30\2\u00f9"+
		"\65\3\2\2\2\u00fa\u00fd\58\35\2\u00fb\u00fd\5:\36\2\u00fc\u00fa\3\2\2"+
		"\2\u00fc\u00fb\3\2\2\2\u00fd\67\3\2\2\2\u00fe\u00ff\7\23\2\2\u00ff\u0102"+
		"\7\4\2\2\u0100\u0103\5\16\b\2\u0101\u0103\5\26\f\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\7\37\2\2\u0105\u0106\5<\37\2\u0106\u010a\7\37\2\2\u0107\u0108\5\16\b"+
		"\2\u0108\u0109\7(\2\2\u0109\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\5\2\2\u010d\u010e\5.\30\2\u010e"+
		"9\3\2\2\2\u010f\u0110\7\24\2\2\u0110\u0111\7\4\2\2\u0111\u0112\5<\37\2"+
		"\u0112\u0113\7\5\2\2\u0113\u0114\7*\2\2\u0114;\3\2\2\2\u0115\u0116\5\20"+
		"\t\2\u0116\u0117\5@!\2\u0117\u0118\5\20\t\2\u0118\u011c\3\2\2\2\u0119"+
		"\u011c\5> \2\u011a\u011c\5\16\b\2\u011b\u0115\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c=\3\2\2\2\u011d\u011e\t\5\2\2\u011e?\3\2"+
		"\2\2\u011f\u0120\t\6\2\2\u0120A\3\2\2\2\35IOY^dpt{\u0093\u0097\u009c\u00a0"+
		"\u00a5\u00a9\u00ae\u00b2\u00b7\u00c4\u00d3\u00db\u00df\u00e1\u00e9\u00fc"+
		"\u0102\u010a\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}