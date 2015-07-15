import java.util.Scanner;

/*猜数字*/
public class Guess {
	//猜数字
	public static int guess(int figure){
		int count = 0;           
		int left = 0;
		int right = 100;
		int mid = 0;
		while(left <= right){
			count++;
			mid = (left + right)/2;
			if(mid < figure)
				left = mid + 1;
			else if(mid > figure)
				right = mid - 1;
			else
				break;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要猜的数字(0-100之间的整数):");
		int figure = sc.nextInt();
		while(figure > 100 || figure < 0){
			System.out.println("您输入的数字有误，请重新输入(0-100之间的整数):");
			figure = sc.nextInt();
		}
		System.out.println("一共猜了" + guess(figure) + "次");
	}
}
