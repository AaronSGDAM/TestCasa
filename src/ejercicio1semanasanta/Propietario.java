/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Propietario extends Persona {
    
    private String direccion;

    public Propietario(String direccion, String dni, String nombre, LocalDate fechaNacimiento) {
        super(dni, nombre, fechaNacimiento);
        this.direccion = direccion;
    }
    
    
    
    
    
    
}
