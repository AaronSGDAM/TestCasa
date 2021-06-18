/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Persona implements Identificacion {
    
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    
    
    @Override
    public String identificarte() {
        
       DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
       return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento.format(f) + '}'; 
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

       
   
    
    
    
    
}
