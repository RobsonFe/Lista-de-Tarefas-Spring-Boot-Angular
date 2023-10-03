package br.com.robson.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.robson.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
	
}
