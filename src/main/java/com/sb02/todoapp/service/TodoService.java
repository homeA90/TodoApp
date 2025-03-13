package com.sb02.todoapp.service;

import com.sb02.todoapp.entity.Todo;
import com.sb02.todoapp.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo create(String name, String description){
        Todo todo = new Todo(name, description);
        return todoRepository.save(todo);
    }

    public List<Todo> getList(){
        return todoRepository.load();
    }

}
