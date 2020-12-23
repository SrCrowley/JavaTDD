public class Moneda {
    protected int monto;

    public boolean equals(Object object){
        Moneda moneda = (Moneda) object;
        return monto == moneda.monto;
    }
}
