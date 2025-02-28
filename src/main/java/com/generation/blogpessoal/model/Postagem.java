package com.generation.blogpessoal.model;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
	@NotBlank(message = "O atributo titulo é obrigatorio")
	@Size(min = 5, max = 100, message = "O titulo tem que ser maior que 5 e menor que 100")
		private String titulo;
		
	@NotBlank(message = "O atributo texto é obrigatorio")
	@Size(min = 5, max = 100, message = "O texto tem que ser maior que 5 e menor que 100")
		private String texto;
		

	@UpdateTimestamp
		private String data;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}
		
	
	
	}


