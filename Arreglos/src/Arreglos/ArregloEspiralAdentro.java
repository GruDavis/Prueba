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
public class ArregloEspiralAdentro 
{
    public static void main(String[] args) 
    
    {
        int Arreglo [] =  new int [5];
        int Arreglo2[][] =  new int[10][10];
        int n=1;
    
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
