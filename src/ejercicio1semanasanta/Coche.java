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
public class Coche extends Vehiculo{
    
    private int puertas;

    public Coche(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
    
    
}
