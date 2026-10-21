package entidades;

public class Usuario {

    //cambio la visibilidad para que las subclases lo puedan modificar directamente
    protected String nombre;
    private String nTel;

    public Usuario(String nombre, String nTel) {
        this.nombre = nombre;
        this.nTel = nTel;
    }

    //probar sobrescritura en la clase cliente
    public String getNombre() {
        return nombre;
    }


    public String getnTel() {
        return nTel;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", nTel=" + nTel +
                '}';
    }

    public final void setnTel(String tel){
        if(tel == null || tel.length() != 10 || tel.isBlank()){
            IO.println("No se modificó...");
        }
//        String num= "1234567890";
//        if()
        else{
            this.nTel=tel;
        }



    }
}
