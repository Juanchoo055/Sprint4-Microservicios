package com.proyecto.spring.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.spring.mongo.model.Participantes;
import com.proyecto.spring.mongo.repository.RepositorioParticipantes;

@Service
public class ServicioParticipantes {
	@Autowired
	RepositorioParticipantes repositorioParticipantes;
	
	@Autowired
	ServicioParticipantes servicioParticipantes;
	public List<Participantes> getAll() {
		// TODO Auto-generated method stub
		return repositorioParticipantes.findAll();
	}

	public Optional<Participantes> readId(int id) {

		return repositorioParticipantes.findById(id);
	}

	public List<Participantes> getParticipantesByNombre(String nombre) {

		return repositorioParticipantes.findByNombre(nombre);
	}

	public Participantes addParticipante(Participantes pro) {

		return repositorioParticipantes.insert(pro);
	}

	public Participantes updateParticipante(Participantes pro) {

		return repositorioParticipantes.save(pro);
		
	}
}
