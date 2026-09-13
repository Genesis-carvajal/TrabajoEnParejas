/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosprimitivos;

/**
 *
 * @author carva
 */
public class Nivel5 {
    //#17. Generar un tercer arreglo donde cada posición sea la suma 
    //de los elementos correspondientes de los dos arreglos originales.
    public void sumarArreglos() {
        int[] arregloA = {1, 2, 3, 4, 5};
        int[] arregloB = {10, 20, 30, 40, 50};
        int[] suma = new int[arregloA.length];

        for (int i = 0; i < arregloA.length; i++) {
            suma[i] = arregloA[i] + arregloB[i];
        }

        System.out.print("Arreglo A: ");
        for (int v : arregloA) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Arreglo B: ");
        for (int v : arregloB) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Suma:      ");
        for (int v : suma) {
            System.out.print(v + " ");
        }
    }
    
    //#18. Construir un tercero con la diferencia absoluta entre los 
    //valores correspondientes y calcular el promedio de esas diferencias
    
        public void diferenciaPrecios() {
        double[] preciosA = {15.5, 20.0, 8.75, 30.0, 12.25};
        double[] preciosB = {18.0, 19.5, 10.0, 25.5, 14.0};
        double[] diferencias = new double[preciosA.length];

        double sumaDiferencias = 0;

        for (int i = 0; i < preciosA.length; i++) {
            diferencias[i] = Math.abs(preciosA[i] - preciosB[i]);
            sumaDiferencias += diferencias[i];
        }

        double promedio = sumaDiferencias / diferencias.length;

        System.out.print("Precios A:    ");
        for (double v : preciosA) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Precios B:    ");
        for (double v : preciosB) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.print("Diferencias:  ");
        for (double v : diferencias) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Promedio de diferencias: " + promedio);
    }
}

