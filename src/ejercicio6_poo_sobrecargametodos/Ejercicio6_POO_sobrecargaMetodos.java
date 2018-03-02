/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_poo_sobrecargametodos;

/**
 *
 * @author danie
 */
public class Ejercicio6_POO_sobrecargaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1= new Persona("Alejandro", 21);
        Persona persona2=new Persona ("1020020");
        
        persona1.correr();
        persona2.correr(110000);
        
    }
    
}
