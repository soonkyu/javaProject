package kosta.student.service;

import java.util.Iterator;
import java.util.Scanner;

import kosta.student.manage.StudentManager;

public class StudentStats implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("통계=============");
		System.out.println("1.성별 그룹핑\t2.반별 성적 평균");
		System.out.println("3.주소별 성적 평균\t4.학년별 키 평균");
		int num=scan.nextInt();
		Iterator<?> it=StudentManager.studentStats(num).entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
