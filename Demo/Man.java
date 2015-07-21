package Demo;
/**
 * Man
 * 属性：姓名，年龄，身高
 * 方法：获得姓名，获得性别，获得年龄，可以结婚吗，获得身高
 * 类本身是一个文件
 * 测试是一个文件
 * Man类和测试类位于不同package
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
	/*获得姓名*/
	public String getName() {
		return name;
	}
	/*获得年龄*/
	public int getAge() {
		return age;
	}
	/*获得身高*/
	public double getHeight() {
		return height;
	}
	/*获得性别*/
	public String getGender() {
		return gender;
	}
	/*判断是否可以结婚*/
	public boolean canMarray(){
		return(("男".equals(getGender()) && getAge() >= 22) || ("女".equals(getGender()) && getAge() >= 20));
	}
	/*打印结果*/
	public void print(){
		System.out.println("姓名：" + getName() + ";" + "年龄：" + getAge() + ";" +"身高：" + getHeight() + ";" +
	"性别：" + getGender() );
		if(canMarray()){
			System.out.println(getName() + ": 可以结婚了");
		}else{
			System.out.println(getName() + ": 不可以结婚");
		}
	}
}
