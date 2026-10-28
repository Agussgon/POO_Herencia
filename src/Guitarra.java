public class Guitarra extends Instrumento implements Afinable{
    private String madera;

    public Guitarra(int codigo, String familia, String modelo, String madera) {
        super(codigo, familia, modelo);
        this.madera = madera;
    }

    @Override
    public void probarSonido() {
        IO.println("tocar cuerdas.");
    }


    @Override
    public String toString() {
        return "Guitarra{" +
                "madera='" + madera + '\'' +
                "} " + super.toString();
    }

    @Override
    public void afinar() {
        IO.println("ajustar cuerdas, nota de referencia: "+ this.getNotaReferencia());


    }
}
