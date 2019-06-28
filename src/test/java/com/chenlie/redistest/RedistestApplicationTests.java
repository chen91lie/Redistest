package com.chenlie.redistest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedistestApplicationTests {

    @Test
    public void contextLoads() {
        //单实例连接
//        Jedis jd = new Jedis("192.168.112.128",6379);
//        jd.auth("123");
//        jd.select(0);
//        jd.set("class","niubi");
//        jd.set("zuotian","今天");
//        String name = jd.get("name");
//        System.out.println(name);
//        Set<String> keys = jd.keys("*");
//        for (String key:keys
//             ) {
//            System.out.println(jd.get(key));
//        }
//        jd.save();
//        jd.close();
        //连接池连接
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMinIdle(3);
        JedisPool pool = new JedisPool(config,"192.168.112.128",6379);
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            jedis.auth("123");
            jedis.set("houtian","大后天");
        }catch (Exception ex){

        }

    }

}
