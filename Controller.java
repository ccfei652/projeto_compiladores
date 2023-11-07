import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    Dictionary<String, String> variaveisDeclaradas = new Hashtable<>();

    public Controller(){
    }

    public Boolean isNumero(String numero){
        char[] caracteres = numero.replace(".", "").toCharArray();
        for(char caracter : caracteres){
            if(!Character.isDigit(caracter)){
                return false;
            }
        }
        return true;
    }

    public Boolean variavelJaDeclarada(String nome){
        return this.variaveisDeclaradas.get(nome) != null;
    }

    public void declararVariavel(String nome, String tipo){
        if(!variavelJaDeclarada(nome)){
            this.variaveisDeclaradas.put(nome, tipo);
        }
    }

    public void checarTipoConteudo(atribuicaoParser.CmdAtribuicaoContext ctx){
        String varDeclarada = ctx.var(0).getText();
        Boolean varJaDeclarada = variavelJaDeclarada(varDeclarada);

        String tipo = varJaDeclarada ? this.variaveisDeclaradas.get(varDeclarada) : ctx.tipo().getText();

        switch(tipo){
            case "int": {
                if (ctx.expressao() != null) {
                    String[] expressao = ctx.expressao().getText().split("[-+*/()\\s]");
                    String[] variaveisExpressao = Arrays.stream(expressao).filter(item -> !isNumero(item) && !item.isEmpty()).toArray(String[]::new);
                    String[] numerosExpressao = Arrays.stream(expressao).filter(item -> isNumero(item) && !item.isEmpty()).toArray(String[]::new);

                    for (String variavel : variaveisExpressao){
                        if(variavelJaDeclarada(variavel)){
                            String tipoVariavel = this.variaveisDeclaradas.get(variavel);
                            if(!tipo.equals(tipoVariavel)){
                                throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + variavel + " é incompatível com o tipo " + tipo);
                            }
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: Variável " + variavel + " não declarada");
                        }
                    }

                    for (String numero : numerosExpressao){
                        if(isConteudoFlutuante(numero)){
                            throw new RuntimeException("ERRO DE DECLARACAO: O número flutuante " + numero + " não pode ser atribuído ao tipo int");
                        }
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else if (ctx.num() != null) {
                    if(isConteudoInt(ctx.num().getText())){
                        if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o numero flutuante " + ctx.num().getText());
                    }
                } else if (ctx.var(1) != null) {
                    String varAtribuida = ctx.var(1).getText();
                    if(variavelJaDeclarada(varAtribuida)){
                        String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);
                        if(tipo.equals(tipoVariavel)){
                            if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                        }
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: ");
                }
                break;
            }
            case "flutuante": {
                if (ctx.expressao() != null) {
                    String[] expressao = ctx.expressao().getText().split("[+-/*()]");
                    String[] variaveisExpressao = Arrays.stream(expressao).filter(item -> !isNumero(item) && !item.isEmpty()).toArray(String[]::new);

                    for (String variavel : variaveisExpressao){
                        if(variavelJaDeclarada(variavel)){
                            String tipoVariavel = this.variaveisDeclaradas.get(variavel);
                            if(!tipoVariavel.equals("int") && !tipoVariavel.equals(tipo)){
                                throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + variavel + " é incompatível com o tipo " + tipo);
                            }
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: Variável " + variavel + " não declarada");
                        }
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                }
                else if (ctx.num() != null) {
                    if(isConteudoFlutuante(ctx.num().getText())){
                        if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com flutuante " + ctx.num().getText());
                    }
                } else if (ctx.var(1) != null) {
                    String varAtribuida = ctx.var(1).getText();

                    if(variavelJaDeclarada(varAtribuida)){
                        String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);
                        if(tipoVariavel.equals(tipo) || tipoVariavel.equals("int")){
                            if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                        }
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição");
                }
                break;
            }
            case "booleano": {
                if(ctx.booleano() != null){
                    if(isConteudoBooleano(ctx.booleano().getText())){
                        if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o tipo booleano");
                    }
                } else if (ctx.var(1) != null){
                    String varAtribuida = ctx.var(1).getText();

                    if(variavelJaDeclarada(varAtribuida)){
                        String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);

                        if(tipoVariavel.equals(tipo)){
                            if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                        }
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição para a variável " + varDeclarada);
                }
                break;
            }
            case "texto": {
                if(ctx.string() != null){
                    if(isConteudoTexto(ctx.string().getText())){
                        if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o tipo booleano");
                    }
                } else if (ctx.var(1) != null){
                    String varAtribuida = ctx.var(1).getText();

                    if(variavelJaDeclarada(varAtribuida)){
                        String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);

                        if(tipoVariavel.equals(tipo)){
                            if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                        } else {
                            throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                        }
                    } else {
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição para a variável " + varDeclarada);
                }
                break;
            }
        }
    }

    public boolean isConteudoInt(String numero){
        return (!numero.contains(".") && isNumero(numero));
    }

    public boolean isConteudoFlutuante(String numero){
        Boolean pontoUnico = numero.split("\\.").length == 2;
        return (isNumero(numero) && pontoUnico);
    }

    public boolean isConteudoBooleano(String conteudo){
        Pattern pattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(conteudo);
        return matcher.matches();
    }

    public boolean isConteudoTexto(String conteudo){
        boolean somenteDuasAspas = conteudo.chars().filter(caracter -> caracter == '"').count() == 2;
        return conteudo.startsWith("\"") && conteudo.endsWith("\"") && somenteDuasAspas;
    }

    public void checarVariavelLeitura(atribuicaoParser.CmdLerContext ctx){
        if(ctx.var() == null){
            throw new RuntimeException("ERRO DE LEITURA: A variável não foi inserida");
        }

        String variavelParaLer = ctx.var().getText();

        if(variavelJaDeclarada(variavelParaLer)){
            String tipoVariavelParaLer = this.variaveisDeclaradas.get(variavelParaLer);
            switch (tipoVariavelParaLer) {
                case "int":
                    System.out.println(" = scanner.nextInt();");
                    break;
                case "flutuante":
                    System.out.println( " = scanner.nextDouble();");
                    break;
                case "texto":
                    System.out.println(" = scanner.nextLine();");
                    break;
                case "booleano":
                    System.out.println(" = scanner.nextBoolean();");
                    break;
                default:
                    break;
            }
        } else {
            throw new RuntimeException("ERRO DE LEITURA: A variável " + variavelParaLer + " ainda não foi declarada.");
        }
    }

}
