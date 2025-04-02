package dto;

public class MemberMain {

	public static void main(String[] args) {
		// 필드값 수정
		// 정보 은닉 ( private ) 을 썼기 때문에 사용 x
		
		Member m1 = new Member();
		
		//m1.id = "zoro";
			m1.setId("zoro");
		
		//m1.age = 22;
			m1.setAge(22);
		//m1.pw = "1234";
			m1.setPw("1234");
		//캡슐화 메소드 ( setter) 를 사용해야한다
		
		
		
		// 필드값 읽기 
		// 정보 은닉 ( private ) 을 썼기 때문에 사용 x
		/*
		System.out.println(m1.id);
		System.out.println(m1.age);
		System.out.println(m1.pw);
		*/
		//캡슐화 메소드 (getter) 를 사용해야한다
		System.out.println(m1.getId());
		System.out.println(m1.getAge());
		System.out.println(m1.getPw());
	}

}
