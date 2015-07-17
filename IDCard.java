import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输入：18位身份证号码
 * 输出：是否合法
 * 规则：
 * 身份证校验码的计算方法:                                                                 6   1  0  3  2  4  1  9  9 4  1   1   2  2  0  5 2
 * 1、将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2。
 *2、将这17位数字和系数相乘的结果相加。
 *3、用加出来和除以11，看余数是多少？
 *4、余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字。其分别对应的最后一位身份证的号码为1－0－X －9－8－7－6－5－4－3－2。
 *5、通过上面得知如果余数是3，就会在身份证的第18位数字上出现的是9。如果对应的数字是10，身份证的最后一位号码就是罗马数字x。
 **/
public class IDCard {
	public static boolean checkoutCard(ArrayList<String> card){
		int[] value = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};  //存放系数的数组
    	boolean check = false;
		int sum = 0;
		int k;                                                //取余
		/*求和*/
		for(int i=0,j=0;i<value.length;i++,j++){
			sum+=(Integer.parseInt(card.get(j))*value[i]);
		}
		k = sum%11;
		/*校验身份证号的第18位*/
		switch(k){
		case 0:
			if("1".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 1:
			if("0".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 2:
			if("X".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 3:
			if("9".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 4:
			if("8".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 5:
			if("7".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 6:
			if("5".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 7:
			if("5".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 8:
			if("4".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 9:
			if("3".equals(card.get(card.size()-1)))
				check = true;
			break;
		case 10:
			if("2".equals(card.get(card.size()-1)))
				check = true;
			break;
		
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要验证的身份证号码：");
		String card = sc.next();
		/*将用户输入的字符串存储到数组中*/
		char[] s = card.toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<s.length;i++){
			list.add(s[i]+"");
		}
		/*判断输出*/
		if(checkoutCard(list)){
			System.out.println("您输入的身份证号码是合法的！");
		}else{
			System.out.println("您输入的身份证号码不合法!");
		}
	}
}
