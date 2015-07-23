package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������StringMatch
 * ������
 * StringMatch(String str) ���췽��
 * int numberOfOccurence(char x) �ַ�x��str�г��ֵĴ���
 * String getMaxSubStr(int len) str�г��ִ�������ҳ���Ϊlen����С��������ĸ˳�����ַ�����Ҫ�����ַ���ÿ��Ԫ����ͬ����û��ʱ���ؿ��ַ���
 * ����
 * StringMatch m = StringMatch(��ccbbbaadef��)
 * m.numberOfOccurence(��a��) // 2
 * m.getMaxSubStr(2) //	aa
 * m.getMaxSubStr(3) // bbb
 * m.getMaxSubStr(4) // ��
*/
public class StringMatch {
	private  String str;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> l = new ArrayList<String>();
	public StringMatch(String str){
		this.str = str;
	}
	/*�ַ�x��str�г��ֵĴ���*/
	public int numberOfOccurence(char x){
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == x){
				count ++;
			}
		}
		return count;
	}
	/*str�г��ִ�������ҳ���Ϊlen����С��������ĸ˳�����ַ�����Ҫ�����ַ���ÿ��Ԫ����ͬ����û��ʱ���ؿ��ַ���*/
	public String getMaxSubStr(int len){
		int max = 0;
		int index = 0;
		
		Pattern p = Pattern.compile("(.)\\1+");
		Matcher m = p.matcher(str);
		while(m.find()){
			list.add(m.group());
		}
		//�ҵ�����������ͬ�ַ������ַ���
		if(list.size() != 0){
			//��������ͬ�ַ�����������
			Collections.sort(list);
			//�õ����ȸ������ַ������������������
			for(int i=0;i<list.size();i++){
				if(list.get(i).length() == len)
					l.add(list.get(i));
			}
			//�ҳ���������ҳ���Ϊlen���ַ���
			if(l.size() != 0){
				for(int j=0;j<l.size();j++){
					for(int k=j+1;k<l.size();k++){
						if(l.get(j).charAt(0) == l.get(k).charAt(0) ){
							index ++;
						}
					}
					if(index > max){
						max = index;
					}
				}
				return l.get(max);
			}else{
				return null;
			}
		}else{
			return null;
		}
	} 
	public static void main(String[] args) {
		StringMatch m = new StringMatch("ccbbbaaddaaffsre");
		System.out.println(m.numberOfOccurence('a'));
		System.out.println(m.getMaxSubStr(2));
		//System.out.println(m.getMaxSubStr(3));
		//System.out.println(m.getMaxSubStr(4));
	}
}
