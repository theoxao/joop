package com.theoxao.antlr.autogen;
// Generated from Java8Parser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	public static final int
			ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8,
			CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15,
			ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23,
			IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29,
			NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36,
			SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42,
			THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49,
			WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53,
			CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58,
			LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65,
			ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73,
			LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82,
			MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90,
			ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95,
			OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100,
			URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106,
			LINE_COMMENT=107;
	public static final int
			RULE_literal = 0, RULE_primitiveType = 1, RULE_numericType = 2, RULE_integralType = 3,
			RULE_floatingPointType = 4, RULE_referenceType = 5, RULE_classOrInterfaceType = 6,
			RULE_classType = 7, RULE_classType_lf_classOrInterfaceType = 8, RULE_classType_lfno_classOrInterfaceType = 9,
			RULE_interfaceType = 10, RULE_interfaceType_lf_classOrInterfaceType = 11,
			RULE_interfaceType_lfno_classOrInterfaceType = 12, RULE_typeVariable = 13,
			RULE_arrayType = 14, RULE_dims = 15, RULE_typeParameter = 16, RULE_typeParameterModifier = 17,
			RULE_typeBound = 18, RULE_additionalBound = 19, RULE_typeArguments = 20,
			RULE_typeArgumentList = 21, RULE_typeArgument = 22, RULE_wildcard = 23,
			RULE_wildcardBounds = 24, RULE_packageName = 25, RULE_typeName = 26, RULE_packageOrTypeName = 27,
			RULE_expressionName = 28, RULE_methodName = 29, RULE_ambiguousName = 30,
			RULE_compilationUnit = 31, RULE_packageDeclaration = 32, RULE_packageModifier = 33,
			RULE_importDeclaration = 34, RULE_singleTypeImportDeclaration = 35, RULE_typeImportOnDemandDeclaration = 36,
			RULE_typeDeclaration = 37, RULE_classDeclaration = 38, RULE_normalClassDeclaration = 39,
			RULE_classModifier = 40, RULE_typeParameters = 41, RULE_typeParameterList = 42,
			RULE_superclass = 43, RULE_classBody = 44, RULE_classBodyDeclaration = 45,
			RULE_classMemberDeclaration = 46, RULE_fieldDeclaration = 47, RULE_fieldModifier = 48,
			RULE_variableDeclaratorList = 49, RULE_variableDeclarator = 50, RULE_variableDeclaratorId = 51,
			RULE_variableInitializer = 52, RULE_unannType = 53, RULE_unannPrimitiveType = 54,
			RULE_unannReferenceType = 55, RULE_unannClassOrInterfaceType = 56, RULE_unannClassType_lf_unannClassOrInterfaceType = 57,
			RULE_unannClassType_lfno_unannClassOrInterfaceType = 58, RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 59,
			RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 60, RULE_unannTypeVariable = 61,
			RULE_unannArrayType = 62, RULE_methodDeclaration = 63, RULE_methodModifier = 64,
			RULE_methodHeader = 65, RULE_result = 66, RULE_methodDeclarator = 67,
			RULE_formalParameterList = 68, RULE_formalParameters = 69, RULE_formalParameter = 70,
			RULE_variableModifier = 71, RULE_lastFormalParameter = 72, RULE_receiverParameter = 73,
			RULE_throws_ = 74, RULE_exceptionTypeList = 75, RULE_exceptionType = 76,
			RULE_methodBody = 77, RULE_constructorDeclaration = 78, RULE_constructorModifier = 79,
			RULE_constructorDeclarator = 80, RULE_simpleTypeName = 81, RULE_constructorBody = 82,
			RULE_explicitConstructorInvocation = 83, RULE_annotation = 84, RULE_normalAnnotation = 85,
			RULE_elementValuePairList = 86, RULE_elementValuePair = 87, RULE_elementValue = 88,
			RULE_elementValueArrayInitializer = 89, RULE_elementValueList = 90, RULE_markerAnnotation = 91,
			RULE_singleElementAnnotation = 92, RULE_arrayInitializer = 93, RULE_variableInitializerList = 94,
			RULE_block = 95, RULE_blockStatements = 96, RULE_blockStatement = 97,
			RULE_localVariableDeclarationStatement = 98, RULE_localVariableDeclaration = 99,
			RULE_statement = 100, RULE_statementNoShortIf = 101, RULE_statementWithoutTrailingSubstatement = 102,
			RULE_emptyStatement = 103, RULE_labeledStatement = 104, RULE_labeledStatementNoShortIf = 105,
			RULE_expressionStatement = 106, RULE_statementExpression = 107, RULE_returnStatement = 108,
			RULE_primary = 109, RULE_primaryNoNewArray_lfno_arrayAccess = 110, RULE_primaryNoNewArray_lf_primary = 111,
			RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 112, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 113,
			RULE_primaryNoNewArray_lfno_primary = 114, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 115,
			RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 116,
			RULE_classInstanceCreationExpression = 117, RULE_classInstanceCreationExpression_lf_primary = 118,
			RULE_classInstanceCreationExpression_lfno_primary = 119, RULE_typeArgumentsOrDiamond = 120,
			RULE_fieldAccess = 121, RULE_fieldAccess_lf_primary = 122, RULE_fieldAccess_lfno_primary = 123,
			RULE_arrayAccess = 124, RULE_arrayAccess_lf_primary = 125, RULE_arrayAccess_lfno_primary = 126,
			RULE_methodInvocation = 127, RULE_methodInvocation_lf_primary = 128, RULE_methodInvocation_lfno_primary = 129,
			RULE_argumentList = 130, RULE_methodReference = 131, RULE_methodReference_lf_primary = 132,
			RULE_methodReference_lfno_primary = 133, RULE_arrayCreationExpression = 134,
			RULE_dimExprs = 135, RULE_dimExpr = 136, RULE_expression = 137, RULE_lambdaExpression = 138,
			RULE_lambdaParameters = 139, RULE_inferredFormalParameterList = 140, RULE_lambdaBody = 141,
			RULE_assignmentExpression = 142, RULE_assignment = 143, RULE_leftHandSide = 144,
			RULE_assignmentOperator = 145, RULE_conditionalExpression = 146, RULE_conditionalOrExpression = 147,
			RULE_conditionalAndExpression = 148, RULE_inclusiveOrExpression = 149,
			RULE_exclusiveOrExpression = 150, RULE_andExpression = 151, RULE_equalityExpression = 152,
			RULE_relationalExpression = 153, RULE_shiftExpression = 154, RULE_additiveExpression = 155,
			RULE_multiplicativeExpression = 156, RULE_unaryExpression = 157, RULE_unaryExpressionNotPlusMinus = 158,
			RULE_postfixExpression = 159, RULE_castExpression = 160;
	public static final String[] ruleNames = {
			"literal", "primitiveType", "numericType", "integralType", "floatingPointType",
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType",
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType",
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType",
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound",
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds",
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName",
			"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier",
			"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration",
			"typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier",
			"typeParameters", "typeParameterList", "superclass", "classBody", "classBodyDeclaration",
			"classMemberDeclaration", "fieldDeclaration", "fieldModifier", "variableDeclaratorList",
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", "unannType",
			"unannPrimitiveType", "unannReferenceType", "unannClassOrInterfaceType",
			"unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType",
			"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType",
			"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier",
			"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters",
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter",
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "constructorDeclaration",
			"constructorModifier", "constructorDeclarator", "simpleTypeName", "constructorBody",
			"explicitConstructorInvocation", "annotation", "normalAnnotation", "elementValuePairList",
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "elementValueList",
			"markerAnnotation", "singleElementAnnotation", "arrayInitializer", "variableInitializerList",
			"block", "blockStatements", "blockStatement", "localVariableDeclarationStatement",
			"localVariableDeclaration", "statement", "statementNoShortIf", "statementWithoutTrailingSubstatement",
			"emptyStatement", "labeledStatement", "labeledStatementNoShortIf", "expressionStatement",
			"statementExpression", "returnStatement", "primary", "primaryNoNewArray_lfno_arrayAccess",
			"primaryNoNewArray_lf_primary", "primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary",
			"primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", "primaryNoNewArray_lfno_primary",
			"primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", "primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary",
			"classInstanceCreationExpression", "classInstanceCreationExpression_lf_primary",
			"classInstanceCreationExpression_lfno_primary", "typeArgumentsOrDiamond",
			"fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", "arrayAccess",
			"arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation",
			"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList",
			"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary",
			"arrayCreationExpression", "dimExprs", "dimExpr", "expression", "lambdaExpression",
			"lambdaParameters", "inferredFormalParameterList", "lambdaBody", "assignmentExpression",
			"assignment", "leftHandSide", "assignmentOperator", "conditionalExpression",
			"conditionalOrExpression", "conditionalAndExpression", "inclusiveOrExpression",
			"exclusiveOrExpression", "andExpression", "equalityExpression", "relationalExpression",
			"shiftExpression", "additiveExpression", "multiplicativeExpression", "unaryExpression",
			"unaryExpressionNotPlusMinus", "postfixExpression", "castExpression"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3m\u07ff\4\2\t\2\4"+
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
					"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
					"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
					"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
					"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
					"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
					"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
					"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
					"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
					"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
					"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
					"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
					"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
					"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\3\2\3\2\3\3\7\3\u0148\n\3\f\3"+
					"\16\3\u014b\13\3\3\3\3\3\7\3\u014f\n\3\f\3\16\3\u0152\13\3\3\3\5\3\u0155"+
					"\n\3\3\4\3\4\5\4\u0159\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7\u0162\n\7\3"+
					"\b\3\b\5\b\u0166\n\b\3\b\3\b\7\b\u016a\n\b\f\b\16\b\u016d\13\b\3\t\7\t"+
					"\u0170\n\t\f\t\16\t\u0173\13\t\3\t\3\t\5\t\u0177\n\t\3\t\3\t\3\t\7\t\u017c"+
					"\n\t\f\t\16\t\u017f\13\t\3\t\3\t\5\t\u0183\n\t\5\t\u0185\n\t\3\n\3\n\7"+
					"\n\u0189\n\n\f\n\16\n\u018c\13\n\3\n\3\n\5\n\u0190\n\n\3\13\7\13\u0193"+
					"\n\13\f\13\16\13\u0196\13\13\3\13\3\13\5\13\u019a\n\13\3\f\3\f\3\r\3\r"+
					"\3\16\3\16\3\17\7\17\u01a3\n\17\f\17\16\17\u01a6\13\17\3\17\3\17\3\20"+
					"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01b3\n\20\3\21\7\21\u01b6"+
					"\n\21\f\21\16\21\u01b9\13\21\3\21\3\21\3\21\7\21\u01be\n\21\f\21\16\21"+
					"\u01c1\13\21\3\21\3\21\7\21\u01c5\n\21\f\21\16\21\u01c8\13\21\3\22\7\22"+
					"\u01cb\n\22\f\22\16\22\u01ce\13\22\3\22\3\22\5\22\u01d2\n\22\3\23\3\23"+
					"\3\24\3\24\3\24\3\24\3\24\7\24\u01db\n\24\f\24\16\24\u01de\13\24\5\24"+
					"\u01e0\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u01ec"+
					"\n\27\f\27\16\27\u01ef\13\27\3\30\3\30\5\30\u01f3\n\30\3\31\7\31\u01f6"+
					"\n\31\f\31\16\31\u01f9\13\31\3\31\3\31\5\31\u01fd\n\31\3\32\3\32\3\32"+
					"\3\32\5\32\u0203\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u020b\n\33\f"+
					"\33\16\33\u020e\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u0215\n\34\3\35\3"+
					"\35\3\35\3\35\3\35\3\35\7\35\u021d\n\35\f\35\16\35\u0220\13\35\3\36\3"+
					"\36\3\36\3\36\3\36\5\36\u0227\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u0231"+
					"\n \f \16 \u0234\13 \3!\5!\u0237\n!\3!\7!\u023a\n!\f!\16!\u023d\13!\3"+
					"!\7!\u0240\n!\f!\16!\u0243\13!\3!\3!\3\"\7\"\u0248\n\"\f\"\16\"\u024b"+
					"\13\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\5$\u0255\n$\3%\3%\3%\3%\3&\3&\3&\3&"+
					"\3&\3&\3\'\3\'\5\'\u0263\n\'\3(\3(\3)\7)\u0268\n)\f)\16)\u026b\13)\3)"+
					"\3)\3)\5)\u0270\n)\3)\5)\u0273\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u027f"+
					"\n*\3+\3+\3+\3+\3,\3,\3,\7,\u0288\n,\f,\16,\u028b\13,\3-\3-\3-\3.\3.\7"+
					".\u0292\n.\f.\16.\u0295\13.\3.\3.\3/\3/\5/\u029b\n/\3\60\3\60\3\60\3\60"+
					"\5\60\u02a1\n\60\3\61\7\61\u02a4\n\61\f\61\16\61\u02a7\13\61\3\61\3\61"+
					"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02b5\n\62\3\63"+
					"\3\63\3\63\7\63\u02ba\n\63\f\63\16\63\u02bd\13\63\3\64\3\64\3\64\5\64"+
					"\u02c2\n\64\3\65\3\65\5\65\u02c6\n\65\3\66\3\66\5\66\u02ca\n\66\3\67\3"+
					"\67\5\67\u02ce\n\67\38\38\58\u02d2\n8\39\39\39\59\u02d7\n9\3:\3:\5:\u02db"+
					"\n:\3:\3:\7:\u02df\n:\f:\16:\u02e2\13:\3;\3;\7;\u02e6\n;\f;\16;\u02e9"+
					"\13;\3;\3;\5;\u02ed\n;\3<\3<\5<\u02f1\n<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3"+
					"@\3@\3@\3@\3@\3@\5@\u0302\n@\3A\7A\u0305\nA\fA\16A\u0308\13A\3A\3A\3A"+
					"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0317\nB\3C\3C\3C\5C\u031c\nC\3C\3C"+
					"\7C\u0320\nC\fC\16C\u0323\13C\3C\3C\3C\5C\u0328\nC\5C\u032a\nC\3D\3D\5"+
					"D\u032e\nD\3E\3E\3E\5E\u0333\nE\3E\3E\5E\u0337\nE\3F\3F\3F\3F\3F\3F\5"+
					"F\u033f\nF\3G\3G\3G\7G\u0344\nG\fG\16G\u0347\13G\3G\3G\3G\7G\u034c\nG"+
					"\fG\16G\u034f\13G\5G\u0351\nG\3H\7H\u0354\nH\fH\16H\u0357\13H\3H\3H\3"+
					"H\3I\3I\5I\u035e\nI\3J\7J\u0361\nJ\fJ\16J\u0364\13J\3J\3J\7J\u0368\nJ"+
					"\fJ\16J\u036b\13J\3J\3J\3J\3J\5J\u0371\nJ\3K\7K\u0374\nK\fK\16K\u0377"+
					"\13K\3K\3K\3K\5K\u037c\nK\3K\3K\3L\3L\3L\3M\3M\3M\7M\u0386\nM\fM\16M\u0389"+
					"\13M\3N\3N\5N\u038d\nN\3O\3O\5O\u0391\nO\3P\7P\u0394\nP\fP\16P\u0397\13"+
					"P\3P\3P\5P\u039b\nP\3P\3P\3Q\3Q\3Q\3Q\5Q\u03a3\nQ\3R\5R\u03a6\nR\3R\3"+
					"R\3R\5R\u03ab\nR\3R\3R\3S\3S\3T\3T\5T\u03b3\nT\3T\5T\u03b6\nT\3T\3T\3"+
					"U\5U\u03bb\nU\3U\3U\3U\5U\u03c0\nU\3U\3U\3U\5U\u03c5\nU\3U\3U\3U\5U\u03ca"+
					"\nU\3U\3U\3U\3U\3U\5U\u03d1\nU\3U\3U\3U\5U\u03d6\nU\3U\3U\3U\3U\3U\3U"+
					"\5U\u03de\nU\3U\3U\3U\5U\u03e3\nU\3U\3U\3U\5U\u03e8\nU\3V\3V\3V\5V\u03ed"+
					"\nV\3W\3W\3W\3W\5W\u03f3\nW\3W\3W\3X\3X\3X\7X\u03fa\nX\fX\16X\u03fd\13"+
					"X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u0406\nZ\3[\3[\5[\u040a\n[\3[\5[\u040d\n[\3"+
					"[\3[\3\\\3\\\3\\\7\\\u0414\n\\\f\\\16\\\u0417\13\\\3]\3]\3]\3^\3^\3^\3"+
					"^\3^\3^\3_\3_\5_\u0424\n_\3_\5_\u0427\n_\3_\3_\3`\3`\3`\7`\u042e\n`\f"+
					"`\16`\u0431\13`\3a\3a\5a\u0435\na\3a\3a\3b\6b\u043a\nb\rb\16b\u043b\3"+
					"c\3c\3c\5c\u0441\nc\3d\3d\3d\3e\7e\u0447\ne\fe\16e\u044a\13e\3e\3e\3e"+
					"\3f\3f\5f\u0451\nf\3g\3g\5g\u0455\ng\3h\3h\3h\3h\5h\u045b\nh\3i\3i\3j"+
					"\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3m\3m\3m\5m\u046d\nm\3n\3n\5n\u0471\nn"+
					"\3n\3n\3o\3o\5o\u0477\no\3o\7o\u047a\no\fo\16o\u047d\13o\3p\3p\3p\3p\7"+
					"p\u0483\np\fp\16p\u0486\13p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p"+
					"\3p\3p\3p\3p\3p\5p\u049b\np\3q\3q\3q\3q\3q\5q\u04a2\nq\3r\3r\3s\3s\3s"+
					"\3s\5s\u04aa\ns\3t\3t\3t\3t\7t\u04b0\nt\ft\16t\u04b3\13t\3t\3t\3t\3t\3"+
					"t\3t\7t\u04bb\nt\ft\16t\u04be\13t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t"+
					"\3t\3t\3t\3t\3t\3t\3t\3t\5t\u04d4\nt\3u\3u\3v\3v\3v\3v\7v\u04dc\nv\fv"+
					"\16v\u04df\13v\3v\3v\3v\3v\3v\3v\7v\u04e7\nv\fv\16v\u04ea\13v\3v\3v\3"+
					"v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\3v\5v\u04ff\nv\3w\3w\5"+
					"w\u0503\nw\3w\7w\u0506\nw\fw\16w\u0509\13w\3w\3w\3w\7w\u050e\nw\fw\16"+
					"w\u0511\13w\3w\7w\u0514\nw\fw\16w\u0517\13w\3w\5w\u051a\nw\3w\3w\5w\u051e"+
					"\nw\3w\3w\5w\u0522\nw\3w\3w\3w\3w\5w\u0528\nw\3w\7w\u052b\nw\fw\16w\u052e"+
					"\13w\3w\3w\5w\u0532\nw\3w\3w\5w\u0536\nw\3w\3w\5w\u053a\nw\3w\3w\3w\3"+
					"w\5w\u0540\nw\3w\7w\u0543\nw\fw\16w\u0546\13w\3w\3w\5w\u054a\nw\3w\3w"+
					"\5w\u054e\nw\3w\3w\5w\u0552\nw\5w\u0554\nw\3x\3x\3x\5x\u0559\nx\3x\7x"+
					"\u055c\nx\fx\16x\u055f\13x\3x\3x\5x\u0563\nx\3x\3x\5x\u0567\nx\3x\3x\5"+
					"x\u056b\nx\3y\3y\5y\u056f\ny\3y\7y\u0572\ny\fy\16y\u0575\13y\3y\3y\3y"+
					"\7y\u057a\ny\fy\16y\u057d\13y\3y\7y\u0580\ny\fy\16y\u0583\13y\3y\5y\u0586"+
					"\ny\3y\3y\5y\u058a\ny\3y\3y\5y\u058e\ny\3y\3y\3y\3y\5y\u0594\ny\3y\7y"+
					"\u0597\ny\fy\16y\u059a\13y\3y\3y\5y\u059e\ny\3y\3y\5y\u05a2\ny\3y\3y\5"+
					"y\u05a6\ny\5y\u05a8\ny\3z\3z\3z\5z\u05ad\nz\3{\3{\3{\3{\3{\3{\3{\3{\3"+
					"{\3{\3{\3{\3{\5{\u05bc\n{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u05ca"+
					"\n}\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\5~\u05d6\n~\3\177\3\177\3\177\3\177"+
					"\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u05e2\n\177\f\177\16\177\u05e5"+
					"\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
					"\3\u0080\3\u0080\5\u0080\u05f1\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
					"\3\u0080\7\u0080\u05f8\n\u0080\f\u0080\16\u0080\u05fb\13\u0080\3\u0081"+
					"\3\u0081\3\u0081\5\u0081\u0600\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
					"\3\u0081\5\u0081\u0607\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u060c\n"+
					"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0613\n\u0081\3"+
					"\u0081\3\u0081\3\u0081\5\u0081\u0618\n\u0081\3\u0081\3\u0081\3\u0081\3"+
					"\u0081\3\u0081\5\u0081\u061f\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0624"+
					"\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u062b\n\u0081"+
					"\3\u0081\3\u0081\3\u0081\5\u0081\u0630\n\u0081\3\u0081\3\u0081\3\u0081"+
					"\3\u0081\3\u0081\3\u0081\5\u0081\u0638\n\u0081\3\u0081\3\u0081\3\u0081"+
					"\5\u0081\u063d\n\u0081\3\u0081\3\u0081\5\u0081\u0641\n\u0081\3\u0082\3"+
					"\u0082\5\u0082\u0645\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u064a\n\u0082"+
					"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u0651\n\u0083\3\u0083"+
					"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0658\n\u0083\3\u0083\3\u0083"+
					"\3\u0083\5\u0083\u065d\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
					"\5\u0083\u0664\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0669\n\u0083\3"+
					"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0670\n\u0083\3\u0083\3"+
					"\u0083\3\u0083\5\u0083\u0675\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3"+
					"\u0083\3\u0083\5\u0083\u067d\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0682"+
					"\n\u0083\3\u0083\3\u0083\5\u0083\u0686\n\u0083\3\u0084\3\u0084\3\u0084"+
					"\7\u0084\u068b\n\u0084\f\u0084\16\u0084\u068e\13\u0084\3\u0085\3\u0085"+
					"\3\u0085\5\u0085\u0693\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
					"\5\u0085\u069a\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
					"\u06a1\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06a8\n"+
					"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06b0\n"+
					"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06b7\n\u0085\3"+
					"\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u06bf\n\u0085\3"+
					"\u0086\3\u0086\5\u0086\u06c3\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3"+
					"\u0087\5\u0087\u06ca\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5"+
					"\u0087\u06d1\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06d8"+
					"\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06e0"+
					"\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06e7\n\u0087"+
					"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06ef\n\u0087"+
					"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06f5\n\u0088\3\u0088\3\u0088"+
					"\3\u0088\3\u0088\5\u0088\u06fb\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
					"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0707\n\u0088"+
					"\3\u0089\3\u0089\7\u0089\u070b\n\u0089\f\u0089\16\u0089\u070e\13\u0089"+
					"\3\u008a\7\u008a\u0711\n\u008a\f\u008a\16\u008a\u0714\13\u008a\3\u008a"+
					"\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u071c\n\u008b\3\u008c"+
					"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0725\n\u008d"+
					"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u072c\n\u008d\3\u008e"+
					"\3\u008e\3\u008e\7\u008e\u0731\n\u008e\f\u008e\16\u008e\u0734\13\u008e"+
					"\3\u008f\3\u008f\5\u008f\u0738\n\u008f\3\u0090\3\u0090\5\u0090\u073c\n"+
					"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\5\u0092"+
					"\u0745\n\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
					"\3\u0094\3\u0094\5\u0094\u0750\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
					"\3\u0095\3\u0095\7\u0095\u0758\n\u0095\f\u0095\16\u0095\u075b\13\u0095"+
					"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u0763\n\u0096"+
					"\f\u0096\16\u0096\u0766\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
					"\3\u0097\7\u0097\u076e\n\u0097\f\u0097\16\u0097\u0771\13\u0097\3\u0098"+
					"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u0779\n\u0098\f\u0098"+
					"\16\u0098\u077c\13\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
					"\7\u0099\u0784\n\u0099\f\u0099\16\u0099\u0787\13\u0099\3\u009a\3\u009a"+
					"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0792"+
					"\n\u009a\f\u009a\16\u009a\u0795\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b"+
					"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
					"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u07a9\n\u009b\f\u009b"+
					"\16\u009b\u07ac\13\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
					"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u07b9\n\u009d\f\u009d"+
					"\16\u009d\u07bc\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
					"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u07ca\n\u009e"+
					"\f\u009e\16\u009e\u07cd\13\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
					"\5\u009f\u07d4\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
					"\5\u00a0\u07dc\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u07e0\n\u00a1\3\u00a2\3"+
					"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u07ea\n"+
					"\u00a2\f\u00a2\16\u00a2\u07ed\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
					"\3\u00a2\3\u00a2\7\u00a2\u07f5\n\u00a2\f\u00a2\16\u00a2\u07f8\13\u00a2"+
					"\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u07fd\n\u00a2\3\u00a2\2\16\648>\u0128"+
					"\u012a\u012c\u012e\u0130\u0132\u0134\u0138\u013a\u00a3\2\4\6\b\n\f\16"+
					"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
					"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
					"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
					"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
					"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
					"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
					"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
					"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
					"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
					"\u013c\u013e\u0140\u0142\2\7\3\2\65:\7\2\7\7\n\n\35\35\37\37\'\'\4\2\20"+
					"\20\26\26\4\2\23\23\32\32\4\2DD]g\u08ba\2\u0144\3\2\2\2\4\u0154\3\2\2"+
					"\2\6\u0158\3\2\2\2\b\u015a\3\2\2\2\n\u015c\3\2\2\2\f\u0161\3\2\2\2\16"+
					"\u0165\3\2\2\2\20\u0184\3\2\2\2\22\u0186\3\2\2\2\24\u0194\3\2\2\2\26\u019b"+
					"\3\2\2\2\30\u019d\3\2\2\2\32\u019f\3\2\2\2\34\u01a4\3\2\2\2\36\u01b2\3"+
					"\2\2\2 \u01b7\3\2\2\2\"\u01cc\3\2\2\2$\u01d3\3\2\2\2&\u01df\3\2\2\2(\u01e1"+
					"\3\2\2\2*\u01e4\3\2\2\2,\u01e8\3\2\2\2.\u01f2\3\2\2\2\60\u01f7\3\2\2\2"+
					"\62\u0202\3\2\2\2\64\u0204\3\2\2\2\66\u0214\3\2\2\28\u0216\3\2\2\2:\u0226"+
					"\3\2\2\2<\u0228\3\2\2\2>\u022a\3\2\2\2@\u0236\3\2\2\2B\u0249\3\2\2\2D"+
					"\u0250\3\2\2\2F\u0254\3\2\2\2H\u0256\3\2\2\2J\u025a\3\2\2\2L\u0262\3\2"+
					"\2\2N\u0264\3\2\2\2P\u0269\3\2\2\2R\u027e\3\2\2\2T\u0280\3\2\2\2V\u0284"+
					"\3\2\2\2X\u028c\3\2\2\2Z\u028f\3\2\2\2\\\u029a\3\2\2\2^\u02a0\3\2\2\2"+
					"`\u02a5\3\2\2\2b\u02b4\3\2\2\2d\u02b6\3\2\2\2f\u02be\3\2\2\2h\u02c3\3"+
					"\2\2\2j\u02c9\3\2\2\2l\u02cd\3\2\2\2n\u02d1\3\2\2\2p\u02d6\3\2\2\2r\u02da"+
					"\3\2\2\2t\u02e3\3\2\2\2v\u02ee\3\2\2\2x\u02f2\3\2\2\2z\u02f4\3\2\2\2|"+
					"\u02f6\3\2\2\2~\u0301\3\2\2\2\u0080\u0306\3\2\2\2\u0082\u0316\3\2\2\2"+
					"\u0084\u0329\3\2\2\2\u0086\u032d\3\2\2\2\u0088\u032f\3\2\2\2\u008a\u033e"+
					"\3\2\2\2\u008c\u0350\3\2\2\2\u008e\u0355\3\2\2\2\u0090\u035d\3\2\2\2\u0092"+
					"\u0370\3\2\2\2\u0094\u0375\3\2\2\2\u0096\u037f\3\2\2\2\u0098\u0382\3\2"+
					"\2\2\u009a\u038c\3\2\2\2\u009c\u0390\3\2\2\2\u009e\u0395\3\2\2\2\u00a0"+
					"\u03a2\3\2\2\2\u00a2\u03a5\3\2\2\2\u00a4\u03ae\3\2\2\2\u00a6\u03b0\3\2"+
					"\2\2\u00a8\u03e7\3\2\2\2\u00aa\u03ec\3\2\2\2\u00ac\u03ee\3\2\2\2\u00ae"+
					"\u03f6\3\2\2\2\u00b0\u03fe\3\2\2\2\u00b2\u0405\3\2\2\2\u00b4\u0407\3\2"+
					"\2\2\u00b6\u0410\3\2\2\2\u00b8\u0418\3\2\2\2\u00ba\u041b\3\2\2\2\u00bc"+
					"\u0421\3\2\2\2\u00be\u042a\3\2\2\2\u00c0\u0432\3\2\2\2\u00c2\u0439\3\2"+
					"\2\2\u00c4\u0440\3\2\2\2\u00c6\u0442\3\2\2\2\u00c8\u0448\3\2\2\2\u00ca"+
					"\u0450\3\2\2\2\u00cc\u0454\3\2\2\2\u00ce\u045a\3\2\2\2\u00d0\u045c\3\2"+
					"\2\2\u00d2\u045e\3\2\2\2\u00d4\u0462\3\2\2\2\u00d6\u0466\3\2\2\2\u00d8"+
					"\u046c\3\2\2\2\u00da\u046e\3\2\2\2\u00dc\u0476\3\2\2\2\u00de\u049a\3\2"+
					"\2\2\u00e0\u04a1\3\2\2\2\u00e2\u04a3\3\2\2\2\u00e4\u04a9\3\2\2\2\u00e6"+
					"\u04d3\3\2\2\2\u00e8\u04d5\3\2\2\2\u00ea\u04fe\3\2\2\2\u00ec\u0553\3\2"+
					"\2\2\u00ee\u0555\3\2\2\2\u00f0\u05a7\3\2\2\2\u00f2\u05ac\3\2\2\2\u00f4"+
					"\u05bb\3\2\2\2\u00f6\u05bd\3\2\2\2\u00f8\u05c9\3\2\2\2\u00fa\u05d5\3\2"+
					"\2\2\u00fc\u05d7\3\2\2\2\u00fe\u05f0\3\2\2\2\u0100\u0640\3\2\2\2\u0102"+
					"\u0642\3\2\2\2\u0104\u0685\3\2\2\2\u0106\u0687\3\2\2\2\u0108\u06be\3\2"+
					"\2\2\u010a\u06c0\3\2\2\2\u010c\u06ee\3\2\2\2\u010e\u0706\3\2\2\2\u0110"+
					"\u0708\3\2\2\2\u0112\u0712\3\2\2\2\u0114\u071b\3\2\2\2\u0116\u071d\3\2"+
					"\2\2\u0118\u072b\3\2\2\2\u011a\u072d\3\2\2\2\u011c\u0737\3\2\2\2\u011e"+
					"\u073b\3\2\2\2\u0120\u073d\3\2\2\2\u0122\u0744\3\2\2\2\u0124\u0746\3\2"+
					"\2\2\u0126\u074f\3\2\2\2\u0128\u0751\3\2\2\2\u012a\u075c\3\2\2\2\u012c"+
					"\u0767\3\2\2\2\u012e\u0772\3\2\2\2\u0130\u077d\3\2\2\2\u0132\u0788\3\2"+
					"\2\2\u0134\u0796\3\2\2\2\u0136\u07ad\3\2\2\2\u0138\u07af\3\2\2\2\u013a"+
					"\u07bd\3\2\2\2\u013c\u07d3\3\2\2\2\u013e\u07db\3\2\2\2\u0140\u07df\3\2"+
					"\2\2\u0142\u07fc\3\2\2\2\u0144\u0145\t\2\2\2\u0145\3\3\2\2\2\u0146\u0148"+
					"\5\u00aaV\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2"+
					"\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0155"+
					"\5\6\4\2\u014d\u014f\5\u00aaV\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2"+
					"\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150"+
					"\3\2\2\2\u0153\u0155\7\5\2\2\u0154\u0149\3\2\2\2\u0154\u0150\3\2\2\2\u0155"+
					"\5\3\2\2\2\u0156\u0159\5\b\5\2\u0157\u0159\5\n\6\2\u0158\u0156\3\2\2\2"+
					"\u0158\u0157\3\2\2\2\u0159\7\3\2\2\2\u015a\u015b\t\3\2\2\u015b\t\3\2\2"+
					"\2\u015c\u015d\t\4\2\2\u015d\13\3\2\2\2\u015e\u0162\5\16\b\2\u015f\u0162"+
					"\5\34\17\2\u0160\u0162\5\36\20\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2"+
					"\2\u0161\u0160\3\2\2\2\u0162\r\3\2\2\2\u0163\u0166\5\24\13\2\u0164\u0166"+
					"\5\32\16\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u016b\3\2\2\2"+
					"\u0167\u016a\5\22\n\2\u0168\u016a\5\30\r\2\u0169\u0167\3\2\2\2\u0169\u0168"+
					"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
					"\17\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5\u00aaV\2\u016f\u016e\3\2"+
					"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
					"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0176\7h\2\2\u0175\u0177\5*\26"+
					"\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0185\3\2\2\2\u0178\u0179"+
					"\5\16\b\2\u0179\u017d\7C\2\2\u017a\u017c\5\u00aaV\2\u017b\u017a\3\2\2"+
					"\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180"+
					"\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7h\2\2\u0181\u0183\5*\26\2\u0182"+
					"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0171\3\2"+
					"\2\2\u0184\u0178\3\2\2\2\u0185\21\3\2\2\2\u0186\u018a\7C\2\2\u0187\u0189"+
					"\5\u00aaV\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2"+
					"\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f"+
					"\7h\2\2\u018e\u0190\5*\26\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
					"\23\3\2\2\2\u0191\u0193\5\u00aaV\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2"+
					"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
					"\u0194\3\2\2\2\u0197\u0199\7h\2\2\u0198\u019a\5*\26\2\u0199\u0198\3\2"+
					"\2\2\u0199\u019a\3\2\2\2\u019a\25\3\2\2\2\u019b\u019c\5\20\t\2\u019c\27"+
					"\3\2\2\2\u019d\u019e\5\22\n\2\u019e\31\3\2\2\2\u019f\u01a0\5\24\13\2\u01a0"+
					"\33\3\2\2\2\u01a1\u01a3\5\u00aaV\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2"+
					"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
					"\u01a4\3\2\2\2\u01a7\u01a8\7h\2\2\u01a8\35\3\2\2\2\u01a9\u01aa\5\4\3\2"+
					"\u01aa\u01ab\5 \21\2\u01ab\u01b3\3\2\2\2\u01ac\u01ad\5\16\b\2\u01ad\u01ae"+
					"\5 \21\2\u01ae\u01b3\3\2\2\2\u01af\u01b0\5\34\17\2\u01b0\u01b1\5 \21\2"+
					"\u01b1\u01b3\3\2\2\2\u01b2\u01a9\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b2\u01af"+
					"\3\2\2\2\u01b3\37\3\2\2\2\u01b4\u01b6\5\u00aaV\2\u01b5\u01b4\3\2\2\2\u01b6"+
					"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
					"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\u01c6\7@\2\2\u01bc\u01be"+
					"\5\u00aaV\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2"+
					"\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3"+
					"\7?\2\2\u01c3\u01c5\7@\2\2\u01c4\u01bf\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
					"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7!\3\2\2\2\u01c8\u01c6\3\2\2\2"+
					"\u01c9\u01cb\5$\23\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
					"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
					"\u01d1\7h\2\2\u01d0\u01d2\5&\24\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2"+
					"\2\2\u01d2#\3\2\2\2\u01d3\u01d4\5\u00aaV\2\u01d4%\3\2\2\2\u01d5\u01d6"+
					"\7\23\2\2\u01d6\u01e0\5\34\17\2\u01d7\u01d8\7\23\2\2\u01d8\u01dc\5\16"+
					"\b\2\u01d9\u01db\5(\25\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc"+
					"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
					"\2\2\u01df\u01d5\3\2\2\2\u01df\u01d7\3\2\2\2\u01e0\'\3\2\2\2\u01e1\u01e2"+
					"\7W\2\2\u01e2\u01e3\5\26\f\2\u01e3)\3\2\2\2\u01e4\u01e5\7F\2\2\u01e5\u01e6"+
					"\5,\27\2\u01e6\u01e7\7E\2\2\u01e7+\3\2\2\2\u01e8\u01ed\5.\30\2\u01e9\u01ea"+
					"\7B\2\2\u01ea\u01ec\5.\30\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed"+
					"\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee-\3\2\2\2\u01ef\u01ed\3\2\2\2"+
					"\u01f0\u01f3\5\f\7\2\u01f1\u01f3\5\60\31\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1"+
					"\3\2\2\2\u01f3/\3\2\2\2\u01f4\u01f6\5\u00aaV\2\u01f5\u01f4\3\2\2\2\u01f6"+
					"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2"+
					"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc\7I\2\2\u01fb\u01fd\5\62\32\2\u01fc"+
					"\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\61\3\2\2\2\u01fe\u01ff\7\23\2"+
					"\2\u01ff\u0203\5\f\7\2\u0200\u0201\7*\2\2\u0201\u0203\5\f\7\2\u0202\u01fe"+
					"\3\2\2\2\u0202\u0200\3\2\2\2\u0203\63\3\2\2\2\u0204\u0205\b\33\1\2\u0205"+
					"\u0206\7h\2\2\u0206\u020c\3\2\2\2\u0207\u0208\f\3\2\2\u0208\u0209\7C\2"+
					"\2\u0209\u020b\7h\2\2\u020a\u0207\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a"+
					"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\65\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
					"\u0215\7h\2\2\u0210\u0211\58\35\2\u0211\u0212\7C\2\2\u0212\u0213\7h\2"+
					"\2\u0213\u0215\3\2\2\2\u0214\u020f\3\2\2\2\u0214\u0210\3\2\2\2\u0215\67"+
					"\3\2\2\2\u0216\u0217\b\35\1\2\u0217\u0218\7h\2\2\u0218\u021e\3\2\2\2\u0219"+
					"\u021a\f\3\2\2\u021a\u021b\7C\2\2\u021b\u021d\7h\2\2\u021c\u0219\3\2\2"+
					"\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f9"+
					"\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0227\7h\2\2\u0222\u0223\5> \2\u0223"+
					"\u0224\7C\2\2\u0224\u0225\7h\2\2\u0225\u0227\3\2\2\2\u0226\u0221\3\2\2"+
					"\2\u0226\u0222\3\2\2\2\u0227;\3\2\2\2\u0228\u0229\7h\2\2\u0229=\3\2\2"+
					"\2\u022a\u022b\b \1\2\u022b\u022c\7h\2\2\u022c\u0232\3\2\2\2\u022d\u022e"+
					"\f\3\2\2\u022e\u022f\7C\2\2\u022f\u0231\7h\2\2\u0230\u022d\3\2\2\2\u0231"+
					"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233?\3\2\2\2"+
					"\u0234\u0232\3\2\2\2\u0235\u0237\5B\"\2\u0236\u0235\3\2\2\2\u0236\u0237"+
					"\3\2\2\2\u0237\u023b\3\2\2\2\u0238\u023a\5F$\2\u0239\u0238\3\2\2\2\u023a"+
					"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0241\3\2"+
					"\2\2\u023d\u023b\3\2\2\2\u023e\u0240\5L\'\2\u023f\u023e\3\2\2\2\u0240"+
					"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
					"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\7\2\2\3\u0245A\3\2\2\2\u0246\u0248"+
					"\5D#\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
					"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7\""+
					"\2\2\u024d\u024e\5\64\33\2\u024e\u024f\7A\2\2\u024fC\3\2\2\2\u0250\u0251"+
					"\5\u00aaV\2\u0251E\3\2\2\2\u0252\u0255\5H%\2\u0253\u0255\5J&\2\u0254\u0252"+
					"\3\2\2\2\u0254\u0253\3\2\2\2\u0255G\3\2\2\2\u0256\u0257\7\33\2\2\u0257"+
					"\u0258\5\66\34\2\u0258\u0259\7A\2\2\u0259I\3\2\2\2\u025a\u025b\7\33\2"+
					"\2\u025b\u025c\58\35\2\u025c\u025d\7C\2\2\u025d\u025e\7U\2\2\u025e\u025f"+
					"\7A\2\2\u025fK\3\2\2\2\u0260\u0263\5N(\2\u0261\u0263\7A\2\2\u0262\u0260"+
					"\3\2\2\2\u0262\u0261\3\2\2\2\u0263M\3\2\2\2\u0264\u0265\5P)\2\u0265O\3"+
					"\2\2\2\u0266\u0268\5R*\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
					"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2"+
					"\2\2\u026c\u026d\7\13\2\2\u026d\u026f\7h\2\2\u026e\u0270\5T+\2\u026f\u026e"+
					"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u0273\5X-\2\u0272"+
					"\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\5Z"+
					".\2\u0275Q\3\2\2\2\u0276\u027f\5\u00aaV\2\u0277\u027f\7%\2\2\u0278\u027f"+
					"\7$\2\2\u0279\u027f\7#\2\2\u027a\u027f\7\3\2\2\u027b\u027f\7(\2\2\u027c"+
					"\u027f\7\24\2\2\u027d\u027f\7)\2\2\u027e\u0276\3\2\2\2\u027e\u0277\3\2"+
					"\2\2\u027e\u0278\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027e"+
					"\u027b\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027fS\3\2\2\2"+
					"\u0280\u0281\7F\2\2\u0281\u0282\5V,\2\u0282\u0283\7E\2\2\u0283U\3\2\2"+
					"\2\u0284\u0289\5\"\22\2\u0285\u0286\7B\2\2\u0286\u0288\5\"\22\2\u0287"+
					"\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
					"\2\2\u028aW\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d\t\5\2\2\u028d\u028e"+
					"\5\20\t\2\u028eY\3\2\2\2\u028f\u0293\7=\2\2\u0290\u0292\5\\/\2\u0291\u0290"+
					"\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
					"\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0297\7>\2\2\u0297[\3\2\2\2\u0298"+
					"\u029b\5^\60\2\u0299\u029b\5\u009eP\2\u029a\u0298\3\2\2\2\u029a\u0299"+
					"\3\2\2\2\u029b]\3\2\2\2\u029c\u02a1\5`\61\2\u029d\u02a1\5\u0080A\2\u029e"+
					"\u02a1\5N(\2\u029f\u02a1\7A\2\2\u02a0\u029c\3\2\2\2\u02a0\u029d\3\2\2"+
					"\2\u02a0\u029e\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1_\3\2\2\2\u02a2\u02a4"+
					"\5b\62\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
					"\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\5l"+
					"\67\2\u02a9\u02aa\5d\63\2\u02aa\u02ab\7A\2\2\u02aba\3\2\2\2\u02ac\u02b5"+
					"\5\u00aaV\2\u02ad\u02b5\7%\2\2\u02ae\u02b5\7$\2\2\u02af\u02b5\7#\2\2\u02b0"+
					"\u02b5\7(\2\2\u02b1\u02b5\7\24\2\2\u02b2\u02b5\7\60\2\2\u02b3\u02b5\7"+
					"\63\2\2\u02b4\u02ac\3\2\2\2\u02b4\u02ad\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4"+
					"\u02af\3\2\2\2\u02b4\u02b0\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2"+
					"\2\2\u02b4\u02b3\3\2\2\2\u02b5c\3\2\2\2\u02b6\u02bb\5f\64\2\u02b7\u02b8"+
					"\7B\2\2\u02b8\u02ba\5f\64\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
					"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bce\3\2\2\2\u02bd\u02bb\3\2\2\2"+
					"\u02be\u02c1\5h\65\2\u02bf\u02c0\7D\2\2\u02c0\u02c2\5j\66\2\u02c1\u02bf"+
					"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2g\3\2\2\2\u02c3\u02c5\7h\2\2\u02c4\u02c6"+
					"\5 \21\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6i\3\2\2\2\u02c7"+
					"\u02ca\5\u0114\u008b\2\u02c8\u02ca\5\u00bc_\2\u02c9\u02c7\3\2\2\2\u02c9"+
					"\u02c8\3\2\2\2\u02cak\3\2\2\2\u02cb\u02ce\5n8\2\u02cc\u02ce\5p9\2\u02cd"+
					"\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02cem\3\2\2\2\u02cf\u02d2\5\6\4\2"+
					"\u02d0\u02d2\7\5\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2o\3"+
					"\2\2\2\u02d3\u02d7\5r:\2\u02d4\u02d7\5|?\2\u02d5\u02d7\5~@\2\u02d6\u02d3"+
					"\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7q\3\2\2\2\u02d8"+
					"\u02db\5v<\2\u02d9\u02db\5z>\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2"+
					"\u02db\u02e0\3\2\2\2\u02dc\u02df\5t;\2\u02dd\u02df\5x=\2\u02de\u02dc\3"+
					"\2\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
					"\u02e1\3\2\2\2\u02e1s\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e7\7C\2\2\u02e4"+
					"\u02e6\5\u00aaV\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5"+
					"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
					"\u02ec\7h\2\2\u02eb\u02ed\5*\26\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2"+
					"\2\2\u02edu\3\2\2\2\u02ee\u02f0\7h\2\2\u02ef\u02f1\5*\26\2\u02f0\u02ef"+
					"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1w\3\2\2\2\u02f2\u02f3\5t;\2\u02f3y\3"+
					"\2\2\2\u02f4\u02f5\5v<\2\u02f5{\3\2\2\2\u02f6\u02f7\7h\2\2\u02f7}\3\2"+
					"\2\2\u02f8\u02f9\5n8\2\u02f9\u02fa\5 \21\2\u02fa\u0302\3\2\2\2\u02fb\u02fc"+
					"\5r:\2\u02fc\u02fd\5 \21\2\u02fd\u0302\3\2\2\2\u02fe\u02ff\5|?\2\u02ff"+
					"\u0300\5 \21\2\u0300\u0302\3\2\2\2\u0301\u02f8\3\2\2\2\u0301\u02fb\3\2"+
					"\2\2\u0301\u02fe\3\2\2\2\u0302\177\3\2\2\2\u0303\u0305\5\u0082B\2\u0304"+
					"\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2"+
					"\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\5\u0084C\2\u030a"+
					"\u030b\5\u009cO\2\u030b\u0081\3\2\2\2\u030c\u0317\5\u00aaV\2\u030d\u0317"+
					"\7%\2\2\u030e\u0317\7$\2\2\u030f\u0317\7#\2\2\u0310\u0317\7\3\2\2\u0311"+
					"\u0317\7(\2\2\u0312\u0317\7\24\2\2\u0313\u0317\7,\2\2\u0314\u0317\7 \2"+
					"\2\u0315\u0317\7)\2\2\u0316\u030c\3\2\2\2\u0316\u030d\3\2\2\2\u0316\u030e"+
					"\3\2\2\2\u0316\u030f\3\2\2\2\u0316\u0310\3\2\2\2\u0316\u0311\3\2\2\2\u0316"+
					"\u0312\3\2\2\2\u0316\u0313\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0315\3\2"+
					"\2\2\u0317\u0083\3\2\2\2\u0318\u0319\5\u0086D\2\u0319\u031b\5\u0088E\2"+
					"\u031a\u031c\5\u0096L\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
					"\u032a\3\2\2\2\u031d\u0321\5T+\2\u031e\u0320\5\u00aaV\2\u031f\u031e\3"+
					"\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
					"\u0324\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325\5\u0086D\2\u0325\u0327"+
					"\5\u0088E\2\u0326\u0328\5\u0096L\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2"+
					"\2\2\u0328\u032a\3\2\2\2\u0329\u0318\3\2\2\2\u0329\u031d\3\2\2\2\u032a"+
					"\u0085\3\2\2\2\u032b\u032e\5l\67\2\u032c\u032e\7\62\2\2\u032d\u032b\3"+
					"\2\2\2\u032d\u032c\3\2\2\2\u032e\u0087\3\2\2\2\u032f\u0330\7h\2\2\u0330"+
					"\u0332\7;\2\2\u0331\u0333\5\u008aF\2\u0332\u0331\3\2\2\2\u0332\u0333\3"+
					"\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\7<\2\2\u0335\u0337\5 \21\2\u0336"+
					"\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0089\3\2\2\2\u0338\u033f\5\u0094"+
					"K\2\u0339\u033a\5\u008cG\2\u033a\u033b\7B\2\2\u033b\u033c\5\u0092J\2\u033c"+
					"\u033f\3\2\2\2\u033d\u033f\5\u0092J\2\u033e\u0338\3\2\2\2\u033e\u0339"+
					"\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u008b\3\2\2\2\u0340\u0345\5\u008eH"+
					"\2\u0341\u0342\7B\2\2\u0342\u0344\5\u008eH\2\u0343\u0341\3\2\2\2\u0344"+
					"\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0351\3\2"+
					"\2\2\u0347\u0345\3\2\2\2\u0348\u034d\5\u0094K\2\u0349\u034a\7B\2\2\u034a"+
					"\u034c\5\u008eH\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b"+
					"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u0350"+
					"\u0340\3\2\2\2\u0350\u0348\3\2\2\2\u0351\u008d\3\2\2\2\u0352\u0354\5\u0090"+
					"I\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
					"\u0356\3\2\2\2\u0356\u0358\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\5l"+
					"\67\2\u0359\u035a\5h\65\2\u035a\u008f\3\2\2\2\u035b\u035e\5\u00aaV\2\u035c"+
					"\u035e\7\24\2\2\u035d\u035b\3\2\2\2\u035d\u035c\3\2\2\2\u035e\u0091\3"+
					"\2\2\2\u035f\u0361\5\u0090I\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2"+
					"\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0362"+
					"\3\2\2\2\u0365\u0369\5l\67\2\u0366\u0368\5\u00aaV\2\u0367\u0366\3\2\2"+
					"\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c"+
					"\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7j\2\2\u036d\u036e\5h\65\2\u036e"+
					"\u0371\3\2\2\2\u036f\u0371\5\u008eH\2\u0370\u0362\3\2\2\2\u0370\u036f"+
					"\3\2\2\2\u0371\u0093\3\2\2\2\u0372\u0374\5\u00aaV\2\u0373\u0372\3\2\2"+
					"\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378"+
					"\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037b\5l\67\2\u0379\u037a\7h\2\2\u037a"+
					"\u037c\7C\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2"+
					"\2\2\u037d\u037e\7-\2\2\u037e\u0095\3\2\2\2\u037f\u0380\7/\2\2\u0380\u0381"+
					"\5\u0098M\2\u0381\u0097\3\2\2\2\u0382\u0387\5\u009aN\2\u0383\u0384\7B"+
					"\2\2\u0384\u0386\5\u009aN\2\u0385\u0383\3\2\2\2\u0386\u0389\3\2\2\2\u0387"+
					"\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0099\3\2\2\2\u0389\u0387\3\2"+
					"\2\2\u038a\u038d\5\20\t\2\u038b\u038d\5\34\17\2\u038c\u038a\3\2\2\2\u038c"+
					"\u038b\3\2\2\2\u038d\u009b\3\2\2\2\u038e\u0391\5\u00c0a\2\u038f\u0391"+
					"\7A\2\2\u0390\u038e\3\2\2\2\u0390\u038f\3\2\2\2\u0391\u009d\3\2\2\2\u0392"+
					"\u0394\5\u00a0Q\2\u0393\u0392\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393"+
					"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0395\3\2\2\2\u0398"+
					"\u039a\5\u00a2R\2\u0399\u039b\5\u0096L\2\u039a\u0399\3\2\2\2\u039a\u039b"+
					"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\5\u00a6T\2\u039d\u009f\3\2\2"+
					"\2\u039e\u03a3\5\u00aaV\2\u039f\u03a3\7%\2\2\u03a0\u03a3\7$\2\2\u03a1"+
					"\u03a3\7#\2\2\u03a2\u039e\3\2\2\2\u03a2\u039f\3\2\2\2\u03a2\u03a0\3\2"+
					"\2\2\u03a2\u03a1\3\2\2\2\u03a3\u00a1\3\2\2\2\u03a4\u03a6\5T+\2\u03a5\u03a4"+
					"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\5\u00a4S"+
					"\2\u03a8\u03aa\7;\2\2\u03a9\u03ab\5\u008aF\2\u03aa\u03a9\3\2\2\2\u03aa"+
					"\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7<\2\2\u03ad\u00a3\3\2"+
					"\2\2\u03ae\u03af\7h\2\2\u03af\u00a5\3\2\2\2\u03b0\u03b2\7=\2\2\u03b1\u03b3"+
					"\5\u00a8U\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2"+
					"\2\u03b4\u03b6\5\u00c2b\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
					"\u03b7\3\2\2\2\u03b7\u03b8\7>\2\2\u03b8\u00a7\3\2\2\2\u03b9\u03bb\5*\26"+
					"\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
					"\7-\2\2\u03bd\u03bf\7;\2\2\u03be\u03c0\5\u0106\u0084\2\u03bf\u03be\3\2"+
					"\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\7<\2\2\u03c2"+
					"\u03e8\7A\2\2\u03c3\u03c5\5*\26\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2"+
					"\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\7*\2\2\u03c7\u03c9\7;\2\2\u03c8\u03ca"+
					"\5\u0106\u0084\2\u03c9\u03c8\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3"+
					"\2\2\2\u03cb\u03cc\7<\2\2\u03cc\u03e8\7A\2\2\u03cd\u03ce\5:\36\2\u03ce"+
					"\u03d0\7C\2\2\u03cf\u03d1\5*\26\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2"+
					"\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\7*\2\2\u03d3\u03d5\7;\2\2\u03d4\u03d6"+
					"\5\u0106\u0084\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3"+
					"\2\2\2\u03d7\u03d8\7<\2\2\u03d8\u03d9\7A\2\2\u03d9\u03e8\3\2\2\2\u03da"+
					"\u03db\5\u00dco\2\u03db\u03dd\7C\2\2\u03dc\u03de\5*\26\2\u03dd\u03dc\3"+
					"\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7*\2\2\u03e0"+
					"\u03e2\7;\2\2\u03e1\u03e3\5\u0106\u0084\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3"+
					"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\7<\2\2\u03e5\u03e6\7A\2\2\u03e6"+
					"\u03e8\3\2\2\2\u03e7\u03ba\3\2\2\2\u03e7\u03c4\3\2\2\2\u03e7\u03cd\3\2"+
					"\2\2\u03e7\u03da\3\2\2\2\u03e8\u00a9\3\2\2\2\u03e9\u03ed\5\u00acW\2\u03ea"+
					"\u03ed\5\u00b8]\2\u03eb\u03ed\5\u00ba^\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea"+
					"\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u00ab\3\2\2\2\u03ee\u03ef\7i\2\2\u03ef"+
					"\u03f0\5\66\34\2\u03f0\u03f2\7;\2\2\u03f1\u03f3\5\u00aeX\2\u03f2\u03f1"+
					"\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\7<\2\2\u03f5"+
					"\u00ad\3\2\2\2\u03f6\u03fb\5\u00b0Y\2\u03f7\u03f8\7B\2\2\u03f8\u03fa\5"+
					"\u00b0Y\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2"+
					"\u03fb\u03fc\3\2\2\2\u03fc\u00af\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff"+
					"\7h\2\2\u03ff\u0400\7D\2\2\u0400\u0401\5\u00b2Z\2\u0401\u00b1\3\2\2\2"+
					"\u0402\u0406\5\u0126\u0094\2\u0403\u0406\5\u00b4[\2\u0404\u0406\5\u00aa"+
					"V\2\u0405\u0402\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0404\3\2\2\2\u0406"+
					"\u00b3\3\2\2\2\u0407\u0409\7=\2\2\u0408\u040a\5\u00b6\\\2\u0409\u0408"+
					"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u040d\7B\2\2\u040c"+
					"\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\7>"+
					"\2\2\u040f\u00b5\3\2\2\2\u0410\u0415\5\u00b2Z\2\u0411\u0412\7B\2\2\u0412"+
					"\u0414\5\u00b2Z\2\u0413\u0411\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413"+
					"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u00b7\3\2\2\2\u0417\u0415\3\2\2\2\u0418"+
					"\u0419\7i\2\2\u0419\u041a\5\66\34\2\u041a\u00b9\3\2\2\2\u041b\u041c\7"+
					"i\2\2\u041c\u041d\5\66\34\2\u041d\u041e\7;\2\2\u041e\u041f\5\u00b2Z\2"+
					"\u041f\u0420\7<\2\2\u0420\u00bb\3\2\2\2\u0421\u0423\7=\2\2\u0422\u0424"+
					"\5\u00be`\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2"+
					"\2\u0425\u0427\7B\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428"+
					"\3\2\2\2\u0428\u0429\7>\2\2\u0429\u00bd\3\2\2\2\u042a\u042f\5j\66\2\u042b"+
					"\u042c\7B\2\2\u042c\u042e\5j\66\2\u042d\u042b\3\2\2\2\u042e\u0431\3\2"+
					"\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00bf\3\2\2\2\u0431"+
					"\u042f\3\2\2\2\u0432\u0434\7=\2\2\u0433\u0435\5\u00c2b\2\u0434\u0433\3"+
					"\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7>\2\2\u0437"+
					"\u00c1\3\2\2\2\u0438\u043a\5\u00c4c\2\u0439\u0438\3\2\2\2\u043a\u043b"+
					"\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u00c3\3\2\2\2\u043d"+
					"\u0441\5\u00c6d\2\u043e\u0441\5N(\2\u043f\u0441\5\u00caf\2\u0440\u043d"+
					"\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u00c5\3\2\2\2\u0442"+
					"\u0443\5\u00c8e\2\u0443\u0444\7A\2\2\u0444\u00c7\3\2\2\2\u0445\u0447\5"+
					"\u0090I\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2"+
					"\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c"+
					"\5l\67\2\u044c\u044d\5d\63\2\u044d\u00c9\3\2\2\2\u044e\u0451\5\u00ceh"+
					"\2\u044f\u0451\5\u00d2j\2\u0450\u044e\3\2\2\2\u0450\u044f\3\2\2\2\u0451"+
					"\u00cb\3\2\2\2\u0452\u0455\5\u00ceh\2\u0453\u0455\5\u00d4k\2\u0454\u0452"+
					"\3\2\2\2\u0454\u0453\3\2\2\2\u0455\u00cd\3\2\2\2\u0456\u045b\5\u00c0a"+
					"\2\u0457\u045b\5\u00d0i\2\u0458\u045b\5\u00d6l\2\u0459\u045b\5\u00dan"+
					"\2\u045a\u0456\3\2\2\2\u045a\u0457\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u0459"+
					"\3\2\2\2\u045b\u00cf\3\2\2\2\u045c\u045d\7A\2\2\u045d\u00d1\3\2\2\2\u045e"+
					"\u045f\7h\2\2\u045f\u0460\7J\2\2\u0460\u0461\5\u00caf\2\u0461\u00d3\3"+
					"\2\2\2\u0462\u0463\7h\2\2\u0463\u0464\7J\2\2\u0464\u0465\5\u00ccg\2\u0465"+
					"\u00d5\3\2\2\2\u0466\u0467\5\u00d8m\2\u0467\u0468\7A\2\2\u0468\u00d7\3"+
					"\2\2\2\u0469\u046d\5\u0120\u0091\2\u046a\u046d\5\u0100\u0081\2\u046b\u046d"+
					"\5\u00ecw\2\u046c\u0469\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2"+
					"\2\u046d\u00d9\3\2\2\2\u046e\u0470\7&\2\2\u046f\u0471\5\u0114\u008b\2"+
					"\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473"+
					"\7A\2\2\u0473\u00db\3\2\2\2\u0474\u0477\5\u00e6t\2\u0475\u0477\5\u010e"+
					"\u0088\2\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0477\u047b\3\2\2\2\u0478"+
					"\u047a\5\u00e0q\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479"+
					"\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u00dd\3\2\2\2\u047d\u047b\3\2\2\2\u047e"+
					"\u049b\5\2\2\2\u047f\u0484\5\66\34\2\u0480\u0481\7?\2\2\u0481\u0483\7"+
					"@\2\2\u0482\u0480\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482\3\2\2\2\u0484"+
					"\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487\u0488\7C"+
					"\2\2\u0488\u0489\7\13\2\2\u0489\u049b\3\2\2\2\u048a\u048b\7\62\2\2\u048b"+
					"\u048c\7C\2\2\u048c\u049b\7\13\2\2\u048d\u049b\7-\2\2\u048e\u048f\5\66"+
					"\34\2\u048f\u0490\7C\2\2\u0490\u0491\7-\2\2\u0491\u049b\3\2\2\2\u0492"+
					"\u0493\7;\2\2\u0493\u0494\5\u0114\u008b\2\u0494\u0495\7<\2\2\u0495\u049b"+
					"\3\2\2\2\u0496\u049b\5\u00ecw\2\u0497\u049b\5\u00f4{\2\u0498\u049b\5\u0100"+
					"\u0081\2\u0499\u049b\5\u0108\u0085\2\u049a\u047e\3\2\2\2\u049a\u047f\3"+
					"\2\2\2\u049a\u048a\3\2\2\2\u049a\u048d\3\2\2\2\u049a\u048e\3\2\2\2\u049a"+
					"\u0492\3\2\2\2\u049a\u0496\3\2\2\2\u049a\u0497\3\2\2\2\u049a\u0498\3\2"+
					"\2\2\u049a\u0499\3\2\2\2\u049b\u00df\3\2\2\2\u049c\u04a2\5\u00eex\2\u049d"+
					"\u04a2\5\u00f6|\2\u049e\u04a2\5\u00fc\177\2\u049f\u04a2\5\u0102\u0082"+
					"\2\u04a0\u04a2\5\u010a\u0086\2\u04a1\u049c\3\2\2\2\u04a1\u049d\3\2\2\2"+
					"\u04a1\u049e\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u00e1"+
					"\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u00e3\3\2\2\2\u04a5\u04aa\5\u00eex"+
					"\2\u04a6\u04aa\5\u00f6|\2\u04a7\u04aa\5\u0102\u0082\2\u04a8\u04aa\5\u010a"+
					"\u0086\2\u04a9\u04a5\3\2\2\2\u04a9\u04a6\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9"+
					"\u04a8\3\2\2\2\u04aa\u00e5\3\2\2\2\u04ab\u04d4\5\2\2\2\u04ac\u04b1\5\66"+
					"\34\2\u04ad\u04ae\7?\2\2\u04ae\u04b0\7@\2\2\u04af\u04ad\3\2\2\2\u04b0"+
					"\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b4\3\2"+
					"\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b5\7C\2\2\u04b5\u04b6\7\13\2\2\u04b6"+
					"\u04d4\3\2\2\2\u04b7\u04bc\5n8\2\u04b8\u04b9\7?\2\2\u04b9\u04bb\7@\2\2"+
					"\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd"+
					"\3\2\2\2\u04bd\u04bf\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u04c0\7C\2\2\u04c0"+
					"\u04c1\7\13\2\2\u04c1\u04d4\3\2\2\2\u04c2\u04c3\7\62\2\2\u04c3\u04c4\7"+
					"C\2\2\u04c4\u04d4\7\13\2\2\u04c5\u04d4\7-\2\2\u04c6\u04c7\5\66\34\2\u04c7"+
					"\u04c8\7C\2\2\u04c8\u04c9\7-\2\2\u04c9\u04d4\3\2\2\2\u04ca\u04cb\7;\2"+
					"\2\u04cb\u04cc\5\u0114\u008b\2\u04cc\u04cd\7<\2\2\u04cd\u04d4\3\2\2\2"+
					"\u04ce\u04d4\5\u00f0y\2\u04cf\u04d4\5\u00f8}\2\u04d0\u04d4\5\u00fe\u0080"+
					"\2\u04d1\u04d4\5\u0104\u0083\2\u04d2\u04d4\5\u010c\u0087\2\u04d3\u04ab"+
					"\3\2\2\2\u04d3\u04ac\3\2\2\2\u04d3\u04b7\3\2\2\2\u04d3\u04c2\3\2\2\2\u04d3"+
					"\u04c5\3\2\2\2\u04d3\u04c6\3\2\2\2\u04d3\u04ca\3\2\2\2\u04d3\u04ce\3\2"+
					"\2\2\u04d3\u04cf\3\2\2\2\u04d3\u04d0\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3"+
					"\u04d2\3\2\2\2\u04d4\u00e7\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u00e9\3\2"+
					"\2\2\u04d7\u04ff\5\2\2\2\u04d8\u04dd\5\66\34\2\u04d9\u04da\7?\2\2\u04da"+
					"\u04dc\7@\2\2\u04db\u04d9\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2"+
					"\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0"+
					"\u04e1\7C\2\2\u04e1\u04e2\7\13\2\2\u04e2\u04ff\3\2\2\2\u04e3\u04e8\5n"+
					"8\2\u04e4\u04e5\7?\2\2\u04e5\u04e7\7@\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04ea"+
					"\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea"+
					"\u04e8\3\2\2\2\u04eb\u04ec\7C\2\2\u04ec\u04ed\7\13\2\2\u04ed\u04ff\3\2"+
					"\2\2\u04ee\u04ef\7\62\2\2\u04ef\u04f0\7C\2\2\u04f0\u04ff\7\13\2\2\u04f1"+
					"\u04ff\7-\2\2\u04f2\u04f3\5\66\34\2\u04f3\u04f4\7C\2\2\u04f4\u04f5\7-"+
					"\2\2\u04f5\u04ff\3\2\2\2\u04f6\u04f7\7;\2\2\u04f7\u04f8\5\u0114\u008b"+
					"\2\u04f8\u04f9\7<\2\2\u04f9\u04ff\3\2\2\2\u04fa\u04ff\5\u00f0y\2\u04fb"+
					"\u04ff\5\u00f8}\2\u04fc\u04ff\5\u0104\u0083\2\u04fd\u04ff\5\u010c\u0087"+
					"\2\u04fe\u04d7\3\2\2\2\u04fe\u04d8\3\2\2\2\u04fe\u04e3\3\2\2\2\u04fe\u04ee"+
					"\3\2\2\2\u04fe\u04f1\3\2\2\2\u04fe\u04f2\3\2\2\2\u04fe\u04f6\3\2\2\2\u04fe"+
					"\u04fa\3\2\2\2\u04fe\u04fb\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04fd\3\2"+
					"\2\2\u04ff\u00eb\3\2\2\2\u0500\u0502\7!\2\2\u0501\u0503\5*\26\2\u0502"+
					"\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0507\3\2\2\2\u0504\u0506\5\u00aa"+
					"V\2\u0505\u0504\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507"+
					"\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u0515\7h"+
					"\2\2\u050b\u050f\7C\2\2\u050c\u050e\5\u00aaV\2\u050d\u050c\3\2\2\2\u050e"+
					"\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2"+
					"\2\2\u0511\u050f\3\2\2\2\u0512\u0514\7h\2\2\u0513\u050b\3\2\2\2\u0514"+
					"\u0517\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0519\3\2"+
					"\2\2\u0517\u0515\3\2\2\2\u0518\u051a\5\u00f2z\2\u0519\u0518\3\2\2\2\u0519"+
					"\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\7;\2\2\u051c\u051e\5\u0106"+
					"\u0084\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f"+
					"\u0521\7<\2\2\u0520\u0522\5Z.\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2"+
					"\2\u0522\u0554\3\2\2\2\u0523\u0524\5:\36\2\u0524\u0525\7C\2\2\u0525\u0527"+
					"\7!\2\2\u0526\u0528\5*\26\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
					"\u052c\3\2\2\2\u0529\u052b\5\u00aaV\2\u052a\u0529\3\2\2\2\u052b\u052e"+
					"\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052f\3\2\2\2\u052e"+
					"\u052c\3\2\2\2\u052f\u0531\7h\2\2\u0530\u0532\5\u00f2z\2\u0531\u0530\3"+
					"\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\7;\2\2\u0534"+
					"\u0536\5\u0106\u0084\2\u0535\u0534\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0537"+
					"\3\2\2\2\u0537\u0539\7<\2\2\u0538\u053a\5Z.\2\u0539\u0538\3\2\2\2\u0539"+
					"\u053a\3\2\2\2\u053a\u0554\3\2\2\2\u053b\u053c\5\u00dco\2\u053c\u053d"+
					"\7C\2\2\u053d\u053f\7!\2\2\u053e\u0540\5*\26\2\u053f\u053e\3\2\2\2\u053f"+
					"\u0540\3\2\2\2\u0540\u0544\3\2\2\2\u0541\u0543\5\u00aaV\2\u0542\u0541"+
					"\3\2\2\2\u0543\u0546\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545"+
					"\u0547\3\2\2\2\u0546\u0544\3\2\2\2\u0547\u0549\7h\2\2\u0548\u054a\5\u00f2"+
					"z\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
					"\u054d\7;\2\2\u054c\u054e\5\u0106\u0084\2\u054d\u054c\3\2\2\2\u054d\u054e"+
					"\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\7<\2\2\u0550\u0552\5Z.\2\u0551"+
					"\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2\2\2\u0553\u0500\3\2"+
					"\2\2\u0553\u0523\3\2\2\2\u0553\u053b\3\2\2\2\u0554\u00ed\3\2\2\2\u0555"+
					"\u0556\7C\2\2\u0556\u0558\7!\2\2\u0557\u0559\5*\26\2\u0558\u0557\3\2\2"+
					"\2\u0558\u0559\3\2\2\2\u0559\u055d\3\2\2\2\u055a\u055c\5\u00aaV\2\u055b"+
					"\u055a\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2"+
					"\2\2\u055e\u0560\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0562\7h\2\2\u0561"+
					"\u0563\5\u00f2z\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564"+
					"\3\2\2\2\u0564\u0566\7;\2\2\u0565\u0567\5\u0106\u0084\2\u0566\u0565\3"+
					"\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\7<\2\2\u0569"+
					"\u056b\5Z.\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u00ef\3\2\2"+
					"\2\u056c\u056e\7!\2\2\u056d\u056f\5*\26\2\u056e\u056d\3\2\2\2\u056e\u056f"+
					"\3\2\2\2\u056f\u0573\3\2\2\2\u0570\u0572\5\u00aaV\2\u0571\u0570\3\2\2"+
					"\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576"+
					"\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0581\7h\2\2\u0577\u057b\7C\2\2\u0578"+
					"\u057a\5\u00aaV\2\u0579\u0578\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579"+
					"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e\3\2\2\2\u057d\u057b\3\2\2\2\u057e"+
					"\u0580\7h\2\2\u057f\u0577\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2"+
					"\2\2\u0581\u0582\3\2\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0584"+
					"\u0586\5\u00f2z\2\u0585\u0584\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0587"+
					"\3\2\2\2\u0587\u0589\7;\2\2\u0588\u058a\5\u0106\u0084\2\u0589\u0588\3"+
					"\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\7<\2\2\u058c"+
					"\u058e\5Z.\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u05a8\3\2\2"+
					"\2\u058f\u0590\5:\36\2\u0590\u0591\7C\2\2\u0591\u0593\7!\2\2\u0592\u0594"+
					"\5*\26\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0598\3\2\2\2\u0595"+
					"\u0597\5\u00aaV\2\u0596\u0595\3\2\2\2\u0597\u059a\3\2\2\2\u0598\u0596"+
					"\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u0598\3\2\2\2\u059b"+
					"\u059d\7h\2\2\u059c\u059e\5\u00f2z\2\u059d\u059c\3\2\2\2\u059d\u059e\3"+
					"\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\7;\2\2\u05a0\u05a2\5\u0106\u0084"+
					"\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a5"+
					"\7<\2\2\u05a4\u05a6\5Z.\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6"+
					"\u05a8\3\2\2\2\u05a7\u056c\3\2\2\2\u05a7\u058f\3\2\2\2\u05a8\u00f1\3\2"+
					"\2\2\u05a9\u05ad\5*\26\2\u05aa\u05ab\7F\2\2\u05ab\u05ad\7E\2\2\u05ac\u05a9"+
					"\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u00f3\3\2\2\2\u05ae\u05af\5\u00dco"+
					"\2\u05af\u05b0\7C\2\2\u05b0\u05b1\7h\2\2\u05b1\u05bc\3\2\2\2\u05b2\u05b3"+
					"\7*\2\2\u05b3\u05b4\7C\2\2\u05b4\u05bc\7h\2\2\u05b5\u05b6\5\66\34\2\u05b6"+
					"\u05b7\7C\2\2\u05b7\u05b8\7*\2\2\u05b8\u05b9\7C\2\2\u05b9\u05ba\7h\2\2"+
					"\u05ba\u05bc\3\2\2\2\u05bb\u05ae\3\2\2\2\u05bb\u05b2\3\2\2\2\u05bb\u05b5"+
					"\3\2\2\2\u05bc\u00f5\3\2\2\2\u05bd\u05be\7C\2\2\u05be\u05bf\7h\2\2\u05bf"+
					"\u00f7\3\2\2\2\u05c0\u05c1\7*\2\2\u05c1\u05c2\7C\2\2\u05c2\u05ca\7h\2"+
					"\2\u05c3\u05c4\5\66\34\2\u05c4\u05c5\7C\2\2\u05c5\u05c6\7*\2\2\u05c6\u05c7"+
					"\7C\2\2\u05c7\u05c8\7h\2\2\u05c8\u05ca\3\2\2\2\u05c9\u05c0\3\2\2\2\u05c9"+
					"\u05c3\3\2\2\2\u05ca\u00f9\3\2\2\2\u05cb\u05cc\5:\36\2\u05cc\u05cd\7?"+
					"\2\2\u05cd\u05ce\5\u0114\u008b\2\u05ce\u05cf\7@\2\2\u05cf\u05d6\3\2\2"+
					"\2\u05d0\u05d1\5\u00dep\2\u05d1\u05d2\7?\2\2\u05d2\u05d3\5\u0114\u008b"+
					"\2\u05d3\u05d4\7@\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05cb\3\2\2\2\u05d5\u05d0"+
					"\3\2\2\2\u05d6\u00fb\3\2\2\2\u05d7\u05d8\5\u00e4s\2\u05d8\u05d9\7?\2\2"+
					"\u05d9\u05da\5\u0114\u008b\2\u05da\u05db\7@\2\2\u05db\u05e3\3\2\2\2\u05dc"+
					"\u05dd\5\u00e2r\2\u05dd\u05de\7?\2\2\u05de\u05df\5\u0114\u008b\2\u05df"+
					"\u05e0\7@\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05dc\3\2\2\2\u05e2\u05e5\3\2"+
					"\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u00fd\3\2\2\2\u05e5"+
					"\u05e3\3\2\2\2\u05e6\u05e7\5:\36\2\u05e7\u05e8\7?\2\2\u05e8\u05e9\5\u0114"+
					"\u008b\2\u05e9\u05ea\7@\2\2\u05ea\u05f1\3\2\2\2\u05eb\u05ec\5\u00eav\2"+
					"\u05ec\u05ed\7?\2\2\u05ed\u05ee\5\u0114\u008b\2\u05ee\u05ef\7@\2\2\u05ef"+
					"\u05f1\3\2\2\2\u05f0\u05e6\3\2\2\2\u05f0\u05eb\3\2\2\2\u05f1\u05f9\3\2"+
					"\2\2\u05f2\u05f3\5\u00e8u\2\u05f3\u05f4\7?\2\2\u05f4\u05f5\5\u0114\u008b"+
					"\2\u05f5\u05f6\7@\2\2\u05f6\u05f8\3\2\2\2\u05f7\u05f2\3\2\2\2\u05f8\u05fb"+
					"\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u00ff\3\2\2\2\u05fb"+
					"\u05f9\3\2\2\2\u05fc\u05fd\5<\37\2\u05fd\u05ff\7;\2\2\u05fe\u0600\5\u0106"+
					"\u0084\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
					"\u0602\7<\2\2\u0602\u0641\3\2\2\2\u0603\u0604\5\66\34\2\u0604\u0606\7"+
					"C\2\2\u0605\u0607\5*\26\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607"+
					"\u0608\3\2\2\2\u0608\u0609\7h\2\2\u0609\u060b\7;\2\2\u060a\u060c\5\u0106"+
					"\u0084\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d"+
					"\u060e\7<\2\2\u060e\u0641\3\2\2\2\u060f\u0610\5:\36\2\u0610\u0612\7C\2"+
					"\2\u0611\u0613\5*\26\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614"+
					"\3\2\2\2\u0614\u0615\7h\2\2\u0615\u0617\7;\2\2\u0616\u0618\5\u0106\u0084"+
					"\2\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a"+
					"\7<\2\2\u061a\u0641\3\2\2\2\u061b\u061c\5\u00dco\2\u061c\u061e\7C\2\2"+
					"\u061d\u061f\5*\26\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620"+
					"\3\2\2\2\u0620\u0621\7h\2\2\u0621\u0623\7;\2\2\u0622\u0624\5\u0106\u0084"+
					"\2\u0623\u0622\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626"+
					"\7<\2\2\u0626\u0641\3\2\2\2\u0627\u0628\7*\2\2\u0628\u062a\7C\2\2\u0629"+
					"\u062b\5*\26\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2"+
					"\2\2\u062c\u062d\7h\2\2\u062d\u062f\7;\2\2\u062e\u0630\5\u0106\u0084\2"+
					"\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0641"+
					"\7<\2\2\u0632\u0633\5\66\34\2\u0633\u0634\7C\2\2\u0634\u0635\7*\2\2\u0635"+
					"\u0637\7C\2\2\u0636\u0638\5*\26\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2"+
					"\2\2\u0638\u0639\3\2\2\2\u0639\u063a\7h\2\2\u063a\u063c\7;\2\2\u063b\u063d"+
					"\5\u0106\u0084\2\u063c\u063b\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063e\3"+
					"\2\2\2\u063e\u063f\7<\2\2\u063f\u0641\3\2\2\2\u0640\u05fc\3\2\2\2\u0640"+
					"\u0603\3\2\2\2\u0640\u060f\3\2\2\2\u0640\u061b\3\2\2\2\u0640\u0627\3\2"+
					"\2\2\u0640\u0632\3\2\2\2\u0641\u0101\3\2\2\2\u0642\u0644\7C\2\2\u0643"+
					"\u0645\5*\26\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\3\2"+
					"\2\2\u0646\u0647\7h\2\2\u0647\u0649\7;\2\2\u0648\u064a\5\u0106\u0084\2"+
					"\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c"+
					"\7<\2\2\u064c\u0103\3\2\2\2\u064d\u064e\5<\37\2\u064e\u0650\7;\2\2\u064f"+
					"\u0651\5\u0106\u0084\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652"+
					"\3\2\2\2\u0652\u0653\7<\2\2\u0653\u0686\3\2\2\2\u0654\u0655\5\66\34\2"+
					"\u0655\u0657\7C\2\2\u0656\u0658\5*\26\2\u0657\u0656\3\2\2\2\u0657\u0658"+
					"\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065a\7h\2\2\u065a\u065c\7;\2\2\u065b"+
					"\u065d\5\u0106\u0084\2\u065c\u065b\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e"+
					"\3\2\2\2\u065e\u065f\7<\2\2\u065f\u0686\3\2\2\2\u0660\u0661\5:\36\2\u0661"+
					"\u0663\7C\2\2\u0662\u0664\5*\26\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2"+
					"\2\2\u0664\u0665\3\2\2\2\u0665\u0666\7h\2\2\u0666\u0668\7;\2\2\u0667\u0669"+
					"\5\u0106\u0084\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3"+
					"\2\2\2\u066a\u066b\7<\2\2\u066b\u0686\3\2\2\2\u066c\u066d\7*\2\2\u066d"+
					"\u066f\7C\2\2\u066e\u0670\5*\26\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2"+
					"\2\2\u0670\u0671\3\2\2\2\u0671\u0672\7h\2\2\u0672\u0674\7;\2\2\u0673\u0675"+
					"\5\u0106\u0084\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3"+
					"\2\2\2\u0676\u0686\7<\2\2\u0677\u0678\5\66\34\2\u0678\u0679\7C\2\2\u0679"+
					"\u067a\7*\2\2\u067a\u067c\7C\2\2\u067b\u067d\5*\26\2\u067c\u067b\3\2\2"+
					"\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\7h\2\2\u067f\u0681"+
					"\7;\2\2\u0680\u0682\5\u0106\u0084\2\u0681\u0680\3\2\2\2\u0681\u0682\3"+
					"\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\7<\2\2\u0684\u0686\3\2\2\2\u0685"+
					"\u064d\3\2\2\2\u0685\u0654\3\2\2\2\u0685\u0660\3\2\2\2\u0685\u066c\3\2"+
					"\2\2\u0685\u0677\3\2\2\2\u0686\u0105\3\2\2\2\u0687\u068c\5\u0114\u008b"+
					"\2\u0688\u0689\7B\2\2\u0689\u068b\5\u0114\u008b\2\u068a\u0688\3\2\2\2"+
					"\u068b\u068e\3\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u0107"+
					"\3\2\2\2\u068e\u068c\3\2\2\2\u068f\u0690\5:\36\2\u0690\u0692\7\\\2\2\u0691"+
					"\u0693\5*\26\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2"+
					"\2\2\u0694\u0695\7h\2\2\u0695\u06bf\3\2\2\2\u0696\u0697\5\f\7\2\u0697"+
					"\u0699\7\\\2\2\u0698\u069a\5*\26\2\u0699\u0698\3\2\2\2\u0699\u069a\3\2"+
					"\2\2\u069a\u069b\3\2\2\2\u069b\u069c\7h\2\2\u069c\u06bf\3\2\2\2\u069d"+
					"\u069e\5\u00dco\2\u069e\u06a0\7\\\2\2\u069f\u06a1\5*\26\2\u06a0\u069f"+
					"\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\7h\2\2\u06a3"+
					"\u06bf\3\2\2\2\u06a4\u06a5\7*\2\2\u06a5\u06a7\7\\\2\2\u06a6\u06a8\5*\26"+
					"\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06bf"+
					"\7h\2\2\u06aa\u06ab\5\66\34\2\u06ab\u06ac\7C\2\2\u06ac\u06ad\7*\2\2\u06ad"+
					"\u06af\7\\\2\2\u06ae\u06b0\5*\26\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2"+
					"\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\7h\2\2\u06b2\u06bf\3\2\2\2\u06b3"+
					"\u06b4\5\20\t\2\u06b4\u06b6\7\\\2\2\u06b5\u06b7\5*\26\2\u06b6\u06b5\3"+
					"\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\7!\2\2\u06b9"+
					"\u06bf\3\2\2\2\u06ba\u06bb\5\36\20\2\u06bb\u06bc\7\\\2\2\u06bc\u06bd\7"+
					"!\2\2\u06bd\u06bf\3\2\2\2\u06be\u068f\3\2\2\2\u06be\u0696\3\2\2\2\u06be"+
					"\u069d\3\2\2\2\u06be\u06a4\3\2\2\2\u06be\u06aa\3\2\2\2\u06be\u06b3\3\2"+
					"\2\2\u06be\u06ba\3\2\2\2\u06bf\u0109\3\2\2\2\u06c0\u06c2\7\\\2\2\u06c1"+
					"\u06c3\5*\26\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\3\2"+
					"\2\2\u06c4\u06c5\7h\2\2\u06c5\u010b\3\2\2\2\u06c6\u06c7\5:\36\2\u06c7"+
					"\u06c9\7\\\2\2\u06c8\u06ca\5*\26\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2"+
					"\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\7h\2\2\u06cc\u06ef\3\2\2\2\u06cd"+
					"\u06ce\5\f\7\2\u06ce\u06d0\7\\\2\2\u06cf\u06d1\5*\26\2\u06d0\u06cf\3\2"+
					"\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\7h\2\2\u06d3"+
					"\u06ef\3\2\2\2\u06d4\u06d5\7*\2\2\u06d5\u06d7\7\\\2\2\u06d6\u06d8\5*\26"+
					"\2\u06d7\u06d6\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06ef"+
					"\7h\2\2\u06da\u06db\5\66\34\2\u06db\u06dc\7C\2\2\u06dc\u06dd\7*\2\2\u06dd"+
					"\u06df\7\\\2\2\u06de\u06e0\5*\26\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2"+
					"\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06e2\7h\2\2\u06e2\u06ef\3\2\2\2\u06e3"+
					"\u06e4\5\20\t\2\u06e4\u06e6\7\\\2\2\u06e5\u06e7\5*\26\2\u06e6\u06e5\3"+
					"\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\7!\2\2\u06e9"+
					"\u06ef\3\2\2\2\u06ea\u06eb\5\36\20\2\u06eb\u06ec\7\\\2\2\u06ec\u06ed\7"+
					"!\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06c6\3\2\2\2\u06ee\u06cd\3\2\2\2\u06ee"+
					"\u06d4\3\2\2\2\u06ee\u06da\3\2\2\2\u06ee\u06e3\3\2\2\2\u06ee\u06ea\3\2"+
					"\2\2\u06ef\u010d\3\2\2\2\u06f0\u06f1\7!\2\2\u06f1\u06f2\5\4\3\2\u06f2"+
					"\u06f4\5\u0110\u0089\2\u06f3\u06f5\5 \21\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5"+
					"\3\2\2\2\u06f5\u0707\3\2\2\2\u06f6\u06f7\7!\2\2\u06f7\u06f8\5\16\b\2\u06f8"+
					"\u06fa\5\u0110\u0089\2\u06f9\u06fb\5 \21\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb"+
					"\3\2\2\2\u06fb\u0707\3\2\2\2\u06fc\u06fd\7!\2\2\u06fd\u06fe\5\4\3\2\u06fe"+
					"\u06ff\5 \21\2\u06ff\u0700\5\u00bc_\2\u0700\u0707\3\2\2\2\u0701\u0702"+
					"\7!\2\2\u0702\u0703\5\16\b\2\u0703\u0704\5 \21\2\u0704\u0705\5\u00bc_"+
					"\2\u0705\u0707\3\2\2\2\u0706\u06f0\3\2\2\2\u0706\u06f6\3\2\2\2\u0706\u06fc"+
					"\3\2\2\2\u0706\u0701\3\2\2\2\u0707\u010f\3\2\2\2\u0708\u070c\5\u0112\u008a"+
					"\2\u0709\u070b\5\u0112\u008a\2\u070a\u0709\3\2\2\2\u070b\u070e\3\2\2\2"+
					"\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0111\3\2\2\2\u070e\u070c"+
					"\3\2\2\2\u070f\u0711\5\u00aaV\2\u0710\u070f\3\2\2\2\u0711\u0714\3\2\2"+
					"\2\u0712\u0710\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0715\3\2\2\2\u0714\u0712"+
					"\3\2\2\2\u0715\u0716\7?\2\2\u0716\u0717\5\u0114\u008b\2\u0717\u0718\7"+
					"@\2\2\u0718\u0113\3\2\2\2\u0719\u071c\5\u0116\u008c\2\u071a\u071c\5\u011e"+
					"\u0090\2\u071b\u0719\3\2\2\2\u071b\u071a\3\2\2\2\u071c\u0115\3\2\2\2\u071d"+
					"\u071e\5\u0118\u008d\2\u071e\u071f\7[\2\2\u071f\u0720\5\u011c\u008f\2"+
					"\u0720\u0117\3\2\2\2\u0721\u072c\7h\2\2\u0722\u0724\7;\2\2\u0723\u0725"+
					"\5\u008aF\2\u0724\u0723\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0726\3\2\2"+
					"\2\u0726\u072c\7<\2\2\u0727\u0728\7;\2\2\u0728\u0729\5\u011a\u008e\2\u0729"+
					"\u072a\7<\2\2\u072a\u072c\3\2\2\2\u072b\u0721\3\2\2\2\u072b\u0722\3\2"+
					"\2\2\u072b\u0727\3\2\2\2\u072c\u0119\3\2\2\2\u072d\u0732\7h\2\2\u072e"+
					"\u072f\7B\2\2\u072f\u0731\7h\2\2\u0730\u072e\3\2\2\2\u0731\u0734\3\2\2"+
					"\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u011b\3\2\2\2\u0734\u0732"+
					"\3\2\2\2\u0735\u0738\5\u0114\u008b\2\u0736\u0738\5\u00c0a\2\u0737\u0735"+
					"\3\2\2\2\u0737\u0736\3\2\2\2\u0738\u011d\3\2\2\2\u0739\u073c\5\u0126\u0094"+
					"\2\u073a\u073c\5\u0120\u0091\2\u073b\u0739\3\2\2\2\u073b\u073a\3\2\2\2"+
					"\u073c\u011f\3\2\2\2\u073d\u073e\5\u0122\u0092\2\u073e\u073f\5\u0124\u0093"+
					"\2\u073f\u0740\5\u0114\u008b\2\u0740\u0121\3\2\2\2\u0741\u0745\5:\36\2"+
					"\u0742\u0745\5\u00f4{\2\u0743\u0745\5\u00fa~\2\u0744\u0741\3\2\2\2\u0744"+
					"\u0742\3\2\2\2\u0744\u0743\3\2\2\2\u0745\u0123\3\2\2\2\u0746\u0747\t\6"+
					"\2\2\u0747\u0125\3\2\2\2\u0748\u0750\5\u0128\u0095\2\u0749\u074a\5\u0128"+
					"\u0095\2\u074a\u074b\7I\2\2\u074b\u074c\5\u0114\u008b\2\u074c\u074d\7"+
					"J\2\2\u074d\u074e\5\u0126\u0094\2\u074e\u0750\3\2\2\2\u074f\u0748\3\2"+
					"\2\2\u074f\u0749\3\2\2\2\u0750\u0127\3\2\2\2\u0751\u0752\b\u0095\1\2\u0752"+
					"\u0753\5\u012a\u0096\2\u0753\u0759\3\2\2\2\u0754\u0755\f\3\2\2\u0755\u0756"+
					"\7P\2\2\u0756\u0758\5\u012a\u0096\2\u0757\u0754\3\2\2\2\u0758\u075b\3"+
					"\2\2\2\u0759\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u0129\3\2\2\2\u075b"+
					"\u0759\3\2\2\2\u075c\u075d\b\u0096\1\2\u075d\u075e\5\u012c\u0097\2\u075e"+
					"\u0764\3\2\2\2\u075f\u0760\f\3\2\2\u0760\u0761\7O\2\2\u0761\u0763\5\u012c"+
					"\u0097\2\u0762\u075f\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762\3\2\2\2\u0764"+
					"\u0765\3\2\2\2\u0765\u012b\3\2\2\2\u0766\u0764\3\2\2\2\u0767\u0768\b\u0097"+
					"\1\2\u0768\u0769\5\u012e\u0098\2\u0769\u076f\3\2\2\2\u076a\u076b\f\3\2"+
					"\2\u076b\u076c\7X\2\2\u076c\u076e\5\u012e\u0098\2\u076d\u076a\3\2\2\2"+
					"\u076e\u0771\3\2\2\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u012d"+
					"\3\2\2\2\u0771\u076f\3\2\2\2\u0772\u0773\b\u0098\1\2\u0773\u0774\5\u0130"+
					"\u0099\2\u0774\u077a\3\2\2\2\u0775\u0776\f\3\2\2\u0776\u0777\7Y\2\2\u0777"+
					"\u0779\5\u0130\u0099\2\u0778\u0775\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u0778"+
					"\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u012f\3\2\2\2\u077c\u077a\3\2\2\2\u077d"+
					"\u077e\b\u0099\1\2\u077e\u077f\5\u0132\u009a\2\u077f\u0785\3\2\2\2\u0780"+
					"\u0781\f\3\2\2\u0781\u0782\7W\2\2\u0782\u0784\5\u0132\u009a\2\u0783\u0780"+
					"\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786"+
					"\u0131\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0789\b\u009a\1\2\u0789\u078a"+
					"\5\u0134\u009b\2\u078a\u0793\3\2\2\2\u078b\u078c\f\4\2\2\u078c\u078d\7"+
					"K\2\2\u078d\u0792\5\u0134\u009b\2\u078e\u078f\f\3\2\2\u078f\u0790\7N\2"+
					"\2\u0790\u0792\5\u0134\u009b\2\u0791\u078b\3\2\2\2\u0791\u078e\3\2\2\2"+
					"\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0133"+
					"\3\2\2\2\u0795\u0793\3\2\2\2\u0796\u0797\b\u009b\1\2\u0797\u0798\5\u0136"+
					"\u009c\2\u0798\u07aa\3\2\2\2\u0799\u079a\f\7\2\2\u079a\u079b\7F\2\2\u079b"+
					"\u07a9\5\u0136\u009c\2\u079c\u079d\f\6\2\2\u079d\u079e\7E\2\2\u079e\u07a9"+
					"\5\u0136\u009c\2\u079f\u07a0\f\5\2\2\u07a0\u07a1\7L\2\2\u07a1\u07a9\5"+
					"\u0136\u009c\2\u07a2\u07a3\f\4\2\2\u07a3\u07a4\7M\2\2\u07a4\u07a9\5\u0136"+
					"\u009c\2\u07a5\u07a6\f\3\2\2\u07a6\u07a7\7\34\2\2\u07a7\u07a9\5\f\7\2"+
					"\u07a8\u0799\3\2\2\2\u07a8\u079c\3\2\2\2\u07a8\u079f\3\2\2\2\u07a8\u07a2"+
					"\3\2\2\2\u07a8\u07a5\3\2\2\2\u07a9\u07ac\3\2\2\2\u07aa\u07a8\3\2\2\2\u07aa"+
					"\u07ab\3\2\2\2\u07ab\u0135\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ad\u07ae\5\u0138"+
					"\u009d\2\u07ae\u0137\3\2\2\2\u07af\u07b0\b\u009d\1\2\u07b0\u07b1\5\u013a"+
					"\u009e\2\u07b1\u07ba\3\2\2\2\u07b2\u07b3\f\4\2\2\u07b3\u07b4\7S\2\2\u07b4"+
					"\u07b9\5\u013a\u009e\2\u07b5\u07b6\f\3\2\2\u07b6\u07b7\7T\2\2\u07b7\u07b9"+
					"\5\u013a\u009e\2\u07b8\u07b2\3\2\2\2\u07b8\u07b5\3\2\2\2\u07b9\u07bc\3"+
					"\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u0139\3\2\2\2\u07bc"+
					"\u07ba\3\2\2\2\u07bd\u07be\b\u009e\1\2\u07be\u07bf\5\u013c\u009f\2\u07bf"+
					"\u07cb\3\2\2\2\u07c0\u07c1\f\5\2\2\u07c1\u07c2\7U\2\2\u07c2\u07ca\5\u013c"+
					"\u009f\2\u07c3\u07c4\f\4\2\2\u07c4\u07c5\7V\2\2\u07c5\u07ca\5\u013c\u009f"+
					"\2\u07c6\u07c7\f\3\2\2\u07c7\u07c8\7Z\2\2\u07c8\u07ca\5\u013c\u009f\2"+
					"\u07c9\u07c0\3\2\2\2\u07c9\u07c3\3\2\2\2\u07c9\u07c6\3\2\2\2\u07ca\u07cd"+
					"\3\2\2\2\u07cb\u07c9\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u013b\3\2\2\2\u07cd"+
					"\u07cb\3\2\2\2\u07ce\u07cf\7S\2\2\u07cf\u07d4\5\u013c\u009f\2\u07d0\u07d1"+
					"\7T\2\2\u07d1\u07d4\5\u013c\u009f\2\u07d2\u07d4\5\u013e\u00a0\2\u07d3"+
					"\u07ce\3\2\2\2\u07d3\u07d0\3\2\2\2\u07d3\u07d2\3\2\2\2\u07d4\u013d\3\2"+
					"\2\2\u07d5\u07dc\5\u0140\u00a1\2\u07d6\u07d7\7H\2\2\u07d7\u07dc\5\u013c"+
					"\u009f\2\u07d8\u07d9\7G\2\2\u07d9\u07dc\5\u013c\u009f\2\u07da\u07dc\5"+
					"\u0142\u00a2\2\u07db\u07d5\3\2\2\2\u07db\u07d6\3\2\2\2\u07db\u07d8\3\2"+
					"\2\2\u07db\u07da\3\2\2\2\u07dc\u013f\3\2\2\2\u07dd\u07e0\5\u00dco\2\u07de"+
					"\u07e0\5:\36\2\u07df\u07dd\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u0141\3\2"+
					"\2\2\u07e1\u07e2\7;\2\2\u07e2\u07e3\5\4\3\2\u07e3\u07e4\7<\2\2\u07e4\u07e5"+
					"\5\u013c\u009f\2\u07e5\u07fd\3\2\2\2\u07e6\u07e7\7;\2\2\u07e7\u07eb\5"+
					"\f\7\2\u07e8\u07ea\5(\25\2\u07e9\u07e8\3\2\2\2\u07ea\u07ed\3\2\2\2\u07eb"+
					"\u07e9\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07eb\3\2"+
					"\2\2\u07ee\u07ef\7<\2\2\u07ef\u07f0\5\u013e\u00a0\2\u07f0\u07fd\3\2\2"+
					"\2\u07f1\u07f2\7;\2\2\u07f2\u07f6\5\f\7\2\u07f3\u07f5\5(\25\2\u07f4\u07f3"+
					"\3\2\2\2\u07f5\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7"+
					"\u07f9\3\2\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fa\7<\2\2\u07fa\u07fb\5\u0116"+
					"\u008c\2\u07fb\u07fd\3\2\2\2\u07fc\u07e1\3\2\2\2\u07fc\u07e6\3\2\2\2\u07fc"+
					"\u07f1\3\2\2\2\u07fd\u0143\3\2\2\2\u00fc\u0149\u0150\u0154\u0158\u0161"+
					"\u0165\u0169\u016b\u0171\u0176\u017d\u0182\u0184\u018a\u018f\u0194\u0199"+
					"\u01a4\u01b2\u01b7\u01bf\u01c6\u01cc\u01d1\u01dc\u01df\u01ed\u01f2\u01f7"+
					"\u01fc\u0202\u020c\u0214\u021e\u0226\u0232\u0236\u023b\u0241\u0249\u0254"+
					"\u0262\u0269\u026f\u0272\u027e\u0289\u0293\u029a\u02a0\u02a5\u02b4\u02bb"+
					"\u02c1\u02c5\u02c9\u02cd\u02d1\u02d6\u02da\u02de\u02e0\u02e7\u02ec\u02f0"+
					"\u0301\u0306\u0316\u031b\u0321\u0327\u0329\u032d\u0332\u0336\u033e\u0345"+
					"\u034d\u0350\u0355\u035d\u0362\u0369\u0370\u0375\u037b\u0387\u038c\u0390"+
					"\u0395\u039a\u03a2\u03a5\u03aa\u03b2\u03b5\u03ba\u03bf\u03c4\u03c9\u03d0"+
					"\u03d5\u03dd\u03e2\u03e7\u03ec\u03f2\u03fb\u0405\u0409\u040c\u0415\u0423"+
					"\u0426\u042f\u0434\u043b\u0440\u0448\u0450\u0454\u045a\u046c\u0470\u0476"+
					"\u047b\u0484\u049a\u04a1\u04a9\u04b1\u04bc\u04d3\u04dd\u04e8\u04fe\u0502"+
					"\u0507\u050f\u0515\u0519\u051d\u0521\u0527\u052c\u0531\u0535\u0539\u053f"+
					"\u0544\u0549\u054d\u0551\u0553\u0558\u055d\u0562\u0566\u056a\u056e\u0573"+
					"\u057b\u0581\u0585\u0589\u058d\u0593\u0598\u059d\u05a1\u05a5\u05a7\u05ac"+
					"\u05bb\u05c9\u05d5\u05e3\u05f0\u05f9\u05ff\u0606\u060b\u0612\u0617\u061e"+
					"\u0623\u062a\u062f\u0637\u063c\u0640\u0644\u0649\u0650\u0657\u065c\u0663"+
					"\u0668\u066f\u0674\u067c\u0681\u0685\u068c\u0692\u0699\u06a0\u06a7\u06af"+
					"\u06b6\u06be\u06c2\u06c9\u06d0\u06d7\u06df\u06e6\u06ee\u06f4\u06fa\u0706"+
					"\u070c\u0712\u071b\u0724\u072b\u0732\u0737\u073b\u0744\u074f\u0759\u0764"+
					"\u076f\u077a\u0785\u0791\u0793\u07a8\u07aa\u07b8\u07ba\u07c9\u07cb\u07d3"+
					"\u07db\u07df\u07eb\u07f6\u07fc";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	private static final String[] _LITERAL_NAMES = {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'",
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'",
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'",
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'",
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'",
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'",
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'",
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null,
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'",
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'",
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'",
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='",
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='",
			"'>>>='", null, "'@'", "'...'"
	};

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

	private static final String[] _SYMBOLIC_NAMES = {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH",
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE",
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS",
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE",
			"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP",
			"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT",
			"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral",
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral",
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA",
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL",
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL",
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN",
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN",
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier",
			"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java8Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(322);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
					_errHandler.recoverInline(this);
				} else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(324);
								annotation();
							}
						}
						setState(329);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(330);
					numericType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(331);
								annotation();
							}
						}
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(337);
					match(BOOLEAN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericType);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BYTE:
				case CHAR:
				case INT:
				case LONG:
				case SHORT:
					enterOuterAlt(_localctx, 1);
				{
					setState(340);
					integralType();
				}
				break;
				case DOUBLE:
				case FLOAT:
					enterOuterAlt(_localctx, 2);
				{
					setState(341);
					floatingPointType();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(344);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
					_errHandler.recoverInline(this);
				} else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==FLOAT) ) {
					_errHandler.recoverInline(this);
				} else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceType);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(348);
					classOrInterfaceType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(349);
					typeVariable();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(350);
					arrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1: {
						setState(353);
						classType_lfno_classOrInterfaceType();
					}
					break;
					case 2: {
						setState(354);
						interfaceType_lfno_classOrInterfaceType();
					}
					break;
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							setState(359);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
								case 1: {
									setState(357);
									classType_lf_classOrInterfaceType();
								}
								break;
								case 2: {
									setState(358);
									interfaceType_lf_classOrInterfaceType();
								}
								break;
							}
						}
					}
					setState(363);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classType);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(364);
								annotation();
							}
						}
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(370);
					match(Identifier);
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(371);
							typeArguments();
						}
					}

				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(374);
					classOrInterfaceType();
					setState(375);
					match(DOT);
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(376);
								annotation();
							}
						}
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(382);
					match(Identifier);
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(383);
							typeArguments();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(388);
				match(DOT);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(389);
							annotation();
						}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				match(Identifier);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1: {
						setState(396);
						typeArguments();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(399);
							annotation();
						}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(Identifier);
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1: {
						setState(406);
						typeArguments();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(409);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(411);
				classType_lf_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(413);
				classType_lfno_classOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(415);
							annotation();
						}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayType);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(423);
					primitiveType();
					setState(424);
					dims();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(426);
					classOrInterfaceType();
					setState(427);
					dims();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(429);
					typeVariable();
					setState(430);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(434);
							annotation();
						}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(LBRACK);
				setState(441);
				match(RBRACK);
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(445);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==AT) {
									{
										{
											setState(442);
											annotation();
										}
									}
									setState(447);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(448);
								match(LBRACK);
								setState(449);
								match(RBRACK);
							}
						}
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(455);
							typeParameterModifier();
						}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461);
				match(Identifier);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
						setState(462);
						typeBound();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(465);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeBound);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(467);
					match(EXTENDS);
					setState(468);
					typeVariable();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(469);
					match(EXTENDS);
					setState(470);
					classOrInterfaceType();
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BITAND) {
						{
							{
								setState(471);
								additionalBound();
							}
						}
						setState(476);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(479);
				match(BITAND);
				setState(480);
				interfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(482);
				match(LT);
				setState(483);
				typeArgumentList();
				setState(484);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(486);
				typeArgument();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(487);
							match(COMMA);
							setState(488);
							typeArgument();
						}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgument);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(494);
					referenceType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(495);
					wildcard();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(498);
							annotation();
						}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
				match(QUESTION);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
						setState(505);
						wildcardBounds();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcardBounds);
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case EXTENDS:
					enterOuterAlt(_localctx, 1);
				{
					setState(508);
					match(EXTENDS);
					setState(509);
					referenceType();
				}
				break;
				case SUPER:
					enterOuterAlt(_localctx, 2);
				{
					setState(510);
					match(SUPER);
					setState(511);
					referenceType();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(515);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageNameContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_packageName);
								setState(517);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(518);
								match(DOT);
								setState(519);
								match(Identifier);
							}
						}
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeName);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(525);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(526);
					packageOrTypeName(0);
					setState(527);
					match(DOT);
					setState(528);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(533);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
								setState(535);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(536);
								match(DOT);
								setState(537);
								match(Identifier);
							}
						}
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionName);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(543);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(544);
					ambiguousName(0);
					setState(545);
					match(DOT);
					setState(546);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(550);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(553);
					match(Identifier);
				}
				_ctx.stop = _input.LT(-1);
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AmbiguousNameContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
								setState(555);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(556);
								match(DOT);
								setState(557);
								match(Identifier);
							}
						}
					}
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1: {
						setState(563);
						packageDeclaration();
					}
					break;
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
						{
							setState(566);
							importDeclaration();
						}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
					{
						{
							setState(572);
							typeDeclaration();
						}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(580);
							packageModifier();
						}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(PACKAGE);
				setState(587);
				packageName(0);
				setState(588);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(590);
				annotation();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importDeclaration);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(592);
					singleTypeImportDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(593);
					typeImportOnDemandDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(596);
				match(IMPORT);
				setState(597);
				typeName();
				setState(598);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(600);
				match(IMPORT);
				setState(601);
				packageOrTypeName(0);
				setState(602);
				match(DOT);
				setState(603);
				match(MUL);
				setState(604);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeDeclaration);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ABSTRACT:
				case CLASS:
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(606);
					classDeclaration();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(607);
					match(SEMI);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(610);
				normalClassDeclaration();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
						{
							setState(612);
							classModifier();
						}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				match(CLASS);
				setState(619);
				match(Identifier);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(620);
						typeParameters();
					}
				}

				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==IMPLEMENTS) {
					{
						setState(623);
						superclass();
					}
				}

				setState(626);
				classBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classModifier);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(628);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(629);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(630);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(631);
					match(PRIVATE);
				}
				break;
				case ABSTRACT:
					enterOuterAlt(_localctx, 5);
				{
					setState(632);
					match(ABSTRACT);
				}
				break;
				case STATIC:
					enterOuterAlt(_localctx, 6);
				{
					setState(633);
					match(STATIC);
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 7);
				{
					setState(634);
					match(FINAL);
				}
				break;
				case STRICTFP:
					enterOuterAlt(_localctx, 8);
				{
					setState(635);
					match(STRICTFP);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(638);
				match(LT);
				setState(639);
				typeParameterList();
				setState(640);
				match(GT);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(642);
				typeParameter();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(643);
							match(COMMA);
							setState(644);
							typeParameter();
						}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_superclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
					_errHandler.recoverInline(this);
				} else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(651);
				classType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(653);
				match(LBRACE);
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
						{
							setState(654);
							classBodyDeclaration();
						}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_classBodyDeclaration);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(662);
					classMemberDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(663);
					constructorDeclaration();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classMemberDeclaration);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(666);
					fieldDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(667);
					methodDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(668);
					classDeclaration();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(669);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
					{
						{
							setState(672);
							fieldModifier();
						}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				unannType();
				setState(679);
				variableDeclaratorList();
				setState(680);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldModifier);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(682);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(683);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(684);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(685);
					match(PRIVATE);
				}
				break;
				case STATIC:
					enterOuterAlt(_localctx, 5);
				{
					setState(686);
					match(STATIC);
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 6);
				{
					setState(687);
					match(FINAL);
				}
				break;
				case TRANSIENT:
					enterOuterAlt(_localctx, 7);
				{
					setState(688);
					match(TRANSIENT);
				}
				break;
				case VOLATILE:
					enterOuterAlt(_localctx, 8);
				{
					setState(689);
					match(VOLATILE);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(692);
				variableDeclarator();
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(693);
							match(COMMA);
							setState(694);
							variableDeclarator();
						}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(700);
				variableDeclaratorId();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
						setState(701);
						match(ASSIGN);
						setState(702);
						variableInitializer();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(705);
				match(Identifier);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==AT) {
					{
						setState(706);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableInitializer);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case NEW:
				case SHORT:
				case SUPER:
				case THIS:
				case VOID:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case BANG:
				case TILDE:
				case ADD:
				case SUB:
				case Identifier:
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(709);
					expression();
				}
				break;
				case LBRACE:
					enterOuterAlt(_localctx, 2);
				{
					setState(710);
					arrayInitializer();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unannType);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(713);
					unannPrimitiveType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(714);
					unannReferenceType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unannPrimitiveType);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					enterOuterAlt(_localctx, 1);
				{
					setState(717);
					numericType();
				}
				break;
				case BOOLEAN:
					enterOuterAlt(_localctx, 2);
				{
					setState(718);
					match(BOOLEAN);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unannReferenceType);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(721);
					unannClassOrInterfaceType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(722);
					unannTypeVariable();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(723);
					unannArrayType();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1: {
						setState(726);
						unannClassType_lfno_unannClassOrInterfaceType();
					}
					break;
					case 2: {
						setState(727);
						unannInterfaceType_lfno_unannClassOrInterfaceType();
					}
					break;
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
						setState(732);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
							case 1: {
								setState(730);
								unannClassType_lf_unannClassOrInterfaceType();
							}
							break;
							case 2: {
								setState(731);
								unannInterfaceType_lf_unannClassOrInterfaceType();
							}
							break;
						}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(737);
				match(DOT);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(738);
							annotation();
						}
					}
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(744);
				match(Identifier);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(745);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(748);
				match(Identifier);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(749);
						typeArguments();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(752);
				unannClassType_lf_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(754);
				unannClassType_lfno_unannClassOrInterfaceType();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(756);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannArrayType);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(758);
					unannPrimitiveType();
					setState(759);
					dims();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(761);
					unannClassOrInterfaceType();
					setState(762);
					dims();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(764);
					unannTypeVariable();
					setState(765);
					dims();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
					{
						{
							setState(769);
							methodModifier();
						}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				methodHeader();
				setState(776);
				methodBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_methodModifier);
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(778);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(779);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(780);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(781);
					match(PRIVATE);
				}
				break;
				case ABSTRACT:
					enterOuterAlt(_localctx, 5);
				{
					setState(782);
					match(ABSTRACT);
				}
				break;
				case STATIC:
					enterOuterAlt(_localctx, 6);
				{
					setState(783);
					match(STATIC);
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 7);
				{
					setState(784);
					match(FINAL);
				}
				break;
				case SYNCHRONIZED:
					enterOuterAlt(_localctx, 8);
				{
					setState(785);
					match(SYNCHRONIZED);
				}
				break;
				case NATIVE:
					enterOuterAlt(_localctx, 9);
				{
					setState(786);
					match(NATIVE);
				}
				break;
				case STRICTFP:
					enterOuterAlt(_localctx, 10);
				{
					setState(787);
					match(STRICTFP);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_methodHeader);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case VOID:
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(790);
					result();
					setState(791);
					methodDeclarator();
					setState(793);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THROWS) {
						{
							setState(792);
							throws_();
						}
					}

				}
				break;
				case LT:
					enterOuterAlt(_localctx, 2);
				{
					setState(795);
					typeParameters();
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(796);
								annotation();
							}
						}
						setState(801);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(802);
					result();
					setState(803);
					methodDeclarator();
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THROWS) {
						{
							setState(804);
							throws_();
						}
					}

				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_result);
		try {
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(809);
					unannType();
				}
				break;
				case VOID:
					enterOuterAlt(_localctx, 2);
				{
					setState(810);
					match(VOID);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(813);
				match(Identifier);
				setState(814);
				match(LPAREN);
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
						setState(815);
						formalParameterList();
					}
				}

				setState(818);
				match(RPAREN);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==AT) {
					{
						setState(819);
						dims();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_formalParameterList);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(822);
					receiverParameter();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(823);
					formalParameters();
					setState(824);
					match(COMMA);
					setState(825);
					lastFormalParameter();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(827);
					lastFormalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_formalParameters);
		try {
			int _alt;
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(830);
					formalParameter();
					setState(835);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(831);
									match(COMMA);
									setState(832);
									formalParameter();
								}
							}
						}
						setState(837);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(838);
					receiverParameter();
					setState(843);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
								{
									setState(839);
									match(COMMA);
									setState(840);
									formalParameter();
								}
							}
						}
						setState(845);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
						{
							setState(848);
							variableModifier();
						}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(854);
				unannType();
				setState(855);
				variableDeclaratorId();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableModifier);
		try {
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(857);
					annotation();
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(858);
					match(FINAL);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_lastFormalParameter);
		int _la;
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==FINAL || _la==AT) {
						{
							{
								setState(861);
								variableModifier();
							}
						}
						setState(866);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(867);
					unannType();
					setState(871);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(868);
								annotation();
							}
						}
						setState(873);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(874);
					match(ELLIPSIS);
					setState(875);
					variableDeclaratorId();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(877);
					formalParameter();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(880);
							annotation();
						}
					}
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(886);
				unannType();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
						setState(887);
						match(Identifier);
						setState(888);
						match(DOT);
					}
				}

				setState(891);
				match(THIS);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(893);
				match(THROWS);
				setState(894);
				exceptionTypeList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(896);
				exceptionType();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(897);
							match(COMMA);
							setState(898);
							exceptionType();
						}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_exceptionType);
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(904);
					classType();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(905);
					typeVariable();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodBody);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(908);
					block();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(909);
					match(SEMI);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
					{
						{
							setState(912);
							constructorModifier();
						}
					}
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				constructorDeclarator();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
						setState(919);
						throws_();
					}
				}

				setState(922);
				constructorBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constructorModifier);
		try {
			setState(928);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(924);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(925);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(926);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(927);
					match(PRIVATE);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(930);
						typeParameters();
					}
				}

				setState(933);
				simpleTypeName();
				setState(934);
				match(LPAREN);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
						setState(935);
						formalParameterList();
					}
				}

				setState(938);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(940);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(942);
				match(LBRACE);
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1: {
						setState(943);
						explicitConstructorInvocation();
					}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
					{
						setState(946);
						blockStatements();
					}
				}

				setState(949);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(951);
							typeArguments();
						}
					}

					setState(954);
					match(THIS);
					setState(955);
					match(LPAREN);
					setState(957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(956);
							argumentList();
						}
					}

					setState(959);
					match(RPAREN);
					setState(960);
					match(SEMI);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(961);
							typeArguments();
						}
					}

					setState(964);
					match(SUPER);
					setState(965);
					match(LPAREN);
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(966);
							argumentList();
						}
					}

					setState(969);
					match(RPAREN);
					setState(970);
					match(SEMI);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(971);
					expressionName();
					setState(972);
					match(DOT);
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(973);
							typeArguments();
						}
					}

					setState(976);
					match(SUPER);
					setState(977);
					match(LPAREN);
					setState(979);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(978);
							argumentList();
						}
					}

					setState(981);
					match(RPAREN);
					setState(982);
					match(SEMI);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(984);
					primary();
					setState(985);
					match(DOT);
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(986);
							typeArguments();
						}
					}

					setState(989);
					match(SUPER);
					setState(990);
					match(LPAREN);
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(991);
							argumentList();
						}
					}

					setState(994);
					match(RPAREN);
					setState(995);
					match(SEMI);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_annotation);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(999);
					normalAnnotation();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1000);
					markerAnnotation();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1001);
					singleElementAnnotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1004);
				match(AT);
				setState(1005);
				typeName();
				setState(1006);
				match(LPAREN);
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
						setState(1007);
						elementValuePairList();
					}
				}

				setState(1010);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1012);
				elementValuePair();
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1013);
							match(COMMA);
							setState(1014);
							elementValuePair();
						}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1020);
				match(Identifier);
				setState(1021);
				match(ASSIGN);
				setState(1022);
				elementValue();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elementValue);
		try {
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1024);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1025);
					elementValueArrayInitializer();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1026);
					annotation();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1029);
				match(LBRACE);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(1030);
						elementValueList();
					}
				}

				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
						setState(1033);
						match(COMMA);
					}
				}

				setState(1036);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1038);
				elementValue();
				setState(1043);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1039);
								match(COMMA);
								setState(1040);
								elementValue();
							}
						}
					}
					setState(1045);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1046);
				match(AT);
				setState(1047);
				typeName();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1049);
				match(AT);
				setState(1050);
				typeName();
				setState(1051);
				match(LPAREN);
				setState(1052);
				elementValue();
				setState(1053);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1055);
				match(LBRACE);
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(1056);
						variableInitializerList();
					}
				}

				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
						setState(1059);
						match(COMMA);
					}
				}

				setState(1062);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1064);
				variableInitializer();
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1065);
								match(COMMA);
								setState(1066);
								variableInitializer();
							}
						}
					}
					setState(1071);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1072);
				match(LBRACE);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
					{
						setState(1073);
						blockStatements();
					}
				}

				setState(1076);
				match(RBRACE);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(1078);
							blockStatement();
						}
					}
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT );
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_blockStatement);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1083);
					localVariableDeclarationStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1084);
					classDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1085);
					statement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1088);
				localVariableDeclaration();
				setState(1089);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
						{
							setState(1091);
							variableModifier();
						}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
				unannType();
				setState(1098);
				variableDeclaratorList();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_statement);
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1100);
					statementWithoutTrailingSubstatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1101);
					labeledStatement();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_statementNoShortIf);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1104);
					statementWithoutTrailingSubstatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1105);
					labeledStatementNoShortIf();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(1108);
					block();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(1109);
					emptyStatement();
				}
				break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case NEW:
				case SHORT:
				case SUPER:
				case THIS:
				case VOID:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case Identifier:
				case AT:
					enterOuterAlt(_localctx, 3);
				{
					setState(1110);
					expressionStatement();
				}
				break;
				case RETURN:
					enterOuterAlt(_localctx, 4);
				{
					setState(1111);
					returnStatement();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1114);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1116);
				match(Identifier);
				setState(1117);
				match(COLON);
				setState(1118);
				statement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1120);
				match(Identifier);
				setState(1121);
				match(COLON);
				setState(1122);
				statementNoShortIf();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1124);
				statementExpression();
				setState(1125);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_statementExpression);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1127);
					assignment();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1128);
					methodInvocation();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1129);
					classInstanceCreationExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1132);
				match(RETURN);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(1133);
						expression();
					}
				}

				setState(1136);
				match(SEMI);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1: {
						setState(1138);
						primaryNoNewArray_lfno_primary();
					}
					break;
					case 2: {
						setState(1139);
						arrayCreationExpression();
					}
					break;
				}
				setState(1145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1142);
								primaryNoNewArray_lf_primary();
							}
						}
					}
					setState(1147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1148);
					literal();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1149);
					typeName();
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1150);
								match(LBRACK);
								setState(1151);
								match(RBRACK);
							}
						}
						setState(1156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1157);
					match(DOT);
					setState(1158);
					match(CLASS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1160);
					match(VOID);
					setState(1161);
					match(DOT);
					setState(1162);
					match(CLASS);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1163);
					match(THIS);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1164);
					typeName();
					setState(1165);
					match(DOT);
					setState(1166);
					match(THIS);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1168);
					match(LPAREN);
					setState(1169);
					expression();
					setState(1170);
					match(RPAREN);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1172);
					classInstanceCreationExpression();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1173);
					fieldAccess();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1174);
					methodInvocation();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(1175);
					methodReference();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1178);
					classInstanceCreationExpression_lf_primary();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1179);
					fieldAccess_lf_primary();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1180);
					arrayAccess_lf_primary();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1181);
					methodInvocation_lf_primary();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1182);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1187);
					classInstanceCreationExpression_lf_primary();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1188);
					fieldAccess_lf_primary();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1189);
					methodInvocation_lf_primary();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1190);
					methodReference_lf_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1193);
					literal();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1194);
					typeName();
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1195);
								match(LBRACK);
								setState(1196);
								match(RBRACK);
							}
						}
						setState(1201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1202);
					match(DOT);
					setState(1203);
					match(CLASS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1205);
					unannPrimitiveType();
					setState(1210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1206);
								match(LBRACK);
								setState(1207);
								match(RBRACK);
							}
						}
						setState(1212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1213);
					match(DOT);
					setState(1214);
					match(CLASS);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1216);
					match(VOID);
					setState(1217);
					match(DOT);
					setState(1218);
					match(CLASS);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1219);
					match(THIS);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1220);
					typeName();
					setState(1221);
					match(DOT);
					setState(1222);
					match(THIS);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1224);
					match(LPAREN);
					setState(1225);
					expression();
					setState(1226);
					match(RPAREN);
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1228);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1229);
					fieldAccess_lfno_primary();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(1230);
					arrayAccess_lfno_primary();
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(1231);
					methodInvocation_lfno_primary();
				}
				break;
				case 12:
					enterOuterAlt(_localctx, 12);
				{
					setState(1232);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(1276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1237);
					literal();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1238);
					typeName();
					setState(1243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1239);
								match(LBRACK);
								setState(1240);
								match(RBRACK);
							}
						}
						setState(1245);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1246);
					match(DOT);
					setState(1247);
					match(CLASS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1249);
					unannPrimitiveType();
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LBRACK) {
						{
							{
								setState(1250);
								match(LBRACK);
								setState(1251);
								match(RBRACK);
							}
						}
						setState(1256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1257);
					match(DOT);
					setState(1258);
					match(CLASS);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1260);
					match(VOID);
					setState(1261);
					match(DOT);
					setState(1262);
					match(CLASS);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1263);
					match(THIS);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1264);
					typeName();
					setState(1265);
					match(DOT);
					setState(1266);
					match(THIS);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1268);
					match(LPAREN);
					setState(1269);
					expression();
					setState(1270);
					match(RPAREN);
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(1272);
					classInstanceCreationExpression_lfno_primary();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(1273);
					fieldAccess_lfno_primary();
				}
				break;
				case 10:
					enterOuterAlt(_localctx, 10);
				{
					setState(1274);
					methodInvocation_lfno_primary();
				}
				break;
				case 11:
					enterOuterAlt(_localctx, 11);
				{
					setState(1275);
					methodReference_lfno_primary();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1278);
					match(NEW);
					setState(1280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1279);
							typeArguments();
						}
					}

					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(1282);
								annotation();
							}
						}
						setState(1287);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1288);
					match(Identifier);
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
							{
								setState(1289);
								match(DOT);
								setState(1293);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==AT) {
									{
										{
											setState(1290);
											annotation();
										}
									}
									setState(1295);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1296);
								match(Identifier);
							}
						}
						setState(1301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1302);
							typeArgumentsOrDiamond();
						}
					}

					setState(1305);
					match(LPAREN);
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1306);
							argumentList();
						}
					}

					setState(1309);
					match(RPAREN);
					setState(1311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACE) {
						{
							setState(1310);
							classBody();
						}
					}

				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1313);
					expressionName();
					setState(1314);
					match(DOT);
					setState(1315);
					match(NEW);
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1316);
							typeArguments();
						}
					}

					setState(1322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(1319);
								annotation();
							}
						}
						setState(1324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1325);
					match(Identifier);
					setState(1327);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1326);
							typeArgumentsOrDiamond();
						}
					}

					setState(1329);
					match(LPAREN);
					setState(1331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1330);
							argumentList();
						}
					}

					setState(1333);
					match(RPAREN);
					setState(1335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACE) {
						{
							setState(1334);
							classBody();
						}
					}

				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1337);
					primary();
					setState(1338);
					match(DOT);
					setState(1339);
					match(NEW);
					setState(1341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1340);
							typeArguments();
						}
					}

					setState(1346);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(1343);
								annotation();
							}
						}
						setState(1348);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1349);
					match(Identifier);
					setState(1351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1350);
							typeArgumentsOrDiamond();
						}
					}

					setState(1353);
					match(LPAREN);
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1354);
							argumentList();
						}
					}

					setState(1357);
					match(RPAREN);
					setState(1359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACE) {
						{
							setState(1358);
							classBody();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1363);
				match(DOT);
				setState(1364);
				match(NEW);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(1365);
						typeArguments();
					}
				}

				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(1368);
							annotation();
						}
					}
					setState(1373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1374);
				match(Identifier);
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(1375);
						typeArgumentsOrDiamond();
					}
				}

				setState(1378);
				match(LPAREN);
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(1379);
						argumentList();
					}
				}

				setState(1382);
				match(RPAREN);
				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1: {
						setState(1383);
						classBody();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case NEW:
					enterOuterAlt(_localctx, 1);
				{
					setState(1386);
					match(NEW);
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1387);
							typeArguments();
						}
					}

					setState(1393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(1390);
								annotation();
							}
						}
						setState(1395);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1396);
					match(Identifier);
					setState(1407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT) {
						{
							{
								setState(1397);
								match(DOT);
								setState(1401);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==AT) {
									{
										{
											setState(1398);
											annotation();
										}
									}
									setState(1403);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1404);
								match(Identifier);
							}
						}
						setState(1409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1410);
							typeArgumentsOrDiamond();
						}
					}

					setState(1413);
					match(LPAREN);
					setState(1415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1414);
							argumentList();
						}
					}

					setState(1417);
					match(RPAREN);
					setState(1419);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
						case 1: {
							setState(1418);
							classBody();
						}
						break;
					}
				}
				break;
				case Identifier:
					enterOuterAlt(_localctx, 2);
				{
					setState(1421);
					expressionName();
					setState(1422);
					match(DOT);
					setState(1423);
					match(NEW);
					setState(1425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1424);
							typeArguments();
						}
					}

					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
							{
								setState(1427);
								annotation();
							}
						}
						setState(1432);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1433);
					match(Identifier);
					setState(1435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1434);
							typeArgumentsOrDiamond();
						}
					}

					setState(1437);
					match(LPAREN);
					setState(1439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1438);
							argumentList();
						}
					}

					setState(1441);
					match(RPAREN);
					setState(1443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1: {
							setState(1442);
							classBody();
						}
						break;
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_typeArgumentsOrDiamond);
		try {
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1447);
					typeArguments();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1448);
					match(LT);
					setState(1449);
					match(GT);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_fieldAccess);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1452);
					primary();
					setState(1453);
					match(DOT);
					setState(1454);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1456);
					match(SUPER);
					setState(1457);
					match(DOT);
					setState(1458);
					match(Identifier);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1459);
					typeName();
					setState(1460);
					match(DOT);
					setState(1461);
					match(SUPER);
					setState(1462);
					match(DOT);
					setState(1463);
					match(Identifier);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1467);
				match(DOT);
				setState(1468);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fieldAccess_lfno_primary);
		try {
			setState(1479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SUPER:
					enterOuterAlt(_localctx, 1);
				{
					setState(1470);
					match(SUPER);
					setState(1471);
					match(DOT);
					setState(1472);
					match(Identifier);
				}
				break;
				case Identifier:
					enterOuterAlt(_localctx, 2);
				{
					setState(1473);
					typeName();
					setState(1474);
					match(DOT);
					setState(1475);
					match(SUPER);
					setState(1476);
					match(DOT);
					setState(1477);
					match(Identifier);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
					case 1: {
						setState(1481);
						expressionName();
						setState(1482);
						match(LBRACK);
						setState(1483);
						expression();
						setState(1484);
						match(RBRACK);
					}
					break;
					case 2: {
						setState(1486);
						primaryNoNewArray_lfno_arrayAccess();
						setState(1487);
						match(LBRACK);
						setState(1488);
						expression();
						setState(1489);
						match(RBRACK);
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1493);
					primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
					setState(1494);
					match(LBRACK);
					setState(1495);
					expression();
					setState(1496);
					match(RBRACK);
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1498);
								primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
								setState(1499);
								match(LBRACK);
								setState(1500);
								expression();
								setState(1501);
								match(RBRACK);
							}
						}
					}
					setState(1507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1: {
						setState(1508);
						expressionName();
						setState(1509);
						match(LBRACK);
						setState(1510);
						expression();
						setState(1511);
						match(RBRACK);
					}
					break;
					case 2: {
						setState(1513);
						primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
						setState(1514);
						match(LBRACK);
						setState(1515);
						expression();
						setState(1516);
						match(RBRACK);
					}
					break;
				}
				setState(1527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1520);
								primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
								setState(1521);
								match(LBRACK);
								setState(1522);
								expression();
								setState(1523);
								match(RBRACK);
							}
						}
					}
					setState(1529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_methodInvocation);
		int _la;
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1530);
					methodName();
					setState(1531);
					match(LPAREN);
					setState(1533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1532);
							argumentList();
						}
					}

					setState(1535);
					match(RPAREN);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1537);
					typeName();
					setState(1538);
					match(DOT);
					setState(1540);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1539);
							typeArguments();
						}
					}

					setState(1542);
					match(Identifier);
					setState(1543);
					match(LPAREN);
					setState(1545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1544);
							argumentList();
						}
					}

					setState(1547);
					match(RPAREN);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1549);
					expressionName();
					setState(1550);
					match(DOT);
					setState(1552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1551);
							typeArguments();
						}
					}

					setState(1554);
					match(Identifier);
					setState(1555);
					match(LPAREN);
					setState(1557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1556);
							argumentList();
						}
					}

					setState(1559);
					match(RPAREN);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1561);
					primary();
					setState(1562);
					match(DOT);
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1563);
							typeArguments();
						}
					}

					setState(1566);
					match(Identifier);
					setState(1567);
					match(LPAREN);
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1568);
							argumentList();
						}
					}

					setState(1571);
					match(RPAREN);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1573);
					match(SUPER);
					setState(1574);
					match(DOT);
					setState(1576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1575);
							typeArguments();
						}
					}

					setState(1578);
					match(Identifier);
					setState(1579);
					match(LPAREN);
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1580);
							argumentList();
						}
					}

					setState(1583);
					match(RPAREN);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1584);
					typeName();
					setState(1585);
					match(DOT);
					setState(1586);
					match(SUPER);
					setState(1587);
					match(DOT);
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1588);
							typeArguments();
						}
					}

					setState(1591);
					match(Identifier);
					setState(1592);
					match(LPAREN);
					setState(1594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1593);
							argumentList();
						}
					}

					setState(1596);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1600);
				match(DOT);
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(1601);
						typeArguments();
					}
				}

				setState(1604);
				match(Identifier);
				setState(1605);
				match(LPAREN);
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
					{
						setState(1606);
						argumentList();
					}
				}

				setState(1609);
				match(RPAREN);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1611);
					methodName();
					setState(1612);
					match(LPAREN);
					setState(1614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1613);
							argumentList();
						}
					}

					setState(1616);
					match(RPAREN);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1618);
					typeName();
					setState(1619);
					match(DOT);
					setState(1621);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1620);
							typeArguments();
						}
					}

					setState(1623);
					match(Identifier);
					setState(1624);
					match(LPAREN);
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1625);
							argumentList();
						}
					}

					setState(1628);
					match(RPAREN);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1630);
					expressionName();
					setState(1631);
					match(DOT);
					setState(1633);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1632);
							typeArguments();
						}
					}

					setState(1635);
					match(Identifier);
					setState(1636);
					match(LPAREN);
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1637);
							argumentList();
						}
					}

					setState(1640);
					match(RPAREN);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1642);
					match(SUPER);
					setState(1643);
					match(DOT);
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1644);
							typeArguments();
						}
					}

					setState(1647);
					match(Identifier);
					setState(1648);
					match(LPAREN);
					setState(1650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1649);
							argumentList();
						}
					}

					setState(1652);
					match(RPAREN);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1653);
					typeName();
					setState(1654);
					match(DOT);
					setState(1655);
					match(SUPER);
					setState(1656);
					match(DOT);
					setState(1658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1657);
							typeArguments();
						}
					}

					setState(1660);
					match(Identifier);
					setState(1661);
					match(LPAREN);
					setState(1663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (Identifier - 69)) | (1L << (AT - 69)))) != 0)) {
						{
							setState(1662);
							argumentList();
						}
					}

					setState(1665);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1669);
				expression();
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1670);
							match(COMMA);
							setState(1671);
							expression();
						}
					}
					setState(1676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_methodReference);
		int _la;
		try {
			setState(1724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1677);
					expressionName();
					setState(1678);
					match(COLONCOLON);
					setState(1680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1679);
							typeArguments();
						}
					}

					setState(1682);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1684);
					referenceType();
					setState(1685);
					match(COLONCOLON);
					setState(1687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1686);
							typeArguments();
						}
					}

					setState(1689);
					match(Identifier);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1691);
					primary();
					setState(1692);
					match(COLONCOLON);
					setState(1694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1693);
							typeArguments();
						}
					}

					setState(1696);
					match(Identifier);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1698);
					match(SUPER);
					setState(1699);
					match(COLONCOLON);
					setState(1701);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1700);
							typeArguments();
						}
					}

					setState(1703);
					match(Identifier);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1704);
					typeName();
					setState(1705);
					match(DOT);
					setState(1706);
					match(SUPER);
					setState(1707);
					match(COLONCOLON);
					setState(1709);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1708);
							typeArguments();
						}
					}

					setState(1711);
					match(Identifier);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1713);
					classType();
					setState(1714);
					match(COLONCOLON);
					setState(1716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1715);
							typeArguments();
						}
					}

					setState(1718);
					match(NEW);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(1720);
					arrayType();
					setState(1721);
					match(COLONCOLON);
					setState(1722);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1726);
				match(COLONCOLON);
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
						setState(1727);
						typeArguments();
					}
				}

				setState(1730);
				match(Identifier);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1732);
					expressionName();
					setState(1733);
					match(COLONCOLON);
					setState(1735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1734);
							typeArguments();
						}
					}

					setState(1737);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1739);
					referenceType();
					setState(1740);
					match(COLONCOLON);
					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1741);
							typeArguments();
						}
					}

					setState(1744);
					match(Identifier);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1746);
					match(SUPER);
					setState(1747);
					match(COLONCOLON);
					setState(1749);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1748);
							typeArguments();
						}
					}

					setState(1751);
					match(Identifier);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1752);
					typeName();
					setState(1753);
					match(DOT);
					setState(1754);
					match(SUPER);
					setState(1755);
					match(COLONCOLON);
					setState(1757);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1756);
							typeArguments();
						}
					}

					setState(1759);
					match(Identifier);
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(1761);
					classType();
					setState(1762);
					match(COLONCOLON);
					setState(1764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
							setState(1763);
							typeArguments();
						}
					}

					setState(1766);
					match(NEW);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(1768);
					arrayType();
					setState(1769);
					match(COLONCOLON);
					setState(1770);
					match(NEW);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_arrayCreationExpression);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1774);
					match(NEW);
					setState(1775);
					primitiveType();
					setState(1776);
					dimExprs();
					setState(1778);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
						case 1: {
							setState(1777);
							dims();
						}
						break;
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1780);
					match(NEW);
					setState(1781);
					classOrInterfaceType();
					setState(1782);
					dimExprs();
					setState(1784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
						case 1: {
							setState(1783);
							dims();
						}
						break;
					}
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1786);
					match(NEW);
					setState(1787);
					primitiveType();
					setState(1788);
					dims();
					setState(1789);
					arrayInitializer();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(1791);
					match(NEW);
					setState(1792);
					classOrInterfaceType();
					setState(1793);
					dims();
					setState(1794);
					arrayInitializer();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1798);
				dimExpr();
				setState(1802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
							{
								setState(1799);
								dimExpr();
							}
						}
					}
					setState(1804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
						{
							setState(1805);
							annotation();
						}
					}
					setState(1810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1811);
				match(LBRACK);
				setState(1812);
				expression();
				setState(1813);
				match(RBRACK);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expression);
		try {
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1815);
					lambdaExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1816);
					assignmentExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1819);
				lambdaParameters();
				setState(1820);
				match(ARROW);
				setState(1821);
				lambdaBody();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_lambdaParameters);
		int _la;
		try {
			setState(1833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1823);
					match(Identifier);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1824);
					match(LPAREN);
					setState(1826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
						{
							setState(1825);
							formalParameterList();
						}
					}

					setState(1828);
					match(RPAREN);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1829);
					match(LPAREN);
					setState(1830);
					inferredFormalParameterList();
					setState(1831);
					match(RPAREN);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1835);
				match(Identifier);
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
						{
							setState(1836);
							match(COMMA);
							setState(1837);
							match(Identifier);
						}
					}
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_lambdaBody);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case NEW:
				case SHORT:
				case SUPER:
				case THIS:
				case VOID:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case BANG:
				case TILDE:
				case ADD:
				case SUB:
				case Identifier:
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(1843);
					expression();
				}
				break;
				case LBRACE:
					enterOuterAlt(_localctx, 2);
				{
					setState(1844);
					block();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assignmentExpression);
		try {
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1847);
					conditionalExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1848);
					assignment();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1851);
				leftHandSide();
				setState(1852);
				assignmentOperator();
				setState(1853);
				expression();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_leftHandSide);
		try {
			setState(1858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1855);
					expressionName();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1856);
					fieldAccess();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(1857);
					arrayAccess();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1860);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
					_errHandler.recoverInline(this);
				} else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_conditionalExpression);
		try {
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(1862);
					conditionalOrExpression(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(1863);
					conditionalOrExpression(0);
					setState(1864);
					match(QUESTION);
					setState(1865);
					expression();
					setState(1866);
					match(COLON);
					setState(1867);
					conditionalExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 294;
		enterRecursionRule(_localctx, 294, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1872);
					conditionalAndExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
								setState(1874);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1875);
								match(OR);
								setState(1876);
								conditionalAndExpression(0);
							}
						}
					}
					setState(1881);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 296;
		enterRecursionRule(_localctx, 296, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1883);
					inclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
								setState(1885);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1886);
								match(AND);
								setState(1887);
								inclusiveOrExpression(0);
							}
						}
					}
					setState(1892);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1894);
					exclusiveOrExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
								setState(1896);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1897);
								match(BITOR);
								setState(1898);
								exclusiveOrExpression(0);
							}
						}
					}
					setState(1903);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 300;
		enterRecursionRule(_localctx, 300, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1905);
					andExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
								setState(1907);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1908);
								match(CARET);
								setState(1909);
								andExpression(0);
							}
						}
					}
					setState(1914);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1916);
					equalityExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new AndExpressionContext(_parentctx, _parentState);
								pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
								setState(1918);
								if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(1919);
								match(BITAND);
								setState(1920);
								equalityExpression(0);
							}
						}
					}
					setState(1925);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 304;
		enterRecursionRule(_localctx, 304, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1927);
					relationalExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1937);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1935);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
								case 1: {
									_localctx = new EqualityExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
									setState(1929);
									if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(1930);
									match(EQUAL);
									setState(1931);
									relationalExpression(0);
								}
								break;
								case 2: {
									_localctx = new EqualityExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
									setState(1932);
									if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(1933);
									match(NOTEQUAL);
									setState(1934);
									relationalExpression(0);
								}
								break;
							}
						}
					}
					setState(1939);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1941);
					shiftExpression();
				}
				_ctx.stop = _input.LT(-1);
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1958);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
								case 1: {
									_localctx = new RelationalExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
									setState(1943);
									if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(1944);
									match(LT);
									setState(1945);
									shiftExpression();
								}
								break;
								case 2: {
									_localctx = new RelationalExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
									setState(1946);
									if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(1947);
									match(GT);
									setState(1948);
									shiftExpression();
								}
								break;
								case 3: {
									_localctx = new RelationalExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
									setState(1949);
									if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(1950);
									match(LE);
									setState(1951);
									shiftExpression();
								}
								break;
								case 4: {
									_localctx = new RelationalExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
									setState(1952);
									if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(1953);
									match(GE);
									setState(1954);
									shiftExpression();
								}
								break;
								case 5: {
									_localctx = new RelationalExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
									setState(1955);
									if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(1956);
									match(INSTANCEOF);
									setState(1957);
									referenceType();
								}
								break;
							}
						}
					}
					setState(1962);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_shiftExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1963);
				additiveExpression(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1966);
					multiplicativeExpression(0);
				}
				_ctx.stop = _input.LT(-1);
				setState(1976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1974);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
								case 1: {
									_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
									setState(1968);
									if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(1969);
									match(ADD);
									setState(1970);
									multiplicativeExpression(0);
								}
								break;
								case 2: {
									_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
									setState(1971);
									if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(1972);
									match(SUB);
									setState(1973);
									multiplicativeExpression(0);
								}
								break;
							}
						}
					}
					setState(1978);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(1980);
					unaryExpression();
				}
				_ctx.stop = _input.LT(-1);
				setState(1993);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						if ( _parseListeners!=null ) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1991);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
								case 1: {
									_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
									setState(1982);
									if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(1983);
									match(MUL);
									setState(1984);
									unaryExpression();
								}
								break;
								case 2: {
									_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
									setState(1985);
									if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(1986);
									match(DIV);
									setState(1987);
									unaryExpression();
								}
								break;
								case 3: {
									_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
									setState(1988);
									if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(1989);
									match(MOD);
									setState(1990);
									unaryExpression();
								}
								break;
							}
						}
					}
					setState(1995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_unaryExpression);
		try {
			setState(2001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ADD:
					enterOuterAlt(_localctx, 1);
				{
					setState(1996);
					match(ADD);
					setState(1997);
					unaryExpression();
				}
				break;
				case SUB:
					enterOuterAlt(_localctx, 2);
				{
					setState(1998);
					match(SUB);
					setState(1999);
					unaryExpression();
				}
				break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case NEW:
				case SHORT:
				case SUPER:
				case THIS:
				case VOID:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case BANG:
				case TILDE:
				case Identifier:
				case AT:
					enterOuterAlt(_localctx, 3);
				{
					setState(2000);
					unaryExpressionNotPlusMinus();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2003);
					postfixExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2004);
					match(TILDE);
					setState(2005);
					unaryExpression();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2006);
					match(BANG);
					setState(2007);
					unaryExpression();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(2008);
					castExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(2013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
					case 1: {
						setState(2011);
						primary();
					}
					break;
					case 2: {
						setState(2012);
						expressionName();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_castExpression);
		int _la;
		try {
			setState(2042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(2015);
					match(LPAREN);
					setState(2016);
					primitiveType();
					setState(2017);
					match(RPAREN);
					setState(2018);
					unaryExpression();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(2020);
					match(LPAREN);
					setState(2021);
					referenceType();
					setState(2025);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BITAND) {
						{
							{
								setState(2022);
								additionalBound();
							}
						}
						setState(2027);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2028);
					match(RPAREN);
					setState(2029);
					unaryExpressionNotPlusMinus();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(2031);
					match(LPAREN);
					setState(2032);
					referenceType();
					setState(2036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BITAND) {
						{
							{
								setState(2033);
								additionalBound();
							}
						}
						setState(2038);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2039);
					match(RPAREN);
					setState(2040);
					lambdaExpression();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 25:
				return packageName_sempred((PackageNameContext)_localctx, predIndex);
			case 27:
				return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
			case 30:
				return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
			case 147:
				return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
			case 148:
				return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
			case 149:
				return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
			case 150:
				return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
			case 151:
				return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
			case 152:
				return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
			case 153:
				return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
			case 155:
				return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
			case 156:
				return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}

	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
			case 1:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
			case 2:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 3:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 4:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 5:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 6:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 7:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 8:
				return precpred(_ctx, 2);
			case 9:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 10:
				return precpred(_ctx, 5);
			case 11:
				return precpred(_ctx, 4);
			case 12:
				return precpred(_ctx, 3);
			case 13:
				return precpred(_ctx, 2);
			case 14:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 15:
				return precpred(_ctx, 2);
			case 16:
				return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 17:
				return precpred(_ctx, 3);
			case 18:
				return precpred(_ctx, 2);
			case 19:
				return precpred(_ctx, 1);
		}
		return true;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }

		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }

		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }

		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }

		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }

		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }

		@Override public int getRuleIndex() { return RULE_literal; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLiteral(this);
		}
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_primitiveType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimitiveType(this);
		}
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}

		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_numericType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNumericType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNumericType(this);
		}
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_integralType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterIntegralType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitIntegralType(this);
		}
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_floatingPointType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFloatingPointType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFloatingPointType(this);
		}
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_referenceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReferenceType(this);
		}
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}

		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}

		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}

		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}

		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}

		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType(this);
		}
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_interfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType(this);
		}
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_typeVariable; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeVariable(this);
		}
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_arrayType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayType(this);
		}
	}

	public static class DimsContext extends ParserRuleContext {
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_dims; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDims(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDims(this);
		}
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}

		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}

		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeParameter; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameter(this);
		}
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterModifier(this);
		}
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_typeBound; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeBound(this);
		}
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_additionalBound; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditionalBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditionalBound(this);
		}
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeArguments; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArguments(this);
		}
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}

		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_typeArgumentList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentList(this);
		}
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeArgument; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgument(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgument(this);
		}
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_wildcard; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcard(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcard(this);
		}
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_wildcardBounds; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterWildcardBounds(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitWildcardBounds(this);
		}
	}

	public static class PackageNameContext extends ParserRuleContext {
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_packageName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageName(this);
		}
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeName(this);
		}
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageOrTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageOrTypeName(this);
		}
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_expressionName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionName(this);
		}
	}

	public static class MethodNameContext extends ParserRuleContext {
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		@Override public int getRuleIndex() { return RULE_methodName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodName(this);
		}
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_ambiguousName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAmbiguousName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAmbiguousName(this);
		}
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }

		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}

		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}

		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}

		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}

		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_compilationUnit; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}

		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}

		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_packageDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_packageModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPackageModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPackageModifier(this);
		}
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}

		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_importDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitImportDeclaration(this);
		}
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleTypeImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeImportOnDemandDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassDeclaration(this);
		}
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}

		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}

		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}

		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalClassDeclaration(this);
		}
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassModifier(this);
		}
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeParameters; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameters(this);
		}
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}

		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_typeParameterList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeParameterList(this);
		}
	}

	public static class SuperclassContext extends ParserRuleContext {
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_superclass; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSuperclass(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSuperclass(this);
		}
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_classBody; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBody(this);
		}
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}

		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassBodyDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}

		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}

		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}

		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_fieldModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldModifier(this);
		}
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}

		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorList(this);
		}
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}

		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_variableDeclarator; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableDeclaratorId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_variableInitializer; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializer(this);
		}
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}

		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannType(this);
		}
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannPrimitiveType(this);
		}
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}

		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannReferenceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannReferenceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannReferenceType(this);
		}
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}

		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}

		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}

		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}

		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannTypeVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannTypeVariable(this);
		}
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}

		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}

		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unannArrayType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnannArrayType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnannArrayType(this);
		}
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}

		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}

		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}

		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_methodDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodModifier(this);
		}
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}

		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}

		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_methodHeader; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodHeader(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodHeader(this);
		}
	}

	public static class ResultContext extends ParserRuleContext {
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_result; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterResult(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitResult(this);
		}
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodDeclarator; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodDeclarator(this);
		}
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}

		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_formalParameterList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameterList(this);
		}
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}

		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}

		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_formalParameters; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameters(this);
		}
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_formalParameter; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFormalParameter(this);
		}
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_variableModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableModifier(this);
		}
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLastFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		@Override public int getRuleIndex() { return RULE_receiverParameter; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReceiverParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReceiverParameter(this);
		}
	}

	public static class Throws_Context extends ParserRuleContext {
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_throws_; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterThrows_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitThrows_(this);
		}
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}

		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionTypeList(this);
		}
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}

		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_exceptionType; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExceptionType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExceptionType(this);
		}
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodBody; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodBody(this);
		}
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}

		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}

		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}

		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}

		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}

		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_constructorModifier; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorModifier(this);
		}
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorDeclarator(this);
		}
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		@Override public int getRuleIndex() { return RULE_simpleTypeName; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSimpleTypeName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSimpleTypeName(this);
		}
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_constructorBody; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConstructorBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConstructorBody(this);
		}
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExplicitConstructorInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}

		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}

		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_annotation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAnnotation(this);
		}
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_normalAnnotation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterNormalAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitNormalAnnotation(this);
		}
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}

		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_elementValuePairList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePairList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePairList(this);
		}
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_elementValuePair; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValuePair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValuePair(this);
		}
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}

		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_elementValue; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValue(this);
		}
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}

		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_elementValueList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterElementValueList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitElementValueList(this);
		}
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_markerAnnotation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMarkerAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMarkerAnnotation(this);
		}
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterSingleElementAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitSingleElementAnnotation(this);
		}
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_arrayInitializer; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayInitializer(this);
		}
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}

		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_variableInitializerList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterVariableInitializerList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitVariableInitializerList(this);
		}
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_block; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlock(this);
		}
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_blockStatements; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatements(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatements(this);
		}
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_blockStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitBlockStatement(this);
		}
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}

		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLocalVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}

		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_statement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatement(this);
		}
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}

		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementNoShortIf(this);
		}
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}

		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}

		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_emptyStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEmptyStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEmptyStatement(this);
		}
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_labeledStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatement(this);
		}
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLabeledStatementNoShortIf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_expressionStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpressionStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpressionStatement(this);
		}
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_statementExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterStatementExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitStatementExpression(this);
		}
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_returnStatement; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterReturnStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitReturnStatement(this);
		}
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}

		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}

		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}

		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimary(this);
		}
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}

		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}

		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}

		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}

		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}

		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}

		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}

		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}

		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}

		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}

		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}

		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }

		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }

		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_fieldAccess; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterFieldAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_arrayAccess; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess(this);
		}
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}

		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}

		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}

		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}

		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}

		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayAccess_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodInvocation; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}

		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodInvocation_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_argumentList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArgumentList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArgumentList(this);
		}
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodReference; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference(this);
		}
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lf_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}

		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}

		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMethodReference_lfno_primary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}

		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}

		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterArrayCreationExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitArrayCreationExpression(this);
		}
	}

	public static class DimExprsContext extends ParserRuleContext {
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}

		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_dimExprs; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExprs(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExprs(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	public static class DimExprContext extends ParserRuleContext {
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_dimExpr; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterDimExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitDimExpr(this);
		}
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}

		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_expression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExpression(this);
		}
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}

		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_lambdaExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaExpression(this);
		}
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}

		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_lambdaParameters; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaParameters(this);
		}
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }

		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}

		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInferredFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInferredFormalParameterList(this);
		}
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_lambdaBody; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLambdaBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLambdaBody(this);
		}
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_assignmentExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}

		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_assignment; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignment(this);
		}
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}

		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_leftHandSide; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterLeftHandSide(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitLeftHandSide(this);
		}
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override public int getRuleIndex() { return RULE_assignmentOperator; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAssignmentOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}

		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_conditionalExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalExpression(this);
		}
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}

		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalOrExpression(this);
		}
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}

		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterConditionalAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitConditionalAndExpression(this);
		}
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}

		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterInclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitInclusiveOrExpression(this);
		}
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}

		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterExclusiveOrExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitExclusiveOrExpression(this);
		}
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}

		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_andExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAndExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAndExpression(this);
		}
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}

		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_equalityExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterEqualityExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitEqualityExpression(this);
		}
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}

		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_relationalExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterRelationalExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitRelationalExpression(this);
		}
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_shiftExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterShiftExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitShiftExpression(this);
		}
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}

		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_additiveExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterAdditiveExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitAdditiveExpression(this);
		}
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}

		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterMultiplicativeExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitMultiplicativeExpression(this);
		}
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unaryExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpression(this);
		}
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}

		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}

		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_postfixExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterPostfixExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitPostfixExpression(this);
		}
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}

		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}

		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}

		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}

		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}

		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}

		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_castExpression; }

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).enterCastExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8ParserListener ) ((Java8ParserListener)listener).exitCastExpression(this);
		}
	}
}
