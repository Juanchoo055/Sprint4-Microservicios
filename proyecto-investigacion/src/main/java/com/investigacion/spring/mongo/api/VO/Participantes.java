package com.investigacion.spring.mongo.api.VO;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participantes {
	private int _id;
	private String nombre;
	private String carrera;
	private int celular;
	private LocalDate fechaingreso;
	private String email;
	private String password;
	private Roles roles;
}
