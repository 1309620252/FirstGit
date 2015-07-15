import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*������ݣ����ض�Ӧ��ݵ�����*/
public class GetDay {
	/*�ж�����*/
	public static boolean isLeap(int year){
		if(year%400 ==0 || year%4==0 && year%100 !=0)
			return true;
		else
			return false;
	}
	/*�õ�����*/
	public static int getDays(int year){
		if(isLeap(year))
			return 366;
		else
			return 365;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�ж�����ݣ�");
		String year = sc.next();
		String regEx="^[0-9_]+$";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(year);
		if(!m.matches()){
			System.out.println("������Ϸ������(����1994):");
			year = sc.next();
		}
		try{
			System.out.println(year + "��Ϊ ��" + getDays(Integer.parseInt(year)) + "��");
		}catch(java.lang.NumberFormatException e){
			System.out.println("������Ϸ������(����1994):");
			year = sc.next();
			System.out.println(year + "��Ϊ ��" + getDays(Integer.parseInt(year)) + "��");
		}
	}
}
