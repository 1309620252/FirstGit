import java.util.Scanner;

/*�ж�����*/
public class CheckLeapYear {
	//�ж�����
	public static boolean isLeap(int year){
		if(year%400 ==0 || year%4==0 && year%100 !=0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�жϵ����:");
		int year = sc.nextInt();
		if(isLeap(year))
			System.out.println("������");
		else
			System.out.println("��������");
	}
}
