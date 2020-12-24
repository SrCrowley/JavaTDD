public class Suma implements Expresion{
    public Dinero augmend;
    public Dinero addmend;

    public Suma(Dinero addmend, Dinero augmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }
    public Dinero reducir(String a){
        int monto = augmend.monto + addmend.monto;
        return new Dinero(monto, a);
    }
}
