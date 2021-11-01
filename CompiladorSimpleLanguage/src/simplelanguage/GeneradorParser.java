package simplelanguage;

public class GeneradorParser {

	public static void main(String[] args) throws Exception {
		String opciones[] = new String[] {"-destdir", "src/simplelanguage" , "-parser", 
				"Parser", "src/simplelanguage/Aritmetico.cup"};
		java_cup.Main.main(opciones);
	}

}