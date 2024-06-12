package br.com.duarte.bancodigital.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<IConta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<IConta> contas) {
        this.contas = contas;
    }

    public void addContaLista(IConta conta) {
        contas.add(conta);
    }

    public String listaDeContas() {
        return "Contas: " + contas;
    }
}
