package kosta.student.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import kosta.student.exception.MyException;
import kosta.student.manage.StudentManager;
import kosta.student.vo.Student;

public class StudentListPrint implements StudentService {

	@Override
	public void excute(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("�л� ����Ʈ ���");
		for (Student s : StudentManager.studentInfoPrint()) {
			System.out.println(s);
		}
		System.out.println("1.�̸��� �������� ���� 2.������ �������� ���� 3.�ݺ� ����Ʈ ���");
		int num = scan.nextInt();
		if (num == 1) {
			for (Student s : StudentManager.studentNameSortASC()) {
				System.out.println(s);
			}
		} else if (num == 2) {
			for (Student s : StudentManager.studentScoreSortDESC()) {
				System.out.println(s);
			}
		} else if(num==3){
			Iterator<Entry<String, List<Student>>> it=StudentManager.studentBan().entrySet().iterator();
			
			while(it.hasNext()){
				Entry<String, List<Student>> entry=it.next();
				String key=entry.getKey();
				System.out.println("ban: "+key);
				for (Student s : entry.getValue()) {
					System.out.println(s);
				}
			}
			
		}else throw new MyException();
	}

}
