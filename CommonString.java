import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ���ͬ���ַ�������
 *���룺�����������ɸ��ַ���
 *������ַ���ͬ������ַ���(������ͬ������ַ���Ӧascii��С���ַ�����
 **/
public class CommonString {
	public static void findCommon(ArrayList<String> list){
		ArrayList<String> l = new ArrayList<String>();
		String temp;
		for(int i=0;i<list.size();i++){
			Pattern p = Pattern.compile("(.)\\1*");
			Matcher m = p.matcher(list.get(i));
			if(m.find()){
				l.add(m.group());
			}
		Collections.sort(list);
		if(l.size() == 1){
			System.out.println(l.get(0));
		}else{
			for(int j=0;j<l.size()-1;j++){
				if(l.get(j) == l.get(j+1)){
					System.out.println(l.get(j));
				}else{
					System.out.println(l.get(j));
				}
			}
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ������ԣ��ָ�");
		String str = sc.next();
		String[] ss = str.split(",");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<ss.length;i++){
			list.add(ss[i]);
		}
		findCommon(list);		
	}
}
