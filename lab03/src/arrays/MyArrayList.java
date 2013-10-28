package arrays;

public class MyArrayList {
	double[] v;
	public int size = 0;
	public MyArrayList() {
		v = new double[10];
	}
	public MyArrayList (int n) {
		v = new double[n];
	}
	public void add (float value) {
		int len = v.length;
		if (size < len) {
			v[size++] = value;
		}
		else {
			double copy[] = new double[2 * len];
			System.arraycopy(v, 0, copy, 0, len);
			v = copy;
			v[size++] = value;
		}
	}
	
	private int position(float value) {
		int index = 0;
		for(int i = 0; i < size; i++) {
			if(v[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
	public boolean contains(float value){
		for(int i = 0; i < size; i++) {
			if(v[i] == value) 
				return true;
		}
		return false;
	}
	public void remove(int index) {
		if(index > size - 1 || index < 0)
			System.out.println("Depasire la incercare eliminare");
		else
			if(index == size-1)
				size--;
			else
				{v[index] = v[size-1];size--;}
	}
	
	public void removeVal(float value) {
		if (this.contains(value)) {
			remove(position(value));
		}
		else
			System.out.println("Valoarea " + value + " nu exista");
	}
	
	public double get (int index) {
		return this.v[index];
	}
	
	public int size (){
		return size;
	}
	
	public String toString() {
		String str = "[";
		if(size > 0) 
			str += v[0];
		for(int i = 1; i < size; i++)
			str += "," + v[i];
		str += "]";
		return str;
	}
	
}
