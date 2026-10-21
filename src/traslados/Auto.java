package traslados;

import java.util.ArrayList;

public class Auto extends Vehiculo{

    private ArrayList<String > recorridoPersonalizado;

    public Auto(String modelo, String patente, String marca, String modeloMotor,
                String potenciaMotor, String RECORRIDO_GENERAL, int lugaresDisponibles
               ) {
        super(modelo, patente, marca, modeloMotor, potenciaMotor, RECORRIDO_GENERAL, lugaresDisponibles);
        this.recorridoPersonalizado = new ArrayList<>();
    }

    public void incluirEstacion(String estacionP){
        //validaciones
        recorridoPersonalizado.add(estacionP);
    }

    public ArrayList<String> getRecorridoPersonalizado() {
        return recorridoPersonalizado;
    }

    //sobrescritura
    @Override
    public String consultarRecorrido(){
        return  this.RECORRIDO_GENERAL + " , se incluyen las paradas personalizadas: "+
                this.recorridoPersonalizado;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "recorridoPersonalizado=" + recorridoPersonalizado +
                ", RECORRIDO_GENERAL='" + RECORRIDO_GENERAL + '\'' +
                ", lugaresDisponibles=" + lugaresDisponibles +
                ", lugaresVendidos=" + lugaresVendidos +
                "} " + super.toString();
    }





}
