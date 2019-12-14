package supermercado;

public class ProductoPrecioVariable extends Producto {
    private String unidadDeMedida;
    private double precioUnidadMedida;
    private double cantidad;

    public ProductoPrecioVariable(String id, String descripcion, double tarifaIva, String unidadDeMedida, double precioUnidadMedida, double cantidad) {
        super(id, descripcion, tarifaIva);
        this.unidadDeMedida = unidadDeMedida;
        this.precioUnidadMedida = precioUnidadMedida;
        this.cantidad = cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public double getPrecioUnidadMedida() {
        return precioUnidadMedida;
    }

    public void setPrecioUnidadMedida(double precioUnidadMedida) {
        this.precioUnidadMedida = precioUnidadMedida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double getValorIva() {
        return getPrecioUnidadMedida()*getCantidad()*getTarifaIva();
    }

    @Override
    public double getValorVenta() {
        return getPrecioUnidadMedida()*getCantidad()+getValorIva();
    }

    @Override
    public String toString() {
        return "ProductoPrecioVariable{" +
                "unidadDeMedida='" + unidadDeMedida + '\'' +
                ", precioUnidadMedida=" + precioUnidadMedida +
                ", cantidad=" + cantidad +
                '}';
    }
}
