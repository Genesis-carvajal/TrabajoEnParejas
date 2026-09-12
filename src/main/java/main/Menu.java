/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import arreglosprimitivos.Nivel1;
import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public class Menu {

    private Nivel1 nivel1;
    private int opcion;

  public void MenuPrincipal() {
    do {
         opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                      BIENVENIDO

                                                      seleccione una opción:
                                                      1. ,,,
                                                      2. ,,,
                                                      3. ,,,
                                                      4. ,,,
                                                      5. ,,,
                                                      6. ,,,

                                                      """));

    switch (opcion){
        case 1:
            nivel1.Decimales();
        break;
        case 2:
            
        break;        
        case 3:
        
        break;        
        case 4:
        
        break;        
        case 5:
        
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
        default:
        
        }//switch
        }while (opcion !=20); //termina do-while
    }//fin método
}//fin de la clase