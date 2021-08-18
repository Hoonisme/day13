package day13_Constructor_Inheritance;

class Singlenton01{
	public int num;	
}

public class Ex03_singleton {
	public static void main(String[] args) {
		Singlenton01 si = new Singlenton01();
		Singlenton01 si02 = si;
	si.num = 12345;
	si02.num = 4444;
	System.out.println(si.num);
	System.out.println(si02.num);
	
	System.out.println("si : "+si);
	System.out.println("si02 : "+si02);
	}
}
