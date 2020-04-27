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
			RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5,
			RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8,
			RULE_typeParameter = 9, RULE_typeBound = 10, RULE_classBody = 11, RULE_classBodyDeclaration = 12,
			RULE_memberDeclaration = 13, RULE_methodDeclaration = 14, RULE_methodBody = 15,
			RULE_typeTypeOrVoid = 16, RULE_genericMethodDeclaration = 17, RULE_genericConstructorDeclaration = 18,
			RULE_constructorDeclaration = 19, RULE_fieldDeclaration = 20, RULE_variableDeclarators = 21,
			RULE_variableDeclarator = 22, RULE_variableDeclaratorId = 23, RULE_variableInitializer = 24,
			RULE_arrayInitializer = 25, RULE_classOrInterfaceType = 26, RULE_typeArgument = 27,
			RULE_qualifiedNameList = 28, RULE_formalParameters = 29, RULE_formalParameterList = 30,
			RULE_formalParameter = 31, RULE_lastFormalParameter = 32, RULE_qualifiedName = 33,
			RULE_literal = 34, RULE_integerLiteral = 35, RULE_floatLiteral = 36, RULE_annotation = 37,
			RULE_elementValuePairs = 38, RULE_elementValuePair = 39, RULE_elementValue = 40,
			RULE_elementValueArrayInitializer = 41, RULE_block = 42, RULE_blockStatement = 43,
			RULE_localVariableDeclaration = 44, RULE_localTypeDeclaration = 45, RULE_statement = 46,
			RULE_expressionList = 47, RULE_methodCall = 48, RULE_expression = 49,
			RULE_primary = 50, RULE_creator = 51, RULE_createdName = 52, RULE_innerCreator = 53,
			RULE_arrayCreatorRest = 54, RULE_classCreatorRest = 55, RULE_explicitGenericInvocation = 56,
			RULE_typeArgumentsOrDiamond = 57, RULE_nonWildcardTypeArgumentsOrDiamond = 58,
			RULE_nonWildcardTypeArguments = 59, RULE_typeList = 60, RULE_typeType = 61,
			RULE_primitiveType = 62, RULE_typeArguments = 63, RULE_superSuffix = 64,
			RULE_explicitGenericInvocationSuffix = 65, RULE_arguments = 66;
	public static final String[] ruleNames = {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration",
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
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3q\u033a\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
					"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
					"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
					",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
					"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
					"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\5\2\u008a\n\2\3\2\7\2\u008d" +
					"\n\2\f\2\16\2\u0090\13\2\3\2\7\2\u0093\n\2\f\2\16\2\u0096\13\2\3\2\3\2" +
					"\3\3\7\3\u009b\n\3\f\3\16\3\u009e\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00a6" +
					"\n\4\3\4\3\4\3\4\5\4\u00ab\n\4\3\4\3\4\3\5\7\5\u00b0\n\5\f\5\16\5\u00b3" +
					"\13\5\3\5\3\5\5\5\u00b7\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00be\n\6\3\7\3\7" +
					"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c8\n\7\3\b\3\b\5\b\u00cc\n\b\3\t\3\t\3" +
					"\t\5\t\u00d1\n\t\3\t\3\t\5\t\u00d5\n\t\3\t\3\t\5\t\u00d9\n\t\3\t\3\t\3" +
					"\n\3\n\3\n\3\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3\n\3\n\3\13\7\13\u00e9" +
					"\n\13\f\13\16\13\u00ec\13\13\3\13\3\13\3\13\5\13\u00f1\n\13\3\f\3\f\3" +
					"\f\7\f\u00f6\n\f\f\f\16\f\u00f9\13\f\3\r\3\r\7\r\u00fd\n\r\f\r\16\r\u0100" +
					"\13\r\3\r\3\r\3\16\3\16\5\16\u0106\n\16\3\16\3\16\7\16\u010a\n\16\f\16" +
					"\16\16\u010d\13\16\3\16\5\16\u0110\n\16\3\17\3\17\3\17\3\17\3\17\3\17" +
					"\5\17\u0118\n\17\3\20\3\20\3\20\3\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122" +
					"\13\20\3\20\3\20\5\20\u0126\n\20\3\20\3\20\3\21\3\21\5\21\u012c\n\21\3" +
					"\22\3\22\5\22\u0130\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25" +
					"\3\25\5\25\u013c\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27" +
					"\u0147\n\27\f\27\16\27\u014a\13\27\3\30\3\30\3\30\5\30\u014f\n\30\3\31" +
					"\3\31\3\31\7\31\u0154\n\31\f\31\16\31\u0157\13\31\3\32\3\32\5\32\u015b" +
					"\n\32\3\33\3\33\3\33\3\33\7\33\u0161\n\33\f\33\16\33\u0164\13\33\3\33" +
					"\5\33\u0167\n\33\5\33\u0169\n\33\3\33\3\33\3\34\3\34\5\34\u016f\n\34\3" +
					"\34\3\34\3\34\5\34\u0174\n\34\7\34\u0176\n\34\f\34\16\34\u0179\13\34\3" +
					"\35\3\35\3\35\3\35\5\35\u017f\n\35\5\35\u0181\n\35\3\36\3\36\3\36\7\36" +
					"\u0186\n\36\f\36\16\36\u0189\13\36\3\37\3\37\5\37\u018d\n\37\3\37\3\37" +
					"\3 \3 \3 \7 \u0194\n \f \16 \u0197\13 \3 \3 \5 \u019b\n \3 \5 \u019e\n" +
					" \3!\7!\u01a1\n!\f!\16!\u01a4\13!\3!\3!\3!\3\"\7\"\u01aa\n\"\f\"\16\"" +
					"\u01ad\13\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u01b6\n#\f#\16#\u01b9\13#\3$\3" +
					"$\3$\3$\3$\3$\5$\u01c1\n$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01cc\n" +
					"\'\3\'\5\'\u01cf\n\'\3(\3(\3(\7(\u01d4\n(\f(\16(\u01d7\13(\3)\3)\3)\3" +
					")\3*\3*\3*\5*\u01e0\n*\3+\3+\3+\3+\7+\u01e6\n+\f+\16+\u01e9\13+\5+\u01eb" +
					"\n+\3+\5+\u01ee\n+\3+\3+\3,\3,\7,\u01f4\n,\f,\16,\u01f7\13,\3,\3,\3-\3" +
					"-\3-\3-\3-\5-\u0200\n-\3.\7.\u0203\n.\f.\16.\u0206\13.\3.\3.\3.\3/\7/" +
					"\u020c\n/\f/\16/\u020f\13/\3/\3/\5/\u0213\n/\3\60\3\60\3\60\5\60\u0218" +
					"\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u021f\n\60\3\61\3\61\3\61\7\61\u0224" +
					"\n\61\f\61\16\61\u0227\13\61\3\62\3\62\3\62\5\62\u022c\n\62\3\62\3\62" +
					"\3\62\3\62\5\62\u0232\n\62\3\62\3\62\3\62\3\62\5\62\u0238\n\62\3\62\5" +
					"\62\u023b\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63" +
					"\3\63\3\63\3\63\5\63\u024b\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63" +
					"\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u025b\n\63\3\63\3\63\3\63\3\63\3\63" +
					"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63" +
					"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63" +
					"\3\63\3\63\3\63\3\63\3\63\5\63\u0283\n\63\3\63\3\63\3\63\3\63\5\63\u0289" +
					"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0295\n\63" +
					"\f\63\16\63\u0298\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3" +
					"\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02aa\n\64\5\64\u02ac\n\64\3\65" +
					"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02b5\n\65\5\65\u02b7\n\65\3\66\3" +
					"\66\5\66\u02bb\n\66\3\66\3\66\3\66\5\66\u02c0\n\66\7\66\u02c2\n\66\f\66" +
					"\16\66\u02c5\13\66\3\66\5\66\u02c8\n\66\3\67\3\67\5\67\u02cc\n\67\3\67" +
					"\3\67\38\38\38\38\78\u02d4\n8\f8\168\u02d7\138\38\38\38\38\38\38\38\7" +
					"8\u02e0\n8\f8\168\u02e3\138\38\38\78\u02e7\n8\f8\168\u02ea\138\58\u02ec" +
					"\n8\39\39\59\u02f0\n9\3:\3:\3:\3;\3;\3;\5;\u02f8\n;\3<\3<\3<\5<\u02fd" +
					"\n<\3=\3=\3=\3=\3>\3>\3>\7>\u0306\n>\f>\16>\u0309\13>\3?\5?\u030c\n?\3" +
					"?\3?\5?\u0310\n?\3?\3?\7?\u0314\n?\f?\16?\u0317\13?\3@\3@\3A\3A\3A\3A" +
					"\7A\u031f\nA\fA\16A\u0322\13A\3A\3A\3B\3B\3B\3B\5B\u032a\nB\5B\u032c\n" +
					"B\3C\3C\3C\3C\5C\u0332\nC\3D\3D\5D\u0336\nD\3D\3D\3D\2\3dE\2\4\6\b\n\f" +
					"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^" +
					"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\16\4\2\23\23**\3\2\658\3\2" +
					"9:\3\2UX\3\2KL\4\2YZ^^\3\2WX\4\2IJPQ\4\2OORR\4\2HH_i\3\2UV\n\2\5\5\7\7" +
					"\n\n\20\20\26\26\35\35\37\37\'\'\u038d\2\u0089\3\2\2\2\4\u009c\3\2\2\2" +
					"\6\u00a3\3\2\2\2\b\u00b6\3\2\2\2\n\u00bd\3\2\2\2\f\u00c7\3\2\2\2\16\u00cb" +
					"\3\2\2\2\20\u00cd\3\2\2\2\22\u00dc\3\2\2\2\24\u00ea\3\2\2\2\26\u00f2\3" +
					"\2\2\2\30\u00fa\3\2\2\2\32\u010f\3\2\2\2\34\u0117\3\2\2\2\36\u0119\3\2" +
					"\2\2 \u012b\3\2\2\2\"\u012f\3\2\2\2$\u0131\3\2\2\2&\u0134\3\2\2\2(\u0137" +
					"\3\2\2\2*\u013f\3\2\2\2,\u0143\3\2\2\2.\u014b\3\2\2\2\60\u0150\3\2\2\2" +
					"\62\u015a\3\2\2\2\64\u015c\3\2\2\2\66\u016c\3\2\2\28\u0180\3\2\2\2:\u0182" +
					"\3\2\2\2<\u018a\3\2\2\2>\u019d\3\2\2\2@\u01a2\3\2\2\2B\u01ab\3\2\2\2D" +
					"\u01b2\3\2\2\2F\u01c0\3\2\2\2H\u01c2\3\2\2\2J\u01c4\3\2\2\2L\u01c6\3\2" +
					"\2\2N\u01d0\3\2\2\2P\u01d8\3\2\2\2R\u01df\3\2\2\2T\u01e1\3\2\2\2V\u01f1" +
					"\3\2\2\2X\u01ff\3\2\2\2Z\u0204\3\2\2\2\\\u0212\3\2\2\2^\u021e\3\2\2\2" +
					"`\u0220\3\2\2\2b\u023a\3\2\2\2d\u024a\3\2\2\2f\u02ab\3\2\2\2h\u02b6\3" +
					"\2\2\2j\u02c7\3\2\2\2l\u02c9\3\2\2\2n\u02cf\3\2\2\2p\u02ed\3\2\2\2r\u02f1" +
					"\3\2\2\2t\u02f7\3\2\2\2v\u02fc\3\2\2\2x\u02fe\3\2\2\2z\u0302\3\2\2\2|" +
					"\u030b\3\2\2\2~\u0318\3\2\2\2\u0080\u031a\3\2\2\2\u0082\u032b\3\2\2\2" +
					"\u0084\u0331\3\2\2\2\u0086\u0333\3\2\2\2\u0088\u008a\5\4\3\2\u0089\u0088" +
					"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b\u008d\5\6\4\2\u008c" +
					"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2" +
					"\2\2\u008f\u0094\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5\b\5\2\u0092" +
					"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2" +
					"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\2\2\3\u0098" +
					"\3\3\2\2\2\u0099\u009b\5L\'\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2" +
					"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c" +
					"\3\2\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\5D#\2\u00a1\u00a2\7E\2\2\u00a2" +
					"\5\3\2\2\2\u00a3\u00a5\7\33\2\2\u00a4\u00a6\7(\2\2\u00a5\u00a4\3\2\2\2" +
					"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\5D#\2\u00a8\u00a9" +
					"\7G\2\2\u00a9\u00ab\7Y\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab" +
					"\u00ac\3\2\2\2\u00ac\u00ad\7E\2\2\u00ad\7\3\2\2\2\u00ae\u00b0\5\f\7\2" +
					"\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2" +
					"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\5\20\t\2" +
					"\u00b5\u00b7\7E\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\t\3" +
					"\2\2\2\u00b8\u00be\5\f\7\2\u00b9\u00be\7 \2\2\u00ba\u00be\7,\2\2\u00bb" +
					"\u00be\7\60\2\2\u00bc\u00be\7\63\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3" +
					"\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be" +
					"\13\3\2\2\2\u00bf\u00c8\5L\'\2\u00c0\u00c8\7%\2\2\u00c1\u00c8\7$\2\2\u00c2" +
					"\u00c8\7#\2\2\u00c3\u00c8\7(\2\2\u00c4\u00c8\7\3\2\2\u00c5\u00c8\7\24" +
					"\2\2\u00c6\u00c8\7)\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7" +
					"\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2" +
					"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\r\3\2\2\2\u00c9\u00cc" +
					"\7\24\2\2\u00ca\u00cc\5L\'\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc" +
					"\17\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00d0\7q\2\2\u00cf\u00d1\5\22\n" +
					"\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3" +
					"\7\23\2\2\u00d3\u00d5\5|?\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5" +
					"\u00d8\3\2\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d9\5z>\2\u00d8\u00d6\3\2" +
					"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5\30\r\2\u00db" +
					"\21\3\2\2\2\u00dc\u00dd\7J\2\2\u00dd\u00e2\5\24\13\2\u00de\u00df\7F\2" +
					"\2\u00df\u00e1\5\24\13\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2" +
					"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2" +
					"\2\2\u00e5\u00e6\7I\2\2\u00e6\23\3\2\2\2\u00e7\u00e9\5L\'\2\u00e8\u00e7" +
					"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb" +
					"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\7q\2\2\u00ee\u00ef\7\23" +
					"\2\2\u00ef\u00f1\5\26\f\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1" +
					"\25\3\2\2\2\u00f2\u00f7\5|?\2\u00f3\u00f4\7[\2\2\u00f4\u00f6\5|?\2\u00f5" +
					"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2" +
					"\2\2\u00f8\27\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\7A\2\2\u00fb\u00fd" +
					"\5\32\16\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2" +
					"\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102" +
					"\7B\2\2\u0102\31\3\2\2\2\u0103\u0110\7E\2\2\u0104\u0106\7(\2\2\u0105\u0104" +
					"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0110\5V,\2\u0108" +
					"\u010a\5\n\6\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2" +
					"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e" +
					"\u0110\5\34\17\2\u010f\u0103\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u010b\3" +
					"\2\2\2\u0110\33\3\2\2\2\u0111\u0118\5\36\20\2\u0112\u0118\5$\23\2\u0113" +
					"\u0118\5*\26\2\u0114\u0118\5(\25\2\u0115\u0118\5&\24\2\u0116\u0118\5\20" +
					"\t\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117" +
					"\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\35\3\2\2" +
					"\2\u0119\u011a\5\"\22\2\u011a\u011b\7q\2\2\u011b\u0120\5<\37\2\u011c\u011d" +
					"\7C\2\2\u011d\u011f\7D\2\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120" +
					"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0120\3\2" +
					"\2\2\u0123\u0124\7/\2\2\u0124\u0126\5:\36\2\u0125\u0123\3\2\2\2\u0125" +
					"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\5 \21\2\u0128\37\3\2\2" +
					"\2\u0129\u012c\5V,\2\u012a\u012c\7E\2\2\u012b\u0129\3\2\2\2\u012b\u012a" +
					"\3\2\2\2\u012c!\3\2\2\2\u012d\u0130\5|?\2\u012e\u0130\7\62\2\2\u012f\u012d" +
					"\3\2\2\2\u012f\u012e\3\2\2\2\u0130#\3\2\2\2\u0131\u0132\5\22\n\2\u0132" +
					"\u0133\5\36\20\2\u0133%\3\2\2\2\u0134\u0135\5\22\n\2\u0135\u0136\5(\25" +
					"\2\u0136\'\3\2\2\2\u0137\u0138\7q\2\2\u0138\u013b\5<\37\2\u0139\u013a" +
					"\7/\2\2\u013a\u013c\5:\36\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c" +
					"\u013d\3\2\2\2\u013d\u013e\5V,\2\u013e)\3\2\2\2\u013f\u0140\5|?\2\u0140" +
					"\u0141\5,\27\2\u0141\u0142\7E\2\2\u0142+\3\2\2\2\u0143\u0148\5.\30\2\u0144" +
					"\u0145\7F\2\2\u0145\u0147\5.\30\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2" +
					"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149-\3\2\2\2\u014a\u0148" +
					"\3\2\2\2\u014b\u014e\5\60\31\2\u014c\u014d\7H\2\2\u014d\u014f\5\62\32" +
					"\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f/\3\2\2\2\u0150\u0155" +
					"\7q\2\2\u0151\u0152\7C\2\2\u0152\u0154\7D\2\2\u0153\u0151\3\2\2\2\u0154" +
					"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\61\3\2\2" +
					"\2\u0157\u0155\3\2\2\2\u0158\u015b\5\64\33\2\u0159\u015b\5d\63\2\u015a" +
					"\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\63\3\2\2\2\u015c\u0168\7A\2\2" +
					"\u015d\u0162\5\62\32\2\u015e\u015f\7F\2\2\u015f\u0161\5\62\32\2\u0160" +
					"\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2" +
					"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\7F\2\2\u0166" +
					"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u015d\3\2" +
					"\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7B\2\2\u016b" +
					"\65\3\2\2\2\u016c\u016e\7q\2\2\u016d\u016f\5\u0080A\2\u016e\u016d\3\2" +
					"\2\2\u016e\u016f\3\2\2\2\u016f\u0177\3\2\2\2\u0170\u0171\7G\2\2\u0171" +
					"\u0173\7q\2\2\u0172\u0174\5\u0080A\2\u0173\u0172\3\2\2\2\u0173\u0174\3" +
					"\2\2\2\u0174\u0176\3\2\2\2\u0175\u0170\3\2\2\2\u0176\u0179\3\2\2\2\u0177" +
					"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\67\3\2\2\2\u0179\u0177\3\2\2" +
					"\2\u017a\u0181\5|?\2\u017b\u017e\7M\2\2\u017c\u017d\t\2\2\2\u017d\u017f" +
					"\5|?\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180" +
					"\u017a\3\2\2\2\u0180\u017b\3\2\2\2\u01819\3\2\2\2\u0182\u0187\5D#\2\u0183" +
					"\u0184\7F\2\2\u0184\u0186\5D#\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2" +
					"\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188;\3\2\2\2\u0189\u0187" +
					"\3\2\2\2\u018a\u018c\7?\2\2\u018b\u018d\5> \2\u018c\u018b\3\2\2\2\u018c" +
					"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7@\2\2\u018f=\3\2\2\2\u0190" +
					"\u0195\5@!\2\u0191\u0192\7F\2\2\u0192\u0194\5@!\2\u0193\u0191\3\2\2\2" +
					"\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019a" +
					"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7F\2\2\u0199\u019b\5B\"\2\u019a" +
					"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019e\5B" +
					"\"\2\u019d\u0190\3\2\2\2\u019d\u019c\3\2\2\2\u019e?\3\2\2\2\u019f\u01a1" +
					"\5\16\b\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2" +
					"\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6" +
					"\5|?\2\u01a6\u01a7\5\60\31\2\u01a7A\3\2\2\2\u01a8\u01aa\5\16\b\2\u01a9" +
					"\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2" +
					"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\5|?\2\u01af\u01b0" +
					"\7m\2\2\u01b0\u01b1\5\60\31\2\u01b1C\3\2\2\2\u01b2\u01b7\7q\2\2\u01b3" +
					"\u01b4\7G\2\2\u01b4\u01b6\7q\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2" +
					"\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8E\3\2\2\2\u01b9\u01b7" +
					"\3\2\2\2\u01ba\u01c1\5H%\2\u01bb\u01c1\5J&\2\u01bc\u01c1\7<\2\2\u01bd" +
					"\u01c1\7=\2\2\u01be\u01c1\7;\2\2\u01bf\u01c1\7>\2\2\u01c0\u01ba\3\2\2" +
					"\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be" +
					"\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1G\3\2\2\2\u01c2\u01c3\t\3\2\2\u01c3" +
					"I\3\2\2\2\u01c4\u01c5\t\4\2\2\u01c5K\3\2\2\2\u01c6\u01c7\7l\2\2\u01c7" +
					"\u01ce\5D#\2\u01c8\u01cb\7?\2\2\u01c9\u01cc\5N(\2\u01ca\u01cc\5R*\2\u01cb" +
					"\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2" +
					"\2\2\u01cd\u01cf\7@\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf" +
					"M\3\2\2\2\u01d0\u01d5\5P)\2\u01d1\u01d2\7F\2\2\u01d2\u01d4\5P)\2\u01d3" +
					"\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2" +
					"\2\2\u01d6O\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da" +
					"\7H\2\2\u01da\u01db\5R*\2\u01dbQ\3\2\2\2\u01dc\u01e0\5d\63\2\u01dd\u01e0" +
					"\5L\'\2\u01de\u01e0\5T+\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df" +
					"\u01de\3\2\2\2\u01e0S\3\2\2\2\u01e1\u01ea\7A\2\2\u01e2\u01e7\5R*\2\u01e3" +
					"\u01e4\7F\2\2\u01e4\u01e6\5R*\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2" +
					"\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7" +
					"\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec" +
					"\u01ee\7F\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2" +
					"\2\2\u01ef\u01f0\7B\2\2\u01f0U\3\2\2\2\u01f1\u01f5\7A\2\2\u01f2\u01f4" +
					"\5X-\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5" +
					"\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7B" +
					"\2\2\u01f9W\3\2\2\2\u01fa\u01fb\5Z.\2\u01fb\u01fc\7E\2\2\u01fc\u0200\3" +
					"\2\2\2\u01fd\u0200\5^\60\2\u01fe\u0200\5\\/\2\u01ff\u01fa\3\2\2\2\u01ff" +
					"\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200Y\3\2\2\2\u0201\u0203\5\16\b\2" +
					"\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205" +
					"\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\5|?\2\u0208" +
					"\u0209\5,\27\2\u0209[\3\2\2\2\u020a\u020c\5\f\7\2\u020b\u020a\3\2\2\2" +
					"\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210" +
					"\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0213\5\20\t\2\u0211\u0213\7E\2\2\u0212" +
					"\u020d\3\2\2\2\u0212\u0211\3\2\2\2\u0213]\3\2\2\2\u0214\u021f\5V,\2\u0215" +
					"\u0217\7&\2\2\u0216\u0218\5d\63\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2" +
					"\2\2\u0218\u0219\3\2\2\2\u0219\u021f\7E\2\2\u021a\u021f\7E\2\2\u021b\u021c" +
					"\5d\63\2\u021c\u021d\7E\2\2\u021d\u021f\3\2\2\2\u021e\u0214\3\2\2\2\u021e" +
					"\u0215\3\2\2\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021f_\3\2\2\2" +
					"\u0220\u0225\5d\63\2\u0221\u0222\7F\2\2\u0222\u0224\5d\63\2\u0223\u0221" +
					"\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226" +
					"a\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7q\2\2\u0229\u022b\7?\2\2\u022a" +
					"\u022c\5`\61\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2" +
					"\2\2\u022d\u023b\7@\2\2\u022e\u022f\7-\2\2\u022f\u0231\7?\2\2\u0230\u0232" +
					"\5`\61\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233" +
					"\u023b\7@\2\2\u0234\u0235\7*\2\2\u0235\u0237\7?\2\2\u0236\u0238\5`\61" +
					"\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b" +
					"\7@\2\2\u023a\u0228\3\2\2\2\u023a\u022e\3\2\2\2\u023a\u0234\3\2\2\2\u023b" +
					"c\3\2\2\2\u023c\u023d\b\63\1\2\u023d\u024b\5f\64\2\u023e\u024b\5b\62\2" +
					"\u023f\u0240\7!\2\2\u0240\u024b\5h\65\2\u0241\u0242\7?\2\2\u0242\u0243" +
					"\5|?\2\u0243\u0244\7@\2\2\u0244\u0245\5d\63\23\u0245\u024b\3\2\2\2\u0246" +
					"\u0247\t\5\2\2\u0247\u024b\5d\63\21\u0248\u0249\t\6\2\2\u0249\u024b\5" +
					"d\63\20\u024a\u023c\3\2\2\2\u024a\u023e\3\2\2\2\u024a\u023f\3\2\2\2\u024a" +
					"\u0241\3\2\2\2\u024a\u0246\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u0296\3\2" +
					"\2\2\u024c\u024d\f\17\2\2\u024d\u024e\t\7\2\2\u024e\u0295\5d\63\20\u024f" +
					"\u0250\f\16\2\2\u0250\u0251\t\b\2\2\u0251\u0295\5d\63\17\u0252\u025a\f" +
					"\r\2\2\u0253\u0254\7J\2\2\u0254\u025b\7J\2\2\u0255\u0256\7I\2\2\u0256" +
					"\u0257\7I\2\2\u0257\u025b\7I\2\2\u0258\u0259\7I\2\2\u0259\u025b\7I\2\2" +
					"\u025a\u0253\3\2\2\2\u025a\u0255\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c" +
					"\3\2\2\2\u025c\u0295\5d\63\16\u025d\u025e\f\f\2\2\u025e\u025f\t\t\2\2" +
					"\u025f\u0295\5d\63\r\u0260\u0261\f\n\2\2\u0261\u0262\t\n\2\2\u0262\u0295" +
					"\5d\63\13\u0263\u0264\f\t\2\2\u0264\u0265\7[\2\2\u0265\u0295\5d\63\n\u0266" +
					"\u0267\f\b\2\2\u0267\u0268\7]\2\2\u0268\u0295\5d\63\t\u0269\u026a\f\7" +
					"\2\2\u026a\u026b\7\\\2\2\u026b\u0295\5d\63\b\u026c\u026d\f\6\2\2\u026d" +
					"\u026e\7S\2\2\u026e\u0295\5d\63\7\u026f\u0270\f\5\2\2\u0270\u0271\7T\2" +
					"\2\u0271\u0295\5d\63\6\u0272\u0273\f\4\2\2\u0273\u0274\7M\2\2\u0274\u0275" +
					"\5d\63\2\u0275\u0276\7N\2\2\u0276\u0277\5d\63\4\u0277\u0295\3\2\2\2\u0278" +
					"\u0279\f\3\2\2\u0279\u027a\t\13\2\2\u027a\u0295\5d\63\3\u027b\u027c\f" +
					"\27\2\2\u027c\u0288\7G\2\2\u027d\u0289\7q\2\2\u027e\u0289\5b\62\2\u027f" +
					"\u0289\7-\2\2\u0280\u0282\7!\2\2\u0281\u0283\5x=\2\u0282\u0281\3\2\2\2" +
					"\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0289\5l\67\2\u0285\u0286" +
					"\7*\2\2\u0286\u0289\5\u0082B\2\u0287\u0289\5r:\2\u0288\u027d\3\2\2\2\u0288" +
					"\u027e\3\2\2\2\u0288\u027f\3\2\2\2\u0288\u0280\3\2\2\2\u0288\u0285\3\2" +
					"\2\2\u0288\u0287\3\2\2\2\u0289\u0295\3\2\2\2\u028a\u028b\f\26\2\2\u028b" +
					"\u028c\7C\2\2\u028c\u028d\5d\63\2\u028d\u028e\7D\2\2\u028e\u0295\3\2\2" +
					"\2\u028f\u0290\f\22\2\2\u0290\u0295\t\f\2\2\u0291\u0292\f\13\2\2\u0292" +
					"\u0293\7\34\2\2\u0293\u0295\5|?\2\u0294\u024c\3\2\2\2\u0294\u024f\3\2" +
					"\2\2\u0294\u0252\3\2\2\2\u0294\u025d\3\2\2\2\u0294\u0260\3\2\2\2\u0294" +
					"\u0263\3\2\2\2\u0294\u0266\3\2\2\2\u0294\u0269\3\2\2\2\u0294\u026c\3\2" +
					"\2\2\u0294\u026f\3\2\2\2\u0294\u0272\3\2\2\2\u0294\u0278\3\2\2\2\u0294" +
					"\u027b\3\2\2\2\u0294\u028a\3\2\2\2\u0294\u028f\3\2\2\2\u0294\u0291\3\2" +
					"\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297" +
					"e\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\7?\2\2\u029a\u029b\5d\63\2\u029b" +
					"\u029c\7@\2\2\u029c\u02ac\3\2\2\2\u029d\u02ac\7-\2\2\u029e\u02ac\7*\2" +
					"\2\u029f\u02ac\5F$\2\u02a0\u02ac\7q\2\2\u02a1\u02a2\5\"\22\2\u02a2\u02a3" +
					"\7G\2\2\u02a3\u02a4\7\13\2\2\u02a4\u02ac\3\2\2\2\u02a5\u02a9\5x=\2\u02a6" +
					"\u02aa\5\u0084C\2\u02a7\u02a8\7-\2\2\u02a8\u02aa\5\u0086D\2\u02a9\u02a6" +
					"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u0299\3\2\2\2\u02ab" +
					"\u029d\3\2\2\2\u02ab\u029e\3\2\2\2\u02ab\u029f\3\2\2\2\u02ab\u02a0\3\2" +
					"\2\2\u02ab\u02a1\3\2\2\2\u02ab\u02a5\3\2\2\2\u02acg\3\2\2\2\u02ad\u02ae" +
					"\5x=\2\u02ae\u02af\5j\66\2\u02af\u02b0\5p9\2\u02b0\u02b7\3\2\2\2\u02b1" +
					"\u02b4\5j\66\2\u02b2\u02b5\5n8\2\u02b3\u02b5\5p9\2\u02b4\u02b2\3\2\2\2" +
					"\u02b4\u02b3\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02ad\3\2\2\2\u02b6\u02b1" +
					"\3\2\2\2\u02b7i\3\2\2\2\u02b8\u02ba\7q\2\2\u02b9\u02bb\5t;\2\u02ba\u02b9" +
					"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c3\3\2\2\2\u02bc\u02bd\7G\2\2\u02bd" +
					"\u02bf\7q\2\2\u02be\u02c0\5t;\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2" +
					"\2\u02c0\u02c2\3\2\2\2\u02c1\u02bc\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1" +
					"\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c8\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6" +
					"\u02c8\5~@\2\u02c7\u02b8\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8k\3\2\2\2\u02c9" +
					"\u02cb\7q\2\2\u02ca\u02cc\5v<\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2" +
					"\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\5p9\2\u02cem\3\2\2\2\u02cf\u02eb\7" +
					"C\2\2\u02d0\u02d5\7D\2\2\u02d1\u02d2\7C\2\2\u02d2\u02d4\7D\2\2\u02d3\u02d1" +
					"\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6" +
					"\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02ec\5\64\33\2\u02d9\u02da\5" +
					"d\63\2\u02da\u02e1\7D\2\2\u02db\u02dc\7C\2\2\u02dc\u02dd\5d\63\2\u02dd" +
					"\u02de\7D\2\2\u02de\u02e0\3\2\2\2\u02df\u02db\3\2\2\2\u02e0\u02e3\3\2" +
					"\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e8\3\2\2\2\u02e3" +
					"\u02e1\3\2\2\2\u02e4\u02e5\7C\2\2\u02e5\u02e7\7D\2\2\u02e6\u02e4\3\2\2" +
					"\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec" +
					"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02d0\3\2\2\2\u02eb\u02d9\3\2\2\2\u02ec" +
					"o\3\2\2\2\u02ed\u02ef\5\u0086D\2\u02ee\u02f0\5\30\r\2\u02ef\u02ee\3\2" +
					"\2\2\u02ef\u02f0\3\2\2\2\u02f0q\3\2\2\2\u02f1\u02f2\5x=\2\u02f2\u02f3" +
					"\5\u0084C\2\u02f3s\3\2\2\2\u02f4\u02f5\7J\2\2\u02f5\u02f8\7I\2\2\u02f6" +
					"\u02f8\5\u0080A\2\u02f7\u02f4\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8u\3\2\2" +
					"\2\u02f9\u02fa\7J\2\2\u02fa\u02fd\7I\2\2\u02fb\u02fd\5x=\2\u02fc\u02f9" +
					"\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fdw\3\2\2\2\u02fe\u02ff\7J\2\2\u02ff\u0300" +
					"\5z>\2\u0300\u0301\7I\2\2\u0301y\3\2\2\2\u0302\u0307\5|?\2\u0303\u0304" +
					"\7F\2\2\u0304\u0306\5|?\2\u0305\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307" +
					"\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308{\3\2\2\2\u0309\u0307\3\2\2\2" +
					"\u030a\u030c\5L\'\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030f" +
					"\3\2\2\2\u030d\u0310\5\66\34\2\u030e\u0310\5~@\2\u030f\u030d\3\2\2\2\u030f" +
					"\u030e\3\2\2\2\u0310\u0315\3\2\2\2\u0311\u0312\7C\2\2\u0312\u0314\7D\2" +
					"\2\u0313\u0311\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316" +
					"\3\2\2\2\u0316}\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\t\r\2\2\u0319" +
					"\177\3\2\2\2\u031a\u031b\7J\2\2\u031b\u0320\58\35\2\u031c\u031d\7F\2\2" +
					"\u031d\u031f\58\35\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e" +
					"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323" +
					"\u0324\7I\2\2\u0324\u0081\3\2\2\2\u0325\u032c\5\u0086D\2\u0326\u0327\7" +
					"G\2\2\u0327\u0329\7q\2\2\u0328\u032a\5\u0086D\2\u0329\u0328\3\2\2\2\u0329" +
					"\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0325\3\2\2\2\u032b\u0326\3\2" +
					"\2\2\u032c\u0083\3\2\2\2\u032d\u032e\7*\2\2\u032e\u0332\5\u0082B\2\u032f" +
					"\u0330\7q\2\2\u0330\u0332\5\u0086D\2\u0331\u032d\3\2\2\2\u0331\u032f\3" +
					"\2\2\2\u0332\u0085\3\2\2\2\u0333\u0335\7?\2\2\u0334\u0336\5`\61\2\u0335" +
					"\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\7@" +
					"\2\2\u0338\u0087\3\2\2\2e\u0089\u008e\u0094\u009c\u00a5\u00aa\u00b1\u00b6" +
					"\u00bd\u00c7\u00cb\u00d0\u00d4\u00d8\u00e2\u00ea\u00f0\u00f7\u00fe\u0105" +
					"\u010b\u010f\u0117\u0120\u0125\u012b\u012f\u013b\u0148\u014e\u0155\u015a" +
					"\u0162\u0166\u0168\u016e\u0173\u0177\u017e\u0180\u0187\u018c\u0195\u019a" +
					"\u019d\u01a2\u01ab\u01b7\u01c0\u01cb\u01ce\u01d5\u01df\u01e7\u01ea\u01ed" +
					"\u01f5\u01ff\u0204\u020d\u0212\u0217\u021e\u0225\u022b\u0231\u0237\u023a" +
					"\u024a\u025a\u0282\u0288\u0294\u0296\u02a9\u02ab\u02b4\u02b6\u02ba\u02bf" +
					"\u02c3\u02c7\u02cb\u02d5\u02e1\u02e8\u02eb\u02ef\u02f7\u02fc\u0307\u030b" +
					"\u030f\u0315\u0320\u0329\u032b\u0331\u0335";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
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
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
	}

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
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
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
		return _ATN;
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(135);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
					case 1: {
						setState(134);
						packageDeclaration();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == IMPORT) {
					{
						{
							setState(137);
							importDeclaration();
						}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == SEMI || _la == AT) {
					{
						{
							setState(143);
							typeDeclaration();
						}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
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
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(151);
							annotation();
						}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(PACKAGE);
				setState(158);
				qualifiedName();
				setState(159);
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
				setState(161);
				match(IMPORT);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == STATIC) {
					{
						setState(162);
						match(STATIC);
					}
				}

				setState(165);
				qualifiedName();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == DOT) {
					{
						setState(166);
						match(DOT);
						setState(167);
						match(MUL);
					}
				}

				setState(170);
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
			setState(180);
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
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
						{
							{
								setState(172);
								classOrInterfaceModifier();
							}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(178);
					classDeclaration();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(179);
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

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(187);
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
					setState(182);
					classOrInterfaceModifier();
				}
				break;
				case NATIVE:
					enterOuterAlt(_localctx, 2);
				{
					setState(183);
					match(NATIVE);
				}
				break;
				case SYNCHRONIZED:
					enterOuterAlt(_localctx, 3);
				{
					setState(184);
					match(SYNCHRONIZED);
				}
				break;
				case TRANSIENT:
					enterOuterAlt(_localctx, 4);
				{
					setState(185);
					match(TRANSIENT);
				}
				break;
				case VOLATILE:
					enterOuterAlt(_localctx, 5);
				{
					setState(186);
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
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AT:
					enterOuterAlt(_localctx, 1);
				{
					setState(189);
					annotation();
				}
				break;
				case PUBLIC:
					enterOuterAlt(_localctx, 2);
				{
					setState(190);
					match(PUBLIC);
				}
				break;
				case PROTECTED:
					enterOuterAlt(_localctx, 3);
				{
					setState(191);
					match(PROTECTED);
				}
				break;
				case PRIVATE:
					enterOuterAlt(_localctx, 4);
				{
					setState(192);
					match(PRIVATE);
				}
				break;
				case STATIC:
					enterOuterAlt(_localctx, 5);
				{
					setState(193);
					match(STATIC);
				}
				break;
				case ABSTRACT:
					enterOuterAlt(_localctx, 6);
				{
					setState(194);
					match(ABSTRACT);
				}
				break;
				case FINAL:
					enterOuterAlt(_localctx, 7);
				{
					setState(195);
					match(FINAL);
				}
				break;
				case STRICTFP:
					enterOuterAlt(_localctx, 8);
				{
					setState(196);
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
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case FINAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(199);
					match(FINAL);
				}
				break;
				case AT:
					enterOuterAlt(_localctx, 2);
				{
					setState(200);
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
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(203);
				match(CLASS);
				setState(204);
				match(IDENTIFIER);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(205);
						typeParameters();
					}
				}

				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(208);
						match(EXTENDS);
						setState(209);
						typeType();
					}
				}

				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == IMPLEMENTS) {
					{
						setState(212);
						match(IMPLEMENTS);
						setState(213);
						typeList();
					}
				}

				setState(216);
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
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(218);
				match(LT);
				setState(219);
				typeParameter();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(220);
							match(COMMA);
							setState(221);
							typeParameter();
						}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
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
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AT) {
					{
						{
							setState(229);
							annotation();
						}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(IDENTIFIER);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == EXTENDS) {
					{
						setState(236);
						match(EXTENDS);
						setState(237);
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
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(240);
				typeType();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == BITAND) {
					{
						{
							setState(241);
							match(BITAND);
							setState(242);
							typeType();
						}
					}
					setState(247);
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
		enterRule(_localctx, 22, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(248);
				match(LBRACE);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
						{
							setState(249);
							classBodyDeclaration();
						}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
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
		enterRule(_localctx, 24, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(257);
					match(SEMI);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == STATIC) {
						{
							setState(258);
							match(STATIC);
						}
					}

					setState(261);
					block();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(262);
									modifier();
								}
							}
						}
						setState(267);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
					}
					setState(268);
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
		enterRule(_localctx, 26, RULE_memberDeclaration);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(271);
					methodDeclaration();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(272);
					genericMethodDeclaration();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(273);
					fieldDeclaration();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(274);
					constructorDeclaration();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(275);
					genericConstructorDeclaration();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(276);
					classDeclaration();
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
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(279);
				typeTypeOrVoid();
				setState(280);
				match(IDENTIFIER);
				setState(281);
				formalParameters();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(282);
							match(LBRACK);
							setState(283);
							match(RBRACK);
						}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(289);
						match(THROWS);
						setState(290);
						qualifiedNameList();
					}
				}

				setState(293);
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
		enterRule(_localctx, 30, RULE_methodBody);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(295);
					block();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(296);
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
		enterRule(_localctx, 32, RULE_typeTypeOrVoid);
		try {
			setState(301);
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
					setState(299);
					typeType();
				}
				break;
				case VOID:
					enterOuterAlt(_localctx, 2);
				{
					setState(300);
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
		enterRule(_localctx, 34, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(303);
				typeParameters();
				setState(304);
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
		enterRule(_localctx, 36, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(306);
				typeParameters();
				setState(307);
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
		enterRule(_localctx, 38, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(309);
				match(IDENTIFIER);
				setState(310);
				formalParameters();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == THROWS) {
					{
						setState(311);
						match(THROWS);
						setState(312);
						qualifiedNameList();
					}
				}

				setState(315);
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
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(317);
				typeType();
				setState(318);
				variableDeclarators();
				setState(319);
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
		enterRule(_localctx, 42, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(321);
				variableDeclarator();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(322);
							match(COMMA);
							setState(323);
							variableDeclarator();
						}
					}
					setState(328);
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
		enterRule(_localctx, 44, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(329);
				variableDeclaratorId();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ASSIGN) {
					{
						setState(330);
						match(ASSIGN);
						setState(331);
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
		enterRule(_localctx, 46, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(334);
				match(IDENTIFIER);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LBRACK) {
					{
						{
							setState(335);
							match(LBRACK);
							setState(336);
							match(RBRACK);
						}
					}
					setState(341);
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
		enterRule(_localctx, 48, RULE_variableInitializer);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(342);
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
					setState(343);
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
		enterRule(_localctx, 50, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(346);
				match(LBRACE);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(347);
						variableInitializer();
						setState(352);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(348);
										match(COMMA);
										setState(349);
										variableInitializer();
									}
								}
							}
							setState(354);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
						}
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la == COMMA) {
							{
								setState(355);
								match(COMMA);
							}
						}

					}
				}

				setState(360);
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
		enterRule(_localctx, 52, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(362);
				match(IDENTIFIER);
				setState(364);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
					case 1: {
						setState(363);
						typeArguments();
					}
					break;
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(366);
								match(DOT);
								setState(367);
								match(IDENTIFIER);
								setState(369);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
									case 1: {
										setState(368);
										typeArguments();
									}
									break;
								}
							}
						}
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
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
		enterRule(_localctx, 54, RULE_typeArgument);
		int _la;
		try {
			setState(382);
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
					setState(376);
					typeType();
				}
				break;
				case QUESTION:
					enterOuterAlt(_localctx, 2);
				{
					setState(377);
					match(QUESTION);
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == EXTENDS || _la == SUPER) {
						{
							setState(378);
							_la = _input.LA(1);
							if (!(_la == EXTENDS || _la == SUPER)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(379);
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
		enterRule(_localctx, 56, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(384);
				qualifiedName();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(385);
							match(COMMA);
							setState(386);
							qualifiedName();
						}
					}
					setState(391);
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
		enterRule(_localctx, 58, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(392);
				match(LPAREN);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la == AT || _la == IDENTIFIER) {
					{
						setState(393);
						formalParameterList();
					}
				}

				setState(396);
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
		enterRule(_localctx, 60, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(411);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 44, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(398);
					formalParameter();
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(399);
									match(COMMA);
									setState(400);
									formalParameter();
								}
							}
						}
						setState(405);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 42, _ctx);
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == COMMA) {
						{
							setState(406);
							match(COMMA);
							setState(407);
							lastFormalParameter();
						}
					}

				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(410);
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
		enterRule(_localctx, 62, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(413);
								variableModifier();
							}
						}
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
				}
				setState(419);
				typeType();
				setState(420);
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
		enterRule(_localctx, 64, RULE_lastFormalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(422);
								variableModifier();
							}
						}
					}
					setState(427);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
				}
				setState(428);
				typeType();
				setState(429);
				match(ELLIPSIS);
				setState(430);
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
		enterRule(_localctx, 66, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(432);
				match(IDENTIFIER);
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(433);
								match(DOT);
								setState(434);
								match(IDENTIFIER);
							}
						}
					}
					setState(439);
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

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case DECIMAL_LITERAL:
				case HEX_LITERAL:
				case OCT_LITERAL:
				case BINARY_LITERAL:
					enterOuterAlt(_localctx, 1);
				{
					setState(440);
					integerLiteral();
				}
				break;
				case FLOAT_LITERAL:
				case HEX_FLOAT_LITERAL:
					enterOuterAlt(_localctx, 2);
				{
					setState(441);
					floatLiteral();
				}
				break;
				case CHAR_LITERAL:
					enterOuterAlt(_localctx, 3);
				{
					setState(442);
					match(CHAR_LITERAL);
				}
				break;
				case STRING_LITERAL:
					enterOuterAlt(_localctx, 4);
				{
					setState(443);
					match(STRING_LITERAL);
				}
				break;
				case BOOL_LITERAL:
					enterOuterAlt(_localctx, 5);
				{
					setState(444);
					match(BOOL_LITERAL);
				}
				break;
				case NULL_LITERAL:
					enterOuterAlt(_localctx, 6);
				{
					setState(445);
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
		enterRule(_localctx, 70, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(448);
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
		enterRule(_localctx, 72, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(450);
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
		enterRule(_localctx, 74, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(452);
				match(AT);
				setState(453);
				qualifiedName();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LPAREN) {
					{
						setState(454);
						match(LPAREN);
						setState(457);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 49, _ctx)) {
							case 1: {
								setState(455);
								elementValuePairs();
							}
							break;
							case 2: {
								setState(456);
								elementValue();
							}
							break;
						}
						setState(459);
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
		enterRule(_localctx, 76, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(462);
				elementValuePair();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(463);
							match(COMMA);
							setState(464);
							elementValuePair();
						}
					}
					setState(469);
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
		enterRule(_localctx, 78, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(470);
				match(IDENTIFIER);
				setState(471);
				match(ASSIGN);
				setState(472);
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
		enterRule(_localctx, 80, RULE_elementValue);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(474);
					expression(0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(475);
					annotation();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(476);
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
		enterRule(_localctx, 82, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(479);
				match(LBRACE);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(480);
						elementValue();
						setState(485);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(481);
										match(COMMA);
										setState(482);
										elementValue();
									}
								}
							}
							setState(487);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
						}
					}
				}

				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == COMMA) {
					{
						setState(490);
						match(COMMA);
					}
				}

				setState(493);
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
		enterRule(_localctx, 84, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(495);
				match(LBRACE);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (LT - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (AT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
						{
							setState(496);
							blockStatement();
						}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(502);
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
		enterRule(_localctx, 86, RULE_blockStatement);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(504);
					localVariableDeclaration();
					setState(505);
					match(SEMI);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(507);
					statement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(508);
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
		enterRule(_localctx, 88, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(511);
								variableModifier();
							}
						}
					}
					setState(516);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
				}
				setState(517);
				typeType();
				setState(518);
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
		enterRule(_localctx, 90, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(528);
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
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la == AT) {
						{
							{
								setState(520);
								classOrInterfaceModifier();
							}
						}
						setState(525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(526);
					classDeclaration();
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 2);
				{
					setState(527);
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
		enterRule(_localctx, 92, RULE_statement);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LBRACE:
					enterOuterAlt(_localctx, 1);
				{
					setState(530);
					((StatementContext) _localctx).blockLabel = block();
				}
				break;
				case RETURN:
					enterOuterAlt(_localctx, 2);
				{
					setState(531);
					match(RETURN);
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(532);
							expression(0);
						}
					}

					setState(535);
					match(SEMI);
				}
				break;
				case SEMI:
					enterOuterAlt(_localctx, 3);
				{
					setState(536);
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
					setState(537);
					((StatementContext) _localctx).statementExpression = expression(0);
					setState(538);
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
		enterRule(_localctx, 94, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(542);
				expression(0);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(543);
							match(COMMA);
							setState(544);
							expression(0);
						}
					}
					setState(549);
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
		enterRule(_localctx, 96, RULE_methodCall);
		int _la;
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(550);
					match(IDENTIFIER);
					setState(551);
					match(LPAREN);
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(552);
							expressionList();
						}
					}

					setState(555);
					match(RPAREN);
				}
				break;
				case THIS:
					enterOuterAlt(_localctx, 2);
				{
					setState(556);
					match(THIS);
					setState(557);
					match(LPAREN);
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(558);
							expressionList();
						}
					}

					setState(561);
					match(RPAREN);
				}
				break;
				case SUPER:
					enterOuterAlt(_localctx, 3);
				{
					setState(562);
					match(SUPER);
					setState(563);
					match(LPAREN);
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
						{
							setState(564);
							expressionList();
						}
					}

					setState(567);
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(584);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
					case 1: {
						setState(571);
						primary();
					}
					break;
					case 2: {
						setState(572);
						methodCall();
					}
					break;
					case 3: {
						setState(573);
						match(NEW);
						setState(574);
						creator();
					}
					break;
					case 4: {
						setState(575);
						match(LPAREN);
						setState(576);
						typeType();
						setState(577);
						match(RPAREN);
						setState(578);
						expression(17);
					}
					break;
					case 5: {
						setState(580);
						((ExpressionContext) _localctx).prefix = _input.LT(1);
						_la = _input.LA(1);
						if (!(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INC - 83)) | (1L << (DEC - 83)) | (1L << (ADD - 83)) | (1L << (SUB - 83)))) != 0))) {
							((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(581);
						expression(15);
					}
					break;
					case 6: {
						setState(582);
						((ExpressionContext) _localctx).prefix = _input.LT(1);
						_la = _input.LA(1);
						if (!(_la == BANG || _la == TILDE)) {
							((ExpressionContext) _localctx).prefix = (Token) _errHandler.recoverInline(this);
						} else {
							if (_input.LA(1) == Token.EOF) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(583);
						expression(14);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 73, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(658);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
								case 1: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(586);
									if (!(precpred(_ctx, 13)))
										throw new FailedPredicateException(this, "precpred(_ctx, 13)");
									setState(587);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MUL - 87)) | (1L << (DIV - 87)) | (1L << (MOD - 87)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(588);
									expression(14);
								}
								break;
								case 2: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(589);
									if (!(precpred(_ctx, 12)))
										throw new FailedPredicateException(this, "precpred(_ctx, 12)");
									setState(590);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == ADD || _la == SUB)) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(591);
									expression(13);
								}
								break;
								case 3: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(592);
									if (!(precpred(_ctx, 11)))
										throw new FailedPredicateException(this, "precpred(_ctx, 11)");
									setState(600);
									_errHandler.sync(this);
									switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
										case 1: {
											setState(593);
											match(LT);
											setState(594);
											match(LT);
										}
										break;
										case 2: {
											setState(595);
											match(GT);
											setState(596);
											match(GT);
											setState(597);
											match(GT);
										}
										break;
										case 3: {
											setState(598);
											match(GT);
											setState(599);
											match(GT);
										}
										break;
									}
									setState(602);
									expression(12);
								}
								break;
								case 4: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(603);
									if (!(precpred(_ctx, 10)))
										throw new FailedPredicateException(this, "precpred(_ctx, 10)");
									setState(604);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (LT - 71)) | (1L << (LE - 71)) | (1L << (GE - 71)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(605);
									expression(11);
								}
								break;
								case 5: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(606);
									if (!(precpred(_ctx, 8)))
										throw new FailedPredicateException(this, "precpred(_ctx, 8)");
									setState(607);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == EQUAL || _la == NOTEQUAL)) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(608);
									expression(9);
								}
								break;
								case 6: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(609);
									if (!(precpred(_ctx, 7)))
										throw new FailedPredicateException(this, "precpred(_ctx, 7)");
									setState(610);
									((ExpressionContext) _localctx).bop = match(BITAND);
									setState(611);
									expression(8);
								}
								break;
								case 7: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(612);
									if (!(precpred(_ctx, 6)))
										throw new FailedPredicateException(this, "precpred(_ctx, 6)");
									setState(613);
									((ExpressionContext) _localctx).bop = match(CARET);
									setState(614);
									expression(7);
								}
								break;
								case 8: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(615);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(616);
									((ExpressionContext) _localctx).bop = match(BITOR);
									setState(617);
									expression(6);
								}
								break;
								case 9: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(618);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(619);
									((ExpressionContext) _localctx).bop = match(AND);
									setState(620);
									expression(5);
								}
								break;
								case 10: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(621);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(622);
									((ExpressionContext) _localctx).bop = match(OR);
									setState(623);
									expression(4);
								}
								break;
								case 11: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(624);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(625);
									((ExpressionContext) _localctx).bop = match(QUESTION);
									setState(626);
									expression(0);
									setState(627);
									match(COLON);
									setState(628);
									expression(2);
								}
								break;
								case 12: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(630);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(631);
									((ExpressionContext) _localctx).bop = _input.LT(1);
									_la = _input.LA(1);
									if (!(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0))) {
										((ExpressionContext) _localctx).bop = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(632);
									expression(1);
								}
								break;
								case 13: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(633);
									if (!(precpred(_ctx, 21)))
										throw new FailedPredicateException(this, "precpred(_ctx, 21)");
									setState(634);
									((ExpressionContext) _localctx).bop = match(DOT);
									setState(646);
									_errHandler.sync(this);
									switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
										case 1: {
											setState(635);
											match(IDENTIFIER);
										}
										break;
										case 2: {
											setState(636);
											methodCall();
										}
										break;
										case 3: {
											setState(637);
											match(THIS);
										}
										break;
										case 4: {
											setState(638);
											match(NEW);
											setState(640);
											_errHandler.sync(this);
											_la = _input.LA(1);
											if (_la == LT) {
												{
													setState(639);
													nonWildcardTypeArguments();
												}
											}

											setState(642);
											innerCreator();
										}
										break;
										case 5: {
											setState(643);
											match(SUPER);
											setState(644);
											superSuffix();
										}
										break;
										case 6: {
											setState(645);
											explicitGenericInvocation();
										}
										break;
									}
								}
								break;
								case 14: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(648);
									if (!(precpred(_ctx, 20)))
										throw new FailedPredicateException(this, "precpred(_ctx, 20)");
									setState(649);
									match(LBRACK);
									setState(650);
									expression(0);
									setState(651);
									match(RBRACK);
								}
								break;
								case 15: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(653);
									if (!(precpred(_ctx, 16)))
										throw new FailedPredicateException(this, "precpred(_ctx, 16)");
									setState(654);
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
									setState(655);
									if (!(precpred(_ctx, 9)))
										throw new FailedPredicateException(this, "precpred(_ctx, 9)");
									setState(656);
									((ExpressionContext) _localctx).bop = match(INSTANCEOF);
									setState(657);
									typeType();
								}
								break;
							}
						}
					}
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 73, _ctx);
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
		enterRule(_localctx, 100, RULE_primary);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(663);
					match(LPAREN);
					setState(664);
					expression(0);
					setState(665);
					match(RPAREN);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(667);
					match(THIS);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(668);
					match(SUPER);
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(669);
					literal();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(670);
					match(IDENTIFIER);
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(671);
					typeTypeOrVoid();
					setState(672);
					match(DOT);
					setState(673);
					match(CLASS);
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(675);
					nonWildcardTypeArguments();
					setState(679);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case SUPER:
						case IDENTIFIER: {
							setState(676);
							explicitGenericInvocationSuffix();
						}
						break;
						case THIS: {
							setState(677);
							match(THIS);
							setState(678);
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
		enterRule(_localctx, 102, RULE_creator);
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LT:
					enterOuterAlt(_localctx, 1);
				{
					setState(683);
					nonWildcardTypeArguments();
					setState(684);
					createdName();
					setState(685);
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
					setState(687);
					createdName();
					setState(690);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case LBRACK: {
							setState(688);
							arrayCreatorRest();
						}
						break;
						case LPAREN: {
							setState(689);
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
		enterRule(_localctx, 104, RULE_createdName);
		int _la;
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case IDENTIFIER:
					enterOuterAlt(_localctx, 1);
				{
					setState(694);
					match(IDENTIFIER);
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == LT) {
						{
							setState(695);
							typeArgumentsOrDiamond();
						}
					}

					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == DOT) {
						{
							{
								setState(698);
								match(DOT);
								setState(699);
								match(IDENTIFIER);
								setState(701);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la == LT) {
									{
										setState(700);
										typeArgumentsOrDiamond();
									}
								}

							}
						}
						setState(707);
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
					setState(708);
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
		enterRule(_localctx, 106, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(711);
				match(IDENTIFIER);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LT) {
					{
						setState(712);
						nonWildcardTypeArgumentsOrDiamond();
					}
				}

				setState(715);
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
		enterRule(_localctx, 108, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(717);
				match(LBRACK);
				setState(745);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case RBRACK: {
						setState(718);
						match(RBRACK);
						setState(723);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == LBRACK) {
							{
								{
									setState(719);
									match(LBRACK);
									setState(720);
									match(RBRACK);
								}
							}
							setState(725);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(726);
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
						setState(727);
						expression(0);
						setState(728);
						match(RBRACK);
						setState(735);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 84, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(729);
										match(LBRACK);
										setState(730);
										expression(0);
										setState(731);
										match(RBRACK);
									}
								}
							}
							setState(737);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 84, _ctx);
						}
						setState(742);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(738);
										match(LBRACK);
										setState(739);
										match(RBRACK);
									}
								}
							}
							setState(744);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
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
		enterRule(_localctx, 110, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(747);
				arguments();
				setState(749);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
					case 1: {
						setState(748);
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
		enterRule(_localctx, 112, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(751);
				nonWildcardTypeArguments();
				setState(752);
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
		enterRule(_localctx, 114, RULE_typeArgumentsOrDiamond);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(754);
					match(LT);
					setState(755);
					match(GT);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(756);
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
		enterRule(_localctx, 116, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(759);
					match(LT);
					setState(760);
					match(GT);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(761);
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
		enterRule(_localctx, 118, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(764);
				match(LT);
				setState(765);
				typeList();
				setState(766);
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
		enterRule(_localctx, 120, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(768);
				typeType();
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(769);
							match(COMMA);
							setState(770);
							typeType();
						}
					}
					setState(775);
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
		enterRule(_localctx, 122, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == AT) {
					{
						setState(776);
						annotation();
					}
				}

				setState(781);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case IDENTIFIER: {
						setState(779);
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
						setState(780);
						primitiveType();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(783);
								match(LBRACK);
								setState(784);
								match(RBRACK);
							}
						}
					}
					setState(789);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
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
		enterRule(_localctx, 124, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(790);
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
		enterRule(_localctx, 126, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(792);
				match(LT);
				setState(793);
				typeArgument();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(794);
							match(COMMA);
							setState(795);
							typeArgument();
						}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(801);
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
		enterRule(_localctx, 128, RULE_superSuffix);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case LPAREN:
					enterOuterAlt(_localctx, 1);
				{
					setState(803);
					arguments();
				}
				break;
				case DOT:
					enterOuterAlt(_localctx, 2);
				{
					setState(804);
					match(DOT);
					setState(805);
					match(IDENTIFIER);
					setState(807);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 95, _ctx)) {
						case 1: {
							setState(806);
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
		enterRule(_localctx, 130, RULE_explicitGenericInvocationSuffix);
		try {
			setState(815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case SUPER:
					enterOuterAlt(_localctx, 1);
				{
					setState(811);
					match(SUPER);
					setState(812);
					superSuffix();
				}
				break;
				case IDENTIFIER:
					enterOuterAlt(_localctx, 2);
				{
					setState(813);
					match(IDENTIFIER);
					setState(814);
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
		enterRule(_localctx, 132, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(817);
				match(LPAREN);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LT - 72)) | (1L << (BANG - 72)) | (1L << (TILDE - 72)) | (1L << (INC - 72)) | (1L << (DEC - 72)) | (1L << (ADD - 72)) | (1L << (SUB - 72)) | (1L << (AT - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
						setState(818);
						expressionList();
					}
				}

				setState(821);
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
			case 49:
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
