/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosprimitivos;

/**
 *
 * @author carva
 */
public class Nivel1 {
    //#1. Mostrar longitud y último elemento.
    public void Decimales() {
        double[] decimales = {25.3, 28.52, 26.75, 32.32};
        for (int i = 0; i < decimales.length; i++) {
            System.out.println("La longitud de este arreglo: " + decimales.length
                    + "El último valor es: " + decimales[3]);
        }//for
    }//método decimales

    //#2. Mostrar el valor almacenado en cada posición.
    public void Valores() {
        boolean[] valores = {true, true, false, false, true, true};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posicion " + i
                    + ": " + valores[i]);
        }//for
    }//método valores
    
}
