import java.util.Scanner;

public class Ejercicio20{


	public static void main(String [] args){


		//Variables
		int numero;
		String a,b,c,d,e;

		
		//utilizando el Scanner
		Scanner sc = new Scanner(System.in);


		//salto de linea
		System.out.println("\n");

		//pedir numero
		System.out.println("Ingresa un numero de 5 digitos ");
		numero = sc.nextInt();

		if (numero >= 9999 && numero <= 99999) {

        
           

               //Convertir a un String
                String nuevoNumero = numero + "";

                
              a = nuevoNumero.substring(0,1);
              b = nuevoNumero.substring(1,2);
              c = nuevoNumero.substring(2,3);
              d = nuevoNumero.substring(3,4);
              e = nuevoNumero.substring(4,5);  


              if (a.equals(e) && b.equals(d)) {
              	System.out.println("El numero es capicua");
              }

              else
              	System.out.println("El numero no es capicua");

     


		}

		else
			System.out.println("Ingresa un numero de 5 digitos");


	}	

}