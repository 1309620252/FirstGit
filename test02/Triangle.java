package SecondTest;

public class Triangle implements JM{
	private double x;
	private double y;
	public Triangle(double x,double y){
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {
		return 0.5*x*y;
	}

}
