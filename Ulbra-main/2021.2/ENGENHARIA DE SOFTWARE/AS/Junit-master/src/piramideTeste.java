import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class piramideTeste {
    @Test
    public void TestandoCalcularVolume() {

        Piramide piramide = new Piramide(3 * 3, 6);

        int resultado = piramide.calcularVolume();
        assertEquals(18, resultado);
    }
}
