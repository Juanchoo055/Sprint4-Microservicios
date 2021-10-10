package com.proyecto.spring.mongo.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estado {
	private String avance;
	private String fase;
	private String nombre;
	private String desempeno;
	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estado(String avance, String fase, String nombre, String desempeno) {
		super();
		this.avance = avance;
		this.fase = fase;
		this.nombre = nombre;
		this.desempeno = desempeno;
	}
	
}
