package com.todoapp.service.impl;

import com.todoapp.domain.ToDo;
import com.todoapp.repository.ToDoRepo;
import com.todoapp.repository.impl.ToDoRepoImpl;
import com.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepo toDoRepo;

    public ToDoServiceImpl() {
        this.toDoRepo = new ToDoRepoImpl();
    }

    @Override
    public List<ToDo> getToDos() {
        return toDoRepo.getToDos();
    }

    @Override
    public ToDo getSingleToDo(int id) {
        return toDoRepo.getSingleToDo(id);
    }

    @Override
    public void addToDo(ToDo toDo) {
        toDoRepo.addToDo(toDo);
    }

    @Override
    public void updateToDo(ToDo toDo) {
        toDoRepo.updateToDo(toDo);
    }

    @Override
    public void removeToDo(int id) {
        toDoRepo.removeToDo(id);
    }
}
