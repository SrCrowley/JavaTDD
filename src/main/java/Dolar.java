public class Dolar {
    int monto;

    public Dolar(int monto) {
        this.monto = monto;
    }
    public Dolar veces(int veces){
        return new Dolar(monto*veces);
    }
}
