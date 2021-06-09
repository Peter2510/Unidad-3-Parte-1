public class Ejercicio7{


	public static void main(String [] args){


		//Variables
		int numAleatorio = 0;
		double disminuyendo, numFinal;

		
		// generar numero aleatorio entre 0 y 200
		numAleatorio = (int) (Math.random() * (50 - 10 ) + 10 );	

		//salto de linea
		System.out.println("\n");

		//Mostrar numero aleatorio
		System.out.println("Numero generado aleatoriamente: " + numAleatorio);

		//calcular el 30% del numero aleatorio generado
		disminuyendo = numAleatorio * 0.15;

		//numero aumentado en 30%
		numFinal = numAleatorio - disminuyendo;


		//salto de linea
		System.out.println("\n");

		//mostrar numero aumentado en 30%
		System.out.println(numAleatorio + " disminuido en 15% es: " + numFinal);





	}

}