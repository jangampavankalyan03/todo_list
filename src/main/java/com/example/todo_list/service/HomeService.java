package com.example.todo_list.service;

import com.example.todo_list.model.Lists;
import com.example.todo_list.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository repository;

    public List<Lists> getAll() {
        return repository.findAll();
    }

    public void addNotes(Lists requestMap) {
        repository.save(requestMap);
    }
}
