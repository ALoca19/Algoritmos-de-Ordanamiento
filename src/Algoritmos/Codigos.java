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
public class Codigos {
    
    public long tInicio;
    public long tFinal;
    public long tTotal;

    //Contructor
    public Codigos() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
   
    //GETTERS AND SETTERS
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    
    //CALCULAR EL TIEMPO
    
    public void llamaBurbuja(int[] datos){
        this.tInicio = System.currentTimeMillis();
        burbuja(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void llamaBurbujaOptimizada(int[] datos){
        this.tInicio = System.currentTimeMillis();
        burbujaOptimizada(datos);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void llamaInsertSort(int[] datos){
        this.tInicio = System.currentTimeMillis();
        insertSort(datos, 0);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void llamaMergeSort(int[] datos){
        this.tInicio = System.currentTimeMillis();
        mergeSort(datos,0,datos.length-1);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    public void llamaQuickSort(int[] datos){
        this.tInicio = System.currentTimeMillis();       
        quicksort(datos,0,datos.length-1);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }
    
    //CODIGOS
    // CODIGOS
    //  CODIGOS
    
    
    //CODIGO BURBUJA
    private void burbuja(int[] datos) { 
      int i, j, aux; // 3
        for (i = 0; i < datos.length - 1; i++) { 
            
            for (j = 0; j < datos.length - 1; j++) { 
                // si entra al if se hace intercambio
                if (datos[j + 1] < datos[j]) { 
                    aux = datos[j + 1]; 
                    datos[j + 1] = datos[j]; 
                    datos[j] = aux; 
                }
            }
        }
        
    } 
    
    //CODIGO BURBUJA
    private void burbujaOptimizada(int[] datos) {
        int i, j, temp; 
        boolean swapped; 
        int n = datos.length; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (datos[j] > datos[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = datos[j]; 
                    datos[j] = datos[j + 1]; 
                    datos[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        }
        
    }
    
    //INSERT SORT
    public void insertSort(int datos[], int l)
    {
      int temp, j;
      
      for(int i=l+1; i<datos.length; i++)
      {
          j=i;
          while((j>l) && (datos[j-1]>datos[j]))
          {
              temp=datos[j-1];
              datos[j-1]=datos[j];
              datos[j]=temp;
              j--;
          }
      }
      
    }
    
    //Merge
    
     public void  mergeSort(int arr[], int left, int right)//(int datos[], int l, int longitud)
    {
      if(left < right){
      //Encuentra el punto medio del vector.
      int middle = (left + right) / 2;
      
      //Divide la primera y segunda mitad (llamada recursiva).
      mergeSort(arr, left, middle);
      mergeSort(arr, middle+1, right);

      //Une las mitades.
      merge(arr, left, middle, right);
    }
    }
    
     public void merge(int arr[], int left, int middle, int right) {
  //Encuentra el tamaño de los sub-vectores para unirlos.
  int n1 = middle - left + 1;
  int n2 = right - middle;

  //Vectores temporales.
  int leftArray[] = new int [n1];
  int rightArray[] = new int [n2];

  //Copia los datos a los arrays temporales.
  for (int i=0; i < n1; i++) {
    leftArray[i] = arr[left+i];
  }
  for (int j=0; j < n2; j++) {
    rightArray[j] = arr[middle + j + 1];
  }
  /* Une los vectorestemporales. */

  //Índices inicial del primer y segundo sub-vector.
  int i = 0, j = 0;

  //Índice inicial del sub-vector arr[].
  int k = left;

  //Ordenamiento.
  while (i < n1 && j < n2) {
    if (leftArray[i] <= rightArray[j]) {
      arr[k] = leftArray[i];
      i++;
    } else {
        arr[k] = rightArray[j];
        j++;
    }
    k++;
  }//Fin del while.

  /* Si quedan elementos por ordenar */
  //Copiar los elementos restantes de leftArray[].
  while (i < n1) {
    arr[k] = leftArray[i];
    i++;
    k++;
  }
  //Copiar los elementos restantes de rightArray[].
  while (j < n2) {
    arr[k] = rightArray[j];
    j++;
    k++;
  }
  }
   
   
   
   
   
   //QuickSort
   public  void quicksort(int datos[], int izq, int der) {
//izquierda 0, derecha elementos menos 1

    
 
  int pivote=datos[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(datos[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(datos[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= datos[i];                      // los intercambia
         datos[i]=datos[j];
         datos[j]=aux;
     }
   }
   
   datos[izq]=datos[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   datos[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(datos,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(datos,j+1,der);          // ordenamos subarray derecho
   
}
   
   
   
   // IMPRIMIR DATOS
   //  IMPRIMIR DATOS
   //   IMPRIMIR DATOS
   
   public void mostrarArreglo(int[] datos, String algoritmo)
   {
       for(int i=0; i<datos.length; i++)
            {
                System.out.print(algoritmo+": "+datos[i]+" ");
            }
   }
   
    
    
    
    
    
}
