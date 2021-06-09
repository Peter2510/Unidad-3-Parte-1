import java.util.Scanner;


public class EjercicioP {

  public static void main(String[] args) {
  
     // variables
     int digito = 0;
     int sumaTotal = 0;
     
     
     
     // Definiendo el scanner para ingreso de lados desde el teclado
     Scanner dato = new Scanner(System.in);
     
     
     // solicitar primer número
     System.out.println("\nIngresa un digito");
     digito = dato.nextInt();


     //Si es un numero menor o igual a 4 digitos hace lo siguiente
     if (digito <= 9999) {

        
            //Si es un numero menor a 10 
            if (digito <10) {


                //Convertir a un String
                String stringDigito = digito + "";

                System.out.println("d1: 0");
                System.out.println("d2: 0");
                System.out.println("d3: 0");
                //DAto convertido a String, va desde la posicion cero hasta la 1
                System.out.println("d4: " + stringDigito.substring(0,1));  

            }
            //Si es un numero mayor o igual a 10  pero menor a 100
            if (digito >=10 && digito <100) {

                String stringDigito = digito + "";

                System.out.println("d1: 0");
                System.out.println("d2: 0");
                //Dato convertido a String, va desde la posicion cero hasta la 1
                System.out.println("d3: " + stringDigito.substring(0,1));
                //Dato convertido a String, va desde la posicion 1 hasta la 2
                System.out.println("d4: " + stringDigito.substring(1,2));                
            }

              //Si es un numero mayor o igual a 100  pero menor a 1000
            if (digito >=100 && digito<1000) {

                String stringDigito = digito + "";

                System.out.println("d1: 0");
                //Dato convertido a String, va desde la posicion 0 hasta la 1
                System.out.println("d2: "+ stringDigito.substring(0,1));
                //Dato convertido a String, va desde la posicion 1 hasta la 2
                System.out.println("d3: " + stringDigito.substring(1,2));
                //Dato convertido a String, va desde la posicion 2 hasta la 3
                System.out.println("d4: " + stringDigito.substring(2,3));                
            }


              //Si es un numero mayor o igual a 1000  pero menor a 10000
            if (digito >=1000 && digito<10000) {

                String stringDigito = digito + "";

                //Dato convertido a String, va desde la posicion 0 hasta la 1
                System.out.println("d1: " +stringDigito.substring(0,1));
                //Dato convertido a String, va desde la posicion 1 hasta la 2
                System.out.println("d2: "+ stringDigito.substring(1,2));
                //Dato convertido a String, va desde la posicion 2 hasta la 3
                System.out.println("d3: " + stringDigito.substring(2,3));
                //Dato convertido a String, va desde la posicion 3 hasta la 4
                System.out.println("d4: " + stringDigito.substring(3,4));                
            }

            //variable para guardar el numero inicial

        int tmp = digito;

        // Suma de los numeros
        
        while(digito != 0){


            //Se queda el numero que queda como residuo
            sumaTotal = sumaTotal + (digito % 10);

            //Se queda el numero que es exacto
            digito = digito/ 10;

        }

        System.out.println("la suma de " + tmp +" es "+ sumaTotal);
            
        }

        else

    // Si es un numero mayor a 4 digitos
    System.out.println("Ingresa un numero menor a 5 digitos");

     
  }
}
