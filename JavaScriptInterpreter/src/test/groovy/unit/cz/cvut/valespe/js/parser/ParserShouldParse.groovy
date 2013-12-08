package cz.cvut.valespe.js.parser

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.Ignore
import org.junit.Test

class ParserShouldParse {

    @Test
    public void "file with expression 12"() {
        assert "(file (expression 12))" == parseCode("12")
    }

    @Test
    public void "file with expression 1 + 2"() {
        assert "(file (expression (expression 1) + (expression 2)))" == parseCode("1 + 2")
    }

    @Test
    public void "file with expression 1 - 2"() {
        assert "(file (expression (expression 1) - (expression 2)))" == parseCode("1 - 2")
    }

    @Test
    public void "file with expression 1 * 2"() {
        assert "(file (expression (expression 1) * (expression 2)))" == parseCode("1 * 2")
    }

    @Test
    public void "file with expression 1 / 2"() {
        assert "(file (expression (expression 1) / (expression 2)))" == parseCode("1 / 2")
    }

    @Test
    public void "file with expression 1 % 2"() {
        assert "(file (expression (expression 1) % (expression 2)))" == parseCode("1 % 2")
    }

    @Test
    public void "file with expression (2 + (1 - (1 * (4 / 2))))"() {
        assert "(file (expression ( (expression (expression 2) + (expression ( (expression (expression 1) - (expression ( (expression (expression 1) * (expression ( (expression (expression 4) / (expression 2)) ))) ))) ))) )))" == parseCode("(2 + (1 - (1 * (4 / 2))))")
    }

    @Test
    public void "file with expression a"() {
        assert "(file (expression a))" == parseCode("a")
    }

    @Test
    public void "file with expression aZ0_"() {
        assert "(file (expression aZ0_))" == parseCode("aZ0_")
    }

    @Test
    public void "file with assginment expression a = 1 + 2"() {
        assert "(file (expression (assignmentExpression a = (expression (expression 1) + (expression 2)))))" == parseCode("a = 1 + 2")
    }

    @Test
    public void "file with function declaration function a() { }"() {
        assert "(file (functionDeclaration function (functionName a) ( ) (functionBody { })))" == parseCode("function a() { }")
    }

    @Test
    public void "file with function declaration function a(in) { }"() {
        assert "(file (functionDeclaration function (functionName a) ( (functionParameters (functionParameter in)) ) (functionBody { })))" == parseCode("function a(in) { }")
    }

    @Test
    public void "file with function declaration function a(in) { 1 + 2 }"() {
        assert "(file (functionDeclaration function (functionName a) ( (functionParameters (functionParameter in)) ) (functionBody { (expression (expression 1) + (expression 2)) })))" == parseCode("function a(in) { 1 + 2 }")
    }

    @Test
    public void "file with anonymous function function() { }"() {
        assert "(file (expression (anonymousFunction function ( ) (functionBody { }))))" == parseCode("function() { }")
    }

    @Test
    public void "file with anonymous function function(in) { }"() {
        assert "(file (expression (anonymousFunction function ( (functionParameters (functionParameter in)) ) (functionBody { }))))" == parseCode("function(in) { }")
    }

    @Test
    public void "file with anonymous function function() { 1 + 2 }"() {
        assert "(file (expression (anonymousFunction function ( ) (functionBody { (expression (expression 1) + (expression 2)) }))))" == parseCode("function() { 1 + 2 }")
    }

    @Test
    public void "file with var declaration var a"() {
        assert "(file (varDeclaration var a))" == parseCode("var a")
    }

    @Test
    @Ignore // Don't how handle variable declaration and assignment
    public void "file with var declaration var a = 1"() {
        assert "(file (varDeclaration var a (assignmentOperator  = ) (expression 1)))" == parseCode("var a = 1")
    }

    def private parseCode(String codeToParse) {
        CharStream charStream = new ANTLRInputStream(codeToParse)
        JavaScriptLexer lex = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill()
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true)
        JavaScriptParser.FileContext file = parser.file()
        return file.toStringTree(parser)
    }

}
