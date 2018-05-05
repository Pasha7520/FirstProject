package File2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File5 {
	public static void calcul13(File f) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int words = 0;
		int chars = 0;
		int lines = 0;
		boolean prob = true;
		String s = "";
		while((s=br.readLine())!=null){
			lines++;
			chars+=s.length();
			prob = true;
			for(int i=0;i<s.length();i++){
				if((s.charAt(i))!=' '){
					if(prob){
						words++;
						prob = false;
					}
				}
				else {prob = true;}
			}
			
		}
		System.out.println("Chars :"+chars);
		System.out.println("Lines :"+lines);
		System.out.println("Words :"+words);
		
		
		
	}
}
