package com.proyecto.spring.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.spring.mongo.model.Participantes;

@Repository
public interface RepositorioParticipantes extends MongoRepository<Participantes, Integer> {

	List<Participantes> findByNombre(String nombre);

}
