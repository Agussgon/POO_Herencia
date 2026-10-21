package entidades;

import java.util.ArrayList;

public class Cliente extends Usuario{

private ArrayList<String> proyectos= new ArrayList<>();

    public Cliente(String nombre, String nTel) {
        super(nombre, nTel);
    }

    public void realizarSolicitud(String proyecto){

}

//cambio el compartamiento del método heredado.... sobrescrita
    @Override
    public String getNombre(){
        return "Datos cliente: "+ this.nombre;  //rec. this.getNombre();
    }


    @Override
    public final void setnTel(String tel){
        this.getnTel()= tel;
    }

}
