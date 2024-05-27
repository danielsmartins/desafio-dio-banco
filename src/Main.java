
import Contas.Banco;
import Contas.Cliente;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");

        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");

        ContaCorrente cc = new ContaCorrente(daniel, banco);
        ContaPoupanca pp = new ContaPoupanca(daniel, banco);

        cc.depositar(200);
        cc.transferir(100, pp);


        cc.imprimirInfoComum();
        pp.imprimirInfoComum();
    }
}
