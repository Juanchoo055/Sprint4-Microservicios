package com.investigacion.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Proyectos")
public class Proyectos {
	@Id
	private String _id;
	private String nombre;
	private String obj_general;
	private String descripcion;
	private String[] obj_especificos;
	private int[] userId;
	private Estado estado;
	private Tipo tipo;
	


	public Proyectos() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Proyectos(String nombre, String obj_general, String descripcion, String[] obj_especificos, int[] userId,
			Estado estado, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.obj_general = obj_general;
		this.descripcion = descripcion;
		this.obj_especificos = obj_especificos;
		this.userId = userId;
		this.estado = estado;
		this.tipo = tipo;
	}

	
	
}
