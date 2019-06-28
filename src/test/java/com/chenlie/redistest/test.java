package com.chenlie.redistest;

import redis.clients.jedis.Jedis;

public class test {
    public static void main(String[] args) {
        Jedis jd = new Jedis("192.168.112.128",6379);
        jd.auth("123");
        jd.append("class","niubi");
    }
}
