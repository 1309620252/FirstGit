package test;

import Demo.Student;

/**
 * 测试代码
 * Student s = new Student(参数);
 * s.printInfo();
 * s.level_up();
 * s.printInfo();
 * */
public class TestStudent {
	public static void main(String[] args) {
		int[] g = new int[]{423,425};
		Student s = new Student("张欢",0,"信息与计算科学",g);
		s.printInfo();
		s.level_up();
		s.printInfo();
	}

}
