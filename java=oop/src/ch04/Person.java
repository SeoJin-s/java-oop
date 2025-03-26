package ch04;

//this 는 현재 객체(instance) 자체를 가리키는 참조 변수

public class Person {
	public void dirve() {
		Car c1 = new Car();
		c1.move();	// this -> c1
		
		Car c2 = new Car();
		c2.onOff = true;
		c2.move(); // this -> c2
	}
}
