package SecondTest;

public class Rectangle implements JM{
	private double x;
	private double y;
	public Rectangle(double x,double y){
		this.x = x;
		this.y = y;
	}
	@Override
	public double getArea() {
		return x*y;
	}

}
