class Test {
    public static void main(String[] args) {
        try {
            java.io.FileReader f = new java.io.FileReader("treevisitor.java");
minijava.Parser parser = new minijava.Parser(f);
parser.parse();
String saida = parser.saida.toString();
java.io.StringReader sr = new java.io.StringReader(saida);
parser = new minijava.Parser(sr);
parser.parse();
String saida2 = parser.saida.toString();
System.out.println(saida.equals(saida2));
        } catch(Exception e) {}
    }
}