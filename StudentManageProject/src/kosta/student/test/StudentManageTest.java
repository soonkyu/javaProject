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
		// 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년)
		// 2. 성적정보 추가(번호, 성적입력)
		// 3. 학생 리스트 출력
		// 3.1 이름순 오름차순 정렬
		// 3.2 성적순 내림차순 정렬
		// 3.3 반별 리스트 출력
		// 4. 학생 정보 검색
		// 4.1 주소 검색
		// 4.2 이름 검색
		// 5. 통계
		// 5.1 성별별 그룹핑
		// 5.2 반별 성적 평균
		// 5.3 주소별 성적 평균
		// 5.4 학년별 키 평균
		// 0. 종료
		// 주석 처리
		boolean exit=false;
		while (true) {
			
			// 입출력
			System.out.println("원하시는 번호를 고르세요");
			System.out.println("<1.학생정보 추가 2.성적정보 추가 3.학생 리스트 출력 4.학생 정보 검색 >");
			System.out.println("<5.통계 0.종료>");
			
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
			}// 기능 생성
			if(exit==true) break;
		} // looping
		System.exit(0);

	}

}
