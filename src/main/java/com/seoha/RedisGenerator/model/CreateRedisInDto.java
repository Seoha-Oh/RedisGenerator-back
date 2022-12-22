package com.seoha.RedisGenerator.model;

import com.seoha.RedisGenerator.entity.EvictionPolicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class CreateRedisInDto {
    @NonNull
    private String domain;
    @NonNull
    private int redisMemory;
    @NonNull
    private EvictionPolicy evictionPolicy;
    @NonNull
    private String password;
}
