public class Banco {
    Dinero reducir(Expresion fuente, String aMoneda){
        return fuente.reducir((aMoneda));
//        if (fuente instanceof Dinero) return (Dinero) fuente;
//        Suma suma = (Suma) fuente;
//        return suma.reducir(aMoneda);
    }

}
