package com.alibaba.excel.converters.date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import com.alibaba.excel.converters.AutoConverter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.property.ColumnWidthProperty;
import com.alibaba.excel.metadata.property.DateTimeFormatProperty;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.metadata.property.FontProperty;
import com.alibaba.excel.metadata.property.LoopMergeProperty;
import com.alibaba.excel.metadata.property.NumberFormatProperty;
import com.alibaba.excel.metadata.property.StyleProperty;
import com.alibaba.excel.write.metadata.style.WriteFont;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.converters.date.DateNumberConverter
 *
 * @author Diffblue Cover
 */

class DateNumberConverterTest {

    @Test
    void supportJavaTypeKeyReturnsDate() {
        assertThat(new DateNumberConverter().supportJavaTypeKey(), equalTo((Class) Date.class));
    }

    @Test
    void supportExcelTypeKeyReturnsNumber() {
        assertThat(new DateNumberConverter().supportExcelTypeKey(), is(CellDataTypeEnum.NUMBER));
    }

    @Test
    void convertToJavaData() {
        CellData cellData = new CellData();
        cellData.setBooleanValue(false);
        cellData.setData(new Object());
        cellData.setDataFormat(1);
        cellData.setDataFormatString("yyyy-MM-dd");
        cellData.setFormula(false);
        cellData.setFormulaValue("value");
        byte[] imageValue4 = new byte[] { 1 };
        cellData.setImageValue(imageValue4);
        cellData.setNumberValue(BigDecimal.valueOf(1L));
        cellData.setStringValue("foo");
        cellData.setType(CellDataTypeEnum.STRING);
        cellData.setColumnIndex(1);
        cellData.setRowIndex(1);
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setConverter(new AutoConverter());
        DateTimeFormatProperty dateTimeFormatProperty =
             new DateTimeFormatProperty("yyyy-MM-dd", false);
        dateTimeFormatProperty.setFormat("yyyy-MM-dd");
        dateTimeFormatProperty.setUse1904windowing(false);
        contentProperty.setDateTimeFormatProperty(dateTimeFormatProperty);
        ArrayList<String> headNameList1 = new ArrayList<String>();
        headNameList1.add("Smith");
        Head head = new Head(1, "data", headNameList1, false, false);
        head.setColumnIndex(1);
        ColumnWidthProperty columnWidthProperty = new ColumnWidthProperty(1);
        columnWidthProperty.setWidth(1);
        head.setColumnWidthProperty(columnWidthProperty);
        FontProperty contentFontProperty = new FontProperty();
        contentFontProperty.setBold(false);
        contentFontProperty.setCharset(1);
        contentFontProperty.setColor((short) 1);
        contentFontProperty.setFontHeightInPoints((short) 1);
        contentFontProperty.setFontName("Acme");
        contentFontProperty.setItalic(false);
        contentFontProperty.setStrikeout(false);
        contentFontProperty.setTypeOffset((short) 1);
        contentFontProperty.setUnderline((byte) 1);
        head.setContentFontProperty(contentFontProperty);
        StyleProperty contentStyleProperty = new StyleProperty();
        contentStyleProperty.setBorderBottom(BorderStyle.NONE);
        contentStyleProperty.setBorderLeft(BorderStyle.NONE);
        contentStyleProperty.setBorderRight(BorderStyle.NONE);
        contentStyleProperty.setBorderTop(BorderStyle.NONE);
        contentStyleProperty.setBottomBorderColor((short) 1);
        contentStyleProperty.setDataFormat((short) 1);
        contentStyleProperty.setFillBackgroundColor((short) 1);
        contentStyleProperty.setFillForegroundColor((short) 1);
        contentStyleProperty.setFillPatternType(FillPatternType.NO_FILL);
        contentStyleProperty.setHidden(false);
        contentStyleProperty.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        contentStyleProperty.setIndent((short) 1);
        contentStyleProperty.setLeftBorderColor((short) 1);
        contentStyleProperty.setLocked(false);
        contentStyleProperty.setQuotePrefix(false);
        contentStyleProperty.setRightBorderColor((short) 1);
        contentStyleProperty.setRotation((short) 1);
        contentStyleProperty.setShrinkToFit(false);
        contentStyleProperty.setTopBorderColor((short) 1);
        contentStyleProperty.setVerticalAlignment(VerticalAlignment.TOP);
        contentStyleProperty.setWrapped(false);
        contentStyleProperty.setWriteFont(new WriteFont());
        head.setContentStyleProperty(contentStyleProperty);
        head.setFieldName("data");
        head.setForceIndex(false);
        head.setForceName(false);
        FontProperty headFontProperty = new FontProperty();
        headFontProperty.setBold(false);
        headFontProperty.setCharset(1);
        headFontProperty.setColor((short) 1);
        headFontProperty.setFontHeightInPoints((short) 1);
        headFontProperty.setFontName("Acme");
        headFontProperty.setItalic(false);
        headFontProperty.setStrikeout(false);
        headFontProperty.setTypeOffset((short) 1);
        headFontProperty.setUnderline((byte) 1);
        head.setHeadFontProperty(headFontProperty);
        ArrayList<String> headNameList2 = new ArrayList<String>();
        headNameList2.add("Smith");
        head.setHeadNameList(headNameList2);
        StyleProperty headStyleProperty = new StyleProperty();
        headStyleProperty.setBorderBottom(BorderStyle.NONE);
        headStyleProperty.setBorderLeft(BorderStyle.NONE);
        headStyleProperty.setBorderRight(BorderStyle.NONE);
        headStyleProperty.setBorderTop(BorderStyle.NONE);
        headStyleProperty.setBottomBorderColor((short) 1);
        headStyleProperty.setDataFormat((short) 1);
        headStyleProperty.setFillBackgroundColor((short) 1);
        headStyleProperty.setFillForegroundColor((short) 1);
        headStyleProperty.setFillPatternType(FillPatternType.NO_FILL);
        headStyleProperty.setHidden(false);
        headStyleProperty.setHorizontalAlignment(HorizontalAlignment.GENERAL);
        headStyleProperty.setIndent((short) 1);
        headStyleProperty.setLeftBorderColor((short) 1);
        headStyleProperty.setLocked(false);
        headStyleProperty.setQuotePrefix(false);
        headStyleProperty.setRightBorderColor((short) 1);
        headStyleProperty.setRotation((short) 1);
        headStyleProperty.setShrinkToFit(false);
        headStyleProperty.setTopBorderColor((short) 1);
        headStyleProperty.setVerticalAlignment(VerticalAlignment.TOP);
        headStyleProperty.setWrapped(false);
        headStyleProperty.setWriteFont(new WriteFont());
        head.setHeadStyleProperty(headStyleProperty);
        LoopMergeProperty loopMergeProperty = new LoopMergeProperty(1, 1);
        loopMergeProperty.setColumnExtend(1);
        loopMergeProperty.setEachRow(1);
        head.setLoopMergeProperty(loopMergeProperty);
        contentProperty.setHead(head);
        NumberFormatProperty numberFormatProperty =
             new NumberFormatProperty("yyyy-MM-dd", RoundingMode.UP);
        numberFormatProperty.setFormat("yyyy-MM-dd");
        numberFormatProperty.setRoundingMode(RoundingMode.UP);
        contentProperty.setNumberFormatProperty(numberFormatProperty);
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setAutoTrim(false);
        globalConfiguration.setLocale(new Locale("en"));
        globalConfiguration.setUse1904windowing(false);
        globalConfiguration.setUseScientificFormat(false);
        assertThat(new DateNumberConverter().convertToJavaData(cellData, contentProperty, globalConfiguration), equalTo(new Date("Jan 01 1900")));
    }

    @Test
    void convertToExcelData1() throws java.text.ParseException {

        // arrange
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), new ExcelContentProperty(), globalConfiguration);

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelData2() throws java.text.ParseException {

        // arrange
        ExcelContentProperty contentProperty = new ExcelContentProperty();
        contentProperty.setDateTimeFormatProperty(new DateTimeFormatProperty("yyyy-MM-dd", false));

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), contentProperty, new GlobalConfiguration());

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }

    @Test
    void convertToExcelDataContentPropertyIsNull() throws java.text.ParseException {

        // arrange
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setUse1904windowing(false);

        // act
        CellData result =
             new DateNumberConverter().convertToExcelData(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"), (ExcelContentProperty) null, globalConfiguration);

        // assert
        assertThat(result.getBooleanValue(), is(nullValue()));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getDataFormat(), is(nullValue()));
        assertThat(result.getDataFormatString(), is(nullValue()));
        assertThat(result.getFormula(), is(false));
        assertThat(result.getFormulaValue(), is(nullValue()));
        assertThat(result.getImageValue(), is(nullValue()));
        assertThat(result.getNumberValue(), equalTo(new BigDecimal("40543.0")));
        assertThat(result.getStringValue(), is(nullValue()));
        assertThat(result.getType(), is(CellDataTypeEnum.NUMBER));
        assertThat(result.getColumnIndex(), is(nullValue()));
        assertThat(result.getRowIndex(), is(nullValue()));
    }
}
