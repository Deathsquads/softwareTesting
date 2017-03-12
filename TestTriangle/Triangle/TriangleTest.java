package Triangle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 2017/3/12.
 */
public class TriangleTest {
    private Triangle triangle;
    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @Test
    public void testT() throws Exception {
        assertEquals("直角三角形",triangle.T(3,4,5));
        assertEquals("等边三角形",triangle.T(3,3,3));
        assertEquals("等腰三角形",triangle.T(3,3,4));
        assertEquals("无法构成三角形",triangle.T(3,2,10));
    }
}