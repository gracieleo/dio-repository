package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre
 * os 100 valores lidos.
 */
public class PosicaoValorInteiro {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.println("Insira um valor: ");
            int numero = entrada.nextInt();
            numeros.add(numero);
        }

        Integer max = Collections.max(numeros);
        System.out.println("O maior da lista é: " + max);
        int position = numeros.indexOf(max) +1;
        System.out.println("A posição do maior vaor da da lista é: " + position);
    }


//        int maior = 0;
//        int posicao = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            int num = entrada.nextInt();
//            if (maior > num) {
//                maior = maior;
//                posicao = posicao;
//            } else {
//                posicao = i;
//                maior = num;
//            }
//        }
//        System.out.print(maior + "\n" + posicao + "\n");
//    }

}
