import java.util.HashMap;

public class Banco {

    private HashMap<Par, Integer> mapaTasa = new HashMap<>();

    Dinero reducir(Expresion fuente, String aMoneda){
        return fuente.reducir(this, aMoneda);
//        if (fuente instanceof Dinero) return (Dinero) fuente;
//        Suma suma = (Suma) fuente;
//        return suma.reducir(aMoneda);
    }

    public void addTasa(String desde, String a, int tasa) {
        mapaTasa.put(new Par(desde, a), tasa);
    }

    public int tasa(String desde, String a) {
        if(desde.equals(a))
            return 1;
        return mapaTasa.get(new Par(desde, a));
//        return (desde.equals("ARP") && a.equals("USD")) ? 200 : 1;
    }
}
