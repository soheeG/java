package ch02.lecture.p01variable;

public class C01Variable {
	public static void main(String[] args) {
		
	// 변수 : 값을 담을 수 있는 이름이 있는 공간
	
	// 변수 선언 : 타입 변수명; << 나란히 작성
	int age; 
	double average;
	
	// 변수명
	// 영문 대소문자,_,$,숫자 조합으로 작성 가능, 숫자로 시작하면 안됨
	// 변수명 작성 관습 : lowerCamelCase
	int $;
//	int_; // _만 작성하는 변수명은 불가
	int a_b; 
	int hello;
	int your_age;
	int h3; 
//	int 3h; // 숫자로 시작 불가
	int yourAge; // 관습에 적합
	int 나이; // 사용하지 말 것
	
	// 변수를 여러 개 선언 가능
	int myAge, hiAge, herAge;

	// 같은 이름의 변수 선언 불가
	int hi;
//  int hi; // X
	
	// 변수에 값 대입(할당) : =
	hi = 3;
	int var1;
	var1 = 99;
	
	// 변수 선언과 값 대입을 동시에 할 수 있음
	int var2 = 100;
	
	// 여러개 가능
	int var3 = 20, var4 = 30;
	
	// 값을 할당하지 않은 변수 사용 불가
	// 초기화 하지 않은 변수 사용 불가
	int var5;
//	System.out.println(var5); // X
	
	// 변수명 작성 시 어떤 값을 갖는지 알아볼 수 있게 해야 함
	int koreanScore;
	int ks; // 어떤 값을 저장하는 변수인지 명확히 확인 어려움
	int englishScore;
	
	}
}
