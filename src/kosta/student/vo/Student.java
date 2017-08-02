package kosta.student.vo;

public class Student {
	private int num;
	private String name;
	private String addr; // 충남, 서울, 경기
	private String ban; // A, B, C
	private String gender; // 남, 여
	private int age;
	private double height;
	private int score;
	private int year;

	public Student(int num, String name, String addr, String ban, String gender, int age, double height, int year) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.ban = ban;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.year = year;
	}

	
	public Student(int num, String name, String addr, String ban, String gender, int age, double height, int score,
			int year) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.ban = ban;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.score = score;
		this.year = year;
	}


	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getBan() {
		return ban;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public int getScore() {
		return score;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGrade() {

		if (this.score >= 90)
			return "A";
		else
			return "F";
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", addr=" + addr + ", ban=" + ban + ", gender=" + gender
				+ ", age=" + age + ", height=" + height + ", score=" + score + ", year=" + year + "]";
	}
}
