package kosta.student.service;

import java.util.Scanner;

public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		// TODO Auto-generated method stub
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. 성별별 그룹핑 ");
			System.out.println("2. 반별 성적 평균 ");
			System.out.println("3. 주소별 성적 평균 ");
			System.out.println("4. 학년별 키 평균 ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			case 1: break;
			}
		}
	}

}
