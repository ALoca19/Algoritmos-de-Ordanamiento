/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.Random;

/**
 *
 * @author working
 */
public class GeneradorDatos {
    
   
     
    
    
    //genera arreglo aleatorio
    public static int[] generarArregloInt(int n, int bound){
        int[] arreglo = new int[n];
        Random ran = new Random();
     
        for(int y=0; y < n; y++){
            arreglo[y] = ran.nextInt(bound);
        }
        
       return arreglo;
    }
    
    //5009,5008,5007,....
    public static int[] generarArregloFormaDesendente(int n){
        int[] arreglo = new int[n];
        int num = 5010;
        for(int y=0; y < n; y++){
            
            num-=1;
            arreglo[y] = num;
        }       
       return arreglo;
    }
    
    //1,2,3,4,5,......
    public static int[] generarArregloFormaAsendente(int n){
        int[] arreglo = new int[n];
        int num = 0;
        for(int y=0; y < n; y++){
            
            num+=1;
            arreglo[y] = num;
        }       
       return arreglo;
    }
}
