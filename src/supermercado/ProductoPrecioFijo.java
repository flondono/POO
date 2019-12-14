package supermercado;

public class ProductoPrecioFijo extends Producto {

    private double precio;

    public ProductoPrecioFijo(String id, String descripcion, double tarifaIva, double precio) {
        super(id, descripcion, tarifaIva);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public double getValorIva() {
        return getPrecio() * getTarifaIva();
    }

    @Override
    public double getValorVenta() {
        return getPrecio() + getValorIva();
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoPrecioFijo{" +
                "precio=" + precio +
                "Valor IVA=" + getValorIva() +
                "Tarifa IVA" + getTarifaIva() + '}'
                ;
    }
}
