package ex1;

public class Punct {
	private float x,y;
	
	public Punct(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void changeCoords(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

}
