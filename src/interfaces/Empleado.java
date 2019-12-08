package interfaces;

public abstract class Empleado implements PorPagar{

    /*
    Las clases abstractas no permiten crear objetos
    toda clase abstracta tiene como minimo un método abstracto
    */

    //Atributos de la clase
    private String nombres;
    private String apellidos;
    private String cedula;

    public Empleado(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String toString(){
        return String.format("%s %s\nCedula: %s",
                getNombres(),getApellidos(),getCedula());
    }

    public abstract double ingresos();
}
