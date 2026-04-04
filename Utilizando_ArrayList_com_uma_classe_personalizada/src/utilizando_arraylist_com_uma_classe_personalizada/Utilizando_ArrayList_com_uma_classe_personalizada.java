package utilizando_arraylist_com_uma_classe_personalizada;

import java.util.ArrayList;

public class Utilizando_ArrayList_com_uma_classe_personalizada {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Henrique", 8.5));
        alunos.add(new Aluno("Rafael", 7.0));
        alunos.add(new Aluno("Veeck", 9.0));
        alunos.add(new Aluno("Arthur", 6.5));
        
        double soma = 0;
        System.out.println("Lista de alunos:");
        
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.getNome() + " | Nota: " + a.getNota());
            soma += a.getNota();
        }
        
        double media = soma / alunos.size();
        System.out.println("Média das notas: " + media);
    }
}
