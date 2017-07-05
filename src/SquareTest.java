import static org.junit.Assert.*;

import org.junit.Test;


public class SquareTest {
	@Test
	public void areatest() {
		Square square = new Square(2);
		double result = square.getArea();
		assertEquals(4,result,0.0);
	}
	
	@Test
	public void peritest() {
		Square square = new Square(2);
		double result = square.getPerimeter();
		assertEquals(8,result,0.0);
	} 
}
