package com.proyecto.spring.mongo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
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
@Document(collection="User")
public class Participantes {
	@Id
	private int _id;
	private String nombre;
	private String carrera;
	private Double celular;
	private LocalDate fechaingreso;
	private String email;
	private String password;
	private Roles roles;
}
