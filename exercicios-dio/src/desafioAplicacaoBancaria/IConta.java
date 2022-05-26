package desafioAplicacaoBancaria;

//Classe abstrata com todos os métodos abstratos -- CONTRATO
//todos os métodos são públicos
//são assinaturas!!!


public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();

}
