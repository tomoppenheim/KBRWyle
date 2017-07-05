import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void areatest() {
		Triangle triangle = new Triangle(4,3,3,3,6);
		double result = triangle.getArea();
		assertEquals(6,result,0.0);
	}
	
	@Test
	public void peritest() {
		Triangle triangle = new Triangle(4,3,3,3,5);
		double result = triangle.getPerimeter();
		assertEquals(11,result,0.0);
	}
}
