package com.investigacion.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.investigacion.spring.mongo.api.model.Proyectos;
import com.investigacion.spring.mongo.api.service.ServicioProyecto;

@RestController
@RequestMapping("/proyectos")
public class ControladorProyectos {
	@Autowired
	ServicioProyecto servicioProyecto;
	
	@GetMapping("/")
	public List<Proyectos> getAll(){
		return servicioProyecto.getAll();
	}


	@GetMapping("/{id}")
	public Optional<Proyectos> readId(@PathVariable String id) {
		return servicioProyecto.readId(id);
		
	}
	
	@GetMapping("/lista")
	public List<Proyectos> getProyectosByNombre(@RequestParam(value="nombre") String nombre){
		return servicioProyecto.getProyectosByNombre(nombre);
	}
	
	@PostMapping("/")
	public Proyectos addProyecto(@RequestBody Proyectos pro) {
		
		return servicioProyecto.addProyecto(pro);
		
	}
	
	@PutMapping("/")
public Proyectos updateProyecto(@RequestBody Proyectos pro) {
		
		return servicioProyecto.updateProyecto(pro);
		
	}

}
