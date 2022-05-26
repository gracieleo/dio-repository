package desafioAplicacaoBancaria;

public class AplicacaoBancaria {

    public static void main(String[] args) {

        Cliente anonimo = new Cliente();
        anonimo.setNome("Anonimo");
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");

        System.out.println("As contas iniciam com R$ 100.00");

        Conta contaCorrente = new ContaCorrente(anonimo);
        contaCorrente.depositar(100);

        Conta contaPoupanca = new ContaPoupanca(fulano);
        contaPoupanca.depositar(100);

        System.out.println("Anonimo precisou fazer um pix de R$ 10.00 para Fulano!!!");
        contaCorrente.transferir(10, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
