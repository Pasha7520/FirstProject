package Toys;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class ReadTheFile {
		
		
	
	public ArrayList<Toy> readFileToArrayList(File f) throws IOException{
		ArrayList<Toy> list = new ArrayList<Toy>();
		if(f.exists()){
			String line ="";
			String s="";
			boolean b = false;
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			while((line = br.readLine())!=null){
				if(b) s+="\n";
				s +=line;
				b = true;
			}
			String strings[] = s.split("\n");
			for(int i=0;i < strings.length;i++){
				String words[] = strings[i].split(" ");
				if(words[0].substring(words[0].lastIndexOf(".")+1).equals("Doll")){
					int min =0;
					int maxx =0;
					for(int j = 0; j < words[2].length();j++){
						if((words[2].charAt(j))=='-'){
							 min = Integer.parseInt(words[2].substring(0, j));
							 maxx = Integer.parseInt(words[2].substring(j+1));
						}
					}
					
					Doll doll = new Doll(Integer.parseInt(words[1].replace("$","")),min,maxx,Integer.parseInt(words[3]));
					list.add(doll);
				}
				if(words[0].substring(words[0].lastIndexOf(".")+1).equals("Ball")){
					int min = 0;
					int max = 0;
					for(int j = 0; j < words[2].length();j++){
						if((words[2].charAt(j))=='-'){
							 min = Integer.parseInt(words[2].substring(0, j));
							 max = Integer.parseInt(words[2].substring(j+1));
						}
					}
					Ball ball = new Ball(Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[3]));
					list.add(ball);
				}
				if(words[0].substring(words[0].lastIndexOf(".")+1).equals("Cubes")){
					int min = 0;
					int max = 0;
					for(int j = 0; j < words[2].length();j++){
						if((words[2].charAt(j))=='-'){
							 min = Integer.parseInt(words[2].substring(0, j));
							 max = Integer.parseInt(words[2].substring(j+1));
						}
					}
					Cubes cubes = new Cubes(Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[3]));
					list.add(cubes);
				}
				if(words[0].substring(words[0].lastIndexOf(".")+1).equals("Designer")){
					int min = 0;
					int max = 0;
					for(int j = 0; j < words[2].length();j++){
						if((words[2].charAt(j))=='-'){
							 min = Integer.parseInt(words[2].substring(0, j));
							 max = Integer.parseInt(words[2].substring(j+1));
						}
					}
					Designer des = new Designer (Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[3]));
					list.add(des);
				}
				
				
			}
			
			
			
			
		} else System.out.println("File doesn't exist!!");
		
		
		
		
		return list;
	}
	public Hashtable<Integer,Toys> readFileToHashTable(File f) throws IOException{
		Hashtable<Integer,Toys> ht = new Hashtable<Integer,Toys>();
		if(f.exists()){
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line="";
		String s = "";
		boolean b = false;
		while((line = br.readLine())!=null){
			if(b)s+="\n";
			s += line;
			b = true;
		}
		String strings[] = s.split("\n");
		for(int i=0;i < strings.length;i++){
			if(strings[i].matches("(.*)Doll(.*)")){
				String words [] = strings[i].split(" ");
				Toys td = new Toys();
				int min = Integer.parseInt(words[2].substring(0,words[2].lastIndexOf("-")));
				int max = Integer.parseInt(words[2].substring(words[2].lastIndexOf("-")+1));
				Doll doll = new Doll(Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[words.length-1]));
				td.setDoll(doll);
				ht.put(i, td);
				
			}
			if(strings[i].matches("(.*)Ball(.*)")){
				String words [] = strings[i].split(" ");
				Toys tb = new Toys();
				Ball ball = new Ball(Integer.parseInt(words[1].replace("$", "")),Integer.parseInt(words[2].substring(0,words[2].lastIndexOf("-"))),
						Integer.parseInt(words[2].substring(words[2].lastIndexOf("-")+1)),
						Integer.parseInt(words[words.length-1]));
				tb.setBall(ball);
				ht.put(i, tb);
			}
			if(strings[i].matches("(.*)Cubes(.*)")){
				String words[] = strings[i].split(" ");
				Toys tc = new Toys();
				int min =Integer.parseInt(words[2].substring(0,words[2].lastIndexOf("-")));
				int max = Integer.parseInt(words[2].substring(words[2].lastIndexOf("-")+1));
				Cubes cubes = new Cubes(Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[words.length-1]));
				tc.setCubes(cubes);
				ht.put(i, tc);
			}
			if(strings[i].matches("(.*)Designer(.*)")){
				String words[] = strings[i].split(" ");
				Toys tDes = new Toys();
				int min =Integer.parseInt(words[2].substring(0,words[2].lastIndexOf("-")));
				int max = Integer.parseInt(words[2].substring(words[2].lastIndexOf("-")+1));
				Designer designer = new Designer(Integer.parseInt(words[1].replace("$", "")),min,max,Integer.parseInt(words[words.length-1]));
				tDes.setDesigner(designer);
				ht.put(i,tDes);
				}
			}
		br.close();
		fr.close();
		}
		else System.out.println("File Doesn't exist");
		return ht;
	}

}
