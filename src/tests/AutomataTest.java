package tests;

import org.junit.Test;

import exceptions.LexicalException;
import math.Automata;

public class AutomataTest {

	@Test(expected = LexicalException.class)  
	public void testAutomataWrongChar() throws LexicalException {
		Automata.runLexicalAnalyser("4+5*?(3+2.5)");
	}

	@Test(expected = LexicalException.class)  
	public void testAutomataBadNumber() throws LexicalException {
		Automata.runLexicalAnalyser("4.5.6");
	}
	
	@Test
	public void testAutomataCorrectExpression() throws LexicalException{
		Automata.runLexicalAnalyser("4+5-2*(4+(3*8.01))");
	}
}
