// Generated from compiler/parser/Bitsy.g4 by ANTLR 4.3
package compiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BitsyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BitsyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code PreIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncVar(@NotNull BitsyParser.PreIncVarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEq(@NotNull BitsyParser.GreaterEqContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull BitsyParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(@NotNull BitsyParser.FuncCallExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code StackPeek}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackPeek(@NotNull BitsyParser.StackPeekContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#elifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStat(@NotNull BitsyParser.ElifStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(@NotNull BitsyParser.InputContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NumExprParan}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExprParan(@NotNull BitsyParser.NumExprParanContext ctx);

	/**
	 * Visit a parse tree produced by the {@code StackExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackExpr(@NotNull BitsyParser.StackExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(@NotNull BitsyParser.NegativeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PostIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncExpr(@NotNull BitsyParser.PostIncExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(@NotNull BitsyParser.NumExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(@NotNull BitsyParser.ReturnStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull BitsyParser.StatementListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull BitsyParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PostDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecExpr(@NotNull BitsyParser.PostDecExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(@NotNull BitsyParser.BooleanContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(@NotNull BitsyParser.LessContext ctx);

	/**
	 * Visit a parse tree produced by the {@code printText}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintText(@NotNull BitsyParser.PrintTextContext ctx);

	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(@NotNull BitsyParser.PrintExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(@NotNull BitsyParser.WhileStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code BaseNumExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseNumExpr(@NotNull BitsyParser.BaseNumExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(@NotNull BitsyParser.ConditionBlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(@NotNull BitsyParser.MainStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#assignWithDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignWithDecl(@NotNull BitsyParser.AssignWithDeclContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PostIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncVar(@NotNull BitsyParser.PostIncVarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NegNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegNum(@NotNull BitsyParser.NegNumContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEq(@NotNull BitsyParser.LessEqContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull BitsyParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code IsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEq(@NotNull BitsyParser.IsEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code StackPop}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackPop(@NotNull BitsyParser.StackPopContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull BitsyParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LogicalIsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalIsEq(@NotNull BitsyParser.LogicalIsEqContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(@NotNull BitsyParser.ParameterDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPartFunctionDefinition(@NotNull BitsyParser.ProgPartFunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull BitsyParser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by the {@code StackIsEmpty}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackIsEmpty(@NotNull BitsyParser.StackIsEmptyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stackVariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackVariableDeclaration(@NotNull BitsyParser.StackVariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code NotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEq(@NotNull BitsyParser.NotEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code BaseBoolExpr}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseBoolExpr(@NotNull BitsyParser.BaseBoolExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull BitsyParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull BitsyParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PreIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncExpr(@NotNull BitsyParser.PreIncExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PostDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecVar(@NotNull BitsyParser.PostDecVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(@NotNull BitsyParser.ElseStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PreDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecExpr(@NotNull BitsyParser.PreDecExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code StackPush}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackPush(@NotNull BitsyParser.StackPushContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull BitsyParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LogicalNotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNotEq(@NotNull BitsyParser.LogicalNotEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LogicalAND}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAND(@NotNull BitsyParser.LogicalANDContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull BitsyParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull BitsyParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#whileConditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileConditionBlock(@NotNull BitsyParser.WhileConditionBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull BitsyParser.IfStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull BitsyParser.ModContext ctx);

	/**
	 * Visit a parse tree produced by the {@code BoolExprParan}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprParan(@NotNull BitsyParser.BoolExprParanContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull BitsyParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link BitsyParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(@NotNull BitsyParser.FunctionDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PosNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosNum(@NotNull BitsyParser.PosNumContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(@NotNull BitsyParser.NumContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PreDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecVar(@NotNull BitsyParser.PreDecVarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code LogicalOR}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOR(@NotNull BitsyParser.LogicalORContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull BitsyParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull BitsyParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive(@NotNull BitsyParser.PositiveContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(@NotNull BitsyParser.GreaterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull BitsyParser.PowerContext ctx);
}