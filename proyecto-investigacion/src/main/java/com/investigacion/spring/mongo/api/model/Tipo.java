package com.investigacion.spring.mongo.api.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Tipo {
	private int director;
	private int presupuesto;
	private LocalDate fecha_inicial;
	private LocalDate fecha_final;
	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo(int director, int presupuesto, LocalDate fecha_inicial, LocalDate fecha_final) {
		super();
		this.director = director;
		this.presupuesto = presupuesto;
		this.fecha_inicial = fecha_inicial;
		this.fecha_final = fecha_final;
	}
	
}
