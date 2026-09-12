/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import arreglosprimitivos.Nivel1;
import arreglosprimitivos.Nivel2;
import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Menu {

    Nivel1 n1 = new Nivel1();  
    Nivel2 n2 = new Nivel2();
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
                                                      6. ,,,
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
        
        break;   
  
        case 7:
            
        break;
        case 8:
            
        break;        
        case 9:
        
        break;        
        case 10:
        
        break;        
        case 11:
        
        break;        
        case 12:
        break;
        case 13:
            
        break;
        case 14:
            
        break;        
        case 15:
        
        break;        
        case 16:
        
        break;        
        case 17:
        
        break;        
        case 18:
        
        break;   
  
        case 19:
            
        break;
        case 20:
            
        break;  
        case 21:
        break;
        default:
        
        }//switch
        }while (opcion !=21); //termina do-while
    }//fin método
}//fin de la clase