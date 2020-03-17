package com.ping;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void testJedis() {
		//1.连接redis
		Jedis jedis = new Jedis("127.0.0.1",6379);
		//2.操作redis
//		jedis.set("name", "liyaoping");
		System.out.println(jedis.get("name"));
		//3.关闭redis
		jedis.close();
	}
}
