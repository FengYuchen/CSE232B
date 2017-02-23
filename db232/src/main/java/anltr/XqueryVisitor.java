// Generated from C:/Users/tom/Desktop/New folder/CSE232B/db232/src/main/resources\Xquery.g4 by ANTLR 4.6
package anltr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XqueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XqueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAll(XqueryParser.XQAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQPar(XqueryParser.XQParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQDot}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQDot(XqueryParser.XQDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQChild(XqueryParser.XQChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQStringConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQStringConst(XqueryParser.XQStringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XqueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondOr}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondOr(XqueryParser.XQCondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQCondPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQCondPar(XqueryParser.XQCondParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XqueryParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAttribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAttribute(XqueryParser.RPAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPDot}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPDot(XqueryParser.RPDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCond}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCond(XqueryParser.RPCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCurrent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCurrent(XqueryParser.RPCurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPParent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPParent(XqueryParser.RPParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XqueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPPar(XqueryParser.RPParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPTagName(XqueryParser.RPTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPChild}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPChild(XqueryParser.RPChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAllChildren(XqueryParser.RPAllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fand}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFand(XqueryParser.FandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fis}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFis(XqueryParser.FisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code F}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(XqueryParser.FContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(XqueryParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fequal}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFequal(XqueryParser.FequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FPar}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFPar(XqueryParser.FParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fnot}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnot(XqueryParser.FnotContext ctx);
}