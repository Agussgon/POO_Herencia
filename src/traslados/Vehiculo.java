package traslados;

import java.util.Objects;

public class Vehiculo {
    private String modelo;
    private final String PATENTE;
    private String marca;
    protected final String RECORRIDO_GENERAL;
    protected int lugaresDisponibles;
    protected int lugaresVendidos=0;

    //compo
    private Motor motor;

    //constructor
    public Vehiculo(String modelo, String patente, String marca, String modeloMotor, String potenciaMotor, String RECORRIDO_GENERAL, int lugaresDisponibles) {
        this.modelo = modelo;
        this.PATENTE = patente;
        this.marca = marca;
        this.motor = new Motor(modeloMotor, potenciaMotor);
        this.RECORRIDO_GENERAL= RECORRIDO_GENERAL;
        this.lugaresDisponibles=lugaresDisponibles;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", patente='" + PATENTE + '\'' +
                ", marca='" + marca + '\'' +
                ", motor=" + motor +'\'' +
                "hashCode=" + this.hashCode()+
                '}';
    }

    public String getPATENTE() {
        return PATENTE;
    }

//    public String getRECORRIDO_GENERAL() {
//        return RECORRIDO_GENERAL;
//    }

    public String consultarRecorrido(){
      IO.println(RECORRIDO_GENERAL);
        return  RECORRIDO_GENERAL;
    }


    public final void reservarAsientos(int cantidadAsientosReservados){
        if(cantidadAsientosReservados < 1) IO.println("Ingrese un n° de asientos correcto.");
        else if(this.lugaresDisponibles < cantidadAsientosReservados){
            IO.println("No se encuentra esa cantidad de asientos disponibles.");
        }
        else{
            this.lugaresDisponibles -= cantidadAsientosReservados;
            this.lugaresVendidos+= cantidadAsientosReservados;
        }
    }



    // utilizar un get para que la clase hija pueda hacer uso.

    protected String getRECORRIDO_GENERAL() {
        return RECORRIDO_GENERAL;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Vehiculo))
        return false;
        //casting
        Vehiculo vehiculoIngresado= (Vehiculo)obj;
        return Objects.equals(this.PATENTE, vehiculoIngresado.PATENTE)
                && Objects.equals(this.modelo, vehiculoIngresado.modelo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.PATENTE,this.modelo);
    }



}
