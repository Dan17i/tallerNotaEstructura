package co.edu.uniquindio.Archivo.ListasCirculares;

public class ListaCircularProblema {
    private NodoCircular cabeza;
    private int tamaño;

    public ListaCircularProblema() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public void crearLista(int n) {
        if (n <= 0) return;

        cabeza = new NodoCircular(1);
        NodoCircular actual = cabeza;
        tamaño = 1;

        for (int i = 2; i <= n; i++) {
            NodoCircular nuevoNodo = new NodoCircular(i);
            actual.siguiente = nuevoNodo;
            actual = nuevoNodo;
            tamaño++;
        }

        actual.siguiente = cabeza;
    }

    public int resolverJosephus(int k) {
        if (cabeza == null) return -1;
        if (k <= 0) throw new IllegalArgumentException("El valor de k debe ser mayor que 0");
        if (tamaño == 1) return cabeza.posicion;

        NodoCircular actual = cabeza;
        NodoCircular anterior = null;

        if (tamaño > 1) {
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            anterior = actual;
            actual = cabeza;
        }

        while (tamaño > 1) {
            for (int i = 0; i < k - 1; i++) {
                anterior = actual;
                actual = actual.siguiente;
            }

            anterior.siguiente = actual.siguiente;
            System.out.println("Soldado en posición " + actual.posicion + " ha sido eliminado");

            if (actual == cabeza) {
                cabeza = anterior.siguiente;
            }

            actual = anterior.siguiente;
            tamaño--;
        }

        return actual.posicion;
    }
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoCircular actual = cabeza;
        System.out.print("Lista circular: ");
        do {
            System.out.print(actual.getPosicion());
            actual = actual.siguiente;
            if (actual != cabeza) {
                System.out.print(" -> ");
            }
        } while (actual != cabeza);
        System.out.println(" (circular)");
    }
}