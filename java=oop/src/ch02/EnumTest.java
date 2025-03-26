package ch02;

public class EnumTest {

	public static void main(String[] args) {
		char gender = 'M'; // M , F 가 아닌 다른 값이 대입이 될 수 있다 
		
		if(gender == 'ㅁ') {
			System.out.println("남자");
		} else if(gender =='F'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 값입니다.");
		}
		
		// Enum 사용시 잘못된 값이 대입 될수 있다.
		Gender gender2 = null;
		gender2 = Gender.MALE;
		
		if(gender2 == Gender.MALE) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		// Enum 사용시 if 문보다 switch 문이 가독성이 높을수있다 하지만 제대로 사용 못할시 가독성이 떨어질수 있다.
		switch(gender2) {	// switch 는 조건이 맞으면 모두 출력이 되기 때문에 break; 가 필요하다 // 모든 switch 문은 if 문으로 사용할수있다
		case Gender.MALE :
			System.out.println("남자");
			break;
		case Gender.FEMALE :
			System.out.println("여자");
		
			break;
		}
	}
}
