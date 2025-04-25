package co.edu.uniquindio.Archivo.ListasDoblementeEnlazadasCirculares;


public class Principal {
    public static void main(String[] args) {
        ListaDoblementeCircular lista = new ListaDoblementeCircular();

        // Probar insertarInicio
        System.out.println("Insertando 3 al inicio:");
        lista.insertarInicio(3);
        lista.mostrarLista();

        System.out.println("\nInsertando 1 al inicio:");
        lista.insertarInicio(1);
        lista.mostrarLista();

        // Probar insertarFinal
        System.out.println("\nInsertando 5 al final:");
        lista.insertarFinal(5);
        lista.mostrarLista();

        // Probar insertarEn
        System.out.println("\nInsertando 2 en la posición 2:");
        lista.insertarEn(2, 2);
        lista.mostrarLista();

        System.out.println("\nInsertando 6 en la posición 5 (final):");
        lista.insertarEn(5, 6);
        lista.mostrarLista();

        System.out.println("\nIntentando insertar en posición inválida (7):");
        lista.insertarEn(7, 7);
        lista.mostrarLista();
    }
}
