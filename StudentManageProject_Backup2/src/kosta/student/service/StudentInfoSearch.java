package kosta.student.service;

import java.util.Scanner;

import kosta.student.exception.MyException;
import kosta.student.manage.StudentManager;

public class StudentInfoSearch implements StudentService {

	@Override
	public void excute(Scanner scan) throws MyException {
		// TODO Auto-generated method stub
		System.out.println("학생 정보 검색=======");
		System.out.println("1.주소 검색   2.이름 검색");
		int num=scan.nextInt();
		scan.nextLine();
		if(num==1) {
			System.out.println("주소를 쓰세요");
			String s1=scan.nextLine();
//			if(s1.isEmpty() || isStringDouble(s1)) throw new MyException("숫자를 쓰지마시고, 문자를 꼭쓰세요");
			System.out.println(StudentManager.studentInfoSearch(s1, num));
		}
		else if(num==2) {
			System.out.println("이름을 쓰세요");
			String s2=scan.nextLine();
			System.out.println(StudentManager.studentInfoSearch(s2, num));
		}
		else System.out.println("잘못입력하셨습니다.");
	}
	
	
	   private boolean isStringDouble(String s) { //문자열 숫자있는지 확인
		    try {
		        Double.parseDouble(s);
		        return true;
		    } catch (NumberFormatException e) {
		        return false;
		    }
		  }

}
