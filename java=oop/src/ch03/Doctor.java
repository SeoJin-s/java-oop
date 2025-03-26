package ch03;

// Doctor 는 Person 에 종속되어 있기때문에 Person 에 있는건 다 가져야한다

public class Doctor {
	public Person person; // 집합 관계(포함관계) 관계가 있어야한다
	public String major;
}
