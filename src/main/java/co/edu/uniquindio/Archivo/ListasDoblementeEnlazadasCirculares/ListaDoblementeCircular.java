package co.edu.uniquindio.Archivo.ListasDoblementeEnlazadasCirculares;

public class ListaDoblementeCircular {
    private NodoDoble actual;
    private int tamaño;

    public ListaDoblementeCircular() {
        this.actual = null;
        this.tamaño = 0;
    }

    // Insertar al inicio de la lista
    public void insertarInicio(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (tamaño == 0) {
            // Lista vacía: el nodo se conecta a sí mismo
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            actual = nuevo;
        } else {
            // Conectar el nuevo nodo
            NodoDoble ultimo = actual.anterior;
            nuevo.siguiente = actual;
            nuevo.anterior = ultimo;
            actual.anterior = nuevo;
            ultimo.siguiente = nuevo;
            actual = nuevo;
        }
        tamaño++;
    }

    // Insertar al final de la lista
    public void insertarFinal(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (tamaño == 0) {
            // Lista vacía: igual que insertarInicio
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            actual = nuevo;
        } else {
            // Conectar al final (antes de actual)
            NodoDoble ultimo = actual.anterior;
            nuevo.siguiente = actual;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            actual.anterior = nuevo;
        }
        tamaño++;
    }

    // Insertar en una posición específica (1-based)
    public void insertarEn(int pos, int dato) {
        if (pos < 1 || pos > tamaño + 1) {
            System.out.println("Posición inválida");
            return;
        }

        if (pos == 1) {
            insertarInicio(dato);
            return;
        }
        if (pos == tamaño + 1) {
            insertarFinal(dato);
            return;
        }

        NodoDoble nuevo = new NodoDoble(dato);
        NodoDoble temp = actual;
        // Avanzar hasta la posición deseada
        for (int i = 1; i < pos; i++) {
            temp = temp.siguiente;
        }
        // Insertar el nodo
        nuevo.siguiente = temp;
        nuevo.anterior = temp.anterior;
        temp.anterior.siguiente = nuevo;
        temp.anterior = nuevo;
        tamaño++;
    }

    // Mostrar la lista en sentido horario
    public void mostrarLista() {
        if (tamaño == 0) {
            System.out.println("Lista vacía");
            return;
        }
        NodoDoble temp = actual;
        System.out.print("Lista circular: ");
        do {
            System.out.print(temp.getDato());
            temp = temp.siguiente;
            if (temp != actual) {
                System.out.print(" <-> ");
            }
        } while (temp != actual);
        System.out.println(" (circular)");
    }
}
