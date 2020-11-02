package com.springb.dockerapp.dockerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/display")
public class Resource {
	
	//@GetMapping
	@RequestMapping(path="/{name}")
	public String display(@PathVariable("name") String name) {
		String msg = String.format("Hello %s", name);
		return msg;
	}

}
