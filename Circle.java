public class Circle {
	private final static double pi = 3.1415926;
	//圆面积的计算
	private static double area(double r){
		return pi*r*r;
	}
	public static void main(String[] args) {
		System.out.println("The area is:" + area(3));
	}

}
