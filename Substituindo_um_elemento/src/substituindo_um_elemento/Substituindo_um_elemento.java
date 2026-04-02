package substituindo_um_elemento;

import java.util.ArrayList;
import java.util.Scanner;

public class Substituindo_um_elemento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Salvador");
        
        System.out.println("Lista: " + cidades.toString());
        System.out.print("Digite a cidade que deseja substituir: ");
        String cidadeAntiga = scanner.nextLine();

        if (cidades.contains(cidadeAntiga)) {
            int indice = cidades.indexOf(cidadeAntiga);
            System.out.print("Digite a nova cidade: ");
            String cidadeNova = scanner.nextLine();
            cidades.set(indice, cidadeNova);
        } else {
            System.out.println("Cidade não encontrada.");
        }
        System.out.println("Lista atualizada: " + cidades.toString());
    } 
}
