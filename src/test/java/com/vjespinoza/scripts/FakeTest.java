package com.vjespinoza.scripts;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Yahoooo")
public class FakeTest extends BaseTest {

  @Test
  public void fakeTestOne() {
    logger.info("##### fakeTestOne");
    Allure.step("qwerty");
    Allure.description("descriptiooooonn!!!");
    assert true;
  }

  @Test
  @DisplayName("wiiiiiiii")
  public void fakeTestTwo() {
    logger.info("##### fakeTestTwo");
    assert true;
  }
}
