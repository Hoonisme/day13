package day13_Constructor_Inheritance;

class Constructor01{
	 public Constructor01() {
	System.out.println("생성자 실행");
	}	

public void test() {
	System.out.println("test 실행");
}
}
public class Ex01_Constructor {
	public static void main(String[] args) {
		/*
		 생성자 개요
		 -보통 초기화를 하고자 할때 사용한다.
		 -객체가 생성될때 자동으로 호출된다.
		 생성자 이용 방법.
		 -클래스 이름과 동일하게 만든다.
		 -반환타입은 없어야 한다.
		 
		 */
		Constructor01 con = new Constructor01();
		//con.test();
		
	}
}
