package com.devmenthors.api.evento.Api.registro.de.eventos.repository;

import com.devmenthors.api.evento.Api.registro.de.eventos.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {
}
