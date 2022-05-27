package desafios;

import java.util.Scanner;

/**
 * Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 * A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
 * Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
 * assumem que o resultado da divisão entre dois inteiros é outro inteiro.
 */

public class VolumeEsfera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.println("Valor do raio: ");
        double R = sc.nextDouble() ;   //3.0

        double volume = ( 4 / 3.0 ) * pi * (Math.pow(R, 3.0));   //base = R elevado ao expoente 3  R^3

        System.out.printf("Volume da esfera = %.3f%n", volume);  //113.097

    }
}
