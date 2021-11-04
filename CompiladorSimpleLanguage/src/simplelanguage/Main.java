package simplelanguage;

import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		new Parser(new Scanner(new FileReader("resources/while_tests.txt"))).parse();	
		
		//new Parser(new Scanner(new FileReader("resources/programa.txt"))).parse();
		
	}

}