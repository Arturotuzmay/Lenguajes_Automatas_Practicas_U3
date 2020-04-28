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
public class local {
    
   void local(int c, int a){
        int sum1, sum2;
        
        System.out.println("\nFolding (el dato es constante)");
        //Codigo sin optimizar
        sum1 = (2 + 5) * a + c;
        System.out.println("Sin optimizar: "+sum1);
        
        //Codigo optimizado
        sum2 = 7 * a + c;
        System.out.println("Optimizado: "+sum1);
    
    }
   
   void local2(int a, int c){
   int x, y, z, w;
  
        System.out.println("\nPropagacion de copias: ");
       //Codigo sin optimizar
       x = a + c;
       y = x;
       w = a + y;
       z = w + a;
       System.out.println("Sin optimizar: " + z);
       
       //Codigo optimizado
       x = 3 * a + c;
       System.out.println("Optimizado: "+x);
   } 
}
