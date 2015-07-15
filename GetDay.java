import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*给定年份，返回对应年份的天数*/
public class GetDay {
	/*判断闰年*/
	public static boolean isLeap(int year){
		if(year%400 ==0 || year%4==0 && year%100 !=0)
			return true;
		else
			return false;
	}
	/*得到天数*/
	public static int getDays(int year){
		if(isLeap(year))
			return 366;
		else
			return 365;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要判定的年份：");
		String year = sc.next();
		String regEx="^[0-9_]+$";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(year);
		if(!m.matches()){
			System.out.println("请输入合法的年份(例：1994):");
			year = sc.next();
		}
		try{
			System.out.println(year + "年为 ：" + getDays(Integer.parseInt(year)) + "天");
		}catch(java.lang.NumberFormatException e){
			System.out.println("请输入合法的年份(例：1994):");
			year = sc.next();
			System.out.println(year + "年为 ：" + getDays(Integer.parseInt(year)) + "天");
		}
	}
}
