package com.hsbc.vs.listener;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hsbc.vs.model.Payload;
import com.hsbc.vs.service.VSStoreService;*/

//@Component
public class VSSQSListener {
	private Logger log = LoggerFactory.getLogger(VSSQSListener.class);
	
	/*@Autowired
	VSStoreService vsStoreService;

	@MessageMapping("vs-test-queue")
	public void receiveMessage(String requestJSON)  {
		
			try {
				vsStoreService.store(Payload.fromJSON(requestJSON));
				log.info("Message Read Successfully: {}", requestJSON);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
	}*/
}