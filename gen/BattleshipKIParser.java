// Generated from /Users/tom/Documents/Dev/Studium/se-master/SEN-WS16-AFPA-UE03_3/BattleshipKI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BattleshipKIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LineBreak=4, Buchstabe=5, Ziffer=6;
	public static final int
		RULE_file = 0, RULE_row = 1, RULE_einleitungsSatz = 2, RULE_zufallsSatz = 3, 
		RULE_end = 4, RULE_koordinate = 5;
	public static final String[] ruleNames = {
		"file", "row", "einleitungsSatz", "zufallsSatz", "end", "koordinate"
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

	@Override
	public String getGrammarFileName() { return "BattleshipKI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BattleshipKIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BattleshipKIParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(12);
				row();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	public static class RowContext extends ParserRuleContext {
		public ZufallsSatzContext zufallsSatz() {
			return getRuleContext(ZufallsSatzContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(BattleshipKIParser.LineBreak, 0); }
		public TerminalNode EOF() { return getToken(BattleshipKIParser.EOF, 0); }
		public EinleitungsSatzContext einleitungsSatz() {
			return getRuleContext(EinleitungsSatzContext.class,0);
		}
		public KoordinateContext koordinate() {
			return getRuleContext(KoordinateContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		int _la;
		try {
			setState(28);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				zufallsSatz();
				setState(21);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==LineBreak) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				einleitungsSatz();
				setState(24);
				koordinate();
				setState(25);
				end();
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==LineBreak) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class EinleitungsSatzContext extends ParserRuleContext {
		public EinleitungsSatzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einleitungsSatz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterEinleitungsSatz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitEinleitungsSatz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitEinleitungsSatz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EinleitungsSatzContext einleitungsSatz() throws RecognitionException {
		EinleitungsSatzContext _localctx = new EinleitungsSatzContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_einleitungsSatz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
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

	public static class ZufallsSatzContext extends ParserRuleContext {
		public ZufallsSatzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zufallsSatz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterZufallsSatz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitZufallsSatz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitZufallsSatz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZufallsSatzContext zufallsSatz() throws RecognitionException {
		ZufallsSatzContext _localctx = new ZufallsSatzContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_zufallsSatz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__2);
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

	public static class KoordinateContext extends ParserRuleContext {
		public TerminalNode Buchstabe() { return getToken(BattleshipKIParser.Buchstabe, 0); }
		public TerminalNode Ziffer() { return getToken(BattleshipKIParser.Ziffer, 0); }
		public KoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koordinate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).enterKoordinate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BattleshipKIListener ) ((BattleshipKIListener)listener).exitKoordinate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BattleshipKIVisitor ) return ((BattleshipKIVisitor<? extends T>)visitor).visitKoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoordinateContext koordinate() throws RecognitionException {
		KoordinateContext _localctx = new KoordinateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_koordinate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(Buchstabe);
			setState(37);
			match(Ziffer);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\3\6\6%\2\21\3\2\2\2\4\36\3"+
		"\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16\20\5\4\3\2\17\16"+
		"\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21"+
		"\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\5\b\5\2\27\30\t\2\2\2\30\37"+
		"\3\2\2\2\31\32\5\6\4\2\32\33\5\f\7\2\33\34\5\n\6\2\34\35\t\2\2\2\35\37"+
		"\3\2\2\2\36\26\3\2\2\2\36\31\3\2\2\2\37\5\3\2\2\2 !\7\3\2\2!\7\3\2\2\2"+
		"\"#\7\4\2\2#\t\3\2\2\2$%\7\5\2\2%\13\3\2\2\2&\'\7\7\2\2\'(\7\b\2\2(\r"+
		"\3\2\2\2\4\21\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}