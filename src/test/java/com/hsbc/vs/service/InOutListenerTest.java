/*package com.hsbc.vs.service;


import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hsbc.vs.config.Application;
import com.hsbc.vs.service.model.Order;
import com.hsbc.vs.service.service.ClientService;
import com.hsbc.vs.service.service.RegisterService;
import com.hsbc.vs.service.service.StoreService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class InOutListenerTest {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private StoreService storeService;
	
	@Autowired
	private RegisterService registerService;
	
	@Test
	public void registerOrder() throws InterruptedException {
		clientService.registerOrder(new Order("order1"));
		Thread.sleep(1000);
		
		Optional<Order> storedOrder = storeService.getReceivedOrder("order1");
		Assert.assertTrue(storedOrder.isPresent());
		Assert.assertEquals("order1", storedOrder.get().getId());
		Assert.assertEquals("order1", registerService.getLastReceivedOrderId());
	}
}
*/