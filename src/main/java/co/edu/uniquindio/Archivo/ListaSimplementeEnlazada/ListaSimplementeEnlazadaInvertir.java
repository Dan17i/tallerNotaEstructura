package co.edu.uniquindio.Archivo.ListaSimplementeEnlazada;

public class ListaSimplementeEnlazadaInvertir {
    private Nodo cabeza;

    private class Nodo {
        Object dato;
        Nodo siguiente;

        public Nodo(Object dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public void agregar(int i) {
        Nodo nuevo = new Nodo(i);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void invertir() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;

        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        cabeza = anterior;
    }

    public void mostrar() {
        Nodo recorrido = cabeza;
        StringBuilder cadena = new StringBuilder();
        while (recorrido != null) {
            cadena.append(recorrido.dato);
            if (recorrido.siguiente != null) {
                cadena.append(" -> ");
            }
            recorrido = recorrido.siguiente;
        }
        System.out.println(cadena);
    }
}