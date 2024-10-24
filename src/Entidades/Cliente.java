package Entidades;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    //Atributos
    private String nome;
    private final List<Conta> contas;

    //Construtora
    public Cliente(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos
    public void adicionarConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.add(conta);
            conta.adicionarCliente(this);
        }
    }

    public void removerConta(Conta conta) {
        if (contas.contains(conta)) {
            contas.remove(conta);
            conta.removerCliente(this);
        }
    }
}