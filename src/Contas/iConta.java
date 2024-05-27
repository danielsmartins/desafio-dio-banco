package Contas;

import Contas.Conta;

public interface iConta {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDesino);
     void imprimirExtrato();
}
