package ch11;

public class B {	// A 의 객체가 할 수있는것들은 다 가능하다
	// has (포함)
	public A a;
	public int y;
	public void m2()	{
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		B b = new B(); // b는 B의 객체 - A 의 객체가 할 수있는것들은 다 가능하다
		b.a = new A();
		b.a.x = 1;
		b.y = 2;
		b.m2();
		b.a.m1();
		b.a.name = "goodee";
	}
	
}
