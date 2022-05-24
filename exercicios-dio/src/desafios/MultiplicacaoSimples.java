package desafios;

import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B, PROD;

        System.out.println("Insira um número inteiro: ");
        A = sc.nextInt();
        System.out.println("Insira outro número inteiro: ");
        B = sc.nextInt() ;


        PROD = A * B;

        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
