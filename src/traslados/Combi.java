package traslados;

public class Combi extends Vehiculo{

    private int cantidadDeCarga;
    private int asientosRemovibles;
    private int capacidadAlmacenamiento;

    public Combi(String modelo, String patente, String marca, String modeloMotor, String potenciaMotor, String RECORRIDO_GENERAL, int lugaresDisponibles, int cantidadDeCarga, int asientosRemovibles, int capacidadAlmacenamiento) {
        super(modelo, patente, marca, modeloMotor, potenciaMotor, RECORRIDO_GENERAL, lugaresDisponibles);
        this.cantidadDeCarga = cantidadDeCarga;
        this.asientosRemovibles = asientosRemovibles;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    //sobrecarga
    public void transportar(int cantidadDeCarga, String aclaracion){
        IO.println("Sobrecarga 1.");
    }
    public void transportar(int cantidadDePasajeros){
        IO.println("Sobrecarga 2.");
    }
    public void transportar(int cantidadDeCarga, int cantidadPasajeros){
        IO.println("Sobrecarga 3.");
    }


    public void setLugaresDisponibles(int lugaresDisponibles){
        this.lugaresDisponibles= lugaresDisponibles;
    }

}
