/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_lenguajes_y_automatas;

import java.util.Scanner;


/**
 *
 * @author Arturo
 */
public class Practicas_Lenguajes_y_Automatas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        local Y = new local();
        ciclos B = new ciclos();
        mirilla A = new mirilla();
        
        int a, c;
        double b;
        String palabra;
        
        Scanner x = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Practicas de Optimizacion");
        System.out.println("Selecione una opcion:");
        System.out.println("1. Ciclos");
        System.out.println("2. Locales");
        System.out.println("3. Mirilla");
        System.out.println("4. Salir");
        opcion = x.nextInt();
        switch(opcion){
        case 1:
            System.out.print("Por favor, introduzca su nombre: ");
            palabra = t.nextLine();
            System.out.print("Edad: ");
            a = x.nextInt();
            System.out.println("No optimizado");
            B.ciclo1(palabra);
            System.out.println("\nOptimizado");
            B.ciclo2(palabra);
            System.out.println("No optimizado");
            B.ciclo3(palabra);
            System.out.println("\nOptimizado");
            B.ciclo4(palabra);
        break;
            
        case 2:
            System.out.println("Nombre: ");
            palabra = t.nextLine();
            System.out.println("Bienvenido " + palabra);
            System.out.print("Ingrese un numero: ");
            a = x.nextInt();
            System.out.print("Ingrese un numero: ");
            c = x.nextInt();
            Y.local(c, a);
            Y.local2(c, a);
        break;
        
        case 3:
            System.out.print("Ingrese un numero: ");
            b = x.nextDouble();
            A.mirilla1(b);
            //A.mirilla2(b);
        break;
        
        case 4:
                System.out.println("Gracias");
        break;}
        }while(opcion != 4);
                     
                       }
    }
   
