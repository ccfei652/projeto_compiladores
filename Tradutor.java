import java.util.Arrays;

public class Tradutor extends atribuicaoBaseListener {
    Controller controller = new Controller();

    public void enterInit(atribuicaoParser.InitContext ctx){
        System.out.println("import java.util.Scanner;");
        System.out.println("public class Code{");
        System.out.println(" public static void main(String[] args){");
        System.out.println("      Scanner scanner = new Scanner(System.in);");
    }

    public void exitInit(atribuicaoParser.InitContext ctx){
        System.out.print(" }\n");
        System.out.print("}\n");
    }

    public void exitCmdLer(atribuicaoParser.CmdLerContext ctx){
        controller.checarVariavelLeitura(ctx);
    }

    public void enterCmdEscrever(atribuicaoParser.CmdEscreverContext ctx){
        controller.checarVariavelEscrita(ctx);
    }

    public void exitCmdEscrever(atribuicaoParser.CmdEscreverContext ctx){
        System.out.println(");");
    }

    public void enterCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx){
        if(ctx.var() == null) {
            throw new RuntimeException("ERRO DE DECLARACAO: Nome da variável é obrigatório.");
        };

        if(controller.variavelJaDeclarada(ctx.var().getText())){
            throw new RuntimeException("ERRO DE DECLARACAO: Variável já declarada (" + ctx.var().getText() + ").");
        } else {
            controller.declararVariavel(ctx.var().getText(), ctx.tipo().getText());
        }
    }

    public void enterCmdAtribuicao(atribuicaoParser.CmdAtribuicaoContext ctx){
        if(ctx.tipo() != null){
            if(controller.variavelJaDeclarada(ctx.var(0).getText())){
                throw new RuntimeException("ERRO DE DECLARACAO: Variável já declarada (" + ctx.var(0).getText() + ").");
            }
            controller.checarTipoConteudo(ctx);
        } else {
            if(controller.variavelJaDeclarada(ctx.var(0).getText())){
                controller.checarTipoConteudo(ctx);
            } else {
                throw new RuntimeException("ERRO DE DECLARACAO: Variável ainda não declarada (" + ctx.var(0).getText() + ").");
            }
        }
    }

    public void enterCmdSe(atribuicaoParser.CmdSeContext ctx){
        controller.checarExpressoesSe(ctx);
        System.out.print("if");
    }

    public void enterCmdSenaoSe(atribuicaoParser.CmdSenaoSeContext ctx){
        controller.checarExpressoesSenaoSe(ctx);
        System.out.print("else if");
    }

    public void enterCmdSenao(atribuicaoParser.CmdSenaoContext ctx){
        System.out.print("else");
    }

    public void enterCmdFor(atribuicaoParser.CmdForContext ctx){
        System.out.print("for");
    }

    public void exitCmdFor(atribuicaoParser.CmdForContext ctx){
        controller.checarCicloFor(ctx);
    }

    public void enterTipo(atribuicaoParser.TipoContext ctx){
        String tipo = ctx.getText();
        switch(tipo){
            case "int":
                System.out.print("int ");
                break;
            case "flutuante":
                System.out.print("float ");
                break;
            case "booleano":
                System.out.print("boolean ");
                break;
            case "texto":
                System.out.print("String ");
                break;
        }
    }

    public void exitMais(atribuicaoParser.MaisContext ctx){
        System.out.print(" + ");
    }

    public void exitMenos(atribuicaoParser.MenosContext ctx) {
        System.out.print(" - ");
    }

    public void exitDiv(atribuicaoParser.DivContext ctx) {
        System.out.print(" / ");
    }

    public void exitMult(atribuicaoParser.MultContext ctx) {
        System.out.print(" * ");
    }

    public void enterBooleano(atribuicaoParser.BooleanoContext ctx) {
        String tipo = ctx.getText();
        switch(tipo){
            case "true":{
                System.out.print("true");
                break;
            }
            case "false":{
                System.out.print("false");
                break;
            }
        }
    }

    public void enterOperadorAtribuicao(atribuicaoParser.OperadorAtribuicaoContext ctx) {
        System.out.print(" = ");
    }

    public void enterOperadorComparacao(atribuicaoParser.OperadorComparacaoContext ctx) {
        String operador = ctx.getText();
        switch(operador){
            case ">":
                System.out.print(" > ");
                break;
            case ">=":
                System.out.print(" >= ");
                break;
            case "<":
                System.out.print(" < ");
                break;
            case "<=":
                System.out.print(" <= ");
                break;
            case "!=":
                System.out.print(" != ");
                break;
            case "==":
                System.out.print(" == ");
                break;
        }
    }

    public void enterNum(atribuicaoParser.NumContext ctx) {
        if (ctx.NumFloat() != null){
            System.out.print(ctx.NumFloat().getText());
        }
        if (ctx.NumInt()!= null){
            System.out.print(ctx.NumInt().getText());
        }
    }

    public void enterVar(atribuicaoParser.VarContext ctx) {
        System.out.print(ctx.ID().getText());
    }

    public void enterString(atribuicaoParser.StringContext ctx) {
        System.out.print(ctx.String().getText());
    }

    public void enterLeftPar(atribuicaoParser.LeftParContext ctx) {
        System.out.print("(");
    }

    public void enterRightPar(atribuicaoParser.RightParContext ctx) {
        System.out.print(")");
    }

    public void enterLeftChaves(atribuicaoParser.LeftChavesContext ctx) {
        System.out.print("{\n");
    }

    public void enterRightChaves(atribuicaoParser.RightChavesContext ctx) {
        System.out.print("}\n");
    }

    public void exitFim(atribuicaoParser.FimContext ctx){
        System.out.print("; \n");
    }
}