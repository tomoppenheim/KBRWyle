import static org.junit.Assert.*;

import org.junit.Test;


public class CircleTest {

	@Test
	public void areatest() {
		Circle circle = new Circle(4);
		double result = circle.getArea();
		assertEquals(50.27,result,1);
	}
	
	@Test
	public void peritest() {
		Circle circle = new Circle(4);
		double result = circle.getPerimeter();
		assertEquals(25.13,result,1);
	}
}
