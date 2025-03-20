package ej3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpresoraTest {

    @Test
    void testImprimirDobleCaraActivada() {
        boolean impresionDobleCara = true;
        int paginasImpresasIniciales = 0;
        int nivelTonerInicial = 50;

        Impresora impresora = new Impresora(impresionDobleCara, paginasImpresasIniciales, nivelTonerInicial);

        int entrada = 10;
        int salidaEsperada = 5;
        int salidaRecibida = impresora.imprimirPaginas(entrada);

        assertEquals(salidaEsperada, salidaRecibida);
    }
}
