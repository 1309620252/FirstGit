package test;

import Demo.Student;

/**
 * ���Դ���
 * Student s = new Student(����);
 * s.printInfo();
 * s.level_up();
 * s.printInfo();
 * */
public class TestStudent {
	public static void main(String[] args) {
		int[] g = new int[]{423,425};
		Student s = new Student("�Ż�",0,"��Ϣ������ѧ",g);
		s.printInfo();
		s.level_up();
		s.printInfo();
	}

}
