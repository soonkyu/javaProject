package kosta.student.test;

import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.service.StudentInfoAdd;
import kosta.student.service.StudentInfoSearch;
import kosta.student.service.StudentListPrint;
import kosta.student.service.StudentScoreAdd;
import kosta.student.service.StudentStats;

public class StudentManageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("StudentProject~~~~~");
		// logger.info("StudentManageTest");
		System.out.println("Hello world");
		Scanner scan = new Scanner(System.in);
		// 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
		// 2. �������� �߰�(��ȣ, �����Է�)
		// 3. �л� ����Ʈ ���
		// 3.1 �̸��� �������� ����
		// 3.2 ������ �������� ����
		// 3.3 �ݺ� ����Ʈ ���
		// 4. �л� ���� �˻�
		// 4.1 �ּ� �˻�
		// 4.2 �̸� �˻�
		// 5. ���
		// 5.1 ������ �׷���
		// 5.2 �ݺ� ���� ���
		// 5.3 �ּҺ� ���� ���
		// 5.4 �г⺰ Ű ���
		// 0. ����
		// �ּ� ó��
		boolean exit=false;
		while (true) {
			
			// �����
			System.out.println("���Ͻô� ��ȣ�� ������");
			System.out.println("<1.�л����� �߰� 2.�������� �߰� 3.�л� ����Ʈ ��� 4.�л� ���� �˻� >");
			System.out.println("<5.��� 0.����>");
			
			switch (scan.nextInt()) {
			case 1:
				new StudentInfoAdd().excute(scan);
				break;
			case 2:
				new StudentScoreAdd().excute(scan);
				break;
			case 3:
				new StudentListPrint().excute(scan);
				break;
			case 4:
				new StudentInfoSearch().excute(scan);
				break;
			case 5:
				new StudentStats().excute(scan);
				break;
			case 0:
				exit=true;
				if(scan!=null) {
					scan.close();
					break;
				}
			}// ��� ����
			if(exit==true) break;
		} // looping
		System.exit(0);

	}

}
