import entidades.Cliente;
import entidades.Proveedor;
import entidades.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Proveedor proveedor1= new Proveedor("Juan","1234567890","pastelería");

    Integer num1= Integer.valueOf("123");

    Usuario cliente1= new Cliente("Flor","123");
    IO.println(cliente1.getNombre());

}
