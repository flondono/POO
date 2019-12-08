package herencia;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombres, String apellidos, String cedula, double salarioSemanal) {
        super(nombres, apellidos, cedula);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    public String toString() {
        /*
        %s: indica un String
        , separado de miles
        .2 numero de decimales*/
        return String.format("Empleado asalariado: %s\n%s: $%,.2f",super.toString(),
        "Salario semanal: ", getSalarioSemanal());
    }
}
