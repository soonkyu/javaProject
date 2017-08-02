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
 * Student 관련 데이터 처리하는 클래스
 * 입출력 불가능!!! 
 */
public class StudentManager {								// 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년)
	private static List<Student> list = new LinkedList<>();
	
	static public void studentInfoadd(Student s){
		list.add(s);
	}
	
	 
	static public void studentScoreadd(int haknum,int score){// 2. 성적정보 추가(번호, 성적입력)
		for (Student s : list) {
			if(s.getNum()==haknum) {
				s.setScore(score);
				break;
			}
		}
	}
	
	static public List<Student> studentInfoPrint(){// 3. 학생 리스트 출력
		return list;
	}
	static public List<Student> studentNameSortASC(){// 3.1 이름순 오름차순 정렬
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		}); java.7
		return list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());//자바 8
	}
	static public List<Student> studentScoreSortDESC(){// 3.2 성적순 내림차순 정렬
//			Collections.sort(list, new Comparator<Student>() {
//
//				@Override
//				public int compare(Student o1, Student o2) {
//					// TODO Auto-generated method stub
//					return o2.getScore()-o1.getScore();
//				}
//			}); //java7
		return list.stream().sorted((a,b)->b.getScore()-a.getScore()).collect(Collectors.toList()); //자바 8
	}
	static public Map<String,List<Student>> studentBan(){// 3.3 반별 리스트 출력
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
	
	static public Student studentInfoSearch(String s,int a){// 4. 학생 정보 검색
		for (Student student : list) {
			if(a==1 && student.getAddr().equals(s))return student;
			else if(a==2 && student.getName().equals(s)) return student; 
		}
		return null;
	}
	
	static public Map<?, ?> studentStats(int a){// 5. 통계
		while(true){
			switch (a) {
			case 1:
				Map<String,List<Student>> map= 
				list.stream()
				.collect(Collectors.groupingBy(Student::getGender));
				return map;// 5.1 성별별 그룹핑
			case 2:
				Map<String,Double> map1=
				list.stream().collect(Collectors.groupingBy(Student::getBan
						,Collectors.averagingDouble(Student::getScore)
						));
				return map1;// 5.2 반별 성적 평균
			case 3:
				Map<String,Double> map2=
				list.stream().collect(Collectors.groupingBy(Student::getAddr
						,Collectors.averagingDouble(Student::getScore)
						));
				
				return map2;	// 5.3 주소별 성적 평균
			case 4:
				Map<Integer,Double> map3=
				list.stream().collect(Collectors.groupingBy(Student::getYear
						,Collectors.averagingDouble(Student::getHeight)
						));
				return map3;// 5.4 학년별 키 평균
			default:
				break;
			}
			return null;
		}
	}
	
	
	
}
