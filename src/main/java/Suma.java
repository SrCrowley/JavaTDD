public class Suma implements Expresion{
    public Expresion augmend;
    public Expresion addmend;

    public Suma(Expresion addmend, Expresion augmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }
    public Dinero reducir(Banco banco, String a){
        int monto = augmend.reducir(banco, a).monto + addmend.reducir(banco, a).monto;
        return new Dinero(monto, a);
    }

    @Override
    public Expresion mas(Expresion addend) {
        return null;
    }
}
