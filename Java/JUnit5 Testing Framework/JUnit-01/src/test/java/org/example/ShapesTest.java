package org.example;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ShapesTest {

    Shapes shape;

    public ShapesTest(){
        System.out.println("Test object created before test metthod");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all called");
    }

    @BeforeEach
    void init(){
        shape = new Shapes();
        System.out.println("Before each called");
    }

    @Test
    public void testComputeSquareArea(){
        assertEquals(144.0, shape.computeSquareArea(12.0), 0.0001);
        System.out.println("Actual test");
    }

    @Test
    public void testCircleSquareArea(){
        assertEquals(78.5, shape.computeCircleArea(5.0), 0.01, "Area calculation incorrect");
        System.out.println("Actual test");
    }

    @Test
    public void testCircleSquareArea_SupplierInterface(){
        assertEquals(78.5, shape.computeCircleArea(5.0), 0.01, () -> "Area calculation incorrect");
        System.out.println("Actual test");
    }

    @Test
    public void testArray(){
        int[] actual = {2,4,6,8};
        int[] expected = {4,6,2,8};
        Arrays.sort(expected);
        assertArrayEquals(expected, actual);
        System.out.println("Actual test");
    }

    @AfterEach
    void destroy(){
        System.out.println("After each called");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all called");
    }
}