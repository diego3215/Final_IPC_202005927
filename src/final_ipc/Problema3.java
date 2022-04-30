package final_ipc;

import java.util.Scanner;

class Problema3 {

    void Prom3() {
        //Se le da un valor a scanner
        Scanner lee = new Scanner(System.in);
        
        //Variables a utilizar en la clase
        int PesoCamion, opc;
        int[] PesoVaca, Produccion;
        
        System.out.println("Que listado de vacas desea revisar");
        System.out.println("-------Listado de 8 vacas 0-------");
        System.out.println("------Listado de 10 vacas 1-------");
        System.out.println("-------Ingresar Listado 2---------");
        opc = lee.nextInt();
        
        if (opc == 0) {
            
            PesoCamion = 1000;
            PesoVaca = new int[] {223,243,100,200,200,155,300,150};
            Produccion = new int[]{30,34,28,45,31,50,29,1};
            
            int MayorPeso = PesoVaca[0], PesoMaximo = MayorPeso;
            int SumaProduccion=0;
            
            System.out.println("Vacas usadas:");
            
            for (int i = 0; i < PesoVaca.length; i++) {
                MayorPeso = MayorPeso <= 0 ? PesoVaca[i] : MayorPeso + PesoVaca[i];
                
                
                if (MayorPeso <= PesoCamion) {
                    System.out.println("Vaca No " + (i+1));
                    SumaProduccion = SumaProduccion + Produccion[i];
                    PesoMaximo = MayorPeso;
                }
            }
            
            System.out.println("El mejor peso es " + PesoMaximo);
            System.out.println("La produccion total es de " + SumaProduccion);
            
        }
        
        if (opc == 1) {
            
            PesoCamion = 2000;
            PesoVaca = new int[] {340,355,223,243,130,240,260,155,302,130};
            Produccion = new int[]{45,50,34,39,29,40,30,52,31,1};
            
            int MayorPeso = PesoVaca[0], PesoMaximo = MayorPeso;
            int SumaProduccion=0;
            
            System.out.println("Vacas usadas:");
            
            for (int i = 0; i < PesoVaca.length; i++) {
                MayorPeso = MayorPeso <= 0 ? PesoVaca[i] : MayorPeso + PesoVaca[i];
                
                
                if (MayorPeso <= PesoCamion) {
                    System.out.println("Vaca No " + (i+1));
                    SumaProduccion = SumaProduccion + Produccion[i];
                    PesoMaximo = MayorPeso;
                }
            }
            
            System.out.println("El mejor peso es " + PesoMaximo);
            System.out.println("La produccion total es de " + SumaProduccion);
            
        }
        
        if (opc == 2){
           
            int totvac;
            
            System.out.println("Cuantas vacas desea ingresar?");
            totvac = lee.nextInt();
            
            System.out.println("Ingrese el peso maximo que soporta el camion");
            PesoCamion = lee.nextInt();
            
            PesoVaca = new int[totvac];
            Produccion = new int[totvac];
            
            int MayorPeso = PesoVaca[0], PesoMaximo = MayorPeso;
            int SumaProduccion=0;
            
            for (int p = 0; p < totvac; p++) {
                System.out.println("Vaca No " + (p+1));
                System.out.println("Ingrese Peso ");
                PesoVaca[p] = lee.nextInt();
                System.out.println("Ingrese Produccion");
                Produccion[p] = lee.nextInt();
                
            }
        
            System.out.println("Vacas usadas:");
            
            for (int i = 0; i < PesoVaca.length; i++) {
                MayorPeso = MayorPeso <= 0 ? PesoVaca[i] : MayorPeso + PesoVaca[i];
                
                if (MayorPeso <= PesoCamion) {
                    System.out.println("Vaca No " + (i+1));
                    SumaProduccion = SumaProduccion + Produccion[i];
                    PesoMaximo = MayorPeso;
                }
                
            }
            
            System.out.println("El mejor peso es " + PesoMaximo);
            System.out.println("La produccion total es de " + SumaProduccion);
            
        }
        
    }
    
}
