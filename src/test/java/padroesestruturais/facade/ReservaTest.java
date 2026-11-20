package padroesestruturais.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveRetornarPendenciaVoo() {
        Reserva reserva = new Reserva();
        Voo.getInstancia().addReservaPendente(reserva);

        assertEquals(false, reserva.confirmarReserva());
    }

    @Test
    void deveRetornarPendenciaHotel() {
        Reserva reserva = new Reserva();
        Hotel.getInstancia().addReservaPendente(reserva);

        assertEquals(false, reserva.confirmarReserva());
    }

    @Test
    void deveRetornarPendenciaPagamento() {
        Reserva reserva = new Reserva();
        Pagamento.getInstancia().addReservaPendente(reserva);

        assertEquals(false, reserva.confirmarReserva());
    }

    @Test
    void deveRetornarReservaSemPendencia() {
        Reserva reserva = new Reserva();

        assertEquals(true, reserva.confirmarReserva());
    }
}
