/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1semanasanta;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo{
    
    private int cilindrada;

    public Moto(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    
    
}
