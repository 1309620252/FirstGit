import java.util.ArrayList;
import java.util.Scanner;

/*���ѧ����ƽ���ɼ�*/
public class Average {
	/*����ѧ����ƽ���ɼ�*/
	public static double averageScore(ArrayList<Integer> scores){
		int size = scores.size();
		double sum = 0;
		int i =0;
		/**
		 * ʹ��for...inѭ��
		for(Integer j : scores){
			sum += j;
		}
		/**
		 * ʹ��do-whileѭ��
		do{
			sum += scores.get(i);
			i++;
		}while(i<scores.size());
		/**
		 * ʹ��whileѭ��
		while(i<scores.size()){
			sum += scores.get(i);
			i++;
		}*/
		
		/*ʹ��forѭ��*/
		for(i=0;i<scores.size();i++)
			sum += scores.get(i);
		return sum/size;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("���������ɸ�ѧ���ɼ�(�Զ��ŷָ�)��");
		String str = sc.next();
		String[] temp = str.split(",");
		for(int i = 0;i < temp.length;i++){
			list.add(Integer.parseInt(temp[i]));
		}
		System.out.println("ѧ����ƽ���ɼ�Ϊ��" + averageScore(list));
	}
}
