class Interpretation {
	private boolean val[];
	
	public Interpretation () {
		val = new boolean[100];
	}
	
	public void set(int var, boolean x) {
		this.val[var] = x;
	}
	
	public boolean get(int var) {
		return val[var];
	}
}

class Formula {
	public static final int ATOM = 0, NEG = 1, CONJ = 2;
	public int leaf;
	public int type;
	
	//daca e atom
	public Formula (int var) {
		leaf = var;
		type = ATOM;
	}
	
	//daca e negatie sau conj
	Formula left, right;
	public Formula (Formula f) {
		left = f;
		type = NEG;
	}
	 public Formula (Formula left, Formula right) {
		 type = CONJ;
		 this.left = left;
		 this.right = right;
	 }
	public int getAtom() {
		return leaf;
	}
	@Override
	public String toString () {
		switch(this.type) {
		case ATOM: return String.valueOf(leaf);
		case NEG: return this.left.type == ATOM ? "~" + left.toString() : "~(" + left.toString() + ")";
		default: return this.left.toString() + "^" + this.right.toString();
		}
	}
}
public class MC {

	public static boolean Evaluate (Formula f, Interpretation i) {
		switch(f.type) {
		case Formula.ATOM: return i.get(f.leaf);
		case Formula.NEG: return !Evaluate(f.left, i);
		default: return Evaluate(f.left, i) && Evaluate(f.right, i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=1, b=2, c=3;
		Formula f = new Formula (new Formula(a), new Formula(new Formula(new Formula(b), new Formula(new Formula(c)))));
		System.out.println(f);
		Interpretation i = new Interpretation();
		i.set(a, true);
		i.set(b, true);
		//i.set(c, true);
		System.out.println(Evaluate(f, i));
		
//a^~(b^~c)		
	}

}
