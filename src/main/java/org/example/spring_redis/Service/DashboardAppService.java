package org.example.spring_redis.Service;

import org.example.spring_redis.Repository.DashboardAppRepository;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class DashboardAppService {
    private final DashboardAppRepository dashboardAppRepository;
    private final RedisTemplate<String, Object> redisTemplate;

    public DashboardAppService(DashboardAppRepository dashboardAppRepository, RedisTemplate<String, Object> redisTemplate){
        this.dashboardAppRepository = dashboardAppRepository;
        this.redisTemplate = redisTemplate;
    }

    //Método para fazer o incremento de cliques
    public Long setDashboardAppRepository(String key){
        return redisTemplate.opsForValue().increment(key);
    }

    //Método para verificar quantos cliques o dashboard teve
    public Object getDashboardAppRepository(String key){
        return redisTemplate.opsForValue().get(key);
    }
}
