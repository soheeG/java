package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
//		a1.run(); //불가능
		
		Horse h1 = (Horse) a1; //강제 타입 변환(type cast)
		h1.run(); //가능 (위험 부담 있음)
		
		Animal a2 = new Fish();
		a2.breath();
//		a2.swim(); //불가능
		
		Fish f1 = (Fish) a2; //강제 타입 변환(type casting)
		f1.swim(); //가능 (위험 부담 있음)
	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	public void swim() {
		System.out.println("헤엄치다.");
	}
}
class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
		}
	public void run() {
		System.out.println("달리다.");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다");
	}
}
