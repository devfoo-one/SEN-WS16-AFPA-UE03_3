import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BattleshipKI extends BattleshipKIBaseListener {

    //    private static final String INFILE_PATH = "NotValidCommands.txt";
    //    private static final String INFILE_PATH = "ValidCommands.txt";
    private static final String INFILE_PATH = "ValidRandomCommands.txt";

    private static final Set<String> notVisitedFields = new HashSet<>();

    public static void main(String[] args) throws IOException {
        parseFile();
    }

    private BattleshipKI() {
        // initialise possible cells
        String[] validChars = {"A", "B", "C", "D", "E", "F", "G"};
        for (String c : validChars) {
            for (int i = 1; i <= 7; i++) {
                notVisitedFields.add(c + i);
            }
        }
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
    public void exitZufallsSatz(BattleshipKIParser.ZufallsSatzContext ctx) {
        if (!notVisitedFields.isEmpty()) {
            int randomIndex = new Random().nextInt(notVisitedFields.size());
            String cell = notVisitedFields.toArray(new String[notVisitedFields.size()])
                    [randomIndex];
            fireAtField(cell);
        } else {
            System.err.println("Nothing left to fire at!");
        }
    }

    @Override
    public void exitKoordinate(BattleshipKIParser.KoordinateContext ctx) {
        if (ctx.getText().length() == 2) {
            String cell = ctx.Buchstabe().toString() + ctx.Ziffer().toString();
            this.fireAtField(cell);
        }
    }

    private void fireAtField(String cell) {
        String output = String.format("Der Computer feuert bei dir auf die Koordinaten %s. War "
                + "das ein Treffer? (j/n)", cell);
        System.out.println(output);
        notVisitedFields.remove(cell);
    }
}

