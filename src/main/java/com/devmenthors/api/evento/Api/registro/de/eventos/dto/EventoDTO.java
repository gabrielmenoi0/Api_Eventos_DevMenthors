package com.devmenthors.api.evento.Api.registro.de.eventos.dto;

import java.util.Date;
import java.util.UUID;

public class EventoDTO {
    private String image;
    private UUID Id;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    private int qtdPessoas;
    private String nome;
    private String dataEvento;

    public String getImage() {
        return image;
    }

    public EventoDTO(String image, int qtdPessoas, String nome, String dataEvento, String local) {
        this.image = image;
        this.qtdPessoas = qtdPessoas;
        this.nome = nome;
        this.dataEvento = dataEvento;
        this.local = local;
    }

    public EventoDTO() {
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    private String local;
}
