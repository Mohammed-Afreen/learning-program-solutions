package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

public static void main(String[] args) {
LOGGER.info("START");
displayCountry();
LOGGER.info("END");
    }

public static void displayCountry() {
	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Country.xml")) {
	
        Country country = context.getBean("country", Country.class);

   LOGGER.info("Country : {}", country.toString());
        }
    }
}
