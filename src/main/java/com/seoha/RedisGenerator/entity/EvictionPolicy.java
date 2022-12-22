package com.seoha.RedisGenerator.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum EvictionPolicy {
    NOEVICTION, ALLKEYS_IRU, VOLATILE_IRU, ALLKEYS_IFU, VOLATILE_IFU, ALLKEYS_RANDOME, VOLATILE_TTL
}
