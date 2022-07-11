import java.util.Calendar;
import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student student = new Student(); // student= 객체에 대한 참조값(주소값): 객체가 아님
		System.out.print("이름 : ");
		student.name = in.next();
		System.out.print("생년 : ");
		student.birthYear = in.nextInt();
		System.out.print("생월 : ");
		student.birthMonth = in.nextInt();
		Address address = new Address();
		System.out.println("주소");
		System.out.print(" 시 : ");
		address.si = in.next();
		System.out.print(" 구 : ");
		address.gu = in.next();
		System.out.print(" 동 : ");
		address.dong = in.next();
		University university = new University();
//		System.out.print("대학교 : ");
//		university.name = in.next();
//		System.out.print("학과 : ");
//		university.department = in.next();
//		System.out.print("입학년도 : ");
//		university.admissionYear = in.nextInt();
		university.setAddress("경성대학교", "소프트웨어학과", 2020);
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(calendar.YEAR);
		int thisMonth = calendar.get(calendar.MONTH);
		System.out.println(student.name + "(만," + student.getAge(thisYear, thisMonth) + "세) 학생은 " + university.name
				+ " " + university.department + "에 " + university.getGrade(thisYear) + "학년으로 재학중이다.");
		System.out.println("“" + address.si + " " + address.gu + " " + address.dong + "”에 거주 중이다.");

	}

}

class Student { // Class
	String name; // Member Data
	int birthYear, birthMonth;

	int getAge(int thisYear, int thismonth) { // Method
		int age = thisYear - birthYear;
		if (thismonth < birthMonth) age--;
			return age;
	}
}

class Address {
	String si, gu, dong;
}

class University {
	String name, department;
	int admissionYear;

	void setAddress(String name, String department, int admissionYear) {
		this.name = name;
		this.department = department;
		this.admissionYear = admissionYear;
	}

	int getGrade(int thisYear) {
		return thisYear - admissionYear + 1;
	}
}