import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Collections;
import java.util.List;

public class Compilador {
    private static class CapturadorErros extends BaseErrorListener{
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,Object offendingSymbol,int line, int charPositionInLine,String msg,
                                RecognitionException e)
        {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            throw new RuntimeException("ERRO: linha " + line + ":" + charPositionInLine + ": " + msg + ". Inicialização errada da gramática, revise.");
        }
    }
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        atribuicaoLexer lexer = new atribuicaoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        atribuicaoParser parser = new atribuicaoParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new CapturadorErros());

        ParseTree tree = parser.init();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Tradutor(), tree);
        System.out.println("");
    }
}