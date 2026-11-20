package padroesestruturais.facade;

import java.util.HashSet;
import java.util.Set;

public class Pagamento {
    private static Pagamento instancia;
    private Set<Reserva> reservasPendentes;

    private Pagamento() {
        this.reservasPendentes = new HashSet<>();
    }

    public static Pagamento getInstancia() {
        if (instancia == null) {
            instancia = new Pagamento();
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
