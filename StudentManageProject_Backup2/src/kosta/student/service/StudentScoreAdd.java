package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentScoreAdd implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
		 System.out.println("성적정보 추가");
		 System.out.println("번호를 입력하세요");
		 int haknum=scan.nextInt();
		 System.out.println("성적을 입력하세요");
		 int score=scan.nextInt();
		 StudentManager.studentScoreadd(haknum, score);
		 System.out.println("입력되었습니다.");
	}

}
