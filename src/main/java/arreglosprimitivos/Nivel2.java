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
public class Nivel2 {
    //char Dado un arreglo de caracteres, contar cuántas vocales contiene. char[], búsqueda por condición
    
    public void contarVocales() {
        
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        int contador = 0;
        for (int i = 0; i < letras.length; i++) {
            char letra = letras[i];
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                    || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "La palabra tiene " + contador + " vocales.");
    }
    
    /*nt Leer 15 números. Mostrar la suma de los elementos ubicados en
índices pares y, por separado, la suma de los ubicados en índices
impares.
Trabajo con índices*/
    
    public void sumarParesImpares() {
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,
                "Suma de indices pares: " + sumaPares + "\n"
                + "Suma de indices impares: " + sumaImpares);
    }
}
