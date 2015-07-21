package Demo;
/**
 * Student
 * ���ԣ�name:String, grade:int(0,1,2,3�ֱ����һ�������꼶��,major:String, cet4_scores: int[](���ɴεĳɼ���
 * ����
 * void level_up(): ��һ��������Ӵ�һ���������
 * boolean passed_cet4(): �Ƿ�ͨ��CET4��ֻҪ��һ�γɼ�����425
 * void printInfo(): ��ӡ�������꼶��רҵ���Ƿ�ͨ��CET4
*/
public class Student {
	private String name;
	private int grade;
	private String major;
	private int[] cet4_scores;
	public Student(String name,int grade,String major,int[] cet4_scores){
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.cet4_scores = cet4_scores;
	}
	public void level_up(){
		if(grade < 4){
			grade++;
		}
	}
	public  boolean passed_cet4(){
		boolean isSuccess = false;
		for(int i=0;i<cet4_scores.length;i++){
			if(cet4_scores[i] >= 425){
				isSuccess = true;
				break;
			}
		}
		return isSuccess;
	}
	public String studentC(int grade){
		if(grade == 0)
			return "��һ";
		else if(grade == 1)
			return "���";
		else if(grade == 2)
			return "����";
		else 
			return "����";
	}
	public void printInfo(){
		System.out.println("������" + name + ";" + "�꼶��" + studentC(grade) + ";" + "רҵ ��" + major);
		if(passed_cet4()){
			System.out.println(name + "ͨ����CET-4");
		}else{
			System.out.println(name + "δͨ��CET-4");
		}
		
	}
}
