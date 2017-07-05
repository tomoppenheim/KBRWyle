
public class Rectangle implements Shape {
	
	private double base;
	private double height;
	
	public Rectangle(double b, double h){
		this.base = b;
		this.height = h;
	}
	
	public double getArea(){
		return this.base * this.height;
	}
	public double getPerimeter(){
		return 2 * this.base + 2 * this.height;
	}
}
