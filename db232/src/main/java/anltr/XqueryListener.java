// Generated from C:/Users/tom/Desktop/New folder/CSE232B/db232/src/main/resources\Xquery.g4 by ANTLR 4.6
package anltr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code APTag}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPTag(XqueryParser.APTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APTag}
	 * labeled alternative in {@link XqueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPTag(XqueryParser.APTagContext ctx);
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
	 * Enter a parse tree produced by the {@code RPAttribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAttribute(XqueryParser.RPAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAttribute}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAttribute(XqueryParser.RPAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPDot}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPDot(XqueryParser.RPDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPDot}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPDot(XqueryParser.RPDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCond}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCond(XqueryParser.RPCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCond}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCond(XqueryParser.RPCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCurrent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCurrent(XqueryParser.RPCurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCurrent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCurrent(XqueryParser.RPCurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPParent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPParent(XqueryParser.RPParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPParent}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPParent(XqueryParser.RPParentContext ctx);
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
	 * Enter a parse tree produced by the {@code RPPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPPar(XqueryParser.RPParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPPar}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPPar(XqueryParser.RPParContext ctx);
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
	 * Enter a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPTagName(XqueryParser.RPTagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPTagName(XqueryParser.RPTagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPChild}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPChild(XqueryParser.RPChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPChild}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPChild(XqueryParser.RPChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAllChildren(XqueryParser.RPAllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAllChildren}
	 * labeled alternative in {@link XqueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAllChildren(XqueryParser.RPAllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fand}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFand(XqueryParser.FandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fand}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFand(XqueryParser.FandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fis}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFis(XqueryParser.FisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fis}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFis(XqueryParser.FisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code F}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterF(XqueryParser.FContext ctx);
	/**
	 * Exit a parse tree produced by the {@code F}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitF(XqueryParser.FContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFor(XqueryParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFor(XqueryParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fequal}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFequal(XqueryParser.FequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fequal}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFequal(XqueryParser.FequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FPar}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFPar(XqueryParser.FParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FPar}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFPar(XqueryParser.FParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fnot}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFnot(XqueryParser.FnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fnot}
	 * labeled alternative in {@link XqueryParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFnot(XqueryParser.FnotContext ctx);
}