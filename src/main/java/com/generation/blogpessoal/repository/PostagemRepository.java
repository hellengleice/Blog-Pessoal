package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//a PostagemRepository pega a Postagem
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
