import java.util.*;

public class Ejercicio1{


	public static void main(String [] args){



		int num1, num2, resultado;
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Ingresa el primer numero a sumar: ");
		num1 = scanner.nextInt();

		System.out.println("Ingresa el segundo numero a sumar: ");
		num2 = scanner.nextInt();

		resultado = num1 + num2;

		System.out.println("El resultado de sumar " + num1 + " + " + num2+ " es: "+ resultado);


	}
}