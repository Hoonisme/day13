package day13_Constructor_Inheritance;
class Calc01{
	public Calc01(String S) {
		System.out.println(S + "calc 부모 생성자");
	}
	public void display() {
		System.out.println("부모 나는 계산기야");
	}
	public int sum(int A , int B) {
		
		System.out.println(A+B);
		return A+B;
	}
}
class Computer01 extends Calc01{
	public Computer01() {
		super("값 전달");
		System.out.println("com 자식 생성자");
	}
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}
public class Ex05_Inheritance {
	public static void main(String[] args) {
		/*
		상속
		-Extends를 통해 만든다.
		-새로운 기능을 추가한다. 
		-부모가 있으면 부모부터 실행후에 자식에 있는 코드들 값 실행
		 */
		Computer01 com = new Computer01();
		com.print();com.display(); com.sum(10,11);
	}

}
