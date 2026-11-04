import java.util.Comparator;

public class ComparadorInstrumentoModelo implements Comparator <Instrumento> {


    @Override
    public int compare(Instrumento o1, Instrumento o2) {
        return o1.getModelo().compareToIgnoreCase(o2.getModelo());
    }
}
