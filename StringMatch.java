package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 类名：StringMatch
 * 方法：
 * StringMatch(String str) 构造方法
 * int numberOfOccurence(char x) 字符x在str中出现的次数
 * String getMaxSubStr(int len) str中出现次数最多且长度为len的最小（按照字母顺序）子字符串（要求子字符串每个元素相同），没有时返回空字符串
 * 测试
 * StringMatch m = StringMatch(“ccbbbaadef”)
 * m.numberOfOccurence(“a”) // 2
 * m.getMaxSubStr(2) //	aa
 * m.getMaxSubStr(3) // bbb
 * m.getMaxSubStr(4) // 空
*/
public class StringMatch {
	private  String str;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> l = new ArrayList<String>();
	public StringMatch(String str){
		this.str = str;
	}
	/*字符x在str中出现的次数*/
	public int numberOfOccurence(char x){
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == x){
				count ++;
			}
		}
		return count;
	}
	/*str中出现次数最多且长度为len的最小（按照字母顺序）子字符串（要求子字符串每个元素相同），没有时返回空字符串*/
	public String getMaxSubStr(int len){
		int max = 0;
		int index = 0;
		
		Pattern p = Pattern.compile("(.)\\1+");
		Matcher m = p.matcher(str);
		while(m.find()){
			list.add(m.group());
		}
		//找到含有连续相同字符的子字符串
		if(list.size() != 0){
			//对所有相同字符串进行排序
			Collections.sort(list);
			//得到长度给定的字符串，将其存放在数组里。
			for(int i=0;i<list.size();i++){
				if(list.get(i).length() == len)
					l.add(list.get(i));
			}
			//找出次数最多且长度为len的字符串
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
