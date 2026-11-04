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


    public String getFamilia() {
        return familia;
    }

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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   @Override
   public int compareTo( Instrumento instrumento  ){

     return  Integer.compare(this.codigo, instrumento.codigo); //this.modelo.compareToIgnoreCase(instrumento.modelo);

    }



}
