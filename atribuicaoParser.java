// Generated from atribuicao.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class atribuicaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ID=29, NumInt=30, NumFloat=31, 
		String=32, Ws=33;
	public static final int
		RULE_init = 0, RULE_cmd = 1, RULE_cmdExpressao = 2, RULE_cmdDeclara = 3, 
		RULE_cmdLer = 4, RULE_cmdEscrever = 5, RULE_cmdSe = 6, RULE_cmdSenaoSe = 7, 
		RULE_cmdSenao = 8, RULE_cmdFor = 9, RULE_cmdEnquanto = 10, RULE_inicializaFor = 11, 
		RULE_testeFor = 12, RULE_atualizaFor = 13, RULE_expressao = 14, RULE_termo = 15, 
		RULE_fator = 16, RULE_operadorAtribuicao = 17, RULE_operadorComparacao = 18, 
		RULE_leftPar = 19, RULE_rightPar = 20, RULE_leftChaves = 21, RULE_rightChaves = 22, 
		RULE_mais = 23, RULE_menos = 24, RULE_mult = 25, RULE_div = 26, RULE_operadorMatematico = 27, 
		RULE_tipo = 28, RULE_booleano = 29, RULE_booleanoTrue = 30, RULE_booleanoFalse = 31, 
		RULE_fim = 32, RULE_string = 33, RULE_var = 34, RULE_num = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "cmd", "cmdExpressao", "cmdDeclara", "cmdLer", "cmdEscrever", 
			"cmdSe", "cmdSenaoSe", "cmdSenao", "cmdFor", "cmdEnquanto", "inicializaFor", 
			"testeFor", "atualizaFor", "expressao", "termo", "fator", "operadorAtribuicao", 
			"operadorComparacao", "leftPar", "rightPar", "leftChaves", "rightChaves", 
			"mais", "menos", "mult", "div", "operadorMatematico", "tipo", "booleano", 
			"booleanoTrue", "booleanoFalse", "fim", "string", "var", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'leia'", "'escreva'", "'se'", "'senao se'", "'senao'", "'para'", 
			"'enquanto'", "'='", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'('", 
			"')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'booleano'", "'int'", 
			"'flutuante'", "'true'", "'false'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "NumInt", "NumFloat", "String", "Ws"
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
	public String getGrammarFileName() { return "atribuicao.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public atribuicaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				cmd();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLerContext cmdLer() {
			return getRuleContext(CmdLerContext.class,0);
		}
		public CmdEscreverContext cmdEscrever() {
			return getRuleContext(CmdEscreverContext.class,0);
		}
		public CmdDeclaraContext cmdDeclara() {
			return getRuleContext(CmdDeclaraContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdExpressaoContext cmdExpressao() {
			return getRuleContext(CmdExpressaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				cmdLer();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				cmdEscrever();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				cmdDeclara();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				cmdFor();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				cmdEnquanto();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				cmdSe();
				}
				break;
			case T__14:
			case ID:
			case NumInt:
			case NumFloat:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				cmdExpressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdExpressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public CmdExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdExpressao(this);
		}
	}

	public final CmdExpressaoContext cmdExpressao() throws RecognitionException {
		CmdExpressaoContext _localctx = new CmdExpressaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmdExpressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			expressao(0);
			setState(87);
			fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDeclaraContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public CmdDeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDeclara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdDeclara(this);
		}
	}

	public final CmdDeclaraContext cmdDeclara() throws RecognitionException {
		CmdDeclaraContext _localctx = new CmdDeclaraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdDeclara);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(89);
				tipo();
				setState(90);
				var();
				setState(91);
				fim();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(93);
				tipo();
				setState(94);
				var();
				setState(95);
				operadorAtribuicao();
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(96);
					var();
					}
					break;
				case NumInt:
				case NumFloat:
					{
					setState(97);
					num();
					}
					break;
				case T__27:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101);
				fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLerContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public CmdLerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdLer(this);
		}
	}

	public final CmdLerContext cmdLer() throws RecognitionException {
		CmdLerContext _localctx = new CmdLerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdLer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(106);
			leftPar();
			setState(107);
			var();
			setState(108);
			rightPar();
			setState(109);
			fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscreverContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CmdEscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdEscrever(this);
		}
	}

	public final CmdEscreverContext cmdEscrever() throws RecognitionException {
		CmdEscreverContext _localctx = new CmdEscreverContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdEscrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__1);
			setState(112);
			leftPar();
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(113);
				string();
				}
				break;
			case ID:
				{
				setState(114);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			rightPar();
			setState(118);
			fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OperadorComparacaoContext operadorComparacao() {
			return getRuleContext(OperadorComparacaoContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public LeftChavesContext leftChaves() {
			return getRuleContext(LeftChavesContext.class,0);
		}
		public RightChavesContext rightChaves() {
			return getRuleContext(RightChavesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdSenaoSeContext> cmdSenaoSe() {
			return getRuleContexts(CmdSenaoSeContext.class);
		}
		public CmdSenaoSeContext cmdSenaoSe(int i) {
			return getRuleContext(CmdSenaoSeContext.class,i);
		}
		public List<CmdSenaoContext> cmdSenao() {
			return getRuleContexts(CmdSenaoContext.class);
		}
		public CmdSenaoContext cmdSenao(int i) {
			return getRuleContext(CmdSenaoContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__2);
			setState(121);
			leftPar();
			setState(122);
			expressao(0);
			setState(123);
			operadorComparacao();
			setState(124);
			expressao(0);
			setState(125);
			rightPar();
			setState(126);
			leftChaves();
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				cmd();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(132);
			rightChaves();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(133);
				cmdSenaoSe();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(139);
				cmdSenao();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSenaoSeContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OperadorComparacaoContext operadorComparacao() {
			return getRuleContext(OperadorComparacaoContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public LeftChavesContext leftChaves() {
			return getRuleContext(LeftChavesContext.class,0);
		}
		public RightChavesContext rightChaves() {
			return getRuleContext(RightChavesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSenaoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdSenaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdSenaoSe(this);
		}
	}

	public final CmdSenaoSeContext cmdSenaoSe() throws RecognitionException {
		CmdSenaoSeContext _localctx = new CmdSenaoSeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdSenaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__3);
			setState(146);
			leftPar();
			setState(147);
			expressao(0);
			setState(148);
			operadorComparacao();
			setState(149);
			expressao(0);
			setState(150);
			rightPar();
			setState(151);
			leftChaves();
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(152);
				cmd();
				}
				}
				setState(155); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(157);
			rightChaves();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSenaoContext extends ParserRuleContext {
		public LeftChavesContext leftChaves() {
			return getRuleContext(LeftChavesContext.class,0);
		}
		public RightChavesContext rightChaves() {
			return getRuleContext(RightChavesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdSenao(this);
		}
	}

	public final CmdSenaoContext cmdSenao() throws RecognitionException {
		CmdSenaoContext _localctx = new CmdSenaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__4);
			setState(160);
			leftChaves();
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				cmd();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(166);
			rightChaves();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdForContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public InicializaForContext inicializaFor() {
			return getRuleContext(InicializaForContext.class,0);
		}
		public TesteForContext testeFor() {
			return getRuleContext(TesteForContext.class,0);
		}
		public AtualizaForContext atualizaFor() {
			return getRuleContext(AtualizaForContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public LeftChavesContext leftChaves() {
			return getRuleContext(LeftChavesContext.class,0);
		}
		public RightChavesContext rightChaves() {
			return getRuleContext(RightChavesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__5);
			setState(169);
			leftPar();
			setState(170);
			inicializaFor();
			setState(171);
			testeFor();
			setState(172);
			atualizaFor();
			setState(173);
			rightPar();
			setState(174);
			leftChaves();
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				cmd();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(180);
			rightChaves();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public LeftChavesContext leftChaves() {
			return getRuleContext(LeftChavesContext.class,0);
		}
		public RightChavesContext rightChaves() {
			return getRuleContext(RightChavesContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OperadorComparacaoContext operadorComparacao() {
			return getRuleContext(OperadorComparacaoContext.class,0);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__6);
			setState(183);
			leftPar();
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case ID:
			case NumInt:
			case NumFloat:
				{
				{
				setState(184);
				expressao(0);
				setState(185);
				operadorComparacao();
				setState(186);
				expressao(0);
				}
				}
				break;
			case T__25:
			case T__26:
				{
				setState(188);
				booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(191);
			rightPar();
			setState(192);
			leftChaves();
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				cmd();
				}
				}
				setState(196); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(198);
			rightChaves();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializaForContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public InicializaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterInicializaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitInicializaFor(this);
		}
	}

	public final InicializaForContext inicializaFor() throws RecognitionException {
		InicializaForContext _localctx = new InicializaForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inicializaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(200);
				tipo();
				}
			}

			setState(203);
			var();
			setState(204);
			operadorAtribuicao();
			setState(205);
			num();
			setState(206);
			fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TesteForContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperadorComparacaoContext operadorComparacao() {
			return getRuleContext(OperadorComparacaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public TesteForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testeFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTesteFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTesteFor(this);
		}
	}

	public final TesteForContext testeFor() throws RecognitionException {
		TesteForContext _localctx = new TesteForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_testeFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			var();
			setState(209);
			operadorComparacao();
			setState(210);
			num();
			setState(211);
			fim();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtualizaForContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtualizaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atualizaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterAtualizaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitAtualizaFor(this);
		}
	}

	public final AtualizaForContext atualizaFor() throws RecognitionException {
		AtualizaForContext _localctx = new AtualizaForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atualizaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			var();
			setState(214);
			operadorAtribuicao();
			setState(215);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public MaisContext mais() {
			return getRuleContext(MaisContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						mais();
						setState(222);
						termo(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						menos();
						setState(226);
						termo(0);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(236);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(237);
						mult();
						setState(238);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						div();
						setState(242);
						fator();
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LeftParContext leftPar() {
			return getRuleContext(LeftParContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RightParContext rightPar() {
			return getRuleContext(RightParContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
			case NumFloat:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				var();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				leftPar();
				setState(252);
				expressao(0);
				setState(253);
				rightPar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAtribuicaoContext extends ParserRuleContext {
		public OperadorAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperadorAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperadorAtribuicao(this);
		}
	}

	public final OperadorAtribuicaoContext operadorAtribuicao() throws RecognitionException {
		OperadorAtribuicaoContext _localctx = new OperadorAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operadorAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorComparacaoContext extends ParserRuleContext {
		public OperadorComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperadorComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperadorComparacao(this);
		}
	}

	public final OperadorComparacaoContext operadorComparacao() throws RecognitionException {
		OperadorComparacaoContext _localctx = new OperadorComparacaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadorComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftParContext extends ParserRuleContext {
		public LeftParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterLeftPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitLeftPar(this);
		}
	}

	public final LeftParContext leftPar() throws RecognitionException {
		LeftParContext _localctx = new LeftParContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_leftPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightParContext extends ParserRuleContext {
		public RightParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRightPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRightPar(this);
		}
	}

	public final RightParContext rightPar() throws RecognitionException {
		RightParContext _localctx = new RightParContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rightPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftChavesContext extends ParserRuleContext {
		public LeftChavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftChaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterLeftChaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitLeftChaves(this);
		}
	}

	public final LeftChavesContext leftChaves() throws RecognitionException {
		LeftChavesContext _localctx = new LeftChavesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_leftChaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightChavesContext extends ParserRuleContext {
		public RightChavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightChaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRightChaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRightChaves(this);
		}
	}

	public final RightChavesContext rightChaves() throws RecognitionException {
		RightChavesContext _localctx = new RightChavesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rightChaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaisContext extends ParserRuleContext {
		public MaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterMais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitMais(this);
		}
	}

	public final MaisContext mais() throws RecognitionException {
		MaisContext _localctx = new MaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MenosContext extends ParserRuleContext {
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitMenos(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorMatematicoContext extends ParserRuleContext {
		public MaisContext mais() {
			return getRuleContext(MaisContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public OperadorMatematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMatematico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperadorMatematico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperadorMatematico(this);
		}
	}

	public final OperadorMatematicoContext operadorMatematico() throws RecognitionException {
		OperadorMatematicoContext _localctx = new OperadorMatematicoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operadorMatematico);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				mais();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				menos();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				mult();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				div();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoTrueContext booleanoTrue() {
			return getRuleContext(BooleanoTrueContext.class,0);
		}
		public BooleanoFalseContext booleanoFalse() {
			return getRuleContext(BooleanoFalseContext.class,0);
		}
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_booleano);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				booleanoTrue();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				booleanoFalse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoTrueContext extends ParserRuleContext {
		public BooleanoTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanoTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterBooleanoTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitBooleanoTrue(this);
		}
	}

	public final BooleanoTrueContext booleanoTrue() throws RecognitionException {
		BooleanoTrueContext _localctx = new BooleanoTrueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanoTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoFalseContext extends ParserRuleContext {
		public BooleanoFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanoFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterBooleanoFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitBooleanoFalse(this);
		}
	}

	public final BooleanoFalseContext booleanoFalse() throws RecognitionException {
		BooleanoFalseContext _localctx = new BooleanoFalseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_booleanoFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FimContext extends ParserRuleContext {
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(atribuicaoParser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atribuicaoParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(atribuicaoParser.NumInt, 0); }
		public TerminalNode NumFloat() { return getToken(atribuicaoParser.NumFloat, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==NumInt || _la==NumFloat) ) {
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
		case 14:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 15:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u012e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0004\u0000J\b\u0000\u000b\u0000\f\u0000K\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003d\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0081\b\u0006\u000b\u0006\f\u0006"+
		"\u0082\u0001\u0006\u0001\u0006\u0005\u0006\u0087\b\u0006\n\u0006\f\u0006"+
		"\u008a\t\u0006\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090"+
		"\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u009a\b\u0007\u000b\u0007\f"+
		"\u0007\u009b\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b\u00a3"+
		"\b\b\u000b\b\f\b\u00a4\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00b1\b\t\u000b\t\f\t\u00b2\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00be\b\n\u0001\n\u0001\n\u0001\n\u0004\n\u00c3\b\n\u000b\n\f\n\u00c4"+
		"\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00ca\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e5\b\u000e\n\u000e\f\u000e"+
		"\u00e8\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00f5\b\u000f\n\u000f\f\u000f\u00f8\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0100"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u011a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0120\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0000\u0002\u001c\u001e$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0003"+
		"\u0001\u0000\t\u000e\u0001\u0000\u0017\u0019\u0001\u0000\u001e\u001f\u0127"+
		"\u0000I\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004V"+
		"\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bi\u0001\u0000"+
		"\u0000\u0000\no\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e"+
		"\u0091\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000\u0000\u0000\u0012"+
		"\u00a8\u0001\u0000\u0000\u0000\u0014\u00b6\u0001\u0000\u0000\u0000\u0016"+
		"\u00c9\u0001\u0000\u0000\u0000\u0018\u00d0\u0001\u0000\u0000\u0000\u001a"+
		"\u00d5\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000\u0000\u0000\u001e"+
		"\u00e9\u0001\u0000\u0000\u0000 \u00ff\u0001\u0000\u0000\u0000\"\u0101"+
		"\u0001\u0000\u0000\u0000$\u0103\u0001\u0000\u0000\u0000&\u0105\u0001\u0000"+
		"\u0000\u0000(\u0107\u0001\u0000\u0000\u0000*\u0109\u0001\u0000\u0000\u0000"+
		",\u010b\u0001\u0000\u0000\u0000.\u010d\u0001\u0000\u0000\u00000\u010f"+
		"\u0001\u0000\u0000\u00002\u0111\u0001\u0000\u0000\u00004\u0113\u0001\u0000"+
		"\u0000\u00006\u0119\u0001\u0000\u0000\u00008\u011b\u0001\u0000\u0000\u0000"+
		":\u011f\u0001\u0000\u0000\u0000<\u0121\u0001\u0000\u0000\u0000>\u0123"+
		"\u0001\u0000\u0000\u0000@\u0125\u0001\u0000\u0000\u0000B\u0127\u0001\u0000"+
		"\u0000\u0000D\u0129\u0001\u0000\u0000\u0000F\u012b\u0001\u0000\u0000\u0000"+
		"HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0001\u0001"+
		"\u0000\u0000\u0000MU\u0003\b\u0004\u0000NU\u0003\n\u0005\u0000OU\u0003"+
		"\u0006\u0003\u0000PU\u0003\u0012\t\u0000QU\u0003\u0014\n\u0000RU\u0003"+
		"\f\u0006\u0000SU\u0003\u0004\u0002\u0000TM\u0001\u0000\u0000\u0000TN\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0003\u001c\u000e\u0000WX\u0003"+
		"@ \u0000X\u0005\u0001\u0000\u0000\u0000YZ\u00038\u001c\u0000Z[\u0003D"+
		"\"\u0000[\\\u0003@ \u0000\\h\u0001\u0000\u0000\u0000]^\u00038\u001c\u0000"+
		"^_\u0003D\"\u0000_c\u0003\"\u0011\u0000`d\u0003D\"\u0000ad\u0003F#\u0000"+
		"bd\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0003@ \u0000"+
		"fh\u0001\u0000\u0000\u0000gY\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000"+
		"\u0000h\u0007\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u0003"+
		"&\u0013\u0000kl\u0003D\"\u0000lm\u0003(\u0014\u0000mn\u0003@ \u0000n\t"+
		"\u0001\u0000\u0000\u0000op\u0005\u0002\u0000\u0000ps\u0003&\u0013\u0000"+
		"qt\u0003B!\u0000rt\u0003D\"\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0003(\u0014\u0000vw\u0003@ "+
		"\u0000w\u000b\u0001\u0000\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0003"+
		"&\u0013\u0000z{\u0003\u001c\u000e\u0000{|\u0003$\u0012\u0000|}\u0003\u001c"+
		"\u000e\u0000}~\u0003(\u0014\u0000~\u0080\u0003*\u0015\u0000\u007f\u0081"+
		"\u0003\u0002\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0088"+
		"\u0003,\u0016\u0000\u0085\u0087\u0003\u000e\u0007\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008e\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0003"+
		"\u0010\b\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0003&\u0013\u0000"+
		"\u0093\u0094\u0003\u001c\u000e\u0000\u0094\u0095\u0003$\u0012\u0000\u0095"+
		"\u0096\u0003\u001c\u000e\u0000\u0096\u0097\u0003(\u0014\u0000\u0097\u0099"+
		"\u0003*\u0015\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0003,\u0016\u0000\u009e\u000f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005\u0005\u0000\u0000\u00a0\u00a2\u0003*\u0015"+
		"\u0000\u00a1\u00a3\u0003\u0002\u0001\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0003,\u0016\u0000\u00a7\u0011\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9\u00aa\u0003&\u0013\u0000\u00aa"+
		"\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac\u0003\u0018\f\u0000\u00ac\u00ad"+
		"\u0003\u001a\r\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00b0\u0003"+
		"*\u0015\u0000\u00af\u00b1\u0003\u0002\u0001\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0003,\u0016\u0000\u00b5\u0013\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7\u00bd\u0003&\u0013\u0000"+
		"\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9\u00ba\u0003$\u0012\u0000\u00ba"+
		"\u00bb\u0003\u001c\u000e\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0003:\u001d\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0003(\u0014\u0000\u00c0\u00c2\u0003*\u0015\u0000\u00c1\u00c3\u0003\u0002"+
		"\u0001\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003,\u0016"+
		"\u0000\u00c7\u0015\u0001\u0000\u0000\u0000\u00c8\u00ca\u00038\u001c\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003D\"\u0000\u00cc"+
		"\u00cd\u0003\"\u0011\u0000\u00cd\u00ce\u0003F#\u0000\u00ce\u00cf\u0003"+
		"@ \u0000\u00cf\u0017\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003D\"\u0000"+
		"\u00d1\u00d2\u0003$\u0012\u0000\u00d2\u00d3\u0003F#\u0000\u00d3\u00d4"+
		"\u0003@ \u0000\u00d4\u0019\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003D"+
		"\"\u0000\u00d6\u00d7\u0003\"\u0011\u0000\u00d7\u00d8\u0003\u001c\u000e"+
		"\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\u00d9\u00da\u0006\u000e\uffff"+
		"\uffff\u0000\u00da\u00db\u0003\u001e\u000f\u0000\u00db\u00e6\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\n\u0003\u0000\u0000\u00dd\u00de\u0003.\u0017"+
		"\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\n\u0002\u0000\u0000\u00e1\u00e2\u00030\u0018\u0000"+
		"\u00e2\u00e3\u0003\u001e\u000f\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e4\u00dc\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u001d\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0006\u000f\uffff\uffff"+
		"\u0000\u00ea\u00eb\u0003 \u0010\u0000\u00eb\u00f6\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\n\u0003\u0000\u0000\u00ed\u00ee\u00032\u0019\u0000\u00ee"+
		"\u00ef\u0003 \u0010\u0000\u00ef\u00f5\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\n\u0002\u0000\u0000\u00f1\u00f2\u00034\u001a\u0000\u00f2\u00f3\u0003"+
		" \u0010\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u001f\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f9\u0100\u0003F#\u0000\u00fa\u0100\u0003D\"\u0000\u00fb"+
		"\u00fc\u0003&\u0013\u0000\u00fc\u00fd\u0003\u001c\u000e\u0000\u00fd\u00fe"+
		"\u0003(\u0014\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00f9\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fa\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001"+
		"\u0000\u0000\u0000\u0100!\u0001\u0000\u0000\u0000\u0101\u0102\u0005\b"+
		"\u0000\u0000\u0102#\u0001\u0000\u0000\u0000\u0103\u0104\u0007\u0000\u0000"+
		"\u0000\u0104%\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u000f\u0000\u0000"+
		"\u0106\'\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0010\u0000\u0000\u0108"+
		")\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a+\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\u0012\u0000\u0000\u010c-\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u0013\u0000\u0000\u010e/\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005\u0014\u0000\u0000\u01101\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005\u0015\u0000\u0000\u01123\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005\u0016\u0000\u0000\u01145\u0001\u0000\u0000\u0000\u0115\u011a"+
		"\u0003.\u0017\u0000\u0116\u011a\u00030\u0018\u0000\u0117\u011a\u00032"+
		"\u0019\u0000\u0118\u011a\u00034\u001a\u0000\u0119\u0115\u0001\u0000\u0000"+
		"\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a7\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0007\u0001\u0000\u0000\u011c9\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0003<\u001e\u0000\u011e\u0120\u0003>\u001f\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120;\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\u001a\u0000\u0000\u0122=\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u001b\u0000\u0000\u0124?\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u001c\u0000\u0000\u0126A\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005 \u0000\u0000\u0128C\u0001\u0000\u0000\u0000\u0129\u012a\u0005"+
		"\u001d\u0000\u0000\u012aE\u0001\u0000\u0000\u0000\u012b\u012c\u0007\u0002"+
		"\u0000\u0000\u012cG\u0001\u0000\u0000\u0000\u0015KTcgs\u0082\u0088\u008e"+
		"\u009b\u00a4\u00b2\u00bd\u00c4\u00c9\u00e4\u00e6\u00f4\u00f6\u00ff\u0119"+
		"\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}