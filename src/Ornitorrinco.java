public class Ornitorrinco extends Mamifero implements Oviparo, Comparable<Ornitorrinco> {


    public Ornitorrinco(Integer id, String nombre, Integer edad, Integer cantidadCrias) {
        super(id, nombre, edad, cantidadCrias);
    }


    @Override
    public void ponerHuevos() {
        IO.println("perri pone huevos.");
    }


    @Override
    public int compareTo(Ornitorrinco o) {
        return this.getId().compareTo(o.getId());
    }
}
