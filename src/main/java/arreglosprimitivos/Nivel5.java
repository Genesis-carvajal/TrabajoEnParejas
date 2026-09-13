/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosprimitivos;

import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Nivel5 {
    
    /*nt Leer un arreglo y determinar si está ordenado de forma ascendente sin
modificarlo.
Comparación entre
vecinos*/

    public void estaOrdenado() {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        boolean ordenado = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
            }
        }

        if (ordenado) {
            JOptionPane.showMessageDialog(null, "El arreglo esta ordenado de forma ascendente.");
        } else {
            JOptionPane.showMessageDialog(null, "El arreglo NO esta ordenado de forma ascendente.");
        }
    }
    
  /*int Determinar si un arreglo es capicúa: se lee igual de izquierda a derecha que de
derecha a izquierda.
Comparación simétrica*/

    public void esCapicua() {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        boolean esCapicua = true;
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esCapicua = false;
            }
        }

        if (esCapicua) {
            JOptionPane.showMessageDialog(null, "El arreglo es capicua.");
        } else {
            JOptionPane.showMessageDialog(null, "El arreglo NO es capicua.");
        }
    }
}
