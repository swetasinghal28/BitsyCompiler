// Generated from compiler/parser/Bitsy.g4 by ANTLR 4.3
package compiler.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BitsyParser}.
 */
public interface BitsyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PreIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void enterPreIncVar(@NotNull BitsyParser.PreIncVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void exitPreIncVar(@NotNull BitsyParser.PreIncVarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEq(@NotNull BitsyParser.GreaterEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEq(@NotNull BitsyParser.GreaterEqContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull BitsyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull BitsyParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(@NotNull BitsyParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(@NotNull BitsyParser.FuncCallExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StackPeek}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void enterStackPeek(@NotNull BitsyParser.StackPeekContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StackPeek}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void exitStackPeek(@NotNull BitsyParser.StackPeekContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#elifStat}.
	 * @param ctx the parse tree
	 */
	void enterElifStat(@NotNull BitsyParser.ElifStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#elifStat}.
	 * @param ctx the parse tree
	 */
	void exitElifStat(@NotNull BitsyParser.ElifStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull BitsyParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull BitsyParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NumExprParan}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExprParan(@NotNull BitsyParser.NumExprParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExprParan}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExprParan(@NotNull BitsyParser.NumExprParanContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StackExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void enterStackExpr(@NotNull BitsyParser.StackExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StackExpr}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void exitStackExpr(@NotNull BitsyParser.StackExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(@NotNull BitsyParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(@NotNull BitsyParser.NegativeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PostIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncExpr(@NotNull BitsyParser.PostIncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncExpr(@NotNull BitsyParser.PostIncExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(@NotNull BitsyParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(@NotNull BitsyParser.NumExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(@NotNull BitsyParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(@NotNull BitsyParser.ReturnStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull BitsyParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull BitsyParser.StatementListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull BitsyParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull BitsyParser.PlusContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PostDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecExpr(@NotNull BitsyParser.PostDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecExpr(@NotNull BitsyParser.PostDecExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(@NotNull BitsyParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(@NotNull BitsyParser.BooleanContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Less}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLess(@NotNull BitsyParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLess(@NotNull BitsyParser.LessContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printText}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintText(@NotNull BitsyParser.PrintTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printText}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintText(@NotNull BitsyParser.PrintTextContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull BitsyParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link BitsyParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull BitsyParser.PrintExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(@NotNull BitsyParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(@NotNull BitsyParser.WhileStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BaseNumExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterBaseNumExpr(@NotNull BitsyParser.BaseNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseNumExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitBaseNumExpr(@NotNull BitsyParser.BaseNumExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(@NotNull BitsyParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(@NotNull BitsyParser.ConditionBlockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(@NotNull BitsyParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(@NotNull BitsyParser.MainStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#assignWithDecl}.
	 * @param ctx the parse tree
	 */
	void enterAssignWithDecl(@NotNull BitsyParser.AssignWithDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#assignWithDecl}.
	 * @param ctx the parse tree
	 */
	void exitAssignWithDecl(@NotNull BitsyParser.AssignWithDeclContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PostIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void enterPostIncVar(@NotNull BitsyParser.PostIncVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void exitPostIncVar(@NotNull BitsyParser.PostIncVarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NegNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void enterNegNum(@NotNull BitsyParser.NegNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void exitNegNum(@NotNull BitsyParser.NegNumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLessEq(@NotNull BitsyParser.LessEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLessEq(@NotNull BitsyParser.LessEqContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull BitsyParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull BitsyParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code IsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsEq(@NotNull BitsyParser.IsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsEq(@NotNull BitsyParser.IsEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StackPop}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void enterStackPop(@NotNull BitsyParser.StackPopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StackPop}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void exitStackPop(@NotNull BitsyParser.StackPopContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull BitsyParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull BitsyParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalIsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalIsEq(@NotNull BitsyParser.LogicalIsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalIsEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalIsEq(@NotNull BitsyParser.LogicalIsEqContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(@NotNull BitsyParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(@NotNull BitsyParser.ParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 */
	void enterProgPartFunctionDefinition(@NotNull BitsyParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link BitsyParser#programPart}.
	 * @param ctx the parse tree
	 */
	void exitProgPartFunctionDefinition(@NotNull BitsyParser.ProgPartFunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull BitsyParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull BitsyParser.MinusContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StackIsEmpty}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void enterStackIsEmpty(@NotNull BitsyParser.StackIsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StackIsEmpty}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void exitStackIsEmpty(@NotNull BitsyParser.StackIsEmptyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stackVariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStackVariableDeclaration(@NotNull BitsyParser.StackVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stackVariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStackVariableDeclaration(@NotNull BitsyParser.StackVariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code NotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEq(@NotNull BitsyParser.NotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEq(@NotNull BitsyParser.NotEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BaseBoolExpr}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBaseBoolExpr(@NotNull BitsyParser.BaseBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseBoolExpr}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBaseBoolExpr(@NotNull BitsyParser.BaseBoolExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull BitsyParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link BitsyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull BitsyParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull BitsyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link BitsyParser#baseExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull BitsyParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PreIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncExpr(@NotNull BitsyParser.PreIncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncExpr(@NotNull BitsyParser.PreIncExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PostDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void enterPostDecVar(@NotNull BitsyParser.PostDecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void exitPostDecVar(@NotNull BitsyParser.PostDecVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(@NotNull BitsyParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(@NotNull BitsyParser.ElseStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PreDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecExpr(@NotNull BitsyParser.PreDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecExpr}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecExpr(@NotNull BitsyParser.PreDecExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StackPush}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void enterStackPush(@NotNull BitsyParser.StackPushContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StackPush}
	 * labeled alternative in {@link BitsyParser#stackExpression}.
	 * @param ctx the parse tree
	 */
	void exitStackPush(@NotNull BitsyParser.StackPushContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull BitsyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull BitsyParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalNotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNotEq(@NotNull BitsyParser.LogicalNotEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalNotEq}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNotEq(@NotNull BitsyParser.LogicalNotEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalAND}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAND(@NotNull BitsyParser.LogicalANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAND}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAND(@NotNull BitsyParser.LogicalANDContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull BitsyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull BitsyParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull BitsyParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link BitsyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull BitsyParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#whileConditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileConditionBlock(@NotNull BitsyParser.WhileConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#whileConditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileConditionBlock(@NotNull BitsyParser.WhileConditionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull BitsyParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull BitsyParser.IfStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull BitsyParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull BitsyParser.ModContext ctx);

	/**
	 * Enter a parse tree produced by the {@code BoolExprParan}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprParan(@NotNull BitsyParser.BoolExprParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprParan}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprParan(@NotNull BitsyParser.BoolExprParanContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull BitsyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull BitsyParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BitsyParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(@NotNull BitsyParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BitsyParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(@NotNull BitsyParser.FunctionDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PosNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void enterPosNum(@NotNull BitsyParser.PosNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosNum}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void exitPosNum(@NotNull BitsyParser.PosNumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull BitsyParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link BitsyParser#signedNum}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull BitsyParser.NumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PreDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void enterPreDecVar(@NotNull BitsyParser.PreDecVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecVar}
	 * labeled alternative in {@link BitsyParser#prePostStat}.
	 * @param ctx the parse tree
	 */
	void exitPreDecVar(@NotNull BitsyParser.PreDecVarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code LogicalOR}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR(@NotNull BitsyParser.LogicalORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOR}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR(@NotNull BitsyParser.LogicalORContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull BitsyParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull BitsyParser.DivContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull BitsyParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull BitsyParser.MultContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPositive(@NotNull BitsyParser.PositiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Positive}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPositive(@NotNull BitsyParser.PositiveContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterGreater(@NotNull BitsyParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link BitsyParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitGreater(@NotNull BitsyParser.GreaterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull BitsyParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link BitsyParser#numExpression}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull BitsyParser.PowerContext ctx);
}