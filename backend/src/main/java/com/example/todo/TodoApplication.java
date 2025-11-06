
package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/todos")
public class TodoApplication {

    private List<String> todos = new ArrayList<>(List.of("Learn Jenkins", "Integrate ArgoCD", "Push to JFrog"));

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @GetMapping
    public List<String> getTodos() {
        return todos;
    }

    @PostMapping
    public String addTodo(@RequestBody String todo) {
        todos.add(todo);
        return "Added: " + todo;
    }
}

