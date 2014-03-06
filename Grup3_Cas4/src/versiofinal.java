import java.io.*;
import java.util.Scanner;

class versiofinal implements interficiefactorialpotencia{

	private static int numerodelusuari;

	public static int calculfactorial (ParametresCalculfactorial parameterObject){
		 
		if(versiofinal.numerodemanatalusuari(parameterObject.numero)==0)
		return 1;
		
		else{
			int resultat = versiofinal.numerodemanatalusuari(parameterObject.numero) * calculfactorial(new ParametresCalculfactorial(versiofinal.numerodemanatalusuari(parameterObject.numero)-1));
			return versiofinal.numerodemanatalusuari(resultat);
		}
	}

	public static int numerodemanat(int numero) {
		return numero;
	}
	
    public static void main (String[] args )throws IOException{
    	
    	System.out.print("Benvinguts al programa de Grup1!!! ");
       	System.out.print("\n----------------------------------\n\n");
        do{
        	System.out.println("\t MENU");
        	               	        	           	
        	System.out.print("Tria una opció. Factorial o Potencies:  ");
        	Scanner opt=new Scanner(System.in);
        	int opcio = opt.nextInt();
        	switch(versiofinal.numerodemanatalusuari(opcio)) {

		        case 1:
		        	Scanner escriu_numero=new Scanner(System.in);
				numerodelusuari = 0;
		    		
		    		System.out.println("\nÉs l'opció factorial");		
		    		System.out.print("\n");
		    		
		    		while(versiofinal.numerodemanatalusuari(numerodelusuari) != '*'){
		    	    System.out.print("Introduex un numero: ");
		    		
		    	    numerodelusuari = escriu_numero.nextInt();
		    			
		    	    while(versiofinal.numerodemanatalusuari(numerodelusuari) < 0){
		    	    	if(versiofinal.numerodemanatalusuari(numerodelusuari) < 0){
			   	     		System.out.println("Error");
			   	     		System.out.print("Escriu un número enter i positiu: ");
			   	     	}
			   	    	numerodelusuari = escriu_numero.nextInt();
		    	    }
		   	    	System.out.println(calculfactorial(new ParametresCalculfactorial(versiofinal.numerodemanatalusuari(numerodelusuari))));         		 
		   
		    		}
		    	break;

		        case 2:
		        	Scanner in = new Scanner(System.in);
		            int numero1=0, exponent;
		            int potencia;
		           
		            System.out.println("\nÉs l'opció potencia ");
		            System.out.print("\n");
		            
		            while(versiofinal.numerodemanatalusuari(numero1) != '*'){
			            
		            	System.out.print("Introduex un numero: ");
		            	numero1 = in.nextInt();
			           
			            System.out.print("Introduex un exponent: ");
			            exponent = in.nextInt();
			
			            potencia= (int) Math.pow(versiofinal.numerodemanatalusuari(numero1),versiofinal.numerodemanatalusuari(exponent));
			            System.out.println("Valor de potencia: " + versiofinal.numerodemanatalusuari(potencia));
			            System.out.print("\n");
		            }
		        break;
       
		        default:
		        	System.out.println("Error" );
		        break;
            
        	}
        }while(true);
    }

	public static int numerodemanatalusuari(int numero) {
		return versiofinal.numerodemanat(numero);
	}
}