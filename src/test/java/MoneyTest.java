import org.junit.jupiter.api.Test;

import java.beans.Expression;

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
    @Test
    void testSumaSimple(){
        Dinero cinco = Dinero.dolar(5);
        Expresion suma = cinco.mas(cinco);
        Banco banco = new Banco();
        Dinero reducido = banco.reducir(suma, "USD");
        assertEquals(Dinero.dolar(10), reducido);
    }
    @Test
    void testDevolverSumaMas(){
        Dinero cinco = Dinero.dolar(5);
        Expresion resultado = cinco.mas(cinco);
        Suma suma = (Suma) resultado;
        assertEquals(cinco, suma.augmend);
        assertEquals(cinco, suma.addmend);
    }
    @Test
    void testReducirSuma(){
        Expresion suma = new Suma(Dinero.dolar(3), Dinero.dolar(4));
        Banco banco = new Banco();
        Dinero resultado =  banco.reducir(Dinero.dolar(1), "USD");
        assertEquals(Dinero.dolar(1), resultado);
    }
    @Test
    void testReducirDinero(){
        Banco banco = new Banco();
        Dinero resultado = banco.reducir(Dinero.dolar(1), "USD");
        assertEquals(Dinero.dolar(1), resultado);
    }
}
