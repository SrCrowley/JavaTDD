import java.beans.Expression;

public class Dinero implements Expresion {
    protected int monto;
    protected String moneda;
    public Dinero(int monto, String moneda){
        this.monto = monto;
        this.moneda = moneda;
    }

    public Dinero veces(int veces){
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
    public Expresion mas(Dinero sumar){
        return new Dinero(monto + sumar.monto, moneda);
    }
}
