package kosta.student.service;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.exceptions.MyException;
import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

/**
 * 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�) �л� ������ �߰��ϴ� ���� Ŭ���� ������ �Է�, ������ �߰�, �߰� ��
 * ����� ���
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
			System.out.print("�й� : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			System.out.print("�̸� : ");
			String name = scan.nextLine();

			System.out.print("�ּ� : ");
			String addr = scan.nextLine();

			System.out.print("���� : ");
			String gender = scan.nextLine();

			System.out.print("�� : ");
			String ban = scan.nextLine();

			System.out.print("Ű : ");
			double height = scan.nextDouble();

			System.out.print("���� : ");
			int age = scan.nextInt();

			System.out.print("�г� : ");
			int year = scan.nextInt();

			boolean b = StudentManager.add(new Student(num, name, addr, ban, gender, age, height, year));

			if (b) {
				System.out.println("------�л� ���� �Է� ����-----");
			} else {
				System.out.println("------�л� ���� �Է� ����------");
			}

		} catch (InputMismatchException e) {
			throw new MyException("���ڸ� ��Ȯ�� �Է��ϼ���.");
		} 
	}

}
