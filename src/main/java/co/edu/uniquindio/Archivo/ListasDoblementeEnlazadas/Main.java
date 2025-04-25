package co.edu.uniquindio.Archivo.ListasDoblementeEnlazadas;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazadaInsertar lista = new ListaDoblementeEnlazadaInsertar();

        lista.insertarEnOrden(10);
        lista.insertarEnOrden(5);
        lista.insertarEnOrden(15);
        lista.insertarEnOrden(7);
        lista.insertarEnOrden(1);

        System.out.println("Lista ordenada:");
        lista.mostrar();  // Esperado: 1 <-> 5 <-> 7 <-> 10 <-> 15

        System.out.println("-------------------------------------------------");

        ListaDoblementeEnlazadaEliminar lista1 = new ListaDoblementeEnlazadaEliminar();

        lista1.insertarEnOrden(10);
        lista1.insertarEnOrden(5);
        lista1.insertarEnOrden(20);
        lista1.insertarEnOrden(15);
        lista1.insertarEnOrden(3);

        System.out.println("Lista ordenada:");
        lista1.mostrar();

        lista1.eliminarDesdeCabeza(10);
        System.out.println("Después de eliminar 10 desde cabeza:");
        lista1.mostrar();

        lista1.eliminarDesdeCola(3);
        System.out.println("Después de eliminar 3 desde cola:");
        lista1.mostrar();
    }
}
