package Singleton;

public class Singleton {
	int i = 2;
	private Singleton(){}
	
	private static final Singleton s = new Singleton();
	
	public static Singleton get(){
		return s;
	}
	
	public String toString() {
		return 1 + "";
	}

}
