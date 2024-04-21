package almacen.bebidas.poo.pkg10;

public class BebidaAzucarada extends Bebida {
 
    private double porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(double porcentajeAzucar, boolean promocion, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    // Getters y setters
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
    // Método para calcular el precio si hay promoción
    @Override
    public double getPrecio(){
        if (isPromocion()) {
            return super.getPrecio() * 0.9;
        } else {
            return super.getPrecio();
        }
    }

    // Método toString para representar la bebida azucarada como una cadena de texto
    @Override
    public String toString() {
        return super.toString() + "porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion;
    }
}
