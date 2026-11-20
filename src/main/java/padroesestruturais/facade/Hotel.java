package padroesestruturais.facade;

import java.util.HashSet;
import java.util.Set;

public class Hotel {
    private static Hotel instancia;
    private Set<Reserva> reservasPendentes;

    private Hotel() {
        this.reservasPendentes = new HashSet<>();
    }

    public static Hotel getInstancia() {
        if (instancia == null) {
            instancia = new Hotel();
        }
        return instancia;
    }

    public void addReservaPendente(Reserva reserva) {
        reservasPendentes.add(reserva);
    }

    public boolean verificarReservaComPendencia(Reserva reserva) {
        return reservasPendentes.contains(reserva);
    }
}