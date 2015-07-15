import java.util.Scanner;

/*判断闰年*/
public class CheckLeapYear {
	//判断闰年
	public static boolean isLeap(int year){
		if(year%400 ==0 || year%4==0 && year%100 !=0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要判断的年份:");
		int year = sc.nextInt();
		if(isLeap(year))
			System.out.println("是闰年");
		else
			System.out.println("不是闰年");
	}
}
