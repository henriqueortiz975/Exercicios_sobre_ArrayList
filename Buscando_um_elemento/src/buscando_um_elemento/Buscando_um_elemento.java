package buscando_um_elemento;

import java.util.ArrayList;
import java.util.Scanner;

public class Buscando_um_elemento {

    public static void main(String[] args) {
        ArrayList<String> Produtos = new ArrayList<>();
        Scanner ProcurarNome = new Scanner(System.in);
        Produtos.add("Mouse");
        Produtos.add("Teclado");
        Produtos.add("Computador");
        Produtos.add("Notebook");
        Produtos.add("Celular");
        
        System.out.println("Qual você deseja comprar? " + Produtos.toString());
        String NomeProduto = ProcurarNome.nextLine();
        
        if (Produtos.contains(NomeProduto)) {
            System.out.println("Produto encontrado");
        } else {
            System.out.println("Produto não encontrado");
        }
    } 
}
