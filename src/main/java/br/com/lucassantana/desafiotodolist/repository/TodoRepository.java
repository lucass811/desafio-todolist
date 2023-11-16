package br.com.lucassantana.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucassantana.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
    

}
