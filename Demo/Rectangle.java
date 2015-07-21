package Demo;
/*������*/
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
		System.out.println("�����εĳ�Ϊ��" + length + ";" + "��Ϊ��" + width + ";" + "��ɫΪ��" + color + ";" + "���Ϊ��" + getArea() );
	}
}
