// Generated from ASPCore2.g4 by ANTLR 4.7.2
package de.unikassel.vs.asp.modelling.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASPCore2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ANONYMOUS_VARIABLE=2, DOT=3, COMMA=4, QUERY_MARK=5, COLON=6, SEMICOLON=7, 
		OR=8, NAF=9, CONS=10, WCONS=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, POWER=16, 
		MODULO=17, BITXOR=18, AT=19, SHARP=20, AMPERSAND=21, QUOTE=22, PAREN_OPEN=23, 
		PAREN_CLOSE=24, SQUARE_OPEN=25, SQUARE_CLOSE=26, CURLY_OPEN=27, CURLY_CLOSE=28, 
		EQUAL=29, UNEQUAL=30, LESS=31, GREATER=32, LESS_OR_EQ=33, GREATER_OR_EQ=34, 
		AGGREGATE_COUNT=35, AGGREGATE_MAX=36, AGGREGATE_MIN=37, AGGREGATE_SUM=38, 
		ID=39, VARIABLE=40, NUMBER=41, QUOTED_STRING=42, COMMENT=43, MULTI_LINE_COMMEN=44, 
		BLANK=45;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_query = 2, RULE_statement = 3, 
		RULE_head = 4, RULE_body = 5, RULE_disjunction = 6, RULE_choice = 7, RULE_choice_elements = 8, 
		RULE_choice_element = 9, RULE_aggregate = 10, RULE_aggregate_elements = 11, 
		RULE_aggregate_element = 12, RULE_aggregate_function = 13, RULE_weight_at_level = 14, 
		RULE_naf_literals = 15, RULE_naf_literal = 16, RULE_conditional_literal = 17, 
		RULE_conditional = 18, RULE_conditions = 19, RULE_condition = 20, RULE_classical_literal = 21, 
		RULE_builtin_atom = 22, RULE_binop = 23, RULE_terms = 24, RULE_term = 25, 
		RULE_interval = 26, RULE_external_atom = 27, RULE_directive = 28, RULE_directive_enumeration = 29, 
		RULE_basic_terms = 30, RULE_basic_term = 31, RULE_ground_term = 32, RULE_variable_term = 33, 
		RULE_answer_set = 34, RULE_answer_sets = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "query", "statement", "head", "body", "disjunction", 
			"choice", "choice_elements", "choice_element", "aggregate", "aggregate_elements", 
			"aggregate_element", "aggregate_function", "weight_at_level", "naf_literals", 
			"naf_literal", "conditional_literal", "conditional", "conditions", "condition", 
			"classical_literal", "builtin_atom", "binop", "terms", "term", "interval", 
			"external_atom", "directive", "directive_enumeration", "basic_terms", 
			"basic_term", "ground_term", "variable_term", "answer_set", "answer_sets"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'enumeration_predicate_is'", "'_'", "'.'", "','", "'?'", "':'", 
			"';'", "'|'", "'not'", "':-'", "':~'", "'+'", "'-'", "'*'", "'/'", "'**'", 
			"'\\'", "'^'", "'@'", "'#'", "'&'", "'\"'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'='", null, "'<'", "'>'", "'<='", "'>='", "'#count'", 
			"'#max'", "'#min'", "'#sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ANONYMOUS_VARIABLE", "DOT", "COMMA", "QUERY_MARK", "COLON", 
			"SEMICOLON", "OR", "NAF", "CONS", "WCONS", "PLUS", "MINUS", "TIMES", 
			"DIV", "POWER", "MODULO", "BITXOR", "AT", "SHARP", "AMPERSAND", "QUOTE", 
			"PAREN_OPEN", "PAREN_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "CURLY_OPEN", 
			"CURLY_CLOSE", "EQUAL", "UNEQUAL", "LESS", "GREATER", "LESS_OR_EQ", "GREATER_OR_EQ", 
			"AGGREGATE_COUNT", "AGGREGATE_MAX", "AGGREGATE_MIN", "AGGREGATE_SUM", 
			"ID", "VARIABLE", "NUMBER", "QUOTED_STRING", "COMMENT", "MULTI_LINE_COMMEN", 
			"BLANK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ASPCore2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASPCore2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ASPCore2Parser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitProgram(this);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(72);
				statements();
				}
				break;
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(75);
				query();
				}
			}

			setState(78);
			match(EOF);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QueryContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode QUERY_MARK() { return getToken(ASPCore2Parser.QUERY_MARK, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			classical_literal();
			setState(86);
			match(QUERY_MARK);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statement_factContext extends StatementContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_factContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_fact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_fact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatement_fact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_ruleContext extends StatementContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode CONS() { return getToken(ASPCore2Parser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_ruleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatement_rule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_weightConstraintContext extends StatementContext {
		public TerminalNode WCONS() { return getToken(ASPCore2Parser.WCONS, 0); }
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASPCore2Parser.SQUARE_OPEN, 0); }
		public Weight_at_levelContext weight_at_level() {
			return getRuleContext(Weight_at_levelContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ASPCore2Parser.SQUARE_CLOSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Statement_weightConstraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_weightConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_weightConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatement_weightConstraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_constraintContext extends StatementContext {
		public TerminalNode CONS() { return getToken(ASPCore2Parser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_constraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatement_constraint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_directiveContext extends StatementContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public Statement_directiveContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitStatement_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Statement_factContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				head();
				setState(89);
				match(DOT);
				}
				break;
			case 2:
				_localctx = new Statement_constraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(CONS);
				setState(92);
				body();
				setState(93);
				match(DOT);
				}
				break;
			case 3:
				_localctx = new Statement_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				head();
				setState(96);
				match(CONS);
				setState(97);
				body();
				setState(98);
				match(DOT);
				}
				break;
			case 4:
				_localctx = new Statement_weightConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(WCONS);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(101);
					body();
					}
				}

				setState(104);
				match(DOT);
				setState(105);
				match(SQUARE_OPEN);
				setState(106);
				weight_at_level();
				setState(107);
				match(SQUARE_CLOSE);
				}
				break;
			case 5:
				_localctx = new Statement_directiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				directive();
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

	public static class HeadContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				disjunction();
				}
				break;
			case CURLY_OPEN:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				choice();
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

	public static class BodyContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public Conditional_literalContext conditional_literal() {
			return getRuleContext(Conditional_literalContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(ASPCore2Parser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				naf_literal();
				}
				break;
			case 2:
				{
				setState(117);
				aggregate();
				}
				break;
			case 3:
				{
				setState(118);
				conditional_literal();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMICOLON) {
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(122);
				body();
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

	public static class DisjunctionContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode OR() { return getToken(ASPCore2Parser.OR, 0); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			classical_literal();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(126);
				match(OR);
				setState(127);
				disjunction();
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

	public static class ChoiceContext extends ParserRuleContext {
		public Token lt;
		public BinopContext lop;
		public BinopContext uop;
		public Token ut;
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASPCore2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASPCore2Parser.NUMBER, i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(130);
				((ChoiceContext)_localctx).lt = match(NUMBER);
				setState(131);
				((ChoiceContext)_localctx).lop = binop();
				}
			}

			setState(134);
			match(CURLY_OPEN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAF) | (1L << MINUS) | (1L << ID))) != 0)) {
				{
				setState(135);
				choice_elements();
				}
			}

			setState(138);
			match(CURLY_CLOSE);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(139);
				((ChoiceContext)_localctx).uop = binop();
				setState(140);
				((ChoiceContext)_localctx).ut = match(NUMBER);
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

	public static class Choice_elementsContext extends ParserRuleContext {
		public Choice_elementContext choice_element() {
			return getRuleContext(Choice_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASPCore2Parser.SEMICOLON, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public Choice_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitChoice_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_elementsContext choice_elements() throws RecognitionException {
		Choice_elementsContext _localctx = new Choice_elementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choice_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			choice_element();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(145);
				match(SEMICOLON);
				setState(146);
				choice_elements();
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

	public static class Choice_elementContext extends ParserRuleContext {
		public Conditional_literalContext conditional_literal() {
			return getRuleContext(Conditional_literalContext.class,0);
		}
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Choice_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitChoice_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Choice_elementContext choice_element() throws RecognitionException {
		Choice_elementContext _localctx = new Choice_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choice_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(149);
				conditional_literal();
				}
				break;
			case 2:
				{
				setState(150);
				classical_literal();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(153);
				match(COLON);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(154);
					naf_literals();
					}
				}

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

	public static class AggregateContext extends ParserRuleContext {
		public TermContext lt;
		public BinopContext lop;
		public BinopContext uop;
		public TermContext ut;
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAggregate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(159);
				match(NAF);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
				{
				setState(162);
				((AggregateContext)_localctx).lt = term(0);
				setState(163);
				((AggregateContext)_localctx).lop = binop();
				}
			}

			setState(167);
			aggregate_function();
			setState(168);
			match(CURLY_OPEN);
			setState(169);
			aggregate_elements();
			setState(170);
			match(CURLY_CLOSE);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(171);
				((AggregateContext)_localctx).uop = binop();
				setState(172);
				((AggregateContext)_localctx).ut = term(0);
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

	public static class Aggregate_elementsContext extends ParserRuleContext {
		public Aggregate_elementContext aggregate_element() {
			return getRuleContext(Aggregate_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASPCore2Parser.SEMICOLON, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public Aggregate_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAggregate_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_elementsContext aggregate_elements() throws RecognitionException {
		Aggregate_elementsContext _localctx = new Aggregate_elementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregate_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			aggregate_element();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(177);
				match(SEMICOLON);
				setState(178);
				aggregate_elements();
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

	public static class Aggregate_elementContext extends ParserRuleContext {
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Aggregate_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAggregate_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_elementContext aggregate_element() throws RecognitionException {
		Aggregate_elementContext _localctx = new Aggregate_elementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregate_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
				{
				setState(181);
				basic_terms();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(184);
				match(COLON);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(185);
					naf_literals();
					}
				}

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

	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode AGGREGATE_COUNT() { return getToken(ASPCore2Parser.AGGREGATE_COUNT, 0); }
		public TerminalNode AGGREGATE_MAX() { return getToken(ASPCore2Parser.AGGREGATE_MAX, 0); }
		public TerminalNode AGGREGATE_MIN() { return getToken(ASPCore2Parser.AGGREGATE_MIN, 0); }
		public TerminalNode AGGREGATE_SUM() { return getToken(ASPCore2Parser.AGGREGATE_SUM, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Weight_at_levelContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode AT() { return getToken(ASPCore2Parser.AT, 0); }
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Weight_at_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight_at_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterWeight_at_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitWeight_at_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitWeight_at_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Weight_at_levelContext weight_at_level() throws RecognitionException {
		Weight_at_levelContext _localctx = new Weight_at_levelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_weight_at_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			term(0);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(193);
				match(AT);
				setState(194);
				term(0);
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(197);
				match(COMMA);
				setState(198);
				terms();
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

	public static class Naf_literalsContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Naf_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterNaf_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitNaf_literals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitNaf_literals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naf_literalsContext naf_literals() throws RecognitionException {
		Naf_literalsContext _localctx = new Naf_literalsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_naf_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			naf_literal();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(202);
				match(COMMA);
				setState(203);
				naf_literals();
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

	public static class Naf_literalContext extends ParserRuleContext {
		public External_atomContext external_atom() {
			return getRuleContext(External_atomContext.class,0);
		}
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public Builtin_atomContext builtin_atom() {
			return getRuleContext(Builtin_atomContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public Naf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterNaf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitNaf_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitNaf_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naf_literalContext naf_literal() throws RecognitionException {
		Naf_literalContext _localctx = new Naf_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_naf_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(206);
				match(NAF);
				}
			}

			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(209);
				external_atom();
				}
				break;
			case 2:
				{
				setState(210);
				classical_literal();
				}
				break;
			case 3:
				{
				setState(211);
				builtin_atom();
				}
				break;
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

	public static class Conditional_literalContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public Conditional_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterConditional_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitConditional_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitConditional_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_literalContext conditional_literal() throws RecognitionException {
		Conditional_literalContext _localctx = new Conditional_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditional_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			conditional();
			setState(215);
			match(COLON);
			setState(216);
			conditions();
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(218);
				match(NAF);
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(221);
				match(MINUS);
				}
			}

			setState(224);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(225);
				match(PAREN_OPEN);
				setState(226);
				terms();
				setState(227);
				match(PAREN_CLOSE);
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			condition();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(232);
				match(COMMA);
				setState(233);
				condition();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(236);
				match(NAF);
				}
			}

			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(239);
				match(MINUS);
				}
			}

			setState(242);
			match(ID);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(243);
				match(PAREN_OPEN);
				setState(244);
				terms();
				setState(245);
				match(PAREN_CLOSE);
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

	public static class Classical_literalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public Classical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterClassical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitClassical_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitClassical_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Classical_literalContext classical_literal() throws RecognitionException {
		Classical_literalContext _localctx = new Classical_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(249);
				match(MINUS);
				}
			}

			setState(252);
			match(ID);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(253);
				match(PAREN_OPEN);
				setState(254);
				terms();
				setState(255);
				match(PAREN_CLOSE);
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

	public static class Builtin_atomContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Builtin_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBuiltin_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBuiltin_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitBuiltin_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builtin_atomContext builtin_atom() throws RecognitionException {
		Builtin_atomContext _localctx = new Builtin_atomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_builtin_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			term(0);
			setState(260);
			binop();
			setState(261);
			term(0);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ASPCore2Parser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(ASPCore2Parser.UNEQUAL, 0); }
		public TerminalNode LESS() { return getToken(ASPCore2Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ASPCore2Parser.GREATER, 0); }
		public TerminalNode LESS_OR_EQ() { return getToken(ASPCore2Parser.LESS_OR_EQ, 0); }
		public TerminalNode GREATER_OR_EQ() { return getToken(ASPCore2Parser.GREATER_OR_EQ, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			term(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(266);
				match(COMMA);
				setState(267);
				terms();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_numberContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(ASPCore2Parser.NUMBER, 0); }
		public Term_numberContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_anonymousVariableContext extends TermContext {
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASPCore2Parser.ANONYMOUS_VARIABLE, 0); }
		public Term_anonymousVariableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_anonymousVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_anonymousVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_anonymousVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_constContext extends TermContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public Term_constContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_minusArithTermContext extends TermContext {
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_minusArithTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_minusArithTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_minusArithTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_minusArithTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_bitxorArithTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BITXOR() { return getToken(ASPCore2Parser.BITXOR, 0); }
		public Term_bitxorArithTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_bitxorArithTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_bitxorArithTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_bitxorArithTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_intervalContext extends TermContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Term_intervalContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_interval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_variableContext extends TermContext {
		public TerminalNode VARIABLE() { return getToken(ASPCore2Parser.VARIABLE, 0); }
		public Term_variableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_timesdivmodArithTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(ASPCore2Parser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ASPCore2Parser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(ASPCore2Parser.MODULO, 0); }
		public Term_timesdivmodArithTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_timesdivmodArithTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_timesdivmodArithTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_timesdivmodArithTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_plusminusArithTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ASPCore2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public Term_plusminusArithTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_plusminusArithTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_plusminusArithTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_plusminusArithTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_powerArithTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode POWER() { return getToken(ASPCore2Parser.POWER, 0); }
		public Term_powerArithTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_powerArithTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_powerArithTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_powerArithTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_funcContext extends TermContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Term_funcContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_stringContext extends TermContext {
		public TerminalNode QUOTED_STRING() { return getToken(ASPCore2Parser.QUOTED_STRING, 0); }
		public Term_stringContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_string(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_parenthesisedTermContext extends TermContext {
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public Term_parenthesisedTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_parenthesisedTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_parenthesisedTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitTerm_parenthesisedTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new Term_constContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(271);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Term_funcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(ID);
				{
				setState(273);
				match(PAREN_OPEN);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(274);
					terms();
					}
				}

				setState(277);
				match(PAREN_CLOSE);
				}
				}
				break;
			case 3:
				{
				_localctx = new Term_numberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new Term_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(QUOTED_STRING);
				}
				break;
			case 5:
				{
				_localctx = new Term_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				_localctx = new Term_anonymousVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(ANONYMOUS_VARIABLE);
				}
				break;
			case 7:
				{
				_localctx = new Term_parenthesisedTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(PAREN_OPEN);
				setState(283);
				term(0);
				setState(284);
				match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				_localctx = new Term_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				interval();
				}
				break;
			case 9:
				{
				_localctx = new Term_minusArithTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(MINUS);
				setState(288);
				term(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Term_powerArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(291);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(292);
						match(POWER);
						setState(293);
						term(4);
						}
						break;
					case 2:
						{
						_localctx = new Term_timesdivmodArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(294);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(295);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						term(4);
						}
						break;
					case 3:
						{
						_localctx = new Term_plusminusArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(297);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(298);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						term(3);
						}
						break;
					case 4:
						{
						_localctx = new Term_bitxorArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(300);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(301);
						match(BITXOR);
						setState(302);
						term(2);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class IntervalContext extends ParserRuleContext {
		public Token lower;
		public Token upper;
		public List<TerminalNode> DOT() { return getTokens(ASPCore2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASPCore2Parser.DOT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASPCore2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASPCore2Parser.NUMBER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ASPCore2Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ASPCore2Parser.VARIABLE, i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			((IntervalContext)_localctx).lower = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==NUMBER) ) {
				((IntervalContext)_localctx).lower = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(309);
			match(DOT);
			setState(310);
			match(DOT);
			setState(311);
			((IntervalContext)_localctx).upper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==NUMBER) ) {
				((IntervalContext)_localctx).upper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class External_atomContext extends ParserRuleContext {
		public TermsContext input;
		public TermsContext output;
		public TerminalNode AMPERSAND() { return getToken(ASPCore2Parser.AMPERSAND, 0); }
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASPCore2Parser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ASPCore2Parser.SQUARE_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public External_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterExternal_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitExternal_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitExternal_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final External_atomContext external_atom() throws RecognitionException {
		External_atomContext _localctx = new External_atomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_external_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(313);
				match(MINUS);
				}
			}

			setState(316);
			match(AMPERSAND);
			setState(317);
			match(ID);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN) {
				{
				setState(318);
				match(SQUARE_OPEN);
				setState(319);
				((External_atomContext)_localctx).input = terms();
				setState(320);
				match(SQUARE_CLOSE);
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(324);
				match(PAREN_OPEN);
				setState(325);
				((External_atomContext)_localctx).output = terms();
				setState(326);
				match(PAREN_CLOSE);
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

	public static class DirectiveContext extends ParserRuleContext {
		public Directive_enumerationContext directive_enumeration() {
			return getRuleContext(Directive_enumerationContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			directive_enumeration();
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

	public static class Directive_enumerationContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(ASPCore2Parser.SHARP, 0); }
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Directive_enumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterDirective_enumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitDirective_enumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitDirective_enumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_enumerationContext directive_enumeration() throws RecognitionException {
		Directive_enumerationContext _localctx = new Directive_enumerationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_directive_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(SHARP);
			setState(333);
			match(T__0);
			setState(334);
			match(ID);
			setState(335);
			match(DOT);
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

	public static class Basic_termsContext extends ParserRuleContext {
		public Basic_termContext basic_term() {
			return getRuleContext(Basic_termContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public Basic_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBasic_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBasic_terms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitBasic_terms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_termsContext basic_terms() throws RecognitionException {
		Basic_termsContext _localctx = new Basic_termsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_basic_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			basic_term();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(338);
				match(COMMA);
				setState(339);
				basic_terms();
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

	public static class Basic_termContext extends ParserRuleContext {
		public Ground_termContext ground_term() {
			return getRuleContext(Ground_termContext.class,0);
		}
		public Variable_termContext variable_term() {
			return getRuleContext(Variable_termContext.class,0);
		}
		public Basic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBasic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBasic_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitBasic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_termContext basic_term() throws RecognitionException {
		Basic_termContext _localctx = new Basic_termContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_basic_term);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
			case NUMBER:
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				ground_term();
				}
				break;
			case ANONYMOUS_VARIABLE:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				variable_term();
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

	public static class Ground_termContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(ASPCore2Parser.QUOTED_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ASPCore2Parser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public Ground_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterGround_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitGround_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitGround_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ground_termContext ground_term() throws RecognitionException {
		Ground_termContext _localctx = new Ground_termContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ground_term);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(ID);
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(QUOTED_STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(348);
					match(MINUS);
					}
				}

				setState(351);
				match(NUMBER);
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

	public static class Variable_termContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ASPCore2Parser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASPCore2Parser.ANONYMOUS_VARIABLE, 0); }
		public Variable_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterVariable_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitVariable_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitVariable_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_termContext variable_term() throws RecognitionException {
		Variable_termContext _localctx = new Variable_termContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==ANONYMOUS_VARIABLE || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Answer_setContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public List<Classical_literalContext> classical_literal() {
			return getRuleContexts(Classical_literalContext.class);
		}
		public Classical_literalContext classical_literal(int i) {
			return getRuleContext(Classical_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASPCore2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASPCore2Parser.COMMA, i);
		}
		public Answer_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAnswer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAnswer_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAnswer_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_setContext answer_set() throws RecognitionException {
		Answer_setContext _localctx = new Answer_setContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_answer_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(CURLY_OPEN);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(357);
				classical_literal();
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				classical_literal();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(CURLY_CLOSE);
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

	public static class Answer_setsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ASPCore2Parser.EOF, 0); }
		public List<Answer_setContext> answer_set() {
			return getRuleContexts(Answer_setContext.class);
		}
		public Answer_setContext answer_set(int i) {
			return getRuleContext(Answer_setContext.class,i);
		}
		public Answer_setsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_sets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAnswer_sets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAnswer_sets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASPCore2Visitor ) return ((ASPCore2Visitor<? extends T>)visitor).visitAnswer_sets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_setsContext answer_sets() throws RecognitionException {
		Answer_setsContext _localctx = new Answer_setsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_answer_sets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_OPEN) {
				{
				{
				setState(369);
				answer_set();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(EOF);
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
		case 25:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u017c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2L\n\2\3\2\5\2O\n\2\3\2\3\2\3\3\6"+
		"\3T\n\3\r\3\16\3U\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\6\3\6\5\6"+
		"u\n\6\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\t\3\t\5\t\u0087\n\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\t\3\t\5\t\u0091"+
		"\n\t\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\5\13\u009a\n\13\3\13\3\13\5\13"+
		"\u009e\n\13\5\13\u00a0\n\13\3\f\5\f\u00a3\n\f\3\f\3\f\3\f\5\f\u00a8\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\5\r\u00b6\n\r"+
		"\3\16\5\16\u00b9\n\16\3\16\3\16\5\16\u00bd\n\16\5\16\u00bf\n\16\3\17\3"+
		"\17\3\20\3\20\3\20\5\20\u00c6\n\20\3\20\3\20\5\20\u00ca\n\20\3\21\3\21"+
		"\3\21\5\21\u00cf\n\21\3\22\5\22\u00d2\n\22\3\22\3\22\3\22\5\22\u00d7\n"+
		"\22\3\23\3\23\3\23\3\23\3\24\5\24\u00de\n\24\3\24\5\24\u00e1\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00e8\n\24\3\25\3\25\3\25\5\25\u00ed\n\25\3"+
		"\26\5\26\u00f0\n\26\3\26\5\26\u00f3\n\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00fa\n\26\3\27\5\27\u00fd\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0104\n"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u010f\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0116\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0124\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0132\n\33\f\33\16\33\u0135\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u013d\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0145\n\35\3\35\3\35\3\35\3\35\5\35\u014b\n\35\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0157\n \3!\3!\5!\u015b\n!\3\"\3\""+
		"\3\"\5\"\u0160\n\"\3\"\5\"\u0163\n\"\3#\3#\3$\3$\5$\u0169\n$\3$\3$\7$"+
		"\u016d\n$\f$\16$\u0170\13$\3$\3$\3%\7%\u0175\n%\f%\16%\u0178\13%\3%\3"+
		"%\3%\2\3\64&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFH\2\t\4\2\6\6\t\t\3\2%(\3\2\37$\4\2\20\21\23\23\3\2\16\17\3"+
		"\2*+\4\2\4\4**\2\u019a\2K\3\2\2\2\4S\3\2\2\2\6W\3\2\2\2\bp\3\2\2\2\nt"+
		"\3\2\2\2\fy\3\2\2\2\16\177\3\2\2\2\20\u0086\3\2\2\2\22\u0092\3\2\2\2\24"+
		"\u0099\3\2\2\2\26\u00a2\3\2\2\2\30\u00b2\3\2\2\2\32\u00b8\3\2\2\2\34\u00c0"+
		"\3\2\2\2\36\u00c2\3\2\2\2 \u00cb\3\2\2\2\"\u00d1\3\2\2\2$\u00d8\3\2\2"+
		"\2&\u00dd\3\2\2\2(\u00e9\3\2\2\2*\u00ef\3\2\2\2,\u00fc\3\2\2\2.\u0105"+
		"\3\2\2\2\60\u0109\3\2\2\2\62\u010b\3\2\2\2\64\u0123\3\2\2\2\66\u0136\3"+
		"\2\2\28\u013c\3\2\2\2:\u014c\3\2\2\2<\u014e\3\2\2\2>\u0153\3\2\2\2@\u015a"+
		"\3\2\2\2B\u0162\3\2\2\2D\u0164\3\2\2\2F\u0166\3\2\2\2H\u0176\3\2\2\2J"+
		"L\5\4\3\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2MO\5\6\4\2NM\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RT\5\b\5\2SR\3\2\2\2TU\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2V\5\3\2\2\2WX\5,\27\2XY\7\7\2\2Y\7\3\2\2\2Z[\5\n\6\2[\\\7"+
		"\5\2\2\\q\3\2\2\2]^\7\f\2\2^_\5\f\7\2_`\7\5\2\2`q\3\2\2\2ab\5\n\6\2bc"+
		"\7\f\2\2cd\5\f\7\2de\7\5\2\2eq\3\2\2\2fh\7\r\2\2gi\5\f\7\2hg\3\2\2\2h"+
		"i\3\2\2\2ij\3\2\2\2jk\7\5\2\2kl\7\33\2\2lm\5\36\20\2mn\7\34\2\2nq\3\2"+
		"\2\2oq\5:\36\2pZ\3\2\2\2p]\3\2\2\2pa\3\2\2\2pf\3\2\2\2po\3\2\2\2q\t\3"+
		"\2\2\2ru\5\16\b\2su\5\20\t\2tr\3\2\2\2ts\3\2\2\2u\13\3\2\2\2vz\5\"\22"+
		"\2wz\5\26\f\2xz\5$\23\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z}\3\2\2\2{|\t\2"+
		"\2\2|~\5\f\7\2}{\3\2\2\2}~\3\2\2\2~\r\3\2\2\2\177\u0082\5,\27\2\u0080"+
		"\u0081\7\n\2\2\u0081\u0083\5\16\b\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7+\2\2\u0085\u0087\5\60\31\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\35"+
		"\2\2\u0089\u008b\5\22\n\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0090\7\36\2\2\u008d\u008e\5\60\31\2\u008e\u008f"+
		"\7+\2\2\u008f\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\21\3\2\2\2\u0092\u0095\5\24\13\2\u0093\u0094\7\t\2\2\u0094\u0096\5\22"+
		"\n\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\23\3\2\2\2\u0097\u009a"+
		"\5$\23\2\u0098\u009a\5,\27\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009f\3\2\2\2\u009b\u009d\7\b\2\2\u009c\u009e\5 \21\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a3\7\13\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a5\5\64\33\2\u00a5"+
		"\u00a6\5\60\31\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\7\35\2\2"+
		"\u00ab\u00ac\5\30\r\2\u00ac\u00b0\7\36\2\2\u00ad\u00ae\5\60\31\2\u00ae"+
		"\u00af\5\64\33\2\u00af\u00b1\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b5\5\32\16\2\u00b3\u00b4\7\t\2\2\u00b4"+
		"\u00b6\5\30\r\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2"+
		"\2\u00b7\u00b9\5> \2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00be"+
		"\3\2\2\2\u00ba\u00bc\7\b\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\t\3\2\2\u00c1\35\3\2\2\2\u00c2\u00c5"+
		"\5\64\33\2\u00c3\u00c4\7\25\2\2\u00c4\u00c6\5\64\33\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00ca\5\62\32\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2"+
		"\2\2\u00cb\u00ce\5\"\22\2\u00cc\u00cd\7\6\2\2\u00cd\u00cf\5 \21\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d2\7\13\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d7"+
		"\58\35\2\u00d4\u00d7\5,\27\2\u00d5\u00d7\5.\30\2\u00d6\u00d3\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7#\3\2\2\2\u00d8\u00d9\5&\24\2"+
		"\u00d9\u00da\7\b\2\2\u00da\u00db\5(\25\2\u00db%\3\2\2\2\u00dc\u00de\7"+
		"\13\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00e1\7\17\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e7\7)\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e5\5\62\32\2\u00e5"+
		"\u00e6\7\32\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\'\3\2\2\2\u00e9\u00ec\5*\26\2\u00ea\u00eb\7\6\2\2\u00eb\u00ed"+
		"\5*\26\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed)\3\2\2\2\u00ee"+
		"\u00f0\7\13\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3"+
		"\2\2\2\u00f1\u00f3\7\17\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f9\7)\2\2\u00f5\u00f6\7\31\2\2\u00f6\u00f7\5\62"+
		"\32\2\u00f7\u00f8\7\32\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa+\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\7)\2\2\u00ff\u0100"+
		"\7\31\2\2\u0100\u0101\5\62\32\2\u0101\u0102\7\32\2\2\u0102\u0104\3\2\2"+
		"\2\u0103\u00ff\3\2\2\2\u0103\u0104\3\2\2\2\u0104-\3\2\2\2\u0105\u0106"+
		"\5\64\33\2\u0106\u0107\5\60\31\2\u0107\u0108\5\64\33\2\u0108/\3\2\2\2"+
		"\u0109\u010a\t\4\2\2\u010a\61\3\2\2\2\u010b\u010e\5\64\33\2\u010c\u010d"+
		"\7\6\2\2\u010d\u010f\5\62\32\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\63\3\2\2\2\u0110\u0111\b\33\1\2\u0111\u0124\7)\2\2\u0112\u0113"+
		"\7)\2\2\u0113\u0115\7\31\2\2\u0114\u0116\5\62\32\2\u0115\u0114\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0124\7\32\2\2\u0118\u0124"+
		"\7+\2\2\u0119\u0124\7,\2\2\u011a\u0124\7*\2\2\u011b\u0124\7\4\2\2\u011c"+
		"\u011d\7\31\2\2\u011d\u011e\5\64\33\2\u011e\u011f\7\32\2\2\u011f\u0124"+
		"\3\2\2\2\u0120\u0124\5\66\34\2\u0121\u0122\7\17\2\2\u0122\u0124\5\64\33"+
		"\7\u0123\u0110\3\2\2\2\u0123\u0112\3\2\2\2\u0123\u0118\3\2\2\2\u0123\u0119"+
		"\3\2\2\2\u0123\u011a\3\2\2\2\u0123\u011b\3\2\2\2\u0123\u011c\3\2\2\2\u0123"+
		"\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0133\3\2\2\2\u0125\u0126\f\6"+
		"\2\2\u0126\u0127\7\22\2\2\u0127\u0132\5\64\33\6\u0128\u0129\f\5\2\2\u0129"+
		"\u012a\t\5\2\2\u012a\u0132\5\64\33\6\u012b\u012c\f\4\2\2\u012c\u012d\t"+
		"\6\2\2\u012d\u0132\5\64\33\5\u012e\u012f\f\3\2\2\u012f\u0130\7\24\2\2"+
		"\u0130\u0132\5\64\33\4\u0131\u0125\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012b"+
		"\3\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\65\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\t\7\2"+
		"\2\u0137\u0138\7\5\2\2\u0138\u0139\7\5\2\2\u0139\u013a\t\7\2\2\u013a\67"+
		"\3\2\2\2\u013b\u013d\7\17\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u013f\7\27\2\2\u013f\u0144\7)\2\2\u0140\u0141"+
		"\7\33\2\2\u0141\u0142\5\62\32\2\u0142\u0143\7\34\2\2\u0143\u0145\3\2\2"+
		"\2\u0144\u0140\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146\u0147"+
		"\7\31\2\2\u0147\u0148\5\62\32\2\u0148\u0149\7\32\2\2\u0149\u014b\3\2\2"+
		"\2\u014a\u0146\3\2\2\2\u014a\u014b\3\2\2\2\u014b9\3\2\2\2\u014c\u014d"+
		"\5<\37\2\u014d;\3\2\2\2\u014e\u014f\7\26\2\2\u014f\u0150\7\3\2\2\u0150"+
		"\u0151\7)\2\2\u0151\u0152\7\5\2\2\u0152=\3\2\2\2\u0153\u0156\5@!\2\u0154"+
		"\u0155\7\6\2\2\u0155\u0157\5> \2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157?\3\2\2\2\u0158\u015b\5B\"\2\u0159\u015b\5D#\2\u015a\u0158\3\2"+
		"\2\2\u015a\u0159\3\2\2\2\u015bA\3\2\2\2\u015c\u0163\7)\2\2\u015d\u0163"+
		"\7,\2\2\u015e\u0160\7\17\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\7+\2\2\u0162\u015c\3\2\2\2\u0162\u015d\3\2"+
		"\2\2\u0162\u015f\3\2\2\2\u0163C\3\2\2\2\u0164\u0165\t\b\2\2\u0165E\3\2"+
		"\2\2\u0166\u0168\7\35\2\2\u0167\u0169\5,\27\2\u0168\u0167\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016e\3\2\2\2\u016a\u016b\7\6\2\2\u016b\u016d\5,"+
		"\27\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\36"+
		"\2\2\u0172G\3\2\2\2\u0173\u0175\5F$\2\u0174\u0173\3\2\2\2\u0175\u0178"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0179\u017a\7\2\2\3\u017aI\3\2\2\2\66KNUhpty}\u0082\u0086"+
		"\u008a\u0090\u0095\u0099\u009d\u009f\u00a2\u00a7\u00b0\u00b5\u00b8\u00bc"+
		"\u00be\u00c5\u00c9\u00ce\u00d1\u00d6\u00dd\u00e0\u00e7\u00ec\u00ef\u00f2"+
		"\u00f9\u00fc\u0103\u010e\u0115\u0123\u0131\u0133\u013c\u0144\u014a\u0156"+
		"\u015a\u015f\u0162\u0168\u016e\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}