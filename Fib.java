import java.util.Scanner;


public class Fib {
	//�õ�쳲���������
	private static int getFibo(int n) {
		 if (n == 0 || n == 1){
			  return n;
		 }
		 else
		  return getFibo(n - 1) + getFibo(n - 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������");
		int s = sc.nextInt();
		for(int i=0;i<s+1;i++)
			System.out.println(getFibo(i));
	}
}
