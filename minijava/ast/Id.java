package minijava.ast;

public class Id implements Exp {
	public String nome;
	public int lin;
	
	public Id(String _nome, int _lin) {
		nome = _nome;
		lin = _lin;
	}

	public String toString() {
		return nome;
	}
}
