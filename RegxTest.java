import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1、匹配邮政编码：[1-9]\d{5}：第一位是非0的数字，接下来5位是任意数字；
 * 2、匹配合法的英文姓名：^([A-Za-z]+\\s){1,2}[A-Za-z]+$：开头和末尾都由字母组成,
 * \s:匹配任何不可见字符：包括空格。
 * （假如，英文姓名最少由first name和last name组成，最多由first name + middle name+last name组成)
 * 4、匹配email：都不允许符号字符开头或结尾,\w表示匹配包含下划线的任意单词字符
 * ^[a-zA-Z0-9]([a-zA-Z0-9]|_+[a-zA-Z0-9]|[a-zA-Z0-9]*\.[a-zA-Z0-9])+@\w+\.[a-zA-Z]{1,4}\.{0,1}[a-zA-Z]{0,4}$*/
public class RegxTest {
	/*匹配方法*/
	public static boolean match(String regx,String str){
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(str);
		return m.matches();
	}
	/*打印匹配的结果*/
	public static void print(String regx,String str){
		if(match(regx,str))
			System.out.println("您输入的是合法的！");
		else
			System.out.println("您输入不合法，请验证后重新输入！");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要匹配的字符：");
		/*邮箱验证并打印验证后的结果
		String postStr = sc.next();
		String regx = "[1-9]\\d{5}";                                  //匹配邮政编码的正则表达式
		print(regx,postStr);
		*/
		/*英文名称验证并打印验证后的结果
		String englishName = sc.nextLine();       
		String regx ="^([A-Za-z]+\\s){1,2}[A-Za-z]+$";                 //匹配英文名称的正则表达式
		System.out.println(match(regx,englishName));
		print(regx,englishName);*/
		String email = sc.next();
		String regx = "^[a-zA-Z0-9]([a-zA-Z0-9]|_+[a-zA-Z0-9]|[a-zA-Z0-9]*\\.[a-zA-Z0-9])+@\\w+\\.[a-zA-Z]{1,4}\\.{0,1}[a-zA-Z]{0,4}$";
		print(regx,email);
	}

}
