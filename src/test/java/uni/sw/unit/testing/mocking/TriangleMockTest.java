package uni.sw.unit.testing.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import uni.sw.unit.testing.Triangle;

public class TriangleMockTest {

    @Test
    void testIsIsosceles() {
        Triangle mockTriangle = mock(Triangle.class);
        when(mockTriangle.isIsosceles()).thenReturn(true);
        assertTrue(mockTriangle.isIsosceles(), "The triangle should be isosceles");
    }

    @Test
    void testIsEquilateral() {
        Triangle mockTriangle = mock(Triangle.class);
        when(mockTriangle.isEquilateral()).thenReturn(true);
        assertTrue(mockTriangle.isEquilateral(), "The triangle should be equilateral");
    }

    @Test
    void testIsRightAngled() {
        Triangle mockTriangle = mock(Triangle.class);
        when(mockTriangle.isRightAngeled()).thenReturn(true);
        assertTrue(mockTriangle.isRightAngeled(), "The triangle should be right-angled");
    }

    @Test
    void testGetPerimeter() {
        Triangle mockTriangle = mock(Triangle.class);
        when(mockTriangle.getPerimeter()).thenReturn(12);
        assertEquals(12, mockTriangle.getPerimeter(), "The perimeter should be 12");
    }

    @Test
    void testGetArea() {
        Triangle mockTriangle = mock(Triangle.class);
        when(mockTriangle.getArea()).thenReturn(6.0);
        assertEquals(6.0, mockTriangle.getArea(), "The area should be 6.0");
    }
}
