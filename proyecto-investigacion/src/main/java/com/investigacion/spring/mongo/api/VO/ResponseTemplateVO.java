package com.investigacion.spring.mongo.api.VO;

import com.investigacion.spring.mongo.api.model.Proyectos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	private Proyectos proyectos;
	private Participantes participantes;
}
