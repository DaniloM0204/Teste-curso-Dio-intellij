
package Desafios_DIO;

public class Main {
    public static void main(String[] args){
        Cliente Danilo = new Cliente();
        Danilo.setNome("Danilo");

        Conta cc = new ContaCorrente(Danilo);
        Conta poupanca = new ContaPoupanca(Danilo);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

