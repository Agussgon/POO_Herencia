import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listado {

    private List <Instrumento> instrumentos = new ArrayList<>();
    private List <Afinable> afinables=new ArrayList<>();


    public Listado() {

    }

    public void agregarInstrumento(Instrumento instrumento){

        instrumentos.add(instrumento);
    }

    public void afinarInstrumentos(){
        instrumentos.forEach(instrumento -> {
            if(instrumento instanceof Afinable) {
                ((Afinable) instrumento).afinar();
            }
        });
    }

    public void afinarAfinables(){
        for (int i = 0; i < this.afinables.size() ; i++) {
            Afinable a= afinables.get(i);
            a.afinar();
        }
    }

    public void ordenarListadoInstrumentosPorCodigo(){
        Collections.sort(instrumentos, Collections.reverseOrder());
    }

    public void ordenarInstrumentosPorModeloComparator(){
       //instrumentos.sort(new ComparadorInstrumentoModelo());
        instrumentos.sort((o1,o2)-> o1.getModelo().compareToIgnoreCase(o2.getModelo()));

    }

    public void ordenarFamilia(){
        instrumentos.sort((o1,o2)-> o1.getFamilia().compareToIgnoreCase(o2.getFamilia()));

    }
    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void verInfoPorModeloInstrumentos(String modelo){
        if(modelo == null || modelo.isBlank()) {
            IO.println("Ingrese un modelo válido.");
            return  ;
        }

        //} else {
            for( Instrumento inst: this.instrumentos){
                if(inst.getModelo().equals(modelo)){
                    IO.println("Info de ese modelo: "+ inst.toString());
                }
          //  }
        }

    }

}
