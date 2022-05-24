package desafios;

import java.util.Scanner;

public class CoxinhaDeBueno {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();

        System.out.println("Insira um número de coxinhas consumidas pelo participante do consurso: ");
        double H = sc.nextInt(); //número de coxinhas
        System.out.println("Insira o número de participantes do concurso: ");
        double P = sc.nextInt();  //número de pessoas

        //String [] inputSplit = input.split("");
        double media = H/P;

        System.out.println("A média de coxinhas consumidas por cada participante é de: ");
        System.out.printf("%.2f", media);

    }
}
