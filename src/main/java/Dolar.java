public class Dolar extends Dinero {

    private String moneda;
    public Dolar(int monto, String moneda) {
        super(monto, moneda);
    }

    public Dinero veces(int veces){
        return Dinero.dolar(monto*veces);
    }

}
