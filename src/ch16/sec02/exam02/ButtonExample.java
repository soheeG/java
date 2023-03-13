package ch16.sec02.exam02;

//700쪽(lamda) -> 420쪽(anonymous) -> 412쪽(concrete class)
public class ButtonExample {
	public static void main(String[] args) {
		//Ok 버튼 객체 생성
		Button bntOk = new Button();
		
		//Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		bntOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		//Cancel 버튼 객체 생성
		Button bntCancel = new Button();
		
		//Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		bntCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		//Cancel 버튼 클릭하기
		bntCancel.click();
	}
}
