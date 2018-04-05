
package exemploficheiroserializable;
  
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExemploFicheiroSerializable {
   
    public static void main(String[] args) {
      
         Metodos obxfich= null ;      
            obxfich = new Metodos();
            obxfich.escribeFichero("persoas.dat");         
            obxfich.lerFicheiro("persoas.dat");
            obxfich.engadeFicheiro("persoas.dat");
            obxfich.lerFicheiro("persoas.dat");
    }
} 