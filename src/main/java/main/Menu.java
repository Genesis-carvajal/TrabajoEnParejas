/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import arreglosprimitivos.Nivel1;
import arreglosprimitivos.Nivel2;
import arreglosprimitivos.Nivel3;
import arreglosprimitivos.Nivel4;
import arreglosprimitivos.Nivel5;
import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Menu {

    Nivel1 n1 = new Nivel1();  
    Nivel2 n2 = new Nivel2();
    Nivel3 n3 = new Nivel3();
    Nivel4 n4 = new Nivel4();
    Nivel5 n5 = new Nivel5();
    private int opcion;
    
    

  public void MenuPrincipal() {
    do {
         opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                      BIENVENIDO

                                                      seleccione un algoritmo a imprimir
                                                      1. Mostrar longitud y último elemento
                                                      2. Mostrar el valor almacenado en cada posición
                                                      3. ,,,
                                                      4. ,,,
                                                      5. Leer 8 números decimales y calcular el promedio general. 
                                                      6. Calcular asistencia.
                                                      9. Leer 10 enteros y determinar el valor mayor y el valor menor.
                                                      10. Leer un arreglo y solicitar un número a buscar.
                                                      13. Invertir un arreglo de enteros en el mismo arreglo.
                                                      14. Crear una copia independiente de un arreglo de 10 enteros.
                                                      17. Generar un tercer arreglo donde cada posición sea la suma 
                                                          los arreglos originales.
                                                      18. Construir un tercero con la diferencia absoluta entre los 
                                                          valores correspondientes y calcular el promedio de esas diferencias
                                                      21. Salir

                                                      """));

    switch (opcion){
        case 1:
            n1.Decimales();
        break;
        case 2:
            n1.Valores();
        break;        
        case 3:
        
        break;        
        case 4:
        
        break;        
        case 5:
            n2.calcularPromedio();
        break;        
        case 6:
            n2.Asistencia();
        break;   
  
        case 7:
            
        break;
        case 8:
            
        break;        
        case 9:
            n3.MayorMenor();
        break;        
        case 10:
            n3.Buscar();
        break;        
        case 11:
        
        break;        
        case 12:
        break;
        case 13:
            n4.Invertir();
        break;
        case 14:
            n4.copiarArreglo();
        break;        
        case 15:
        
        break;        
        case 16:
            n5.sumarArreglos();
        break;        
        case 17:
            n5.diferenciaPrecios();
        break;        
        case 18:
        
        break;   
  
        case 19:
            
        break;
        case 20:
            
        break;  
        case 21:
            JOptionPane.showInputDialog("Has salido.");
        break;
        default:
        
        }//switch
        }while (opcion !=21); //termina do-while
    }//fin método
}//fin de la clase