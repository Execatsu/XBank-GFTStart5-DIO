package me.execatsu;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("XBank");
        Cliente cassius = new Cliente("Cassius", "12325452924");

        Conta cc = new ContaCorrente(cassius, banco);
        Conta poupanca = new ContaPoupanca(cassius, banco);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
