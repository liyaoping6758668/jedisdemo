package com.ping;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void testJedis() {
		//1.����redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//2.����redis
//		jedis.set("name", "liyaoping");
		System.out.println(jedis.get("name"));
		//3.�ر�redis
		jedis.close();
	}
}
