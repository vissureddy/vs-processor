package com.hsbc.vs.service;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.hsbc.vs.config.RedisConfig;
import com.hsbc.vs.listener.VSSQSListener;
import com.hsbc.vs.model.MarketData;

public class SpringRedisExample {
	private static Logger log = LoggerFactory.getLogger(SpringRedisExample.class);

	@Autowired
	static MarketData marketData;

	public static void main(String[] args) throws URISyntaxException, Exception {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfig.class);
		marketData = new MarketData();
		marketData.setTicker("goog");
		marketData.setOpeningPrice(24.54);
		marketData.setClosingPrice(24.34);
		marketData.setPeRatio(2.5);
		log.info("Info added to Redis");
		
		try {
			RedisTemplate redisTemplate = (RedisTemplate) ctx.getBean("redisTemplate");
			ValueOperations values = redisTemplate.opsForValue();			
			values.set("goog", marketData);
			System.out.println("MarketData added: " + values.get("goog"));
		} finally {
			ctx.close();
		}
	}
}
