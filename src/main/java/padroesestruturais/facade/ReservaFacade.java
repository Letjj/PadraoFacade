package padroesestruturais.facade;

public class ReservaFacade {

    public static boolean verificarAprovacaoReserva(Reserva reserva) {
        if (Voo.getInstancia().verificarReservaComPendencia(reserva)) {
            return false;
        }
        if (Hotel.getInstancia().verificarReservaComPendencia(reserva)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarReservaComPendencia(reserva)) {
            return false;
        }
        return true;
    }
}