public interface Expresion {
    Dinero reducir(Banco banco, String a);

    Expresion mas(Expresion addend);

    Expresion veces(int veces);
}
