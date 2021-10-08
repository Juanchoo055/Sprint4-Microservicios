package com.participante.spring.mongo.api.resource;

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

import com.participante.spring.mongo.api.model.Participantes;
import com.participante.spring.mongo.api.service.ServicioParticipantes;

@RestController
@RequestMapping("/participantes")
public class ControladorParticipantes {
	@Autowired
	ServicioParticipantes servicioParticipantes;
	
	@GetMapping("/")
	public List<Participantes> getAll(){
		return servicioParticipantes.getAll();
	}
	@GetMapping("/{id}")
	public Optional<Participantes> readId(@PathVariable int id) {
		return servicioParticipantes.readId(id);
		
	}
	
	@GetMapping("/lista")
	public List<Participantes> getParticipantesByNombre(@RequestParam(value="nombre") String nombre){
		return servicioParticipantes.getParticipantesByNombre(nombre);
	}
	
	@PostMapping("/")
	public Participantes addParticipante(@RequestBody Participantes pro) {
		
		return servicioParticipantes.addParticipante(pro);
		
	}
	
	@PutMapping("/")
public Participantes updateParticipante(@RequestBody Participantes pro) {
		
		return servicioParticipantes.updateParticipante(pro);
		
	}

}
