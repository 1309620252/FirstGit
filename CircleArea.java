import java.util.Scanner;


public class CircleArea {
	private final static double pi = 3.1415926;
	//Բ����ļ���
	private static double area(double r){
		return pi*r*r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double r = sc.nextDouble();
		System.out.println("Բ�����Ϊ:" + area(r));
	}

}
