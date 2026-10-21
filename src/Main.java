import traslados.*;

import java.util.ArrayList;

public class Main {


    static void main() {

        //registrar choferes idealmente -->  ingresarían los datos con scanner
//        RegistroChoferes registro= new RegistroChoferes();

        //instancias

        Auto auto1= new Auto("203", "wer123","ford",
                "aer123","400hp","Ezeiza-Liniers",3 );

        IO.println("info del auto sobrescrita "+ auto1);

        Auto autoCopia= new Auto("203", "wer123","ford",
                "aer123","400hp","Ezeiza-Liniers",3 );

        IO.println("son iguales el auto 1 y el auto 2: "+ auto1.equals(autoCopia));



        Combi combi1= new Combi("23", "Der123","ford",
                "ae123","400hp","Ezeiza-Liniers",10,30,5,20);

        //ejemplo de polimorfismo
        Vehiculo vehiculo= new Combi("3", "AAr123","ford",
                "ae123","400hp","Ezeiza-Liniers",10,30,5,20);

        IO.println("recorrido combi");
        vehiculo.consultarRecorrido();


        vehiculo= new Auto("200", "was123","ford",
                "aer123","400hp","Ezeiza-Liniers",3 );


        IO.println("recorrido auto");
        vehiculo.consultarRecorrido();

        //aplico casting para incluir paradas personaliz.
        ((Auto)vehiculo).incluirEstacion("Merlo.");

//        ((Auto)vehiculo).consultarRecorrido();


        Object auto2= new Auto("200", "was123","ford",
                "aer123","400hp","Ezeiza-Liniers",3 );


        Chofer chofer1= new Chofer("Juan", 123,auto1 );
        IO.println("info del chofer sobrescrita "+ chofer1);


        //cargamos los vehiculos
        chofer1.agregarAuto(auto1);
        chofer1.agregarAuto(combi1);
        chofer1.agregarAuto(vehiculo);

        //consultar el recorrido desde el chofer.

        chofer1.consultarRecorridoVehiculos();


        //sobrecarga
        combi1.transportar(2,10);
        combi1.transportar(5);
        combi1.transportar(3,"encomienda 123");



//        registro.registrarChofer(chofer1);
//        IO.println(registro.getChoferes());



    }

}
