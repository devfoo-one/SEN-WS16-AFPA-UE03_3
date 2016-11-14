import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BattleshipKI extends BattleshipKIBaseListener {

//    private static final String INFILE_PATH = "NotValidCommands.txt";
    private static final String INFILE_PATH = "ValidCommands.txt";

    public static void main(String[] args) throws IOException {
        parseFile();


    }

    private static void parseFile() throws IOException {

        // Get BattleshipKI lexer
        BattleshipKILexer lexer = new BattleshipKILexer(new ANTLRInputStream(new FileReader
                (INFILE_PATH)));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        BattleshipKIParser parser = new BattleshipKIParser(tokens);

        // Specify our entry point
        BattleshipKIParser.FileContext fileContext = parser.file();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        BattleshipKIBaseListener listener = new BattleshipKI();
        walker.walk(listener, fileContext);

    }

    @Override
    public void enterZufallsSatz(BattleshipKIParser.ZufallsSatzContext ctx) {
        System.out.println("Zufallsfeuer!");
        //TODO IMPLEMENT ME
    }

    @Override
    public void enterKoordinate(BattleshipKIParser.KoordinateContext ctx) {
        System.out.println(ctx.Buchstabe().toString() + ctx.Ziffer().toString());
        //TODO IMPLEMENT ME
    }
}
