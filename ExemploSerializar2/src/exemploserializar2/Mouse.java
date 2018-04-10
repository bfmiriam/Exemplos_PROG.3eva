package exemploserializar2;

import java.io.Serializable;

public class Mouse implements Serializable {

    private String tipo;

    public Mouse() {
    }

    public Mouse(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse => " + "tipo: " + tipo;
    }

}
