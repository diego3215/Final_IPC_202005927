package final_ipc;

import java.util.Scanner;

public class Problema1 {

    void Prom1() {
        //Se le da un valor a scanner
        Scanner lee = new Scanner(System.in);
        
        //Variables a utilizar en la clase
        int num1, num2;
        
        //Solicitud del primer numero
        System.out.println("Ingrese numero 1");
        num1 = lee.nextInt();
        
        //Solicitud del segundo numero
        System.out.println("Ingrese numero 2");
        num2 = lee.nextInt();
        
        
        //Comparacion de numeros
        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1);
        }else{
            if (num2>num1) {
                System.out.println("El numero mayor es " + num2);
            }else{
                if (num1 == num2) {
                    System.out.println("Ambos numeros son iguales");
                }
            }
        }
        
        
    }
    
}
