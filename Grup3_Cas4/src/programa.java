import java.io.*;
import java.util.Scanner;

class programa {

	public static int factorial (int numero){
		 
		if(numero==0)
		return 1;
		
		else{
			int resultat = numero * factorial(numero-1);
			return resultat;
		}
	}
	
    public static void main (String[] args )throws IOException{
    	
    	System.out.print("Benvinguts al programa de Grup1!!! ");
       	System.out.print("\n----------------------------------\n\n");
        
       	System.out.print("Tria una opció. 1- Factorial o 2- Potencies:  ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int opcio = Integer.parseInt(str);

        if (opcio == 1){
        	Scanner escriu_numero=new Scanner(System.in);
    		int numero;
    		
    		System.out.println("\nÉs l'opció factorial");		
    		System.out.print("\n");
    		
    	    System.out.print("Escriu un número enter i positiu: ");
    	    
    	    numero = escriu_numero.nextInt();
    	   
    	    while(numero < 0){
    	    	if(numero < 0){
	   	     		System.out.println("Error");
	   	     	}
	   	    	numero = escriu_numero.nextInt();
    	    }
   	    	System.out.println(factorial(numero));         		 
   
        }
        
        else if (opcio == 2){
        	Scanner in = new Scanner(System.in);
            int numero, exponent;
            int potencia;
            
            System.out.println("\nÉs l'opció potencia ");
        	System.out.print("\n");

            System.out.print("Introduex un numero: ");
            numero = in.nextInt();
            
            System.out.print("Introduex un exponent: ");
            exponent = in.nextInt();

            potencia=(int) Math.pow(numero,exponent);
            System.out.println("Valor de potencia: " + potencia);
        }
    }
}
