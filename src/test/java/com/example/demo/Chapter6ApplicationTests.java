package com.example.demo;

import com.example.demo.entity.CapRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter6ApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redisTest() {
        // redis存储数据
        String key = "name";
        redisTemplate.opsForValue().set(key, "yukong");
        // 获取数据
        String value = (String) redisTemplate.opsForValue().get(key);
        System.out.println("获取缓存中key为" + key + "的值为：" + value);

        CapRole user = new CapRole();
        user.setRoleCode("123123");
        String userKey = "yukong";
        redisTemplate.opsForValue().set(userKey, user);
        CapRole newUser = (CapRole) redisTemplate.opsForValue().get(userKey);
        System.out.println("获取缓存中key为" + userKey + "的值为：" + newUser);

    }

}
