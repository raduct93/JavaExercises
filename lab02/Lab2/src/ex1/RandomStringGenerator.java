package ex1;

import java.util.Random;

public class RandomStringGenerator {
	private char[] s;
	private int n;
	
	public RandomStringGenerator(int n, String s) {
		this.n = n;
		this.s = s.toCharArray();
	}
	
	public String next() {
		Random gen = new Random();
		//char[] nou = new char[n];
		String str = "";
		for(int i=0;i<n;i++){
			int value = gen.nextInt(s.length);
			str += s[value];
		}
		return str;
	}
}