package Matrices;

import java.util.Random;

public class MatrizCuadrada {
    private int m[][];
    private int n;

    public MatrizCuadrada(int n) {
        this.n = n;
        m = new int[n][n];
        fill();
    }

    private void fill() {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = rd.nextInt(100);
            }
        }
    }


    public String getDiagonalPrincipal() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            aux += m[i][i] + "\t";
        }
        return aux;
    }

    public String getDiagonalSecundaria() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            aux += m[i][n - i - 1] + "\t";
        }
        return aux;
    }

    //Triangular inferior
    public String getTriangularInferior() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                aux += m[i][j] + "\t";
            }
            aux += "\n";
        }
        return aux;
    }

    //Triangular Superior
    public String getTriangularSuperior() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    aux += "\t";
                } else {
                    aux += m[i][j] + "\t";
                }
            }
            aux += "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aux += m[i][j] + "\t";
            }
            aux += "\n";
        }
        return aux;
    }

    public String getPares() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (esPar(m[i][j])) {
                    aux += m[i][j] + "\t";
                }
            }
        }
        return aux;
    }

    public String getImpares() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!esPar(m[i][j])) {
                    aux += m[i][j] + "\t";
                }
            }
        }
        return aux;
    }

    //Obtener Primos
    public String getPrimos() {
        String aux = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (esPrimo(m[i][j])) {
                    aux += m[i][j] + "\t";
                }
            }
        }
        return aux;
    }

    private boolean esPar(int n) {
        return n % 2 == 0;
    }

    private boolean esPrimo(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}