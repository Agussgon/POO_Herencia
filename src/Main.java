import traslados.*;

import java.util.ArrayList;

public class Main {


    static void main() {

        //registrar choferes idealmente -->  ingresarían los datos con scanner
         RegistroChoferes registro= new RegistroChoferes();

        //instancias

        Auto auto1= new Auto("203", "wer123","ford",
                "aer123","400hp","Ezeiza-Liniers",3 );
       // IO.println("info del auto sobrescrita "+ auto1);

        Chofer chofer1= new Chofer("Pablo",12,auto1);

        Chofer chofer2= new Chofer("Pablo",12,auto1);


        registro.registrarChofer(chofer1);
        registro.registrarChofer(chofer2);


        IO.println("el registro queda: "+ registro.getChoferes());
        IO.println("El hashcode de la misma persona en otra referencia..."+
                chofer1.hashCode()+"  el otro"+
                chofer2.hashCode());

        Vehiculo vehiculoJuego= new Combi("203", "wer123","ford",
                "aer123","400hp","Ezeiza-Liniers",3,20,5,40);

        //Método que trae de la super clase Vehiculo....
        vehiculoJuego.getPATENTE();

        //un método específico de Combi...casting
        ((Combi)vehiculoJuego).transportar(10);
         vehiculoJuego = new Vehiculo("203", "wer123","ford",
                 "aer123","400hp","Ezeiza-Liniers",6);

    }

}
