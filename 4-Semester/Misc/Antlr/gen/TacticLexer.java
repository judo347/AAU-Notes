// Generated from E:\SourceTree\AAU-Notes\4-Semester\Misc\Antlr\TacticLexer.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TacticLexer extends Lexer {
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
		WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEW", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "TEAM", "PLAYER", "BOARD", 
			"INTEGER", "BOOL", "SEPERATOR", "IF", "ELSEIF", "ELSE", "TRUE", "FLASE", 
			"FOR", "WHILE", "DOT", "DIGIT", "LETTER", "WORD", "NUMBER", "ASSIGN", 
			"ADDITION", "SUBTRACTION", "DIVISION", "MULTIPLY", "ENDSTNT", "BOOL_EQUAL", 
			"BOOL_N_EQUAL", "BOOL_COND_AND", "BOOL_COND_OR", "BOOL_LESS", "BOOL_GREATER", 
			"BOOL_LESS_OR_EQUAL", "BOOL_GREATER_OR_EQUAL", "INCREMENT", "WS"
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
			"WS"
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


	public TacticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TacticLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\5\26\u00a4\n\26\3\27\3\27\7\27\u00a8\n\27\f\27\16\27\u00ab\13\27\3\30"+
		"\6\30\u00ae\n\30\r\30\16\30\u00af\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\6(\u00d8\n(\r(\16(\u00d9\3"+
		"(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\4\4\2C\\c|\3\2\13\f\2\u00df\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7W\3"+
		"\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17b\3\2\2\2\21i\3\2\2\2\23o\3"+
		"\2\2\2\25s\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33}\3\2\2\2\35\u0084\3\2\2"+
		"\2\37\u0089\3\2\2\2!\u008e\3\2\2\2#\u0094\3\2\2\2%\u0098\3\2\2\2\'\u009e"+
		"\3\2\2\2)\u00a0\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9"+
		"\3\2\2\2;\u00bb\3\2\2\2=\u00bd\3\2\2\2?\u00c0\3\2\2\2A\u00c3\3\2\2\2C"+
		"\u00c6\3\2\2\2E\u00c9\3\2\2\2G\u00cb\3\2\2\2I\u00cd\3\2\2\2K\u00d0\3\2"+
		"\2\2M\u00d3\3\2\2\2O\u00d7\3\2\2\2QR\7p\2\2RS\7g\2\2ST\7y\2\2T\4\3\2\2"+
		"\2UV\7*\2\2V\6\3\2\2\2WX\7+\2\2X\b\3\2\2\2YZ\7}\2\2Z\n\3\2\2\2[\\\7\177"+
		"\2\2\\\f\3\2\2\2]^\7V\2\2^_\7g\2\2_`\7c\2\2`a\7o\2\2a\16\3\2\2\2bc\7R"+
		"\2\2cd\7n\2\2de\7c\2\2ef\7{\2\2fg\7g\2\2gh\7t\2\2h\20\3\2\2\2ij\7D\2\2"+
		"jk\7q\2\2kl\7c\2\2lm\7t\2\2mn\7f\2\2n\22\3\2\2\2op\7k\2\2pq\7p\2\2qr\7"+
		"v\2\2r\24\3\2\2\2st\7d\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2w\26\3\2\2\2xy\7"+
		".\2\2y\30\3\2\2\2z{\7k\2\2{|\7h\2\2|\32\3\2\2\2}~\7g\2\2~\177\7n\2\2\177"+
		"\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\u0082\7k\2\2\u0082\u0083\7h\2\2"+
		"\u0083\34\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7n\2\2\u0086\u0087\7"+
		"u\2\2\u0087\u0088\7g\2\2\u0088\36\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d \3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7g\2\2\u0093\"\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7t\2\2\u0097$\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7j\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d&\3\2\2\2\u009e"+
		"\u009f\7\60\2\2\u009f(\3\2\2\2\u00a0\u00a1\4\62;\2\u00a1*\3\2\2\2\u00a2"+
		"\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4,\3\2\2\2\u00a5\u00a9\5+\26\2"+
		"\u00a6\u00a8\5+\26\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa.\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\5)\25\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\62"+
		"\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b88\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba"+
		":\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc<\3\2\2\2\u00bd\u00be\7?\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7?\2\2\u00c2@\3"+
		"\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c5\7(\2\2\u00c5B\3\2\2\2\u00c6\u00c7"+
		"\7~\2\2\u00c7\u00c8\7~\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7>\2\2\u00caF\3"+
		"\2\2\2\u00cb\u00cc\7@\2\2\u00ccH\3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cfJ\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2L\3"+
		"\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7-\2\2\u00d5N\3\2\2\2\u00d6\u00d8"+
		"\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b(\2\2\u00dcP\3\2\2\2\7"+
		"\2\u00a3\u00a9\u00af\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}