import java.util.Objects;

public abstract class Instrumento implements Comparable <Instrumento> {

    private int codigo;
    private String familia;
    private String modelo;

    public Instrumento(int codigo, String familia, String modelo) {
        this.codigo = codigo;
        this.familia = familia;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void probarSonido();


    @Override
    public String toString() {
        return "Instrumento{" +
                "codigo=" + codigo +
                ", familia='" + familia + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass()) return false;

        Instrumento instrumentoComparar= (Instrumento)obj;
        return Objects.equals(this.modelo, instrumentoComparar.modelo) && this.codigo == instrumentoComparar.codigo;


    }

    @Override
    public int compareTo(Instrumento o) {
        return this.modelo.compareToIgnoreCase(o.modelo);
    }
}
