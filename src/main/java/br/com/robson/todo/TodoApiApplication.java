package br.com.robson.todo;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.robson.todo.model.Todo;
import br.com.robson.todo.repository.TodoRepository;

@SpringBootApplication
public class TodoApiApplication {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Todo todo = new Todo();
				todo.setDescription("Estudando Spring Boot");
				todo.setCreateDate(LocalDateTime.now());
				todoRepository.save(todo);
				
			}
		};
		
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApiApplication.class, args);
		
	}
	
	
}
