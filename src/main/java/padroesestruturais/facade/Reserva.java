package padroesestruturais.facade;

public class Reserva {

    public boolean confirmarReserva() {
        return ReservaFacade.verificarAprovacaoReserva(this);
    }
}