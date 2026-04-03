package copiando_um_arraylist;

import java.util.ArrayList;

public class Copiando_um_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> Nomes = new ArrayList<>();
        Nomes.add("Henrique");
        Nomes.add("Arthur");
        Nomes.add("Pedro");
        Nomes.add("Rafael");
        Nomes.add("Veeck");
        
        System.out.println("Lista Original: " + Nomes.toString());
        ArrayList<String> Copia;
        Copia = (ArrayList<String>) Nomes.clone();
        System.out.println("Lista Copiada: " + Copia.toString());
    }
    
}
