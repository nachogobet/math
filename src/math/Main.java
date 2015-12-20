package math;

import exceptions.IncorrectParamsException;
import exceptions.IncorrectParamsNumberException;

public class Main {

	public static void main(String[] args) throws Exception {
	    
	    if(args.length > 2 || args.length < 1)
	    	throw new IncorrectParamsNumberException("Invalid amount of parameters, should be one");
	    
	    //Con el par�metro "-p" indico que quiero imprimir la expresi�n inicial
	    if(args.length == 2){
	    	if(args[0].equals("-p")){
	    		System.out.println(Solver.solve(args[1]));
	    		System.out.println("La expresi�n inicial es: " + args[1]);
	    	} else{
	    		throw new IncorrectParamsException("Par�metro incorrecto: " + args[0]);
	    	}    	
	    } else{
	    	System.out.println(Solver.solve(args[0]));
	    }
	}

}
