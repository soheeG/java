package ch13.sec02.exam02;

//타입 파리미터 P를 Car로 대체
public class CarAgency implements Rentable<Car>{
	@Override
	public Car rent() {
		return new Car(); //리턴 타입이 반드시 Car이어야 함
	}
}
