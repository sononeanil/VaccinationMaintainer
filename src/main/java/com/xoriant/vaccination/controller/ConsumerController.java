package com.xoriant.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.vaccination.entiry.Consumer;
import com.xoriant.vaccination.service.ConsumerService;

@RestController
@RequestMapping("/api/v1/consumer")
@CrossOrigin()
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerService;
	
	@GetMapping("/getAllConsumerList")
	public void getAllConsumerList() {
		consumerService.getAllConsumerList();  
	}
	
	@PostMapping("/createConsumer")
	public void createConsumer(@RequestBody Consumer consumer) {
		consumerService.createConsumer();
	}
	
	@PatchMapping("/updateConsumer")
	public void updateConsumer() {
		consumerService.updateConsumer();
	}

}
