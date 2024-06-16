package net.learningprogramming.algorithm.junitstarter.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleUtilsTest {

    private SampleUtils utils;

    @Before
    public void init() {
        utils = new SampleUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        assertTrue(utils.stringToBoolean("y"));
        assertTrue(utils.stringToBoolean("Y"));
        assertTrue(utils.stringToBoolean("yes"));
        assertTrue(utils.stringToBoolean("YES"));
        assertTrue(utils.stringToBoolean("true"));
        assertTrue(utils.stringToBoolean("TRUE"));
    }

    @Test
    public void stringToBooleanFalseTest() {
        assertFalse(utils.stringToBoolean("n"));
        assertFalse(utils.stringToBoolean("no"));
        assertFalse(utils.stringToBoolean("NO"));
        assertFalse(utils.stringToBoolean("false"));
        assertFalse(utils.stringToBoolean("FALSE"));
        assertFalse(utils.stringToBoolean(null));
    }

    @Test
    public void getFileTypeByCode() {
        assertEquals(SampleUtils.FileType.PDF, utils.getFileTypeByCode(3));
        assertEquals(SampleUtils.FileType.JPEG, utils.getFileTypeByCode(1));
        assertNull(utils.getFileTypeByCode(999));
    }

    @Test
    public void getFileTypeByName() {
        assertEquals(SampleUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        assertNull(utils.getFileTypeByName("text"));
        assertNull(utils.getFileTypeByName(null));
    }
}
