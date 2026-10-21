package traslados;

import java.util.ArrayList;

public class RegistroChoferes {

    private ArrayList<Chofer > choferes= new ArrayList<>();

    //constructor implicito


    public void registrarChofer(Chofer chofer){
        if(chofer == null) IO.println("Ingrese un chofer válido para el registro.");
        else if( choferes.contains(chofer) )IO.println("Ya lo tiene registrado.");
        else{
            this.choferes.add(chofer);
        }
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }
}
