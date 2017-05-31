package minijava.ast;

public class Vetor implements Exp {
	public Exp tam;
	public int lin;
	
	public Vetor(Exp _tam, int _lin) {
		tam = _tam;
		lin = _lin;
	}

	public String toString() {
		return "new int[" + tam + "]";
	}
}
