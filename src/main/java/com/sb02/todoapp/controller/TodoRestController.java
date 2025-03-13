package com.sb02.todoapp.controller;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {

    private final TodoService todoService;
    public TodoRestController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        List<Todo> todos = todoService.getList();
        Map<String, List<Todo>> response = new HashMap<>();
        response.put("todos", todos);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> addTodo(@RequestBody Map<String, String> response) {
        String name = response.get("name");
        String description = response.get("description");
        todoService.create(name, description);
        Map<String, String> map = new HashMap<>();
        return ResponseEntity.ok(map);
    }

}
