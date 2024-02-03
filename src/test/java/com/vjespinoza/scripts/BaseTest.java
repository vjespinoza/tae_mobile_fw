package com.vjespinoza.scripts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
  Logger logger = LoggerFactory.getLogger(BaseTest.class);
  protected String methodName;

  protected String getMethodName() {
    logger.info("=================================================");
    logger.info("+++ " + this.getClass().getDeclaredMethods()[0].getName());
    return this.getClass().getDeclaredMethods()[0].getName();
  }
}
