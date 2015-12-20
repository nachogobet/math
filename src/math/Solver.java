package math;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import exceptions.SyntacticalException;

public class Solver {
	public static String solve(String expression) throws Exception{
		
		//Lanzo analizador léxico
	    Automata.runLexicalAnalyser(expression);
		
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	    try {
			return engine.eval(expression).toString();
		} catch (ScriptException e) {
			e.printStackTrace();
			throw new SyntacticalException("Invalid syntax for expression: " + expression);			
		}
	}
}
