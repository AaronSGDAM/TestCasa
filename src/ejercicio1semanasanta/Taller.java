/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Taller {
    private String nombre;
    private String direccion;
    private  Propietario propietario;
    private TreeSet <Cliente> clientes;

    public Taller(String nombre, String direccion, Propietario propietario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
        clientes=new TreeSet();
    }
    
    public void insertarCliente(Cliente cAdd){
        clientes.add(cAdd);
    
 }
    
    public String mostrarMotos(){
        String stringMotos="Motos: ";
      for(Cliente clienteVehiculos:clientes){
        for(Vehiculo clienteMotos: clienteVehiculos.getVehiculos()){
            if(clienteMotos instanceof Moto){
            stringMotos=stringMotos+" ,"+clienteMotos.identificarte();
        }
        }
      }
      return stringMotos;
    }
    
    public String mostrarNovatos(){
        String stringNovatos="";
        for(Cliente clienteBuscar: clientes){
            if((LocalDate.now().getYear()-clienteBuscar.getFechaNacimiento().getYear())<=25){
                stringNovatos=stringNovatos+clienteBuscar.toString();
            }
        }
            return stringNovatos;
        }
            
            public String mostrarTodo(){
                String texto;
                String textoClientes="";
                String textoPropietarios="";
                String textoTaller="";
                for(Cliente clienteBuscar: clientes){
                    String datosCliente=" ";
                            datosCliente=datosCliente+", "+clienteBuscar.identificarte();
                            datosCliente=datosCliente+", "+clienteBuscar.toString();
                            datosCliente="Clientes: "+datosCliente+"; ";
                            textoClientes=textoClientes+" ,"+datosCliente;
                }
             textoPropietarios=textoPropietarios+"Propietario: "+propietario.toString();
             textoTaller="Taller: " + "nombre=" + nombre + ", direccion=" + direccion ;
             
             texto=textoTaller+" "+textoPropietarios+textoClientes;
             return texto;
    
            
            }

public int contarClientes(){
    return clientes.size();
}
            
            public boolean borrarCliente(Cliente cBorrar){            
                boolean borrado=false;
        Iterator<Cliente> it=clientes.iterator();
        while(it.hasNext()){
            Cliente cIt=it.next();
      
            if(cIt.equals(cBorrar)){
                it.remove();
                borrado=true;
            }
                
            }
        return borrado;
            }
               
            
    
}
