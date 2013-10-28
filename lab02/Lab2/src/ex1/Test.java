package ex1;

public class Test {
	private int a;
	private static int b;
	
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println(a + " " + b);
	}
}
