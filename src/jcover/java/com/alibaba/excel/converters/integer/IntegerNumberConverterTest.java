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
 * Unit tests for com.alibaba.excel.converters.integer.IntegerNumberConverter
 *
 * @author Diffblue JCover
 */

public class IntegerNumberConverterTest {

    @Test(timeout=10000)
    public void convertToExcelDataValueIsOne() {
        CellData result = new IntegerNumberConverter().convertToExcelData((Integer)1, new ExcelContentProperty(), new GlobalConfiguration());
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue().toPlainString(), is("1"));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void supportExcelTypeKeyReturnsNUMBER() {
        assertThat(new IntegerNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test(timeout=10000)
    public void supportJavaTypeKeyReturnsInteger() {
        assertThat(new IntegerNumberConverter().supportJavaTypeKey(), equalTo((Class)Integer.class));
    }
}
