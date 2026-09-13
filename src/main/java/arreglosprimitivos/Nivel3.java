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
public class Nivel3 {
    
   /* int Leer 12 números y solicitar un valor. Contar cuántas veces aparece dentro del
arreglo.Frecuencia simple*/
    

    public void contarFrecuencia() {
        int[] numeros = new int[12];

        for (int i = 0; i < 12; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        String textoValor = JOptionPane.showInputDialog("¿Qué valor desea buscar?");
        int valorBuscado = Integer.parseInt(textoValor);

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null,"El valor " + valorBuscado + " aparece " + contador + " veces.");
    }
    
    /*char Dado un arreglo de caracteres, contar por separado vocales, consonantes y otros
símbolos. Clasificación de caracteres*/

    public void clasificarCaracteres() {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        char[] letras = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }

        int vocales = 0;
        int consonantes = 0;
        int otros = 0;

        for (int i = 0; i < letras.length; i++) {
            char letra = letras[i];

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                    || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            } else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                consonantes++;
            } else {
                otros++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Vocales: " + vocales + "\n"
                + "Consonantes: " + consonantes + "\n"
                + "Otros simbolos: " + otros);
    }
    
    
}
