/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author USUARIO
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Proceso hilo1 =new Proceso ("soy el hilo 1");
     Proceso hilo2 =new Proceso ("soy el hilo 2");
     hilo1.setMessage("Este es el mensage 1");
      hilo2.setMessage("Este es el mensage 2");
    hilo1.start();
     hilo2.start();
    
    }
    
}
