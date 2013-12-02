package org.antlr.v4.runtime

import org.junit.Test

class AntlrTest {


     @Test
     public void testAnltrHello() {
         CharStream charStream = new ANTLRInputStream("hello parrt")
         HelloLexer lex = new HelloLexer(charStream);
         CommonTokenStream tokens = new CommonTokenStream(lex);
         tokens.fill()
         HelloParser parser = new HelloParser(tokens);
         parser.setBuildParseTree(true)
         HelloParser.RContext file = parser.r()

         assert "(r hello parrt)" == file.toStringTree(parser)
     }
}
