package arrays;

public class MyArrayListTest {

	private MyArrayList vector;
	
	public MyArrayListTest(){
		vector = new MyArrayList(3);
		for(int i = 0; i < 3; i++)
			vector.add(i*i);
	}
	
	public boolean test(){
		for(int i = 0; i < 3; i++)
			if(vector.get(i) != vector.v[i])
				return false;
	
	return true;
	}
}
