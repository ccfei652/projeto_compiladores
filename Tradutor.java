import java.util.Dictionary;
import java.util.Hashtable;

public class Tradutor extends atribuicaoBaseListener {
    Dictionary<String, String> variaveisDeclaradas = new Hashtable<>();

    public void enterInit(atribuicaoParser.InitContext ctx){
        System.out.println("public class Code{");
        System.out.println(" public static void main(String[] args){");
    }

    public void exitInit(atribuicaoParser.InitContext ctx){
        System.out.print(" }\n");
        System.out.print("}\n");
    }

    public Boolean variavelJaDeclarada(String nome){
        return this.variaveisDeclaradas.get(nome) != null;
    }

    public void declararVariavel(String nome, String tipo){
        if(!variavelJaDeclarada(nome)){
            this.variaveisDeclaradas.put(nome, tipo);
        }
    }

    public void enterCmdDeclara(atribuicaoParser.CmdDeclaraContext ctx){
        if(ctx.var(0) == null) return;

        if(variavelJaDeclarada(ctx.var(0).getText())){
            throw new RuntimeException("ERRO DE DECLARACAO: Variável já declarada (" + ctx.var(0).getText() + ").");
        } else {
            declararVariavel(ctx.var(0).getText(), ctx.tipo().getText());
        }
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

    public void enterLeftChave(atribuicaoParser.LeftChavesContext ctx) {
        System.out.print("{\n");
    }

    public void enterRightChave(atribuicaoParser.RightChavesContext ctx) {
        System.out.print("}");
    }

    public void exitFim(atribuicaoParser.FimContext ctx){
        System.out.print("; \n");
    }
}