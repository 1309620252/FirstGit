package SecondTest;

import java.util.ArrayList;
/*
1. ʹ�ö�̬
2. ���Խ����еĻ�ľ�������ڴ����ж��壬������������
���Դ��룺
ArrayList shapes = new ArrayList();
shapes.add(new XXX());
System.out.println("Total Area:" + getTotalArea(shapes));*/
public class TestDemo1 {
	public static double getTotalArea(ArrayList<JM> shapes){
		int sum = 0;
		for(int i=0;i<shapes.size();i++){
			sum +=shapes.get(i).getArea();
		}
		return sum;
		
	}
	public static void main(String[] args) {
		ArrayList<JM> shapes = new ArrayList<JM>();
		shapes.add(new Square(1));
		shapes.add(new Rectangle(2,3));
		shapes.add(new Circle(2));
		shapes.add(new Triangle(2,4));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
}
