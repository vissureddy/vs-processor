package com.hsbc.vs.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hsbc.vs.listener.VSSQSListener;
import com.hsbc.vs.model.Payload;

@Component
public class VSStoreService {
	private Logger log = LoggerFactory.getLogger(VSSQSListener.class);

	public void store(Payload payload) {

		log.info("Data stored Successfully: {}", payload.toString());
	}
}
