package ch11;
// 정보처리 기사 문제들을 보면 다 나와있으니 정보처리기사쪽을 공부해볼것

public class D extends C {	// extends A를 상속 받고 extends C를 상속 받는다 
	// 순서
	// 1) extends A
	// 2) extends C
	//	그래서 D는 A것도 가지고 C 도 갖게 된다
	public int k;
	public D() {
		super();   // 부모 생성자를 호출  C를 호출하고 그다음 A도 호출을 한다
		this.k = 0;
		// this ....
		// Object : super.super.super......
		// A() 를 호출해서 만드는게 : x, name, m1()
		// C() 를 호출해서 만드는게 : z, m3()
		// D() 는 K를 호출
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.name = "goodee";
		d.m1();
		d.x = 1;	// this.x 는 없다 그래서 super.z 올라가서 x를 찾는데 없으니 super.super.x 까지 올라가서 찾는다
		d.z = 2;	// this.z 는 없다 그래서 super.z를 보니 있다
		d.k = 3;	// this.k 는 있다.
	}
}
