/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_lenguajes_y_automatas;

/**
 *
 * @author Arturo
 */
public class mirilla {
    
    double x, y;
    
    
    void mirilla1(double a){
        //double x;
        System.out.println("No Optimizado");
        x = a * a * a;
        System.out.println("El resultado es: " + x + "\n");
        System.out.println("Optimizado");
        y = Math.pow(a,3);
        System.out.println("El resultado es: " + y + "\n");
    }
    
}
