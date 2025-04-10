package ch14;

public class Main {
	public static void main(String[] args) {
		Person jjs = new Person();
		
		// 오버라이딩을 사용후 
		Dog d = new Dog();
		jjs.withWalk(d);	// Pet p = d;
		
		Snake s = new Snake();
		jjs.withWalk(s);
		
		Kangaroo k = new Kangaroo();
		jjs.withWalk(k);
		
		
	}	
}	
		// 오버라이딩을 사용하기 전
	/*	
		Dog d = new Dog();
		jjs.withWalkDog(d);
		
		Snake s = new Snake();
		jjs.withWalkSnake(s);
		
		Kangaroo k = new Kangaroo();
		jjs.withWalkKangaroo(k);
	}
	*/

