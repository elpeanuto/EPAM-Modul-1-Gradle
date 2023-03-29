package edu.utils;

import org.junit.jupiter.api.Test;

import static edu.elpeanuto.utils.StringUtils.isPositiveNumber;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void isPositiveNumberPositiveCases() {
        assertTrue(isPositiveNumber("123"));
        assertTrue(isPositiveNumber("1"));
        assertTrue(isPositiveNumber(String.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void isPositiveNumberNegativeCases() {
        assertFalse(isPositiveNumber("-123"));
        assertFalse(isPositiveNumber("-1"));
        assertFalse(isPositiveNumber(String.valueOf(Integer.MIN_VALUE)));
    }
    @Test
    public void isPositiveNumberStringCases() {
        assertFalse(isPositiveNumber("String"));
        assertFalse(isPositiveNumber("+123"));
        assertFalse(isPositiveNumber("abc"));
    }
    @Test
    public void isPositiveNumberNullCase() {
        assertFalse(isPositiveNumber(null));
    }
}