package com.spring_boot_oauth2.resourceowner.repository.controller;

import com.spring_boot_oauth2.resourceowner.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    public Object getAll(){

        return movieRepository.findAll();
    }
}
