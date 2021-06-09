
import java.util.Scanner;


public class Ejercicio16 {

  public static void main(String[] args) {
  
     // variables
     int num1, num2, num3;
     
     
     // Definiendo el scanner 
     Scanner datos = new Scanner(System.in);
     

     // solicitar primer número
     System.out.println("\nIngresa el primer número");
     num1 = datos.nextInt();
     

     // solicitar segundo número
     System.out.println("\nIngresa el primer número");
     num2 = datos.nextInt();


     // solicitar tercer número
     System.out.println("\nIngresa el primer número");
     num3 = datos.nextInt();
     
     
     // si el número 1 es mayor al número 2
     if (num1 > num2){
     
     
          // si el número 1 es mayor al numero 3
            if(num1 > num3){
         
         
                      System.out.println("\nEl mayor número ingresado es: "+ num1);
             }
       
                 else
         
                       System.out.println("\nEl mayor numero ingresado es " + num3);
        
     }
     
     
     else

     //si el número 2 es mayor al 3

           if(num2>num3){
        
        
              System.out.println("\nEl mayor número ingresado es "+ num2);
        
            }
      
        else

        System.out.println("\nEl mayor numero ingresado es:" + num3);
      
   
  }
}
