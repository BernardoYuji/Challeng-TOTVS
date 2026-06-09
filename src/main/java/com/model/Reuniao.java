package com.model;
import java.time.LocalDate;

public class Reuniao {
    private int idReuniao;
    private LocalDate data;
    private String transcricao;
    private String sentimento;
    private Interlocutor interlocutor;

    public Reuniao() {}

    public Reuniao(int idReuniao, LocalDate data, String transcricao, String sentimento, Interlocutor interlocutor) {
        this.idReuniao = idReuniao;
        this.data = data;
        this.transcricao = transcricao;
        this.sentimento = sentimento;
        this.interlocutor = interlocutor;
    }

    public int getIdReuniao() {
        return idReuniao;
    }

    public Reuniao setIdReuniao(int idReuniao) {
        this.idReuniao = idReuniao;
        return this;
    }

    public LocalDate getData() {
        return data;
    }

    public Reuniao setData(LocalDate data) {
        this.data = data;
        return this;
    }

    public String getTranscricao() {
        return transcricao;
    }

    public Reuniao setTranscricao(String transcricao) {
        this.transcricao = transcricao;
        return this;
    }

    public String getSentimento() {
        return sentimento;
    }

    public Reuniao setSentimento(String sentimento) {
        this.sentimento = sentimento;
        return this;
    }

    public Interlocutor getInterlocutor() {
        return interlocutor;
    }

    public Reuniao setInterlocutor(Interlocutor interlocutor) {
        this.interlocutor = interlocutor;
        return this;
    }
}
