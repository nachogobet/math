package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.Solver;

public class SolverTest {

	@Test
	public void testRightPositiveResult() throws Exception {
		String result = Solver.solve("4+3*(5-2.5)");
		assertEquals("11.5", result);
	}

	@Test
	public void testRightNegativeResult() throws Exception {
		String result = Solver.solve("4+3*(-5-2.5)");
		assertEquals("-18.5", result);
	}
	
	@Test
	public void testRightDecimalResult() throws Exception{
		String result = Solver.solve("0.15-0.12");
		assertEquals("0.03", result);
	}
}
