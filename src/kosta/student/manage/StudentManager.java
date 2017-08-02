package kosta.student.manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import kosta.student.vo.Student;

/**
 * Student ���� ������ ó���ϴ� Ŭ����
 * ����� �Ұ���!
 */
// Ŭ���� ����
public class StudentManager {

	// �ʵ� - ��������
	private static List<Student> list = new LinkedList<>();
	
	static {
		Logger logger = Logger.getLogger("StudentProject--kosta.student");
		logger.info("3. StudentManager");
		list.add(new Student(1, "ȫ�浿", "����", "A", "��", 20, 180.0, 90, 1));
		list.add(new Student(2, "���缮", "���", "A", "��", 30, 170.0, 70, 2));
		list.add(new Student(3, "�鼳��", "����", "B", "��", 25, 160.0, 80, 1));
		list.add(new Student(4, "���ָ�", "�泲", "C", "��", 34, 156.0, 50, 3));
		list.add(new Student(5, "����", "����", "C", "��", 60, 190.0, 40, 1));
		list.add(new Student(6, "�־ֶ�", "���", "A", "��", 40, 165.0, 40, 4));
		list.add(new Student(7, "������", "����", "B", "��", 30, 185.0, 30, 1));
		list.add(new Student(8, "�ڳ���", "�泲", "A", "��", 10, 160.0, 60, 2));
		list.add(new Student(9, "������", "���", "B", "��", 44, 165.0, 90, 3));
	}
	
	// �л� ���� �߰�
	public static boolean add(Student s) {
		return list.add(s);
	}
	
	// ����Ʈ ���(�̸�/����)
	public static List<Student> select7(Comparator<Student> comparator) {
		//Collections.sort(list);
		Collections.sort(list, comparator);
		return list;
	}
	
	// ����Ʈ ���(�̸�/����)
	public static List<Student> select8(Comparator<Student> comparator) {
		return list.stream().sorted(comparator).collect(Collectors.toList());
	}
	
	// �ݺ� ����Ʈ ���
	public static Map<String, List<Student>> selectGroup7() {
		// <��, �ݺ� ����Ʈ>
		Map<String, List<Student>> map = new HashMap<>();
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			
			// �ʿ� ���� ������..
			if(map.containsKey(s.getBan())) {
				List<Student> list = map.get(s.getBan());
				list.add(s);
			}
			
			// �ʿ� ���� ������..
			else {
				List<Student> list = new ArrayList<>();
				list.add(s);
				map.put(s.getBan(), list);
			}
		}
		
		return map;
	}
	
	public static Map<String, List<Student>> selectGroup8() {
		/*Map<String, List<Student>> map = new HashMap<>();
		
		map = list.stream().collect(Collectors.groupingBy(s -> s.getBan()));
		
		return map;*/
		
		return list.stream().collect(Collectors.groupingBy(s -> s.getBan()));
	}
	
}




