package com.spring_boot_oauth2.resourceowner.repository;

import com.spring_boot_oauth2.resourceowner.repository.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MovieRepository {

    private RedisTemplate<String, Movie> redisTemplate;

    private HashOperations hashOperations;

    public MovieRepository(RedisTemplate<String, Movie> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    private String KEY = "Movie";

    public Map findAll(){
        return hashOperations.entries(KEY);
    }

    public Movie findById(String id){
        return (Movie) hashOperations.get(KEY,id);
    }

}
