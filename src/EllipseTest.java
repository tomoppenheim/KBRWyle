import static org.junit.Assert.*;

import org.junit.Test;


public class EllipseTest {

	@Test
	public void areatest() {
		Ellipse ellipse = new Ellipse(2,4);
		double result = ellipse.getArea();
		assertEquals(25.13,result,1);
	}
	
	@Test
	public void peritest() {
		Ellipse ellipse = new Ellipse(2,4);
		double result = ellipse.getPerimeter();
		assertEquals(19.38,result,1);
	}
}
