package herencia;

public class Main {
    public static void main(String[] args) {

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Martin", "Lopez",
                "1040736226", 2150315.0);
        //System.out.println("empleadoAsalariado = " + empleadoAsalariado);

        EmpleadoPorComision empleadoPorComision = new
                EmpleadoPorComision("Fernando", "Londoño", "1040736225", 125000000.0,
                0.07);
        //System.out.println("empleadoPorComision = " + empleadoPorComision);

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Juan", "Ramirez", "1040736224",
                50000.0, 32);
        //System.out.println("empleadoPorHoras = " + empleadoPorHoras);

        EmpleadoBaseComision empleadoBaseComision = new EmpleadoBaseComision("Carlos", "Guzman",
                "1040736228", 23000000.0, 0.045, 380000.0);

        //System.out.println(empleadoBaseComision);

        Empleado empleados[] = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoBaseComision;
        empleados[2] = empleadoPorHoras;
        empleados[3] = empleadoBaseComision;

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual.getClass());
            System.out.println(empleadoActual);
        }
    }
}
