package Test;

import arrays.*;
import java.util.*;
import Singleton.*;

public class Test {

	public static void scenariu(){
		
		MyArrayList list = new MyArrayList(10);
		Random generator = new Random();
		for(int i = 0; i < 10; i++)
			list.add(generator.nextInt(10));
		System.out.println("The random list is: "+list);
		
		System.out.println("Check contains:");
		for(int i = 0; i < 5; i++){
			int x = generator.nextInt(10);
			System.out.print(x+"->"+list.contains(x) + " ");
		}
		
		for(int i = 0; i < 5; i++){
			int x = generator.nextInt(10);
			System.out.println("Removes " + x);
			list.removeVal(x);
		}
		System.out.println();
		System.out.println("After remove: "+list);
	}
	
	public static void main(String[] args) {
		
		//Ex.2
		boolean test = new MyArrayListTest().test();
		System.out.println("Exercise two: "+test);
		//Ex.3
		scenariu();
		//Ex.4
		Singleton s = Singleton.get();
		System.out.println(s);
		
	}

}
