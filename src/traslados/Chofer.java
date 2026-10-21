package traslados;

import java.util.ArrayList;

public class Chofer {

    private String nombre;
    private final int N_REGISTRO;
    private ArrayList<Vehiculo> autos= new ArrayList<>();

    //instancias independendientes
    public Chofer(String nombre, int n_REGISTRO, Vehiculo auto) {
        this.nombre = nombre;
        this.N_REGISTRO = n_REGISTRO;
        this.autos.add(auto);
    }

//agregar --> que no sea nulo || hasta 3 || no repetido
    public void agregarAuto(Vehiculo autoNuevo){
        if(autoNuevo == null) IO.println("Ingrese un auto válido para el registro.");
        else if(autos.size() == 3 ) IO.println("Superaría la cantidad de autos asociados.");
        else if( autos.contains(autoNuevo) )IO.println("Ya tiene ese vehiculo registrado.");
        else autos.add(autoNuevo);
    }

    //eliminar

    public void desasociarAuto(Vehiculo auto){
        IO.println("La lista contiene al auto? " +this.autos.contains(auto));
        IO.println("elimina? "+this.autos.remove(auto));
    }

    //consultar los autos
    public ArrayList<Vehiculo> getAutos(){
        return this.autos;
    }

    //consultar por una patente
    public void consultarPatenteAsociada(String patente){
        if(patente == null || patente.isBlank() || patente.length() != 6){
            IO.println("No ingreso una patente válida.");
        }else {
            boolean loEncuentra=false;
            for (int i = 0; i < this.autos.size(); i++) {
                if (this.autos.get(i).getPatente().equals(patente)) {
                    IO.println("Se encontró esa patente asociada al chofer, los datos del " +
                            "auto son: " + this.autos.get(i));
                    loEncuentra= true;
                    break;
                }
            }
            if (loEncuentra == false){
                IO.println("No tiene esa patente asociada.");
            }
        }
    }

    //ver solo las patentes asociadas

    public void visualizarPatentesAsociadas(){
    IO.println("Se visualizan las patentes asociadas: ");
//        for(Vehiculo auto: this.autos){
//            IO.println(auto.getPatente());
//        }
        this.autos.forEach(auto-> IO.println(auto.getPatente()));

    }


    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", N_REGISTRO=" + N_REGISTRO +
                ", autos=" + this.autos +
                '}';
    }
}
