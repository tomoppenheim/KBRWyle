
public class Ellipse implements Shape{
	double axisA;
	double axisB;
	
	public Ellipse(double a, double b){
		this.axisA = a;
		this.axisB = b;
	}
	
	public double getArea(){
		return Math.PI * this.axisA * this.axisB;
	}
	public double getPerimeter(){
		return 2*Math.PI*Math.sqrt((this.axisA * this.axisA + this.axisB * this.axisB)/2);
	}
}
