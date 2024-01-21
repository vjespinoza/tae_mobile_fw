package com.vjespinoza.scripts;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FakeTest {

  Logger logger = LoggerFactory.getLogger(FakeTest.class);

  @Test
  public void fakeTestOne() {
    logger.info("##### fakeTestOne");
    Allure.step("qwerty");
    Allure.description("asdfg");
    // Allure.descriptionHtml("popopopo");
    assert true;
  }

  @Test
  public void fakeTestTwo() {
    logger.info("##### fakeTestTwo");
    assert false;
  }
}
