import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplicacion(){
        Dolar cinco = new Dolar(5);
        Dolar producto = cinco.veces(2);
        assertEquals(new Dolar(10), producto);
        producto = cinco.veces(3);
        assertEquals(new Dolar(15), producto);
    }
    @Test
    void testEquals(){
        assertEquals(new Dolar(5), new Dolar(5));
        assertNotEquals(new Dolar(5), new Dolar(7));
    }
}
