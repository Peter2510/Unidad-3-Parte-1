import java.util.Scanner;


public class Ejercicio3{

	public static void main(String [] args){


		int numero, dobleNumero, tripleNumero;

		// Definir el scanner
		Scanner ingresoNumero = new Scanner(System.in);

		
		//Solicitar el numero
		System.out.println("Ingresa un numero para calcular el doble y el triple: ");
		numero = ingresoNumero.nextInt();


		// doble del numero ingresado	
		dobleNumero = numero * 2;

		//triple del numero ingresado
		tripleNumero = numero * 3;


		// Mostrar el doble y el triple del numero

		System.out.println("El doble de " + numero + " es: "+ dobleNumero + " y el triple es: " + tripleNumero);








	}

}