// Generated from compiler/parser/Bitsy.g4 by ANTLR 4.3
package compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BitsyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, BOOLEAN=38, IDENTIFIER=39, 
		NUMBER=40, QUOTED_STRING=41, WHITESPACE=42, COMMENT=43, LINE_COMMENT=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'func'", "'return'", "'!='", "'while'", "'{'", "'||'", 
		"';'", "'&&'", "'}'", "'='", "'if'", "'^'", "'print('", "'<='", "'int'", 
		"'push'", "'stack'", "'('", "'*'", "','", "'.'", "'input()'", "'>='", 
		"'elif'", "'=='", "'<'", "'bool'", "'>'", "'isEmpty'", "'%'", "'else'", 
		"'pop'", "')'", "'peek'", "'+'", "'-'", "BOOLEAN", "IDENTIFIER", "NUMBER", 
		"QUOTED_STRING", "WHITESPACE", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_programPart = 1, RULE_statement = 2, RULE_baseExpression = 3, 
		RULE_numExpression = 4, RULE_boolExpression = 5, RULE_expression = 6, 
		RULE_stackExpression = 7, RULE_varDeclaration = 8, RULE_assignment = 9, 
		RULE_assignWithDecl = 10, RULE_print = 11, RULE_returnStat = 12, RULE_functionDefinition = 13, 
		RULE_parameterDeclaration = 14, RULE_statementList = 15, RULE_ifStat = 16, 
		RULE_elifStat = 17, RULE_elseStat = 18, RULE_conditionBlock = 19, RULE_whileStat = 20, 
		RULE_whileConditionBlock = 21, RULE_prePostStat = 22, RULE_functionCall = 23, 
		RULE_expressionList = 24, RULE_signedNum = 25;
	public static final String[] ruleNames = {
		"program", "programPart", "statement", "baseExpression", "numExpression", 
		"boolExpression", "expression", "stackExpression", "varDeclaration", "assignment", 
		"assignWithDecl", "print", "returnStat", "functionDefinition", "parameterDeclaration", 
		"statementList", "ifStat", "elifStat", "elseStat", "conditionBlock", "whileStat", 
		"whileConditionBlock", "prePostStat", "functionCall", "expressionList", 
		"signedNum"
	};

	@Override
	public String getGrammarFileName() { return "Bitsy.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BitsyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramPartContext programPart(int i) {
			return getRuleContext(ProgramPartContext.class,i);
		}
		public List<ProgramPartContext> programPart() {
			return getRuleContexts(ProgramPartContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); programPart();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__25) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__18) | (1L << T__14) | (1L << T__9) | (1L << T__1) | (1L << T__0) | (1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramPartContext extends ParserRuleContext {
		public ProgramPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programPart; }
	 
		public ProgramPartContext() { }
		public void copyFrom(ProgramPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStatementContext extends ProgramPartContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainStatementContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterMainStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitMainStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgPartFunctionDefinitionContext extends ProgramPartContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ProgPartFunctionDefinitionContext(ProgramPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterProgPartFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitProgPartFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitProgPartFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramPartContext programPart() throws RecognitionException {
		ProgramPartContext _localctx = new ProgramPartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programPart);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case T__34:
			case T__32:
			case T__25:
			case T__23:
			case T__21:
			case T__19:
			case T__18:
			case T__14:
			case T__9:
			case T__1:
			case T__0:
			case BOOLEAN:
			case IDENTIFIER:
			case NUMBER:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); statement();
				}
				break;
			case T__35:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58); functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public AssignWithDeclContext assignWithDecl() {
			return getRuleContext(AssignWithDeclContext.class,0);
		}
		public PrePostStatContext prePostStat() {
			return getRuleContext(PrePostStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); print();
				setState(62); match(T__29);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); varDeclaration();
				setState(65); match(T__29);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); assignment();
				setState(68); match(T__29);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); returnStat();
				setState(71); match(T__29);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); prePostStat();
				setState(74); match(T__29);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76); ifStat();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77); whileStat();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78); assignWithDecl();
				setState(79); match(T__29);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81); expression();
				setState(82); match(T__29);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseExpressionContext extends ParserRuleContext {
		public BaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpression; }
	 
		public BaseExpressionContext() { }
		public void copyFrom(BaseExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends BaseExpressionContext {
		public InputContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends BaseExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public VariableContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackExprContext extends BaseExpressionContext {
		public StackExpressionContext stackExpression() {
			return getRuleContext(StackExpressionContext.class,0);
		}
		public StackExprContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends BaseExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallExprContext(BaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExpressionContext baseExpression() throws RecognitionException {
		BaseExpressionContext _localctx = new BaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_baseExpression);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(T__14);
				}
				break;

			case 2:
				_localctx = new StackExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87); stackExpression();
				}
				break;

			case 3:
				_localctx = new FuncCallExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88); functionCall();
				}
				break;

			case 4:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89); ((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumExpressionContext extends ParserRuleContext {
		public NumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpression; }
	 
		public NumExpressionContext() { }
		public void copyFrom(NumExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreIncExprContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public PreIncExprContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPreIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPreIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPreIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public ModContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseNumExprContext extends NumExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public BaseNumExprContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterBaseNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitBaseNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitBaseNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecExprContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public PreDecExprContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPreDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPreDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPreDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public DivContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprParanContext extends NumExpressionContext {
		public NumExpressionContext expr;
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NumExprParanContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNumExprParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNumExprParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNumExprParan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NegativeContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends NumExpressionContext {
		public SignedNumContext number;
		public SignedNumContext signedNum() {
			return getRuleContext(SignedNumContext.class,0);
		}
		public NumberContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public MultContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositiveContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public PositiveContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPositive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPositive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPositive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncExprContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public PostIncExprContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPostIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPostIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPostIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public PlusContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecExprContext extends NumExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public PostDecExprContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPostDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPostDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPostDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public PowerContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends NumExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public MinusContext(NumExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExpressionContext numExpression() throws RecognitionException {
		return numExpression(0);
	}

	private NumExpressionContext numExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExpressionContext _localctx = new NumExpressionContext(_ctx, _parentState);
		NumExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_numExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new PositiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(93); match(T__1);
				setState(94); numExpression(12);
				}
				break;

			case 2:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95); match(T__0);
				setState(96); numExpression(11);
				}
				break;

			case 3:
				{
				_localctx = new PreIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); match(T__1);
				setState(98); match(T__1);
				setState(99); numExpression(10);
				}
				break;

			case 4:
				{
				_localctx = new PreDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); match(T__0);
				setState(101); match(T__0);
				setState(102); numExpression(9);
				}
				break;

			case 5:
				{
				_localctx = new NumExprParanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); match(T__18);
				setState(104); ((NumExprParanContext)_localctx).expr = numExpression(0);
				setState(105); match(T__3);
				}
				break;

			case 6:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); ((NumberContext)_localctx).number = signedNum();
				}
				break;

			case 7:
				{
				_localctx = new BaseNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108); baseExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new NumExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(112); match(T__24);
						setState(113); ((PowerContext)_localctx).right = numExpression(9);
						}
						break;

					case 2:
						{
						_localctx = new ModContext(new NumExpressionContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(115); match(T__6);
						setState(116); ((ModContext)_localctx).right = numExpression(8);
						}
						break;

					case 3:
						{
						_localctx = new DivContext(new NumExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(118); match(T__36);
						setState(119); ((DivContext)_localctx).right = numExpression(7);
						}
						break;

					case 4:
						{
						_localctx = new MultContext(new NumExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121); match(T__17);
						setState(122); ((MultContext)_localctx).right = numExpression(6);
						}
						break;

					case 5:
						{
						_localctx = new MinusContext(new NumExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(124); match(T__0);
						setState(125); ((MinusContext)_localctx).right = numExpression(5);
						}
						break;

					case 6:
						{
						_localctx = new PlusContext(new NumExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(127); match(T__1);
						setState(128); ((PlusContext)_localctx).right = numExpression(4);
						}
						break;

					case 7:
						{
						_localctx = new PostIncExprContext(new NumExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(129);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(130); match(T__1);
						setState(131); match(T__1);
						}
						break;

					case 8:
						{
						_localctx = new PostDecExprContext(new NumExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpression);
						setState(132);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(133); match(T__0);
						setState(134); match(T__0);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public NotEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNotEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNotEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseBoolExprContext extends BoolExpressionContext {
		public BaseExpressionContext baseExpression() {
			return getRuleContext(BaseExpressionContext.class,0);
		}
		public BaseBoolExprContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterBaseBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitBaseBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitBaseBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprParanContext extends BoolExpressionContext {
		public BoolExpressionContext expr;
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public BoolExprParanContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterBoolExprParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitBoolExprParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitBoolExprParan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public GreaterEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterGreaterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitGreaterEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitGreaterEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalORContext extends BoolExpressionContext {
		public BoolExpressionContext left;
		public BoolExpressionContext right;
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public LogicalORContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLogicalOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLogicalOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLogicalOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public LessEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLessEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLessEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLessEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsEqContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public IsEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterIsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitIsEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitIsEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotEqContext extends BoolExpressionContext {
		public BoolExpressionContext left;
		public BoolExpressionContext right;
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public LogicalNotEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLogicalNotEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLogicalNotEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLogicalNotEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalANDContext extends BoolExpressionContext {
		public BoolExpressionContext left;
		public BoolExpressionContext right;
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public LogicalANDContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLogicalAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLogicalAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLogicalAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public GreaterContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalIsEqContext extends BoolExpressionContext {
		public BoolExpressionContext left;
		public BoolExpressionContext right;
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public LogicalIsEqContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLogicalIsEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLogicalIsEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLogicalIsEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends BoolExpressionContext {
		public Token boolValue;
		public TerminalNode BOOLEAN() { return getToken(BitsyParser.BOOLEAN, 0); }
		public BooleanContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends BoolExpressionContext {
		public NumExpressionContext left;
		public NumExpressionContext right;
		public List<NumExpressionContext> numExpression() {
			return getRuleContexts(NumExpressionContext.class);
		}
		public NumExpressionContext numExpression(int i) {
			return getRuleContext(NumExpressionContext.class,i);
		}
		public LessContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		return boolExpression(0);
	}

	private BoolExpressionContext boolExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, _parentState);
		BoolExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_boolExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new BoolExprParanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141); match(T__18);
				setState(142); ((BoolExprParanContext)_localctx).expr = boolExpression(0);
				setState(143); match(T__3);
				}
				break;

			case 2:
				{
				_localctx = new LessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); ((LessContext)_localctx).left = numExpression(0);
				setState(146); match(T__10);
				setState(147); ((LessContext)_localctx).right = numExpression(0);
				}
				break;

			case 3:
				{
				_localctx = new GreaterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149); ((GreaterContext)_localctx).left = numExpression(0);
				setState(150); match(T__8);
				setState(151); ((GreaterContext)_localctx).right = numExpression(0);
				}
				break;

			case 4:
				{
				_localctx = new LessEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); ((LessEqContext)_localctx).left = numExpression(0);
				setState(154); match(T__22);
				setState(155); ((LessEqContext)_localctx).right = numExpression(0);
				}
				break;

			case 5:
				{
				_localctx = new GreaterEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157); ((GreaterEqContext)_localctx).left = numExpression(0);
				setState(158); match(T__13);
				setState(159); ((GreaterEqContext)_localctx).right = numExpression(0);
				}
				break;

			case 6:
				{
				_localctx = new IsEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); ((IsEqContext)_localctx).left = numExpression(0);
				setState(162); match(T__11);
				setState(163); ((IsEqContext)_localctx).right = numExpression(0);
				}
				break;

			case 7:
				{
				_localctx = new NotEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); ((NotEqContext)_localctx).left = numExpression(0);
				setState(166); match(T__33);
				setState(167); ((NotEqContext)_localctx).right = numExpression(0);
				}
				break;

			case 8:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169); ((BooleanContext)_localctx).boolValue = match(BOOLEAN);
				}
				break;

			case 9:
				{
				_localctx = new BaseBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); baseExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalANDContext(new BoolExpressionContext(_parentctx, _parentState));
						((LogicalANDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(173);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(174); match(T__28);
						setState(175); ((LogicalANDContext)_localctx).right = boolExpression(7);
						}
						break;

					case 2:
						{
						_localctx = new LogicalORContext(new BoolExpressionContext(_parentctx, _parentState));
						((LogicalORContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(176);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(177); match(T__30);
						setState(178); ((LogicalORContext)_localctx).right = boolExpression(6);
						}
						break;

					case 3:
						{
						_localctx = new LogicalIsEqContext(new BoolExpressionContext(_parentctx, _parentState));
						((LogicalIsEqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180); match(T__11);
						setState(181); ((LogicalIsEqContext)_localctx).right = boolExpression(5);
						}
						break;

					case 4:
						{
						_localctx = new LogicalNotEqContext(new BoolExpressionContext(_parentctx, _parentState));
						((LogicalNotEqContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183); match(T__33);
						setState(184); ((LogicalNotEqContext)_localctx).right = boolExpression(4);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprContext extends ExpressionContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExpressionContext {
		public NumExpressionContext numExpression() {
			return getRuleContext(NumExpressionContext.class,0);
		}
		public NumExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190); numExpression(0);
				}
				break;

			case 2:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191); boolExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackExpressionContext extends ParserRuleContext {
		public StackExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackExpression; }
	 
		public StackExpressionContext() { }
		public void copyFrom(StackExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StackPopContext extends StackExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public StackPopContext(StackExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackPop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackPushContext extends StackExpressionContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StackPushContext(StackExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackPush(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackPeekContext extends StackExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public StackPeekContext(StackExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackPeek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackPeek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackPeek(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackIsEmptyContext extends StackExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public StackIsEmptyContext(StackExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackIsEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackIsEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackIsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackExpressionContext stackExpression() throws RecognitionException {
		StackExpressionContext _localctx = new StackExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackExpression);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new StackPushContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194); ((StackPushContext)_localctx).varName = match(IDENTIFIER);
				setState(195); match(T__15);
				setState(196); match(T__20);
				setState(197); match(T__18);
				setState(198); ((StackPushContext)_localctx).expr = expression();
				setState(199); match(T__3);
				}
				break;

			case 2:
				_localctx = new StackPopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201); ((StackPopContext)_localctx).varName = match(IDENTIFIER);
				setState(202); match(T__15);
				setState(203); match(T__4);
				setState(204); match(T__18);
				setState(205); match(T__3);
				}
				break;

			case 3:
				_localctx = new StackPeekContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206); ((StackPeekContext)_localctx).varName = match(IDENTIFIER);
				setState(207); match(T__15);
				setState(208); match(T__2);
				setState(209); match(T__18);
				setState(210); match(T__3);
				}
				break;

			case 4:
				_localctx = new StackIsEmptyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211); ((StackIsEmptyContext)_localctx).varName = match(IDENTIFIER);
				setState(212); match(T__15);
				setState(213); match(T__7);
				setState(214); match(T__18);
				setState(215); match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public VariableDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StackVariableDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public StackVariableDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStackVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStackVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStackVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			setState(222);
			switch (_input.LA(1)) {
			case T__21:
			case T__9:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(219); ((VariableDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case T__19:
				_localctx = new StackVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220); match(T__19);
				setState(221); ((StackVariableDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); ((AssignmentContext)_localctx).varName = match(IDENTIFIER);
			setState(225); match(T__26);
			setState(226); ((AssignmentContext)_localctx).expr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignWithDeclContext extends ParserRuleContext {
		public ExpressionContext expr;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignWithDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignWithDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterAssignWithDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitAssignWithDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitAssignWithDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignWithDeclContext assignWithDecl() throws RecognitionException {
		AssignWithDeclContext _localctx = new AssignWithDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignWithDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); varDeclaration();
			setState(229); match(T__26);
			setState(230); ((AssignWithDeclContext)_localctx).expr = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintTextContext extends PrintContext {
		public Token text;
		public TerminalNode QUOTED_STRING() { return getToken(BitsyParser.QUOTED_STRING, 0); }
		public PrintTextContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPrintText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPrintText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPrintText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(T__23);
				setState(233); ((PrintExprContext)_localctx).argument = expression();
				setState(234); match(T__3);
				}
				break;

			case 2:
				_localctx = new PrintTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); match(T__23);
				setState(237); ((PrintTextContext)_localctx).text = match(QUOTED_STRING);
				setState(238); match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatContext extends ParserRuleContext {
		public ExpressionContext returnValue;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitReturnStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(T__34);
			setState(243);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__14) | (1L << T__1) | (1L << T__0) | (1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(242); ((ReturnStatContext)_localctx).returnValue = expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token funcName;
		public ParameterDeclarationContext params;
		public StatementListContext statements;
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(T__35);
			setState(246); ((FunctionDefinitionContext)_localctx).funcName = match(IDENTIFIER);
			setState(247); match(T__18);
			setState(248); ((FunctionDefinitionContext)_localctx).params = parameterDeclaration();
			setState(249); match(T__3);
			setState(250); match(T__31);
			setState(251); ((FunctionDefinitionContext)_localctx).statements = statementList();
			setState(252); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration;
		public List<VarDeclarationContext> declarations = new ArrayList<VarDeclarationContext>();
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterDeclaration);
		int _la;
		try {
			setState(263);
			switch (_input.LA(1)) {
			case T__21:
			case T__19:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
				((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(255); match(T__16);
					setState(256); ((ParameterDeclarationContext)_localctx).varDeclaration = varDeclaration();
					((ParameterDeclarationContext)_localctx).declarations.add(((ParameterDeclarationContext)_localctx).varDeclaration);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__32) | (1L << T__25) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__18) | (1L << T__14) | (1L << T__9) | (1L << T__1) | (1L << T__0) | (1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(265); statement();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public ConditionBlockContext ifBlock;
		public ElifStatContext elifStat;
		public List<ElifStatContext> elifBlock = new ArrayList<ElifStatContext>();
		public ElseStatContext elseBlock;
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public List<ElifStatContext> elifStat() {
			return getRuleContexts(ElifStatContext.class);
		}
		public ElifStatContext elifStat(int i) {
			return getRuleContext(ElifStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(T__25);
			setState(272); ((IfStatContext)_localctx).ifBlock = conditionBlock();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(273); ((IfStatContext)_localctx).elifStat = elifStat();
				((IfStatContext)_localctx).elifBlock.add(((IfStatContext)_localctx).elifStat);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(279); ((IfStatContext)_localctx).elseBlock = elseStat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifStatContext extends ParserRuleContext {
		public ConditionBlockContext cond;
		public ConditionBlockContext conditionBlock() {
			return getRuleContext(ConditionBlockContext.class,0);
		}
		public ElifStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterElifStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitElifStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitElifStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStatContext elifStat() throws RecognitionException {
		ElifStatContext _localctx = new ElifStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(T__12);
			setState(283); ((ElifStatContext)_localctx).cond = conditionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatContext extends ParserRuleContext {
		public StatementListContext statements;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(T__5);
			setState(286); match(T__31);
			setState(287); ((ElseStatContext)_localctx).statements = statementList();
			setState(288); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBlockContext extends ParserRuleContext {
		public ExpressionContext expr;
		public StatementListContext statements;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(T__18);
			setState(291); ((ConditionBlockContext)_localctx).expr = expression();
			setState(292); match(T__3);
			setState(293); match(T__31);
			setState(294); ((ConditionBlockContext)_localctx).statements = statementList();
			setState(295); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public WhileConditionBlockContext whileBock;
		public WhileConditionBlockContext whileConditionBlock() {
			return getRuleContext(WhileConditionBlockContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(T__32);
			setState(298); ((WhileStatContext)_localctx).whileBock = whileConditionBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileConditionBlockContext extends ParserRuleContext {
		public ExpressionContext expr;
		public StatementListContext statements;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileConditionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterWhileConditionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitWhileConditionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitWhileConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionBlockContext whileConditionBlock() throws RecognitionException {
		WhileConditionBlockContext _localctx = new WhileConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileConditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(T__18);
			setState(301); ((WhileConditionBlockContext)_localctx).expr = expression();
			setState(302); match(T__3);
			setState(303); match(T__31);
			setState(304); ((WhileConditionBlockContext)_localctx).statements = statementList();
			setState(305); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrePostStatContext extends ParserRuleContext {
		public PrePostStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prePostStat; }
	 
		public PrePostStatContext() { }
		public void copyFrom(PrePostStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreIncVarContext extends PrePostStatContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public PreIncVarContext(PrePostStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPreIncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPreIncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPreIncVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecVarContext extends PrePostStatContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public PostDecVarContext(PrePostStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPostDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPostDecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPostDecVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecVarContext extends PrePostStatContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public PreDecVarContext(PrePostStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPreDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPreDecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPreDecVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncVarContext extends PrePostStatContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public PostIncVarContext(PrePostStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPostIncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPostIncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPostIncVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrePostStatContext prePostStat() throws RecognitionException {
		PrePostStatContext _localctx = new PrePostStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_prePostStat);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new PostIncVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307); ((PostIncVarContext)_localctx).varName = match(IDENTIFIER);
				setState(308); match(T__1);
				setState(309); match(T__1);
				}
				break;

			case 2:
				_localctx = new PostDecVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310); ((PostDecVarContext)_localctx).varName = match(IDENTIFIER);
				setState(311); match(T__0);
				setState(312); match(T__0);
				}
				break;

			case 3:
				_localctx = new PreIncVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313); match(T__1);
				setState(314); match(T__1);
				setState(315); ((PreIncVarContext)_localctx).varName = match(IDENTIFIER);
				}
				break;

			case 4:
				_localctx = new PreDecVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(316); match(T__0);
				setState(317); match(T__0);
				setState(318); ((PreDecVarContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public Token funcName;
		public ExpressionListContext arguments;
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BitsyParser.IDENTIFIER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); ((FunctionCallContext)_localctx).funcName = match(IDENTIFIER);
			setState(322); match(T__18);
			setState(323); ((FunctionCallContext)_localctx).arguments = expressionList();
			setState(324); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			setState(335);
			switch (_input.LA(1)) {
			case T__18:
			case T__14:
			case T__1:
			case T__0:
			case BOOLEAN:
			case IDENTIFIER:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); ((ExpressionListContext)_localctx).expression = expression();
				((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(327); match(T__16);
					setState(328); ((ExpressionListContext)_localctx).expression = expression();
					((ExpressionListContext)_localctx).expressions.add(((ExpressionListContext)_localctx).expression);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedNumContext extends ParserRuleContext {
		public SignedNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNum; }
	 
		public SignedNumContext() { }
		public void copyFrom(SignedNumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PosNumContext extends SignedNumContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(BitsyParser.NUMBER, 0); }
		public PosNumContext(SignedNumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterPosNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitPosNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitPosNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends SignedNumContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(BitsyParser.NUMBER, 0); }
		public NumContext(SignedNumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegNumContext extends SignedNumContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(BitsyParser.NUMBER, 0); }
		public NegNumContext(SignedNumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).enterNegNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BitsyListener ) ((BitsyListener)listener).exitNegNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitsyVisitor ) return ((BitsyVisitor<? extends T>)visitor).visitNegNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumContext signedNum() throws RecognitionException {
		SignedNumContext _localctx = new SignedNumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_signedNum);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NegNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337); match(T__0);
				setState(338); ((NegNumContext)_localctx).number = match(NUMBER);
				}
				break;
			case T__1:
				_localctx = new PosNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(T__1);
				setState(340); ((PosNumContext)_localctx).number = match(NUMBER);
				}
				break;
			case NUMBER:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341); ((NumContext)_localctx).number = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return numExpression_sempred((NumExpressionContext)_localctx, predIndex);

		case 5: return boolExpression_sempred((BoolExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numExpression_sempred(NumExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 7);

		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);

		case 4: return precpred(_ctx, 4);

		case 5: return precpred(_ctx, 3);

		case 6: return precpred(_ctx, 14);

		case 7: return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean boolExpression_sempred(BoolExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 6);

		case 9: return precpred(_ctx, 5);

		case 10: return precpred(_ctx, 4);

		case 11: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3\3\5\3>\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf\13\7\3\b\3\b\5\b\u00c3"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00db\n\t\3\n\3\n\3\n\3\n\5\n\u00e1\n\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f2"+
		"\n\r\3\16\3\16\5\16\u00f6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107\13\20\3\20\5\20"+
		"\u010a\n\20\3\21\7\21\u010d\n\21\f\21\16\21\u0110\13\21\3\22\3\22\3\22"+
		"\7\22\u0115\n\22\f\22\16\22\u0118\13\22\3\22\5\22\u011b\n\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0142\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u014c\n\32\f\32\16\32\u014f\13\32\3\32\5\32"+
		"\u0152\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0159\n\33\3\33\2\4\n\f\34\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\22\22"+
		"\36\36\u017a\2\67\3\2\2\2\4=\3\2\2\2\6V\3\2\2\2\b\\\3\2\2\2\no\3\2\2\2"+
		"\f\u00ad\3\2\2\2\16\u00c2\3\2\2\2\20\u00da\3\2\2\2\22\u00e0\3\2\2\2\24"+
		"\u00e2\3\2\2\2\26\u00e6\3\2\2\2\30\u00f1\3\2\2\2\32\u00f3\3\2\2\2\34\u00f7"+
		"\3\2\2\2\36\u0109\3\2\2\2 \u010e\3\2\2\2\"\u0111\3\2\2\2$\u011c\3\2\2"+
		"\2&\u011f\3\2\2\2(\u0124\3\2\2\2*\u012b\3\2\2\2,\u012e\3\2\2\2.\u0141"+
		"\3\2\2\2\60\u0143\3\2\2\2\62\u0151\3\2\2\2\64\u0158\3\2\2\2\668\5\4\3"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;>\5\6\4\2"+
		"<>\5\34\17\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\5\30\r\2@A\7\n\2\2AW\3\2"+
		"\2\2BC\5\22\n\2CD\7\n\2\2DW\3\2\2\2EF\5\24\13\2FG\7\n\2\2GW\3\2\2\2HI"+
		"\5\32\16\2IJ\7\n\2\2JW\3\2\2\2KL\5.\30\2LM\7\n\2\2MW\3\2\2\2NW\5\"\22"+
		"\2OW\5*\26\2PQ\5\26\f\2QR\7\n\2\2RW\3\2\2\2ST\5\16\b\2TU\7\n\2\2UW\3\2"+
		"\2\2V?\3\2\2\2VB\3\2\2\2VE\3\2\2\2VH\3\2\2\2VK\3\2\2\2VN\3\2\2\2VO\3\2"+
		"\2\2VP\3\2\2\2VS\3\2\2\2W\7\3\2\2\2X]\7\31\2\2Y]\5\20\t\2Z]\5\60\31\2"+
		"[]\7)\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\b\6"+
		"\1\2_`\7&\2\2`p\5\n\6\16ab\7\'\2\2bp\5\n\6\rcd\7&\2\2de\7&\2\2ep\5\n\6"+
		"\ffg\7\'\2\2gh\7\'\2\2hp\5\n\6\13ij\7\25\2\2jk\5\n\6\2kl\7$\2\2lp\3\2"+
		"\2\2mp\5\64\33\2np\5\b\5\2o^\3\2\2\2oa\3\2\2\2oc\3\2\2\2of\3\2\2\2oi\3"+
		"\2\2\2om\3\2\2\2on\3\2\2\2p\u008b\3\2\2\2qr\f\n\2\2rs\7\17\2\2s\u008a"+
		"\5\n\6\13tu\f\t\2\2uv\7!\2\2v\u008a\5\n\6\nwx\f\b\2\2xy\7\3\2\2y\u008a"+
		"\5\n\6\tz{\f\7\2\2{|\7\26\2\2|\u008a\5\n\6\b}~\f\6\2\2~\177\7\'\2\2\177"+
		"\u008a\5\n\6\7\u0080\u0081\f\5\2\2\u0081\u0082\7&\2\2\u0082\u008a\5\n"+
		"\6\6\u0083\u0084\f\20\2\2\u0084\u0085\7&\2\2\u0085\u008a\7&\2\2\u0086"+
		"\u0087\f\17\2\2\u0087\u0088\7\'\2\2\u0088\u008a\7\'\2\2\u0089q\3\2\2\2"+
		"\u0089t\3\2\2\2\u0089w\3\2\2\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080"+
		"\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u008f\b\7\1\2\u008f\u0090\7\25\2\2\u0090\u0091\5\f\7\2\u0091"+
		"\u0092\7$\2\2\u0092\u00ae\3\2\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7\35"+
		"\2\2\u0095\u0096\5\n\6\2\u0096\u00ae\3\2\2\2\u0097\u0098\5\n\6\2\u0098"+
		"\u0099\7\37\2\2\u0099\u009a\5\n\6\2\u009a\u00ae\3\2\2\2\u009b\u009c\5"+
		"\n\6\2\u009c\u009d\7\21\2\2\u009d\u009e\5\n\6\2\u009e\u00ae\3\2\2\2\u009f"+
		"\u00a0\5\n\6\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5\n\6\2\u00a2\u00ae\3"+
		"\2\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\5\n\6\2\u00a6"+
		"\u00ae\3\2\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\5\n"+
		"\6\2\u00aa\u00ae\3\2\2\2\u00ab\u00ae\7(\2\2\u00ac\u00ae\5\b\5\2\u00ad"+
		"\u008e\3\2\2\2\u00ad\u0093\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u009b\3\2"+
		"\2\2\u00ad\u009f\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00bd\3\2\2\2\u00af\u00b0\f\b"+
		"\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00bc\5\f\7\t\u00b2\u00b3\f\7\2\2\u00b3"+
		"\u00b4\7\t\2\2\u00b4\u00bc\5\f\7\b\u00b5\u00b6\f\6\2\2\u00b6\u00b7\7\34"+
		"\2\2\u00b7\u00bc\5\f\7\7\u00b8\u00b9\f\5\2\2\u00b9\u00ba\7\6\2\2\u00ba"+
		"\u00bc\5\f\7\6\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2"+
		"\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\r\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\5\n\6\2"+
		"\u00c1\u00c3\5\f\7\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\17"+
		"\3\2\2\2\u00c4\u00c5\7)\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\7\23\2\2"+
		"\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5\16\b\2\u00c9\u00ca\7$\2\2\u00ca\u00db"+
		"\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00ce\7#\2\2\u00ce"+
		"\u00cf\7\25\2\2\u00cf\u00db\7$\2\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\7\30"+
		"\2\2\u00d2\u00d3\7%\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00db\7$\2\2\u00d5"+
		"\u00d6\7)\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00d8\7 \2\2\u00d8\u00d9\7\25"+
		"\2\2\u00d9\u00db\7$\2\2\u00da\u00c4\3\2\2\2\u00da\u00cb\3\2\2\2\u00da"+
		"\u00d0\3\2\2\2\u00da\u00d5\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd\t\2\2"+
		"\2\u00dd\u00e1\7)\2\2\u00de\u00df\7\24\2\2\u00df\u00e1\7)\2\2\u00e0\u00dc"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\23\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3"+
		"\u00e4\7\r\2\2\u00e4\u00e5\5\16\b\2\u00e5\25\3\2\2\2\u00e6\u00e7\5\22"+
		"\n\2\u00e7\u00e8\7\r\2\2\u00e8\u00e9\5\16\b\2\u00e9\27\3\2\2\2\u00ea\u00eb"+
		"\7\20\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed\7$\2\2\u00ed\u00f2\3\2\2\2"+
		"\u00ee\u00ef\7\20\2\2\u00ef\u00f0\7+\2\2\u00f0\u00f2\7$\2\2\u00f1\u00ea"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\31\3\2\2\2\u00f3\u00f5\7\5\2\2\u00f4"+
		"\u00f6\5\16\b\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\33\3\2\2"+
		"\2\u00f7\u00f8\7\4\2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb"+
		"\5\36\20\2\u00fb\u00fc\7$\2\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5 \21\2"+
		"\u00fe\u00ff\7\f\2\2\u00ff\35\3\2\2\2\u0100\u0105\5\22\n\2\u0101\u0102"+
		"\7\27\2\2\u0102\u0104\5\22\n\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\37\3\2\2\2\u010b\u010d\5\6\4\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f!\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0112\7\16\2\2\u0112\u0116\5(\25\2\u0113\u0115\5$\23\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5&\24\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b#\3\2\2\2\u011c\u011d\7\33\2\2"+
		"\u011d\u011e\5(\25\2\u011e%\3\2\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7"+
		"\b\2\2\u0121\u0122\5 \21\2\u0122\u0123\7\f\2\2\u0123\'\3\2\2\2\u0124\u0125"+
		"\7\25\2\2\u0125\u0126\5\16\b\2\u0126\u0127\7$\2\2\u0127\u0128\7\b\2\2"+
		"\u0128\u0129\5 \21\2\u0129\u012a\7\f\2\2\u012a)\3\2\2\2\u012b\u012c\7"+
		"\7\2\2\u012c\u012d\5,\27\2\u012d+\3\2\2\2\u012e\u012f\7\25\2\2\u012f\u0130"+
		"\5\16\b\2\u0130\u0131\7$\2\2\u0131\u0132\7\b\2\2\u0132\u0133\5 \21\2\u0133"+
		"\u0134\7\f\2\2\u0134-\3\2\2\2\u0135\u0136\7)\2\2\u0136\u0137\7&\2\2\u0137"+
		"\u0142\7&\2\2\u0138\u0139\7)\2\2\u0139\u013a\7\'\2\2\u013a\u0142\7\'\2"+
		"\2\u013b\u013c\7&\2\2\u013c\u013d\7&\2\2\u013d\u0142\7)\2\2\u013e\u013f"+
		"\7\'\2\2\u013f\u0140\7\'\2\2\u0140\u0142\7)\2\2\u0141\u0135\3\2\2\2\u0141"+
		"\u0138\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142/\3\2\2\2"+
		"\u0143\u0144\7)\2\2\u0144\u0145\7\25\2\2\u0145\u0146\5\62\32\2\u0146\u0147"+
		"\7$\2\2\u0147\61\3\2\2\2\u0148\u014d\5\16\b\2\u0149\u014a\7\27\2\2\u014a"+
		"\u014c\5\16\b\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u0150\3\2\2\2\u0152\63\3\2\2"+
		"\2\u0153\u0154\7\'\2\2\u0154\u0159\7*\2\2\u0155\u0156\7&\2\2\u0156\u0159"+
		"\7*\2\2\u0157\u0159\7*\2\2\u0158\u0153\3\2\2\2\u0158\u0155\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\65\3\2\2\2\329=V\\o\u0089\u008b\u00ad\u00bb\u00bd"+
		"\u00c2\u00da\u00e0\u00f1\u00f5\u0105\u0109\u010e\u0116\u011a\u0141\u014d"+
		"\u0151\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}