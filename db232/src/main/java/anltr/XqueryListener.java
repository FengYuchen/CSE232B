// Generated from C:/Users/tom/IdeaProjects/db232/src/main/resources\Xquery.g4 by ANTLR 4.6
package anltr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APChildren}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPChildren(XqueryParser.APChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APAll}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPAll(XqueryParser.APAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XqueryParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XqueryParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(XqueryParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPChildren(XqueryParser.RPChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPwithPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPwithPar(XqueryParser.RPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XqueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XqueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XqueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XqueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XqueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XqueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAll}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAll(XqueryParser.RPAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XqueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRP}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRP(XqueryParser.TwoRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCondition}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCondition(XqueryParser.RPConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPwithPar}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPwithPar(XqueryParser.FRPwithParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPnot}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPnot(XqueryParser.FRPnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRP(XqueryParser.FRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRP(XqueryParser.FRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPor}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPor(XqueryParser.FRPorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPequal}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPequal(XqueryParser.FRPequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPis}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPis(XqueryParser.FRPisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void enterFRPand(XqueryParser.FRPandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPand}
	 * labeled alternative in {@link XqueryParser#fltr}.
	 * @param ctx the parse tree
	 */
	void exitFRPand(XqueryParser.FRPandContext ctx);
}