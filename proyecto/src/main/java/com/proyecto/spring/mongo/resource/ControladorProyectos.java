package com.proyecto.spring.mongo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.mongo.model.Proyectos;
import com.proyecto.spring.mongo.service.ServicioProyecto;

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
	
	@GetMapping("/listaproyectos")
	public List<Proyectos> getProyectosByNombre(@RequestParam(value="nombre") String nombre){
		return servicioProyecto.getProyectosByNombre(nombre);
	}
	
	@PostMapping("/")
	public Proyectos addProyecto(@RequestBody Proyectos pro) {
		
		return servicioProyecto.addProyecto(pro);
		
	}
	
	@PutMapping("/actualizar/{id}")
public Proyectos updateProyecto(@PathVariable String id,@RequestBody Proyectos pro) {
		
		return servicioProyecto.updateProyecto(pro);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		servicioProyecto.delete(id);
	}
	@GetMapping("/listaparticipantes")
	public Optional<Proyectos> participantes(@RequestParam(value="id") String id) {
		return servicioProyecto.participantes(id);
	}
}
