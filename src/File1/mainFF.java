package File1;

import java.io.*;

import javax.imageio.IIOException;

public class mainFF {
	public static void main(String [] args) throws IOException{
		File f2 = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ (5).txt");
		File f3 = new File("C:\\Users\\я\\Desktop\\file","Новый текстовый документ (55).txt");
		//System.out.println(f2.renameTo("dewe.txt"));
		f2.renameTo(f3);
		//File1.copyF(f2);
		//File1.printFile(f3);
		
		
	}
}
