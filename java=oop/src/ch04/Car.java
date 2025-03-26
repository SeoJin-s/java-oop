package ch04;

public class Car {
	public Car() {
	}
	public boolean onOff;
	public void move() {
		if(this.onOff) {		// this 는 현재 객체(instance) 자체를 가리키는 참조 변수
			System.out.println("자동차 Move!");
		}else {
			System.out.println("시동부터 켜라..!");
		}
	}
}
