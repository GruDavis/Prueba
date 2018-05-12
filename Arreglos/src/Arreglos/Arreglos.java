/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author Alumno
 */
public class Arreglos {
    
    public static void main(String[] args) 
    
    {
        int Arreglo [] =  new int [5];
        int Arreglo2[][] =  new int[10][10];
        int n=1;
        
//        for (int i=0; i<=4; i++) 
//        {
//          Arreglo [i]= i+1;
         
         //System.out.println("VAlOR "+Arreglo[i]); //Imprime del 1 al 5
         
         //if (i%2!=0) //imprime los valores de las posiciones iimpares del arreglo  
             //System.out.println("VAlOR "+Arreglo[i]);
         
         
//          if (Arreglo[i]%2!=0) // Imprime los cvalores impares del arreglo
//             System.out.println("VAlOR "+Arreglo[i]);
         
//        }
        
       
           for (int i=0; i<10; i++)
           {
               for (int j=0; j<10; j++)
               {
                   
                   Arreglo2[i][j]=n;
                   n++;             
               }
           }
           
           
           for (int i=0; i<10; i++)
           {
               for (int j=0; j<10; j++)
               {
               System.out.print("\t" + Arreglo2[i][j]);
                         
               }
                
               System.out.print("\n");
            }
    
    
    }
   
}
     
     
     
    
    
