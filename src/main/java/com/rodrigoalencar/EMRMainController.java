package com.rodrigoalencar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EMRMainController {
	private static final Logger logger = LoggerFactory.getLogger(EMRMainController.class);

	@RequestMapping("/echo")
	public Echo echo(@RequestParam(value = "value", defaultValue = "OK") String value) {
		return new Echo(value);
	}
}