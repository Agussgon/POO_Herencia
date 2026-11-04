public abstract class Mamifero extends Animal {
    private Integer cantidadCrias;

    public void amamantar(){

    }

    public Mamifero(Integer id, String nombre, Integer edad, Integer cantidadCrias) {
        super(id, nombre, edad);
        this.cantidadCrias = cantidadCrias;
    }
}
