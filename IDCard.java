import java.util.Scanner;

/**
 * ���룺18λ���֤����
 * ������Ƿ�Ϸ�
 * ����
 * ���֤У����ļ��㷽��:
 * 
 *                                                                            6   1  0  3  2  4  1  9  9 4  1   1   2  2  0  5 2
 * 1����ǰ������֤����17λ���ֱ���Բ�ͬ��ϵ�����ӵ�һλ����ʮ��λ��ϵ���ֱ�Ϊ��7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2��
 *2������17λ���ֺ�ϵ����˵Ľ����ӡ�
 *3���üӳ����ͳ���11���������Ƕ��٣�
 *4������ֻ������0��1��2��3��4��5��6��7��8��9��10��11�����֡���ֱ��Ӧ�����һλ���֤�ĺ���Ϊ1��0��X ��9��8��7��6��5��4��3��2��
 *5��ͨ�������֪���������3���ͻ������֤�ĵ�18λ�����ϳ��ֵ���9�������Ӧ��������10�����֤�����һλ���������������x��
 **/
public class IDCard {
	public static boolean checkoutCard(String card){
		boolean check = false;
		int sum = 0;
		int k;
		int value = card.charAt(0)*7 + card.charAt(1)*9 + card.charAt(2)*10;
		sum = Integer.parseInt(card.charAt(0) + "")*7 + Integer.parseInt(card.charAt(1) + "")*9 
				+Integer.parseInt(card.charAt(2) + "")*10 + Integer.parseInt(card.charAt(3) + "")*5
				+Integer.parseInt(card.charAt(4) + "")*8 +Integer.parseInt(card.charAt(5) + "")*4 
				+Integer.parseInt(card.charAt(6) + "")*2 + Integer.parseInt(card.charAt(7) + "")*1 
				+Integer.parseInt(card.charAt(8) + "")*6+ Integer.parseInt(card.charAt(9) + "")*3 
				+Integer.parseInt(card.charAt(10) + "")*7 + Integer.parseInt(card.charAt(11) + "")*9
				+Integer.parseInt(card.charAt(12) + "")*10+ Integer.parseInt(card.charAt(13) + "")*5
				+Integer.parseInt(card.charAt(14) + "")*8 + Integer.parseInt(card.charAt(15) + "")*4
				+Integer.parseInt(card.charAt(16) + "")*2;
		k = sum%11;
		switch(k){
		case 0:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 1)
				check = true;
				break;
		case 1:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 0)
				check = true;
			break;
		case 2:
			if(card.charAt(card.length()-1)+"" == "X")
				check = true;
			break;
		case 3:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 9)
				check = true;
				break;
		case 4:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 8)
				check = true;
				break;
		case 5:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 7)
				check = true;
				break;
		case 6:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 6)
				check = true;
				break;
		case 7:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 5)
				check = true;
				break;
		case 8:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 4)
				check = true;
				break;
		case 9:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 3)
				check = true;
				break;
		case 10:
			if(Integer.parseInt(card.charAt(card.length()-1) + "") == 2)
				check = true;
				break;
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��֤�����֤���룺");
		String card = sc.next();
		if(checkoutCard(card)){
			System.out.println("����������֤�����ǺϷ��ģ�");
		}else{
			System.out.println("����������֤���벻�Ϸ�!");
		}
	}
}
