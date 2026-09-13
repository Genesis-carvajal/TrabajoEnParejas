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
public class Nivel4 {
    
    /*int Rotar un arreglo una posición hacia la derecha: el último elemento pasa a la
primera posición y los demás se desplazan una posición.
Rotación derecha*/

    public void rotarDerecha() {
        int[] numeros = new int[12];

        // Lectura y almacenamiento
        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        // Rotación derecha usando arreglo auxiliar
        int[] rotado = new int[numeros.length];
        rotado[0] = numeros[numeros.length - 1]; // el ultimo pasa a ser el primero

        for (int i = 0; i < numeros.length - 1; i++) {
            rotado[i + 1] = numeros[i];
        }

        // Mostrar resultado
        String resultado = "Arreglo original:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }
        resultado += "\nArreglo rotado a la derecha:\n";
        for (int i = 0; i < rotado.length; i++) {
            resultado += rotado[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
    
    /*int Solicitar dos índices válidos e intercambiar los valores almacenados en esas
posiciones. Validar que ambos índices pertenezcan al arreglo.
Validación de índices,
intercambio*/

    public void intercambiarPorIndices() {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(texto);
        }

        String textoIndice1 = JOptionPane.showInputDialog("Ingrese el primer indice (0 a " + (numeros.length - 1) + "):");
        int indice1 = Integer.parseInt(textoIndice1);

        String textoIndice2 = JOptionPane.showInputDialog("Ingrese el segundo indice (0 a " + (numeros.length - 1) + "):");
        int indice2 = Integer.parseInt(textoIndice2);

        if (indice1 >= 0 && indice1 < numeros.length && indice2 >= 0 && indice2 < numeros.length) {

            int temporal = numeros[indice1];
            numeros[indice1] = numeros[indice2];
            numeros[indice2] = temporal;

            String resultado = "Arreglo despues del intercambio:\n";
            for (int i = 0; i < numeros.length; i++) {
                resultado += numeros[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);

        } else {
            JOptionPane.showMessageDialog(null, "Error: uno o ambos indices estan fuera del arreglo.");
        }
    }
    
}
