package com.investigacion.spring.mongo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.investigacion.spring.mongo.api.VO.Participantes;
import com.investigacion.spring.mongo.api.VO.ResponseTemplateVO;
import com.investigacion.spring.mongo.api.model.Proyectos;
import com.investigacion.spring.mongo.api.repository.RepositorioProyecto;



@Service
public class ServicioProyecto {
	@Autowired
	RepositorioProyecto repositorioProyecto;
	
	@Autowired
	private RestTemplate restTemplate;
	
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
	

}
