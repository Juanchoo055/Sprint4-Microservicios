package com.proyecto.spring.mongo.model;
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
public class Roles {
	   private int _id;
	   private String nombre;
	   private int horasdedicadas;
}
