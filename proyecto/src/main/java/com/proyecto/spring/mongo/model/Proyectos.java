package com.proyecto.spring.mongo.model;



import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Proyectos")
public class Proyectos {
	@Id
	private String _id;
	private String nombre;
	private String obj_general;
	private String descripcion;
	private String[] obj_especificos;
	@DBRef
	private List<Participantes> participantes;
	private Estado estado;
	private Tipo tipo;

	



	
	
}
