package kosta.student.service;

import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentInfoAdd implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
//		System.out.println("�л������� �߰��Ͻÿ�");
//		System.out.println("��ȣ�� �Է��ϼ���");
//		int haknum=scan.nextInt();
//		scan.nextLine();
//		System.out.println("�̸��� �Է��ϼ���");
//		String name=scan.nextLine();
//		System.out.println("�ּҸ� �Է��ϼ���");
//		String addr=scan.nextLine();
//		System.out.println("������ �����ϼ���");
//		String gender=scan.nextLine();
//		System.out.println("���� �Է��ϼ���");
//		String ban=scan.nextLine();
//		System.out.println("Ű�� �Է��ϼ���");
//		double height =scan.nextDouble();
//		System.out.println("���̸� �Է��ϼ���");
//		int age=scan.nextInt();
//		System.out.println("�г��� �Է��ϼ���");
//		int year=scan.nextInt();
//		
//		Student student=new Student(haknum, name, addr, gender, ban, height, age, 0, year);
		StudentManager.studentInfoadd(new Student(1, "a", "gfh", "����", "4", 150.0, 24, 40, 1));
		StudentManager.studentInfoadd(new Student(2, "b", "ikuhj", "����", "1",179.4 , 24, 50, 4));
		StudentManager.studentInfoadd(new Student(3, "c", "hgm", "����", "2",160.0 , 24, 70, 3));
		StudentManager.studentInfoadd(new Student(4, "d", "fgh", "����", "4",187.0 , 24, 80, 3));
		StudentManager.studentInfoadd(new Student(5, "f", "b", "����", "3", 146.1, 24, 20, 2));
		StudentManager.studentInfoadd(new Student(6, "g", "j", "����", "2", 180.7, 24, 100, 2));
		StudentManager.studentInfoadd(new Student(7, "h", "op", "����", "1", 172.5, 24, 60, 4));
		StudentManager.studentInfoadd(new Student(8, "i", "adt", "����", "2", 192.8, 24, 90, 1));
		StudentManager.studentInfoadd(new Student(9, "j", "nbm", "����", "3", 145.2, 24, 100, 2));
		
		 System.out.println("�ԷµǾ����ϴ�.");
	}


}//(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
