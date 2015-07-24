package SecondTest;

public class Circle implements JM{
	private double x;
	public Circle(double x){
		this.x = x;
	}
	@Override
	public double getArea() {
		return Math.PI*x*x;
	}

}
