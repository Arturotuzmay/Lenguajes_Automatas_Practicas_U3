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
public class ciclos {
    
    //No optimizado
    void ciclo1(String x){    
        int i = 0;
        int contador = 0;
        
        while (i < x.length()){
            contador = contador + 1;
            System.out.println("Letra " + contador + " = " + x.substring(0+i,1+i));
            i = i +1;
        }
    }
    //Optimizado
    void ciclo2(String x){
        int i = 0;
        
        while (i < x.length()){
            System.out.println("Letra " + (i+1) + " = " + x.substring(i,i+1));
            i = i +1;
        }
    }
    
    //No optimizado
    void ciclo3(String x){
        int a;
        a = 3;
        for (int i = 0; i < a; i++) {
            System.out.println(i+ " " + x);
        }   
    }
    
    //Optimizado
    void ciclo4(String x){
        for (int i = 0; i < 3; i++) {
            System.out.println(i+ " " + x);
        }
    }
}
