public interface Afinable {

    //public static final
    String NOTA_REFERENCIA= "440 hz";

    // public abstract
    void afinar();

    //también puede tener
    //public
    static void consultarDescripcion(){
        IO.println("Está interfaz permite afinar los != instrumentos.");
    }

    default String getNotaReferencia(){
        return NOTA_REFERENCIA;
    }



}
