package Demo;
/*长方形*/
public class Rectangle {
	private double length;
	private double width;
	private String color;
	public Rectangle(){
		
	}
	public Rectangle(double length){
		this.length = length;
	}
	public Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	public Rectangle(double length,String color, double width){
		this.length = length;
		this.width = width;
		this.color = color;
	}
	public double getArea(){
		return length*width;
	}
	public void printInfo(){
		System.out.println("长方形的长为：" + length + ";" + "宽为：" + width + ";" + "颜色为：" + color + ";" + "面积为：" + getArea() );
	}
}
