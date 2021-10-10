package com.proyecto.spring.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.mongo.model.Proyectos;
import com.proyecto.spring.mongo.repository.RepositorioProyecto;


@Service
public class ServicioProyecto {
	@Autowired
	RepositorioProyecto repositorioProyecto;
	
	public List<Proyectos> getAll() {

		return repositorioProyecto.findAll();
	}
	public Optional<Proyectos> readId(String id) {
		return repositorioProyecto.findById(id);
		
	}
	
	public List<Proyectos> getProyectosByNombre(String nombre) {
		return repositorioProyecto.findByNombreContainingIgnoreCase(nombre);
	}
	public Proyectos addProyecto(Proyectos pro) {
		return repositorioProyecto.insert(pro);
	}
	public Proyectos updateProyecto(Proyectos pro) {
		return repositorioProyecto.save(pro);
	}
	public void delete(String id) {
		
		repositorioProyecto.deleteById(id);
	}
	public Optional<Proyectos> participantes(String id) {
		// TODO Auto-generated method stub

		return repositorioProyecto.participantesId(id);
	}
}
