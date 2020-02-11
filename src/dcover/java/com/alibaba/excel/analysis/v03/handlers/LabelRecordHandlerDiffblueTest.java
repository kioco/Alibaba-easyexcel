package com.alibaba.excel.analysis.v03.handlers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LabelRecordHandlerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LabelRecordHandler()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    LabelRecordHandler actualLabelRecordHandler = new LabelRecordHandler();

    // Assert
    int actualRow = actualLabelRecordHandler.getRow();
    assertEquals(-1, actualRow);
    assertEquals(-1, actualLabelRecordHandler.getColumn());
  }
}

