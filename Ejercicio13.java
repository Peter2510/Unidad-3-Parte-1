import java.util.Scanner;

public class Ejercicio13{
	
	public static void main(String[] args){


	//Variables
	Double radio, altura, volumen;
	Double constantePI = 3.1416;

	//definiendo el scanner para ingreso de datos desde teclado
	Scanner datos = new Scanner(System.in);


	//salto de linea
	System.out.println("\n");

	//solicitando el radio
	System.out.println("Ingresa el radio del cilindro: ");
	radio = datos.nextDouble();

	//salto de linea
	System.out.println("\n");

	//solicitando la altura
	System.out.println("Ingresa la altura del cilindro: ");
	altura= datos.nextDouble();



	//Si se cumplen las dos condiciones se ejecuta este bloque de instrucciones
	if (radio > 0 && altura > 0) {

	
			volumen = constantePI * (radio*radio) * altura;

			System.out.println("\nEl volumen del cilindro con radio de " + radio + " unidades y con altura de " + altura + " unidades es de " + volumen + " unidades cubicas");

		
	}

	else
		System.out.println("\nIngrese los dos valores positivos para continuar");

	







	}


}