package Pharmasy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;




import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class MyThread implements Runnable {
	private String name ;
	ArrayList<String> songs = new ArrayList<String>();
	File pl = new File("C:\\Users\\ÿ\\Desktop\\pharmasy\\music");
	boolean one = true;
	int index = 0;
	private Thread thread;
	FileInputStream fis;
	AdvancedPlayer mp3;
	
	
	MyThread(String name) throws Exception{
		this.name = name;
		thread = new Thread(this);
		Playlist.readPleylist(name,songs);
		
	}
	public void player() throws Exception{
		if(!(thread.isAlive())){
			thread.start();

		}
	}
	public void disable(){
		one = false;
	}
	public void mp3Stop() throws IOException{
		fis.close();
		mp3.close();
	}
	

	@Override
	public void run() {
		
		while(one){
			if(index>(songs.size()-1)){
				index = 0;
			}
		try {
				 fis = new FileInputStream(songs.get(index++));
				 mp3 = new AdvancedPlayer(fis);
				mp3.play();
			
		
		} catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
	public void stopOldThread(){
		disable();
		mp3.close();
	}
	
	public void setNumberMusic(int number){
		this.index = number;
	}
	public int getNumberMusic(){
		return this.index;
	}
	public void switchMusic() throws Exception{
		
		disable();
		mp3.close();
		
		Thread.currentThread().interrupt();
	}
	
}
