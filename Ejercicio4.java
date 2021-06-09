import java.util.Scanner;

public class Ejercicio4{

	public static void main(String [] args){


		//Definiendo las variables

		int numero, cuadrado, cubo;

		//Definiendo el scanner 
		Scanner ingresoNumero = new Scanner(System.in);


		//salto de linea
		System.out.println("\n\n");


		//Solicitando el numero
		System.out.println("Ingrese el numero a calcular el cuadrado y el cubo: ");
		numero = ingresoNumero.nextInt();


		//Calculando el cuadrado
		cuadrado = numero*numero;

		//Calculando el cubo
		cubo = numero*numero*numero;


		//Mostrando en pantalla el cuadrado y el cubo calculado
		System.out.println("El cuadrado de: " + numero + " es: " + cuadrado + " y el cubo es: " + cubo);




	}


}