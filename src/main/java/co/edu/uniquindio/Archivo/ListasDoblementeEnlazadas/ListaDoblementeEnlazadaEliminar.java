package co.edu.uniquindio.Archivo.ListasDoblementeEnlazadas;

public class ListaDoblementeEnlazadaEliminar {

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

        if (cabeza == null) {
            cabeza = cola = nuevo;
            return;
        }

        if (valor < cabeza.dato) {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato < valor) {
            actual = actual.siguiente;
        }

        nuevo.siguiente = actual.siguiente;
        nuevo.anterior = actual;

        if (actual.siguiente != null) {
            actual.siguiente.anterior = nuevo;
        } else {
            cola = nuevo;
        }

        actual.siguiente = nuevo;
    }

    public void eliminarDesdeCabeza(int valor) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                    else cola = null;
                } else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return;
            }
            actual = actual.siguiente;
        }
    }

    public void eliminarDesdeCola(int valor) {
        Nodo actual = cola;

        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                    else cola = null;
                } else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return;
            }
            actual = actual.anterior;
        }
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
