package ch13.sec05;

public class Course {
	//모든 사람이면 등록 가능
	public static void registerCourse1(Applicant<?> applicant ) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course1을 등록함");
		
		Object o = applicant.kind;
	}
	
	//학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course2를 등록함");
		
		Student a = applicant.kind; //안전
		Person p = applicant.kind; //안전
		Object o = applicant.kind; //안전
	}
	
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course3를 등록함");
		
		applicant.kind = new Worker(); //안전
		applicant.kind = new SubWorker(); //안전
//		applicant.kind = new Person(); //불안전
	}
}

class SubWorker extends Worker {}
class SubWorker2 extends Worker {}