package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Application;

public interface Repository extends CrudRepository<Application, Long>{

    
}
