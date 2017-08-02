package kosta.student.manage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import kosta.student.vo.Student;


/**
 * Student ���� ������ ó���ϴ� Ŭ����
 * ����� �Ұ���!!! 
 */
public class StudentManager {								// 1. �л����� �߰�(��ȣ/�̸�/�ּ�/����/��/Ű/����/�г�)
	private static List<Student> list = new LinkedList<>();
	
	static public void studentInfoadd(Student s){
		list.add(s);
	}
	
	 
	static public void studentScoreadd(int haknum,int score){// 2. �������� �߰�(��ȣ, �����Է�)
		for (Student s : list) {
			if(s.getNum()==haknum) {
				s.setScore(score);
				break;
			}
		}
	}
	
	static public List<Student> studentInfoPrint(){// 3. �л� ����Ʈ ���
		return list;
	}
	static public List<Student> studentNameSortASC(){// 3.1 �̸��� �������� ����
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		}); java.7
		return list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());//�ڹ� 8
	}
	static public List<Student> studentScoreSortDESC(){// 3.2 ������ �������� ����
//			Collections.sort(list, new Comparator<Student>() {
//
//				@Override
//				public int compare(Student o1, Student o2) {
//					// TODO Auto-generated method stub
//					return o2.getScore()-o1.getScore();
//				}
//			}); //java7
		return list.stream().sorted((a,b)->b.getScore()-a.getScore()).collect(Collectors.toList()); //�ڹ� 8
	}
	static public Map<String,List<Student>> studentBan(){// 3.3 �ݺ� ����Ʈ ���
		Map<String,List<Student>> map=new HashMap<>(); 
		Iterator<Student> it=list.iterator();
		while (it.hasNext()) {
			Student s=it.next();
			String key=s.getBan();
			List<Student> sl=map.get(key);
			if(sl==null){
				sl=new ArrayList<Student>();
				map.put(key, sl);
			}
			sl.add(s);
		}
		
		return map;// java7
//		return list.stream().collect(Collectors.groupingBy(Student::getBan)); //java8
	}
	
	static public Student studentInfoSearch(String s,int a){// 4. �л� ���� �˻�
		for (Student student : list) {
			if(a==1 && student.getAddr().equals(s))return student;
			else if(a==2 && student.getName().equals(s)) return student; 
		}
		return null;
	}
	
	static public Map<?, ?> studentStats(int a){// 5. ���
		while(true){
			switch (a) {
			case 1:
				Map<String,List<Student>> map= 
				list.stream()
				.collect(Collectors.groupingBy(Student::getGender));
				return map;// 5.1 ������ �׷���
			case 2:
				Map<String,Double> map1=
				list.stream().collect(Collectors.groupingBy(Student::getBan
						,Collectors.averagingDouble(Student::getScore)
						));
				return map1;// 5.2 �ݺ� ���� ���
			case 3:
				Map<String,Double> map2=
				list.stream().collect(Collectors.groupingBy(Student::getAddr
						,Collectors.averagingDouble(Student::getScore)
						));
				
				return map2;	// 5.3 �ּҺ� ���� ���
			case 4:
				Map<Integer,Double> map3=
				list.stream().collect(Collectors.groupingBy(Student::getYear
						,Collectors.averagingDouble(Student::getHeight)
						));
				return map3;// 5.4 �г⺰ Ű ���
			default:
				break;
			}
			return null;
		}
	}
	
	
	
}
