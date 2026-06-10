package com.model;
import java.time.LocalDate;

public class Reuniao {
    private int idReuniao;
    private LocalDate data;
    private String transcricao;
    private String sentimento;
    private Interlocutor interlocutor; // FK para Interlocutor

    public Reuniao() {}

    public int getIdReuniao() { return idReuniao; }
    public Reuniao setIdReuniao(int idReuniao) { this.idReuniao = idReuniao; return this; }

    public LocalDate getData() { return data; }
    public Reuniao setData(LocalDate data) { this.data = data; return this; }

    public String getTranscricao() { return transcricao; }
    public Reuniao setTranscricao(String transcricao) { this.transcricao = transcricao; return this; }

    public String getSentiment() { return sentimento; } // Mapeado como TP_REU_SENTIMENTO
    public Reuniao setSentimento(String sentimento) { this.sentimento = sentimento; return this; }

    public Interlocutor getInterlocutor() { return interlocutor; }
    public Reuniao setInterlocutor(Interlocutor interlocutor) { this.interlocutor = interlocutor; return this; }
}