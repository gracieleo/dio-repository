package desafios;

import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
 */

public class MediaAlunos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro nota: ");
        double nota1 = input.nextDouble();   //5.0
        System.out.println("Segunda nota: ");
        double nota2 = input.nextDouble();   //6.0
        System.out.println("Terceira nota: ");
        double nota3 = input.nextDouble();   //7.0


        double media = ((nota1 *  2 ) + (nota2 * 3 ) + (nota3 *  5  )) / (2+3+5); //6.3

        System.out.printf("MEDIA = %.1f", media);

    }
}
