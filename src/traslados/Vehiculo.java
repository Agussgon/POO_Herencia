package traslados;

public class Vehiculo {
    private String modelo;
    private String patente;
    private String marca;

    //compo
    private Motor motor;

    //constructor
    public Vehiculo(String modelo, String patente, String marca, String modeloMotor, String potenciaMotor) {
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
        this.motor = new Motor(modeloMotor, potenciaMotor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", motor=" + motor +
                '}';
    }

     String getPatente() {
        return patente;
    }
}
