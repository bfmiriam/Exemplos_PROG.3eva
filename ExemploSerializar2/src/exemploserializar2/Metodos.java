
package exemploserializar2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;


public class Metodos {
    public void escribeFichero(String ficheiro) 
    {
      //  MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;
        try
        {
           //  esc = new MeuObjectOutputStream(          
           //         new FileOutputStream(ficheiro));
            
            fich = new ObjectOutputStream(new FileOutputStream(ficheiro));
            for (int i = 0; i <2; i++) // como exemplo gardamos 2 obxectos
            {
                // instanciamos os obxectos tipo ordenador dentro do bucle
                Cpu c = new Cpu(enteiro("memoria da cpu: "),enteiro("velocidade da cpu:"));
                Pantalla p = new Pantalla(cadea("marca da pantalla:"),decimal("pulgadas da pantalla:"));
                Rato r = new Rato(new Mouse(cadea("tipo de rato:")));
                Ordenador orde = new Ordenador(c, p, r);
               // esc.writeObject(p);
                fich.writeObject(orde);
            }
           
        } catch (Exception e)
        {
           // e.printStackTrace();
            System.out.println("erro"+e.getMessage());
        }
        finally{
            if(fich != null)
                try {
                    fich.close();
            } catch (IOException ex) {
                    System.out.println("erro!"+ ex.getMessage());
            }
        }
    }
    
      public void engadeFicheiro(String ficheiro) 
    {
       MeuObjectOutputStream esc = null;
        ObjectOutputStream fich = null;        
        try
        {
             esc = new MeuObjectOutputStream(          
                    new FileOutputStream(ficheiro,true));            
           
            for (int i = 0; i <1; i++) // engadimos 1 obxecto
            {
                Cpu c = new Cpu(enteiro("memoria da cpu: "),enteiro("velocidade da cpu:"));
                Pantalla p = new Pantalla(cadea("marca da pantalla:"),decimal("pulgadas da pantalla:"));
                Rato r = new Rato(new Mouse(cadea("tipo de rato:")));
                Ordenador orde = new Ordenador(c, p, r);
                
                esc.writeObject(orde);
               
            }
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally{
            if(esc != null)
                try {
                 esc.close();
            } catch (IOException ex) {
                System.out.println("erro!"+ ex.getMessage());
            }
        }
    }   
    
    
 public String cadea(String s){
     return JOptionPane.showInputDialog(s);
 }
 public int enteiro(String s){
     return Integer.parseInt(JOptionPane.showInputDialog(s));
 }
  public float decimal(String s){
     return Float.parseFloat(JOptionPane.showInputDialog(s));
 }
 public void lerFicheiro(String ficheiro){
     ObjectInputStream ler = null;
     Ordenador aux = null;
        try {
            ler = new ObjectInputStream(new FileInputStream(ficheiro));
       
             aux=(Ordenador)ler.readObject();
             while(aux!= null){
                 System.out.println(aux.toString());
                 aux=(Ordenador)ler.readObject();
             }
        }    
          catch (ClassNotFoundException ex) {
              System.out.println("erro 1" +ex.getMessage());      
                    
           } catch (IOException ex) {
            System.out.println("erro 2" +ex.getMessage());
        }
     finally{
            if(ler != null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("erro de peche "+ex.getMessage());
            }
        }
 }
    
}
