package ex1;

public class Poligon {
	public Punct[] poligon;
	
	public Poligon(int n) {
		poligon = new Punct[n];
	}
	
	public Poligon(float[] v) {
		this(3);
		for(byte i=0; i<6; i+=2) {
			poligon[i/2] = new Punct(v[i], v[i+1]);
			poligon[i/2].print();
		}
	}
}
