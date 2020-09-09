package com.alibaba.excel.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.excel.util.CollectionUtils
 *
 * @author Diffblue Cover
 */

class CollectionUtilsTest {

    @Test
    void isEmpty() {
        assertThat(CollectionUtils.isEmpty(new LinkedList<Object>()), is(true));
        assertThat(CollectionUtils.isEmpty((LinkedList<Object>) null), is(true));
        assertThat(CollectionUtils.isEmpty((HashMap<Object, Object>) null), is(true));
    }

    @Test
    void isEmptyReturnsFalse1() {
        LinkedList<Object> collection = new LinkedList<Object>();
        collection.add(new Object());
        assertThat(CollectionUtils.isEmpty(collection), is(false));
    }

    @Test
    void isEmptyReturnsFalse2() {
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("foo", new Object());
        assertThat(CollectionUtils.isEmpty(map), is(false));
    }
}
