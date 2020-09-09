package com.alibaba.excel.converters.bigdecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.bigdecimal.BigDecimalNumberConverter
 *
 * @author Diffblue Cover
 */

class BigDecimalNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsBigDecimal() {
        assertThat(new BigDecimalNumberConverter().supportJavaTypeKey(), equalTo((Class) BigDecimal.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new BigDecimalNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaDataReturnsNull() {
        assertThat(new BigDecimalNumberConverter().convertToJavaData(new CellData(), new ExcelContentProperty(), new GlobalConfiguration()), is(nullValue()));
    }

    @Test
    void convertToExcelData() {

        // arrange
        BigDecimal value = BigDecimal.valueOf(1L);

        // act
        CellData result = new BigDecimalNumberConverter().convertToExcelData(value, new ExcelContentProperty(), new GlobalConfiguration());

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), sameInstance(value));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
