package main;

import main.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testMyToUpperCase() {
        assertEquals("HELLO", StringUtils.xiToUpperCase("hello"));
        assertEquals("HELLO123", StringUtils.xiToUpperCase("hello123"));
        assertNull(StringUtils.xiToUpperCase(null));
    }

    @Test
    void testMyToLowerCase() {
        assertEquals("hello", StringUtils.xiToLowerCase("HELLO"));
        assertEquals("test string 02", StringUtils.xiToLowerCase("TesT StrInG 02"));
        assertNull(StringUtils.xiToUpperCase(null));
    }

    @Test
    void testMyTrim() {
        assertEquals("Hello", StringUtils.xiTrim(" \t Hello \r \n "));
        assertEquals("", StringUtils.xiTrim("  \n \t \r \t  \n  "));
        assertNull(StringUtils.xiTrim(null));
    }
}