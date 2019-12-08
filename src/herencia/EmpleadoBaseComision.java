package herencia;

public class EmpleadoBaseComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseComision(String nombres, String apellidos, String cedula, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombres, apellidos, cedula, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double ingresos() {
        return super.ingresos() + getSalarioBase();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s $%,.2f", "Con salario base ",
                super.toString(), "Salario base", getSalarioBase()
        );
    }
}
