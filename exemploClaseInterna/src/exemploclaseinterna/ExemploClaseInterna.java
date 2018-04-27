package exemploclaseinterna;

public class ExemploClaseInterna {

    public static void main(String[] args) {
        
        //SE A CLASE INERNA NON É PRIVATE
        
//        ExternaInterna ei = new ExternaInterna();
//      
//      ExternaInterna.Interna obxIn = ei.new Interna(); // obxecto clase interna
//      obxIn.amosar(); // só cando a clase non é privada


      //CANDO A CLASE É PRIVATE accedemos a través dun obxecto da clase externa    
        
//        ExternaInterna ei = new ExternaInterna();
//        ei.ver();

      //DENDE A CLASE INTERNA METODO
      
//      InternaMetodo in = new InternaMetodo();
//      in.ver();

      //DENDE A CLASE ANONIMA
      
      ClaseAnonima obx = new ClaseAnonima();
      obx.operacion();
    }

}
