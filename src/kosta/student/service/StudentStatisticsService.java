package kosta.student.service;

import java.util.Scanner;

public class StudentStatisticsService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		// TODO Auto-generated method stub
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. ������ �׷��� ");
			System.out.println("2. �ݺ� ���� ��� ");
			System.out.println("3. �ּҺ� ���� ��� ");
			System.out.println("4. �г⺰ Ű ��� ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			case 1: break;
			}
		}
	}

}
