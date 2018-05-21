
package exemplopolimorfismo;


public class Persoa {
    
    public String nome;
    public int edade;

    public Persoa() {
    }

    public Persoa(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public int getEdade() {
        return edade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", edade=" + edade;
    }
    
    
    
}
