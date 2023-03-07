package ch07.lecture.p08super;

public class C01Super {
	Sub01 o1 = new Sub01();
}

class Super01 {
	//생성자_이 클래스로 인스턴스 만들 때 해야하는 일
	Super01() {
		System.out.println("상위 클래스 초기화 코드");
	}
}
class Sub01 extends Super01 {
	Sub01() {
	//그 전에 상위클래스의 초기화 작업을 먼저 해야 함
	//상위 클래스 생성자 호출 코드
	super(); // 꼭 먼저! 해야 함(작성하지 않으면 자동으로 삽입됨)
	//생성자_이 클래스로 인스턴스 만들 떄 해야하는 일
	System.out.println("하위 클래스 초기화 코드");
	}
}