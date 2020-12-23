import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicacionDolar(){
        Dolar cinco = new Dolar(5);
        Dolar producto = cinco.veces(2);
        assertEquals(new Dolar(10), producto);
        producto = cinco.veces(3);
        assertEquals(new Dolar(15), producto);
    }
    @Test
    void testEqualsDolar(){
        assertEquals(new Dolar(5), new Dolar(5));
        assertNotEquals(new Dolar(5), new Dolar(7));
    }
    @Test
    void testMultiplicacionPeso(){
        Peso cinco = new Peso(5);
        Peso producto = cinco.veces(2);
        assertEquals(new Peso(10), producto);
        producto = cinco.veces(3);
        assertEquals(new Peso(15), producto);
    }
    @Test
    void testEqualsPeso(){
        assertEquals(new Peso(5), new Peso(5));
        assertNotEquals(new Peso(5), new Peso(7));
    }
}
