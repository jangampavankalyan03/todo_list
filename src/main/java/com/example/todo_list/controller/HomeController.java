package com.example.todo_list.controller;

import com.example.todo_list.model.Lists;
import com.example.todo_list.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService service;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/allNotes")
    public List<Lists> getAll() {
        return service.getAll();
    }

    @PostMapping("/addNotes")
    public void addNotes(@RequestBody Lists requestMap) {
        service.addNotes(requestMap);
    }
}
