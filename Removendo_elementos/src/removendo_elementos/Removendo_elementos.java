package removendo_elementos;

import java.util.ArrayList;
import java.util.Scanner;

public class Removendo_elementos {

    public static void main(String[] args) {
        ArrayList<String> Nomes = new ArrayList<>();
        Scanner rem = new Scanner(System.in);
        Nomes.add("Ana");
        Nomes.add("Carlos");
        Nomes.add("Bruna");
        Nomes.add("Daniel");
        Nomes.add("Eduardo");
        
        System.out.println("Escolha um desses nomes para ser removido desa lista: " + Nomes.toString());
        String removerNomes = rem.nextLine();
        
        if (Nomes.contains(removerNomes)) {
            Nomes.remove(removerNomes);
            System.out.println("Nome removido");
        } else {
            System.out.println("Nome não encontrado.");
        }

        System.out.println("Lista atualizada: " + Nomes);
    } 
}
