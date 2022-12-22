package com.seoha.RedisGenerator.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@Getter
@ToString
public class RedisGenerator {

    private Long id;
    @NonNull
    private String domain;
    @NonNull
    private int redisMemory;
    @NonNull
    private EvictionPolicy evictionPolicy;
    @NonNull
    private String password;
}
