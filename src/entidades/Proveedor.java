package entidades;

import java.util.ArrayList;

public class Proveedor extends Usuario {

    private String categoria;
    private ArrayList<String> servicios;

    //el constructor incluye atributos de la super y la subclase
    public Proveedor(String nombre, String nTel, String categoria, ArrayList<String> servicios) {
        super(nombre, nTel);
        this.categoria = categoria;
        this.servicios=servicios;

    }

    //¿Cómo es que puedo tener dos constructores con el mismo nombre?
    //Sobrecarga la firma es distinta
    public Proveedor(String nombre, String nTel, String categoria) {
        super(nombre, nTel);
        this.categoria = categoria;
    }

   public Proveedor(String nombre, String  tel){
        super(nombre,tel);
   }

}
