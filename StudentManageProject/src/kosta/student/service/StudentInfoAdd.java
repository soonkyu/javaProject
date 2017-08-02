package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentInfoAdd implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
//		System.out.println("학생정보를 추가하시오");
//		System.out.println("번호를 입력하세요");
//		int haknum=scan.nextInt();
//		scan.nextLine();
//		System.out.println("이름을 입력하세요");
//		String name=scan.nextLine();
//		System.out.println("주소를 입력하세요");
//		String addr=scan.nextLine();
//		System.out.println("성별을 선택하세요");
//		String gender=scan.nextLine();
//		System.out.println("반을 입력하세요");
//		String ban=scan.nextLine();
//		System.out.println("키를 입력하세요");
//		double height =scan.nextDouble();
//		System.out.println("나이를 입력하세요");
//		int age=scan.nextInt();
//		System.out.println("학년을 입력하세요");
//		int year=scan.nextInt();
//		
//		Student student=new Student(haknum, name, addr, gender, ban, height, age, 0, year);
		StudentManager.studentInfoadd(new Student(1, "a", "gfh", "여자", "4", 150.0, 24, 40, 1));
		StudentManager.studentInfoadd(new Student(2, "b", "ikuhj", "남자", "1",179.4 , 24, 50, 4));
		StudentManager.studentInfoadd(new Student(3, "c", "hgm", "여자", "2",160.0 , 24, 70, 3));
		StudentManager.studentInfoadd(new Student(4, "d", "fgh", "남자", "4",187.0 , 24, 80, 3));
		StudentManager.studentInfoadd(new Student(5, "f", "b", "여자", "3", 146.1, 24, 20, 2));
		StudentManager.studentInfoadd(new Student(6, "g", "j", "남자", "2", 180.7, 24, 100, 2));
		StudentManager.studentInfoadd(new Student(7, "h", "op", "여자", "1", 172.5, 24, 60, 4));
		StudentManager.studentInfoadd(new Student(8, "i", "adt", "남자", "2", 192.8, 24, 90, 1));
		StudentManager.studentInfoadd(new Student(9, "j", "nbm", "여자", "3", 145.2, 24, 100, 2));
		
		 System.out.println("입력되었습니다.");
	}


}//(번호/이름/주소/성별/반/키/나이/학년)
