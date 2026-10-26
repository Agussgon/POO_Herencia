public class Guitarra extends Instrumento{
    private String madera;

    public Guitarra(int codigo, String familia, String modelo, String madera) {
        super(codigo, familia, modelo);
        this.madera = madera;
    }

    @Override
    public void probarSonido() {
        IO.println("tocar cuerdas.");
    }
}
