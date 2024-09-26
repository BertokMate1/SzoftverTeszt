package uni.sw.unit.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @BeforeAll
    public static void setup(){
        System.out.println("BeforeAll demo setup test execution");
    }

    @AfterAll
    public static void teardown(){
        System.out.println("AfterAll demo tear down test execution");
    }

    @BeforeEach
    public void initTest(){
        System.out.println("BeforeEach demo init test case ");
    }

    @AfterEach
    public void tearDownTest(){
        System.out.println("AfterEach demo tear down test case ");
    }


    @Test
    public void testGenericTriangle(){

        System.out.println("Testing generic triangle");
        Triangle triangle = new Triangle(3,4,6);

        assertTrue(triangle instanceof Triangle);
        assertFalse(triangle.isIsosceles());
        assertFalse(triangle.isEquilateral());
        //assertFalse(triangle.isRightAngeled());

    }

    @Test
    public void testIsosceles(){
        
        System.out.println("Testing isosceles triangle");
        Triangle triangle = new Triangle(3,3,5);

        assertTrue(triangle.isIsosceles());

    }

    @Test
    public void testEquiliteralTrinagle(){

        Triangle triangle = new Triangle(8, 8, 8);

        assertTrue(triangle.isIsosceles());
        assertTrue(triangle.isEquilateral());

    }

    @Disabled
    @Test
    public void testisRightAngeled(){

        Triangle triangle = new Triangle(0, 0, 0);

    }

    @Test
    public void testPerimeter(){

        Triangle triangle = new Triangle(100, 251, 178);

        assertEquals(triangle.getPerimeter(), 529, "calculated perimeter doesnt match expected value");

    }

    @Disabled
    @Test
    public void testArea(){

        Triangle triangle = new Triangle(100, 251, 178);

        assertEquals(triangle.getArea(), 529, "calculated perimeter doesnt match expected value");

    }

    @Test
    public void testNotConctructableTriangle(){

        Exception exception1 = assertThrows(ArithmeticException.class, () -> {
            new Triangle(3, 4, 7);
        });

        assertTrue(exception1.getMessage().contains("The triangle cannot be constructed from the the numbers"));

            assertThrows(ArithmeticException.class, () -> {
                new Triangle(3, 7, 4);
        });

            assertThrows(ArithmeticException.class, () -> {
                new Triangle(7, 3, 4);
        });
    }

}