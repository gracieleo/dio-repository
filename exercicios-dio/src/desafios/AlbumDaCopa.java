package desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual número total de figurinhas do albúm: ");
        int numTotal = sc.nextInt(); // (1<= N <= 100)

        System.out.println("Quantas figurinhas foram compradas: ");
        int numFigCompradas = sc.nextInt(); //(1<= M <= 300)

        Set<Integer> setFig = new HashSet<>();

        System.out.println("Quais figurinhas você já tem (insira o número)? ");
        for(int i = 1; i <= numFigCompradas; i++){
            setFig.add(sc.nextInt());
        }

        System.out.println("Quantas figurinhas faltam para completar o albúm: ");
        System.out.println(numTotal - setFig.size());

    }
}
