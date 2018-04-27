
package exemploclaseinterna;


public class InternaMetodo {
    
    public void ver(){
        
        class Interna{
            public void amosar(){
                System.out.println("dende clase interna metodo");
            }
        }
        Interna obx = new Interna();
        obx.amosar();
    }
    
}
