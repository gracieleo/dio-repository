package desafioAplicacaoBancaria;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===== Extrato da sua Conta Corrente =====");
        super.imprimirInformacoesDeConta();
    }


}
