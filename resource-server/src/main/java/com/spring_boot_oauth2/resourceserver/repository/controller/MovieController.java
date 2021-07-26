package com.spring_boot_oauth2.resourceserver.repository.controller;

import com.spring_boot_oauth2.resourceserver.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    private RedisTemplate redisTemplate;

    private HashOperations hashOperations;

    private static final String KEY = "Customer";

    @GetMapping("/all")
    public Object getAll(){
        return movieRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Object getById(@PathVariable("id") String id){
        return movieRepository.findById(id);
    }
}
