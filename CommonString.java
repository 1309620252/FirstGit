import java.util.ArrayList;
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
		for(int i=0;i<list.size();i++){
			Pattern p = Pattern.compile("(.)\\1*");
			Matcher m = p.matcher(list.get(i));
			if(m.find()){
				l.add(m.group());
			}
		}
		for(int j =0;j<l.size();j++){
			  while(l.size() >= 2){
				if(l.get(j).length() > l.get(j+1).length()){
					System.out.println(l.get(j));
				}	
				else if(l.get(j).length() == l.get(j+1).length() && (int)l.get(j).charAt(0) < (int)l.get(j+1).charAt(0)){
					System.out.println(l.get(j));
				}else{
					System.out.println(l.get(j+1));
				}
			}
				System.out.println(l.get(j));
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
