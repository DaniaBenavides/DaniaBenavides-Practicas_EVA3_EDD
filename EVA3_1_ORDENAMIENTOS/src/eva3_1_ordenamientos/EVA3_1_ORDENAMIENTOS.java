/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamientos;

/**
 *
 * @author rocio
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vamos a ordenar arreglos (int)
        int[] datos = new int[10];
        long iniT, finT;
        llenar(datos);//envio el arreglo a llenar con valores aleatorios

       /* System.out.println("PRUEBA CON SELECTION SORT: ");
        imprimir(datos);//imprimir contenido
        iniT = System.nanoTime();//tiempo antes de empezar el método
        System.nanoTime();
        selectionSort(datos);
        finT = System.nanoTime();//tiempo al terminar el método
        imprimir(datos);//imprimir contenido
        System.out.println("");
        System.out.println("Tiempo en ordenar: " + (finT - iniT));*/
        
        System.out.println("PRUEBA CON INSERTION SORT: ");
        imprimir(datos);//imprimir contenido
        iniT = System.nanoTime();//tiempo antes de empezar el método
        insertionSort(datos);
        finT = System.nanoTime();//tiempo al terminar el método
        imprimir(datos);//imprimir contenido
        System.out.println("");
        System.out.println("Tiempo en ordenar: " + (finT - iniT));
    }

    //llenado de arreglo con valores aleatorios 0-99
    public static void llenar(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }
    }

    //copia de arreglo
    //imprimir arreglo
    public static void imprimir(int[] datos) {
        System.out.println("");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
    }

    //EFICIENCIA O(N^2)
    public static void selectionSort(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            int iMin = i; //empieza el siguiente algoritmo, el minimo es el primer elemento
            for (int j = 0; j < datos.length; j++) {//buscar la posicion del valor mas pequeño
                //comparar
                //valor[j] vs valor minimo
                if (datos[j] < datos[iMin]) { //comparo actual vs el minimo actual
                    iMin = j;
                }
            }
            //intercambio
            if (i != iMin) {
                //3 pasos 
                //respaldar un valor
                int iTemp = datos[i];
                //intercambiar un valor
                datos[i] = datos[iMin];
                //reponer el valor reespaldado
                datos[iMin] = iTemp;
            }

        }
    }

    public static void insertionSort(int[] datos) {
        for(int i=1;i<datos.length;i++){
            int temp = datos[i];//valor a insertar
            int insP =i;//posicion donde vamos a insertar
            for(int prev=i-1;prev>=0;prev--){//buscar donde insertar
                if(datos[prev]>temp){
                    datos[insP]=datos[prev];//movemos valor de prev a la posicion de insP
                    insP--;//retrocede una posicion
                }else{
                    break;
                }
            }
            //insertamo9s
            datos[insP]=temp;
        }
    }
}
