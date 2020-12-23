public class Dolar {
    private int monto;

    public Dolar(int monto) {
        this.monto = monto;
    }
    public Dolar veces(int veces){
        return new Dolar(monto*veces);
    }
    public boolean equals(Object object){
        Dolar dolar = (Dolar) object;
        return monto == dolar.monto;
    }
}
