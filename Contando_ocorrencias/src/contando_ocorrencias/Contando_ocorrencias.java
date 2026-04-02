package contando_ocorrencias;

import java.util.ArrayList;
import java.util.Scanner;

public class Contando_ocorrencias {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        System.out.print("Quantas palavras deseja colocar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("escreva uma palavra: ");
            String palavra = scanner.nextLine();
            palavras.add(palavra);
        }

        System.out.print("escreva a palavra que deseja contar: ");
        String busca = scanner.nextLine();
        int contador = 0;
        for (String p : palavras) {
            if (p.equals(busca)) {
                contador++;
            }
        }
        System.out.println("A palavra '" + busca + "' aparece " + contador + " vezes.");
    } 
}
