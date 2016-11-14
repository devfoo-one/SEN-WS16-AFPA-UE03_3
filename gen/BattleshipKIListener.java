// Generated from /Users/tom/Documents/Dev/Studium/se-master/SEN-WS16-AFPA-UE03_3/BattleshipKI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BattleshipKIParser}.
 */
public interface BattleshipKIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BattleshipKIParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BattleshipKIParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(BattleshipKIParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(BattleshipKIParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#einleitungsSatz}.
	 * @param ctx the parse tree
	 */
	void enterEinleitungsSatz(BattleshipKIParser.EinleitungsSatzContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#einleitungsSatz}.
	 * @param ctx the parse tree
	 */
	void exitEinleitungsSatz(BattleshipKIParser.EinleitungsSatzContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#zufallsSatz}.
	 * @param ctx the parse tree
	 */
	void enterZufallsSatz(BattleshipKIParser.ZufallsSatzContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#zufallsSatz}.
	 * @param ctx the parse tree
	 */
	void exitZufallsSatz(BattleshipKIParser.ZufallsSatzContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(BattleshipKIParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(BattleshipKIParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link BattleshipKIParser#koordinate}.
	 * @param ctx the parse tree
	 */
	void enterKoordinate(BattleshipKIParser.KoordinateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BattleshipKIParser#koordinate}.
	 * @param ctx the parse tree
	 */
	void exitKoordinate(BattleshipKIParser.KoordinateContext ctx);
}