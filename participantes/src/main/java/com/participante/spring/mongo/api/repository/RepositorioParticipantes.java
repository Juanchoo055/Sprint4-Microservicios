package com.participante.spring.mongo.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.participante.spring.mongo.api.model.Participantes;

@Repository
public interface RepositorioParticipantes extends MongoRepository<Participantes, Integer> {

	List<Participantes> findByNombre(String nombre);

}
