/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
    public static void main(String[] args) {
    
        
        Collection <Coche> listaCoches=new ArrayList<>();
        /*El problema con los vehiculos se mantiene.No soy capaz de encontrar la razón*/
        listaCoches.add(Coche a(5,"1234ABC","Nissan","modelo1"));
        listaCoches.add(Coche b(3,"2234ABC","Citroen","modelo2"));
        listaCoches.add(Coche c(4,"3234ABC","Ford","modelo3"));
        
        System.out.println("Mostrar todos los coches: ");
        listaCoches.stream().forEach(System.out::println);
        
        
        System.out.println("Todos los coches ordenados por matricula: ");
        listaCoches.stream()
                                            .forEachOrdered(System.out::println);
        
        System.out.println("Coches de la marca Citroen: ");
        listaCoches.stream().filter(s->s.getMarca()="Citroen").forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
