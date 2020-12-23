public class Peso {
    private int monto;

    public Peso(int monto) {
        this.monto = monto;
    }
    public Peso veces(int veces){
        return new Peso(monto*veces);
    }
    public boolean equals(Object object){
        Peso peso = (Peso) object;
        return monto == peso.monto;
    }

}
