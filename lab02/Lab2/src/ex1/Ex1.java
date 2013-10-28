package ex1;
import java.util.*;

public class Ex1 {
	
	public static void f() {
		Integer a = new Integer(2+3);
		//Integer b = 2+3;
	}
	
	private static long run() {
	    long start = System.nanoTime();
	    f(); // functia al carei timp de rulare vrem sa-l masuram
	    return System.nanoTime() - start;
	}
	
	public static void showUsedMemory() {
	    long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    System.out.println(usedMem);
	}
	
	public static void umple(){
		int i;
		String s[] = new String[500000];
		showUsedMemory();
		for(i=0;i<500000;i++){
			//s[i] = new String("abc");
			s[i] = "abc";
		}
		showUsedMemory();
	}

	public static void main(String[] args) {
		//task1,2
		float[] v = {1,1,2,3,4,5};
		Poligon pol = new Poligon(v);
		//task3
		System.out.println(run());	
		//task4
		umple();
		//task5
		RandomStringGenerator rsg = new RandomStringGenerator(10, "abcdefgh");
		System.out.println(rsg.next());
		System.out.println(rsg.next());
		//task6
		PasswordMaker pass = new PasswordMaker("Cristi", "Marin", 20);
		System.out.println(pass.getPassword());
		//task7
		Test t1 = new Test(2,3);
		t1.print();
		Test t2 = new Test(4,5);
		t1.print();
		t2.print();
	}

}
