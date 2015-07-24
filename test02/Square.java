package SecondTest;

public class Square implements JM{
	private double x;
	private double y;
	public Square(double x){
		this.x = x;
		this.y = x;
	}
	public double getArea() {
		return x*y;
	}
}
