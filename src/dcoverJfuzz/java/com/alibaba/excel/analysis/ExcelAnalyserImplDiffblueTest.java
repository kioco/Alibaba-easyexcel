package com.alibaba.excel.analysis;

import com.alibaba.excel.exception.ExcelAnalysisException;
import com.alibaba.excel.read.metadata.ReadWorkbook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExcelAnalyserImplDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    thrown.expect(ExcelAnalysisException.class);
    new ExcelAnalyserImpl(new ReadWorkbook());
  }
}

