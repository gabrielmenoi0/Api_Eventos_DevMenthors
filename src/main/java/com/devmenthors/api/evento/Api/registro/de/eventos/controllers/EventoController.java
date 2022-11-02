package com.devmenthors.api.evento.Api.registro.de.eventos.controllers;

import com.devmenthors.api.evento.Api.registro.de.eventos.domain.Evento;
import com.devmenthors.api.evento.Api.registro.de.eventos.dto.EventoDTO;
import com.devmenthors.api.evento.Api.registro.de.eventos.services.EventoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventoController {
    @Autowired
    private EventoServices services;

    @PostMapping(path = "api/evento/create")
    public ResponseEntity<Evento> create(@RequestBody EventoDTO eventoDTO){
        return ResponseEntity.status(HttpStatus.OK).body(services.save(eventoDTO));
    }

    @GetMapping(path = "api/evento/listEventos")
    public ResponseEntity<List<Evento>> eventos(){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }
}
