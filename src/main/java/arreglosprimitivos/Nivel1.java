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
public class Nivel1 {
        
  /*  3 Básico int Leer 8 números enteros desde teclado y almacenarlos en un arreglo. Al
finalizar, mostrar todos los valores uno por línea.
Lectura, almacenamiento,recorrido
*/
    public void leerYMostrarNumeros() {

        int[] numeros = new int[8];

        for (int i = 0; i < 8; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        String resultado = "Los numeros ingresados son:\n";
        for (int i = 0; i < 8; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

   /* 4 Básico char Convertir una palabra conocida a un arreglo de caracteres y mostrar cada
carácter por separado.
char[], recorrido
    */
    public void ConvertirPalabra() {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        String resultado = "Los caracteres son:\n";
        for (int i = 0; i < letras.length; i++) {
            resultado += letras[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

    }
}