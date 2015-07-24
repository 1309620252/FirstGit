package SecondTest;

import java.util.ArrayList;
/*
1. 使用多态
2. 可以将所有的积木的属性在代码中定义，不用输入数据
测试代码：
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
