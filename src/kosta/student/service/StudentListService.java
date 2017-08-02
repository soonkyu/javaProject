package kosta.student.service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import kosta.student.manage.StudentManager;
import kosta.student.service.StudentService;
import kosta.student.vo.Student;

/**
 * �л� ����Ʈ ����ϴ� ���� Ŭ����
 * 
 * @author kosta
 *
 */
public class StudentListService implements StudentService {

	@Override
	public void execute(Scanner scan) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. �̸��� �������� ����  ");
			System.out.println("2. ������ �������� ���� ");
			System.out.println("3. �ݺ� ����Ʈ ���  ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			case 1:
				List<Student> list = StudentManager.select7(new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName());
					}
				});
				print(list);
				break;
			case 2:
				// 7
				/*List<Student> list2 = StudentManager.select7(new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return o2.getScore() - o1.getScore();
					}
				});*/
				
				// 8
				List<Student> list2 = StudentManager.select8((o1,o2) -> o2.getScore() - o1.getScore());
				
				print(list2);
				break;
			case 3:
				// Map<String, List<Student>> map = StudentManager.selectGroup7();
				Map<String, List<Student>> map = StudentManager.selectGroup8();
				print(map);
				break;
			}
		}

	}

	public void print(List<Student> list) {
		Iterator<Student> it = list.iterator();

		System.out.println("�л� ����Ʈ ���");
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}
	
	public void print(Map<String,  List<Student>> map) {
		Iterator<String> it = map.keySet().iterator();

		System.out.println("�л� �ݺ� ����Ʈ ���");
		while (it.hasNext()) {
			String ban = it.next();
			System.out.println(ban + " : " + map.get(ban).size());
		}
	}

}
