package com.app.todoapp.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_todos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    private boolean completed;
}



