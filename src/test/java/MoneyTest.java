import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicacionDolar(){
        Dinero cinco = Dinero.dolar(5);
        assertEquals(Dinero.dolar(10), cinco.veces(2));
        assertEquals(Dinero.dolar(15), cinco.veces(3));
    }
    @Test
    void testEqualsDolar(){
        assertEquals(Dinero.dolar(5), Dinero.dolar(5));
        assertNotEquals(Dinero.dolar(5), Dinero.dolar(7));
        assertNotEquals(Dinero.dolar(5), Dinero.peso(5));
    }
    @Test
    void testMultiplicacionPeso(){
        Dinero cinco = Dinero.peso(5);
        assertEquals(Dinero.peso(10), cinco.veces(2));
        assertEquals(Dinero.peso(15), cinco.veces(3));
    }
    @Test
    void testEqualsPeso(){
        assertEquals(Dinero.peso(5), Dinero.peso(5));
        assertNotEquals(Dinero.peso(5), Dinero.peso(7));
    }
    @Test
    void testMoneda(){
        assertEquals("USD", Dinero.dolar(1).moneda());
        assertEquals("ARP", Dinero.peso(1).moneda());
    }
}
