package kosta.student.test;

import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.service.StudentAddService;
import kosta.student.service.StudentListService;
import kosta.student.service.StudentScoreAddService;
import kosta.student.service.StudentService;

/**
 * 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�) 
 * 2. �������� �߰�(��ȣ, �����Է�) 
 * 3. �л� ����Ʈ ��� 
 * 	3.1 �̸��� �������� ���� 
 * 	3.2 ������ �������� ���� 
 * 	3.3 �ݺ� ����Ʈ ���
 * 
 * 4. �л� ���� �˻� 
 * 	4.1 �ּ� �˻� 
 * 	4.2 �̸� �˻�
 * 
 * 5. ��� 
 * 	5.1 ������ �׷��� 
 *  5.2 �ݺ� ���� ��� 
 *  5.3 �ּҺ� ���� ��� 
 *  5.4 �г⺰ Ű ���
 * 
 * 0. ����
 * 
 * ����ó�� �ݵ�� �Ұ� throw new NullException("�й��� �Է��ϼ���."); ����/���п��� Ȯ�� �޽��� �ݵ�� ��� ����꿡
 * commit & push �ּ�ó��(javadoc)
 */
public class StudentManageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = Logger.getLogger("StudentProject--kosta.student");
		logger.info("1. StudentManageTest");

		Scanner scan = new Scanner(System.in);
		StudentService s = null;

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�) ");
			System.out.println("2. �������� �߰�(��ȣ, �����Է�) ");
			System.out.println("3. �л� ����Ʈ ���  ");
			System.out.println("4. �л� ���� �˻�  ");
			System.out.println("5. ���  ");
			System.out.println("0. ���� ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			// 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�) 
			case 1:
				s = new StudentAddService();
				s.execute(scan);
				break;
			// 2.
			case 2:
				s = new StudentScoreAddService();
				s.execute(scan);
				break;
			// 3.
			case 3:
				s = new StudentListService();
				s.execute(scan);
				break;
			// 4. 
			case 4:
			case 5:
			case 0:
				if (scan != null)
					scan.close();
				System.exit(0);
			}
		}

	}

}
