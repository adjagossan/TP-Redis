package fr.istic.redis;

import redis.clients.jedis.Jedis;

public class AppThree {
    public static void main(String[] args) throws InterruptedException{
        String cachekey = "cachekey";
        Jedis jedis = new Jedis("localhost");
        //adding a new key
        jedis.set(cachekey, "cached value");
        //setting the TTL in seconds
        jedis.expire(cachekey, 15);
        //Getting the remaining ttl
        System.out.println("TTL:" +jedis.ttl(cachekey));
        Thread.sleep(1000);
        System.out.println("TTL:" + jedis.ttl(cachekey));
        //Getting the cache value
        System.out.println("Cached value:"+ jedis.get(cachekey));
        
        //wait for the TTL finishs
        Thread.sleep(15000);
        //trying to get the expired key
        System.out.println("Expired key:"+jedis.get(cachekey));
    }
}
