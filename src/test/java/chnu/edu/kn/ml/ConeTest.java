package chnu.edu.kn.ml;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConeTests {

    @Test
    public void volume_shouldReturnCorrectValue() {
        Cone cone = new Cone(3, 4);
        double result = cone.volume();
        assertEquals(37.699, result, 0.01);
    }

    @Test
    public void getDiameter_shouldReturnCorrectValue() {
        Cone cone = new Cone(5, 10);
        double result = cone.getDiameter();
        assertEquals(10, result, 0.01);
    }

    @Test
    public void getCircumference_shouldReturnCorrectValue() {
        Cone cone = new Cone(10, 20);
        double result = cone.getCircumference();
        assertEquals(62.83, result, 0.01);
    }

    @Test
    public void baseArea_shouldReturnCorrectValue() {
        Cone cone = new Cone(10, 20);
        double result = cone.baseArea();
        assertEquals(314.15, result, 0.01);
    }

    @Test
    public void surfaceArea_shouldReturnCorrectValue() {
        Cone cone = new Cone(10, 20);
        double result = cone.surfaceArea();
        assertEquals(942.47, result, 0.01);
    }
}
