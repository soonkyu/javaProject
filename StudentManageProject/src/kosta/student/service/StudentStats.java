package kosta.student.service;

import java.util.Iterator;
import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentStats implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("���=============");
		System.out.println("1.���� �׷���\t2.�ݺ� ���� ���");
		System.out.println("3.�ּҺ� ���� ���\t4.�г⺰ Ű ���");
		int num=scan.nextInt();
		Iterator<?> it=StudentManager.studentStats(num).entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
