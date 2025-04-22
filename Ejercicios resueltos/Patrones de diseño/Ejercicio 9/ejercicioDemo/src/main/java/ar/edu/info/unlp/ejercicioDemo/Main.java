package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        // Crear una política flexible
        PoliticaCancelacion flexible = new CancelacionFlexible();
        AutoEnAlquiler auto = new AutoEnAlquiler(4, 1000, "Toyota", flexible);

        // Crear un usuario y una reserva
        Usuario gianca = new Usuario("Gianca");
        LocalDate fechaReserva = LocalDate.of(2025, 5, 10);
        Reserva reserva = new Reserva(5, fechaReserva, gianca, auto); // 5 días x $1000 = $5000

        // Fecha tentativa de cancelación
        LocalDate fechaCancelacion = LocalDate.of(2025, 5, 5); // 5 días antes

        // Imprimir reembolso con política flexible
        System.out.println("Reembolso con política flexible: $" + reserva.montoAReembolsar(fechaCancelacion));

        // Cambiar la política a moderada
        PoliticaCancelacion moderada = new CancelacionModerada();
        auto.setPoliticaCancelacion(moderada);

        // Imprimir reembolso con política moderada
        System.out.println("Reembolso con política moderada: $" + reserva.montoAReembolsar(fechaCancelacion));
    }
}
