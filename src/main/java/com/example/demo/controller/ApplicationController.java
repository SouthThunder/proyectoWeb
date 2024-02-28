package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Application;
import com.example.demo.repository.Repository;


@RequestMapping("/grupo26")
@Controller
public class ApplicationController {

    @Autowired
    private Repository applicationrepository;
    @PostMapping("/create")
public Application createApplication(@RequestBody Application application) {
    System.out.println("Entrando al método createApplication");
    try {
        Application savedApplication = applicationrepository.save(application);
        System.out.println("Aplicación guardada correctamente");
        return savedApplication;
    } catch (Exception e) {
        System.out.println("Error al guardar la aplicación: " + e.getMessage());
        throw e;
    }
}


}
