package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentScoreAdd implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
		 System.out.println("�������� �߰�");
		 System.out.println("��ȣ�� �Է��ϼ���");
		 int haknum=scan.nextInt();
		 System.out.println("������ �Է��ϼ���");
		 int score=scan.nextInt();
		 StudentManager.studentScoreadd(haknum, score);
		 System.out.println("�ԷµǾ����ϴ�.");
	}

}
