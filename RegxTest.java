import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1��ƥ���������룺[1-9]\d{5}����һλ�Ƿ�0�����֣�������5λ���������֣�
 * 2��ƥ��Ϸ���Ӣ��������^([A-Za-z]+\\s){1,2}[A-Za-z]+$����ͷ��ĩβ������ĸ���,
 * \s:ƥ���κβ��ɼ��ַ��������ո�
 * �����磬Ӣ������������first name��last name��ɣ������first name + middle name+last name���)
 * 4��ƥ��email��������������ַ���ͷ���β,\w��ʾƥ������»��ߵ����ⵥ���ַ�
 * ^[a-zA-Z0-9]([a-zA-Z0-9]|_+[a-zA-Z0-9]|[a-zA-Z0-9]*\.[a-zA-Z0-9])+@\w+\.[a-zA-Z]{1,4}\.{0,1}[a-zA-Z]{0,4}$*/
public class RegxTest {
	/*ƥ�䷽��*/
	public static boolean match(String regx,String str){
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	/*��ӡƥ��Ľ��*/
	public static void print(String regx,String str){
		if(match(regx,str))
			System.out.println("��������ǺϷ��ģ�");
		else
			System.out.println("�����벻�Ϸ�������֤���������룡");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫƥ����ַ���");
		/*������֤����ӡ��֤��Ľ��
		String postStr = sc.next();
		String regx = "[1-9]\\d{5}";                                  //ƥ�����������������ʽ
		print(regx,postStr);
		*/
		/*Ӣ��������֤����ӡ��֤��Ľ��
		String englishName = sc.nextLine();       
		String regx ="^([A-Za-z]+\\s){1,2}[A-Za-z]+$";                 //ƥ��Ӣ�����Ƶ�������ʽ
		System.out.println(match(regx,englishName));
		print(regx,englishName);*/
		String email = sc.next();
		String regx = "^[a-zA-Z0-9]([a-zA-Z0-9]|_+[a-zA-Z0-9]|[a-zA-Z0-9]*\\.[a-zA-Z0-9])+@\\w+\\.[a-zA-Z]{1,4}\\.{0,1}[a-zA-Z]{0,4}$";
		print(regx,email);
	}

}
