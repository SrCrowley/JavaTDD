public interface Expresion {
    Dinero reducir(Banco banco, String a);

    public Expresion mas(Expresion addend);
}
