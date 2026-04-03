package usando_iterator_para_percorrer_um_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Usando_Iterator_para_percorrer_um_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> Numeros = new ArrayList<>();
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);    
        
        Iterator<Integer> it = Numeros.iterator();

        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }   
}
