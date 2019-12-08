package interfaces;

public class Main {
    public static void main(String[] args) {

        PorPagar objetosPorPagar[] = new PorPagar[4];
        objetosPorPagar[0] = new EmpleadoAsalariado("Fernando","Londoño", "1040736225", 825000.0);

        for (PorPagar porPagarActual:objetosPorPagar
             ) {
            System.out.println(porPagarActual);
        }
    }
}
