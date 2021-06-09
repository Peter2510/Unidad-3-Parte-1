import java.util.Scanner;

public class Ejercicio15{
	
	public static void main(String[] args){


	//Variale global
	int numero1;

	//definiendo el scanner para ingreso de datos desde teclado
	Scanner numeros = new Scanner(System.in);


	//salto de linea
	System.out.println("\n");

	//solicitando el numero
	System.out.println("Ingresa el numero a evaluar:  ");
	numero1 = numeros.nextInt();

	//salto de linea
	System.out.println("\n");


	//Si se cumplen las dos condiciones se ejecuta este bloque de instrucciones
	
	if (numero1 == 0) {
			
			System.out.println("El numero ingresado es nulo");
	}

	else

		if (numero1 > 0) {
			System.out.println("El numero ingresado es positivo");
		}

		else
			System.out.println("El numero ingresado es negativo");

	}


}