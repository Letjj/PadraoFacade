package padroesestruturais.facade;

import java.util.HashSet;
import java.util.Set;

public class Voo {
    private static Voo instancia;
    private Set<Reserva> reservasPendentes;

    private Voo() {
        this.reservasPendentes = new HashSet<>();
    }

    public static Voo getInstancia() {
        if (instancia == null) {
            instancia = new Voo();
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