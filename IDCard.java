import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���룺18λ���֤����
 * ������Ƿ�Ϸ�
 * ����
 * ���֤У����ļ��㷽��:                                                                 6   1  0  3  2  4  1  9  9 4  1   1   2  2  0  5 2
 * 1����ǰ������֤����17λ���ֱ���Բ�ͬ��ϵ�����ӵ�һλ����ʮ��λ��ϵ���ֱ�Ϊ��7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2��
 *2������17λ���ֺ�ϵ����˵Ľ����ӡ�
 *3���üӳ����ͳ���11���������Ƕ��٣�
 *4������ֻ������0��1��2��3��4��5��6��7��8��9��10��11�����֡���ֱ��Ӧ�����һλ���֤�ĺ���Ϊ1��0��X ��9��8��7��6��5��4��3��2��
 *5��ͨ�������֪���������3���ͻ������֤�ĵ�18λ�����ϳ��ֵ���9�������Ӧ��������10�����֤�����һλ���������������x��
 **/
public class IDCard {
	public static boolean checkoutCard(ArrayList<String> card){
		int[] value = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};  //���ϵ��������
    	boolean check = false;
		int sum = 0;
		int k;                                                //ȡ��
		/*���*/
		for(int i=0,j=0;i<value.length;i++,j++){
			sum+=(Integer.parseInt(card.get(j))*value[i]);
		}
		k = sum%11;
		/*У�����֤�ŵĵ�18λ*/
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
		System.out.println("��������Ҫ��֤�����֤���룺");
		String card = sc.next();
		/*���û�������ַ����洢��������*/
		char[] s = card.toCharArray();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<s.length;i++){
			list.add(s[i]+"");
		}
		/*�ж����*/
		if(checkoutCard(list)){
			System.out.println("����������֤�����ǺϷ��ģ�");
		}else{
			System.out.println("����������֤���벻�Ϸ�!");
		}
	}
}
