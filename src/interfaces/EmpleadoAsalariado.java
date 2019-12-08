package interfaces;

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


    @Override
    public String toString() {
        return "EmpleadoAsalariado{" +
                "salarioSemanal=" + salarioSemanal +
                '}';
    }

    @Override
    public double obtenerMontoPago() {
        return salarioSemanal;
    }
}
