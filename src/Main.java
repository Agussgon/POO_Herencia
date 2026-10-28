

import java.util.ArrayList;

public class Main {


    static void main() {


        Guitarra guitarra= new Guitarra(1,"cuerdas","casa nuñez","cedro");
        Instrumento guitarra2= new Guitarra(1,"","strato","");
        Instrumento guitarra3= new Guitarra(1,"","otra","");

        guitarra.probarSonido();

        IO.println(guitarra.toString()+ " "+   guitarra.equals(guitarra2) );

        //Utilizando la interfaz
        IO.println("consultar utilidad: ");
        Afinable.consultarDescripcion();

        //utilizar el método desde Guitarra
        guitarra.afinar();

        //utilizar el método desde una instancia de instrumento...
        Afinable guitarraAfinada= (Afinable)guitarra2;
        guitarraAfinada.afinar();

        //implementando la interfaz comparable en Instrumento. método sort de Collections...
        Listado listado= new Listado();
        listado.agregarInstrumento(guitarra2);
        listado.agregarInstrumento(guitarra);
        listado.agregarInstrumento(guitarra3);

        //visualizar sin orden
        IO.println( listado.getInstrumentos());

        //ordena
        listado.ordenarListadoInstrumentosPorModelo();

        //visualizar
        IO.println( listado.getInstrumentos());



    }





    }


