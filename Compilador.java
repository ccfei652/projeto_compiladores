import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Compilador {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        atribuicaoLexer lexer = new atribuicaoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        atribuicaoParser parser = new atribuicaoParser(tokens);
        ParseTree tree = parser.init();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Tradutor(), tree);
        System.out.println("");
    }
}