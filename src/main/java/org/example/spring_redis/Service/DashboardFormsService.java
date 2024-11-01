package org.example.spring_redis.Service;

import org.example.spring_redis.Repository.DashboardFormsRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class DashboardFormsService {
    private final DashboardFormsRepository dashboardFormsRepository;
    private final RedisTemplate<String, Object> redisTemplate;


    public DashboardFormsService(DashboardFormsRepository dashboardFormsRepository, RedisTemplate<String, Object> redisTemplate){
        this.dashboardFormsRepository = dashboardFormsRepository;
        this.redisTemplate = redisTemplate;
    }

    //Método para fazer o incremento de cliques
    public Long setDashboardFormsRepository(String key){
        return redisTemplate.opsForValue().increment(key);
    }

    //Método para verificar quantos cliques o dashboard teve
    public Object getDashboardFormsRepository(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
