class Test {
    public static void main(String[] args) {
        try {
           java.io.FileReader f = new java.io.FileReader("binarysearch.java");
minijava.Scanner scan = new minijava.Scanner(f);
for(minijava.Token tok: scan.tokens()) 
	System.out.println(tok);
        } catch(Exception e) {}
    }
}