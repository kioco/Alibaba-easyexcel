package com.alibaba.excel.converters.integer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.excel.converters.integer.IntegerBooleanConverter
 *
 * @author Diffblue JCover
 */

public class IntegerBooleanConverterTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsOne() {
        CellData result = new IntegerBooleanConverter().convertToExcelData((Integer)1, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(true));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test(timeout=10000)
    public void convertToExcelDataValueIsZero() {
        CellData result = new IntegerBooleanConverter().convertToExcelData((Integer)0, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(false));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), is(nullValue()));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsBOOLEAN() {
        assertThat(new IntegerBooleanConverter().supportExcelTypeKey(), is(CellDataTypeEnum.BOOLEAN));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsInteger() {
        assertThat(new IntegerBooleanConverter().supportJavaTypeKey(), equalTo((Class)Integer.class));
    }
}
