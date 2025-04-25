package co.edu.uniquindio.Archivo.ListasCirculares;

public class SimuladorTurnos {
    public static void main(String[] args) {
        ListaCircular juego = new ListaCircular();

        // Agregar jugadores
        juego.agregarJugador("Ana");
        juego.agregarJugador("Bruno");
        juego.agregarJugador("Carlos");
        juego.agregarJugador("Diana");

        System.out.println("Estado inicial:");
        System.out.println(juego.mostrarJugadores());

        // Avanzar algunos turnos
        System.out.println("\nAvanzando 2 turnos:");
        juego.avanzarTurno();
        juego.avanzarTurno();
        System.out.println(juego.mostrarJugadores());

        // Eliminar un jugador
        System.out.println("\nEliminando jugador actual:");
        String eliminado = juego.eliminarJugadorActual();
        System.out.println("Se eliminó a " + eliminado);
        System.out.println(juego.mostrarJugadores());

        // Avanzar más turnos
        System.out.println("\nAvanzando 3 turnos más:");
        for (int i = 0; i < 3; i++) {
            juego.avanzarTurno();
        }
        System.out.println(juego.mostrarJugadores());

        // Eliminar otro jugador
        System.out.println("\nEliminando otro jugador:");
        eliminado = juego.eliminarJugadorActual();
        System.out.println("Se eliminó a " + eliminado);
        System.out.println(juego.mostrarJugadores());
    }
}
