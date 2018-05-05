package Toy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class main {
	public static void main(String[] args)throws IOException{
		File toys = new File("C:\\Users\\ÿ\\Desktop\\Toy","Toys.txt");
		HashMap<Integer,Toy> hm = new HashMap<Integer,Toy>();

		ReadFile.readFile(hm, toys);
		Task.task30(hm,30);
	}
}
