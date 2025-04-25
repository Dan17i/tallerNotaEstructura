package co.edu.uniquindio.Archivo.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {

    ListaSimplementeEnlazadaInvertir lista =  new ListaSimplementeEnlazadaInvertir();

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.println("La lista original es : ");
        lista.mostrar();

        lista.invertir();

        System.out.println("\nLista invertida:");
        lista.mostrar();

        System.out.println("---------------------------------------------------");

        ListaSimplementeEnlazadaIntercalar lista1 = new ListaSimplementeEnlazadaIntercalar();
        ListaSimplementeEnlazadaIntercalar lista2 = new ListaSimplementeEnlazadaIntercalar();

        // Agregar elementos a la lista 1
        lista1.agregar(1);
        lista1.agregar(3);
        lista1.agregar(5);

        // Agregar elementos a la lista 2
        lista2.agregar(2);
        lista2.agregar(4);
        lista2.agregar(6);
        lista2.agregar(7);

        System.out.println("\nLista Lista uno");
        lista1.mostrar();
        System.out.println("\nLista Lista dos");
        lista2.mostrar();

        ListaSimplementeEnlazadaIntercalar listainter = new ListaSimplementeEnlazadaIntercalar();
        listainter = listainter.intercalar( lista1, lista2);

        System.out.println("\nLista Lista intercalada es :");
        listainter.mostrar();

        System.out.println("---------------------------");
    }
}
