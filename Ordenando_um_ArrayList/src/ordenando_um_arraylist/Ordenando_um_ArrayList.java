package ordenando_um_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ordenando_um_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int valor = random.nextInt(100) + 1;
            numeros.add(valor);
        }
        
        System.out.println("Lista: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista com ordem crescente: " + numeros);
    }  
}
