package ch07;
//캡슐화 해야한다
public class Calculator {
	public Calculator() {
		this.power = false;
	}
	public boolean power;
	// static 을 쓰냐 안쓰냐는 this 를 쓰냐 안쓰냐에 따라서 
	public int num;
	
	public void setPower() {
		this.power = !this.power;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	// this.num 이 짝수인지 홀수인지 알고 싶은 메소드
	public String checkNum() {
		String result = "";
		if(this.num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
	}
}
