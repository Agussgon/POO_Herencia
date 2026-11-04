public class Ave extends Animal implements Oviparo{
    private String plumaje;

    public Ave(Integer id, String nombre, Integer edad, String plumaje) {
        super(id, nombre, edad);
        this.plumaje = plumaje;
    }

    @Override
    public void ponerHuevos() {

    }
}
