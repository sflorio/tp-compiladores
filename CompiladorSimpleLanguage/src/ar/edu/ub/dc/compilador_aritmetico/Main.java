package ar.edu.ub.dc.compilador_aritmetico;

import java.io.FileReader;
import java.util.HashMap;

import java_cup.action_production;



public class Main {
	
	public static void main(String[] args) throws Exception {
		new Parser(new Scanner(new FileReader("resources/programa.txt"))).parse();	
		
	}

}