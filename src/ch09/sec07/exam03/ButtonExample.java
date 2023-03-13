package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//OK 버튼 객체 생성
		Button bntOk = new Button();
	    
		
		//Ok 버튼 객체에 ClickListener 구현 객ㅊ 주입
		bntOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		
		//Ok 버튼 클릭하기
		bntOk.click();
		
		//---------------------------------------------------------
		
		//Cancel 버튼 객체 생성
		Button bntCancel = new Button();
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		bntCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");		
			}
		});
		
		//Cancel 버튼 클릭하기
		bntCancel.click();
	}
}
