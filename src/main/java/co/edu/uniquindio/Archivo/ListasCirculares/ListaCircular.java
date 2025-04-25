package co.edu.uniquindio.Archivo.ListasCirculares;

class ListaCircular {
    private Nodo cabeza;
    private Nodo actual;
    private int tamaño;

    public ListaCircular() {
        this.cabeza = null;
        this.actual = null;
        this.tamaño = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    // Método para agregar un jugador a la lista
    public Nodo agregarJugador(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre);

        if (estaVacia()) {
            // Si la lista está vacía, el nuevo nodo apunta a sí mismo
            nuevoNodo.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
            actual = nuevoNodo;
        } else {
            // Encontrar el último nodo
            Nodo ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }

            // El último apunta al nuevo y el nuevo apunta a la cabeza
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }

        tamaño++;
        return nuevoNodo;
    }

    // Método para avanzar al siguiente turno
    public Nodo avanzarTurno() {
        if (!estaVacia()) {
            actual = actual.siguiente;
            return actual;
        }
        return null;
    }

    // Método para eliminar el jugador actual
    public String eliminarJugadorActual() {
        if (estaVacia()) {
            return null;
        }

        String jugadorEliminado = actual.nombre;

        // Si solo hay un nodo
        if (cabeza.siguiente == cabeza) {
            cabeza = null;
            actual = null;
            tamaño = 0;
            return jugadorEliminado;
        }

        // Encontrar el nodo anterior al actual
        Nodo anterior = cabeza;
        while (anterior.siguiente != actual) {
            anterior = anterior.siguiente;
        }

        // Si estamos eliminando la cabeza, actualizar la cabeza
        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
        }

        // Redirigir el puntero del anterior al siguiente del actual
        anterior.siguiente = actual.siguiente;

        // Actualizar el puntero actual
        actual = actual.siguiente;

        tamaño--;
        return jugadorEliminado;
    }

    // Método para mostrar todos los jugadores y marcar el turno actual
    public String mostrarJugadores() {
        if (estaVacia()) {
            return "La lista está vacía";
        }

        StringBuilder resultado = new StringBuilder();
        Nodo temp = cabeza;

        do {
            if (temp == actual) {
                resultado.append("[").append(temp.nombre).append("]");  // Marcar el jugador actual
            } else {
                resultado.append(temp.nombre);
            }

            temp = temp.siguiente;
            if (temp != cabeza) {
                resultado.append(" -> ");
            }
        } while (temp != cabeza);

        resultado.append(" -> ...");
        return resultado.toString();
    }

    public int getTamaño() {
        return tamaño;
    }
}
