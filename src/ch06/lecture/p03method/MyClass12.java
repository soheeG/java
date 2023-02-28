package ch06.lecture.p03method;

public class MyClass12 {
	int method1() {
		
		// 1.메소드 종료
		// 2.오른쪽 값을 호출한 곳으로 return(반환)
		// 오른쪽 값은 메소드 리턴 타입과 일치해야 함
		return 3; 
	}
	
	int method2() {
		// 메소드 리턴 타입을 명시하면
		// 해당 타입의 값을 꼭 리턴해야 함
		if (true) {
			return 3; // if문 때문에 return할 수 없을 수도 
			          // 있다고 판단해서 오류 (꼭 리턴해야 함)
		}
		
		return 5;
	}
	 //자동 형변환
	int method3() {
		int a = 3;
		
		return a;
	}
	
//	int method4() {
//		long a = 3L;
		
//		return a; // 안됨
//	}
	
	int method5() {
		short a = 6000;
		
		return a; //자동 형변환
	}
	
	double method6() {
		double d = 3.14;
		return d;
	}
	
	double method7() {
		long l = 33;
		return l; //자동 형변환
	}
	
	// 리턴이 없으면 void로 리턴 타입 명시
	void method8() {
		
		return; //만약 쓴다면 메소드 종료 역할로만 사용 가능
	}
	
}
