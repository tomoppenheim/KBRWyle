import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {

	@Test
	public void areatest() {
		Rectangle rectangle = new Rectangle(2,4);
		double result = rectangle.getArea();
		assertEquals(8,result,0.0);
	}
	
	@Test
	public void peritest() {
		Rectangle rectangle = new Rectangle(2,4);
		double result = rectangle.getPerimeter();
		assertEquals(12,result,1);
	}
}


