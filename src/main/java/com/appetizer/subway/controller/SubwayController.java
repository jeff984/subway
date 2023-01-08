package com.appetizer.subway.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubwayController {
	
	private static final Logger logger = LoggerFactory.getLogger(SubwayController.class);

	@RequestMapping(value="/firstScreen", method = RequestMethod.GET)
	public String firstScreen() {
		logger.info("************************");
		logger.info("this is visit firstSceen");
		logger.info("************************");
		
		return "firstScreen";
	}

}
