import java.util.Scanner;

public class Ejercicio5{


	public static void main(String [] args){


		//Variables
		int numero, siguiente;


		//Definiendo el Scanner
		Scanner dato = new Scanner(System.in);

		//Solicitar el numero 
		System.out.println("Ingrese un numero para mostrar el siguiente a él: ");
		numero = dato.nextInt();

		//Calculando el numero siguiente al ingresado
		siguiente = numero + 1;

		//Mostrando en pantalla
		System.out.println("El numero siguiente a " + numero + " es " + siguiente); 





	}


}