package co.edu.uniquindio.Archivo.ListaSimplementeEnlazada;

public class ListaSimplementeEnlazadaIntercalar {
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

    public  static ListaSimplementeEnlazadaIntercalar intercalar(ListaSimplementeEnlazadaIntercalar l1, ListaSimplementeEnlazadaIntercalar l2) {
        ListaSimplementeEnlazadaIntercalar resultado = new ListaSimplementeEnlazadaIntercalar();

        Nodo actual1 = l1.cabeza;
        Nodo actual2 = l2.cabeza;

        while (actual1 != null || actual2 != null) {
            if (actual1 != null) {
                resultado.agregar((int) actual1.dato);
                actual1 = actual1.siguiente;
            }
            if (actual2 != null) {
                resultado.agregar((int) actual2.dato);
                actual2 = actual2.siguiente;
            }
        }
        return resultado;
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
