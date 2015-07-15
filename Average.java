import java.util.ArrayList;
import java.util.Scanner;

/*输出学生的平均成绩*/
public class Average {
	/*计算学生的平均成绩*/
	public static double averageScore(ArrayList<Integer> scores){
		int size = scores.size();
		double sum = 0;
		int i =0;
		/**
		 * 使用for...in循环
		for(Integer j : scores){
			sum += j;
		}
		/**
		 * 使用do-while循环
		do{
			sum += scores.get(i);
			i++;
		}while(i<scores.size());
		/**
		 * 使用while循环
		while(i<scores.size()){
			sum += scores.get(i);
			i++;
		}*/
		
		/*使用for循环*/
		for(i=0;i<scores.size();i++)
			sum += scores.get(i);
		return sum/size;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("请输入若干个学生成绩(以逗号分隔)：");
		String str = sc.next();
		String[] temp = str.split(",");
		for(int i = 0;i < temp.length;i++){
			list.add(Integer.parseInt(temp[i]));
		}
		System.out.println("学生的平均成绩为：" + averageScore(list));
	}
}
