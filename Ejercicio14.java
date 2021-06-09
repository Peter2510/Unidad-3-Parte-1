import java.util.Scanner;

public class Ejercicio14{
	
	public static void main(String[] args){


	//Variables
	int numero1, numero2, divisible;

	//definiendo el scanner para ingreso de datos desde teclado
	Scanner datos = new Scanner(System.in);


	//salto de linea
	System.out.println("\n");

	//solicitando el primer numero
	System.out.println("Ingresa el primer numero: ");
	numero1 = datos.nextInt();

	//salto de linea
	System.out.println("\n");

	//solicitando nuemero 2
	System.out.println("Ingresa el segnundo numero: ");
	numero2 = datos.nextInt();

	divisible = numero2 % numero1;


	//Si se cumplen las dos condiciones se ejecuta este bloque de instrucciones
	if ( divisible == 0) {

	

			System.out.println("\nEs divisible");

		
	}

	else
		System.out.println("\nNo es divisible");

	







	}


}