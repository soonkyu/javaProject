package kosta.student.exception;

public class MyException extends RuntimeException{

	public MyException() {
		// TODO Auto-generated constructor stub
		System.out.println("제대로 입력해라");
	}
	public MyException(String message) {
		super(message);
	
	}

	
}
