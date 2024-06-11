package br.com.duarte.bancodigital.main;

import br.com.duarte.bancodigital.model.Cliente;
import br.com.duarte.bancodigital.model.ContaCorrente;
import br.com.duarte.bancodigital.model.ContaPoupanca;
import br.com.duarte.bancodigital.model.IConta;

public class Main {
    public static void main(String[] args) {
        Cliente rodrigo = new Cliente("Rodrigo");
        IConta cc = new ContaCorrente(rodrigo);
        IConta poup = new ContaPoupanca(rodrigo);

        cc.depositar(100);
        cc.transferir(55.00, poup);
        cc.imprimirExtrato();


        poup.imprimirExtrato();
    }
}