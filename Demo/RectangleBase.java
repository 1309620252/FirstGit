package Demo;
/**
 * 长方形，正方形
 * 长方形是父类
 * 正方形是子类
 * 长方形的方法
 * double getArea()
 * void printInfo()
 * 测试
 * Square s = new Square(20, “black”);
 * s.printInfo();
*/
public class RectangleBase {
	public double length;
	public double width;
	public String color;
	public RectangleBase(){
	}
	public RectangleBase(double length){
		this.length = length;
	}
	public RectangleBase(double length,String color){
		this.length = length;
		this.width = length;
		this.color = color;
	}
	public RectangleBase(double length,String color, double width){
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
