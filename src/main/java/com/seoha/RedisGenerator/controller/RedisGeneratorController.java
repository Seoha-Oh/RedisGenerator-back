package com.seoha.RedisGenerator.controller;

import com.seoha.RedisGenerator.model.CreateRedisInDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/RedisGenerator")
public class RedisGeneratorController {

    @PostMapping("/createRedis")
    public ResponseEntity createRedis(@RequestBody CreateRedisInDto createRedisInDto){
        ResponseEntity ResponseEntity = null;
        return ResponseEntity;
    }
}
