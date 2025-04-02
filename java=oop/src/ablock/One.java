package ablock;

public class One {
	public int a;	// 모든 곳에서 사용이 가능하다
	protected int b;	// 같은 패키지 내에서만 사용가능하다 / extends 상속받은곳에서는 가능
	int c; // default ( 아무것도 안하는것)	// 같은 패키지 내에서만 사용가능하다
	
	private int d; // 같은 패키지에서도 사용 불가 x 정보 은닉 
					// 프라이빗은 이 패키지 안에서만 사용 가능/ 자기자신만 사용
	public void test() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
}
