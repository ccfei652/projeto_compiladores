// Generated from atribuicao.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link atribuicaoParser}.
 */
public interface atribuicaoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(atribuicaoParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(atribuicaoParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(atribuicaoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(atribuicaoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdExpressao}.
	 * @param ctx the parse tree
	 */
	void enterCmdExpressao(atribuicaoParser.CmdExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdExpressao}.
	 * @param ctx the parse tree
	 */
	void exitCmdExpressao(atribuicaoParser.CmdExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdDeclara}.
	 * @param ctx the parse tree
	 */
	void enterCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdDeclara}.
	 * @param ctx the parse tree
	 */
	void exitCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdLer}.
	 * @param ctx the parse tree
	 */
	void enterCmdLer(atribuicaoParser.CmdLerContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdLer}.
	 * @param ctx the parse tree
	 */
	void exitCmdLer(atribuicaoParser.CmdLerContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdEscrever}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrever(atribuicaoParser.CmdEscreverContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdEscrever}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrever(atribuicaoParser.CmdEscreverContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(atribuicaoParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(atribuicaoParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdSenaoSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSenaoSe(atribuicaoParser.CmdSenaoSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdSenaoSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSenaoSe(atribuicaoParser.CmdSenaoSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdSenao}.
	 * @param ctx the parse tree
	 */
	void enterCmdSenao(atribuicaoParser.CmdSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdSenao}.
	 * @param ctx the parse tree
	 */
	void exitCmdSenao(atribuicaoParser.CmdSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(atribuicaoParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(atribuicaoParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(atribuicaoParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#inicializaFor}.
	 * @param ctx the parse tree
	 */
	void enterInicializaFor(atribuicaoParser.InicializaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#inicializaFor}.
	 * @param ctx the parse tree
	 */
	void exitInicializaFor(atribuicaoParser.InicializaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#testeFor}.
	 * @param ctx the parse tree
	 */
	void enterTesteFor(atribuicaoParser.TesteForContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#testeFor}.
	 * @param ctx the parse tree
	 */
	void exitTesteFor(atribuicaoParser.TesteForContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#atualizaFor}.
	 * @param ctx the parse tree
	 */
	void enterAtualizaFor(atribuicaoParser.AtualizaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#atualizaFor}.
	 * @param ctx the parse tree
	 */
	void exitAtualizaFor(atribuicaoParser.AtualizaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(atribuicaoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(atribuicaoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(atribuicaoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(atribuicaoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(atribuicaoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(atribuicaoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#operadorAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAtribuicao(atribuicaoParser.OperadorAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#operadorAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAtribuicao(atribuicaoParser.OperadorAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#operadorComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComparacao(atribuicaoParser.OperadorComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#operadorComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComparacao(atribuicaoParser.OperadorComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#leftPar}.
	 * @param ctx the parse tree
	 */
	void enterLeftPar(atribuicaoParser.LeftParContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#leftPar}.
	 * @param ctx the parse tree
	 */
	void exitLeftPar(atribuicaoParser.LeftParContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#rightPar}.
	 * @param ctx the parse tree
	 */
	void enterRightPar(atribuicaoParser.RightParContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#rightPar}.
	 * @param ctx the parse tree
	 */
	void exitRightPar(atribuicaoParser.RightParContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#leftChaves}.
	 * @param ctx the parse tree
	 */
	void enterLeftChaves(atribuicaoParser.LeftChavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#leftChaves}.
	 * @param ctx the parse tree
	 */
	void exitLeftChaves(atribuicaoParser.LeftChavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#rightChaves}.
	 * @param ctx the parse tree
	 */
	void enterRightChaves(atribuicaoParser.RightChavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#rightChaves}.
	 * @param ctx the parse tree
	 */
	void exitRightChaves(atribuicaoParser.RightChavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#mais}.
	 * @param ctx the parse tree
	 */
	void enterMais(atribuicaoParser.MaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#mais}.
	 * @param ctx the parse tree
	 */
	void exitMais(atribuicaoParser.MaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(atribuicaoParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(atribuicaoParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(atribuicaoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(atribuicaoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(atribuicaoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(atribuicaoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#operadorMatematico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMatematico(atribuicaoParser.OperadorMatematicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#operadorMatematico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMatematico(atribuicaoParser.OperadorMatematicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(atribuicaoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(atribuicaoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(atribuicaoParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(atribuicaoParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#booleanoTrue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanoTrue(atribuicaoParser.BooleanoTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#booleanoTrue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanoTrue(atribuicaoParser.BooleanoTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#booleanoFalse}.
	 * @param ctx the parse tree
	 */
	void enterBooleanoFalse(atribuicaoParser.BooleanoFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#booleanoFalse}.
	 * @param ctx the parse tree
	 */
	void exitBooleanoFalse(atribuicaoParser.BooleanoFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#fim}.
	 * @param ctx the parse tree
	 */
	void enterFim(atribuicaoParser.FimContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#fim}.
	 * @param ctx the parse tree
	 */
	void exitFim(atribuicaoParser.FimContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(atribuicaoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(atribuicaoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(atribuicaoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(atribuicaoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link atribuicaoParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(atribuicaoParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link atribuicaoParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(atribuicaoParser.NumContext ctx);
}