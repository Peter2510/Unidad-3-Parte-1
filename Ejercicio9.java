import java.util.Scanner;

public class Ejercicio9{


	public static void main(String [] args){


		//Variables
		String palabra1, palabra2, auxiliar;

		

		//Definiendo el Scanner
		Scanner dato = new Scanner(System.in);
		

		//salto de linea
		System.out.println("\n");

		//Solicitar palabra 1
		System.out.println("Ingrese una palabra: ");
		palabra1 = dato.nextLine();

		//Solicitar palabra 2
		System.out.println("Ingrese una palabra: ");
		palabra2 = dato.nextLine();


		//Intercambio de las palabras

		auxiliar = palabra1;
		palabra1 = palabra2;


		//salto de linea
		System.out.println("\n");

		//mostrar palabras
		System.out.println("La primera palabra era " + auxiliar + " ahora es " + palabra2 + " la palabra 2 era" + palabra2 + " ahora es: " + auxiliar );




	}

}