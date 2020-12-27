import java.beans.Expression;

public class Dinero implements Expresion {
    protected int monto;
    protected String moneda;


    public Dinero(int monto, String moneda){
        this.monto = monto;
        this.moneda = moneda;
    }

    public Expresion veces(int veces){
        return new Dinero(this.monto * veces, this.moneda);
    }

    protected String moneda(){
        return moneda;
    }

    public static Dinero dolar(int monto){
        return new Dolar(monto, "USD");
    }

    public static Dinero peso(int monto){
        return new Peso(monto, "ARP");
    }

    public boolean equals(Object object){
        Dinero dinero = (Dinero) object;
        return monto == dinero.monto && this.moneda.equals(dinero.moneda);
    }

    @Override
    public Dinero reducir(Banco banco, String a){
//        return this;
//        int tasa = (moneda.equals("ARP") && a.equals("USD") ? 200 : 1);
        return new Dinero(monto / banco.tasa(this.moneda, a), a);
    }

    public Expresion mas(Expresion addend){
        return new Suma(this, addend);
    }
}
