package com.theoxao.antlr.autogen;

// Generated from JavaParser.g4 by ANTLR 4.6

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	public static final int
			ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, CATCH = 7, CHAR = 8,
			CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, DO = 13, DOUBLE = 14, ELSE = 15,
			ENUM = 16, EXTENDS = 17, FINAL = 18, FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23,
			IMPLEMENTS = 24, IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29,
			NATIVE = 30, NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36,
			SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42,
			THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, VOLATILE = 49,
			WHILE = 50, DECIMAL_LITERAL = 51, HEX_LITERAL = 52, OCT_LITERAL = 53, BINARY_LITERAL = 54,
			FLOAT_LITERAL = 55, HEX_FLOAT_LITERAL = 56, BOOL_LITERAL = 57, CHAR_LITERAL = 58,
			STRING_LITERAL = 59, NULL_LITERAL = 60, LPAREN = 61, RPAREN = 62, LBRACE = 63, RBRACE = 64,
			LBRACK = 65, RBRACK = 66, SEMI = 67, COMMA = 68, DOT = 69, ASSIGN = 70, GT = 71, LT = 72,
			BANG = 73, TILDE = 74, QUESTION = 75, COLON = 76, EQUAL = 77, LE = 78, GE = 79, NOTEQUAL = 80,
			AND = 81, OR = 82, INC = 83, DEC = 84, ADD = 85, SUB = 86, MUL = 87, DIV = 88, BITAND = 89,
			BITOR = 90, CARET = 91, MOD = 92, ADD_ASSIGN = 93, SUB_ASSIGN = 94, MUL_ASSIGN = 95,
			DIV_ASSIGN = 96, AND_ASSIGN = 97, OR_ASSIGN = 98, XOR_ASSIGN = 99, MOD_ASSIGN = 100,
			LSHIFT_ASSIGN = 101, RSHIFT_ASSIGN = 102, URSHIFT_ASSIGN = 103, ARROW = 104, COLONCOLON = 105,
			AT = 106, ELLIPSIS = 107, WS = 108, COMMENT = 109, LINE_COMMENT = 110, IDENTIFIER = 111;
	public static final int
			RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2,
			RULE_typeDeclaration = 3, RULE_enumDeclaration = 4, RULE_enumConstants = 5,
			RULE_enumConstant = 6, RULE_enumBodyDeclarations = 7, RULE_modifier = 8,
			RULE_classOrInterfaceModifier = 9, RULE_variableModifier = 10, RULE_classDeclaration = 11,
			RULE_typeParameters = 12, RULE_typeParameter = 13, RULE_typeBound = 14,
			RULE_classBody = 15, RULE_classBodyDeclaration = 16, RULE_memberDeclaration = 17,
			RULE_methodDeclaration = 18, RULE_methodBody = 19, RULE_typeTypeOrVoid = 20,
			RULE_genericMethodDeclaration = 21, RULE_genericConstructorDeclaration = 22,
			RULE_constructorDeclaration = 23, RULE_fieldDeclaration = 24, RULE_variableDeclarators = 25,
			RULE_variableDeclarator = 26, RULE_variableDeclaratorId = 27, RULE_variableInitializer = 28,
			RULE_arrayInitializer = 29, RULE_classOrInterfaceType = 30, RULE_typeArgument = 31,
			RULE_qualifiedNameList = 32, RULE_formalParameters = 33, RULE_formalParameterList = 34,
			RULE_formalParameter = 35, RULE_lastFormalParameter = 36, RULE_qualifiedName = 37,
			RULE_literal = 38, RULE_integerLiteral = 39, RULE_floatLiteral = 40, RULE_annotation = 41,
			RULE_elementValuePairs = 42, RULE_elementValuePair = 43, RULE_elementValue = 44,
			RULE_elementValueArrayInitializer = 45, RULE_block = 46, RULE_blockStatement = 47,
			RULE_localVariableDeclaration = 48, RULE_localTypeDeclaration = 49, RULE_statement = 50,
			RULE_expressionList = 51, RULE_methodCall = 52, RULE_expression = 53,
			RULE_primary = 54, RULE_creator = 55, RULE_createdName = 56, RULE_innerCreator = 57,
			RULE_arrayCreatorRest = 58, RULE_classCreatorRest = 59, RULE_explicitGenericInvocation = 60,
			RULE_typeArgumentsOrDiamond = 61, RULE_nonWildcardTypeArgumentsOrDiamond = 62,
			RULE_nonWildcardTypeArguments = 63, RULE_typeList = 64, RULE_typeType = 65,
			RULE_primitiveType = 66, RULE_typeArguments = 67, RULE_superSuffix = 68,
			RULE_explicitGenericInvocationSuffix = 69, RULE_arguments = 70;
	public static final String[] ruleNames = {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration",
			"enumDeclaration", "enumConstants", "enumConstant", "enumBodyDeclarations",
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration",
			"typeParameters", "typeParameter", "typeBound", "classBody", "classBodyDeclaration",
			"memberDeclaration", "methodDeclaration", "methodBody", "typeTypeOrVoid",
			"genericMethodDeclaration", "genericConstructorDeclaration", "constructorDeclaration",
			"fieldDeclaration", "variableDeclarators", "variableDeclarator", "variableDeclaratorId",
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument",
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter",
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", "floatLiteral",
			"annotation", "elementValuePairs", "elementValuePair", "elementValue",
			"elementValueArrayInitializer", "block", "blockStatement", "localVariableDeclaration",
			"localTypeDeclaration", "statement", "expressionList", "methodCall", "expression",
			"primary", "creator", "createdName", "innerCreator", "arrayCreatorRest",
			"classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond",
			"nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "typeList",
			"typeType", "primitiveType", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix",
			"arguments"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3q\u0374\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2" +
					"\5\2\u0092\n\2\3\2\7\2\u0095\n\2\f\2\16\2\u0098\13\2\3\2\7\2\u009b\n\2" +
					"\f\2\16\2\u009e\13\2\3\2\3\2\3\3\7\3\u00a3\n\3\f\3\16\3\u00a6\13\3\3\3" +
					"\3\3\3\3\3\3\3\4\3\4\5\4\u00ae\n\4\3\4\3\4\3\4\5\4\u00b3\n\4\3\4\3\4\3" +
					"\5\7\5\u00b8\n\5\f\5\16\5\u00bb\13\5\3\5\3\5\5\5\u00bf\n\5\3\5\5\5\u00c2" +
					"\n\5\3\6\3\6\3\6\3\6\5\6\u00c8\n\6\3\6\3\6\5\6\u00cc\n\6\3\6\5\6\u00cf" +
					"\n\6\3\6\5\6\u00d2\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc" +
					"\13\7\3\b\7\b\u00df\n\b\f\b\16\b\u00e2\13\b\3\b\3\b\5\b\u00e6\n\b\3\b" +
					"\5\b\u00e9\n\b\3\t\3\t\7\t\u00ed\n\t\f\t\16\t\u00f0\13\t\3\n\3\n\3\n\3" +
					"\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0101" +
					"\n\13\3\f\3\f\5\f\u0105\n\f\3\r\3\r\3\r\5\r\u010a\n\r\3\r\3\r\5\r\u010e" +
					"\n\r\3\r\3\r\5\r\u0112\n\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u011a\n\16" +
					"\f\16\16\16\u011d\13\16\3\16\3\16\3\17\7\17\u0122\n\17\f\17\16\17\u0125" +
					"\13\17\3\17\3\17\3\17\5\17\u012a\n\17\3\20\3\20\3\20\7\20\u012f\n\20\f" +
					"\20\16\20\u0132\13\20\3\21\3\21\7\21\u0136\n\21\f\21\16\21\u0139\13\21" +
					"\3\21\3\21\3\22\3\22\5\22\u013f\n\22\3\22\3\22\7\22\u0143\n\22\f\22\16" +
					"\22\u0146\13\22\3\22\5\22\u0149\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23" +
					"\5\23\u0152\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u0159\n\24\f\24\16\24\u015c" +
					"\13\24\3\24\3\24\5\24\u0160\n\24\3\24\3\24\3\25\3\25\5\25\u0166\n\25\3" +
					"\26\3\26\5\26\u016a\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31" +
					"\3\31\5\31\u0176\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33" +
					"\u0181\n\33\f\33\16\33\u0184\13\33\3\34\3\34\3\34\5\34\u0189\n\34\3\35" +
					"\3\35\3\35\7\35\u018e\n\35\f\35\16\35\u0191\13\35\3\36\3\36\5\36\u0195" +
					"\n\36\3\37\3\37\3\37\3\37\7\37\u019b\n\37\f\37\16\37\u019e\13\37\3\37" +
					"\5\37\u01a1\n\37\5\37\u01a3\n\37\3\37\3\37\3 \3 \5 \u01a9\n \3 \3 \3 " +
					"\5 \u01ae\n \7 \u01b0\n \f \16 \u01b3\13 \3!\3!\3!\3!\5!\u01b9\n!\5!\u01bb" +
					"\n!\3\"\3\"\3\"\7\"\u01c0\n\"\f\"\16\"\u01c3\13\"\3#\3#\5#\u01c7\n#\3" +
					"#\3#\3$\3$\3$\7$\u01ce\n$\f$\16$\u01d1\13$\3$\3$\5$\u01d5\n$\3$\5$\u01d8" +
					"\n$\3%\7%\u01db\n%\f%\16%\u01de\13%\3%\3%\3%\3&\7&\u01e4\n&\f&\16&\u01e7" +
					"\13&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u01f0\n\'\f\'\16\'\u01f3\13\'\3(\3(\3" +
					"(\3(\3(\3(\5(\u01fb\n(\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u0206\n+\3+\5+\u0209" +
					"\n+\3,\3,\3,\7,\u020e\n,\f,\16,\u0211\13,\3-\3-\3-\3-\3.\3.\3.\5.\u021a" +
					"\n.\3/\3/\3/\3/\7/\u0220\n/\f/\16/\u0223\13/\5/\u0225\n/\3/\5/\u0228\n" +
					"/\3/\3/\3\60\3\60\7\60\u022e\n\60\f\60\16\60\u0231\13\60\3\60\3\60\3\61" +
					"\3\61\3\61\3\61\3\61\5\61\u023a\n\61\3\62\7\62\u023d\n\62\f\62\16\62\u0240" +
					"\13\62\3\62\3\62\3\62\3\63\7\63\u0246\n\63\f\63\16\63\u0249\13\63\3\63" +
					"\3\63\5\63\u024d\n\63\3\64\3\64\3\64\5\64\u0252\n\64\3\64\3\64\3\64\3" +
					"\64\3\64\5\64\u0259\n\64\3\65\3\65\3\65\7\65\u025e\n\65\f\65\16\65\u0261" +
					"\13\65\3\66\3\66\3\66\5\66\u0266\n\66\3\66\3\66\3\66\3\66\5\66\u026c\n" +
					"\66\3\66\3\66\3\66\3\66\5\66\u0272\n\66\3\66\5\66\u0275\n\66\3\67\3\67" +
					"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0285" +
					"\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
					"\3\67\5\67\u0295\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
					"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
					"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
					"\5\67\u02bd\n\67\3\67\3\67\3\67\3\67\5\67\u02c3\n\67\3\67\3\67\3\67\3" +
					"\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02cf\n\67\f\67\16\67\u02d2\13" +
					"\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02e4\n8\58\u02e6" +
					"\n8\39\39\39\39\39\39\39\59\u02ef\n9\59\u02f1\n9\3:\3:\5:\u02f5\n:\3:" +
					"\3:\3:\5:\u02fa\n:\7:\u02fc\n:\f:\16:\u02ff\13:\3:\5:\u0302\n:\3;\3;\5" +
					";\u0306\n;\3;\3;\3<\3<\3<\3<\7<\u030e\n<\f<\16<\u0311\13<\3<\3<\3<\3<" +
					"\3<\3<\3<\7<\u031a\n<\f<\16<\u031d\13<\3<\3<\7<\u0321\n<\f<\16<\u0324" +
					"\13<\5<\u0326\n<\3=\3=\5=\u032a\n=\3>\3>\3>\3?\3?\3?\5?\u0332\n?\3@\3" +
					"@\3@\5@\u0337\n@\3A\3A\3A\3A\3B\3B\3B\7B\u0340\nB\fB\16B\u0343\13B\3C" +
					"\5C\u0346\nC\3C\3C\5C\u034a\nC\3C\3C\7C\u034e\nC\fC\16C\u0351\13C\3D\3" +
					"D\3E\3E\3E\3E\7E\u0359\nE\fE\16E\u035c\13E\3E\3E\3F\3F\3F\3F\5F\u0364" +
					"\nF\5F\u0366\nF\3G\3G\3G\3G\5G\u036c\nG\3H\3H\5H\u0370\nH\3H\3H\3H\2\3" +
					"lI\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD" +
					"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c" +
					"\u008e\2\16\4\2\23\23**\3\2\658\3\29:\3\2UX\3\2KL\4\2YZ^^\3\2WX\4\2IJ" +
					"PQ\4\2OORR\4\2HH_i\3\2UV\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37\37\'\'\u03ce" +
					"\2\u0091\3\2\2\2\4\u00a4\3\2\2\2\6\u00ab\3\2\2\2\b\u00c1\3\2\2\2\n\u00c3" +
					"\3\2\2\2\f\u00d5\3\2\2\2\16\u00e0\3\2\2\2\20\u00ea\3\2\2\2\22\u00f6\3" +
					"\2\2\2\24\u0100\3\2\2\2\26\u0104\3\2\2\2\30\u0106\3\2\2\2\32\u0115\3\2" +
					"\2\2\34\u0123\3\2\2\2\36\u012b\3\2\2\2 \u0133\3\2\2\2\"\u0148\3\2\2\2" +
					"$\u0151\3\2\2\2&\u0153\3\2\2\2(\u0165\3\2\2\2*\u0169\3\2\2\2,\u016b\3" +
					"\2\2\2.\u016e\3\2\2\2\60\u0171\3\2\2\2\62\u0179\3\2\2\2\64\u017d\3\2\2" +
					"\2\66\u0185\3\2\2\28\u018a\3\2\2\2:\u0194\3\2\2\2<\u0196\3\2\2\2>\u01a6" +
					"\3\2\2\2@\u01ba\3\2\2\2B\u01bc\3\2\2\2D\u01c4\3\2\2\2F\u01d7\3\2\2\2H" +
					"\u01dc\3\2\2\2J\u01e5\3\2\2\2L\u01ec\3\2\2\2N\u01fa\3\2\2\2P\u01fc\3\2" +
					"\2\2R\u01fe\3\2\2\2T\u0200\3\2\2\2V\u020a\3\2\2\2X\u0212\3\2\2\2Z\u0219" +
					"\3\2\2\2\\\u021b\3\2\2\2^\u022b\3\2\2\2`\u0239\3\2\2\2b\u023e\3\2\2\2" +
					"d\u024c\3\2\2\2f\u0258\3\2\2\2h\u025a\3\2\2\2j\u0274\3\2\2\2l\u0284\3" +
					"\2\2\2n\u02e5\3\2\2\2p\u02f0\3\2\2\2r\u0301\3\2\2\2t\u0303\3\2\2\2v\u0309" +
					"\3\2\2\2x\u0327\3\2\2\2z\u032b\3\2\2\2|\u0331\3\2\2\2~\u0336\3\2\2\2\u0080" +
					"\u0338\3\2\2\2\u0082\u033c\3\2\2\2\u0084\u0345\3\2\2\2\u0086\u0352\3\2" +
					"\2\2\u0088\u0354\3\2\2\2\u008a\u0365\3\2\2\2\u008c\u036b\3\2\2\2\u008e" +
					"\u036d\3\2\2\2\u0090\u0092\5\4\3\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2" +
					"\2\2\u0092\u0096\3\2\2\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095" +
					"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c\3\2" +
					"\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\b\5\2\u009a\u0099\3\2\2\2\u009b" +
					"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2" +
					"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\2\2\3\u00a0\3\3\2\2\2\u00a1\u00a3" +
					"\5T+\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4" +
					"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\"" +
					"\2\2\u00a8\u00a9\5L\'\2\u00a9\u00aa\7E\2\2\u00aa\5\3\2\2\2\u00ab\u00ad" +
					"\7\33\2\2\u00ac\u00ae\7(\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae" +
					"\u00af\3\2\2\2\u00af\u00b2\5L\'\2\u00b0\u00b1\7G\2\2\u00b1\u00b3\7Y\2" +
					"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5" +
					"\7E\2\2\u00b5\7\3\2\2\2\u00b6\u00b8\5\24\13\2\u00b7\u00b6\3\2\2\2\u00b8" +
					"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2" +
					"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\5\30\r\2\u00bd\u00bf\5\n\6\2\u00be" +
					"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\7E" +
					"\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\t\3\2\2\2\u00c3\u00c4" +
					"\7\22\2\2\u00c4\u00c7\7q\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c8\5\u0082" +
					"B\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9" +
					"\u00cb\7A\2\2\u00ca\u00cc\5\f\7\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2" +
					"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\7F\2\2\u00ce\u00cd\3\2\2\2\u00ce" +
					"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\5\20\t\2\u00d1\u00d0\3" +
					"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7B\2\2\u00d4" +
					"\13\3\2\2\2\u00d5\u00da\5\16\b\2\u00d6\u00d7\7F\2\2\u00d7\u00d9\5\16\b" +
					"\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db" +
					"\3\2\2\2\u00db\r\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5T+\2\u00de\u00dd" +
					"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1" +
					"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7q\2\2\u00e4\u00e6\5\u008e" +
					"H\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7" +
					"\u00e9\5 \21\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\17\3\2\2" +
					"\2\u00ea\u00ee\7E\2\2\u00eb\u00ed\5\"\22\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0" +
					"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\21\3\2\2\2\u00f0" +
					"\u00ee\3\2\2\2\u00f1\u00f7\5\24\13\2\u00f2\u00f7\7 \2\2\u00f3\u00f7\7" +
					",\2\2\u00f4\u00f7\7\60\2\2\u00f5\u00f7\7\63\2\2\u00f6\u00f1\3\2\2\2\u00f6" +
					"\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2" +
					"\2\2\u00f7\23\3\2\2\2\u00f8\u0101\5T+\2\u00f9\u0101\7%\2\2\u00fa\u0101" +
					"\7$\2\2\u00fb\u0101\7#\2\2\u00fc\u0101\7(\2\2\u00fd\u0101\7\3\2\2\u00fe" +
					"\u0101\7\24\2\2\u00ff\u0101\7)\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2" +
					"\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100" +
					"\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\25\3\2\2" +
					"\2\u0102\u0105\7\24\2\2\u0103\u0105\5T+\2\u0104\u0102\3\2\2\2\u0104\u0103" +
					"\3\2\2\2\u0105\27\3\2\2\2\u0106\u0107\7\13\2\2\u0107\u0109\7q\2\2\u0108" +
					"\u010a\5\32\16\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010d\3" +
					"\2\2\2\u010b\u010c\7\23\2\2\u010c\u010e\5\u0084C\2\u010d\u010b\3\2\2\2" +
					"\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u0110\7\32\2\2\u0110\u0112" +
					"\5\u0082B\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2" +
					"\2\u0113\u0114\5 \21\2\u0114\31\3\2\2\2\u0115\u0116\7J\2\2\u0116\u011b" +
					"\5\34\17\2\u0117\u0118\7F\2\2\u0118\u011a\5\34\17\2\u0119\u0117\3\2\2" +
					"\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e" +
					"\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7I\2\2\u011f\33\3\2\2\2\u0120" +
					"\u0122\5T+\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2" +
					"\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0129" +
					"\7q\2\2\u0127\u0128\7\23\2\2\u0128\u012a\5\36\20\2\u0129\u0127\3\2\2\2" +
					"\u0129\u012a\3\2\2\2\u012a\35\3\2\2\2\u012b\u0130\5\u0084C\2\u012c\u012d" +
					"\7[\2\2\u012d\u012f\5\u0084C\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2" +
					"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\37\3\2\2\2\u0132\u0130" +
					"\3\2\2\2\u0133\u0137\7A\2\2\u0134\u0136\5\"\22\2\u0135\u0134\3\2\2\2\u0136" +
					"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2" +
					"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7B\2\2\u013b!\3\2\2\2\u013c\u0149" +
					"\7E\2\2\u013d\u013f\7(\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f" +
					"\u0140\3\2\2\2\u0140\u0149\5^\60\2\u0141\u0143\5\22\n\2\u0142\u0141\3" +
					"\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145" +
					"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5$\23\2\u0148\u013c\3\2" +
					"\2\2\u0148\u013e\3\2\2\2\u0148\u0144\3\2\2\2\u0149#\3\2\2\2\u014a\u0152" +
					"\5&\24\2\u014b\u0152\5,\27\2\u014c\u0152\5\62\32\2\u014d\u0152\5\60\31" +
					"\2\u014e\u0152\5.\30\2\u014f\u0152\5\30\r\2\u0150\u0152\5\n\6\2\u0151" +
					"\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2" +
					"\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152" +
					"%\3\2\2\2\u0153\u0154\5*\26\2\u0154\u0155\7q\2\2\u0155\u015a\5D#\2\u0156" +
					"\u0157\7C\2\2\u0157\u0159\7D\2\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2" +
					"\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015f\3\2\2\2\u015c\u015a" +
					"\3\2\2\2\u015d\u015e\7/\2\2\u015e\u0160\5B\"\2\u015f\u015d\3\2\2\2\u015f" +
					"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\5(\25\2\u0162\'\3\2\2\2" +
					"\u0163\u0166\5^\60\2\u0164\u0166\7E\2\2\u0165\u0163\3\2\2\2\u0165\u0164" +
					"\3\2\2\2\u0166)\3\2\2\2\u0167\u016a\5\u0084C\2\u0168\u016a\7\62\2\2\u0169" +
					"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a+\3\2\2\2\u016b\u016c\5\32\16" +
					"\2\u016c\u016d\5&\24\2\u016d-\3\2\2\2\u016e\u016f\5\32\16\2\u016f\u0170" +
					"\5\60\31\2\u0170/\3\2\2\2\u0171\u0172\7q\2\2\u0172\u0175\5D#\2\u0173\u0174" +
					"\7/\2\2\u0174\u0176\5B\"\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176" +
					"\u0177\3\2\2\2\u0177\u0178\5^\60\2\u0178\61\3\2\2\2\u0179\u017a\5\u0084" +
					"C\2\u017a\u017b\5\64\33\2\u017b\u017c\7E\2\2\u017c\63\3\2\2\2\u017d\u0182" +
					"\5\66\34\2\u017e\u017f\7F\2\2\u017f\u0181\5\66\34\2\u0180\u017e\3\2\2" +
					"\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\65" +
					"\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0188\58\35\2\u0186\u0187\7H\2\2\u0187" +
					"\u0189\5:\36\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\67\3\2\2" +
					"\2\u018a\u018f\7q\2\2\u018b\u018c\7C\2\2\u018c\u018e\7D\2\2\u018d\u018b" +
					"\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190" +
					"9\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0195\5<\37\2\u0193\u0195\5l\67\2" +
					"\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195;\3\2\2\2\u0196\u01a2\7" +
					"A\2\2\u0197\u019c\5:\36\2\u0198\u0199\7F\2\2\u0199\u019b\5:\36\2\u019a" +
					"\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2" +
					"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\7F\2\2\u01a0" +
					"\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u0197\3\2" +
					"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7B\2\2\u01a5" +
					"=\3\2\2\2\u01a6\u01a8\7q\2\2\u01a7\u01a9\5\u0088E\2\u01a8\u01a7\3\2\2" +
					"\2\u01a8\u01a9\3\2\2\2\u01a9\u01b1\3\2\2\2\u01aa\u01ab\7G\2\2\u01ab\u01ad" +
					"\7q\2\2\u01ac\u01ae\5\u0088E\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2" +
					"\u01ae\u01b0\3\2\2\2\u01af\u01aa\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af" +
					"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2?\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4" +
					"\u01bb\5\u0084C\2\u01b5\u01b8\7M\2\2\u01b6\u01b7\t\2\2\2\u01b7\u01b9\5" +
					"\u0084C\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2" +
					"\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01bbA\3\2\2\2\u01bc\u01c1\5" +
					"L\'\2\u01bd\u01be\7F\2\2\u01be\u01c0\5L\'\2\u01bf\u01bd\3\2\2\2\u01c0" +
					"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2C\3\2\2\2" +
					"\u01c3\u01c1\3\2\2\2\u01c4\u01c6\7?\2\2\u01c5\u01c7\5F$\2\u01c6\u01c5" +
					"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7@\2\2\u01c9" +
					"E\3\2\2\2\u01ca\u01cf\5H%\2\u01cb\u01cc\7F\2\2\u01cc\u01ce\5H%\2\u01cd" +
					"\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2" +
					"\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7F\2\2\u01d3" +
					"\u01d5\5J&\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2" +
					"\2\u01d6\u01d8\5J&\2\u01d7\u01ca\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8G\3" +
					"\2\2\2\u01d9\u01db\5\26\f\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc" +
					"\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2" +
					"\2\2\u01df\u01e0\5\u0084C\2\u01e0\u01e1\58\35\2\u01e1I\3\2\2\2\u01e2\u01e4" +
					"\5\26\f\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2" +
					"\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9" +
					"\5\u0084C\2\u01e9\u01ea\7m\2\2\u01ea\u01eb\58\35\2\u01ebK\3\2\2\2\u01ec" +
					"\u01f1\7q\2\2\u01ed\u01ee\7G\2\2\u01ee\u01f0\7q\2\2\u01ef\u01ed\3\2\2" +
					"\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2M" +
					"\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01fb\5P)\2\u01f5\u01fb\5R*\2\u01f6" +
					"\u01fb\7<\2\2\u01f7\u01fb\7=\2\2\u01f8\u01fb\7;\2\2\u01f9\u01fb\7>\2\2" +
					"\u01fa\u01f4\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fa\u01f7" +
					"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fbO\3\2\2\2\u01fc" +
					"\u01fd\t\3\2\2\u01fdQ\3\2\2\2\u01fe\u01ff\t\4\2\2\u01ffS\3\2\2\2\u0200" +
					"\u0201\7l\2\2\u0201\u0208\5L\'\2\u0202\u0205\7?\2\2\u0203\u0206\5V,\2" +
					"\u0204\u0206\5Z.\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0205\u0206" +
					"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\7@\2\2\u0208\u0202\3\2\2\2\u0208" +
					"\u0209\3\2\2\2\u0209U\3\2\2\2\u020a\u020f\5X-\2\u020b\u020c\7F\2\2\u020c" +
					"\u020e\5X-\2\u020d\u020b\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2" +
					"\2\u020f\u0210\3\2\2\2\u0210W\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213" +
					"\7q\2\2\u0213\u0214\7H\2\2\u0214\u0215\5Z.\2\u0215Y\3\2\2\2\u0216\u021a" +
					"\5l\67\2\u0217\u021a\5T+\2\u0218\u021a\5\\/\2\u0219\u0216\3\2\2\2\u0219" +
					"\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a[\3\2\2\2\u021b\u0224\7A\2\2\u021c" +
					"\u0221\5Z.\2\u021d\u021e\7F\2\2\u021e\u0220\5Z.\2\u021f\u021d\3\2\2\2" +
					"\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225" +
					"\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u021c\3\2\2\2\u0224\u0225\3\2\2\2\u0225" +
					"\u0227\3\2\2\2\u0226\u0228\7F\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2" +
					"\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7B\2\2\u022a]\3\2\2\2\u022b\u022f" +
					"\7A\2\2\u022c\u022e\5`\61\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f" +
					"\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2" +
					"\2\2\u0232\u0233\7B\2\2\u0233_\3\2\2\2\u0234\u0235\5b\62\2\u0235\u0236" +
					"\7E\2\2\u0236\u023a\3\2\2\2\u0237\u023a\5f\64\2\u0238\u023a\5d\63\2\u0239" +
					"\u0234\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023aa\3\2\2\2" +
					"\u023b\u023d\5\26\f\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c" +
					"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241" +
					"\u0242\5\u0084C\2\u0242\u0243\5\64\33\2\u0243c\3\2\2\2\u0244\u0246\5\24" +
					"\13\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247" +
					"\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024d\5\30" +
					"\r\2\u024b\u024d\7E\2\2\u024c\u0247\3\2\2\2\u024c\u024b\3\2\2\2\u024d" +
					"e\3\2\2\2\u024e\u0259\5^\60\2\u024f\u0251\7&\2\2\u0250\u0252\5l\67\2\u0251" +
					"\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0259\7E" +
					"\2\2\u0254\u0259\7E\2\2\u0255\u0256\5l\67\2\u0256\u0257\7E\2\2\u0257\u0259" +
					"\3\2\2\2\u0258\u024e\3\2\2\2\u0258\u024f\3\2\2\2\u0258\u0254\3\2\2\2\u0258" +
					"\u0255\3\2\2\2\u0259g\3\2\2\2\u025a\u025f\5l\67\2\u025b\u025c\7F\2\2\u025c" +
					"\u025e\5l\67\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2" +
					"\2\2\u025f\u0260\3\2\2\2\u0260i\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263" +
					"\7q\2\2\u0263\u0265\7?\2\2\u0264\u0266\5h\65\2\u0265\u0264\3\2\2\2\u0265" +
					"\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0275\7@\2\2\u0268\u0269\7-\2" +
					"\2\u0269\u026b\7?\2\2\u026a\u026c\5h\65\2\u026b\u026a\3\2\2\2\u026b\u026c" +
					"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0275\7@\2\2\u026e\u026f\7*\2\2\u026f" +
					"\u0271\7?\2\2\u0270\u0272\5h\65\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2" +
					"\2\2\u0272\u0273\3\2\2\2\u0273\u0275\7@\2\2\u0274\u0262\3\2\2\2\u0274" +
					"\u0268\3\2\2\2\u0274\u026e\3\2\2\2\u0275k\3\2\2\2\u0276\u0277\b\67\1\2" +
					"\u0277\u0285\5n8\2\u0278\u0285\5j\66\2\u0279\u027a\7!\2\2\u027a\u0285" +
					"\5p9\2\u027b\u027c\7?\2\2\u027c\u027d\5\u0084C\2\u027d\u027e\7@\2\2\u027e" +
					"\u027f\5l\67\23\u027f\u0285\3\2\2\2\u0280\u0281\t\5\2\2\u0281\u0285\5" +
					"l\67\21\u0282\u0283\t\6\2\2\u0283\u0285\5l\67\20\u0284\u0276\3\2\2\2\u0284" +
					"\u0278\3\2\2\2\u0284\u0279\3\2\2\2\u0284\u027b\3\2\2\2\u0284\u0280\3\2" +
					"\2\2\u0284\u0282\3\2\2\2\u0285\u02d0\3\2\2\2\u0286\u0287\f\17\2\2\u0287" +
					"\u0288\t\7\2\2\u0288\u02cf\5l\67\20\u0289\u028a\f\16\2\2\u028a\u028b\t" +
					"\b\2\2\u028b\u02cf\5l\67\17\u028c\u0294\f\r\2\2\u028d\u028e\7J\2\2\u028e" +
					"\u0295\7J\2\2\u028f\u0290\7I\2\2\u0290\u0291\7I\2\2\u0291\u0295\7I\2\2" +
					"\u0292\u0293\7I\2\2\u0293\u0295\7I\2\2\u0294\u028d\3\2\2\2\u0294\u028f" +
					"\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u02cf\5l\67\16" +
					"\u0297\u0298\f\f\2\2\u0298\u0299\t\t\2\2\u0299\u02cf\5l\67\r\u029a\u029b" +
					"\f\n\2\2\u029b\u029c\t\n\2\2\u029c\u02cf\5l\67\13\u029d\u029e\f\t\2\2" +
					"\u029e\u029f\7[\2\2\u029f\u02cf\5l\67\n\u02a0\u02a1\f\b\2\2\u02a1\u02a2" +
					"\7]\2\2\u02a2\u02cf\5l\67\t\u02a3\u02a4\f\7\2\2\u02a4\u02a5\7\\\2\2\u02a5" +
					"\u02cf\5l\67\b\u02a6\u02a7\f\6\2\2\u02a7\u02a8\7S\2\2\u02a8\u02cf\5l\67" +
					"\7\u02a9\u02aa\f\5\2\2\u02aa\u02ab\7T\2\2\u02ab\u02cf\5l\67\6\u02ac\u02ad" +
					"\f\4\2\2\u02ad\u02ae\7M\2\2\u02ae\u02af\5l\67\2\u02af\u02b0\7N\2\2\u02b0" +
					"\u02b1\5l\67\4\u02b1\u02cf\3\2\2\2\u02b2\u02b3\f\3\2\2\u02b3\u02b4\t\13" +
					"\2\2\u02b4\u02cf\5l\67\3\u02b5\u02b6\f\27\2\2\u02b6\u02c2\7G\2\2\u02b7" +
					"\u02c3\7q\2\2\u02b8\u02c3\5j\66\2\u02b9\u02c3\7-\2\2\u02ba\u02bc\7!\2" +
					"\2\u02bb\u02bd\5\u0080A\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd" +
					"\u02be\3\2\2\2\u02be\u02c3\5t;\2\u02bf\u02c0\7*\2\2\u02c0\u02c3\5\u008a" +
					"F\2\u02c1\u02c3\5z>\2\u02c2\u02b7\3\2\2\2\u02c2\u02b8\3\2\2\2\u02c2\u02b9" +
					"\3\2\2\2\u02c2\u02ba\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3" +
					"\u02cf\3\2\2\2\u02c4\u02c5\f\26\2\2\u02c5\u02c6\7C\2\2\u02c6\u02c7\5l" +
					"\67\2\u02c7\u02c8\7D\2\2\u02c8\u02cf\3\2\2\2\u02c9\u02ca\f\22\2\2\u02ca" +
					"\u02cf\t\f\2\2\u02cb\u02cc\f\13\2\2\u02cc\u02cd\7\34\2\2\u02cd\u02cf\5" +
					"\u0084C\2\u02ce\u0286\3\2\2\2\u02ce\u0289\3\2\2\2\u02ce\u028c\3\2\2\2" +
					"\u02ce\u0297\3\2\2\2\u02ce\u029a\3\2\2\2\u02ce\u029d\3\2\2\2\u02ce\u02a0" +
					"\3\2\2\2\u02ce\u02a3\3\2\2\2\u02ce\u02a6\3\2\2\2\u02ce\u02a9\3\2\2\2\u02ce" +
					"\u02ac\3\2\2\2\u02ce\u02b2\3\2\2\2\u02ce\u02b5\3\2\2\2\u02ce\u02c4\3\2" +
					"\2\2\u02ce\u02c9\3\2\2\2\u02ce\u02cb\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0" +
					"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1m\3\2\2\2\u02d2\u02d0\3\2\2\2" +
					"\u02d3\u02d4\7?\2\2\u02d4\u02d5\5l\67\2\u02d5\u02d6\7@\2\2\u02d6\u02e6" +
					"\3\2\2\2\u02d7\u02e6\7-\2\2\u02d8\u02e6\7*\2\2\u02d9\u02e6\5N(\2\u02da" +
					"\u02e6\7q\2\2\u02db\u02dc\5*\26\2\u02dc\u02dd\7G\2\2\u02dd\u02de\7\13" +
					"\2\2\u02de\u02e6\3\2\2\2\u02df\u02e3\5\u0080A\2\u02e0\u02e4\5\u008cG\2" +
					"\u02e1\u02e2\7-\2\2\u02e2\u02e4\5\u008eH\2\u02e3\u02e0\3\2\2\2\u02e3\u02e1" +
					"\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02d3\3\2\2\2\u02e5\u02d7\3\2\2\2\u02e5" +
					"\u02d8\3\2\2\2\u02e5\u02d9\3\2\2\2\u02e5\u02da\3\2\2\2\u02e5\u02db\3\2" +
					"\2\2\u02e5\u02df\3\2\2\2\u02e6o\3\2\2\2\u02e7\u02e8\5\u0080A\2\u02e8\u02e9" +
					"\5r:\2\u02e9\u02ea\5x=\2\u02ea\u02f1\3\2\2\2\u02eb\u02ee\5r:\2\u02ec\u02ef" +
					"\5v<\2\u02ed\u02ef\5x=\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef" +
					"\u02f1\3\2\2\2\u02f0\u02e7\3\2\2\2\u02f0\u02eb\3\2\2\2\u02f1q\3\2\2\2" +
					"\u02f2\u02f4\7q\2\2\u02f3\u02f5\5|?\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5" +
					"\3\2\2\2\u02f5\u02fd\3\2\2\2\u02f6\u02f7\7G\2\2\u02f7\u02f9\7q\2\2\u02f8" +
					"\u02fa\5|?\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2" +
					"\2\u02fb\u02f6\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe" +
					"\3\2\2\2\u02fe\u0302\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0302\5\u0086D" +
					"\2\u0301\u02f2\3\2\2\2\u0301\u0300\3\2\2\2\u0302s\3\2\2\2\u0303\u0305" +
					"\7q\2\2\u0304\u0306\5~@\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306" +
					"\u0307\3\2\2\2\u0307\u0308\5x=\2\u0308u\3\2\2\2\u0309\u0325\7C\2\2\u030a" +
					"\u030f\7D\2\2\u030b\u030c\7C\2\2\u030c\u030e\7D\2\2\u030d\u030b\3\2\2" +
					"\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312" +
					"\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0326\5<\37\2\u0313\u0314\5l\67\2\u0314" +
					"\u031b\7D\2\2\u0315\u0316\7C\2\2\u0316\u0317\5l\67\2\u0317\u0318\7D\2" +
					"\2\u0318\u031a\3\2\2\2\u0319\u0315\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319" +
					"\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0322\3\2\2\2\u031d\u031b\3\2\2\2\u031e" +
					"\u031f\7C\2\2\u031f\u0321\7D\2\2\u0320\u031e\3\2\2\2\u0321\u0324\3\2\2" +
					"\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322" +
					"\3\2\2\2\u0325\u030a\3\2\2\2\u0325\u0313\3\2\2\2\u0326w\3\2\2\2\u0327" +
					"\u0329\5\u008eH\2\u0328\u032a\5 \21\2\u0329\u0328\3\2\2\2\u0329\u032a" +
					"\3\2\2\2\u032ay\3\2\2\2\u032b\u032c\5\u0080A\2\u032c\u032d\5\u008cG\2" +
					"\u032d{\3\2\2\2\u032e\u032f\7J\2\2\u032f\u0332\7I\2\2\u0330\u0332\5\u0088" +
					"E\2\u0331\u032e\3\2\2\2\u0331\u0330\3\2\2\2\u0332}\3\2\2\2\u0333\u0334" +
					"\7J\2\2\u0334\u0337\7I\2\2\u0335\u0337\5\u0080A\2\u0336\u0333\3\2\2\2" +
					"\u0336\u0335\3\2\2\2\u0337\177\3\2\2\2\u0338\u0339\7J\2\2\u0339\u033a" +
					"\5\u0082B\2\u033a\u033b\7I\2\2\u033b\u0081\3\2\2\2\u033c\u0341\5\u0084" +
					"C\2\u033d\u033e\7F\2\2\u033e\u0340\5\u0084C\2\u033f\u033d\3\2\2\2\u0340" +
					"\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0083\3\2" +
					"\2\2\u0343\u0341\3\2\2\2\u0344\u0346\5T+\2\u0345\u0344\3\2\2\2\u0345\u0346" +
					"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u034a\5> \2\u0348\u034a\5\u0086D\2" +
					"\u0349\u0347\3\2\2\2\u0349\u0348\3\2\2\2\u034a\u034f\3\2\2\2\u034b\u034c" +
					"\7C\2\2\u034c\u034e\7D\2\2\u034d\u034b\3\2\2\2\u034e\u0351\3\2\2\2\u034f" +
					"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0085\3\2\2\2\u0351\u034f\3\2" +
					"\2\2\u0352\u0353\t\r\2\2\u0353\u0087\3\2\2\2\u0354\u0355\7J\2\2\u0355" +
					"\u035a\5@!\2\u0356\u0357\7F\2\2\u0357\u0359\5@!\2\u0358\u0356\3\2\2\2" +
					"\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d" +
					"\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035e\7I\2\2\u035e\u0089\3\2\2\2\u035f" +
					"\u0366\5\u008eH\2\u0360\u0361\7G\2\2\u0361\u0363\7q\2\2\u0362\u0364\5" +
					"\u008eH\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2" +
					"\u0365\u035f\3\2\2\2\u0365\u0360\3\2\2\2\u0366\u008b\3\2\2\2\u0367\u0368" +
					"\7*\2\2\u0368\u036c\5\u008aF\2\u0369\u036a\7q\2\2\u036a\u036c\5\u008e" +
					"H\2\u036b\u0367\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u008d\3\2\2\2\u036d" +
					"\u036f\7?\2\2\u036e\u0370\5h\65\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2" +
					"\2\2\u0370\u0371\3\2\2\2\u0371\u0372\7@\2\2\u0372\u008f\3\2\2\2o\u0091" +
					"\u0096\u009c\u00a4\u00ad\u00b2\u00b9\u00be\u00c1\u00c7\u00cb\u00ce\u00d1" +
					"\u00da\u00e0\u00e5\u00e8\u00ee\u00f6\u0100\u0104\u0109\u010d\u0111\u011b" +
					"\u0123\u0129\u0130\u0137\u013e\u0144\u0148\u0151\u015a\u015f\u0165\u0169" +
					"\u0175\u0182\u0188\u018f\u0194\u019c\u01a0\u01a2\u01a8\u01ad\u01b1\u01b8" +
					"\u01ba\u01c1\u01c6\u01cf\u01d4\u01d7\u01dc\u01e5\u01f1\u01fa\u0205\u0208" +
					"\u020f\u0219\u0221\u0224\u0227\u022f\u0239\u023e\u0247\u024c\u0251\u0258" +
					"\u025f\u0265\u026b\u0271\u0274\u0284\u0294\u02bc\u02c2\u02ce\u02d0\u02e3" +
					"\u02e5\u02ee\u02f0\u02f4\u02f9\u02fd\u0301\u0305\u030f\u031b\u0322\u0325" +
					"\u0329\u0331\u0336\u0341\u0345\u0349\u034f\u035a\u0363\u0365\u036b\u036f";
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
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'",
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'",
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'",
			"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='",
			"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='",
			"'>>>='", "'->'", "'::'", "'@'", "'...'"
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
			"TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", "HEX_LITERAL",
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL",
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN",
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT",
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE",
			"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV",
			"BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN",
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN",
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS",
			"WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
	};

	static {
		RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
	}

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "JavaParser.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN; }

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(143);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
					case 1: {
						setState(142);
						packageDeclaration();
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == IMPORT) {
					{
						{
							setState(145);
							importDeclaration();
						}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == SEMI || _la == AT) {
					{
						{
							setState(151);
							typeDeclaration();
						}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
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
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(159);
							annotation();
						}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(PACKAGE);
				setState(166);
				qualifiedName();
				setState(167);
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

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(169);
				match(IMPORT);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == STATIC) {
					{
						setState(170);
						match(STATIC);
					}
				}

				setState(173);
				qualifiedName();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == DOT) {
					{
						setState(174);
						match(DOT);
						setState(175);
						match(MUL);
					}
				}

				setState(178);
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
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ABSTRACT:
				case CLASS:
				case ENUM:
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
						{
							{
								setState(180);
								classOrInterfaceModifier();
							}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(188);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case CLASS: {
							setState(186);
							classDeclaration();
						}
						break;
						case ENUM: {
							setState(187);
							enumDeclaration();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(190);
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

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(193);
				match(ENUM);
				setState(194);
				match(IDENTIFIER);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(195);
						match(IMPLEMENTS);
						setState(196);
						typeList();
					}
				}

				setState(199);
				match(LBRACE);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == AT || _la == IDENTIFIER) {
					{
						setState(200);
						enumConstants();
					}
				}

				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(203);
						match(COMMA);
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == SEMI) {
					{
						setState(206);
						enumBodyDeclarations();
					}
				}

				setState(209);
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

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(211);
				enumConstant();
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(212);
								match(COMMA);
								setState(213);
								enumConstant();
							}
						}
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(219);
							annotation();
						}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(IDENTIFIER);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(226);
						arguments();
					}
				}

				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LBRACE) {
					{
						setState(229);
						classBody();
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

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(232);
				match(SEMI);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
						{
							setState(233);
							classBodyDeclaration();
						}
					}
					setState(238);
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

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modifier);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ABSTRACT:
				case FINAL:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(239);
					classOrInterfaceModifier();
				}
				break;
				case NATIVE:
					enterOuterAlt(_localctx, 2);
				{
					setState(240);
					match(NATIVE);
				}
				break;
				case SYNCHRONIZED:
					enterOuterAlt(_localctx, 3);
				{
					setState(241);
					match(SYNCHRONIZED);
				}
				break;
				case TRANSIENT:
					enterOuterAlt(_localctx, 4);
				{
					setState(242);
					match(TRANSIENT);
				}
				break;
				case VOLATILE:
					enterOuterAlt(_localctx, 5);
				{
					setState(243);
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

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classOrInterfaceModifier);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(246);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(247);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(248);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(249);
					match(PRIVATE);
				}
				break;
				case STATIC:
					enterOuterAlt(_localctx, 5);
				{
					setState(250);
					match(STATIC);
				}
				break;
				case ABSTRACT:
					enterOuterAlt(_localctx, 6);
				{
					setState(251);
					match(ABSTRACT);
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 7);
				{
					setState(252);
					match(FINAL);
				}
				break;
				case STRICTFP:
					enterOuterAlt(_localctx, 8);
				{
					setState(253);
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

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableModifier);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case FINAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(256);
					match(FINAL);
				}
				break;
				case AT:
					enterOuterAlt(_localctx, 2);
				{
					setState(257);
					annotation();
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
		enterRule(_localctx, 22, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(260);
				match(CLASS);
				setState(261);
				match(IDENTIFIER);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(262);
						typeParameters();
					}
				}

				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(265);
						match(EXTENDS);
						setState(266);
						typeType();
					}
				}

				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(269);
						match(IMPLEMENTS);
						setState(270);
						typeList();
					}
				}

				setState(273);
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

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(275);
				match(LT);
				setState(276);
				typeParameter();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(277);
							match(COMMA);
							setState(278);
							typeParameter();
						}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
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

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(286);
							annotation();
						}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(IDENTIFIER);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(293);
						match(EXTENDS);
						setState(294);
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

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(297);
				typeType();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == BITAND) {
					{
						{
							setState(298);
							match(BITAND);
							setState(299);
							typeType();
						}
					}
					setState(304);
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

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(305);
				match(LBRACE);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
						{
							setState(306);
							classBodyDeclaration();
						}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
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
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(326);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(314);
					match(SEMI);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == STATIC) {
						{
							setState(315);
							match(STATIC);
						}
					}

					setState(318);
					block();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(319);
									modifier();
								}
							}
						}
						setState(324);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
					}
					setState(325);
					memberDeclaration();
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

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDeclaration);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(328);
					methodDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(329);
					genericMethodDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(330);
					fieldDeclaration();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(331);
					constructorDeclaration();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(332);
					genericConstructorDeclaration();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(333);
					classDeclaration();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(334);
					enumDeclaration();
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
		enterRule(_localctx, 36, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(337);
				typeTypeOrVoid();
				setState(338);
				match(IDENTIFIER);
				setState(339);
				formalParameters();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(340);
							match(LBRACK);
							setState(341);
							match(RBRACK);
						}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(347);
						match(THROWS);
						setState(348);
						qualifiedNameList();
					}
				}

				setState(351);
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

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodBody);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(353);
					block();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(354);
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

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeTypeOrVoid);
		try {
			setState(359);
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
				case AT:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(357);
					typeType();
				}
				break;
				case VOID:
					enterOuterAlt(_localctx, 2);
				{
					setState(358);
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

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				typeParameters();
				setState(362);
				methodDeclaration();
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

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(364);
				typeParameters();
				setState(365);
				constructorDeclaration();
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
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(367);
				match(IDENTIFIER);
				setState(368);
				formalParameters();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(369);
						match(THROWS);
						setState(370);
						qualifiedNameList();
					}
				}

				setState(373);
				((ConstructorDeclarationContext) _localctx).constructorBody = block();
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
		enterRule(_localctx, 48, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(375);
				typeType();
				setState(376);
				variableDeclarators();
				setState(377);
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

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(379);
				variableDeclarator();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(380);
							match(COMMA);
							setState(381);
							variableDeclarator();
						}
					}
					setState(386);
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
		enterRule(_localctx, 52, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(387);
				variableDeclaratorId();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(388);
						match(ASSIGN);
						setState(389);
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
		enterRule(_localctx, 54, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(392);
				match(IDENTIFIER);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(393);
							match(LBRACK);
							setState(394);
							match(RBRACK);
						}
					}
					setState(399);
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

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableInitializer);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(400);
					arrayInitializer();
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
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
				case BOOL_LITERAL:
				case CHAR_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
				case LPAREN:
				case LT:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case AT:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 2);
				{
					setState(401);
					expression(0);
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

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(404);
				match(LBRACE);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(405);
						variableInitializer();
						setState(410);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(406);
										match(COMMA);
										setState(407);
										variableInitializer();
									}
								}
							}
							setState(412);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
						}
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == COMMA) {
							{
								setState(413);
								match(COMMA);
							}
						}

					}
				}

				setState(418);
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

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(420);
				match(IDENTIFIER);
				setState(422);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
					case 1: {
						setState(421);
						typeArguments();
					}
					break;
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(424);
								match(DOT);
								setState(425);
								match(IDENTIFIER);
								setState(427);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 46, _ctx)) {
									case 1: {
										setState(426);
										typeArguments();
									}
									break;
								}
							}
						}
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
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
		enterRule(_localctx, 62, RULE_typeArgument);
		int _la;
		try {
			setState(440);
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
				case AT:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(434);
					typeType();
				}
				break;
				case QUESTION:
					enterOuterAlt(_localctx, 2);
				{
					setState(435);
					match(QUESTION);
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == EXTENDS || _la == SUPER) {
						{
							setState(436);
							_la = _input.LA(1);
							if (!(_la == EXTENDS || _la == SUPER)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(437);
							typeType();
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

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(442);
				qualifiedName();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(443);
							match(COMMA);
							setState(444);
							qualifiedName();
						}
					}
					setState(449);
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

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(450);
				match(LPAREN);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la == AT || _la == IDENTIFIER) {
					{
						setState(451);
						formalParameterList();
					}
				}

				setState(454);
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

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(469);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(456);
					formalParameter();
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(457);
									match(COMMA);
									setState(458);
									formalParameter();
								}
							}
						}
						setState(463);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == COMMA) {
						{
							setState(464);
							match(COMMA);
							setState(465);
							lastFormalParameter();
						}
					}

				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(468);
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

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 55, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(471);
								variableModifier();
							}
						}
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 55, _ctx);
				}
				setState(477);
				typeType();
				setState(478);
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

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(480);
								variableModifier();
							}
						}
					}
					setState(485);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
				}
				setState(486);
				typeType();
				setState(487);
				match(ELLIPSIS);
				setState(488);
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

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(490);
				match(IDENTIFIER);
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(491);
								match(DOT);
								setState(492);
								match(IDENTIFIER);
							}
						}
					}
					setState(497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
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

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(498);
					integerLiteral();
				}
				break;
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(499);
					floatLiteral();
				}
				break;
				case CHAR_LITERAL:
					enterOuterAlt(_localctx, 3);
				{
					setState(500);
					match(CHAR_LITERAL);
				}
				break;
				case STRING_LITERAL:
					enterOuterAlt(_localctx, 4);
				{
					setState(501);
					match(STRING_LITERAL);
				}
				break;
				case BOOL_LITERAL:
					enterOuterAlt(_localctx, 5);
				{
					setState(502);
					match(BOOL_LITERAL);
				}
				break;
				case NULL_LITERAL:
					enterOuterAlt(_localctx, 6);
				{
					setState(503);
					match(NULL_LITERAL);
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

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(506);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
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

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(508);
				_la = _input.LA(1);
				if (!(_la == FLOAT_LITERAL || _la == HEX_FLOAT_LITERAL)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
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

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(510);
				match(AT);
				setState(511);
				qualifiedName();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(512);
						match(LPAREN);
						setState(515);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
							case 1: {
								setState(513);
								elementValuePairs();
							}
							break;
							case 2: {
								setState(514);
								elementValue();
							}
							break;
						}
						setState(517);
						match(RPAREN);
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

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(520);
				elementValuePair();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(521);
							match(COMMA);
							setState(522);
							elementValuePair();
						}
					}
					setState(527);
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
		enterRule(_localctx, 86, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(528);
				match(IDENTIFIER);
				setState(529);
				match(ASSIGN);
				setState(530);
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
		enterRule(_localctx, 88, RULE_elementValue);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(532);
					expression(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(533);
					annotation();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(534);
					elementValueArrayInitializer();
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
		enterRule(_localctx, 90, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(537);
				match(LBRACE);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(538);
						elementValue();
						setState(543);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(539);
										match(COMMA);
										setState(540);
										elementValue();
									}
								}
							}
							setState(545);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
						}
					}
				}

				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(548);
						match(COMMA);
					}
				}

				setState(551);
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

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(553);
				match(LBRACE);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
						{
							setState(554);
							blockStatement();
						}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
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

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_blockStatement);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(562);
					localVariableDeclaration();
					setState(563);
					match(SEMI);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(565);
					statement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(566);
					localTypeDeclaration();
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

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(569);
								variableModifier();
							}
						}
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
				}
				setState(575);
				typeType();
				setState(576);
				variableDeclarators();
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

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(586);
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
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
						{
							{
								setState(578);
								classOrInterfaceModifier();
							}
						}
						setState(583);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(584);
					classDeclaration();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(585);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_statement);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(588);
					((StatementContext) _localctx).blockLabel = block();
				}
				break;
				case RETURN:
					enterOuterAlt(_localctx, 2);
				{
					setState(589);
					match(RETURN);
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(590);
							expression(0);
						}
					}

					setState(593);
					match(SEMI);
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 3);
				{
					setState(594);
					match(SEMI);
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
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
				case BOOL_LITERAL:
				case CHAR_LITERAL:
				case STRING_LITERAL:
				case NULL_LITERAL:
				case LPAREN:
				case LT:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case AT:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 4);
				{
					setState(595);
					((StatementContext) _localctx).statementExpression = expression(0);
					setState(596);
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

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(600);
				expression(0);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(601);
							match(COMMA);
							setState(602);
							expression(0);
						}
					}
					setState(607);
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

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_methodCall);
		int _la;
		try {
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(608);
					match(IDENTIFIER);
					setState(609);
					match(LPAREN);
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(610);
							expressionList();
						}
					}

					setState(613);
					match(RPAREN);
				}
				break;
				case THIS:
					enterOuterAlt(_localctx, 2);
				{
					setState(614);
					match(THIS);
					setState(615);
					match(LPAREN);
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(616);
							expressionList();
						}
					}

					setState(619);
					match(RPAREN);
				}
				break;
				case SUPER:
					enterOuterAlt(_localctx, 3);
				{
					setState(620);
					match(SUPER);
					setState(621);
					match(LPAREN);
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(622);
							expressionList();
						}
					}

					setState(625);
					match(RPAREN);
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

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(642);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
					case 1: {
						setState(629);
						primary();
					}
					break;
					case 2: {
						setState(630);
						methodCall();
					}
					break;
					case 3: {
						setState(631);
						match(NEW);
						setState(632);
						creator();
					}
					break;
					case 4: {
						setState(633);
						match(LPAREN);
						setState(634);
						typeType();
						setState(635);
						match(RPAREN);
						setState(636);
						expression(17);
					}
					break;
					case 5: {
						setState(638);
						((ExpressionContext) _localctx).prefix = _input.LT(1);
						_la = _input.LA(1);
						if (!(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INC - 83)) | (1L << (DEC - 83)) | (1L << (ADD - 83)) | (1L << (SUB - 83)))) != 0))) {
							((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(639);
						expression(15);
					}
					break;
					case 6: {
						setState(640);
						((ExpressionContext) _localctx).prefix = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == BANG || _la == TILDE)) {
							((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(641);
						expression(14);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 83, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(716);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 82, _ctx)) {
								case 1: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(644);
									if (!(precpred(_ctx, 13)))
										throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(645);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MUL - 87)) | (1L << (DIV - 87)) | (1L << (MOD - 87)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(646);
									expression(14);
								}
								break;
								case 2: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(647);
									if (!(precpred(_ctx, 12)))
										throw new FailedPredicateException(this, "precpred(_ctx, 12)");
									setState(648);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == ADD || _la == SUB)) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(649);
									expression(13);
								}
								break;
								case 3: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(650);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(658);
									_errHandler.sync(this);
									switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
										case 1: {
											setState(651);
											match(LT);
											setState(652);
											match(LT);
										}
										break;
										case 2: {
											setState(653);
											match(GT);
											setState(654);
											match(GT);
											setState(655);
											match(GT);
										}
										break;
										case 3: {
											setState(656);
											match(GT);
											setState(657);
											match(GT);
										}
										break;
									}
									setState(660);
									expression(12);
								}
								break;
								case 4: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(661);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(662);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (LT - 71)) | (1L << (LE - 71)) | (1L << (GE - 71)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(663);
									expression(11);
								}
								break;
								case 5: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(664);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(665);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == EQUAL || _la == NOTEQUAL)) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(666);
									expression(9);
								}
								break;
								case 6: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(667);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(668);
									((ExpressionContext) _localctx).bop = match(BITAND);
									setState(669);
									expression(8);
								}
								break;
								case 7: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(670);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(671);
									((ExpressionContext) _localctx).bop = match(CARET);
									setState(672);
									expression(7);
								}
								break;
								case 8: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(673);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(674);
									((ExpressionContext) _localctx).bop = match(BITOR);
									setState(675);
									expression(6);
								}
								break;
								case 9: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(676);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(677);
									((ExpressionContext) _localctx).bop = match(AND);
									setState(678);
									expression(5);
								}
								break;
								case 10: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(679);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(680);
									((ExpressionContext) _localctx).bop = match(OR);
									setState(681);
									expression(4);
								}
								break;
								case 11: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(682);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(683);
									((ExpressionContext) _localctx).bop = match(QUESTION);
									setState(684);
									expression(0);
									setState(685);
									match(COLON);
									setState(686);
									expression(2);
								}
								break;
								case 12: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(688);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(689);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(690);
									expression(1);
								}
								break;
								case 13: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(691);
									if (!(precpred(_ctx, 21)))
										throw new FailedPredicateException(this, "precpred(_ctx, 21)");
									setState(692);
									((ExpressionContext) _localctx).bop = match(DOT);
									setState(704);
									_errHandler.sync(this);
									switch (getInterpreter().adaptivePredict(_input, 81, _ctx)) {
										case 1: {
											setState(693);
											match(IDENTIFIER);
										}
										break;
										case 2: {
											setState(694);
											methodCall();
										}
										break;
										case 3: {
											setState(695);
											match(THIS);
										}
										break;
										case 4: {
											setState(696);
											match(NEW);
											setState(698);
											_errHandler.sync(this);
											_la = _input.LA(1);
											if (_la == LT) {
												{
													setState(697);
													nonWildcardTypeArguments();
												}
											}

											setState(700);
											innerCreator();
										}
										break;
										case 5: {
											setState(701);
											match(SUPER);
											setState(702);
											superSuffix();
										}
										break;
										case 6: {
											setState(703);
											explicitGenericInvocation();
										}
										break;
									}
								}
								break;
								case 14: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(706);
									if (!(precpred(_ctx, 20)))
										throw new FailedPredicateException(this, "precpred(_ctx, 20)");
									setState(707);
									match(LBRACK);
									setState(708);
									expression(0);
									setState(709);
									match(RBRACK);
								}
								break;
								case 15: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(711);
									if (!(precpred(_ctx, 16)))
										throw new FailedPredicateException(this, "precpred(_ctx, 16)");
									setState(712);
									((ExpressionContext) _localctx).postfix = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == INC || _la == DEC)) {
										((ExpressionContext) _localctx).postfix = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
								}
								break;
								case 16: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(713);
									if (!(precpred(_ctx, 9)))
										throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(714);
									((ExpressionContext) _localctx).bop = match(INSTANCEOF);
									setState(715);
									typeType();
								}
								break;
							}
						}
					}
					setState(720);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 83, _ctx);
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

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primary);
		try {
			setState(739);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 85, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(721);
					match(LPAREN);
					setState(722);
					expression(0);
					setState(723);
					match(RPAREN);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(725);
					match(THIS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(726);
					match(SUPER);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(727);
					literal();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(728);
					match(IDENTIFIER);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(729);
					typeTypeOrVoid();
					setState(730);
					match(DOT);
					setState(731);
					match(CLASS);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(733);
					nonWildcardTypeArguments();
					setState(737);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case SUPER:
						case IDENTIFIER: {
							setState(734);
							explicitGenericInvocationSuffix();
						}
						break;
						case THIS: {
							setState(735);
							match(THIS);
							setState(736);
							arguments();
						}
						break;
						default:
							throw new NoViableAltException(this);
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

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_creator);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LT:
					enterOuterAlt(_localctx, 1);
				{
					setState(741);
					nonWildcardTypeArguments();
					setState(742);
					createdName();
					setState(743);
					classCreatorRest();
				}
				break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case IDENTIFIER:
					enterOuterAlt(_localctx, 2);
				{
					setState(745);
					createdName();
					setState(748);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case LBRACK: {
							setState(746);
							arrayCreatorRest();
						}
						break;
						case LPAREN: {
							setState(747);
							classCreatorRest();
						}
						break;
						default:
							throw new NoViableAltException(this);
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

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_createdName);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(752);
					match(IDENTIFIER);
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(753);
							typeArgumentsOrDiamond();
						}
					}

					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(756);
								match(DOT);
								setState(757);
								match(IDENTIFIER);
								setState(759);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LT) {
									{
										setState(758);
										typeArgumentsOrDiamond();
									}
								}

							}
						}
						setState(765);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					enterOuterAlt(_localctx, 2);
				{
					setState(766);
					primitiveType();
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

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(769);
				match(IDENTIFIER);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(770);
						nonWildcardTypeArgumentsOrDiamond();
					}
				}

				setState(773);
				classCreatorRest();
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

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(775);
				match(LBRACK);
				setState(803);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case RBRACK: {
						setState(776);
						match(RBRACK);
						setState(781);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == LBRACK) {
							{
								{
									setState(777);
									match(LBRACK);
									setState(778);
									match(RBRACK);
								}
							}
							setState(783);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(784);
						arrayInitializer();
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
					case DECIMAL_LITERAL:
					case HEX_LITERAL:
					case OCT_LITERAL:
					case BINARY_LITERAL:
					case FLOAT_LITERAL:
					case HEX_FLOAT_LITERAL:
					case BOOL_LITERAL:
					case CHAR_LITERAL:
					case STRING_LITERAL:
					case NULL_LITERAL:
					case LPAREN:
					case LT:
					case BANG:
					case TILDE:
					case INC:
					case DEC:
					case ADD:
					case SUB:
					case AT:
					case IDENTIFIER: {
						setState(785);
						expression(0);
						setState(786);
						match(RBRACK);
						setState(793);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(787);
										match(LBRACK);
										setState(788);
										expression(0);
										setState(789);
										match(RBRACK);
									}
								}
							}
							setState(795);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
						}
						setState(800);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 95, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(796);
										match(LBRACK);
										setState(797);
										match(RBRACK);
									}
								}
							}
							setState(802);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 95, _ctx);
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
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

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(805);
				arguments();
				setState(807);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 97, _ctx)) {
					case 1: {
						setState(806);
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

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(809);
				nonWildcardTypeArguments();
				setState(810);
				explicitGenericInvocationSuffix();
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
		enterRule(_localctx, 122, RULE_typeArgumentsOrDiamond);
		try {
			setState(815);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(812);
					match(LT);
					setState(813);
					match(GT);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(814);
					typeArguments();
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

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(820);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(817);
					match(LT);
					setState(818);
					match(GT);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(819);
					nonWildcardTypeArguments();
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

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(822);
				match(LT);
				setState(823);
				typeList();
				setState(824);
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

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(826);
				typeType();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(827);
							match(COMMA);
							setState(828);
							typeType();
						}
					}
					setState(833);
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

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == AT) {
					{
						setState(834);
						annotation();
					}
				}

				setState(839);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case IDENTIFIER: {
						setState(837);
						classOrInterfaceType();
					}
					break;
					case BOOLEAN:
					case BYTE:
					case CHAR:
					case DOUBLE:
					case FLOAT:
					case INT:
					case LONG:
					case SHORT: {
						setState(838);
						primitiveType();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 103, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(841);
								match(LBRACK);
								setState(842);
								match(RBRACK);
							}
						}
					}
					setState(847);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 103, _ctx);
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
		enterRule(_localctx, 132, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(848);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0))) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF) matchedEOF = true;
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

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(850);
				match(LT);
				setState(851);
				typeArgument();
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(852);
							match(COMMA);
							setState(853);
							typeArgument();
						}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
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

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_superSuffix);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LPAREN:
					enterOuterAlt(_localctx, 1);
				{
					setState(861);
					arguments();
				}
				break;
				case DOT:
					enterOuterAlt(_localctx, 2);
				{
					setState(862);
					match(DOT);
					setState(863);
					match(IDENTIFIER);
					setState(865);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 105, _ctx)) {
						case 1: {
							setState(864);
							arguments();
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

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_explicitGenericInvocationSuffix);
		try {
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SUPER:
					enterOuterAlt(_localctx, 1);
				{
					setState(869);
					match(SUPER);
					setState(870);
					superSuffix();
				}
				break;
				case IDENTIFIER:
					enterOuterAlt(_localctx, 2);
				{
					setState(871);
					match(IDENTIFIER);
					setState(872);
					arguments();
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

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(875);
				match(LPAREN);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(876);
						expressionList();
					}
				}

				setState(879);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 53:
				return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 13);
			case 1:
				return precpred(_ctx, 12);
			case 2:
				return precpred(_ctx, 11);
			case 3:
				return precpred(_ctx, 10);
			case 4:
				return precpred(_ctx, 8);
			case 5:
				return precpred(_ctx, 7);
			case 6:
				return precpred(_ctx, 6);
			case 7:
				return precpred(_ctx, 5);
			case 8:
				return precpred(_ctx, 4);
			case 9:
				return precpred(_ctx, 3);
			case 10:
				return precpred(_ctx, 2);
			case 11:
				return precpred(_ctx, 1);
			case 12:
				return precpred(_ctx, 21);
			case 13:
				return precpred(_ctx, 20);
			case 14:
				return precpred(_ctx, 16);
			case 15:
				return precpred(_ctx, 9);
		}
		return true;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EOF() {
			return getToken(JavaParser.EOF, 0);
		}

		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class, 0);
		}

		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}

		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class, i);
		}

		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}

		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compilationUnit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCompilationUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCompilationUnit(this);
		}
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode PACKAGE() {
			return getToken(JavaParser.PACKAGE, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_packageDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPackageDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPackageDeclaration(this);
		}
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IMPORT() {
			return getToken(JavaParser.IMPORT, 0);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JavaParser.STATIC, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_importDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterImportDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitImportDeclaration(this);
		}
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class, 0);
		}

		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}

		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeDeclaration(this);
		}
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode ENUM() {
			return getToken(JavaParser.ENUM, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public TerminalNode IMPLEMENTS() {
			return getToken(JavaParser.IMPLEMENTS, 0);
		}

		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class, 0);
		}

		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class, 0);
		}

		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumDeclaration(this);
		}
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}

		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstants;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumConstants(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumConstants(this);
		}
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumConstant;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumConstant(this);
		}
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}

		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_enumBodyDeclarations;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterEnumBodyDeclarations(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitEnumBodyDeclarations(this);
		}
	}

	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class, 0);
		}

		public TerminalNode NATIVE() {
			return getToken(JavaParser.NATIVE, 0);
		}

		public TerminalNode SYNCHRONIZED() {
			return getToken(JavaParser.SYNCHRONIZED, 0);
		}

		public TerminalNode TRANSIENT() {
			return getToken(JavaParser.TRANSIENT, 0);
		}

		public TerminalNode VOLATILE() {
			return getToken(JavaParser.VOLATILE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_modifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitModifier(this);
		}
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public TerminalNode PUBLIC() {
			return getToken(JavaParser.PUBLIC, 0);
		}

		public TerminalNode PROTECTED() {
			return getToken(JavaParser.PROTECTED, 0);
		}

		public TerminalNode PRIVATE() {
			return getToken(JavaParser.PRIVATE, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JavaParser.STATIC, 0);
		}

		public TerminalNode ABSTRACT() {
			return getToken(JavaParser.ABSTRACT, 0);
		}

		public TerminalNode FINAL() {
			return getToken(JavaParser.FINAL, 0);
		}

		public TerminalNode STRICTFP() {
			return getToken(JavaParser.STRICTFP, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classOrInterfaceModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterClassOrInterfaceModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitClassOrInterfaceModifier(this);
		}
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode FINAL() {
			return getToken(JavaParser.FINAL, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableModifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableModifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableModifier(this);
		}
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode CLASS() {
			return getToken(JavaParser.CLASS, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JavaParser.EXTENDS, 0);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public TerminalNode IMPLEMENTS() {
			return getToken(JavaParser.IMPLEMENTS, 0);
		}

		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassDeclaration(this);
		}
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}

		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeParameters(this);
		}
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
		}

		public TerminalNode EXTENDS() {
			return getToken(JavaParser.EXTENDS, 0);
		}

		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeParameter(this);
		}
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}

		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeBound;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeBound(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeBound(this);
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
			return getRuleContext(ClassBodyDeclarationContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassBody(this);
		}
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode STATIC() {
			return getToken(JavaParser.STATIC, 0);
		}

		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class, 0);
		}

		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}

		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classBodyDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassBodyDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassBodyDeclaration(this);
		}
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class, 0);
		}

		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class, 0);
		}

		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class, 0);
		}

		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class, 0);
		}

		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class, 0);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_memberDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMemberDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMemberDeclaration(this);
		}
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class, 0);
		}

		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class, 0);
		}

		public TerminalNode THROWS() {
			return getToken(JavaParser.THROWS, 0);
		}

		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodDeclaration(this);
		}
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodBody(this);
		}
	}

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public TerminalNode VOID() {
			return getToken(JavaParser.VOID, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeTypeOrVoid;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeTypeOrVoid(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeTypeOrVoid(this);
		}
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_genericMethodDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterGenericMethodDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitGenericMethodDeclaration(this);
		}
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_genericConstructorDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterGenericConstructorDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitGenericConstructorDeclaration(this);
		}
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;

		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class, 0);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode THROWS() {
			return getToken(JavaParser.THROWS, 0);
		}

		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructorDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterConstructorDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitConstructorDeclaration(this);
		}
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFieldDeclaration(this);
		}
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}

		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarators;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclarators(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclarators(this);
		}
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclarator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclarator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclarator(this);
		}
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableDeclaratorId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableDeclaratorId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableDeclaratorId(this);
		}
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterVariableInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitVariableInitializer(this);
		}
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}

		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArrayInitializer(this);
		}
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> IDENTIFIER() {
			return getTokens(JavaParser.IDENTIFIER);
		}

		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}

		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}

		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classOrInterfaceType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassOrInterfaceType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassOrInterfaceType(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public TerminalNode EXTENDS() {
			return getToken(JavaParser.EXTENDS, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JavaParser.SUPER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgument;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeArgument(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeArgument(this);
		}
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}

		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_qualifiedNameList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterQualifiedNameList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitQualifiedNameList(this);
		}
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameters;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameters(this);
		}
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}

		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class, i);
		}

		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameterList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameterList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameterList(this);
		}
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_formalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFormalParameter(this);
		}
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_lastFormalParameter;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLastFormalParameter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLastFormalParameter(this);
		}
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> IDENTIFIER() {
			return getTokens(JavaParser.IDENTIFIER);
		}

		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_qualifiedName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterQualifiedName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitQualifiedName(this);
		}
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class, 0);
		}

		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class, 0);
		}

		public TerminalNode CHAR_LITERAL() {
			return getToken(JavaParser.CHAR_LITERAL, 0);
		}

		public TerminalNode STRING_LITERAL() {
			return getToken(JavaParser.STRING_LITERAL, 0);
		}

		public TerminalNode BOOL_LITERAL() {
			return getToken(JavaParser.BOOL_LITERAL, 0);
		}

		public TerminalNode NULL_LITERAL() {
			return getToken(JavaParser.NULL_LITERAL, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLiteral(this);
		}
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DECIMAL_LITERAL() {
			return getToken(JavaParser.DECIMAL_LITERAL, 0);
		}

		public TerminalNode HEX_LITERAL() {
			return getToken(JavaParser.HEX_LITERAL, 0);
		}

		public TerminalNode OCT_LITERAL() {
			return getToken(JavaParser.OCT_LITERAL, 0);
		}

		public TerminalNode BINARY_LITERAL() {
			return getToken(JavaParser.BINARY_LITERAL, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_integerLiteral;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterIntegerLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitIntegerLiteral(this);
		}
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode FLOAT_LITERAL() {
			return getToken(JavaParser.FLOAT_LITERAL, 0);
		}

		public TerminalNode HEX_FLOAT_LITERAL() {
			return getToken(JavaParser.HEX_FLOAT_LITERAL, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_floatLiteral;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterFloatLiteral(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitFloatLiteral(this);
		}
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class, 0);
		}

		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitAnnotation(this);
		}
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}

		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePairs;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValuePairs(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValuePairs(this);
		}
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValuePair;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValuePair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValuePair(this);
		}
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValue;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterElementValue(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitElementValue(this);
		}
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}

		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elementValueArrayInitializer;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterElementValueArrayInitializer(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitElementValueArrayInitializer(this);
		}
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}

		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitBlock(this);
		}
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitBlockStatement(this);
		}
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class, 0);
		}

		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}

		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localVariableDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterLocalVariableDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitLocalVariableDeclaration(this);
		}
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class, 0);
		}

		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}

		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_localTypeDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterLocalTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitLocalTypeDeclaration(this);
		}
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public BlockContext block() {
			return getRuleContext(BlockContext.class, 0);
		}

		public TerminalNode RETURN() {
			return getToken(JavaParser.RETURN, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode SEMI() {
			return getToken(JavaParser.SEMI, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitStatement(this);
		}
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expressionList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterExpressionList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitExpressionList(this);
		}
	}

	public static class MethodCallContext extends ParserRuleContext {
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		public TerminalNode THIS() {
			return getToken(JavaParser.THIS, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JavaParser.SUPER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_methodCall;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterMethodCall(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitMethodCall(this);
		}
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class, 0);
		}

		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class, 0);
		}

		public TerminalNode NEW() {
			return getToken(JavaParser.NEW, 0);
		}

		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class, 0);
		}

		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public TerminalNode THIS() {
			return getToken(JavaParser.THIS, 0);
		}

		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JavaParser.SUPER, 0);
		}

		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class, 0);
		}

		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class, 0);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		public TerminalNode INSTANCEOF() {
			return getToken(JavaParser.INSTANCEOF, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitExpression(this);
		}
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public TerminalNode THIS() {
			return getToken(JavaParser.THIS, 0);
		}

		public TerminalNode SUPER() {
			return getToken(JavaParser.SUPER, 0);
		}

		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class, 0);
		}

		public TerminalNode CLASS() {
			return getToken(JavaParser.CLASS, 0);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primary;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPrimary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPrimary(this);
		}
	}

	public static class CreatorContext extends ParserRuleContext {
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class, 0);
		}

		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class, 0);
		}

		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_creator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCreator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCreator(this);
		}
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TerminalNode> IDENTIFIER() {
			return getTokens(JavaParser.IDENTIFIER);
		}

		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}

		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}

		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class, i);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_createdName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterCreatedName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitCreatedName(this);
		}
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class, 0);
		}

		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_innerCreator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterInnerCreator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitInnerCreator(this);
		}
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arrayCreatorRest;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArrayCreatorRest(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArrayCreatorRest(this);
		}
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classCreatorRest;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterClassCreatorRest(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitClassCreatorRest(this);
		}
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_explicitGenericInvocation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterExplicitGenericInvocation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitExplicitGenericInvocation(this);
		}
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArgumentsOrDiamond;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterTypeArgumentsOrDiamond(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_nonWildcardTypeArgumentsOrDiamond;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_nonWildcardTypeArguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterNonWildcardTypeArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitNonWildcardTypeArguments(this);
		}
	}

	public static class TypeListContext extends ParserRuleContext {
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}

		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeList(this);
		}
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class, 0);
		}

		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class, 0);
		}

		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeType(this);
		}
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode BOOLEAN() {
			return getToken(JavaParser.BOOLEAN, 0);
		}

		public TerminalNode CHAR() {
			return getToken(JavaParser.CHAR, 0);
		}

		public TerminalNode BYTE() {
			return getToken(JavaParser.BYTE, 0);
		}

		public TerminalNode SHORT() {
			return getToken(JavaParser.SHORT, 0);
		}

		public TerminalNode INT() {
			return getToken(JavaParser.INT, 0);
		}

		public TerminalNode LONG() {
			return getToken(JavaParser.LONG, 0);
		}

		public TerminalNode FLOAT() {
			return getToken(JavaParser.FLOAT, 0);
		}

		public TerminalNode DOUBLE() {
			return getToken(JavaParser.DOUBLE, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_primitiveType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterPrimitiveType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitPrimitiveType(this);
		}
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}

		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeArguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterTypeArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitTypeArguments(this);
		}
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_superSuffix;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterSuperSuffix(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitSuperSuffix(this);
		}
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode SUPER() {
			return getToken(JavaParser.SUPER, 0);
		}

		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(JavaParser.IDENTIFIER, 0);
		}

		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_explicitGenericInvocationSuffix;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).enterExplicitGenericInvocationSuffix(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener)
				((JavaParserListener) listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arguments;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).enterArguments(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JavaParserListener) ((JavaParserListener) listener).exitArguments(this);
		}
	}
}
