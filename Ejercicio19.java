public class Ejercicio19{


	public static void main(String [] args){


		//Variables
		int numAleatorio = 0;
		int multiplo;
		

		
		// generar numero aleatorio entre 1 y 1000
		numAleatorio = (int) (Math.random() * (1000- 1 ) + 1 );	

		//Calculando el modulo
		multiplo = numAleatorio % 5;

		//salto de linea
		System.out.println("\n");

		//Mostrar numero aleatorio
		System.out.println("Numero generado aleatoriamente: " + numAleatorio);

		//Si se cumple que sea multiplo de 5 y esta dentro de los primeros 25 numeros
		if (multiplo ==0 && numAleatorio < 25) {

		System.out.println("Correcto");
			
		}

		else
			System.out.println("Incorrecto");







	}

}