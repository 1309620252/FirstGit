import java.util.Scanner;

/*������*/
public class Guess {
	//������
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
		System.out.println("��������Ҫ�µ�����(0-100֮�������):");
		int figure = sc.nextInt();
		while(figure > 100 || figure < 0){
			System.out.println("�������������������������(0-100֮�������):");
			figure = sc.nextInt();
		}
		System.out.println("һ������" + guess(figure) + "��");
	}
}
