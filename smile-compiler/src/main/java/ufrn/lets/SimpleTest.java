package ufrn.lets;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import lets.ufrn.grammars.expressions.ExpLexer;
import lets.ufrn.grammars.expressions.ExpParser;


public class SimpleTest {

	public static void main(String[] args) {
        ANTLRInputStream in = new ANTLRInputStream("12*(5-6)");
        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        parser.eval();
	}

}
