package almacen.bebidas.poo.pkg10;

public class AguaMinera extends Bebida {
    
    private String manantial;

    public AguaMinera(String manantial, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.manantial = manantial;
    }

    // Getter y setter
    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    // Método toString para representar el agua mineral como una cadena de texto
    @Override
    public String toString() {
        return super.toString() + "manantial=" + manantial;
    }   
}
