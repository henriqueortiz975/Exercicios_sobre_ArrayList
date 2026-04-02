package removendo_elementos_repetidos;

import java.util.ArrayList;
import java.util.HashSet;

public class Removendo_elementos_repetidos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(67);
        numeros.add(20);
        numeros.add(234);
        numeros.add(3);
        numeros.add(345);
        numeros.add(67);

        System.out.println("Lista: " + numeros);
        HashSet<Integer> conjunto = new HashSet<>(numeros);
        numeros = new ArrayList<>(conjunto);
        System.out.println("Lista sem duplicados: " + numeros);
    }
    
}
