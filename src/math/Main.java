package math;

import exceptions.IncorrectParamsException;
import exceptions.IncorrectParamsNumberException;

public class Main {

	public static void main(String[] args) throws Exception {
	    
	    if(args.length > 2 || args.length < 1)
	    	throw new IncorrectParamsNumberException("Invalid amount of parameters, should be one");
	    
	    //Con el parámetro "-p" indico que quiero imprimir la expresión inicial
	    if(args.length == 2){
	    	if(args[0].equals("-p")){
	    		System.out.println(Solver.solve(args[1]));
	    		System.out.println("La expresión inicial es: " + args[1]);
	    	} else{
	    		throw new IncorrectParamsException("Parámetro incorrecto: " + args[0]);
	    	}    	
	    } else{
	    	System.out.println(Solver.solve(args[0]));
	    }
	}

}
