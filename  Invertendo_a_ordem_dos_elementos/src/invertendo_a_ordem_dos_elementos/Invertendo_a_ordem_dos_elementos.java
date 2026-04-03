package invertendo_a_ordem_dos_elementos;

import java.util.ArrayList;

public class Invertendo_a_ordem_dos_elementos {

    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList<>();
        Lista.add(1);
        Lista.add(2);
        Lista.add(3);
        Lista.add(4);
        Lista.add(5);
        Lista.add(6);
        
        System.out.println("Lista normal: " + Lista.toString());
        
        ArrayList<Integer> invertido = new ArrayList<>();

        for (int i = Lista.size() - 1; i >= 0; i--) {
            invertido.add(Lista.get(i));
        }
        System.out.println("Lista invertida: " + invertido);
    }
}
    

