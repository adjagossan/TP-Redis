package fr.istic.redis;

import redis.clients.jedis.Jedis;

public class AppTwo {
    public static void main(String[] args){
        Jedis jedis = new​ Jedis("localhost");
        System.out.println(jedis.get("counter"));
        jedis.incr("counter");
        System.err.println(jedis.get("counter"));
    }
}
