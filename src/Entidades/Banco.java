package Entidades;

import java.util.ArrayList;
import java.util.List;

class Banco {
    //Atributos
    private String nome;
    private final List<Agencia> agencias;

    //Construtora
    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos
    public void adicionarAgencia(Agencia agencia) {
        agencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia) {
        agencias.remove(agencia);
    }
}