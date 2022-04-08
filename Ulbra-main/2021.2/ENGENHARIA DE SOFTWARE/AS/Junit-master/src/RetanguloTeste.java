import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RetanguloTeste {
    @Test
    public void TestandoCalcularArea() {

        Retangulo retangulo = new Retangulo(5,6,0);

        int resultado= retangulo.calcularArea();
        assertEquals(30,resultado);

    }
    @Test
    public void TestandoCalcularPerimetro() {

        Retangulo retangulo = new Retangulo(5,6,0);

        int resultado= retangulo.calcularPerimetro();
        Assert.assertEquals(22,resultado);
    }
    @Test
    public void TestandoCalcularVolume() {
        Retangulo retangulo = new Retangulo(5,3,6);

        int resultado= retangulo.calcularVolume();
        Assert.assertEquals(90,resultado);
    }
}




