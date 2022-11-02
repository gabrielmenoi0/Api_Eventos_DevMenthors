package com.devmenthors.api.evento.Api.registro.de.eventos.domain;

import com.devmenthors.api.evento.Api.registro.de.eventos.dto.EventoDTO;

import java.util.Objects;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String image;
    private int qtdPessoas;
    private String nome;
    private String dataEvento;
    private String local;

    public Evento(UUID id, String image, int qtdPessoas, String nome, String dataEvento, String local) {
        this.id = id;
        this.image = image;
        this.qtdPessoas = qtdPessoas;
        this.nome = nome;
        this.dataEvento = dataEvento;
        this.local = local;
    }
    public Evento(EventoDTO eventoDTO) {
        this.image = eventoDTO.getImage();
        this.qtdPessoas = eventoDTO.getQtdPessoas();
        this.nome = eventoDTO.getNome();
        this.dataEvento = eventoDTO.getDataEvento();
        this.local = eventoDTO.getLocal();
    }

    public Evento() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return qtdPessoas == evento.qtdPessoas && id.equals(evento.id) && image.equals(evento.image) && nome.equals(evento.nome) && dataEvento.equals(evento.dataEvento) && local.equals(evento.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, qtdPessoas, nome, dataEvento, local);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getImage() {
        return image;
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
}
