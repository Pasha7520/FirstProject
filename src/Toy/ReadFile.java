package Toy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFile {
	public static void readFile(HashMap<Integer,Toy> hm ,File file) throws IOException{
		if(file.exists()){
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line ="";
			int index = 1;
			while((line = br.readLine())!=null){
				Toy toy = new Toy();
				String s[] = line.split(" ");
				toy.setName(s[0].substring(s[0].lastIndexOf(".")+1));
				toy.setAgeLimitsMin(Integer.parseInt(s[1].substring(0, s[1].lastIndexOf("-"))));
				toy.setAgeLimitsMax(Integer.parseInt(s[1].substring(s[1].lastIndexOf("-")+1)));
				toy.setPrise(Integer.parseInt(s[2].replace("$","")));
				toy.setFeature(Integer.parseInt(s[3]));
				hm.put(index, toy);
				index++;
			}
			br.close();
			fr.close();
		}
		else System.out.println("File not exist!!");
	}

}
