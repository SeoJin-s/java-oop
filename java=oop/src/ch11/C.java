package ch11;

// is (상속 관계)
public class C extends A {	// extens << 상속
	public C() {
		super();
		this.z = 0;
		// .....
	}	
	public int z;
	public void m3() {
		System.out.println("m3");
	}
	
	// 객체 지향을 쓰고 싶을때는 상속을 사용한다
	
	public static void main(String[] args) {
		C c = new C();
		c.x = 1;
		c.m1();
		
		c.z = 2;
		c.m3();
		c.name = "goodee";
	}
}
