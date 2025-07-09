package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

publicclass Country {

privatestaticfinal Logger LOGGER = LoggerFactory.getLogger(Country.class);

private String code;
private String name;

public Country() {
LOGGER.info("Inside Country Constructor.");
    }
  
public String getCode() {
LOGGER.info("Getting country code: {}", code);
return code;
    }

publicvoid setCode(String code) {
LOGGER.info("Setting country code to: {}", code);
this.code = code;
    }

public String getName() {
LOGGER.info("Getting country name: {}", name);
return name;
    }

publicvoid setName(String name) {
LOGGER.info("Setting country name to: {}", name);
this.name = name;
    }

    @Override
public String toString() {
return "Country [code=" + code + ", name=" + name + "]";
    }
}
