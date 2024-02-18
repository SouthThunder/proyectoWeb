package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Application;
import com.example.demo.repository.Repository;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private Repository applicationrepository;

    
    @PostMapping
    public ResponseEntity<Application> createApplication(@Valid @RequestBody Application application) {
        Application createdApplication = applicationService.createApplication(application);
        return new ResponseEntity<>(createdApplication, HttpStatus.CREATED);
    }

    // Endpoint para actualizar una aplicación existente
    @PutMapping("/{id}")
    public ResponseEntity<Application> updateApplication(@PathVariable Long id, @Valid @RequestBody Application application) {
        Application updatedApplication = applicationService.updateApplication(id, application);
        return new ResponseEntity<>(updatedApplication, HttpStatus.OK);
    }

    // Endpoint para eliminar una aplicación por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
