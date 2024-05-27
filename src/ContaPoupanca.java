import Contas.Banco;
import Contas.Cliente;
import Contas.Conta;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente,banco);

    }

    public void imprimirInfoComum(){
        System.out.println("Contas.Conta Poupança:");
        imprimirExtrato();
    }

}
