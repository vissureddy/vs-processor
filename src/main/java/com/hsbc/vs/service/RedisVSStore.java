package com.hsbc.vs.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisVSStore implements VSStore<String, String> {
	
	@Autowired
    @Qualifier("stringRedisTemplate")
	private RedisTemplate<String,String> redisTemplate;
	
	
	@Override
	public void add(String key, String value) {
		redisTemplate.opsForValue().set(key, value);
	}

	@Override
	public void addMultiple(Map<String, String> keyValues) {
		redisTemplate.opsForValue().multiSet(keyValues);		
	}

	@Override
	public void delete(String key) {
		redisTemplate.delete(key);		
	}

	@Override
	public String get(String key) {
		return redisTemplate.opsForValue().get(key);
	}

	@Override
	public Collection<String> getRangeList(String key, long start, long end) {
		return redisTemplate.opsForList().range(key, start, end);
	}

}
