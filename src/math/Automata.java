package math;

import exceptions.LexicalException;

public class Automata {
	private static final int INI_NUM = 1;
	private static final int CONT_NUM = 1;
	private static final int OP_ADD = 4;
	private static final int OP_SUB = 5;
	private static final int OP_MUL = 6;
	private static final int OP_DIV = 7;
	private static final int INI_PAR_OPEN = 8;
	private static final int CONT_PAR_OPEN = 8;
	private static final int INI_PAR_CLOSE = 9;
	private static final int CONT_PAR_CLOSE = 9;
	private static final int POINT = 2;
	private static final int INI_DEC = 3;
	private static final int CONT_DEC = 3;
	private static final int FIN_NUM = 10;
	private static final int INVALID = 11;
	private static final int FIN_ADD = 10;
	private static final int FIN_SUB = 10;
	private static final int FIN_MUL = 10;
	private static final int FIN_DIV = 10;
	private static final int FIN_PAR_OPEN = 10;
	private static final int FIN_PAR_CLOSE = 10;
	private static final int END = 10;
	
	private static int matrix[][] = {{INI_NUM, OP_ADD, OP_SUB, OP_MUL, OP_DIV, INI_PAR_OPEN, INI_PAR_CLOSE, INVALID}, 
			{CONT_NUM, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, POINT}, {INI_DEC, INVALID, INVALID, INVALID, INVALID, INVALID, INVALID, INVALID}, 
			{CONT_DEC, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, FIN_NUM, INVALID}, {FIN_ADD, FIN_ADD, FIN_ADD, FIN_ADD, FIN_ADD, FIN_ADD, FIN_ADD, FIN_ADD},
			{FIN_SUB, FIN_SUB, FIN_SUB, FIN_SUB, FIN_SUB, FIN_SUB, FIN_SUB, FIN_SUB}, {FIN_MUL, FIN_MUL, FIN_MUL, FIN_MUL, FIN_MUL, FIN_MUL, FIN_MUL, FIN_MUL},
			{FIN_DIV, FIN_DIV, FIN_DIV, FIN_DIV, FIN_DIV, FIN_DIV, FIN_DIV, FIN_DIV}, {FIN_PAR_OPEN, FIN_PAR_OPEN, FIN_PAR_OPEN, FIN_PAR_OPEN, FIN_PAR_OPEN, CONT_PAR_OPEN, FIN_PAR_OPEN, FIN_PAR_OPEN},
			{FIN_PAR_CLOSE, FIN_PAR_CLOSE, FIN_PAR_CLOSE, FIN_PAR_CLOSE, FIN_PAR_CLOSE, FIN_PAR_CLOSE, CONT_PAR_CLOSE, FIN_PAR_CLOSE},
			{END, END, END, END, END, END, END, END}};
	
	public static void runLexicalAnalyser(String expression) throws LexicalException{
		int state =0;
		for(int i=0; i<expression.length(); i++){
			int column = getColumn(expression.charAt(i));
			state = matrix[state][column];
			if(state == INVALID)
				throw new LexicalException("Error parsing expression " + expression + " at position: " + i);
			if(state == END){
				state = 0;
				i--;
			}
		}
	}
	
	private static int getColumn(char c) throws LexicalException{
		switch(c){
			case '0': return 0;
			case '1': return 0;
			case '2': return 0;
			case '3': return 0;
			case '4': return 0;
			case '5': return 0;
			case '6': return 0;
			case '7': return 0;
			case '8': return 0;
			case '9': return 0;
			case '+': return 1;
			case '-': return 2;
			case '*': return 3;
			case '/': return 4;
			case '(': return 5;
			case ')': return 6;
			case '.': return 7;
		}
		throw new LexicalException("Invalid character in expression: " + c);		
	}
}
