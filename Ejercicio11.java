import java.util.Scanner;

public class Ejercicio11{


	public static void main(String [] args){


		//Variables
		Double centimetros,yardas, metros, pies, pulgadas;
		

		//Definiendo el Scanner
		Scanner ingresarNum = new Scanner(System.in);
		

		//salto de linea
		System.out.println("\n");

		//Solicitar centimetros
		System.out.println("Ingrese el valor en centimetros a convertir a yardas, metros, pies y pulgadas: ");
		centimetros = ingresarNum.nextDouble();


		//convertir a yardas
		yardas = centimetros/97.44;


		//convertir a metros
		metros = centimetros/100;


		//convertir a pies
		pies = centimetros/30.48;


		//convertir a pulgadas
		pulgadas = centimetros/2.54;


		//salto de linea
		System.out.println("\n");

		//mostrar conversiones
		System.out.println("Los "+ centimetros+ " cm ingresados corresponde a " + yardas + " yardas, a " + metros + " metros, a "+ pies + " pies y a " + pulgadas+ " pulgadas");

		



	}

}