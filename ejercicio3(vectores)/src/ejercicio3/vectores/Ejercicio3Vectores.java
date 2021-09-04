
package ejercicio3.vectores;

import java.util.Scanner;
public class Ejercicio3Vectores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,i;
        double venta=0;
    do{
        System.out.println("Ingrese numero de ventas");
        n=entrada.nextInt();
    }while(n<=0);
    double[] vector = new double[n];
    String[] categoria = new String[n];
        for (i=0;i<n;i++)
        {
            System.out.println("Categoria Vendedor [A - B]");
            categoria[i]=entrada.next();
            System.out.println("Ingrese valor Venta: ");
            venta=entrada.nextDouble();
            vector[i]=(venta*0.09)+200;
            
            if(categoria[i]=="A")
            {
             if((venta>=3000)&&(venta<5000))
            {
                vector[i]=vector[i]+(venta*0.03);
            }
             if((venta>=5000)&&(venta<7000))
            {
                vector[i]=vector[i]+(venta*0.07);
            }
             if(venta>=7000)
            {
                vector[i]=vector[i]+(venta*0.1);
            } 
            }
            if (categoria[i]=="B")
            {
             if (venta>5000)
             {
                  vector[i]=vector[i]+(venta*0.07);
             }  
             if ((venta>=10000)&&(venta<15000))
             {
               vector[i] = vector[i]+(venta*0.1);  
             }
             if(venta>15000)
             {
              vector[i] = vector[i]+(venta*0.13);   
             }
            }
        }
            
   }  
}
         