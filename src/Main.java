import traslados.Chofer;
import traslados.RegistroChoferes;
import traslados.Vehiculo;

import java.util.ArrayList;

public class Main {


    static void main() {

        //registrar choferes idealmente -->  ingresarían los datos con scanner
        RegistroChoferes registro= new RegistroChoferes();

        Vehiculo auto1= new Vehiculo("203", "wer123","ford",
                "aer123","400hp" );

        Chofer chofer1= new Chofer("Juan", 123,auto1 );

        registro.registrarChofer(chofer1);
        IO.println(registro.getChoferes());

        chofer1.agregarAuto(new Vehiculo("205", "yer123","ford",
                "a123","450hp"));


    }

}
