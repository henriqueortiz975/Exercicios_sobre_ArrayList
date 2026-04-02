/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removendo_elementos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Removendo_elementos {

    /**
     * @param args the command line arguments
     */
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
