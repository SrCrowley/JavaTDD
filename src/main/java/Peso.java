public class Peso extends Moneda{

    public Peso(int monto) {
        this.monto = monto;
    }
    public Peso veces(int veces){
        return new Peso(monto*veces);
    }

}
