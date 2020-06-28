/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import com.sun.xml.internal.ws.api.message.Message;

/**
 *
 * @author USUARIO
 */
public class Proceso extends Thread{
  
    String mensaje;
    public Proceso (String arg) {
       
            super (arg);
     
         }
public void run(){   

for (int i=0;i<15;i++) { 

System.out.println(mensaje);
}
System.out.println("Este proceso ha terminado"+this.getName());

}
    

   public void setMessage(String m) {
        this.mensaje=m;
    }

    void star() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
