package Demo;

public class Square {
	private double r;
	private String color;
	public Square(){}
	public Square(double r){
		this.r = r;
	}
	public Square(double r,String color){
		this.r = r;
		this.color = color;
	}
	public double getArea(){
		return r*r;
	}
	public void printInfo(){
		System.out.println("正方形的边长为：" + r + ";"  + "颜色为：" + color + ";" + "面积为：" + getArea() );
	}
}
