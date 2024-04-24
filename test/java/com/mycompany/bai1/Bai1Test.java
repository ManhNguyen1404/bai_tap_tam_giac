package com.mycompany.bai1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Bai1Test {

    @Test
    public void testEquilateralTriangle() {
        String result = Bai1.classifyTriangle(5, 5, 5);
        assertEquals("Equilateral", result);
    }

    @Test
    public void testIsoscelesTriangle() {
        String result = Bai1.classifyTriangle(5, 5, 6);
        assertEquals("Isosceles", result);
    }

    @Test
    public void testScaleneTriangle() {
        String result = Bai1.classifyTriangle(3, 4, 6);
        assertEquals("Scalene", result);
    }

    @Test
    public void testNotATriangle() {
        String result = Bai1.classifyTriangle(1, 2, 3);
        assertEquals("NotATriangle", result);
    }

    @Test
    public void testRightTriangle() {
        String result = Bai1.classifyTriangle(3, 4, 5);
        assertEquals("Right", result);
    }

    @Test
    public void testInvalidTriangle() {
        String result = Bai1.classifyTriangle(1, 1, 100);
        assertEquals("NotATriangle", result);
    }
}
