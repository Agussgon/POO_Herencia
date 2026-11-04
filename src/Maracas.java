public class Maracas extends Instrumento {

    private String materialRelleno;

    public Maracas(int codigo, String familia, String modelo, String materialRelleno) {
        super(codigo, familia, modelo);
        this.materialRelleno = materialRelleno;
    }

    @Override
    public void probarSonido() {

    }
}
