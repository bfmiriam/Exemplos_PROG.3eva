package exemploserializar2;

public class ExemploSerializar2 {

    public static void main(String[] args) {

      Metodos obxfich= null ;      
            obxfich = new Metodos();
            obxfich.escribeFichero("ordenadores.dat");         
            obxfich.lerFicheiro("ordenadores.dat");
            obxfich.engadeFicheiro("ordenadores.dat");
            obxfich.lerFicheiro("ordenadores.dat");
    }

}
