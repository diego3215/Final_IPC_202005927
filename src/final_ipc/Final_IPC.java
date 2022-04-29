package final_ipc;

import java.util.Scanner;

public class Final_IPC {

    public static void main(String[] args) {
        
        //Se le da un valor a scanner
        Scanner lee = new Scanner(System.in);
        
        //Variables a utilizar en la clase
        int Opc;
        boolean salir = false;
        
        //Función del menu
        while(!salir){
        
            //Impresión del menu
            System.out.println("----------------------------");
            System.out.println("-------MENU PRINCIPAL-------");
            System.out.println("--------1. Problema1--------");
            System.out.println("--------2. Problema2--------");
            System.out.println("--------3. Problema3--------");
            System.out.println("----------4. Salir----------");
            System.out.println("----------------------------");
        
            //Leer la opcion a escoger
            Opc = lee.nextInt();
            
            switch(Opc){
                case 1:
                    Problema1 prom1 = new Problema1();
                    prom1.Prom1();
                    break;
                case 2:
                    Problema2 prom2 = new Problema2();
                    prom2.Prom2();   
                    break;
                case 3:
                    Problema3 prom3 = new Problema3();
                    prom3.Prom3();  
                    break;
                case 4:
                    System.out.println("------Gracias por jugar-----");
                    salir=true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor seleccione una opcion entre 1 y 3");
                    
            }
        }
    }
}