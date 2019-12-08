package herencia;

public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombres, String apellidos, String cedula, double ventasBrutas, double tarifaComision) {
        super(nombres, apellidos, cedula);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double ingresos() {
        return getVentasBrutas() * getTarifaComision();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s $%,.2f; %s: %,.2f Ingresos: $%,.2f",
                "Empleado por Comisión", super.toString(),
                "Ventas brutas", getVentasBrutas(),
                "Tarifa comisión", getTarifaComision(), ingresos());
    }
}