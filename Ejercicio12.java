import java.util.Scanner;

public class Ejercicio12{
	
	public static void main(String[] args){


	//Variables
	Double fahrenheit, celsius;

	//definiendo el scanner para ingreso de datos desde teclado
	Scanner ingresoDatos = new Scanner(System.in);


	//salto de linea
	System.out.println("\n");

	//solicitando los grados celsius
	System.out.println("Ingresa los grados Celsius a convertir a Fahrenheit: ");
	celsius = ingresoDatos.nextDouble();

	//Convirtiendo a fahrenheit
	fahrenheit = (celsius * 9/5) + 32;

	//salto de linea
	System.out.println("\n");

	//Mostrando la conversion realizada
	System.out.println( "Los " + celsius  + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");





	}


}