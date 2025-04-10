package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

//a PostagemRepository pega a Postagem
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	/*
	 * SELECT * FROM tb_postagens titulo LIKE "carnav%
	 * */
	
	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
