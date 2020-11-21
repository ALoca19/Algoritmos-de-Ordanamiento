/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author anita
 */
public class Main {
     public static void main(String[] args) {
        
        int n = 10;
        int[] aux;
        
        double[] tiempoBurbuja = new double[n];
        double[] tiempoBurbujaOptimizada = new double[n];
        double[] tiempoInsertSort = new double[n];
        double[] tiempoMerge = new double[n];
        double[] tiempoRapido = new double[n];
        
      
        
        Codigos burbuja = new Codigos();
        Codigos burbujaOptimizada = new Codigos();
        Codigos insertSort = new Codigos();
        Codigos merge = new Codigos();
        Codigos rapido = new Codigos();
        
        
        for (int j = 0; j < n; j++){
          
            
            //Analisis del Peor Caso
            aux=GeneradorDatos.generarArregloFormaDesendente(j);           
            
            
            burbuja.llamaBurbuja(aux.clone());
            burbujaOptimizada.llamaBurbujaOptimizada(aux.clone());
            insertSort.llamaInsertSort(aux.clone());
            merge.llamaMergeSort(aux.clone());
            
            
                    
            if( j!=0)
            {
               rapido.llamaQuickSort(aux.clone()); 
            }
            
           
            
            
            tiempoBurbuja[j] = (int) burbuja.gettTotal();
            tiempoBurbujaOptimizada[j] = (int) burbujaOptimizada.gettTotal();
            tiempoInsertSort[j] = (int) insertSort.gettTotal();
            tiempoMerge[j] = (int) merge.gettTotal();
            tiempoRapido[j] = (int) rapido.gettTotal();
            
        }
        
 
        Grafica g1 = new Grafica("N","Tiempo","Peor Caso");
        g1.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        g1.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        g1.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        g1.agregarSerie("Tiempo Merge",tiempoMerge);
        g1.agregarSerie("Tiempo Rapido",tiempoRapido);
        g1.crearGrafica();
        g1.muestraGrafica();
        
        Grafica gB = new Grafica("N","Tiempo","Peor Caso Burbuja");
        gB.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        gB.crearGrafica();
        gB.muestraGrafica();
        
        Grafica gBO = new Grafica("N","Tiempo","Peor Caso Burbuja Optimizada");
        gBO.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        gBO.crearGrafica();
        gBO.muestraGrafica();
        
        Grafica gIS = new Grafica("N","Tiempo","Peor Caso Insert Sort");
        gIS.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        gIS.crearGrafica();
        gIS.muestraGrafica();
        
        Grafica gMS = new Grafica("N","Tiempo","Peor Caso Merse Sort");
        gMS.agregarSerie("Tiempo Merge",tiempoMerge);
        gMS.crearGrafica();
        gMS.muestraGrafica();
        
        Grafica gR = new Grafica("N","Tiempo","Peor Caso Rapido");
        gR.agregarSerie("Tiempo Rapido",tiempoRapido);
        gR.crearGrafica();
        gR.muestraGrafica();
        
        
        
        double[] tiempoBurbuja2 = new double[n];
        double[] tiempoBurbujaOptimizada2 = new double[n];
        double[] tiempoInsertSort2 = new double[n];
        double[] tiempoMerge2 = new double[n];
        double[] tiempoRapido2 = new double[n];
        
        for (int j = 0; j < n; j++){
            
            
            
            //Analisis del caso medio
            aux = GeneradorDatos.generarArregloInt(j,1000);
            
            burbuja.llamaBurbuja(aux.clone());
            burbujaOptimizada.llamaBurbujaOptimizada(aux.clone());
            insertSort.llamaInsertSort(aux.clone());
            merge.llamaMergeSort(aux.clone());
            if( j!=0)
            {
               rapido.llamaQuickSort(aux.clone()); 
            }
            
            tiempoBurbuja2[j] = (int) burbuja.gettTotal();
            tiempoBurbujaOptimizada2[j] = (int) burbujaOptimizada.gettTotal();
            tiempoInsertSort2[j] = (int) insertSort.gettTotal();
            tiempoMerge2[j] = (int) merge.gettTotal();
            tiempoRapido2[j] = (int) rapido.gettTotal();
            
        }
        
        Grafica g2 = new Grafica("N","Tiempo","Caso Medio");
        g2.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        g2.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        g2.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        g2.agregarSerie("Tiempo Merge",tiempoMerge);
        g2.agregarSerie("Tiempo Rapido",tiempoRapido);
        g2.crearGrafica();
        g2.muestraGrafica();
        
        Grafica gB2 = new Grafica("N","Tiempo","Caso Medio Burbuja");
        gB2.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        gB2.crearGrafica();
        gB2.muestraGrafica();
        
        Grafica gBO2 = new Grafica("N","Tiempo","Caso Medio Burbuja Optimizada");
        gBO2.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        gBO2.crearGrafica();
        gBO2.muestraGrafica();
       
        Grafica gMS2 = new Grafica("N","Tiempo","Caso Medio Merse Sort");
        gMS2.agregarSerie("Tiempo Merge",tiempoMerge);
        gMS2.crearGrafica();
        gMS2.muestraGrafica();
        
        Grafica gR2 = new Grafica("N","Tiempo","Caso Medio Rapido");
        gR2.agregarSerie("Tiempo Rapido",tiempoRapido);
        gR2.crearGrafica();
        gR2.muestraGrafica();
        
        Grafica gIS2 = new Grafica("N","Tiempo","Caso Medio Sort");
        gIS2.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        gIS2.crearGrafica();
        gIS2.muestraGrafica();
            
        
        double[] tiempoBurbuja3 = new double[n];
        double[] tiempoBurbujaOptimizada3 = new double[n];
        double[] tiempoInsertSort3 = new double[n];
        double[] tiempoMerge3 = new double[n];
        double[] tiempoRapido3 = new double[n];
            
        for (int j = 0; j < n; j++){
            
            //el mejor caso
            aux = GeneradorDatos.generarArregloFormaAsendente(n);
            
            burbuja.llamaBurbuja(aux.clone());
            burbujaOptimizada.llamaBurbujaOptimizada(aux.clone());
            insertSort.llamaInsertSort(aux.clone());
            merge.llamaMergeSort(aux.clone());
            if( j!=0)
            {
               rapido.llamaQuickSort(aux.clone()); 
            }
            
            tiempoBurbuja3[j] = (int) burbuja.gettTotal();
            tiempoBurbujaOptimizada3[j] = (int) burbujaOptimizada.gettTotal();
            tiempoInsertSort3[j] = (int) insertSort.gettTotal();
            tiempoMerge3[j] = (int) merge.gettTotal();
            tiempoRapido3[j] = (int) rapido.gettTotal();
            
        }
            
        
      
        
        
        Grafica g3 = new Grafica("N","Tiempo","Mejor Caso");
        g3.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        g3.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        g3.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        g3.agregarSerie("Tiempo Merge",tiempoMerge);
        g3.agregarSerie("Tiempo Rapido",tiempoRapido);
        g3.crearGrafica();
        g3.muestraGrafica();
        
        
        Grafica gB3 = new Grafica("N","Tiempo","Mejor Caso Burbuja");
        gB3.agregarSerie("Tiempo Burbuja",tiempoBurbuja);
        gB3.crearGrafica();
        gB3.muestraGrafica();
        
        Grafica gBO3 = new Grafica("N","Tiempo","Mejor Caso Burbuja Optimizada");
        gBO3.agregarSerie("Tiempo Burbuja Optimizada",tiempoBurbujaOptimizada);
        gBO3.crearGrafica();
        gBO3.muestraGrafica();
        
        Grafica gMS3 = new Grafica("N","Tiempo","Mejor Caso Merse Sort");
        gMS3.agregarSerie("Tiempo Merge",tiempoMerge);
        gMS3.crearGrafica();
        gMS3.muestraGrafica();
        
        Grafica gR3 = new Grafica("N","Tiempo","Mejor Caso Rapido");
        gR3.agregarSerie("Tiempo Rapido",tiempoRapido);
        gR3.crearGrafica();
        gR3.muestraGrafica();
        
        Grafica gIS3 = new Grafica("N","Tiempo","Mejor Caso Sort");
        gIS3.agregarSerie("Tiempo Insert Sort",tiempoInsertSort);
        gIS3.crearGrafica();
        gIS3.muestraGrafica();
            
         
    }
}
