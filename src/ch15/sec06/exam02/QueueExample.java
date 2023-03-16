package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		//Queue 컬렉션 저장
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지 넣기
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "감자바"));
		
		//메세지를 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
 				case "sendMail" :
 					System.out.println(message.to + "님께 메일을 보냅니다.");
 					break;
 				case "sendSMS" :
 					System.out.println(message.to + "님께 SMS를 보냅니다.");
 					break;
 				case "sendKakaotalk" :
 					System.out.println(message.to + "님께 카카오톡 보냅니다.");
 					break;
			}
		}
	}
}
