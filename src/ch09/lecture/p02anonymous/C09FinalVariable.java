package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의 
	// 지역 변수(파라미터)를 사용할 수 있다.
	// 이 때 이 지역변수(파라미터)는 final 이어야 한다.
	
	public static void main(String[] args) {
		final int i = 10;
//		i = 11; //final 이라서 불가능
		
		class LocalClass {
			void method1() {
				System.out.println(i);
			}
		}
	}
	
	public void method1() {
		int i = 1; //effectively final(사실상 파이널)
//		i = 2;// 사실상 파이널이라 불가능
		class LocalClass {
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	public void method2(int param) {
		class LocalClass {
			void method3() {
				System.out.println(param);
			}
		}
	}
	//effectively fina parameter
	public void method3(int param) {
//		param = 3; 
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
}
