package Pharmasy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Track {

	public static void showTracks(User user) throws IOException{
		File file = new File("D:\\Music");
		ArrayList<File> ar = new ArrayList<File>();
		if(file.exists()){
			writeTracks(file,ar);
			pickSong(ar,user);
			
		}
		else System.out.println("File non-existed!!");
	}
	public static void writeTracks(File f,ArrayList<File> ar){
		
			if(f.isDirectory()){
				File files []= f.listFiles();
			outer:	for(File ff : files){
					if(ff.isDirectory()){
						writeTracks(ff,ar);
						continue outer;
					}
					else{
						ar.add(ff);
					}
				}
			}
			
		
	}
	public static void printSongs(ArrayList<File> ar){
		int num = 0;
		for(File f:ar){
			System.out.println(++num+"."+f.getName());
		}
	}
	public static void pickSong(ArrayList<File> ar,User user) throws IOException{
		File f = new File("C:\\Users\\ÿ\\Desktop\\pharmasy\\music\\"+user.getName());
		if(f.exists());
		else f.mkdir();
		Scanner scn = new Scanner(System.in);
		int done =1;
		while(!(done==2)){
			printSongs(ar);
			System.out.println("Please pick song!!");
			int position = scn.nextInt();
			
			File SelectedSong = new File(ar.get(position-1).getAbsolutePath());
			File addedSong = new File(f.getAbsolutePath(),ar.get(position-1).getName());
			putInAFolder(SelectedSong,addedSong);
			ar.remove(position -1);
			System.out.println("Song added!!");
			System.out.println("continue ?Yes - pick \"1\"; No - pick\"2\"");
			done = scn.nextInt();
		}
	}
	public static void putInAFolder(File selSong ,File addSong ) {
		try {
			Files.copy(selSong.toPath(), addSong.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
