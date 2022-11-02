package com.devmenthors.api.evento.Api.registro.de.eventos.services;

import com.devmenthors.api.evento.Api.registro.de.eventos.domain.Evento;
import com.devmenthors.api.evento.Api.registro.de.eventos.dto.EventoDTO;
import com.devmenthors.api.evento.Api.registro.de.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServices {
    @Autowired(required = false)
    private EventoRepository eventoRepository;

    public Evento save(EventoDTO eventoDTO){
        Evento event = new Evento();
        event.setId(eventoDTO.getId());
        event.setNome(eventoDTO.getNome());
        event.setDataEvento(eventoDTO.getDataEvento());
        event.setImage(eventoDTO.getImage());
        event.setLocal(eventoDTO.getLocal());
        event.setQtdPessoas(eventoDTO.getQtdPessoas());

        return eventoRepository.save(event);
    }
    public List<Evento> findAll(){
        return eventoRepository.findAll();
    }
}
