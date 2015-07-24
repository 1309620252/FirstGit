package SecondTest;

public class Square implements JM{
	private double x;
	public Square(double x){
		this.x = x;
	}
	public double getArea() {
		return x*x;
	}
}
