package encontrando_o_maior_e_o_menor_valor;

import java.util.ArrayList;

public class Encontrando_o_maior_e_o_menor_valor {

    public static void main(String[] args) {
        ArrayList<Integer> Numeros = new ArrayList<>();
        Numeros.add(1);
        Numeros.add(2);
        Numeros.add(3);
        Numeros.add(4);
        Numeros.add(5);
        
        int maior = Numeros.get(0);
        int menor = Numeros.get(0);

        for (int num : Numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("Lista: " + Numeros.toString());
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
    

