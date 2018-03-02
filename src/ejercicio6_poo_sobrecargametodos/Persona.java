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
public class Persona {
    String nombre;
    int edad;
    String dhi;

    //SOBRECARGA DE CONSTRUCTOR //se diferencian por el tipo de variables de los argumentos y-o cantidad de argumentos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dhi) {
        this.dhi = dhi;
    }
    
  //SOBRECARGA DE MÉTODO// se diferencian por el tipo de variables de los argumentos y-o cantidad de argumentos
    
    public void correr(){
        System.out.println("Soy "+nombre+". Tengo "+edad+" años y estor corriendo una maraton" );
    }
    
    public void correr(int km){
        System.out.println("He corrido "+dhi+" kilometros");
    }
    
}
