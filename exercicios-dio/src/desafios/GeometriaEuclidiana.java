package desafios;

import java.util.Scanner;

/**
 * Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados
 * tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam.
 * Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular,
 * mostre seu perímetro.*
 */
public class GeometriaEuclidiana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserir dois valores, sendo --> 1º para número de lados da figura -- 2ª para o comprimento dos lados ");
        String N = scan.nextLine(); //lê os dois valores na mesma linha, inserir com espaço simples

        String[] split = N.split(" ");

        int P = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);

        System.out.println("Perímetro da figura (nª lados x comprimento dos lados) = " + P);
    }

}
