package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	//static initialization block : (주로)스테틱 필드 초기화
	//정적 초기화 블럭
	static {
		//명령문들
		info = company + "-" + model;
	}
}
