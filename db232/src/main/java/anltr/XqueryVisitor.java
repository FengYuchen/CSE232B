// Generated from C:/Users/tom/IdeaProjects/db232/src/main/resources\Xquery.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XqueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XqueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRP(XqueryParser.FRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPand(XqueryParser.FRPandContext ctx);
}