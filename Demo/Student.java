package Demo;
/**
 * Student
 * 属性：name:String, grade:int(0,1,2,3分别代表一二三四年级）,major:String, cet4_scores: int[](若干次的成绩）
 * 方法
 * void level_up(): 升一级（例如从大一升到大二）
 * boolean passed_cet4(): 是否通过CET4：只要有一次成绩大于425
 * void printInfo(): 打印姓名，年级，专业，是否通过CET4
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
			return "大一";
		else if(grade == 1)
			return "大二";
		else if(grade == 2)
			return "大三";
		else 
			return "大四";
	}
	public void printInfo(){
		System.out.println("姓名：" + name + ";" + "年级：" + studentC(grade) + ";" + "专业 ：" + major);
		if(passed_cet4()){
			System.out.println(name + "通过了CET-4");
		}else{
			System.out.println(name + "未通过CET-4");
		}
		
	}
}
