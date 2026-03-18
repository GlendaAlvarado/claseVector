package ec.edu.espoch.clasevector;

import java.util.Scanner;

public class ClaseVector {

    public static void main(String[] args) {
        //declarar
        //hola mundo
       /*int[] notas=new int [4];
       //instanciar  
       notas[3]=10;
       notas[2]=5;
       notas[1]=6;
       notas[0]=7;
       //acceder al valor del vector
      // System.out.println("valor: "+notas[2]);
       /* for (int i = 0; i < notas.length; i++) {
            System.out.println("valor: "+notas[i]);
        }
      
      Scanner entrada = new  Scanner (System.in);
      for (int i = 0; i < notas.length; i++) {
         notas[i]= entrada.nextInt();   
        }
      for (int i = 0; i < notas.length; i++) {
            System.out.println("valor: "+i+":"+notas[i]);
        }*/
       int[] ventas=new int [7];
       int valorTotal=0;
       int valorMaximo=0;
       int ventasSuperiorP=0;
       double promedio=0;
       Scanner entrada = new Scanner(System.in);
       //solicitar al usuario las ventas
        System.out.println("Ingrese los valores de las ventas");
        for (int i = 0; i < ventas.length; i++) {
            ventas[i]= entrada.nextInt();
            valorTotal=valorTotal+ventas[i];
            
        }
        //muestra todas las ventas ingresadas
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta "+i+":"+ventas[i]);
        }
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i]>valorMaximo) {
                valorMaximo=ventas[i];
            }
            if (ventas[i]>promedio) {
                ventasSuperiorP++;
            }
        }
        System.out.println("Valor total: "+valorTotal);
        System.out.println("Promedio ventas: "+valorTotal/ventas.length);
        System.out.println("Valor maximo: "+valorMaximo);
        System.out.println("N. dias superior  Promedio: "+ventasSuperiorP);
        
      
    }
}
