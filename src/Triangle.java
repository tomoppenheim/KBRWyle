
public class Triangle implements Shape{

	private double base;
	private double height;
	
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double base,double h, double a, double b, double c){
		this.base = base;
		this.height = h;
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
	}
	
	public double getArea(){
		return .5*base*height;
	}
	public double getPerimeter(){
		return this.sideA + this.sideB + this.sideC;
	}
}
