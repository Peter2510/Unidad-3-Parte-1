import java.util.*;

public class Ejercicio2{


	public static void main(String [] args){


		// Definiendo variables

		String pais, capital;

		// Definiendo el scanner 

		Scanner entradaDatos = new Scanner(System.in);
		

		// Solicitar la capital al usuario

		System.out.println("Ingresa la capital: ");
		capital = entradaDatos.nextLine();


		// Solicitar el pais al usuario

		System.out.println("Ingresa el pais: ");
		pais = entradaDatos.nextLine();

		// Mostrar la capital del pais en pantalla

		System.out.println(capital + " es la capital de " + pais);


	}
}