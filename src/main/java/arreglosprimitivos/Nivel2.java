/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosprimitivos;

/**
 *
 * @author carva
 */
public class Nivel2 {
    //#5. Leer 8 números decimales y calcular el promedio general. 
    public void calcularPromedio() {
        double[] promedio = {12.4, 55.4, 78.9, 67.6, 70.6, 90.9, 89.4, 96.8};
        double suma = 0.0;
        for (double p : promedio) {
            suma += p;
        }//for
        double general = suma / promedio.length;
        System.out.printf("Promedio:%.2f%n", general);
    }//fin método calcularPromedio
    
    //#6. Calcular cuántos asistieron, cuántos faltaron y el porcentaje de asistencia.
    public void Asistencia(){
        boolean[] asistencia = {true, true, false, true, false, true, true, false, 
            true, false, true, true, false, true, false, true, true, false, true, false};
        int presentes = 0;
        int ausentes = 1;
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i]) { //
                presentes++; //
            }//if
                ausentes++;
        }//for
        int porcentaje = presentes/ausentes;
        System.out.println("Presentes: "+presentes + "Ausentes: "+ausentes
                + "Porcentaje de asistencia: "+porcentaje);
    }//fin del método asistencia
}
