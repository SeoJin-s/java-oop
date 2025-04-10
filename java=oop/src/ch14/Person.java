package ch14;

public class Person {
	// 산책하는 메소드
	
	public void withWalk(Pet p) {	// 오버라이딩을 사용했다 다향성을 위해서 후에 관리하기도 편하기때문에 
									// 밑에 코드가 오버라이딩을 사용해서 위에 처럼 간결해짐
		p.move();
	}
	
	/*
	public void withWalkDog(Dog d) {
		d.move();
	}
	public void withWalkSnake(Snake s) {
		s.move();
	}
	public void withWalkKangaroo(Kangaroo k) {
		k.move();
	}
		*/
}
