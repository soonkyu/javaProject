package kosta.student.service;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.exceptions.MyException;
import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

/**
 * 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년) 학생 정보를 추가하는 서비스 클래스 정보를 입력, 데이터 추가, 추가 후
 * 결과에 출력
 * 
 * @author kosta
 *
 */
public class StudentAddService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("StudentProject--kosta.student");
		logger.info("2. StudentAddService");
		try {
			System.out.print("학번 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			System.out.print("이름 : ");
			String name = scan.nextLine();

			System.out.print("주소 : ");
			String addr = scan.nextLine();

			System.out.print("성별 : ");
			String gender = scan.nextLine();

			System.out.print("반 : ");
			String ban = scan.nextLine();

			System.out.print("키 : ");
			double height = scan.nextDouble();

			System.out.print("나이 : ");
			int age = scan.nextInt();

			System.out.print("학년 : ");
			int year = scan.nextInt();

			boolean b = StudentManager.add(new Student(num, name, addr, ban, gender, age, height, year));

			if (b) {
				System.out.println("------학생 정보 입력 성공-----");
			} else {
				System.out.println("------학생 정보 입력 실패------");
			}

		} catch (InputMismatchException e) {
			throw new MyException("숫자를 정확히 입력하세요.");
		} 
	}

}
