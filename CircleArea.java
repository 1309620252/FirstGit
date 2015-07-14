import java.util.Scanner;


public class CircleArea {
	private final static double pi = 3.1415926;
	//圆面积的计算
	private static double area(double r){
		return pi*r*r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r = sc.nextDouble();
		System.out.println("圆的面积为:" + area(r));
	}

}
