package co.edu.uniquindio.Archivo.ListasCirculares;

import java.util.Scanner;

public class ProblemaJosephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircularProblema lista = new ListaCircularProblema();

        // Solicitar el número de soldados
        System.out.print("Ingrese el número de soldados (n): ");
        int n = scanner.nextInt();

        // Validar que n sea positivo
        if (n <= 0) {
            System.out.println("El número de soldados debe ser mayor que 0.");
            scanner.close();
            return;
        }

        // Solicitar el número de pasos para eliminación
        System.out.print("Ingrese el número de pasos (k): ");
        int k = scanner.nextInt();

        // Validar que k sea positivo
        if (k <= 0) {
            System.out.println("El número de pasos debe ser mayor que 0.");
            scanner.close();
            return;
        }

        // Crear la lista circular
        lista.crearLista(n);
        System.out.println("Lista inicial de soldados:");
        lista.mostrarLista();

        // Resolver el problema de Josephus
        int sobreviviente = lista.resolverJosephus(k);
        System.out.println("El soldado sobreviviente está en la posición: " + sobreviviente);

        scanner.close();
    }
}