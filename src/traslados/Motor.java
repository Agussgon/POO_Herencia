package traslados;

class Motor {

    private String modelo;
    private String potencia;

    public Motor(String modelo,String potencia){
        this.modelo=modelo;
        this.potencia=potencia;
    }

    //más adelante lo vemos en detalle
    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + this.modelo + '\'' +
                ", potencia='" + this.potencia + '\'' +
                '}';
    }
}
