package SecondTest;

public class Circle implements JM{
	private double x;
	private double y;
	public Circle(double x){
		this.x = x;
		this.y = x;
	}
	@Override
	public double getArea() {
		return Math.PI*x*y;
	}

}
