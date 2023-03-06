package ch07.exercise.exam12;

public class Example {
	public static void action(A a) {
		a.method1();
		if (a instanceof C c) {
			// C c = (C) a;
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
