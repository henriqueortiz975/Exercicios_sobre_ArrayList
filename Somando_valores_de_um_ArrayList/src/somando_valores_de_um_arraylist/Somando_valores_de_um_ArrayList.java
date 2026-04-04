package somando_valores_de_um_arraylist;

import java.util.ArrayList;

public class Somando_valores_de_um_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> Numeros = new ArrayList<>();
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);
        Numeros.add(6);
        int soma = 0;
        
        for(int i = 0; i < Numeros.size(); i++){
            soma += Numeros.get(i);
        }
        System.out.println("Lista: " + Numeros.toString());
        System.out.println("A soma dos numeros é " + soma);
    }   
}
