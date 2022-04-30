package final_ipc;

import java.util.Scanner;

class Problema2 {

    void Prom2() {
        
        //Se le da un valor a scanner
        Scanner lee = new Scanner(System.in);
        
        //Variables a utilizar en la clase
        int num;
        
        System.out.println("Ingrese un numero impar");
        num = lee.nextInt();
        
        //Validacion de numero impar
        if (num %2 != 0) {
        
            System.out.println();
            for(int i = 1; i<=num; i++){
                //Espacios en blanco
                for(int j = 1; j<=num-i; j++){
                    System.out.print(" ");
                }

                //Asteriscos
                for(int k=1; k<=(i*2)-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }else{
            
            System.out.println("El numero es par, saliendo al menu principal");
            
        }
        
    }
    
}
