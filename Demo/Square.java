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
		System.out.println("�����εı߳�Ϊ��" + r + ";"  + "��ɫΪ��" + color + ";" + "���Ϊ��" + getArea() );
	}
}
