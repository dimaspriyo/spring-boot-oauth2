package com.spring_boot_oauth2.resourceowner.repository;

import com.spring_boot_oauth2.resourceowner.repository.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    @Autowired
    private RedisTemplate redisTemplate;

    private HashOperations hashOperations;

    public MovieRepository(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    private String KEY = "movie";

    public List<Map> findAll(){
        List<Map> values = new ArrayList<>();
       Set entries =  hashOperations.getOperations().keys("movie*");
       entries.forEach(o -> {
           Map<Object,Object> key =  hashOperations.entries(o);
           key.put("id",o);
           values.add(key);
       });
            return values;
    }

    public Object findById(String id){
        Map<Object,Object> key = hashOperations.entries(id);
        key.put("id",id);
        return key;
    }

}
