package ch05.lecture.p09main;

public class C01MainArguments {
	public static void main(String[] args) {
		// argument 없이 실행
		// java C01MainArguments (실행 버튼 누르면 자바가 이 일을 실행)
		
		// argument 전달 실행
		// java C01MainArguments Hello Java
		
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
//		System.out.println(args[2]);
		System.out.println("명령문들...");
	}
}
