package com.lovecoding.demoredis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Session")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Session implements Serializable {

    @Id
    private String id;
    private String token;

    private String state;

}
