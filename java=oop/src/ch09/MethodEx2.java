package ch09;
import java.util.*;

public class MethodEx2 {
	
	// 반환 타입 : Map
	// 매개 타입 : Student
	public HashMap<String, Object> m9a(Student s) {
		HashMap<String, Object> result
			= new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
	
	
	
	// 반환 타입 : List<String>
	// 매개 타입 : 임의의 개수의 문자열?
	// String ... name <<  책 275p
	public ArrayList<String> m8a(String ... name) {	// 이렇게 쓰면 어러개의 문자가 들어온다
		ArrayList<String> result = new ArrayList<String>();
			for(String n : name ) {
				result.add(n);
			}
		return result;
	}
	
	
	// 반환 타입 : Student[] 클래스 배열
	// 매개 타입 : List<Map>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		// ArrayList의 크기에 맞는 Student 배열을 생성
		Student[] arr = new Student[list.size()];
		// list 크기에 맞춰 Student 배열 생성
		int i = 0;  // 배열의 인덱스를 추적할 변수 초기화
		for(HashMap<String,Object> m: list) {
			// list 의 각 HashMap을 순회하면서 Student 객체를 생성하고 값을 할당
			arr[i] = new Student();
				// 새로운 Student 객체 생성
			arr[i].num = (Integer)m.get("num");
			 // HashMap에서 "num" 값을 가져와 Student 객체의 num 필드에 할당
			arr[i].name = (String)m.get("name");
			 // HashMap에서 "name" 값을 가져와 Student 객체의 name 필드에 할당
			i=i+1; // 배열의 인덱스를 증가시킴
		}
		return arr;   // 최종적으로 Student 배열을 반환
	}
	
	
	// 반환 타입 : 클래스
	// 매개 타입 : int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num = num;
		s.name = name;
		return s;
	}
	
	
	
	// 반환 타입 : 배열
	// 매개 타입 : int
	// 252 -> {2, 5, 2}
	public int[] m5a(int num) {	// 나누기 연산
		int[] result = null;
		return result;
	}
	// 252 -> {"2","5","2"}
	public String[] m5b(int num) { // substring() 메소드
		String[] result = null;
		String str = num+""; 
		//숫자 num 을 문자열로 변환, ""을 덧붙이면 자동으로 숫자가 문자열로 변환
		
		// str 문자열의 길이에 맞는 크기의 String 배열을 생성
		result = new String[str.length()];
		
		// 문자열의 각 문자들을 하나씩 배열에 저장
		for(int i=0; i<result.length;i++) {
			// 마지막 자리를 제외한 모든 자리수는 substring(i, i+1)로 하나의 문자씩 추출
			if(i != result.length-1) {
			
			result[i] = str.substring(i, i+1);
			// substring(i, i+1)은 str에서 하나의 문자만 추출 ( 0,1) (1,2)	
		}else { // 마지막 자리는 substring(i)로 남은 부분 모두 추출 (마지막 문자만 남기기)
			result[i] = str.substring(i);
		}
	}
		return result;
}
	
	
	// 반환 타입 : 배열
	// 매개 타입 : List
	// List 를 입력 받아서 배열로 변경하여 반환
	public int[] m4a(ArrayList<String> list) {
		int[] result = new int[list.size()]; 
		// 동일한 크기의 배열을 만든다. ArrayList의 크기와 동일하게 배열을 생성한다.
		
		// 반복문에서 인덱스를 사용할 변수를 선언
		int i = 0;
		// 리스트에서 하나씩 String 을 가져와서
		for(String s : list) {
			 // String 을 Integer 로 파싱하여 배열에 저장
			result[i] = Integer.parseInt(s);
			 // 배열의 다음 인덱스로 이동
			i=i+1;
		}
		return result;
	}
	
	
	// 반환 타입 : boolean
	// 매개 타입 : 클래스 두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		// s1 , s2 를 비교하는 코드
		if (s1.num == s2.num && s1.name.equals(s2.name)) {
			result =true;
		}		
		return result;
	}
	
	
	// Student 타입을 디버깅하는 메소드
	// 반환 타입 : String
	// 매개 타입 : 클래스 하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는" + s.num + "이고, ";
		result += "이름은" + s.name + "입니다.";
		return result;	// s 의 번호는 ? 이고, 이름은 ? 입니다.
	}
	
	
	
	
	
	
	// 반환 타입이 숫자 
	// 매개 타입이 배열 : 배열
	// 배열.length API (arr.length) 사용 금지 
	// 배열을 입력하면 반환값으로 배열의 길이가 반환
	
	public int m24b(int[] arr) {	// ex) int x = new int[7]
		int result = 0;	// arr.length 사용금지
		boolean flag = true;
		int i=0;
		while(flag) {// 무한루프
			try {
				int temp = arr[i];
			} catch(Exception e) {	
				return result;
			}	
				i++;
		}
		
		return result;
	}

	public int m24a(int[] arr) {
		int result = 0; 	// arr.length 사용금지
		for(int i : arr) {
			result++;
		}
		return result;
	}
}
