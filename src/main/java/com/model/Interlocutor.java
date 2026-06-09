package com.model;

public class Interlocutor {
    private int idInterlocutor;
    private String nome;
    private String email;
    private Cliente cliente;

    public Interlocutor() {}

    public Interlocutor(int idInterlocutor, String nome, String email, Cliente cliente) {
        this.idInterlocutor = idInterlocutor;
        this.nome = nome;
        this.email = email;
        this.cliente = cliente;
    }

    public int getIdInterlocutor() {
        return idInterlocutor;
    }

    public Interlocutor setIdInterlocutor(int idInterlocutor) {
        this.idInterlocutor = idInterlocutor;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Interlocutor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Interlocutor setEmail(String email) {
        this.email = email;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Interlocutor setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }
}
