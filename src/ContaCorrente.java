import Contas.Banco;
import Contas.Cliente;
import Contas.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente,banco);


    }
    public void imprimirInfoComum(){
        System.out.println("Contas.Conta Corrente:");
        imprimirExtrato();
    }
}
