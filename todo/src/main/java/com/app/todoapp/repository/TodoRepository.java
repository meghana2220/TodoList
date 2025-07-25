package com.app.todoapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.todoapp.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}

