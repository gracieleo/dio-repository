package desafios;

import java.util.Scanner;

public class DegustacaoDeVinho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o tipo de vinho? ");
        String T = sc.nextLine(); //Tipo de vinho ->  1-Cabernet; 2-Merlot; 3-Pinot Noir
        System.out.println("Respostas fornecidas pelos participantes: "); //são 5 participantes
        String respostasCompetidores = sc.nextLine(); //Respostas dadas -> Ex. 1,2,3,4,5  (1<= A,B,C,D,E <=4)

        String [] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;

        //verificar suposições corretas para as respostas da degustação as escuras
        for(int i =0; i < respostasCompetidoresSplit.length; i++){
            if(respostasCompetidoresSplit[i].equals(T));
            count++;
        }

        System.out.println("Número de participantes que deu a resposta correta: ");
        System.out.println(count);

    }
}
