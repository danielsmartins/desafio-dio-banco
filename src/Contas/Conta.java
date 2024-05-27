package Contas;

import Contas.Banco;

public class Conta implements iConta {

    protected Banco banco;
    private static final int  AGENCIA_PADRAO = 001;
    private static  int SEQUENCIAL = 1;
    protected double saldo;
    protected int agencia;
    protected int numeroConta;
    protected Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDesino) {
        this.sacar(valor);
        contaDesino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Contas.Conta ===");
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Contas.Conta: %d", numeroConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
        System.out.println("Banco: " + banco.getNome());
    }
}