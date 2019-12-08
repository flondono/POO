package Matrices;

public class Main {
    public static void main(String[] args) {
        MatrizCuadrada mat = new MatrizCuadrada(5);
        System.out.println("Matriz original");
        System.out.println(mat);
        System.out.println("Diagonal Principal");
        System.out.println(mat.getDiagonalPrincipal());
        System.out.println("Diagonal secundaria");
        System.out.println(mat.getDiagonalSecundaria());
        System.out.println("Triangular Inferior");
        System.out.println(mat.getTriangularInferior());
        System.out.println("Triangular superior");
        System.out.println(mat.getTriangularSuperior());
        System.out.println("Pares");
        System.out.println(mat.getPares());
        System.out.println("Impares");
        System.out.println(mat.getImpares());
        System.out.println("Primos");
        System.out.println(mat.getPrimos());
    }
}
