import java.util.Scanner;

public class Ejercicio8{


	public static void main(String [] args){


		//Variables
		int num1, num2, num3, promedio;

		//Definiendo el Scanner
		Scanner dato = new Scanner(System.in);
		

		//salto de linea
		System.out.println("\n");

		//Solicitar numero 1
		System.out.println("Ingrese un numero: ");
		num1 = dato.nextInt();

		//Solicitar numero 2
		System.out.println("Ingrese un numero: ");
		num2 = dato.nextInt();

		//Solicitar numero 3
		System.out.println("Ingrese un numero: ");
		num3 = dato.nextInt();

		//Promedio de los numeros ingresados

		promedio = (num1+num2+num3)/3;


		//salto de linea
		System.out.println("\n");

		//mostrar numero aumentado en 30%
		System.out.println("El promedio de " + num1 + ", " + num2 + "," + " y " + num3 + " es: " + promedio );





	}

}