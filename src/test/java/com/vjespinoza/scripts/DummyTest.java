package com.vjespinoza.scripts;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DummyTest {

  Logger logger = LoggerFactory.getLogger(DummyTest.class);

  @Test
  public void dummyTestOne() {
    logger.info("dummyTestOne");
    assert true;
  }
}
