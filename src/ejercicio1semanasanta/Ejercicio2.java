/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
     public static void main(String[] args) {
         
        Collection <Cliente> colaClientes=new Queue<>(); 
         
        
         colaClientes.add(c2A);
         colaClientes.add(c2B);
         colaClientes.add(c2C);
         
         for(Cliente clienteMostrar:colaClientes){
             clienteMostrar.visualizar();
         }
         
         Collection <Cliente> listaMotos=new ArrayList<>();
         for(Cliente clienteBuscar: colaClientes){
             for(Vehiculo vehiculoBuscar: clienteBuscar.getVehiculos()){
                 if(vehiculoBuscar instanceof Moto){
                     listaMotos.add(clienteBuscar);
                     colaClientes.remove(clienteBuscar);
                 }
             }
         }
         
         System.out.println("Antes de la inversion");
         System.out.println(colaClientes.toString());
         System.out.println("Tras la inversion");
         System.out.println(colaClientes);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
       
     }
     
     
}
