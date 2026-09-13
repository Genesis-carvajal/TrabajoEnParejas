/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosprimitivos;

/**
 *
 * @author carva
 */
public class Nivel4 {
    //#13. Invertir un arreglo de enteros en el mismo arreglo.
    public void Invertir() {
        int[] datos = {1, 2, 3, 4, 5};
        for (int i = 0; i < datos.length / 2; i++) {
            int aux = datos[i];
            datos[i] = datos[datos.length - 1 - i]; 
            datos[datos.length - 1 - i] = aux;
        }
        for (int v : datos) {
            System.out.print(v + " ");
        }
    }
    //#14. Crear una copia independiente de un arreglo de 10 enteros, elemento por elemento. 
        public void copiarArreglo() {
        int[] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] copia = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i] * 2;
        }

        System.out.print("Original: ");
        for (int v : original) {
            System.out.print(v + " ");
        }

        System.out.println();

        System.out.print("Copia: ");
        for (int v : copia) {
            System.out.print(v + " ");
        }
    }
}
