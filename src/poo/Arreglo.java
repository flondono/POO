package poo;

public class Arreglo {

    //atributos de la clase
    private int arr[];
    private int n;
    private int tope;


    /*
    Los constructores siempre deben ser publicos, no tiene sentido un que sea privado
    No tienen tipo de retorno
    al definir un constructor se pierde el constructor vacio
    */
    public Arreglo(int n) {
        this.n = n;
        //instancias el arreglo
        arr = new int[n];
        tope = 0;
    }

    public Arreglo(int a[]) {
        arr = a;
        n = arr.length;
        tope = n;
    }

    private boolean isFull() {
        return tope == n;
    }

    private boolean isEmpty() {
        return tope == 0;
    }

    public boolean add(int num) {
        if (isFull()) {
            return false;
        }
        arr[tope] = num;
        tope++;
        return true;
    }

    public boolean add(int num, int pos) {
        if (isFull()) {
            return false;
        }

        if (pos > tope) {
            return false;
        }

        for (int i = tope; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = num;
        tope++;
        return true;
    }

    public String toString() {
        String aux = "";
        for (int i = 0; i < tope; i++) {
           aux = aux + arr[i] + "\t";
        }
        return aux;
    }
}
