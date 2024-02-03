package com.vjespinoza.scripts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DummyTest extends BaseTest {

  @Test
  public void dummyTestOne() {
    logger.info("##### dummyTestOne");
    assert true;
  }

  @Test
  public void dummyTestTwo() {
    logger.info("##### dummyTestTwo");
    assert true;
  }
}
