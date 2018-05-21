
package exemplopolimorfismo;


public class Alumno extends Persoa {
    
    public int nota;

    public Alumno() {
    }

    public Alumno(int nota) {
        this.nota = nota;
    }

    public Alumno(int nota, String nome, int edade) {
        super(nome, nota);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome: "+super.getNome()+" edade: "+super.getEdade()+ " nota: " + nota;
    }
    
    
    
    
    
}
