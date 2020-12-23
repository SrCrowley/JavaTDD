import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void testMultiplicacion(){
        Dolar cinco = new Dolar(5);
        Dolar producto = cinco.veces(2);
        assertEquals(10, producto.monto);
        producto = cinco.veces(3);
        assertEquals(15, producto.monto);
    }
}
