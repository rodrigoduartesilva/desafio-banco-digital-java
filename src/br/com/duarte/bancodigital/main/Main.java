package br.com.duarte.bancodigital.main;

import br.com.duarte.bancodigital.model.*;

public class Main {
    public static void main(String[] args) {
        Banco listaContas = new Banco();
        Cliente novoCliente = new Cliente("Rodrigo Duarte");
        IConta contaCorrente = new ContaCorrente(novoCliente);
        IConta contaPoupanca = new ContaPoupanca(novoCliente);

        listaContas.addContaLista(contaCorrente);

        contaCorrente.depositar(100);
        contaCorrente.transferir(55.00, contaPoupanca);

        System.out.println(listaContas.listaDeContas());

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}