package herencia;

public class EmpleadoPorHoras extends Empleado {

    private double valorHora;
    private double numeroHoras;

    public EmpleadoPorHoras(String nombres, String apellidos, String cedula, double valorHora, double numeroHoras) {
        super(nombres, apellidos, cedula);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double ingresos() {
        return getValorHora() * getNumeroHoras();
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\n%s: $%,.2f %s %,.2f Salario: $%,.2f",
                super.toString(), "Sueldo por hora", getValorHora(), "Horas trabajadas",getNumeroHoras(), ingresos()
                );
    }
}
