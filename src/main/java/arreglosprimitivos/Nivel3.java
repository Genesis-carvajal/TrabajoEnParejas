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
    //#9. Leer 10 enteros y determinar el valor mayor y el valor menor.
    public void MayorMenor(){
        int[] temps = {18, 25, 44, 12, 30, 21, 66, 45, 67, 19};
        int mayor = temps[0];
        int menor = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > mayor) {
                mayor = temps[i]; 
            }
            if (temps[i] < menor) {
                menor = temps[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);  
}
        //#10. Leer un arreglo y solicitar un número a buscar.
    public void Buscar() {
        int[] numeros = {1, 3, 5, 9, 11};

        String entrada = JOptionPane.showInputDialog("Ingrese el número a buscar:");
        int buscar = Integer.parseInt(entrada);
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            JOptionPane.showMessageDialog(null,"El número " + buscar + 
                    " se encontró en la posición " + posicion);
        } else {
            JOptionPane.showMessageDialog(null,"El número " + buscar + 
                    " no existe en el arreglo");
        }
    }
}
