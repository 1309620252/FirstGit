package Demo;
/**
 * Man
 * ���ԣ����������䣬���
 * �������������������Ա𣬻�����䣬���Խ���𣬻�����
 * �౾����һ���ļ�
 * ������һ���ļ�
 * Man��Ͳ�����λ�ڲ�ͬpackage
 * */
public class Man {
	private String name;
	private int age;
	private double height;
	private String gender;
	public Man(String name,int age,double height,String gender){
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	/*�������*/
	public String getName() {
		return name;
	}
	/*�������*/
	public int getAge() {
		return age;
	}
	/*������*/
	public double getHeight() {
		return height;
	}
	/*����Ա�*/
	public String getGender() {
		return gender;
	}
	/*�ж��Ƿ���Խ��*/
	public boolean canMarray(){
		return(("��".equals(getGender()) && getAge() >= 22) || ("Ů".equals(getGender()) && getAge() >= 20));
	}
	/*��ӡ���*/
	public void print(){
		System.out.println("������" + getName() + ";" + "���䣺" + getAge() + ";" +"��ߣ�" + getHeight() + ";" +
	"�Ա�" + getGender() );
		if(canMarray()){
			System.out.println(getName() + ": ���Խ����");
		}else{
			System.out.println(getName() + ": �����Խ��");
		}
	}
}
