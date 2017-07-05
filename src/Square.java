
public class Square implements Shape{
	double side;
	
	public Square(double s){
		this.side = s;
	}
	
	public double getArea(){
		return this.side*this.side;
	}
	public double getPerimeter(){
		return 4*this.side;
	}
}
