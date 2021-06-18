/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        HashMap <String, Coche> mapaCoches=new HashMap();
        
        Coche a=new Coche(5,"1234ABC","Nissan","modelo1");
        Coche b=new Coche(5,"2345BCD","Citroen","modelo2");
        Coche c=new Coche(3,"3456CDE","Ford","modelo3");
        Coche d=new Coche(3,"4567DEF","Ford","modelo4");
        Coche e=new Coche(4,"5678EFG","Nissan","modelo5");
        
        
      mapaCoches.put(a.getMatricula(), a);
      mapaCoches.put(b.getMatricula(), b);
      mapaCoches.put(c.getMatricula(), c);
      mapaCoches.put(d.getMatricula(), d);
      mapaCoches.put(e.getMatricula(), e);
        
        System.out.println("Coches del mapa: ");
        mapaCoches.forEach(System.out::println);
        
        
       String buscarMatricula;
     
           
        
        
        

       String borrarMatricula;
       mapaCoches.remove(borrarMatricula);
       
        System.out.println("Tamaño del mapa:");
        System.out.println(mapaCoches.size());
        
        
        mapaCoches.
















        
    }
}
