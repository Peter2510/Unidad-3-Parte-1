import java.util.Scanner;


public class Ejercicio17 {

  public static void main(String[] args) {
  
     // variables
     int lado1, lado2, lado3;
     
     
     // Definiendo el scanner para ingreso de lados desde el teclado
     Scanner datos = new Scanner(System.in);
     
     
     // solicitar primer número
     System.out.println("\nIngresa el lado 1 del triángulo");
     lado1 = datos.nextInt();
     
     // solicitar segundo número
     System.out.println("\nIngresa el lado 2 del triángulo");
     lado2 = datos.nextInt();


     // solicitar tercer número
     System.out.println("\nIngresa el lado 3 del triángulo");
     lado3 = datos.nextInt();
     
     
     // si los lados son iguales

     if(lado1 == lado2 && lado2 == lado3){
       
        System.out.println("\nEl triángulo ingresado es equilatero");
      
       
     }
     
     else

            //Si dos de los lados son iguales
            if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ){
       
       
                     System.out.println("\nEl triángulo es isósceles");
            }
     
            else 
                    //Si ningun lado es igual
                    System.out.println("\nEl triángulo es escaleno");
   
  }
}
