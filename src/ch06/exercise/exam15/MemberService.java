package ch06.exercise.exam15;

public class MemberService {

	public boolean login(String id, String password) {
	
		if (id == "hong" && password == "12345") {
		}
		return true;
	}
	
//	public boolean login(String id, String password) {
//		return id.equals("hong") && password.eqqals("12345");
//  }
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
	
}
