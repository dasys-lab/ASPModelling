// Generated from ASPCore2.g4 by ANTLR 4.7.2
package de.unikassel.vs.asp_modelling;
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
		RULE_conditional_literal = 15, RULE_naf_literals = 16, RULE_naf_literal = 17, 
		RULE_classical_literal = 18, RULE_builtin_atom = 19, RULE_binop = 20, 
		RULE_terms = 21, RULE_term = 22, RULE_interval = 23, RULE_external_atom = 24, 
		RULE_directive = 25, RULE_directive_enumeration = 26, RULE_basic_terms = 27, 
		RULE_basic_term = 28, RULE_ground_term = 29, RULE_variable_term = 30, 
		RULE_answer_set = 31, RULE_answer_sets = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "query", "statement", "head", "body", "disjunction", 
			"choice", "choice_elements", "choice_element", "aggregate", "aggregate_elements", 
			"aggregate_element", "aggregate_function", "weight_at_level", "conditional_literal", 
			"naf_literals", "naf_literal", "classical_literal", "builtin_atom", "binop", 
			"terms", "term", "interval", "external_atom", "directive", "directive_enumeration", 
			"basic_terms", "basic_term", "ground_term", "variable_term", "answer_set", 
			"answer_sets"
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(66);
				statements();
				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(69);
				query();
				}
			}

			setState(72);
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
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
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
			setState(79);
			classical_literal();
			setState(80);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Statement_factContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				head();
				setState(83);
				match(DOT);
				}
				break;
			case 2:
				_localctx = new Statement_constraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(CONS);
				setState(86);
				body();
				setState(87);
				match(DOT);
				}
				break;
			case 3:
				_localctx = new Statement_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				head();
				setState(90);
				match(CONS);
				setState(91);
				body();
				setState(92);
				match(DOT);
				}
				break;
			case 4:
				_localctx = new Statement_weightConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(WCONS);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(95);
					body();
					}
				}

				setState(98);
				match(DOT);
				setState(99);
				match(SQUARE_OPEN);
				setState(100);
				weight_at_level();
				setState(101);
				match(SQUARE_CLOSE);
				}
				break;
			case 5:
				_localctx = new Statement_directiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				disjunction();
				}
				break;
			case CURLY_OPEN:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				naf_literal();
				}
				break;
			case 2:
				{
				setState(111);
				aggregate();
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(114);
				match(COMMA);
				setState(115);
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
			setState(118);
			classical_literal();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(119);
				match(OR);
				setState(120);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(123);
				((ChoiceContext)_localctx).lt = match(NUMBER);
				setState(124);
				((ChoiceContext)_localctx).lop = binop();
				}
			}

			setState(127);
			match(CURLY_OPEN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
				{
				setState(128);
				choice_elements();
				}
			}

			setState(131);
			match(CURLY_CLOSE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(132);
				((ChoiceContext)_localctx).uop = binop();
				setState(133);
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
			setState(137);
			choice_element();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(138);
				match(SEMICOLON);
				setState(139);
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
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public Conditional_literalContext conditional_literal() {
			return getRuleContext(Conditional_literalContext.class,0);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(142);
				classical_literal();
				}
				break;
			case 2:
				{
				setState(143);
				conditional_literal();
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(146);
				match(COLON);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(147);
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(152);
				match(NAF);
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
				{
				setState(155);
				((AggregateContext)_localctx).lt = term(0);
				setState(156);
				((AggregateContext)_localctx).lop = binop();
				}
			}

			setState(160);
			aggregate_function();
			setState(161);
			match(CURLY_OPEN);
			setState(162);
			aggregate_elements();
			setState(163);
			match(CURLY_CLOSE);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(164);
				((AggregateContext)_localctx).uop = binop();
				setState(165);
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
			setState(169);
			aggregate_element();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(170);
				match(SEMICOLON);
				setState(171);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
				{
				setState(174);
				basic_terms();
				}
			}

			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(177);
				match(COLON);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(178);
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
			setState(183);
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
			setState(185);
			term(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(186);
				match(AT);
				setState(187);
				term(0);
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(190);
				match(COMMA);
				setState(191);
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

	public static class Conditional_literalContext extends ParserRuleContext {
		public List<Naf_literalContext> naf_literal() {
			return getRuleContexts(Naf_literalContext.class);
		}
		public Naf_literalContext naf_literal(int i) {
			return getRuleContext(Naf_literalContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
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
		enterRule(_localctx, 30, RULE_conditional_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			naf_literal();
			setState(195);
			match(COLON);
			setState(196);
			naf_literal();
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
		enterRule(_localctx, 32, RULE_naf_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			naf_literal();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(199);
				match(COMMA);
				setState(200);
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
		enterRule(_localctx, 34, RULE_naf_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(203);
				match(NAF);
				}
			}

			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(206);
				external_atom();
				}
				break;
			case 2:
				{
				setState(207);
				classical_literal();
				}
				break;
			case 3:
				{
				setState(208);
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
		enterRule(_localctx, 36, RULE_classical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(211);
				match(MINUS);
				}
			}

			setState(214);
			match(ID);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(215);
				match(PAREN_OPEN);
				setState(216);
				terms();
				setState(217);
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
		enterRule(_localctx, 38, RULE_builtin_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			term(0);
			setState(222);
			binop();
			setState(223);
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
		enterRule(_localctx, 40, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		enterRule(_localctx, 42, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			term(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(228);
				match(COMMA);
				setState(229);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new Term_constContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Term_funcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(ID);
				{
				setState(235);
				match(PAREN_OPEN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << QUOTED_STRING))) != 0)) {
					{
					setState(236);
					terms();
					}
				}

				setState(239);
				match(PAREN_CLOSE);
				}
				}
				break;
			case 3:
				{
				_localctx = new Term_numberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new Term_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(QUOTED_STRING);
				}
				break;
			case 5:
				{
				_localctx = new Term_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				_localctx = new Term_anonymousVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(ANONYMOUS_VARIABLE);
				}
				break;
			case 7:
				{
				_localctx = new Term_parenthesisedTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(PAREN_OPEN);
				setState(245);
				term(0);
				setState(246);
				match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				_localctx = new Term_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				interval();
				}
				break;
			case 9:
				{
				_localctx = new Term_minusArithTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(MINUS);
				setState(250);
				term(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Term_powerArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(253);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						match(POWER);
						setState(255);
						term(4);
						}
						break;
					case 2:
						{
						_localctx = new Term_timesdivmodArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(256);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(257);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(258);
						term(4);
						}
						break;
					case 3:
						{
						_localctx = new Term_plusminusArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(259);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(260);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						term(3);
						}
						break;
					case 4:
						{
						_localctx = new Term_bitxorArithTermContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(262);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(263);
						match(BITXOR);
						setState(264);
						term(2);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 46, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
			setState(271);
			match(DOT);
			setState(272);
			match(DOT);
			setState(273);
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
		enterRule(_localctx, 48, RULE_external_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(275);
				match(MINUS);
				}
			}

			setState(278);
			match(AMPERSAND);
			setState(279);
			match(ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN) {
				{
				setState(280);
				match(SQUARE_OPEN);
				setState(281);
				((External_atomContext)_localctx).input = terms();
				setState(282);
				match(SQUARE_CLOSE);
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(286);
				match(PAREN_OPEN);
				setState(287);
				((External_atomContext)_localctx).output = terms();
				setState(288);
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
		enterRule(_localctx, 50, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		enterRule(_localctx, 52, RULE_directive_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SHARP);
			setState(295);
			match(T__0);
			setState(296);
			match(ID);
			setState(297);
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
		enterRule(_localctx, 54, RULE_basic_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			basic_term();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(300);
				match(COMMA);
				setState(301);
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
		enterRule(_localctx, 56, RULE_basic_term);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
			case NUMBER:
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				ground_term();
				}
				break;
			case ANONYMOUS_VARIABLE:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
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
		enterRule(_localctx, 58, RULE_ground_term);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(ID);
				}
				break;
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(QUOTED_STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(310);
					match(MINUS);
					}
				}

				setState(313);
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
		enterRule(_localctx, 60, RULE_variable_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 62, RULE_answer_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(CURLY_OPEN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(319);
				classical_literal();
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(322);
				match(COMMA);
				setState(323);
				classical_literal();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
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
		enterRule(_localctx, 64, RULE_answer_sets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_OPEN) {
				{
				{
				setState(331);
				answer_set();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\5\2I\n\2\3\2\3\2\3\3\6\3N\n\3\r\3\16\3O\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\5\6o\n\6\3\7\3\7\5\7s\n"+
		"\7\3\7\3\7\5\7w\n\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\5\t\u0080\n\t\3\t\3\t"+
		"\5\t\u0084\n\t\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\5\n\u008f\n\n"+
		"\3\13\3\13\5\13\u0093\n\13\3\13\3\13\5\13\u0097\n\13\5\13\u0099\n\13\3"+
		"\f\5\f\u009c\n\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00aa\n\f\3\r\3\r\3\r\5\r\u00af\n\r\3\16\5\16\u00b2\n\16\3\16\3\16"+
		"\5\16\u00b6\n\16\5\16\u00b8\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00bf\n"+
		"\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22"+
		"\u00cc\n\22\3\23\5\23\u00cf\n\23\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\5"+
		"\24\u00d7\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00f0\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00fe\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u010c\n\30\f\30\16\30\u010f\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\5\32\u0117\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011f\n"+
		"\32\3\32\3\32\3\32\3\32\5\32\u0125\n\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\5\35\u0131\n\35\3\36\3\36\5\36\u0135\n\36\3\37\3"+
		"\37\3\37\5\37\u013a\n\37\3\37\5\37\u013d\n\37\3 \3 \3!\3!\5!\u0143\n!"+
		"\3!\3!\7!\u0147\n!\f!\16!\u014a\13!\3!\3!\3\"\7\"\u014f\n\"\f\"\16\"\u0152"+
		"\13\"\3\"\3\"\3\"\2\3.#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@B\2\b\3\2%(\3\2\37$\4\2\20\21\23\23\3\2\16\17\3\2*"+
		"+\4\2\4\4**\2\u016f\2E\3\2\2\2\4M\3\2\2\2\6Q\3\2\2\2\bj\3\2\2\2\nn\3\2"+
		"\2\2\fr\3\2\2\2\16x\3\2\2\2\20\177\3\2\2\2\22\u008b\3\2\2\2\24\u0092\3"+
		"\2\2\2\26\u009b\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1\3\2\2\2\34\u00b9\3\2"+
		"\2\2\36\u00bb\3\2\2\2 \u00c4\3\2\2\2\"\u00c8\3\2\2\2$\u00ce\3\2\2\2&\u00d6"+
		"\3\2\2\2(\u00df\3\2\2\2*\u00e3\3\2\2\2,\u00e5\3\2\2\2.\u00fd\3\2\2\2\60"+
		"\u0110\3\2\2\2\62\u0116\3\2\2\2\64\u0126\3\2\2\2\66\u0128\3\2\2\28\u012d"+
		"\3\2\2\2:\u0134\3\2\2\2<\u013c\3\2\2\2>\u013e\3\2\2\2@\u0140\3\2\2\2B"+
		"\u0150\3\2\2\2DF\5\4\3\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\6\4\2HG\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LN\5\b\5\2ML\3\2\2\2NO\3"+
		"\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QR\5&\24\2RS\7\7\2\2S\7\3\2\2\2T"+
		"U\5\n\6\2UV\7\5\2\2Vk\3\2\2\2WX\7\f\2\2XY\5\f\7\2YZ\7\5\2\2Zk\3\2\2\2"+
		"[\\\5\n\6\2\\]\7\f\2\2]^\5\f\7\2^_\7\5\2\2_k\3\2\2\2`b\7\r\2\2ac\5\f\7"+
		"\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\5\2\2ef\7\33\2\2fg\5\36\20\2gh\7"+
		"\34\2\2hk\3\2\2\2ik\5\64\33\2jT\3\2\2\2jW\3\2\2\2j[\3\2\2\2j`\3\2\2\2"+
		"ji\3\2\2\2k\t\3\2\2\2lo\5\16\b\2mo\5\20\t\2nl\3\2\2\2nm\3\2\2\2o\13\3"+
		"\2\2\2ps\5$\23\2qs\5\26\f\2rp\3\2\2\2rq\3\2\2\2sv\3\2\2\2tu\7\6\2\2uw"+
		"\5\f\7\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2x{\5&\24\2yz\7\n\2\2z|\5\16\b\2"+
		"{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}~\7+\2\2~\u0080\5*\26\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\35\2\2\u0082\u0084"+
		"\5\22\n\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0089\7\36\2\2\u0086\u0087\5*\26\2\u0087\u0088\7+\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b"+
		"\u008e\5\24\13\2\u008c\u008d\7\t\2\2\u008d\u008f\5\22\n\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u0093\5&\24\2\u0091"+
		"\u0093\5 \21\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0098\3\2"+
		"\2\2\u0094\u0096\7\b\2\2\u0095\u0097\5\"\22\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\25\3\2\2\2\u009a\u009c\7\13\2\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009e\5.\30\2\u009e\u009f\5*\26\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\35\2\2\u00a4\u00a5\5\30\r\2\u00a5"+
		"\u00a9\7\36\2\2\u00a6\u00a7\5*\26\2\u00a7\u00a8\5.\30\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\27\3\2\2\2\u00ab"+
		"\u00ae\5\32\16\2\u00ac\u00ad\7\t\2\2\u00ad\u00af\5\30\r\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b2\58\35\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b5\7\b"+
		"\2\2\u00b4\u00b6\5\"\22\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\33\3\2\2"+
		"\2\u00b9\u00ba\t\2\2\2\u00ba\35\3\2\2\2\u00bb\u00be\5.\30\2\u00bc\u00bd"+
		"\7\25\2\2\u00bd\u00bf\5.\30\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c3\5,\27\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\5$\23\2\u00c5"+
		"\u00c6\7\b\2\2\u00c6\u00c7\5$\23\2\u00c7!\3\2\2\2\u00c8\u00cb\5$\23\2"+
		"\u00c9\u00ca\7\6\2\2\u00ca\u00cc\5\"\22\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cf\7\13\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d4\5\62\32\2\u00d1\u00d4\5"+
		"&\24\2\u00d2\u00d4\5(\25\2\u00d3\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d7\7\17\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dd\7)\2\2\u00d9\u00da"+
		"\7\31\2\2\u00da\u00db\5,\27\2\u00db\u00dc\7\32\2\2\u00dc\u00de\3\2\2\2"+
		"\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0\5"+
		".\30\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\5.\30\2\u00e2)\3\2\2\2\u00e3\u00e4"+
		"\t\3\2\2\u00e4+\3\2\2\2\u00e5\u00e8\5.\30\2\u00e6\u00e7\7\6\2\2\u00e7"+
		"\u00e9\5,\27\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2"+
		"\u00ea\u00eb\b\30\1\2\u00eb\u00fe\7)\2\2\u00ec\u00ed\7)\2\2\u00ed\u00ef"+
		"\7\31\2\2\u00ee\u00f0\5,\27\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00fe\7\32\2\2\u00f2\u00fe\7+\2\2\u00f3\u00fe"+
		"\7,\2\2\u00f4\u00fe\7*\2\2\u00f5\u00fe\7\4\2\2\u00f6\u00f7\7\31\2\2\u00f7"+
		"\u00f8\5.\30\2\u00f8\u00f9\7\32\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00fe\5"+
		"\60\31\2\u00fb\u00fc\7\17\2\2\u00fc\u00fe\5.\30\7\u00fd\u00ea\3\2\2\2"+
		"\u00fd\u00ec\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4"+
		"\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u010d\3\2\2\2\u00ff\u0100\f\6\2\2\u0100\u0101\7\22"+
		"\2\2\u0101\u010c\5.\30\6\u0102\u0103\f\5\2\2\u0103\u0104\t\4\2\2\u0104"+
		"\u010c\5.\30\6\u0105\u0106\f\4\2\2\u0106\u0107\t\5\2\2\u0107\u010c\5."+
		"\30\5\u0108\u0109\f\3\2\2\u0109\u010a\7\24\2\2\u010a\u010c\5.\30\4\u010b"+
		"\u00ff\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3\2"+
		"\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"/\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\t\6\2\2\u0111\u0112\7\5\2\2"+
		"\u0112\u0113\7\5\2\2\u0113\u0114\t\6\2\2\u0114\61\3\2\2\2\u0115\u0117"+
		"\7\17\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u0119\7\27\2\2\u0119\u011e\7)\2\2\u011a\u011b\7\33\2\2\u011b\u011c"+
		"\5,\27\2\u011c\u011d\7\34\2\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u0121\7\31\2\2\u0121\u0122"+
		"\5,\27\2\u0122\u0123\7\32\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\63\3\2\2\2\u0126\u0127\5\66\34\2\u0127\65\3"+
		"\2\2\2\u0128\u0129\7\26\2\2\u0129\u012a\7\3\2\2\u012a\u012b\7)\2\2\u012b"+
		"\u012c\7\5\2\2\u012c\67\3\2\2\2\u012d\u0130\5:\36\2\u012e\u012f\7\6\2"+
		"\2\u012f\u0131\58\35\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u01319"+
		"\3\2\2\2\u0132\u0135\5<\37\2\u0133\u0135\5> \2\u0134\u0132\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135;\3\2\2\2\u0136\u013d\7)\2\2\u0137\u013d\7,\2\2\u0138"+
		"\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u013d\7+\2\2\u013c\u0136\3\2\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013d=\3\2\2\2\u013e\u013f\t\7\2\2\u013f?\3\2\2\2\u0140"+
		"\u0142\7\35\2\2\u0141\u0143\5&\24\2\u0142\u0141\3\2\2\2\u0142\u0143\3"+
		"\2\2\2\u0143\u0148\3\2\2\2\u0144\u0145\7\6\2\2\u0145\u0147\5&\24\2\u0146"+
		"\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\36\2\2\u014c"+
		"A\3\2\2\2\u014d\u014f\5@!\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0154\7\2\2\3\u0154C\3\2\2\2/EHObjnrv{\177\u0083\u0089\u008e"+
		"\u0092\u0096\u0098\u009b\u00a0\u00a9\u00ae\u00b1\u00b5\u00b7\u00be\u00c2"+
		"\u00cb\u00ce\u00d3\u00d6\u00dd\u00e8\u00ef\u00fd\u010b\u010d\u0116\u011e"+
		"\u0124\u0130\u0134\u0139\u013c\u0142\u0148\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}