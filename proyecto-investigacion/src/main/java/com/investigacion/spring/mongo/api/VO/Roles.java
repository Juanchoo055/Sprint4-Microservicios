package com.investigacion.spring.mongo.api.VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	   private int id;
	   private String nombre;
	   private int horasdedicadas;
}
