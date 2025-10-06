package com.codescene;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionalExampleTest {

    private ConditionalExample example;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        example = new ConditionalExample();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCheckNumberPositiveEven() {
        example.checkNumber(4);
        assertEquals("The number is positive\nThe number is even\n", outContent.toString());
    }

    @Test
    public void testCheckNumberNegativeOdd() {
        example.checkNumber(-3);
        assertEquals("The number is negative\nThe number is odd\n", outContent.toString());
    }

    @Test
    public void testCheckNumberZero() {
        example.checkNumber(0);
        assertEquals("The number is even\n", outContent.toString());
    }

    @Test
    public void testCategorizeStringLongWithNumbers() {
        String result = example.categorizeString("Hello123");
        assertEquals("Long and contains numbers", result);
    }

    @Test
    public void testCategorizeStringShortOnlyLetters() {
        String result = example.categorizeString("Hi");
        assertEquals("Short and contains only letters", result);
    }

    @Test
    public void testCategorizeStringEmptyString() {
        String result = example.categorizeString("");
        assertEquals("Short and contains only letters", result);
    }

    @Test
    public void testCategorizeStringOnlyNumbers() {
        String result = example.categorizeString("12345");
        assertEquals("Short and contains numbers", result);
    }

    @Test
    public void tearDown() {
        System.setOut(originalOut);
    }
}
