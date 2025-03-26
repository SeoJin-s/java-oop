package ch03;

public class Car {
	public Car() {} // 생성자(Constructor) 없으면 컴파일러에 의해 자동으로 생성된다. new Car();가 실행될 때 자동으로 호출 된다.
	
	public boolean onOff;
	public String name;
	public String color;
	
	public void move() {
		System.out.println("move");
	}
}
