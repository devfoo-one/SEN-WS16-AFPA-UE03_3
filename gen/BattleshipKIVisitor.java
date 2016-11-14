// Generated from /Users/tom/Documents/Dev/Studium/se-master/SEN-WS16-AFPA-UE03_3/BattleshipKI.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BattleshipKIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BattleshipKIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(BattleshipKIParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(BattleshipKIParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#einleitungsSatz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEinleitungsSatz(BattleshipKIParser.EinleitungsSatzContext ctx);
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#zufallsSatz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZufallsSatz(BattleshipKIParser.ZufallsSatzContext ctx);
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(BattleshipKIParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link BattleshipKIParser#koordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoordinate(BattleshipKIParser.KoordinateContext ctx);
}