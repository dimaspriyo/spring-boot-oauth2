package com.spring_boot_oauth2.resourceowner.repository.controller;

import com.spring_boot_oauth2.resourceowner.repository.MovieRepository;
import com.spring_boot_oauth2.resourceowner.repository.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    private RedisTemplate redisTemplate;

    private HashOperations hashOperations;

    private static final String KEY = "Customer";

    @GetMapping
    public Object getAll(){
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable("id") String id){
        return movieRepository.findById(id);
    }
}
