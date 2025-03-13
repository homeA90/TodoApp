package com.sb02.todoapp.repository;

import com.sb02.todoapp.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private final List<Todo> todoData = new ArrayList<>();


    public Todo save(Todo todo){
        todoData.add(todo);
        return todo;
    }

    public List<Todo> load() {
        return new ArrayList<>(todoData);
    }
}
