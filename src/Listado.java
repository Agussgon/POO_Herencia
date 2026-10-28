import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listado {

    private List <Instrumento> instrumentos = new ArrayList<>();

    public Listado() {

    }

    public void agregarInstrumento(Instrumento instrumento){
        instrumentos.add(instrumento);
    }

    public void ordenarListadoInstrumentosPorModelo(){
        Collections.sort(instrumentos, Collections.reverseOrder());
    }


    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }
}
