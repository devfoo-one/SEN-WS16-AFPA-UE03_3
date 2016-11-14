// Generated from /Users/tom/Documents/Dev/Studium/se-master/SEN-WS16-AFPA-UE03_3/BattleshipKI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BattleshipKILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LineBreak=4, Buchstabe=5, Ziffer=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LineBreak", "Buchstabe", "Ziffer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Der Computer feuert auf '", "'Der Computer feuert per Zufall auf eine noch nicht getroffene Zelle.'", 
		"'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LineBreak", "Buchstabe", "Ziffer"
	};
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


	public BattleshipKILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BattleshipKI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bz\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\5\5q\n\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\3\2\3\3\2\639{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5(\3\2\2\2\7m\3\2\2\2\tt\3\2"+
		"\2\2\13v\3\2\2\2\rx\3\2\2\2\17\20\7F\2\2\20\21\7g\2\2\21\22\7t\2\2\22"+
		"\23\7\"\2\2\23\24\7E\2\2\24\25\7q\2\2\25\26\7o\2\2\26\27\7r\2\2\27\30"+
		"\7w\2\2\30\31\7v\2\2\31\32\7g\2\2\32\33\7t\2\2\33\34\7\"\2\2\34\35\7h"+
		"\2\2\35\36\7g\2\2\36\37\7w\2\2\37 \7g\2\2 !\7t\2\2!\"\7v\2\2\"#\7\"\2"+
		"\2#$\7c\2\2$%\7w\2\2%&\7h\2\2&\'\7\"\2\2\'\4\3\2\2\2()\7F\2\2)*\7g\2\2"+
		"*+\7t\2\2+,\7\"\2\2,-\7E\2\2-.\7q\2\2./\7o\2\2/\60\7r\2\2\60\61\7w\2\2"+
		"\61\62\7v\2\2\62\63\7g\2\2\63\64\7t\2\2\64\65\7\"\2\2\65\66\7h\2\2\66"+
		"\67\7g\2\2\678\7w\2\289\7g\2\29:\7t\2\2:;\7v\2\2;<\7\"\2\2<=\7r\2\2=>"+
		"\7g\2\2>?\7t\2\2?@\7\"\2\2@A\7\\\2\2AB\7w\2\2BC\7h\2\2CD\7c\2\2DE\7n\2"+
		"\2EF\7n\2\2FG\7\"\2\2GH\7c\2\2HI\7w\2\2IJ\7h\2\2JK\7\"\2\2KL\7g\2\2LM"+
		"\7k\2\2MN\7p\2\2NO\7g\2\2OP\7\"\2\2PQ\7p\2\2QR\7q\2\2RS\7e\2\2ST\7j\2"+
		"\2TU\7\"\2\2UV\7p\2\2VW\7k\2\2WX\7e\2\2XY\7j\2\2YZ\7v\2\2Z[\7\"\2\2[\\"+
		"\7i\2\2\\]\7g\2\2]^\7v\2\2^_\7t\2\2_`\7q\2\2`a\7h\2\2ab\7h\2\2bc\7g\2"+
		"\2cd\7p\2\2de\7g\2\2ef\7\"\2\2fg\7\\\2\2gh\7g\2\2hi\7n\2\2ij\7n\2\2jk"+
		"\7g\2\2kl\7\60\2\2l\6\3\2\2\2mn\7\60\2\2n\b\3\2\2\2oq\7\17\2\2po\3\2\2"+
		"\2pq\3\2\2\2qr\3\2\2\2ru\7\f\2\2su\7\17\2\2tp\3\2\2\2ts\3\2\2\2u\n\3\2"+
		"\2\2vw\4CI\2w\f\3\2\2\2xy\t\2\2\2y\16\3\2\2\2\5\2pt\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}