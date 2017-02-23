// Generated from C:/Users/tom/Desktop/New folder/CSE232B/db232/src/main/resources\Xquery.g4 by ANTLR 4.6
package anltr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqueryParser}.
 */
public interface XqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQVariable}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQVariable(XqueryParser.XQVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAp}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAp(XqueryParser.XQApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(XqueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAll(XqueryParser.XQAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAll}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAll(XqueryParser.XQAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQPar(XqueryParser.XQParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQPar}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQPar(XqueryParser.XQParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQLet(XqueryParser.XQLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQDot}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQDot(XqueryParser.XQDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQDot}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQDot(XqueryParser.XQDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQChild(XqueryParser.XQChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQChild}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQChild(XqueryParser.XQChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQStringConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQStringConst(XqueryParser.XQStringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQStringConst}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQStringConst(XqueryParser.XQStringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQTag}
	 * labeled alternative in {@link XqueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQTag(XqueryParser.XQTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XqueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XqueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XqueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XqueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XqueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XqueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEqual}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEqual(XqueryParser.XQCondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondIs}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondIs(XqueryParser.XQCondIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondAnd}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondAnd(XqueryParser.XQCondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondEmpty}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondEmpty(XqueryParser.XQCondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondNot}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondNot(XqueryParser.XQCondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondSome}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondSome(XqueryParser.XQCondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondOr}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondOr(XqueryParser.XQCondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondOr}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondOr(XqueryParser.XQCondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQCondPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXQCondPar(XqueryParser.XQCondParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQCondPar}
	 * labeled alternative in {@link XqueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXQCondPar(XqueryParser.XQCondParContext ctx);
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