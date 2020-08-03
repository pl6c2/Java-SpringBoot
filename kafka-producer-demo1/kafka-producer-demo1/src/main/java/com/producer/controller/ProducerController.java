package com.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.model.Person;

@RestController
@RequestMapping("kafka")
public class ProducerController {
	
	@Autowired
	private KafkaTemplate<String, Person> k;
	
	private String topic="kafka1";

	@GetMapping("/publish/{name}")
	public String sendsome(@PathVariable("name") String name)
	{
		k.send(topic, new Person(1,"prem", 24, "peaky"));
		return "published successfully";
	}
}
