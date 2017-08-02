package kosta.student.service;

import java.util.Scanner;

import kosta.student.exception.MyException;
import kosta.student.manage.StudentManager;

public class StudentInfoSearch implements StudentService {

	@Override
	public void excute(Scanner scan) throws MyException {
		// TODO Auto-generated method stub
		System.out.println("�л� ���� �˻�=======");
		System.out.println("1.�ּ� �˻�   2.�̸� �˻�");
		int num=scan.nextInt();
		scan.nextLine();
		if(num==1) {
			System.out.println("�ּҸ� ������");
			String s1=scan.nextLine();
//			if(s1.isEmpty() || isStringDouble(s1)) throw new MyException("���ڸ� �������ð�, ���ڸ� ��������");
			System.out.println(StudentManager.studentInfoSearch(s1, num));
		}
		else if(num==2) {
			System.out.println("�̸��� ������");
			String s2=scan.nextLine();
			System.out.println(StudentManager.studentInfoSearch(s2, num));
		}
		else System.out.println("�߸��Է��ϼ̽��ϴ�.");
	}
	
	
	   private boolean isStringDouble(String s) { //���ڿ� �����ִ��� Ȯ��
		    try {
		        Double.parseDouble(s);
		        return true;
		    } catch (NumberFormatException e) {
		        return false;
		    }
		  }

}
