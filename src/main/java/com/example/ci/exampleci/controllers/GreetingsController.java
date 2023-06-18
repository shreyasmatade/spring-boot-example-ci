package com.example.ci.exampleci.controllers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Value("${app.version}")
    private String appVersion;

	@GetMapping("/")
	public Map<String, Object> greeting() {
        Map<String, Object> res = new HashMap<>();
        res.put("message", "Hello, World");
        res.put("version", appVersion);
		return res;
	}

}
