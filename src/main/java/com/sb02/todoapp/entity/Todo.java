package com.sb02.todoapp.entity;

import lombok.Data;

@Data
public class Todo {

    String name;
    String description;

    public Todo(String name, String description){
        this.name = name;
        this.description = description;
    }

}
