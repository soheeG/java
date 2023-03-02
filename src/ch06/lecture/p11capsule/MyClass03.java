package ch06.lecture.p11capsule;

public class MyClass03 {

	private String name;
	private int age;
	private String address;
	private boolean married;
	
	// 메소드 통해서 필드에 접근하도록 하는데
	// 메소드 이름을 아래와 같이 설정
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	//boolean 타입의 getter는 is로 시작
	public boolean isMarried() {
		return this.married;
	}
	
	public void setName(String name) {
		//변경, 쓰기
		this.name = name;
	}
	
	public String getName() {
		//읽기
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
}
