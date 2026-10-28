public class Flauta extends Instrumento implements Afinable{
    private String afinacion;

    public Flauta(int codigo, String familia, String modelo, String afinacion) {
        super(codigo, familia, modelo);
        this.afinacion = afinacion;
    }

    @Override
    public void probarSonido() {
    IO.println("probando sonido.");

    }

    @Override
    public void afinar() {

    }
}
