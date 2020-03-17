package com.ping;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	/**
	 * 1.数据类型string
	 */
	@Test
	public void testJedisString() {
		//1.连接redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//2.操作redis
//		jedis.set("name", "liyaoping");
		System.out.println(jedis.get("name"));
		//3.关闭redis
		jedis.close();
	}
	
	/**
	 * 2.数据类型list
	 */
	@Test
	public void testJedisList() {
		//1.连接redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//2.操作redis
		jedis.lpush("list1", "a","b","c");
		jedis.rpush("list1", "d");
		List<String> lrange = jedis.lrange("list1", 0, -1);
		for (int i = 0; i < lrange.size(); i++) {
			System.out.println(lrange.get(i));
		}
		//3.关闭redis
		jedis.close();
	}
	
	/**
	 * 3.数据类型hash
	 */
	@Test
	public void testJedisHash() {
		//1.连接redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//2.操作redis
		jedis.hset("hash1", "a1", "a1");
		jedis.hset("hash1", "a2", "a2");
		jedis.hset("hash1", "a3", "a3");
		Map<String, String> hgetAll = jedis.hgetAll("hash1");
		System.out.println(hgetAll);
		//3.关闭redis
		jedis.close();
	}
	
}
