public class Ejercicio6{


	public static void main(String [] args){


		//Variables
		int numAleatorio = 0;
		double aumentando, numFinal;

		
		// generar numero aleatorio entre 0 y 200
		numAleatorio = (int) (Math.random() * 200);	

		//salto de linea
		System.out.println("\n");

		//Mostrar numero aleatorio
		System.out.println("Numero generado aleatoriamente: " + numAleatorio);

		//calcular el 30% del numero aleatorio generado
		aumentando = numAleatorio * 0.30;

		//numero aumentado en 30%
		numFinal = numAleatorio + aumentando;


		//salto de linea
		System.out.println("\n");

		//mostrar numero aumentado en 30%
		System.out.println(numAleatorio + " aumentado en 30% es: " + numFinal);





	}

}