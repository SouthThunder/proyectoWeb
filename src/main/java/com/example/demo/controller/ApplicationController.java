package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Application;
import com.example.demo.repository.Repository;



@Controller
public class ApplicationController {

    @Autowired
    private Repository applicationrepository;

    
    @PostMapping("/create")
    public Application createApplication( @RequestBody Application application) {
        return applicationrepository.save(application);
    }

}
