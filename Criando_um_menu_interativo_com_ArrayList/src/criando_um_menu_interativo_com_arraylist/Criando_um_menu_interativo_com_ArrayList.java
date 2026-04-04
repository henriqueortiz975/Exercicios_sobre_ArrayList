package criando_um_menu_interativo_com_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Criando_um_menu_interativo_com_ArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Escreva a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        System.out.println("Tarefas: " + tarefas);
                        System.out.print("Digite o nome da tarefa para remover: ");
                        String remover = scanner.nextLine();

                        if (tarefas.contains(remover)) {
                            tarefas.remove(remover);
                            System.out.println("Tarefa removida");
                        } else {
                            System.out.println("Tarefa não encontrada");
                        }
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada");
                    } else {
                        System.out.println("Lista de tarefas:");
                        for (String t : tarefas) {
                            System.out.println("- " + t);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 4);

        scanner.close();
    }
    
}
