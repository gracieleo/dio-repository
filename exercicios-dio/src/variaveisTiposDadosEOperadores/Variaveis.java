package variaveisTiposDadosEOperadores;

/** conceituação e criação - aula 01 */

public class Variaveis {

    public static void main(String [] args){

        int i;
        //int i; não podem ter varivaeis com mesmo nome
        int I;
        //int 1a; não pode iniciar com números
        int _1a; //pode mas não é boa prática usar _ e $
        int $aq; //pode mas não é boa prática usar _ e $

        //atribuição de valor inicial
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //valor constante, não muda
        //j = 15;
        int asrn24678md;
        //int asrn246 78md; //não pode conter espaços
        int asrn2$4678_md = 10; //pode mas não é boa prática usar _ e $
        //int asrn2$46%78_md = 10; usa caracter inválido %, @,

        asrn24678md = 100;
        asrn2$4678_md = 10;

        //expressividade de nomes
        int quantidadeProduto = 50;
        //int QuantidadeProduto; //inicia com maiusculo
        final int NUMERO_TENTATIVAS = 5; //constante pode usar letras maiuscula e _
        //final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25; //não segue boa prática, está com nome em maiusculo
        //int qtdProd; pode ser dificil para entender

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
