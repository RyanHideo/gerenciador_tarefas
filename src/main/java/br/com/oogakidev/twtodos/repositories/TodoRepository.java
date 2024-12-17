package br.com.oogakidev.twtodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oogakidev.twtodos.models.Todo;

public interface  TodoRepository extends JpaRepository<Todo, Long> {
    
}
