package minijava.ast;

public class Neg implements Exp {
	public Exp e;
	public int lin;
	
	public Neg(Exp _e, int _lin) {
		e = _e;
		lin = _lin;
	}
	
	public String toString() {
		return "(-" + e + ")";
	}
}
