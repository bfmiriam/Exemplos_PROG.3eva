
package exemploclaseinterna;


public class ClaseAnonima {
    
    Ioperable an = new Ioperable() {
        @Override
        public void suma(double a, double b) {
            System.out.println("suma= "+(a+b)); 
        }
    };
    
    public void operacion(){
        an.suma(4, 7);
    }

    
    
}
