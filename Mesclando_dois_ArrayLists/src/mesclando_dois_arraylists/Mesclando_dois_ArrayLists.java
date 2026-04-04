package mesclando_dois_arraylists;

import java.util.ArrayList;

public class Mesclando_dois_ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> Numeros1 = new ArrayList<>();
        Numeros1.add(1);
        Numeros1.add(2);
        Numeros1.add(3);
        Numeros1.add(4);
        
        ArrayList<Integer> Numeros2 = new ArrayList<>();
        Numeros2.add(5);
        Numeros2.add(6);
        Numeros2.add(7);
        Numeros2.add(8);
        
        ArrayList<Integer> juntos = new ArrayList<>();
        juntos.addAll(Numeros1);
        juntos.addAll(Numeros2);
        
        System.out.println("Primeira lista: " + Numeros1.toString());
        System.out.println("Segundo lista: " + Numeros2.toString());
        System.out.println("Terceira lista(A soma das duas listas): " + juntos.toString() );
    }  
}
