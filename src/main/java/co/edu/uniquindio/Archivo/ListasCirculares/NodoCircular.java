package co.edu.uniquindio.Archivo.ListasCirculares;

public class NodoCircular {
    int posicion;
    NodoCircular siguiente;

    public NodoCircular(int posicion) {
        this.posicion = posicion;
        this.siguiente = null;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
}