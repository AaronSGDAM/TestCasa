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
public class Ejercicio1SemanaSanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Propietario p1=new Propietario("direccion1","12345678A", "Manolo1",LocalDate.of(1988, 1, 1));
        Propietario p2=new Propietario("direccion2","12345678B", "Manolo2",LocalDate.of(1988, 2, 2));
        Taller t1=new Taller("Taller1","Dirección1",p1);
        Taller t2=new Taller("Taller2","Dirección2",p2);
        
        Cliente c1A = new Cliente("46935435","25435346J","sas",LocalDate.of(1998, 1, 1));
        Cliente c1B= new Cliente("45635485","25435346I","sus",LocalDate.of(1972, 2, 1));
        
        Cliente c2A= new Cliente("47635435","25435346K","ses",LocalDate.of(1968, 1, 1));
        Cliente c2B=new Cliente("46835435","25435346U","sds",LocalDate.of(2000, 1, 1));
         Cliente c2C=new Cliente("46885465","25435346S","sos",LocalDate.of(1964, 1, 1));
        
         
         /*Soy incapaz de encontrar por qué NetBeans me marca los objetos de clase vehiculo como error.
            Si estoy haciendo algo mal, por favor dimelo en clase, porque no lo veo. Los constructores están
         todos hechos y correctos, he probado a hacerlos como vehiculos normales, tanto dentro como fuera del
         metodo Add, he cambiado los parametros... No veo el error*/
         
         c1A.addVehiculo(Coche coche1A_1=new Coche(4,"1234AAA","SSSS","EEEEE"));
        c1A.addVehiculo(Coche coche1A_2=new Coche(4,"1234BBB","RRRR","OOOO"));
        c1A.addVehiculo(Moto moto1A=new Moto(120,"1234CCC","WWWW","IIII"));
        
        c1B.addVehiculo(Moto moto1B=new Moto(120,"1234DDDD","SSSS","IIII"));
        c1B.addVehiculo(Coche coche1B=new Coche(4,"1234EEE","JJJJ","CCCC"));
        
        
        c2A.addVehiculo(Coche coche2A_1=new Coche(2,"1234FFF","NNNN","XXXX"));
        c2A.addVehiculo(Coche coche2A_2=new Coche(2,"1234GGG","MMMM","QQQQ"));
        
        c2B.addVehiculo(Moto moto2B=new Moto(120,"1234HHH","FFFF","LLLL"));
        
        c2C.addVehiculo(Coche coche2C=newCoche(5,"1234III","OOOO","JJJJ"));
        
        t1.insertarCliente(c1A);
        t1.insertarCliente(c1B);
        
        t2.insertarCliente(c2A);
        t2.insertarCliente(c2B);
        t2.insertarCliente(c2C);
        
        System.out.println("Mostrando datos del taller 1:");
        System.out.println(t1.mostrarTodo());
        System.out.println("Mostrando datos del taller 2: ");
        System.out.println(t2.mostrarTodo());
        
        System.out.println("Mostrando datos de los novatos del taller 1: ");
        System.out.println(t1.mostrarNovatos());
        System.out.println("Mostrando datos de los novatos del taller 2:");
        System.out.println(t2.mostrarNovatos());
        
        if(t1.contarClientes()>t2.contarClientes()){
            System.out.println("El taller 1 tiene más clientes: "+t1.contarClientes());
        }else{
            System.out.println("El taller 2 tiene mas clientes: "+t2.contarClientes());
        }
        
        t2.borrarCliente(c2C);
        System.out.println("Mostrando datos del taller 2: ");
        System.out.println(t2.mostrarTodo());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
