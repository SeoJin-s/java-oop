package ch13;

public class B extends A {
	//final int x = 10;	// 필드 앞에 파이널이 붙어 있으면 값을 바꿀수 없다.
	
	//이럴때 final 을 많이 사용 한다.
	public int add(final int x, final int y) { 
		return x+y;
	}
	
	
	/*
	@Override
	public void test() {
		this.x = 9;
	}
	*/
}
