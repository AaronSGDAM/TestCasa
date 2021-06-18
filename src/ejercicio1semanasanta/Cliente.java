/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona implements Comparable <Cliente>{
    
    private String telefono;
    private HashSet <Vehiculo> vehiculos;

    public Cliente(String telefono, String dni, String nombre, LocalDate fechaNacimiento) {
        super(dni, nombre, fechaNacimiento);
        this.telefono = telefono;
        vehiculos=new HashSet<>();
    }
    
    public void addVehiculo(Vehiculo vAdd){
    vehiculos.add(vAdd);
            }
     
    public void borrarVehiculo(String codBorrar){
        Iterator<Vehiculo> it=vehiculos.iterator();
        while(it.hasNext()){
            Vehiculo vBorrar=it.next();
      
            if(vBorrar.getMatricula().equals(codBorrar)){
                it.remove();
                System.out.println("El vehiculo ha sido borrado.");
            }
        }
    }
    
    public void visualizar(){
        
        String mostrar;
       String listaVehiculos="";
        mostrar = "Cliente{" + "telefono=" + telefono + ", vehiculos=" ;
         Iterator<Vehiculo> it=vehiculos.iterator();
        while(it.hasNext()){
            listaVehiculos=listaVehiculos+" Vehiculo: "+it.toString()+", ";
            it.next();
            
        }
        mostrar=mostrar+listaVehiculos;
        System.out.println(mostrar);
    }

    public String getTelefono() {
        return telefono;
    }

    public HashSet<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setVehiculos(HashSet<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getDni().compareTo(o.getDni());
    }


}