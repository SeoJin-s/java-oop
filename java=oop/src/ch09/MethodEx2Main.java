package ch09;
import java.util.*;


public class MethodEx2Main {
	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "티치";
		HashMap<String, Object> map9
			= m2.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
		System.out.println("===========================================");
		
		ArrayList<String> nameList
			=m2.m8a("루피","조로","상디","우솝","나미","쵸파");
		for(String n : nameList) {
			System.out.println(n);
		}
		
		
		//
		ArrayList<HashMap<String, Object>> list7
		 	= new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map1
			= new HashMap<String, Object>();
		map1.put("num",11);
		map1.put("name","샹크스");
		list7.add(map1);
		
		
		HashMap<String, Object> map2
			= new HashMap<String, Object>();
		map2.put("num",21);
		map2.put("name","버기");
		list7.add(map2);
		
		HashMap<String, Object> map3
			= new HashMap<String, Object>();
		map3.put("num",7);
		map3.put("name","프랑키");
		list7.add(map3);
		
		Student[] arr7 = m2.m7a(list7);
		for(Student s : arr7) {
			System.out.println(m2.m25a(s));
		}
		System.out.println("===========================================");
		//
		Student student = m2.m6a(8,"로빈");
			System.out.println(m2.m25a(student));
		System.out.println("==========================================");
		
		//
		int num2 = 100;
		int i = 10;
			 for (int z = i; z >= 0; z--) {
		            System.out.println(z);
			 }
		System.out.println("==========================================");
		
		
		//
		int num = 1004;
		String[] result2 = m2.m5b(num);
		for(String s : result2) {
			System.out.println(s);
		}
		
		//
		ArrayList<String> list
			= new ArrayList<String>();
		list.add("101");
		list.add("200");
		list.add("300");
		int[] result = m2.m4a(list);
		if(result != null) {
		 for (int n : result) {
			 System.out.println(n); // 101 200
		 }
		
	}	
		Student s = new Student();
		s.num = 2;
		s.name = "조로";
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "나미";
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "나미";
		
		// Student 변수를 비교하는 메소드
		System.out.println(s2 == s3); // false
		System.out.println(s2.equals(s3)); // false
		System.out.println(m2.m24c(s2, s3)); // true
		System.out.println(m2.m24c(s, s2)); // false
		
		
		// 디버깅 ( 어떠한 변수를 확인하는 작업 )
		// 디버깅 < 로깅 (모든걸 출력해서 확인해보는작업)
		// s 변수를 디버깅하는 메소드 이고 
		// 반환 타입은 String , 매개 타입은 Student 이다
		System.out.println(m2.m25a(s) ); // s 를 디버깅
		System.out.println(m2.m25a(s2)); // s2 를 디버깅
		// System.out.println(s2.num + "," + s2.name );
		
		// 반환 타입 int
		// 반환 타입 배열
		int[] arr = new int[7];
		System.out.println(m2.m24a(arr)); //7
		System.out.println(m2.m24b(arr));
	}
}
