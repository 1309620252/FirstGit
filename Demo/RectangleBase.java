package Demo;
/**
 * �����Σ�������
 * �������Ǹ���
 * ������������
 * �����εķ���
 * double getArea()
 * void printInfo()
 * ����
 * Square s = new Square(20, ��black��);
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
		System.out.println("�����εĳ�Ϊ��" + length + ";" + "��Ϊ��" + width + ";" + "��ɫΪ��" + color + ";" + "���Ϊ��" + getArea() );
	}

}
