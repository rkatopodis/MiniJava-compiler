package minijava.ast;

import java.util.List;

public class Prog {
	public String main;
	public String args;
	public Cmd cmd;
	public List<Classe> classes;
	
	public Prog(String _main, String _args, Cmd _cmd, List<Classe> _classes) {
		main = _main;
		args = _args;
		cmd = _cmd;
		classes = _classes;
	}

	public String toString() {
		String res = "class " + main + " {\n  public static void main(String[] " + args +
				") {\n" + cmd + "\n  }\n}\n";
		for(Classe classe: classes)
			res += classe + "\n";
		return res;
	}
}
