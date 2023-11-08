import java.util.*;
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
                    String[] expressao = ctx.expressao().getText().split("[-+*/()]");

                    checarExpressaoAtribuicao(expressao, varDeclarada, tipo, varJaDeclarada);
                } else if (ctx.num() != null) {
                    if(!isConteudoInt(ctx.num().getText())){
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o numero flutuante " + ctx.num().getText());
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else if (ctx.var(1) != null) {
                    String varAtribuida = ctx.var(1).getText();

                    if(!variavelJaDeclarada(varAtribuida)){
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada.");
                    }

                    String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);
                    if(!tipo.equals(tipoVariavel)){
                        throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo int é incompatível com a sua atribuição.");
                }
                break;
            }
            case "flutuante": {
                if (ctx.expressao() != null) {
                    String[] expressao = ctx.expressao().getText().split("[+-/*()]");

                    checarExpressaoAtribuicao(expressao, varDeclarada, tipo, varJaDeclarada);
                }
                else if (ctx.num() != null) {
                    if(!isConteudoFlutuante(ctx.num().getText())){
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com flutuante " + ctx.num().getText());
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else if (ctx.var(1) != null) {
                    String varAtribuida = ctx.var(1).getText();

                    if(!variavelJaDeclarada(varAtribuida)){
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }

                    String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);

                    if(!tipoVariavel.equals(tipo) && !tipoVariavel.equals("int")){
                        throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição");
                }
                break;
            }
            case "booleano": {
                if(ctx.booleano() != null){
                    if(!isConteudoBooleano(ctx.booleano().getText())){
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o tipo booleano");
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else if (ctx.var(1) != null){
                    String varAtribuida = ctx.var(1).getText();

                    if(!variavelJaDeclarada(varAtribuida)){
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }

                    String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);

                    if(!tipoVariavel.equals(tipo)){
                        throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição.");
                }
                break;
            }
            case "texto": {
                if(ctx.string() != null){
                    if(!isConteudoTexto(ctx.string().getText())){
                        throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com o tipo booleano");
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else if (ctx.var(1) != null){
                    String varAtribuida = ctx.var(1).getText();

                    if(!variavelJaDeclarada(varAtribuida)){
                        throw new RuntimeException("ERRO DE DECLARACAO: Variável " + varAtribuida + " não declarada");
                    }

                    String tipoVariavel = this.variaveisDeclaradas.get(varAtribuida);

                    if(!tipoVariavel.equals(tipo)){
                        throw new RuntimeException("ERRO DE DECLARACAO: A variavel " + varAtribuida + " é incompatível com o tipo " + tipo);
                    }

                    if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
                } else {
                    throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição.");
                }
                break;
            }
        }
    }

    public void checarExpressaoAtribuicao(String[] expressao, String varDeclarada, String tipo, Boolean varJaDeclarada){
        String[] variaveisExpressao = Arrays.stream(expressao).filter(item -> {
            return !isNumero(item) && !item.isEmpty() && !isConteudoTexto(item) && !isConteudoBooleano(item);
        }).toArray(String[]::new);

        String[] numerosExpressao = Arrays.stream(expressao).filter(item -> isNumero(item) && !item.isEmpty()).toArray(String[]::new);
        String[] textosExpressao = Arrays.stream(expressao).filter(item -> isConteudoTexto(item) && !item.isEmpty()).toArray(String[]::new);
        String[] booleanosExpressao = Arrays.stream(expressao).filter(item -> isConteudoBooleano(item) && !item.isEmpty()).toArray(String[]::new);

        if(textosExpressao.length > 0 || booleanosExpressao.length > 0){
            throw new RuntimeException("ERRO DE DECLARACAO: O tipo " + tipo + " é incompatível com sua atribuição.");
        }

        for (String variavel : variaveisExpressao){
            if(!variavelJaDeclarada(variavel)){
                throw new RuntimeException("ERRO DE DECLARACAO: Variável " + variavel + " não declarada");
            }

            String tipoVariavel = this.variaveisDeclaradas.get(variavel);
            Boolean condicaoInvalida = tipo.equals("flutuante") ?
                    (!tipoVariavel.equals("int") && !tipoVariavel.equals(tipo)) : !tipo.equals(tipoVariavel);

            if(condicaoInvalida){
                throw new RuntimeException("ERRO DE DECLARACAO: Tipo declarado para " + variavel + ":  " + tipo + "\n Tipo Atribuido: " + tipoVariavel);
            }
        }

        if(tipo.equals("int")){
            for (String numero : numerosExpressao){
                if(isConteudoFlutuante(numero)){
                    throw new RuntimeException("ERRO DE DECLARACAO: O número flutuante " + numero + " não pode ser atribuído ao tipo int");
                }
            }
        }

        if(!varJaDeclarada) declararVariavel(varDeclarada, tipo);
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

    public void checarVariavelEscrita(atribuicaoParser.CmdEscreverContext ctx){
        if(ctx.var() != null){
            String variavelParaEscrever = ctx.var().getText();
            if(!variavelJaDeclarada(variavelParaEscrever)){
                throw new RuntimeException("ERRO DE ESCRITA: A variável " + variavelParaEscrever + " ainda não foi declarada.");
            }
        }

        System.out.print("System.out.println(");
    }

    public void checarExpressoesSe(atribuicaoParser.CmdSeContext ctx){
        if(ctx.expressao(0) == null || ctx.expressao(1) == null){
            throw new RuntimeException("ERRO: Expressão inválida.");
        } else {
            String[] conteudoPrimeiraExpressao = ctx.expressao(0).getText().split("[-+*/()\\s]");
            String[] conteudoSegundaExpressao = ctx.expressao(1).getText().split("[-+*/()\\s]");
            String comparador = ctx.operadorComparacao().getText();

            checarExpressoes(conteudoPrimeiraExpressao, conteudoSegundaExpressao, comparador);
        }
    }

    public void checarExpressoesSenaoSe(atribuicaoParser.CmdSenaoSeContext ctx){
        if(ctx.expressao(0) == null || ctx.expressao(1) == null){
            throw new RuntimeException("ERRO: Expressão inválida.");
        } else {
            String[] conteudoPrimeiraExpressao = ctx.expressao(0).getText().split("[-+*/()\\s]");
            String[] conteudoSegundaExpressao = ctx.expressao(1).getText().split("[-+*/()\\s]");
            String comparador = ctx.operadorComparacao().getText();

            checarExpressoes(conteudoPrimeiraExpressao, conteudoSegundaExpressao, comparador);
        }
    }

    public void checarExpressoes(String[] conteudoPrimeiraExpressao, String[] conteudoSegundaExpressao, String comparador){
        String tipoPrimeiraExpressao = checarTipoExpressao(conteudoPrimeiraExpressao).get(0);
        String tipoSegundaExpressao = checarTipoExpressao(conteudoSegundaExpressao).get(0);

        switch(tipoPrimeiraExpressao){
            case "int": {
                if(!tipoSegundaExpressao.equals("int") && !tipoSegundaExpressao.equals("flutuante")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a int, " + tipoSegundaExpressao);
                }
                break;
            }
            case "flutuante": {
                if(!tipoSegundaExpressao.equals("int") && !tipoSegundaExpressao.equals("flutuante")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a flutuante, " + tipoSegundaExpressao);
                }
                break;
            }
            case "booleano": {
                if(!tipoSegundaExpressao.equals("booleano")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a booleano, " + tipoSegundaExpressao);
                } else if(!comparador.equals("==") || !comparador.equals("!=")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a booleano, booleano");
                }
                break;
            }
            case "texto": {
                if(!tipoSegundaExpressao.equals("texto")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a texto, " + tipoSegundaExpressao);
                } else if(!comparador.equals("==") || !comparador.equals("!=")){
                    throw new RuntimeException("ERRO: Operador " + comparador + " não pode ser aplicado a texto, texto");
                }
                break;
            }
        }
    }

    public ArrayList<String> checarTipoExpressao(String[] expressao){
        String[] variaveisExpressao = Arrays.stream(expressao).filter(item -> {
            return !isNumero(item) && !item.isEmpty() && !isConteudoTexto(item) && !isConteudoBooleano(item);
        }).toArray(String[]::new);

        String[] numerosExpressao = Arrays.stream(expressao).filter(item -> isNumero(item) && !item.isEmpty()).toArray(String[]::new);
        String[] textosExpressao = Arrays.stream(expressao).filter(item -> isConteudoTexto(item) && !item.isEmpty()).toArray(String[]::new);
        String[] booleanosExpressao = Arrays.stream(expressao).filter(item -> isConteudoBooleano(item) && !item.isEmpty()).toArray(String[]::new);

        ArrayList<String> tiposExpressao = new ArrayList<>();

        for(String variavel : variaveisExpressao){
            if(!variavelJaDeclarada(variavel)){
                throw new RuntimeException("ERRO: A variável " + variavel + " ainda não foi declarada.");
            } else {
                String tipoVariavel = this.variaveisDeclaradas.get(variavel);
                tiposExpressao.add(tipoVariavel);
            }
        }

        for(String numero : numerosExpressao){
            if(isConteudoInt(numero)){
                tiposExpressao.add("int");
            } else if(isConteudoFlutuante(numero)){
                tiposExpressao.add("flutuante");
            }
        }

        if(textosExpressao.length > 0){
            tiposExpressao.add("texto");
        }

        if(booleanosExpressao.length > 0){
            tiposExpressao.add("booleano");
        }

        Set<String> setTiposExpressao = new HashSet<>(tiposExpressao);

        tiposExpressao.clear();
        tiposExpressao.addAll(setTiposExpressao);

        if(tiposExpressao.size() > 1 && (tiposExpressao.contains("texto") || tiposExpressao.contains("booleano"))){
            throw new RuntimeException("ERRO: A mesma expressão possuí tipos diferentes.");
        }

        return tiposExpressao;
    }

    public void checarInicializaFor(atribuicaoParser.InicializaForContext ctx){
        // InicializaFor
        checarTipoConteudo(ctx.cmdAtribuicao());
    }

    public void checarTesteFor(atribuicaoParser.TesteForContext ctx){
        // TesteFor
        String[] conteudoPrimeiraExpressao = ctx.expressao(0).getText().split("[-+*/()\\s]");
        String[] conteudoSegundaExpressao = ctx.expressao(1).getText().split("[-+*/()\\s]");
        String comparadorTeste = ctx.operadorComparacao().getText();

        checarExpressoes(conteudoPrimeiraExpressao, conteudoSegundaExpressao, comparadorTeste);
    }

    public void checarAtualizaFor(atribuicaoParser.AtualizaForContext ctx){
        if(ctx.var() == null){
            throw new RuntimeException("ERRO: É esperado variável de atualização do ciclo");
        }

        String variavelAtualiza = ctx.var().getText();

        if(!variavelJaDeclarada(variavelAtualiza)){
            throw new RuntimeException("ERRO: Variável não declarada para atualização do ciclo");
        }

        String[] expressaoAtualiza = ctx.expressao().getText().split("[-+*/()\\s]");
        ArrayList<String> tipoExpressaoAtualiza = checarTipoExpressao(expressaoAtualiza);

        String tipoVariavel = this.variaveisDeclaradas.get(ctx.var().getText());

        if(tipoExpressaoAtualiza.size() > 1){
            tipoExpressaoAtualiza.remove(tipoVariavel);
            throw new RuntimeException("ERRO: Tipo declarado para " + variavelAtualiza + ":  " + tipoVariavel +
                    " - Tipo Atribuido: " + tipoExpressaoAtualiza.get(0));
        }

        if(!tipoVariavel.equals(tipoExpressaoAtualiza.get(0)) ){
            throw new RuntimeException("ERRO: Tipo declarado para " + variavelAtualiza + ":  " + tipoVariavel + " - Tipo Atribuido: " + tipoExpressaoAtualiza);
        }
    }

    public void checarEnquanto(atribuicaoParser.CmdEnquantoContext ctx){
        if(ctx.booleano() != null){
            if(!isConteudoBooleano(ctx.booleano().getText())){
                throw new RuntimeException("ERRO: " + ctx.booleano().getText() + " é incompatível com o tipo booleano");
            }
        } else {
            String[] conteudoPrimeiraExpressao = ctx.expressao(0).getText().split("[-+*/()\\s]");
            String[] conteudoSegundaExpressao = ctx.expressao(1).getText().split("[-+*/()\\s]");
            String comparadorTeste = ctx.operadorComparacao().getText();

            checarExpressoes(conteudoPrimeiraExpressao, conteudoSegundaExpressao, comparadorTeste);
        }
    }
}
