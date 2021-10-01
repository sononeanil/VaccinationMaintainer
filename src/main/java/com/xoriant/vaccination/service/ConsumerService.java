package com.xoriant.vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.vaccination.repository.ConsumerRepository;

@Service
public class ConsumerService {

	@Autowired
	ConsumerRepository consumerRepository;

	public void getAllConsumerList() {
		consumerRepository.findAll();
	}

	public void createConsumer() {
		consumerRepository.save(null);
	}

	public void updateConsumer() {
		consumerRepository.save(null);
	}

}
