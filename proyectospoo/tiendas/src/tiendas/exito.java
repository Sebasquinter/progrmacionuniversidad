package tiendas;

public class exito extends supermercado {
    private String promocion;

    public exito() {
        super();
    }

    public exito(String promocion) {
        this.promocion = promocion;
    }

    public exito(String promocion, String nombre, int nit, String direccion, int num_clientes) {
        super(nombre, nit, direccion, num_clientes);
        this.promocion = promocion;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    @Override
    public double vender() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double cajero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPromocion: " + this.promocion;
    }
}
