package criando_um_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Criando_um_ArrayList {

        public static void main(String[] args) {
        Scanner scINT = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero:");
            int valor = scINT.nextInt();
            numeros.add(valor);
        }
        
        System.out.println("Numeros adicionados:");
        for(int num : numeros){
            System.out.println(num);
        }
    }
}
