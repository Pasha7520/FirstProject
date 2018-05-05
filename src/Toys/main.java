package Toys;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;


public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ.txt");
		ArrayList<Toy> ar = new ArrayList<Toy>();
		ReadTheFile rtf = new ReadTheFile();
		ar = rtf.readFileToArrayList(file);
		
		//lol
		//Sort.sortArray(ar,2);
		
		
		//Task= 1;
		//Sort.sort1(ar,15);
	
		//Task= 2;
		//Sort.sort2(ar);
		
		//Task= 3;
		//Sort.sort3(ar);
		
		//Task= 4;
		//Sort.sort4(ar, 3, 6);
		
		//Task= 5;
		//Sort.sort5(ar, "cubes");
		
		//Task= 6;
		//Sort.sort6(ar, "ball", 3);
		
		//Task= 7;
		//Sort.sort7(ar, "ball", 16, 3, 6);
		
		//Task=8;
		//Sort.sort8(ar, "doll", 3, 45);
		
		//Task=9;
		//Sort.sort9(ar, "cubes", 4, 22);
		
		//Task=10;
		//Sort.sort10(ar,25);
		
		//Task= 11;
		//Sort.sort11(ar, 160, 3);
		
		////Task= 12;
		//Sort.sort12(ar, "desingner");
		
		//Task= 13;
		//Sort.sort13(ar, 26);
		
		//Task=14;
		//Sort.sort14(ar,4,5);
		
		//Task=15;
		//Sort.sort15(ar, "desingner");
		
		//Task = 16;
		//Sort.sort16(ar,"ball",4);
		
		//Task=17;
		//Sort.sort17(ar, "desingner",1000,4);

		//Task=18;
		//Sort.sort18(ar, 58, 3);
		
		//Task=19;
		//Sort.sort19(ar, 100, 3);
		
		//Task=20;
		//Sort.sort20(ar,30);
		
		Hashtable<Integer,Toys> ht = rtf.readFileToHashTable(file);
		//Task=21;
		//Sort.sort21(ht);
		
		//Task = 22;
		//Sort.sort22(ht);
		
		//Task=23;
		Sort.sort23(ht,22);
	}

}
