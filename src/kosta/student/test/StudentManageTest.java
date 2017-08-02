package kosta.student.test;

import java.util.Scanner;
import java.util.logging.Logger;

import kosta.student.service.StudentAddService;
import kosta.student.service.StudentListService;
import kosta.student.service.StudentScoreAddService;
import kosta.student.service.StudentService;

/**
 * 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년) 
 * 2. 성적정보 추가(번호, 성적입력) 
 * 3. 학생 리스트 출력 
 * 	3.1 이름순 오름차순 정렬 
 * 	3.2 성적순 내림차순 정렬 
 * 	3.3 반별 리스트 출력
 * 
 * 4. 학생 정보 검색 
 * 	4.1 주소 검색 
 * 	4.2 이름 검색
 * 
 * 5. 통계 
 * 	5.1 성별별 그룹핑 
 *  5.2 반별 성적 평균 
 *  5.3 주소별 성적 평균 
 *  5.4 학년별 키 평균
 * 
 * 0. 종료
 * 
 * 에러처리 반드시 할것 throw new NullException("학번을 입력하세요."); 성공/실패여부 확인 메시지 반드시 출력 깃허브에
 * commit & push 주석처리(javadoc)
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
			System.out.println("1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년) ");
			System.out.println("2. 성적정보 추가(번호, 성적입력) ");
			System.out.println("3. 학생 리스트 출력  ");
			System.out.println("4. 학생 정보 검색  ");
			System.out.println("5. 통계  ");
			System.out.println("0. 종료 ");
			System.out.println("----------------------------------");
			switch (scan.nextInt()) {
			// 1. 학생정보 추가(번호/이름/주소/성별/반/키/나이/학년) 
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
