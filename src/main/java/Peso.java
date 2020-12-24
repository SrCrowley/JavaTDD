public class Peso extends Dinero {
    public Peso(int monto, String moneda) {
        super(monto, moneda);
    }

    public Dinero veces(int veces){
        return Dinero.peso(monto*veces);
    }

}
