package Pharmasy;

import java.io.File;
import java.util.ArrayList;

public class Playlist {
	
	public static void readPleylist(String name,ArrayList<String> ar){
		File file = new File("C:\\Users\\ÿ\\Desktop\\pharmasy\\music\\"+name);
		int num =0;
		if(file.exists()){
		File songs[] = file.listFiles();
		for(File f : songs){
			ar.add(f.getAbsolutePath());
			System.out.println(++num+"."+f.getName());
		}
		}
	}
	
}
