package co.edu.uniquindio.Archivo.ListasDoblementeEnlazadas;

public class ListaDoblementeEnlazadaInsertar {
    private Nodo cabeza;
    private Nodo cola;

    private class Nodo {
        int dato;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    public void insertarEnOrden(int valor) {
        Nodo nuevo = new Nodo(valor);

        // Caso 1: lista vacía
        if (cabeza == null) {
            cabeza = cola = nuevo;
            return;
        }

        // Caso 2: insertar al inicio
        if (valor < cabeza.dato) {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
            return;
        }

        // Caso 3: insertar en el medio o al final
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato < valor) {
            actual = actual.siguiente;
        }

        // Insertar después de 'actual'
        nuevo.siguiente = actual.siguiente;
        nuevo.anterior = actual;
        if (actual.siguiente != null) {
            actual.siguiente.anterior = nuevo;
        } else {
            // Si es el último
            cola = nuevo;
        }
        actual.siguiente = nuevo;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) System.out.print(" <-> ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
