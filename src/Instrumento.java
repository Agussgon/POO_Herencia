public abstract class Instrumento {

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

}
