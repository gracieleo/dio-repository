package desafioAplicacaoBancaria;

//Classe mãe abstrata pois ninguém deve instanciá-la.
//Banco tem apenas 2 tipos de conta.

import java.util.List;

public abstract class Conta implements IConta{

    //constantes
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //atributos - modificador protected para ter acesso aos filhos
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;


    //construtor
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);              //sacar de uma conta - origem
        contaDestino.depositar(valor); //depositar na outra conta - destino

    }

    protected void imprimirInformacoesDeConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
