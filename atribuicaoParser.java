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
		RULE_cmdAtribuicao = 4, RULE_cmdLer = 5, RULE_cmdEscrever = 6, RULE_cmdSe = 7, 
		RULE_cmdSenaoSe = 8, RULE_cmdSenao = 9, RULE_cmdFor = 10, RULE_cmdEnquanto = 11, 
		RULE_inicializaFor = 12, RULE_testeFor = 13, RULE_atualizaFor = 14, RULE_expressao = 15, 
		RULE_termo = 16, RULE_fator = 17, RULE_operadorAtribuicao = 18, RULE_operadorComparacao = 19, 
		RULE_leftPar = 20, RULE_rightPar = 21, RULE_leftChaves = 22, RULE_rightChaves = 23, 
		RULE_mais = 24, RULE_menos = 25, RULE_mult = 26, RULE_div = 27, RULE_operadorMatematico = 28, 
		RULE_tipo = 29, RULE_booleano = 30, RULE_booleanoTrue = 31, RULE_booleanoFalse = 32, 
		RULE_fim = 33, RULE_string = 34, RULE_var = 35, RULE_num = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "cmd", "cmdExpressao", "cmdDeclara", "cmdAtribuicao", "cmdLer", 
			"cmdEscrever", "cmdSe", "cmdSenaoSe", "cmdSenao", "cmdFor", "cmdEnquanto", 
			"inicializaFor", "testeFor", "atualizaFor", "expressao", "termo", "fator", 
			"operadorAtribuicao", "operadorComparacao", "leftPar", "rightPar", "leftChaves", 
			"rightChaves", "mais", "menos", "mult", "div", "operadorMatematico", 
			"tipo", "booleano", "booleanoTrue", "booleanoFalse", "fim", "string", 
			"var", "num"
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
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				cmd();
				}
				}
				setState(77); 
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
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				cmdLer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				cmdEscrever();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				cmdDeclara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				cmdAtribuicao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				cmdFor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				cmdSe();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				cmdExpressao();
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
			setState(89);
			expressao(0);
			setState(90);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(92);
				tipo();
				setState(93);
				var();
				setState(94);
				fim();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(96);
				tipo();
				setState(97);
				var();
				setState(98);
				operadorAtribuicao();
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(99);
					var();
					}
					break;
				case NumInt:
				case NumFloat:
					{
					setState(100);
					num();
					}
					break;
				case String:
					{
					setState(101);
					string();
					}
					break;
				case T__25:
				case T__26:
					{
					setState(102);
					booleano();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105);
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
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public OperadorAtribuicaoContext operadorAtribuicao() {
			return getRuleContext(OperadorAtribuicaoContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			var();
			setState(110);
			operadorAtribuicao();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(111);
					var();
					}
					break;
				case NumInt:
				case NumFloat:
					{
					setState(112);
					num();
					}
					break;
				case String:
					{
					setState(113);
					string();
					}
					break;
				case T__25:
				case T__26:
					{
					setState(114);
					booleano();
					}
					break;
				case T__27:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(118);
				expressao(0);
				}
				break;
			}
			setState(121);
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
		enterRule(_localctx, 10, RULE_cmdLer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__0);
			setState(124);
			leftPar();
			setState(125);
			var();
			setState(126);
			rightPar();
			setState(127);
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
		enterRule(_localctx, 12, RULE_cmdEscrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__1);
			setState(130);
			leftPar();
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				setState(131);
				string();
				}
				break;
			case ID:
				{
				setState(132);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
			rightPar();
			setState(136);
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
		enterRule(_localctx, 14, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__2);
			setState(139);
			leftPar();
			setState(140);
			expressao(0);
			setState(141);
			operadorComparacao();
			setState(142);
			expressao(0);
			setState(143);
			rightPar();
			setState(144);
			leftChaves();
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				cmd();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(150);
			rightChaves();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(151);
				cmdSenaoSe();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(157);
				cmdSenao();
				}
				}
				setState(162);
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
		enterRule(_localctx, 16, RULE_cmdSenaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__3);
			setState(164);
			leftPar();
			setState(165);
			expressao(0);
			setState(166);
			operadorComparacao();
			setState(167);
			expressao(0);
			setState(168);
			rightPar();
			setState(169);
			leftChaves();
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				cmd();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(175);
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
		enterRule(_localctx, 18, RULE_cmdSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__4);
			setState(178);
			leftChaves();
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				cmd();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(184);
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
		enterRule(_localctx, 20, RULE_cmdFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__5);
			setState(187);
			leftPar();
			setState(188);
			inicializaFor();
			setState(189);
			testeFor();
			setState(190);
			atualizaFor();
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
		enterRule(_localctx, 22, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__6);
			setState(201);
			leftPar();
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case ID:
			case NumInt:
			case NumFloat:
				{
				{
				setState(202);
				expressao(0);
				setState(203);
				operadorComparacao();
				setState(204);
				expressao(0);
				}
				}
				break;
			case T__25:
			case T__26:
				{
				setState(206);
				booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			rightPar();
			setState(210);
			leftChaves();
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				cmd();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3816849614L) != 0) );
			setState(216);
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
		enterRule(_localctx, 24, RULE_inicializaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(218);
				tipo();
				}
			}

			setState(221);
			var();
			setState(222);
			operadorAtribuicao();
			setState(223);
			num();
			setState(224);
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
		enterRule(_localctx, 26, RULE_testeFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			var();
			setState(227);
			operadorComparacao();
			setState(228);
			num();
			setState(229);
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
		enterRule(_localctx, 28, RULE_atualizaFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			var();
			setState(232);
			operadorAtribuicao();
			setState(233);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(236);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						mais();
						setState(240);
						termo(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						menos();
						setState(244);
						termo(0);
						}
						break;
					}
					} 
				}
				setState(250);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(254);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(255);
						mult();
						setState(256);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(259);
						div();
						setState(260);
						fator();
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 34, RULE_fator);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumInt:
			case NumFloat:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				num();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				var();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				leftPar();
				setState(270);
				expressao(0);
				setState(271);
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
		enterRule(_localctx, 36, RULE_operadorAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 38, RULE_operadorComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 40, RULE_leftPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		enterRule(_localctx, 42, RULE_rightPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 44, RULE_leftChaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 46, RULE_rightChaves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 48, RULE_mais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 50, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 52, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 54, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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
		enterRule(_localctx, 56, RULE_operadorMatematico);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				mais();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				menos();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				mult();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
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
		enterRule(_localctx, 58, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		enterRule(_localctx, 60, RULE_booleano);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				booleanoTrue();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
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
		enterRule(_localctx, 62, RULE_booleanoTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
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
		enterRule(_localctx, 64, RULE_booleanoFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 66, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 68, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 70, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 72, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		case 15:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 16:
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
		"\u0004\u0001!\u0140\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0004\u0000L\b\u0000\u000b\u0000\f"+
		"\u0000M\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003h\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003l\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0004\u0003\u0004x\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0086\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u0093\b\u0007\u000b\u0007\f\u0007\u0094\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001"+
		"\u0007\u0005\u0007\u009f\b\u0007\n\u0007\f\u0007\u00a2\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00ac"+
		"\b\b\u000b\b\f\b\u00ad\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\t"+
		"\u00b5\b\t\u000b\t\f\t\u00b6\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00c3\b\n\u000b\n\f\n\u00c4"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d0\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00d5\b\u000b\u000b\u000b\f\u000b\u00d6"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u00dc\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00f7\b\u000f\n\u000f\f\u000f\u00fa"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0107\b\u0010\n\u0010\f\u0010\u010a\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0112\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u012c\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0132\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0000\u0002"+
		"\u001e %\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0003\u0001\u0000\t\u000e"+
		"\u0001\u0000\u0017\u0019\u0001\u0000\u001e\u001f\u013f\u0000K\u0001\u0000"+
		"\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000"+
		"\u0006k\u0001\u0000\u0000\u0000\bm\u0001\u0000\u0000\u0000\n{\u0001\u0000"+
		"\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000"+
		"\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000"+
		"\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00c8\u0001\u0000\u0000"+
		"\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00e2\u0001\u0000\u0000"+
		"\u0000\u001c\u00e7\u0001\u0000\u0000\u0000\u001e\u00eb\u0001\u0000\u0000"+
		"\u0000 \u00fb\u0001\u0000\u0000\u0000\"\u0111\u0001\u0000\u0000\u0000"+
		"$\u0113\u0001\u0000\u0000\u0000&\u0115\u0001\u0000\u0000\u0000(\u0117"+
		"\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u011b\u0001\u0000"+
		"\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u011f\u0001\u0000\u0000\u0000"+
		"2\u0121\u0001\u0000\u0000\u00004\u0123\u0001\u0000\u0000\u00006\u0125"+
		"\u0001\u0000\u0000\u00008\u012b\u0001\u0000\u0000\u0000:\u012d\u0001\u0000"+
		"\u0000\u0000<\u0131\u0001\u0000\u0000\u0000>\u0133\u0001\u0000\u0000\u0000"+
		"@\u0135\u0001\u0000\u0000\u0000B\u0137\u0001\u0000\u0000\u0000D\u0139"+
		"\u0001\u0000\u0000\u0000F\u013b\u0001\u0000\u0000\u0000H\u013d\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0001\u0001\u0000\u0000\u0000OX\u0003\n\u0005\u0000PX\u0003\f\u0006"+
		"\u0000QX\u0003\u0006\u0003\u0000RX\u0003\b\u0004\u0000SX\u0003\u0014\n"+
		"\u0000TX\u0003\u0016\u000b\u0000UX\u0003\u000e\u0007\u0000VX\u0003\u0004"+
		"\u0002\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000WQ\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u0003\u0001\u0000\u0000\u0000YZ\u0003\u001e\u000f\u0000Z[\u0003"+
		"B!\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0003:\u001d\u0000]^\u0003"+
		"F#\u0000^_\u0003B!\u0000_l\u0001\u0000\u0000\u0000`a\u0003:\u001d\u0000"+
		"ab\u0003F#\u0000bg\u0003$\u0012\u0000ch\u0003F#\u0000dh\u0003H$\u0000"+
		"eh\u0003D\"\u0000fh\u0003<\u001e\u0000gc\u0001\u0000\u0000\u0000gd\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0003B!\u0000jl\u0001\u0000\u0000\u0000k"+
		"\\\u0001\u0000\u0000\u0000k`\u0001\u0000\u0000\u0000l\u0007\u0001\u0000"+
		"\u0000\u0000mn\u0003F#\u0000nw\u0003$\u0012\u0000ou\u0003F#\u0000pu\u0003"+
		"H$\u0000qu\u0003D\"\u0000ru\u0003<\u001e\u0000su\u0001\u0000\u0000\u0000"+
		"to\u0001\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vx\u0003\u001e\u000f\u0000wt\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0003B!\u0000z\t\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000|}\u0003(\u0014\u0000}~\u0003"+
		"F#\u0000~\u007f\u0003*\u0015\u0000\u007f\u0080\u0003B!\u0000\u0080\u000b"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082\u0085"+
		"\u0003(\u0014\u0000\u0083\u0086\u0003D\"\u0000\u0084\u0086\u0003F#\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0003*\u0015\u0000\u0088"+
		"\u0089\u0003B!\u0000\u0089\r\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u0003\u0000\u0000\u008b\u008c\u0003(\u0014\u0000\u008c\u008d\u0003\u001e"+
		"\u000f\u0000\u008d\u008e\u0003&\u0013\u0000\u008e\u008f\u0003\u001e\u000f"+
		"\u0000\u008f\u0090\u0003*\u0015\u0000\u0090\u0092\u0003,\u0016\u0000\u0091"+
		"\u0093\u0003\u0002\u0001\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u009a\u0003.\u0017\u0000\u0097\u0099\u0003\u0010\b\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a0"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0003\u0012\t\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a5\u0003"+
		"(\u0014\u0000\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00a7\u0003&\u0013"+
		"\u0000\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8\u00a9\u0003*\u0015\u0000"+
		"\u00a9\u00ab\u0003,\u0016\u0000\u00aa\u00ac\u0003\u0002\u0001\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0003.\u0017\u0000\u00b0\u0011"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2\u00b4"+
		"\u0003,\u0016\u0000\u00b3\u00b5\u0003\u0002\u0001\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0003.\u0017\u0000\u00b9\u0013\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00bc\u0003(\u0014"+
		"\u0000\u00bc\u00bd\u0003\u0018\f\u0000\u00bd\u00be\u0003\u001a\r\u0000"+
		"\u00be\u00bf\u0003\u001c\u000e\u0000\u00bf\u00c0\u0003*\u0015\u0000\u00c0"+
		"\u00c2\u0003,\u0016\u0000\u00c1\u00c3\u0003\u0002\u0001\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003.\u0017\u0000\u00c7\u0015\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0007\u0000\u0000\u00c9\u00cf\u0003"+
		"(\u0014\u0000\u00ca\u00cb\u0003\u001e\u000f\u0000\u00cb\u00cc\u0003&\u0013"+
		"\u0000\u00cc\u00cd\u0003\u001e\u000f\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0003<\u001e\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0003*\u0015\u0000\u00d2\u00d4\u0003,\u0016\u0000\u00d3\u00d5"+
		"\u0003\u0002\u0001\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003.\u0017\u0000\u00d9\u0017\u0001\u0000\u0000\u0000\u00da\u00dc\u0003"+
		":\u001d\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0003F#\u0000"+
		"\u00de\u00df\u0003$\u0012\u0000\u00df\u00e0\u0003H$\u0000\u00e0\u00e1"+
		"\u0003B!\u0000\u00e1\u0019\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003F"+
		"#\u0000\u00e3\u00e4\u0003&\u0013\u0000\u00e4\u00e5\u0003H$\u0000\u00e5"+
		"\u00e6\u0003B!\u0000\u00e6\u001b\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003"+
		"F#\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea\u0003\u001e\u000f"+
		"\u0000\u00ea\u001d\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006\u000f\uffff"+
		"\uffff\u0000\u00ec\u00ed\u0003 \u0010\u0000\u00ed\u00f8\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\n\u0003\u0000\u0000\u00ef\u00f0\u00030\u0018\u0000"+
		"\u00f0\u00f1\u0003 \u0010\u0000\u00f1\u00f7\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\n\u0002\u0000\u0000\u00f3\u00f4\u00032\u0019\u0000\u00f4\u00f5"+
		"\u0003 \u0010\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0006\u0010\uffff\uffff\u0000\u00fc\u00fd"+
		"\u0003\"\u0011\u0000\u00fd\u0108\u0001\u0000\u0000\u0000\u00fe\u00ff\n"+
		"\u0003\u0000\u0000\u00ff\u0100\u00034\u001a\u0000\u0100\u0101\u0003\""+
		"\u0011\u0000\u0101\u0107\u0001\u0000\u0000\u0000\u0102\u0103\n\u0002\u0000"+
		"\u0000\u0103\u0104\u00036\u001b\u0000\u0104\u0105\u0003\"\u0011\u0000"+
		"\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00fe\u0001\u0000\u0000\u0000"+
		"\u0106\u0102\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109!\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u0112\u0003H$\u0000\u010c\u0112\u0003F#\u0000\u010d\u010e\u0003(\u0014"+
		"\u0000\u010e\u010f\u0003\u001e\u000f\u0000\u010f\u0110\u0003*\u0015\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0112#\u0001\u0000\u0000\u0000\u0113\u0114\u0005\b\u0000\u0000\u0114"+
		"%\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0000\u0000\u0000\u0116\'"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000f\u0000\u0000\u0118)\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\u0010\u0000\u0000\u011a+\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c-\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u0012\u0000\u0000\u011e/\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005\u0013\u0000\u0000\u01201\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005\u0014\u0000\u0000\u01223\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u0015\u0000\u0000\u01245\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u0016\u0000\u0000\u01267\u0001\u0000\u0000\u0000\u0127\u012c\u00030\u0018"+
		"\u0000\u0128\u012c\u00032\u0019\u0000\u0129\u012c\u00034\u001a\u0000\u012a"+
		"\u012c\u00036\u001b\u0000\u012b\u0127\u0001\u0000\u0000\u0000\u012b\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a"+
		"\u0001\u0000\u0000\u0000\u012c9\u0001\u0000\u0000\u0000\u012d\u012e\u0007"+
		"\u0001\u0000\u0000\u012e;\u0001\u0000\u0000\u0000\u012f\u0132\u0003>\u001f"+
		"\u0000\u0130\u0132\u0003@ \u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0132=\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005\u001a\u0000\u0000\u0134?\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		"\u001b\u0000\u0000\u0136A\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u001c"+
		"\u0000\u0000\u0138C\u0001\u0000\u0000\u0000\u0139\u013a\u0005 \u0000\u0000"+
		"\u013aE\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001d\u0000\u0000\u013c"+
		"G\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0002\u0000\u0000\u013eI\u0001"+
		"\u0000\u0000\u0000\u0017MWgktw\u0085\u0094\u009a\u00a0\u00ad\u00b6\u00c4"+
		"\u00cf\u00d6\u00db\u00f6\u00f8\u0106\u0108\u0111\u012b\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}