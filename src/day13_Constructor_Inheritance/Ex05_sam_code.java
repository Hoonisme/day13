package day13_Constructor_Inheritance;

class Calc02{
    public Calc02(String s) { System.out.println(s + " : calc 부모 생성자"); }
    public void disply() { System.out.println("부모 나는 계산기야"); }
}
class Computer02 extends Calc02{
    public Computer02() {
            super("값 전달");
            System.out.println("com 자식 생성자");
    }
    public void print() { System.out.println("나는 컴퓨터야"); }
}
public class Ex05_sam_code {
    public static void main(String[] args) {
            Computer02 com = new Computer02();
            com.print(); com.disply();
    }
}