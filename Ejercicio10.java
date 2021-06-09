import java.util.Scanner;

public class Ejercicio10{


	public static void main(String [] args){


		//Variables
		Double altura, base, perimetro, area;

		

		//Definiendo el Scanner
		Scanner ingresarNum = new Scanner(System.in);
		

		//salto de linea
		System.out.println("\n");

		//Solicitar altura
		System.out.println("Ingrese la altura del rectangulo: ");
		altura = ingresarNum.nextDouble();

		//salto de linea
		System.out.println("\n");

		//Solicitar base
		System.out.println("Ingrese la base del rectangulo: ");
		base = ingresarNum.nextDouble();


		//Calculando perimetro
		perimetro = 2*(base*altura);

		//Calculando el area
		area = base * altura;


		//salto de linea
		System.out.println("\n");

		//mostrar area
		System.out.println("El area del rectangulo con " + base + " unidades de base, y con " + altura + " unidades de altura es de " + area);

		//salto de linea
		System.out.println("\n");

		//mostrar perimetro
		System.out.println("El perimetro del rectangulo con "+ base + " unidades de base, y con " + altura + " unidades de altura es de " + perimetro);




	}

}