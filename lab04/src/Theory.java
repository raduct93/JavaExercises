
import java.util.*;

class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Wolf extends Animal {
	public void eat() {
		System.out.println("Wolf is eating");
	}
	
	public void howl () {
		System.out.println("Wolf: Howl");
	}
}

class Ship extends Animal {
	public void mehe() {
		System.out.println("Ship: mehe!");
	}
}

class Test {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Wolf();
		a[1] = new Ship();
		
		a[0].eat();
		a[1].eat();
		if(a[0] instanceof Wolf) {
			((Wolf)a[0]).howl();
		}
		if(a[1] instanceof Ship) {
			((Ship)a[1]).mehe();
		}
	}
}